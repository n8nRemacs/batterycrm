package com.avito.android.serp.adapter.constructor;

import android.net.Uri;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.event.c1;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.beduin_shared.model.component.serp.PhoneButtonModel;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: ConstructorAdvertItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f269487l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SerpConstructorAdvertItem f269488m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PhoneButtonModel f269489n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.constructor_advert.ui.serp.constructor.n f269490o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, SerpConstructorAdvertItem serpConstructorAdvertItem, PhoneButtonModel phoneButtonModel, com.avito.android.constructor_advert.ui.serp.constructor.n nVar) {
        super(0);
        this.f269487l = oVar;
        this.f269488m = serpConstructorAdvertItem;
        this.f269489n = phoneButtonModel;
        this.f269490o = nVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        o oVar = this.f269487l;
        E e12 = oVar.f269524p;
        SerpConstructorAdvertItem serpConstructorAdvertItem = this.f269488m;
        e12.b(serpConstructorAdvertItem.getDisplayType());
        if (serpConstructorAdvertItem.getF268419Z0() == PhoneLoadingState.f430441b) {
            String strFindCallDeeplinkAsString = this.f269489n.findCallDeeplinkAsString();
            if (strFindCallDeeplinkAsString == null) {
                strFindCallDeeplinkAsString = "";
            }
            DeepLink deepLinkE = oVar.f269521m.e(Uri.parse(strFindCallDeeplinkAsString));
            c1.f90026d.getClass();
            DeepLink deepLinkA = oVar.f269522n.a(this.f269488m, false, null, (32 & 8) != 0 ? null : deepLinkE, (32 & 16) != 0 ? null : c1.a.a(serpConstructorAdvertItem), (32 & 32) != 0 ? null : null);
            if (deepLinkA != null) {
                h31.e<InterfaceC28616b> eVar = oVar.f269519k;
                if (eVar.get().N6()) {
                    q qVar = oVar.f269517i.get();
                    String f84108c = serpConstructorAdvertItem.getF201958b();
                    ContactSource contactSource = ContactSource.f89919d;
                    qVar.i(deepLinkA, f84108c);
                } else {
                    InterfaceC28616b interfaceC28616b = eVar.get();
                    ContactSource contactSource2 = ContactSource.f89921f;
                    SerpConstructorAdvertItem serpConstructorAdvertItem2 = this.f269488m;
                    interfaceC28616b.O6(serpConstructorAdvertItem2, this.f269490o, deepLinkA, contactSource2, null, new h(oVar, serpConstructorAdvertItem2));
                }
            }
        }
        return G0.f406611a;
    }
}
