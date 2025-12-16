package com.avito.android.bbl.screens.configure.v2.ui.items.cards;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.lazy.grid.I0;
import androidx.compose.foundation.lazy.grid.O;
import androidx.compose.foundation.lazy.grid.X;
import androidx.compose.runtime.internal.C22096n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorCardGrid.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/X;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/X;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class v extends N implements Y41.q<X, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I0 f99442l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.d f99443m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C22096n f99444n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ D f99445o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f99446p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, G0> f99447q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(I0 i02, androidx.compose.ui.unit.d dVar, C22096n c22096n, D d12, int i12, Y41.p pVar) {
        super(3);
        this.f99442l = i02;
        this.f99443m = dVar;
        this.f99444n = c22096n;
        this.f99445o = d12;
        this.f99446p = i12;
        this.f99447q = pVar;
    }

    @Override // Y41.q
    public final G0 invoke(X x12, androidx.compose.runtime.A a12, Integer num) {
        int i12;
        Object next;
        Integer numValueOf;
        float f12;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            I0 i02 = this.f99442l;
            Iterator<T> it = i02.j().h().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                i12 = this.f99446p;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((O) next).getF29645a() == (this.f99447q != null ? i12 + 1 : i12)) {
                    break;
                }
            }
            O o12 = (O) next;
            Integer numValueOf2 = o12 != null ? Integer.valueOf(o12.getF29220w()) : null;
            List<O> listH = i02.j().h();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH) {
                int f29220w = ((O) obj).getF29220w();
                if (numValueOf2 != null && f29220w == numValueOf2.intValue()) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                numValueOf = Integer.valueOf((int) (((O) it2.next()).getF29218u() & 4294967295L));
                while (it2.hasNext()) {
                    Integer numValueOf3 = Integer.valueOf((int) (((O) it2.next()).getF29218u() & 4294967295L));
                    if (numValueOf.compareTo(numValueOf3) < 0) {
                        numValueOf = numValueOf3;
                    }
                }
            } else {
                numValueOf = null;
            }
            androidx.compose.ui.unit.h hVarA = numValueOf != null ? androidx.compose.ui.unit.h.a(this.f99443m.J(numValueOf.intValue())) : null;
            if (hVarA != null) {
                f12 = hVarA.f42852b;
            } else {
                androidx.compose.ui.unit.h.f42849c.getClass();
                f12 = androidx.compose.ui.unit.h.f42851e;
            }
            this.f99444n.invoke(this.f99445o, Integer.valueOf(i12), C20588k2.f(androidx.compose.ui.v.f42878y1, f12), a13, 0);
        }
        return G0.f406611a;
    }
}
