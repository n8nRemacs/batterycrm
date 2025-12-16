package com.avito.beduin.v2.render.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.C22535v1;
import androidx.compose.ui.platform.C22547y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RecompositionModifiers.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.ui.v f338110a = androidx.compose.ui.n.a(androidx.compose.ui.v.f42878y1, C22535v1.f41625a, a.f338111l);

    /* compiled from: RecompositionModifiers.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/v;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)Landroidx/compose/ui/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.q<androidx.compose.ui.v, androidx.compose.runtime.A, Integer, androidx.compose.ui.v> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f338111l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final androidx.compose.ui.v invoke(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            num.intValue();
            a13.C(-271279649);
            a13.C(1240071298);
            Object objT = a13.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            Object obj = objT;
            if (objT == c1651a) {
                Long[] lArr = {0L};
                a13.H(lArr);
                obj = lArr;
            }
            Long[] lArr2 = (Long[]) obj;
            a13.h();
            lArr2[0] = Long.valueOf(lArr2[0].longValue() + 1);
            a13.C(1240076585);
            Object objT2 = a13.t();
            if (objT2 == c1651a) {
                objT2 = C22126m3.g(0L);
                a13.H(objT2);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT2;
            a13.h();
            C22187u0.d(new w(interfaceC22204y1, lArr2, null), a13, lArr2[0]);
            androidx.compose.ui.v vVarC = androidx.compose.ui.draw.o.c(androidx.compose.ui.v.f42878y1, new y(lArr2, interfaceC22204y1));
            a13.h();
            return vVarC;
        }
    }

    /* compiled from: InspectableValue.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/y1;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/platform/y1;)V", "androidx/compose/ui/platform/w1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<C22547y1, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C22547y1 c22547y1) {
            c22547y1.getClass();
            return G0.f406611a;
        }
    }
}
