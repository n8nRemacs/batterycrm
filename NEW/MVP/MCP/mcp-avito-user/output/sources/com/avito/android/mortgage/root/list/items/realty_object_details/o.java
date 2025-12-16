package com.avito.android.mortgage.root.list.items.realty_object_details;

import androidx.compose.runtime.internal.P;
import f10.InterfaceC40199a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyObjectDetailsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/realty_object_details/o;", "LTV0/f;", "Lcom/avito/android/mortgage/root/list/items/realty_object_details/q;", "Lcom/avito/android/mortgage/root/list/items/realty_object_details/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements TV0.f<q, e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC40199a, G0> f202787b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public o(@Y61.k Y41.l<? super InterfaceC40199a, G0> lVar) {
        this.f202787b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        q qVar = (q) eVar;
        e eVar2 = (e) aVar;
        b bVar = eVar2.f202776c;
        qVar.ug(bVar.f202766a);
        qVar.Xo(bVar.f202767b);
        qVar.pt(bVar.f202768c);
        qVar.YU(new f(this));
        qVar.cO(new g(this));
        a aVar2 = eVar2.f202777d;
        qVar.vq(aVar2.f202762a);
        ArrayList arrayList = aVar2.f202763b;
        qVar.qH(arrayList.size() > 1);
        qVar.rY(arrayList);
        qVar.yy(aVar2.f202764c);
        qVar.h40(new h(this));
        qVar.wQ(null);
        qVar.Ko(null);
        qVar.Z20(aVar2.a().getTitle());
        qVar.RD(aVar2.a().getPlaceholder());
        qVar.oK(aVar2.a().getValue());
        qVar.qG(aVar2.a().getError());
        qVar.Ko(new i(this));
        qVar.wQ(new j(this));
        qVar.au(null);
        qVar.wW(null);
        KZ.P p12 = aVar2.f202765d;
        qVar.aj(p12.getTitle());
        qVar.Rk(p12.getPlaceholder());
        Long value = p12.getValue();
        qVar.EW(value != null ? value.toString() : null);
        qVar.zO(p12.getError());
        qVar.au(new k(this));
        qVar.wW(new l(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    @Override // TV0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g2(TV0.e r3, TV0.a r4, int r5, java.util.List r6) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.list.items.realty_object_details.o.g2(TV0.e, TV0.a, int, java.util.List):void");
    }
}
