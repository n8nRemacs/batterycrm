package com.avito.android.profile_settings_extended.adapter.phones;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vc0.C49306e;
import yc0.k;

/* compiled from: ExtendedSettingsPhonesPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f229705l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ExtendedSettingsPhonesItem f229706m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, ExtendedSettingsPhonesItem extendedSettingsPhonesItem) {
        super(0);
        this.f229705l = iVar;
        this.f229706m = extendedSettingsPhonesItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        i iVar = this.f229705l;
        String strA = iVar.f229712c.a();
        if (strA != null) {
            iVar.f229713d.c(new C49306e(strA));
        }
        DeepLink deepLink = this.f229706m.f229679g;
        if (deepLink != null) {
            iVar.f229711b.invoke(new k.a(deepLink));
        }
        return G0.f406611a;
    }
}
