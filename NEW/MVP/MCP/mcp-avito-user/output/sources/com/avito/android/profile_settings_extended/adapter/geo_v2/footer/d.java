package com.avito.android.profile_settings_extended.adapter.geo_v2.footer;

import Rb0.C15027c;
import Rb0.InterfaceC15026b;
import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.DeeplinkAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedSettingsGeoV2FooterItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/geo_v2/footer/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/geo_v2/footer/c;", "LRb0/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends com.avito.konveyor.adapter.b implements c, InterfaceC15026b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f229500d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C15027c f229501b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f229502c;

    public d(@k View view) {
        super(view);
        this.f229501b = new C15027c(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_geo_v2_action_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f229502c = (Button) viewFindViewById;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229502c.setOnClickListener(null);
    }

    @Override // Rb0.InterfaceC15026b
    public final void xT(boolean z12) {
        this.f229501b.xT(z12);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.geo_v2.footer.c
    public final void zW(@k ExtendedSettingsGeoV2FooterItem extendedSettingsGeoV2FooterItem, @k Y41.a<G0> aVar) {
        DeeplinkAction deeplinkAction = extendedSettingsGeoV2FooterItem.f229493c;
        String title = deeplinkAction != null ? deeplinkAction.getTitle() : null;
        Button button = this.f229502c;
        com.avito.android.lib.design.button.b.a(button, title, false);
        button.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(12, aVar));
    }
}
