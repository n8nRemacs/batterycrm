package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.theme.re23.preview.AbstractC27462u0;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.C43259k;

/* compiled from: PullToRefreshPreview.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "isRefreshing", "re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class N2 {

    /* compiled from: PullToRefreshPreview.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65440l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(1);
            this.f65440l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            this.f65440l.setValue(bool2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PullToRefreshPreview.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.pull_to_refresh.j f65441l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f65442m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65443n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.akita.compose.component.pull_to_refresh.j jVar, Y41.a<kotlin.G0> aVar, InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(3);
            this.f65441l = jVar;
            this.f65442m = aVar;
            this.f65443n = interfaceC22204y1;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                boolean zBooleanValue = this.f65443n.getF42167b().booleanValue();
                v.a aVar = androidx.compose.ui.v.f42878y1;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(aVar, androidx.compose.foundation.shape.o.a(0));
                C27389f1.f65660a.getClass();
                com.akita.compose.component.pull_to_refresh.i.b(this.f65441l, zBooleanValue, this.f65442m, vVarA, null, null, C27389f1.f65662c, a13, 1572872, 48);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PullToRefreshPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.pull_to_refresh.l> f65444l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65445m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, kotlin.Q q12) {
            super(2);
            this.f65444l = q12;
            this.f65445m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65445m | 1);
            N2.a(this.f65444l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PullToRefreshPreview.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f65446l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f65447m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.T t12, InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(0);
            this.f65446l = t12;
            this.f65447m = interfaceC22204y1;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            Boolean bool = Boolean.TRUE;
            InterfaceC22204y1<Boolean> interfaceC22204y1 = this.f65447m;
            interfaceC22204y1.setValue(bool);
            C43259k.d(this.f65446l, null, null, new O2(interfaceC22204y1, null), 3);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.pull_to_refresh.l> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1063342528);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(1488484383);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(Boolean.FALSE);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            bE2.X(false);
            com.akita.compose.component.pull_to_refresh.j jVarA = com.akita.compose.component.pull_to_refresh.k.a(bE2);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
                bE2.H(objT2);
            }
            d dVar = new d((kotlinx.coroutines.T) objT2, interfaceC22204y1);
            String str = q12.f406619b;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.p pVar = com.akita.compose.theme.re23.b.f63984b.f63851H1;
            bE2.C(1488503734);
            Object objT3 = bE2.t();
            if (objT3 == c1651a) {
                objT3 = new a(interfaceC22204y1);
                bE2.H(objT3);
            }
            bE2.X(false);
            C27452s0.a(str, null, pVar, 0.0f, Collections.singleton(new AbstractC27462u0.d("isRefreshing", false, (Y41.l) objT3)), androidx.compose.runtime.internal.r.c(1773071146, new b(jVarA, dVar, interfaceC22204y1), bE2), bE2, 196608, 10);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(i12, q12);
        }
    }
}
