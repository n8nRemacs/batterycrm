package com.avito.android.profile_settings_extended.adapter.geo_v2.footer;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.DeeplinkAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import yc0.p;

/* compiled from: ExtendedSettingsGeoV2FooterItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedSettingsGeoV2FooterItem f229503l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f229504m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ExtendedSettingsGeoV2FooterItem extendedSettingsGeoV2FooterItem, g gVar) {
        super(0);
        this.f229503l = extendedSettingsGeoV2FooterItem;
        this.f229504m = gVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        DeeplinkAction deeplinkAction = this.f229503l.f229493c;
        if (deeplinkAction != null && (deepLink = deeplinkAction.getDeepLink()) != null) {
            this.f229504m.f229505b.invoke(new p(deepLink));
        }
        return G0.f406611a;
    }
}
