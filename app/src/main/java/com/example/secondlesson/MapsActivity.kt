package com.example.secondlesson

import android.location.Location
import android.location.LocationManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        var lat=intent.getStringExtra("latitude")
        var long=intent.getStringExtra("longitude")

        // Add a marker in Sydney and move the camera

        val istanbul = LatLng(lat!!.toDouble(),long!!.toDouble())


        mMap.addMarker(MarkerOptions().position(istanbul).title("ben"))
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(istanbul))

        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(istanbul, 12.0f))

        //  This is method returns the lastKnownlocation and store it in location object from where then you can retrive latitute and longitude.

        //  This is method returns the lastKnownlocation and store it in location object from where then you can retrive latitute and longitude.
        //val location: Location = LocationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER)
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(istanbul, 13.0f))

    }
}