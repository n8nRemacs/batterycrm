package com.avito.android.serp.adapter.constructor.rich;

import android.net.Uri;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.event.c1;
import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.beduin_shared.model.component.serp.PhoneButtonModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: ConstructorAdvertItemRichPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class u extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SerpConstructorAdvertItem f269701l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f269702m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ PhoneButtonModel f269703n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C f269704o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(SerpConstructorAdvertItem serpConstructorAdvertItem, z zVar, PhoneButtonModel phoneButtonModel, C c12) {
        super(0);
        this.f269701l = serpConstructorAdvertItem;
        this.f269702m = zVar;
        this.f269703n = phoneButtonModel;
        this.f269704o = c12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        SerpConstructorAdvertItem serpConstructorAdvertItem = this.f269701l;
        if (serpConstructorAdvertItem.getF268419Z0() == PhoneLoadingState.f430441b) {
            z zVar = this.f269702m;
            String strFindCallDeeplinkAsString = this.f269703n.findCallDeeplinkAsString();
            if (strFindCallDeeplinkAsString == null) {
                strFindCallDeeplinkAsString = "";
            }
            DeepLink deepLinkE = zVar.f269722k.e(Uri.parse(strFindCallDeeplinkAsString));
            c1.f90026d.getClass();
            DeepLink deepLinkA = zVar.f269719h.a(this.f269701l, false, null, (32 & 8) != 0 ? null : deepLinkE, (32 & 16) != 0 ? null : c1.a.a(serpConstructorAdvertItem), (32 & 32) != 0 ? null : null);
            if (deepLinkA != null) {
                h31.e<InterfaceC28616b> eVar = zVar.f269720i;
                if (eVar.get().N6()) {
                    com.avito.android.serp.adapter.constructor.q qVar = zVar.f269715d.get();
                    String f75565j = serpConstructorAdvertItem.getF75720c();
                    ContactSource contactSource = ContactSource.f89919d;
                    qVar.i(deepLinkA, f75565j);
                } else {
                    InterfaceC28616b interfaceC28616b = eVar.get();
                    ContactSource contactSource2 = ContactSource.f89921f;
                    SerpConstructorAdvertItem serpConstructorAdvertItem2 = this.f269701l;
                    interfaceC28616b.O6(serpConstructorAdvertItem2, this.f269704o, deepLinkA, contactSource2, null, new t(serpConstructorAdvertItem2, zVar));
                }
            }
        }
        return G0.f406611a;
    }
}
