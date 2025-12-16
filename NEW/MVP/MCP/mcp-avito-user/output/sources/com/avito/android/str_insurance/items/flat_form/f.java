package com.avito.android.str_insurance.items.flat_form;

import Y61.k;
import Zy0.InterfaceC19622a;
import com.avito.android.str_insurance.screen.di.o;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Y1;

/* compiled from: StrInsuranceFlatFormPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_insurance/items/flat_form/f;", "LTV0/f;", "Lcom/avito/android/str_insurance/items/flat_form/h;", "Lcom/avito/android/str_insurance/items/flat_form/c;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements TV0.f<h, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f288575b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y1<InterfaceC19622a> f288576c;

    @Inject
    public f(@k com.avito.android.util.text.a aVar, @o @k Y1<InterfaceC19622a> y12) {
        this.f288575b = aVar;
        this.f288576c = y12;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (c) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        Iterator it = list.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null ? next instanceof d : true) {
                obj = next;
            }
        }
        d dVar = (d) (obj instanceof d ? obj : null);
        if (dVar == null) {
            k(hVar, cVar);
        } else if (dVar.f288573a) {
            hVar.G40(C42745f0.L0(cVar.f288572i));
            hVar.xs(cVar.f288569f);
        }
    }

    public final void k(@k h hVar, @k c cVar) {
        hVar.setTitle(cVar.f288565b);
        hVar.h(cVar.f288566c);
        hVar.C(cVar.f288567d);
        hVar.kN(cVar.f288568e, this.f288575b);
        hVar.xs(cVar.f288569f);
        hVar.G40(C42745f0.L0(cVar.f288572i));
        hVar.AV(new e(this));
    }
}
