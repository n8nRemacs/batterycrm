package com.avito.android.serp.adapter.advert_free_form_item;

import android.net.Uri;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.event.c1;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.beduin_shared.model.component.serp.PhoneButtonModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import com.avito.android.serp.adapter.constructor.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AdvertFreeFormItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SerpConstructorAdvertItem f268724l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f268725m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PhoneButtonModel f268726n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f268727o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SerpConstructorAdvertItem serpConstructorAdvertItem, l lVar, PhoneButtonModel phoneButtonModel, n nVar) {
        super(0);
        this.f268724l = serpConstructorAdvertItem;
        this.f268725m = lVar;
        this.f268726n = phoneButtonModel;
        this.f268727o = nVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        SerpConstructorAdvertItem serpConstructorAdvertItem = this.f268724l;
        if (serpConstructorAdvertItem.getF268419Z0() == PhoneLoadingState.f430441b) {
            l lVar = this.f268725m;
            String xHash = serpConstructorAdvertItem.getXHash();
            String strFindCallDeeplinkAsString = this.f268726n.findCallDeeplinkAsString();
            if (strFindCallDeeplinkAsString == null) {
                strFindCallDeeplinkAsString = "";
            }
            DeepLink deepLinkE = lVar.f268734g.e(Uri.parse(strFindCallDeeplinkAsString));
            c1.f90026d.getClass();
            DeepLink deepLinkA = lVar.f268733f.a(serpConstructorAdvertItem, false, xHash, (32 & 8) != 0 ? null : deepLinkE, (32 & 16) != 0 ? null : c1.a.a(serpConstructorAdvertItem), (32 & 32) != 0 ? null : null);
            if (deepLinkA != null) {
                h31.e<InterfaceC28616b> eVar = lVar.f268731d;
                if (eVar.get().N6()) {
                    q qVar = lVar.f268735h.get();
                    String f162850b = serpConstructorAdvertItem.getF262931b();
                    ContactSource contactSource = ContactSource.f89919d;
                    qVar.i(deepLinkA, f162850b);
                } else {
                    eVar.get().O6(serpConstructorAdvertItem, this.f268727o, deepLinkA, ContactSource.f89921f, null, new i(lVar, serpConstructorAdvertItem));
                }
            }
        }
        return G0.f406611a;
    }
}
