package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.load.java.A;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.q0;
import u51.InterfaceC48806h;

/* compiled from: AbstractSignatureParts.kt */
@s0
/* loaded from: classes8.dex */
final class d extends N implements Y41.l<a.C11662a, Iterable<? extends a.C11662a>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a<Object> f408328l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u51.p f408329m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a<Object> aVar, u51.p pVar) {
        super(1);
        this.f408328l = aVar;
        this.f408329m = pVar;
    }

    @Override // Y41.l
    public final Iterable<? extends a.C11662a> invoke(a.C11662a c11662a) {
        q0 q0VarU;
        a.C11662a c11662a2;
        a.C11662a c11662a3 = c11662a;
        a<Object> aVar = this.f408328l;
        boolean zH2 = aVar.h();
        InterfaceC48806h interfaceC48806h = c11662a3.f408321a;
        u51.p pVar = this.f408329m;
        if ((zH2 && interfaceC48806h != null && pVar.f0(interfaceC48806h)) || interfaceC48806h == null || (q0VarU = pVar.U(interfaceC48806h)) == null) {
            return null;
        }
        List<u51.n> listM0 = pVar.m0(q0VarU);
        List<u51.l> listF = pVar.F(interfaceC48806h);
        Iterator<T> it = listM0.iterator();
        Iterator<T> it2 = listF.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C42745f0.q(listM0, 10), C42745f0.q(listF, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            u51.l lVar = (u51.l) it2.next();
            u51.n nVar = (u51.n) next;
            boolean zT2 = pVar.t(lVar);
            A a12 = c11662a3.f408322b;
            if (zT2) {
                c11662a2 = new a.C11662a(null, a12, nVar);
            } else {
                J0 j0R = pVar.R(lVar);
                c11662a2 = new a.C11662a(j0R, aVar.b().b(a12, aVar.c(j0R)), nVar);
            }
            arrayList.add(c11662a2);
        }
        return arrayList;
    }
}
