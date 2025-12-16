package com.avito.android.serp.adapter.constructor.rich;

import com.avito.android.async_phone.InterfaceC28616b;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.component.serp.PhoneButtonModel;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import fj.InterfaceC40429a;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ConstructorAdvertItemRichPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class n extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f269684l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SerpConstructorAdvertItem f269685m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C f269686n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(z zVar, SerpConstructorAdvertItem serpConstructorAdvertItem, C c12) {
        super(0);
        this.f269684l = zVar;
        this.f269685m = serpConstructorAdvertItem;
        this.f269686n = c12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        z zVar = this.f269684l;
        com.avito.android.video_snippets.g gVar = zVar.f269724m;
        SerpConstructorAdvertItem serpConstructorAdvertItem = this.f269685m;
        if (gVar != null) {
            gVar.c(serpConstructorAdvertItem.getF201958b());
        }
        List<BeduinModel> freeForm = serpConstructorAdvertItem.getFreeForm();
        if (freeForm != null) {
            Iterator it = com.avito.android.beduin_shared.model.utils.f.a(l.f269682l, freeForm).iterator();
            while (it.hasNext()) {
                BeduinModel beduinModel = (BeduinModel) it.next();
                InterfaceC40429a interfaceC40429a = beduinModel instanceof InterfaceC40429a ? (InterfaceC40429a) beduinModel : null;
                if (interfaceC40429a != null) {
                    interfaceC40429a.u0(null);
                }
            }
        }
        List<BeduinModel> freeForm2 = serpConstructorAdvertItem.getFreeForm();
        if (freeForm2 != null) {
            Iterator it2 = com.avito.android.beduin_shared.model.utils.f.a(m.f269683l, freeForm2).iterator();
            while (it2.hasNext()) {
                BeduinModel beduinModel2 = (BeduinModel) it2.next();
                PhoneButtonModel phoneButtonModel = beduinModel2 instanceof PhoneButtonModel ? (PhoneButtonModel) beduinModel2 : null;
                if (phoneButtonModel != null) {
                    phoneButtonModel.setListener(null);
                }
            }
        }
        h31.e<InterfaceC28616b> eVar = zVar.f269720i;
        if (eVar.get().N6()) {
            zVar.f269721j.p(this.f269686n, serpConstructorAdvertItem.getF201958b());
        } else {
            eVar.get().M6(serpConstructorAdvertItem);
        }
        return G0.f406611a;
    }
}
