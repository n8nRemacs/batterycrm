package com.avito.android.location_list;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.remote.model.Location;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LocationListActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/location_list/LocationListActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/location_list/S;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class LocationListActivity extends com.avito.android.ui.activity.a implements S, InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public String f181876m = "";

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.location_list.S
    public final void Z(@Y61.l Location location) {
        Intent intent = new Intent();
        intent.putExtra("location", location);
        setResult(-1, intent);
    }

    @Override // com.avito.android.location_list.S
    public final void i1(@Y61.k Location location) {
        Intent intent = getIntent();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("location", Location.class) : intent.getParcelableExtra("location");
        boolean booleanExtra = intent.getBooleanExtra("show_whole_locations", false);
        boolean booleanExtra2 = intent.getBooleanExtra("track_location_events", false);
        String str = this.f181876m;
        LocationListFragment locationListFragment = new LocationListFragment();
        C35966w1.a(locationListFragment, -1, new C31531z((Location) parcelableExtra, location, false, false, booleanExtra, str, booleanExtra2));
        androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.fragment_container, locationListFragment, "LocationListFragment");
        hE2.c("LocationListFragment");
        hE2.f();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        Fragment fragmentH = getSupportFragmentManager().H("LocationListFragment");
        if ((fragmentH instanceof LocationListFragment ? (LocationListFragment) fragmentH : null) == null) {
            Intent intent = getIntent();
            Location location = (Location) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("location", Location.class) : intent.getParcelableExtra("location"));
            boolean booleanExtra = intent.getBooleanExtra("has_search_area", false);
            boolean booleanExtra2 = intent.getBooleanExtra("show_whole_locations", false);
            String stringExtra = intent.getStringExtra("extra_category_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f181876m = stringExtra;
            boolean booleanExtra3 = intent.getBooleanExtra("track_location_events", false);
            String str = this.f181876m;
            LocationListFragment locationListFragment = new LocationListFragment();
            C35966w1.a(locationListFragment, -1, new C31531z(location, null, true, booleanExtra, booleanExtra2, str, booleanExtra3));
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.fragment_container, locationListFragment, "LocationListFragment");
            hE2.f();
        }
    }
}
