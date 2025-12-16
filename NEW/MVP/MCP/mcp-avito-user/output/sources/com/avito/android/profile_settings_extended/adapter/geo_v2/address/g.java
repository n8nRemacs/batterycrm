package com.avito.android.profile_settings_extended.adapter.geo_v2.address;

import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedSettingsGeoV2AddressItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/geo_v2/address/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/geo_v2/address/f;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f, InterfaceC15026b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C15027c f229489b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f229490c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f229491d;

    public g(@k View view) {
        super(view);
        this.f229489b = new C15027c(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_geo_v2_address_name);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229490c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_geo_v2_address);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229491d = (TextView) viewFindViewById2;
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        this.f229489b.xT(z12);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.geo_v2.address.f
    public final void xg(@k ExtendedSettingsGeoV2AddressItem extendedSettingsGeoV2AddressItem) {
        I5.a(this.f229490c, extendedSettingsGeoV2AddressItem.f229480c, false);
        I5.a(this.f229491d, extendedSettingsGeoV2AddressItem.f229481d, false);
    }
}
