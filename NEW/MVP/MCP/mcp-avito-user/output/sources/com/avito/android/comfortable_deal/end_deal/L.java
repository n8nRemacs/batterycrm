package com.avito.android.comfortable_deal.end_deal;

import Hp.InterfaceC14016a;
import Hp.b;
import Hp.d;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22535v1;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.platform.InterfaceC22489j2;
import androidx.compose.ui.platform.J1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.comfortable_deal.end_deal.model.EndDealField;
import com.avito.android.comfortable_deal.end_deal.model.EndDealResult;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import np.C44460a;

/* compiled from: EndDealScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0005²\u0006\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"", "Lkotlin/ranges/o;", "selectedDates", "", "showDatePicker", "_avito_comfortable-deal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class L {

    /* compiled from: EndDealScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.end_deal.EndDealScreenKt$EndDealScreen$1", f = "EndDealScreen.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f122076A;

        /* renamed from: q, reason: collision with root package name */
        public int f122077q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f122078r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<Hp.b> f122079s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22489j2 f122080t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.l<EndDealResult, G0> f122081u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Y41.p<DeepLink, Bundle, G0> f122082v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f122083w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Context f122084x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f122085y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f122086z;

        /* compiled from: EndDealScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHp/b;", "event", "Lkotlin/G0;", "emit", "(LHp/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.comfortable_deal.end_deal.L$a$a, reason: collision with other inner class name */
        public static final class C3610a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22489j2 f122087b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Y41.l<EndDealResult, G0> f122088c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Y41.p<DeepLink, Bundle, G0> f122089d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f122090e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1<Boolean> f122091f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Context f122092g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f122093h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.J f122094i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.J f122095j;

            /* JADX WARN: Multi-variable type inference failed */
            public C3610a(InterfaceC22489j2 interfaceC22489j2, Y41.l<? super EndDealResult, G0> lVar, Y41.p<? super DeepLink, ? super Bundle, G0> pVar, kotlinx.coroutines.T t12, InterfaceC22204y1<Boolean> interfaceC22204y1, Context context, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, com.akita.compose.component.toast_bar.J j13) {
                this.f122087b = interfaceC22489j2;
                this.f122088c = lVar;
                this.f122089d = pVar;
                this.f122090e = t12;
                this.f122091f = interfaceC22204y1;
                this.f122092g = context;
                this.f122093h = uVar;
                this.f122094i = j12;
                this.f122095j = j13;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                Hp.b bVar = (Hp.b) obj;
                boolean z12 = bVar instanceof b.a;
                InterfaceC22489j2 interfaceC22489j2 = this.f122087b;
                if (z12) {
                    if (interfaceC22489j2 != null) {
                        interfaceC22489j2.hide();
                    }
                    this.f122088c.invoke(((b.a) bVar).f7724a);
                } else if (bVar instanceof b.C0441b) {
                    this.f122091f.setValue(Boolean.TRUE);
                } else if (bVar instanceof b.c) {
                    if (interfaceC22489j2 != null) {
                        interfaceC22489j2.hide();
                    }
                    b.c cVar = (b.c) bVar;
                    this.f122089d.invoke(cVar.f7726a, cVar.f7727b);
                } else {
                    boolean z13 = bVar instanceof b.d;
                    kotlinx.coroutines.T t12 = this.f122090e;
                    if (z13) {
                        C43259k.d(t12, null, null, new J(bVar, this.f122092g, this.f122093h, this.f122094i, null), 3);
                    } else if (bVar instanceof b.e) {
                        C43259k.d(t12, null, null, new K(bVar, this.f122092g, this.f122093h, this.f122095j, null), 3);
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43160i<? extends Hp.b> interfaceC43160i, InterfaceC22489j2 interfaceC22489j2, Y41.l<? super EndDealResult, G0> lVar, Y41.p<? super DeepLink, ? super Bundle, G0> pVar, InterfaceC22204y1<Boolean> interfaceC22204y1, Context context, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, com.akita.compose.component.toast_bar.J j13, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f122079s = interfaceC43160i;
            this.f122080t = interfaceC22489j2;
            this.f122081u = lVar;
            this.f122082v = pVar;
            this.f122083w = interfaceC22204y1;
            this.f122084x = context;
            this.f122085y = uVar;
            this.f122086z = j12;
            this.f122076A = j13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f122079s, this.f122080t, this.f122081u, this.f122082v, this.f122083w, this.f122084x, this.f122085y, this.f122086z, this.f122076A, continuation);
            aVar.f122078r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122077q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C3610a c3610a = new C3610a(this.f122080t, this.f122081u, this.f122082v, (kotlinx.coroutines.T) this.f122078r, this.f122083w, this.f122084x, this.f122085y, this.f122086z, this.f122076A);
                this.f122077q = 1;
                if (this.f122079s.collect(c3610a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EndDealScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Hp.c f122096l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC14016a, G0> f122097m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Hp.c cVar, Y41.l<? super InterfaceC14016a, G0> lVar) {
            super(2);
            this.f122096l = cVar;
            this.f122097m = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0143  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r20, java.lang.Integer r21) {
            /*
                Method dump skipped, instructions count: 358
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.end_deal.L.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EndDealScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Hp.c f122098l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC14016a, G0> f122099m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22489j2 f122100n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Hp.c cVar, Y41.l<? super InterfaceC14016a, G0> lVar, InterfaceC22489j2 interfaceC22489j2) {
            super(2);
            this.f122098l = cVar;
            this.f122099m = lVar;
            this.f122100n = interfaceC22489j2;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r11, java.lang.Integer r12) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.end_deal.L.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: EndDealScreen.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/layout/T1;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/T1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<T1, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Hp.c f122101l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC14016a, G0> f122102m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Hp.c cVar, Y41.l<? super InterfaceC14016a, G0> lVar) {
            super(3);
            this.f122101l = cVar;
            this.f122102m = lVar;
        }

        @Override // Y41.q
        public final G0 invoke(T1 t12, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarM = R1.m(aVar, 0.0f, 0.0f, 0.0f, 76, 7);
                InterfaceC22215f.f39074a.getClass();
                androidx.compose.ui.i iVar = InterfaceC22215f.a.f39076b;
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
                int f37888q = a13.getF37888Q();
                O1 o1Y = a13.y();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarM);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
                R3.b(pVar, a13, interfaceC22365i0D);
                Y41.p<InterfaceC22413h, androidx.compose.runtime.U, G0> pVar2 = InterfaceC22413h.a.f40795f;
                R3.b(pVar2, a13, o1Y);
                Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                    androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar3);
                }
                Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
                R3.b(pVar4, a13, vVarC);
                C20644z c20644z = C20644z.f28804a;
                Hp.c cVar = this.f122101l;
                Hp.d dVar = cVar.f7741k;
                if (dVar instanceof d.a) {
                    a13.C(-1603226407);
                    com.avito.android.analytics.screens.mvi.r perfTrackerParams = cVar.getPerfTrackerParams();
                    a13.C(-976608008);
                    a13.C(2063036140);
                    boolean zBooleanValue = ((Boolean) a13.o(C22543x1.f41638a)).booleanValue();
                    Y41.l<InterfaceC14016a, G0> lVar = this.f122102m;
                    Hp.d dVar2 = cVar.f7741k;
                    if (zBooleanValue) {
                        a13.C(421109671);
                        L.g((d.a) dVar2, lVar, a13, 0);
                        a13.h();
                    } else {
                        a13.C(420357239);
                        com.avito.android.analytics.screens.compose.a aVar4 = (com.avito.android.analytics.screens.compose.a) a13.o(com.avito.android.analytics.screens.compose.c.f90576a);
                        if (perfTrackerParams != null) {
                            aVar4.m(perfTrackerParams.f90666a);
                        }
                        aVar4.l();
                        androidx.compose.ui.v vVarD = androidx.compose.ui.draw.o.d(aVar, new Q(perfTrackerParams, aVar4));
                        InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(iVar, false);
                        int f37888q2 = a13.getF37888Q();
                        O1 o1Y2 = a13.y();
                        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, vVarD);
                        if (a13.F() == null) {
                            C22190v.b();
                            throw null;
                        }
                        a13.A();
                        if (a13.getF37887P()) {
                            a13.b(aVar3);
                        } else {
                            a13.d();
                        }
                        R3.b(pVar, a13, interfaceC22365i0D2);
                        R3.b(pVar2, a13, o1Y2);
                        if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q2))) {
                            androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar3);
                        }
                        R3.b(pVar4, a13, vVarC2);
                        L.g((d.a) dVar2, lVar, a13, 0);
                        a13.z();
                        a13.h();
                    }
                    com.avito.android.authorization.auto_recovery.phone_confirm.b.m(a13);
                } else if (kotlin.jvm.internal.L.f(dVar, d.b.f7747a)) {
                    a13.C(2026500254);
                    L.h(a13, 0);
                    a13.h();
                } else if (kotlin.jvm.internal.L.f(dVar, d.c.f7748a)) {
                    a13.C(2026502405);
                    L.k(a13, 0);
                    a13.h();
                } else {
                    a13.C(-1602897807);
                    a13.h();
                }
                a13.z();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EndDealScreen.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lkotlin/ranges/o;", "dates", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<List<? extends kotlin.ranges.o>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<List<kotlin.ranges.o>> f122103l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC22204y1<List<kotlin.ranges.o>> interfaceC22204y1) {
            super(1);
            this.f122103l = interfaceC22204y1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(List<? extends kotlin.ranges.o> list) {
            this.f122103l.setValue(list);
            return G0.f406611a;
        }
    }

    /* compiled from: EndDealScreen.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lkotlin/ranges/o;", "dates", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<List<? extends kotlin.ranges.o>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC14016a, G0> f122104l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Y41.l<? super InterfaceC14016a, G0> lVar) {
            super(1);
            this.f122104l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(List<? extends kotlin.ranges.o> list) {
            kotlin.ranges.o oVar = (kotlin.ranges.o) C42745f0.G(list);
            if (oVar != null) {
                this.f122104l.invoke(new InterfaceC14016a.e(oVar));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EndDealScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Boolean> f122105l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC22204y1<Boolean> interfaceC22204y1) {
            super(0);
            this.f122105l = interfaceC22204y1;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f122105l.setValue(Boolean.FALSE);
            return G0.f406611a;
        }
    }

    /* compiled from: EndDealScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Hp.c f122106l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC14016a, G0> f122107m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.p<DeepLink, Bundle, G0> f122108n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<EndDealResult, G0> f122109o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.comfortable_deal.common.date.a f122110p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.comfortable_deal.common.date.d f122111q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<Hp.b> f122112r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Hp.c cVar, Y41.l<? super InterfaceC14016a, G0> lVar, Y41.p<? super DeepLink, ? super Bundle, G0> pVar, Y41.l<? super EndDealResult, G0> lVar2, com.avito.android.comfortable_deal.common.date.a aVar, com.avito.android.comfortable_deal.common.date.d dVar, InterfaceC43160i<? extends Hp.b> interfaceC43160i, int i12) {
            super(2);
            this.f122106l = cVar;
            this.f122107m = lVar;
            this.f122108n = pVar;
            this.f122109o = lVar2;
            this.f122110p = aVar;
            this.f122111q = dVar;
            this.f122112r = interfaceC43160i;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(2097153);
            Y41.l<EndDealResult, G0> lVar = this.f122109o;
            com.avito.android.comfortable_deal.common.date.a aVar = this.f122110p;
            L.e(this.f122106l, this.f122107m, this.f122108n, lVar, aVar, this.f122111q, this.f122112r, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: EndDealScreen.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/y1;", "", "Lkotlin/ranges/o;", "invoke", "()Landroidx/compose/runtime/y1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<InterfaceC22204y1<List<? extends kotlin.ranges.o>>> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f122113l = new i();

        public i() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC22204y1<List<? extends kotlin.ranges.o>> invoke() {
            return C22126m3.g(C42784z0.f406748b);
        }
    }

    /* compiled from: EndDealScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/y1;", "", "invoke", "()Landroidx/compose/runtime/y1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<InterfaceC22204y1<Boolean>> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f122114l = new j();

        public j() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC22204y1<Boolean> invoke() {
            return C22126m3.g(Boolean.FALSE);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k EndDealField.ChipGroup chipGroup, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.l v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1066019392);
        if ((((bE2.B(chipGroup) ? 4 : 2) | i12 | (bE2.u(lVar) ? 32 : 16) | (bE2.u(lVar2) ? 256 : 128) | 3072) & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            aVar = androidx.compose.ui.v.f42878y1;
            c(C44460a.b(lVar2, chipGroup.f122260c), aVar, androidx.compose.runtime.internal.r.c(-100009715, new C29480j(chipGroup, lVar), bE2), bE2, 196664);
        }
        v.a aVar2 = aVar;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29481k(chipGroup, lVar, lVar2, aVar2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k EndDealField.Comment comment, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.l v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1653358275);
        if ((((bE2.B(comment) ? 4 : 2) | i12 | (bE2.u(lVar) ? 32 : 16) | (bE2.u(lVar2) ? 256 : 128) | 3072) & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            aVar = androidx.compose.ui.v.f42878y1;
            c(C44460a.b(lVar2, comment.f122270d), aVar, androidx.compose.runtime.internal.r.c(-133805674, new C29482l(comment, lVar), bE2), bE2, 196664);
        }
        v.a aVar2 = aVar;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29483m(comment, lVar, lVar2, aVar2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void c(AttributedText attributedText, androidx.compose.ui.v vVar, C22096n c22096n, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(540807345);
        float f12 = 12;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        float f13 = 0;
        float f14 = 20;
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        com.akita.compose.foundation.ui.g.a(f13, null, bE2, (i12 >> 9) & 14);
        com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, null, 0, C29484n.f122357l, null, 0, bE2, 3080, 54);
        com.akita.compose.foundation.ui.g.a(f12, null, bE2, (i12 >> 6) & 14);
        int i14 = i12 >> 12;
        c22096n.invoke(k12, bE2, Integer.valueOf(6 | (i14 & 112)));
        com.akita.compose.foundation.ui.g.a(f14, null, bE2, i14 & 14);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29485o(attributedText, vVar, f12, f13, f14, c22096n, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(@Y61.k EndDealField.ChipDateInput chipDateInput, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.l v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1087537995);
        if ((((bE2.B(chipDateInput) ? 4 : 2) | i12 | (bE2.u(lVar) ? 32 : 16) | (bE2.u(lVar2) ? 256 : 128) | 3072) & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            aVar = androidx.compose.ui.v.f42878y1;
            c(C44460a.b(lVar2, chipDateInput.f122250c), aVar, androidx.compose.runtime.internal.r.c(-663669480, new H(chipDateInput, lVar), bE2), bE2, 196664);
        }
        v.a aVar2 = aVar;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new I(chipDateInput, lVar, lVar2, aVar2, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0110  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(@Y61.k Hp.c r28, @Y61.k Y41.l<? super Hp.InterfaceC14016a, kotlin.G0> r29, @Y61.k Y41.p<? super com.avito.android.deep_linking.links.DeepLink, ? super android.os.Bundle, kotlin.G0> r30, @Y61.k Y41.l<? super com.avito.android.comfortable_deal.end_deal.model.EndDealResult, kotlin.G0> r31, @Y61.k com.avito.android.comfortable_deal.common.date.a r32, @Y61.k com.avito.android.comfortable_deal.common.date.d r33, @Y61.k kotlinx.coroutines.flow.InterfaceC43160i<? extends Hp.b> r34, @Y61.l androidx.compose.runtime.A r35, int r36) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.end_deal.L.e(Hp.c, Y41.l, Y41.p, Y41.l, com.avito.android.comfortable_deal.common.date.a, com.avito.android.comfortable_deal.common.date.d, kotlinx.coroutines.flow.i, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void f(@Y61.k EndDealField.RoubleInput roubleInput, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.l v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(2055125078);
        if ((((bE2.B(roubleInput) ? 4 : 2) | i12 | (bE2.u(lVar) ? 32 : 16) | (bE2.u(lVar2) ? 256 : 128) | 3072) & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            aVar = androidx.compose.ui.v.f42878y1;
            c(C44460a.b(lVar2, roubleInput.f122273d), aVar, androidx.compose.runtime.internal.r.c(-1717478807, new V(roubleInput, lVar), bE2), bE2, 196664);
        }
        v.a aVar2 = aVar;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new W(roubleInput, lVar, lVar2, aVar2, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(Hp.d.a r18, Y41.l r19, androidx.compose.runtime.A r20, int r21) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.end_deal.L.g(Hp.d$a, Y41.l, androidx.compose.runtime.A, int):void");
    }

    public static final void h(androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(236481583);
        if (i12 == 0 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.getClass();
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarJ = R1.j(fillElement, 10, 4);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarJ);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, interfaceC22365i0D);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            androidx.compose.ui.v vVarK = R1.k(14, 0.0f, 2, C20644z.f28804a.d(aVar, InterfaceC22215f.a.f39080f));
            i.a aVar4 = InterfaceC22215f.a.f39089o;
            C20585k.f28659a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28664f, aVar4, bE2, 54);
            int i14 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarK);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, iA2);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            C20806p1.a(u0.e.a(R.drawable.end_deal_error, 0, bE2), null, C20588k2.q(aVar, 250, 186), null, null, 0.0f, null, bE2, 440, 120);
            com.akita.compose.foundation.ui.g.a(32, null, bE2, 6);
            String strC = u0.i.c(bE2, R.string.end_deal_error_title);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65232c;
            com.akita.compose.theme.re23.a aVar5 = com.akita.compose.theme.re23.b.f63984b;
            com.akita.compose.foundation.ui.p.b(strC, rVar, null, false, aVar5.f63938l.c(bE2), null, 0, 0, false, null, bE2, 0, ErrorCodes.PROTOCOL_EXCEPTION);
            com.akita.compose.foundation.ui.g.a(8, null, bE2, 6);
            String strC2 = u0.i.c(bE2, R.string.end_deal_error_description);
            long jC2 = aVar5.f63938l.c(bE2);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            com.akita.compose.foundation.ui.p.b(strC2, iVar.f65241l, null, false, jC2, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, bE2, 0, 972);
            bE2.X(true);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new S(i12);
        }
    }

    public static final void i(float f12, float f13, v.a aVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1270998135);
        if ((i12 & 14) == 0) {
            i13 = (bE2.k(f12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.k(f13) ? 32 : 16;
        }
        if (((i13 | 384) & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            aVar = androidx.compose.ui.v.f42878y1;
            C20608p2.a(bE2, androidx.compose.ui.n.a(C20588k2.f(C20588k2.d(aVar, 1.0f), f12), C22535v1.f41625a, new b0(f13)));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new Y(f12, f13, aVar, i12);
        }
    }

    public static final void j(float f12, float f13, float f14, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(226375965);
        if ((i12 & 14) == 0) {
            i13 = (bE2.k(f12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.k(f13) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.k(f14) ? 256 : 128;
        }
        if (((i13 | 3072) & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            vVar = androidx.compose.ui.v.f42878y1;
            C20608p2.a(bE2, androidx.compose.ui.n.a(C20588k2.q(vVar, f12, f13), C22535v1.f41625a, new b0(f14)));
        }
        androidx.compose.ui.v vVar2 = vVar;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new X(f12, f13, f14, vVar2, i12);
        }
    }

    public static final void k(androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-2017818077);
        if (i12 == 0 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.getClass();
            androidx.compose.ui.v vVarA = androidx.compose.ui.input.nestedscroll.e.a(fillElement, J1.e(bE2), null);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            C20650b.a(R1.k(16, 0.0f, 2, vVarA), null, null, false, null, null, null, false, null, Z.f122142l, bE2, 805306368, 510);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a0(i12);
        }
    }
}
