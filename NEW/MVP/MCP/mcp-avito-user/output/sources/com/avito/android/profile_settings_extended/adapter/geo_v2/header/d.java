package com.avito.android.profile_settings_extended.adapter.geo_v2.header;

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

/* compiled from: ExtendedSettingsGeoV2HeaderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/geo_v2/header/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/geo_v2/header/c;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends com.avito.konveyor.adapter.b implements c, InterfaceC15026b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C15027c f229516b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f229517c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f229518d;

    public d(@k View view) {
        super(view);
        this.f229516b = new C15027c(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_geo_v2_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229517c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_geo_v2_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229518d = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.geo_v2.header.c
    public final void EF(@k ExtendedSettingsGeoV2HeaderItem extendedSettingsGeoV2HeaderItem) {
        I5.a(this.f229517c, extendedSettingsGeoV2HeaderItem.f229508c, false);
        I5.a(this.f229518d, extendedSettingsGeoV2HeaderItem.f229509d, false);
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        this.f229516b.xT(z12);
    }
}
