package com.avito.android.messenger.map.viewing;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC23487e;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.MarkersRequest;
import com.avito.android.util.C35966w1;
import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PlatformMapActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/map/viewing/PlatformMapActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes15.dex */
public final class PlatformMapActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f196792m = new a(null);

    /* compiled from: PlatformMapActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/map/viewing/PlatformMapActivity$a;", "", "<init>", "()V", "", "INITIAL_GEO_MARKERS_KEY", "Ljava/lang/String;", "LOCK_BOTTOM_SHEET_KEY", "MARKERS_REQUEST_KEY", "TITLE_KEY", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static Intent a(@Y61.k Context context, @Y61.k String str, @Y61.k GeoMarker[] geoMarkerArr, @Y61.l MarkersRequest markersRequest, boolean z12) {
            Intent intent = new Intent(context, (Class<?>) PlatformMapActivity.class);
            intent.putExtra("title", str);
            intent.putExtra("initial_pins", geoMarkerArr);
            if (markersRequest != null) {
                intent.putExtra("markers_request", markersRequest);
            }
            intent.putExtra("lock_bottom_sheet", z12);
            return intent;
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        G0 g02;
        super.onActivityResult(i12, i13, intent);
        if (i12 == 69 && i13 == -1) {
            V2 v22 = V2.f318762a;
            v22.i("PlatformMapActivity", "onActivityResult(requestCode == ENABLE_LOCATION_REQUEST_CODE, resultCode == RESULT_OK) => onLocationEnabled()", null);
            InterfaceC23487e interfaceC23487eH = getSupportFragmentManager().H("PlatformMapFragment");
            com.avito.android.messenger.map.e eVar = interfaceC23487eH instanceof com.avito.android.messenger.map.e ? (com.avito.android.messenger.map.e) interfaceC23487eH : null;
            if (eVar != null) {
                eVar.L2();
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                v22.j("PlatformMapActivity", "PlatformMapFragment not found!", null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString("title")) == null) {
            string = "";
        }
        Bundle extras2 = getIntent().getExtras();
        Parcelable[] parcelableArray = extras2 != null ? extras2.getParcelableArray("initial_pins") : null;
        if (parcelableArray == null) {
            parcelableArray = null;
        }
        if (parcelableArray == null) {
            parcelableArray = new Parcelable[0];
        }
        Bundle extras3 = getIntent().getExtras();
        MarkersRequest markersRequest = extras3 != null ? (MarkersRequest) extras3.getParcelable("markers_request") : null;
        MarkersRequest markersRequest2 = markersRequest != null ? markersRequest : null;
        Bundle extras4 = getIntent().getExtras();
        boolean z12 = extras4 != null ? extras4.getBoolean("lock_bottom_sheet", false) : false;
        int length = parcelableArray.length;
        GeoMarker[] geoMarkerArr = new GeoMarker[length];
        for (int i12 = 0; i12 < length; i12++) {
            geoMarkerArr[i12] = parcelableArray[i12];
        }
        if (bundle == null) {
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            PlatformMapFragment.f196793y0.getClass();
            PlatformMapFragment platformMapFragment = new PlatformMapFragment();
            C35966w1.a(platformMapFragment, 3, new C32549b(string, geoMarkerArr, markersRequest2, z12));
            hE2.j(R.id.fragment_container, platformMapFragment, "PlatformMapFragment", 1);
            hE2.e();
        }
    }

    @Override // com.avito.android.ui.activity.a, android.app.Activity
    public final boolean onOptionsItemSelected(@Y61.k MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
