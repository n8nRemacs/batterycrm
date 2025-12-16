package com.avito.android.location_picker;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.location_picker.LocationPickerFragment;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocationPickerActivity.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/location_picker/LocationPickerActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/location_picker/N0;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LocationPickerActivity extends com.avito.android.ui.activity.a implements N0, InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f182141m = new a(null);

    /* compiled from: LocationPickerActivity.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/location_picker/LocationPickerActivity$a;", "", "<init>", "()V", "", "EXTRA_ARGUMENTS", "Ljava/lang/String;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.location_picker.N0
    public final void E3(@Y61.l Radius radius) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_RADIUS_RESULT", radius);
        kotlin.G0 g02 = kotlin.G0.f406611a;
        setResult(-1, intent);
        finish();
    }

    @Override // com.avito.android.location_picker.N0
    public final void I1(@Y61.k AddressParameter.Value value, @Y61.l String str) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_ADDRESS_RESULT", value);
        intent.putExtra("EXTRA_ADDRESS_PARAM_ID", str);
        kotlin.G0 g02 = kotlin.G0.f406611a;
        setResult(-1, intent);
        finish();
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: T1 */
    public final boolean getF329528s() {
        return false;
    }

    @Override // com.avito.android.location_picker.N0
    public final void T3() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        startActivity(intent);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        Intent intent = getIntent();
        LocationPickerArguments locationPickerArguments = (LocationPickerArguments) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("extra.arguments", LocationPickerArguments.class) : intent.getParcelableExtra("extra.arguments"));
        if (locationPickerArguments == null) {
            throw new IllegalArgumentException("LocationPickerActivity must be specified with arguments");
        }
        setTheme(R.style.Theme_DesignSystem_Re23);
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
            LocationPickerFragment.f182158D0.getClass();
            hE2.j(R.id.fragment_container, LocationPickerFragment.a.a(locationPickerArguments), null, 1);
            hE2.e();
        }
    }
}
