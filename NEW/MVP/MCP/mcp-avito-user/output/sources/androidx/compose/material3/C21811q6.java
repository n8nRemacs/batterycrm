package androidx.compose.material3;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.semantics.C22557e;
import androidx.compose.ui.unit.h;
import com.avito.android.R;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: DateRangePicker.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.q6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21811q6 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.foundation.layout.V1 f37145a;

    /* compiled from: DateRangePicker.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.q6$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Long f37146l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Long f37147m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.p<Long, Long, kotlin.G0> f37148n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.lazy.w0 f37149o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ kotlin.ranges.l f37150p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ AbstractC21692l2 f37151q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C21784p2 f37152r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21648j4 f37153s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y3 f37154t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C21669k2 f37155u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Ce f37156v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Long l12, Long l13, Y41.p<? super Long, ? super Long, kotlin.G0> pVar, androidx.compose.foundation.lazy.w0 w0Var, kotlin.ranges.l lVar, AbstractC21692l2 abstractC21692l2, C21784p2 c21784p2, InterfaceC21648j4 interfaceC21648j4, Y3 y32, C21669k2 c21669k2, Ce ce2) {
            super(2);
            this.f37146l = l12;
            this.f37147m = l13;
            this.f37148n = pVar;
            this.f37149o = w0Var;
            this.f37150p = lVar;
            this.f37151q = abstractC21692l2;
            this.f37152r = c21784p2;
            this.f37153s = interfaceC21648j4;
            this.f37154t = y32;
            this.f37155u = c21669k2;
            this.f37156v = ce2;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 3) == 2 && a13.c()) {
                a13.f();
            } else {
                a13.I(773894976);
                a13.I(-492369756);
                Object objT = a13.t();
                androidx.compose.runtime.A.f37866a.getClass();
                A.a.C1651a c1651a = A.a.f37868b;
                if (objT == c1651a) {
                    androidx.compose.runtime.X x12 = new androidx.compose.runtime.X(C22187u0.h(EmptyCoroutineContext.INSTANCE, a13));
                    a13.H(x12);
                    objT = x12;
                }
                a13.O();
                kotlinx.coroutines.T t12 = ((androidx.compose.runtime.X) objT).f38164b;
                a13.O();
                int i12 = Ng.f35206b;
                String strA = Og.a(a13, R.string.m3c_date_range_picker_scroll_to_previous_month);
                String strA2 = Og.a(a13, R.string.m3c_date_range_picker_scroll_to_next_month);
                a13.I(1645720805);
                Long l12 = this.f37146l;
                boolean zB2 = a13.B(l12);
                Long l13 = this.f37147m;
                boolean zB3 = zB2 | a13.B(l13);
                Y41.p<Long, Long, kotlin.G0> pVar = this.f37148n;
                boolean zB4 = zB3 | a13.B(pVar);
                Object objT2 = a13.t();
                if (zB4 || objT2 == c1651a) {
                    objT2 = new C21788p6(l12, l13, pVar);
                    a13.H(objT2);
                }
                Y41.l lVar = (Y41.l) objT2;
                a13.O();
                androidx.compose.foundation.layout.V1 v12 = C21811q6.f37145a;
                androidx.compose.foundation.lazy.w0 w0Var = this.f37149o;
                List listU = C42745f0.U(new C22557e(strA, new C21901u6(w0Var, t12)), new C22557e(strA2, new C21856s6(w0Var, t12)));
                androidx.compose.ui.v vVarB = androidx.compose.ui.semantics.r.b(androidx.compose.ui.v.f42878y1, false, C21650j6.f36609l);
                a13.I(1645721776);
                boolean zU2 = a13.u(this.f37150p) | a13.u(this.f37151q) | a13.B(this.f37152r) | a13.u(this.f37153s) | a13.u(listU) | a13.B(this.f37154t) | a13.B(l12) | a13.B(l13) | a13.B(lVar) | a13.B(this.f37155u) | a13.B(this.f37156v);
                Object objT3 = a13.t();
                if (zU2 || objT3 == c1651a) {
                    objT3 = new C21765o6(this.f37150p, this.f37151q, this.f37152r, this.f37146l, this.f37147m, lVar, this.f37155u, this.f37153s, this.f37156v, this.f37154t, listU);
                    a13.H(objT3);
                }
                a13.O();
                C20650b.b(vVarB, this.f37149o, null, null, null, null, false, (Y41.l) objT3, a13, 0);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1", f = "DateRangePicker.kt", i = {}, l = {874}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.q6$b */
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f37157q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.lazy.w0 f37158r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Long, kotlin.G0> f37159s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ AbstractC21692l2 f37160t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ kotlin.ranges.l f37161u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(androidx.compose.foundation.lazy.w0 w0Var, Y41.l<? super Long, kotlin.G0> lVar, AbstractC21692l2 abstractC21692l2, kotlin.ranges.l lVar2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f37158r = w0Var;
            this.f37159s = lVar;
            this.f37160t = abstractC21692l2;
            this.f37161u = lVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f37158r, this.f37159s, this.f37160t, this.f37161u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f37157q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f37157q = 1;
                float f12 = V4.f35601a;
                androidx.compose.foundation.lazy.w0 w0Var = this.f37158r;
                Object objCollect = C22126m3.n(new D5(w0Var)).collect(new E5(w0Var, this.f37159s, this.f37160t, this.f37161u), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = kotlin.G0.f406611a;
                }
                if (objCollect == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: DateRangePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.q6$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.lazy.w0 f37162l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Long f37163m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Long f37164n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.p<Long, Long, kotlin.G0> f37165o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Long, kotlin.G0> f37166p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ AbstractC21692l2 f37167q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ kotlin.ranges.l f37168r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21648j4 f37169s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Ce f37170t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y3 f37171u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f37172v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(androidx.compose.foundation.lazy.w0 w0Var, Long l12, Long l13, Y41.p<? super Long, ? super Long, kotlin.G0> pVar, Y41.l<? super Long, kotlin.G0> lVar, AbstractC21692l2 abstractC21692l2, kotlin.ranges.l lVar2, InterfaceC21648j4 interfaceC21648j4, Ce ce2, Y3 y32, int i12) {
            super(2);
            this.f37162l = w0Var;
            this.f37163m = l12;
            this.f37164n = l13;
            this.f37165o = pVar;
            this.f37166p = lVar;
            this.f37167q = abstractC21692l2;
            this.f37168r = lVar2;
            this.f37169s = interfaceC21648j4;
            this.f37170t = ce2;
            this.f37171u = y32;
            this.f37172v = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f37172v | 1);
            Ce ce2 = this.f37170t;
            Y3 y32 = this.f37171u;
            C21811q6.a(this.f37162l, this.f37163m, this.f37164n, this.f37165o, this.f37166p, this.f37167q, this.f37168r, this.f37169s, ce2, y32, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f37145a = androidx.compose.foundation.layout.R1.e(24, 20, 0.0f, 8, 4);
        float f12 = 64;
        float f13 = 12;
        androidx.compose.foundation.layout.R1.e(f12, 0.0f, f13, 0.0f, 10);
        androidx.compose.foundation.layout.R1.e(f12, 0.0f, f13, f13, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018f  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.foundation.lazy.w0 r21, java.lang.Long r22, java.lang.Long r23, Y41.p<? super java.lang.Long, ? super java.lang.Long, kotlin.G0> r24, Y41.l<? super java.lang.Long, kotlin.G0> r25, androidx.compose.material3.AbstractC21692l2 r26, kotlin.ranges.l r27, androidx.compose.material3.InterfaceC21648j4 r28, androidx.compose.material3.Ce r29, androidx.compose.material3.Y3 r30, androidx.compose.runtime.A r31, int r32) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21811q6.a(androidx.compose.foundation.lazy.w0, java.lang.Long, java.lang.Long, Y41.p, Y41.l, androidx.compose.material3.l2, kotlin.ranges.l, androidx.compose.material3.j4, androidx.compose.material3.Ce, androidx.compose.material3.Y3, androidx.compose.runtime.A, int):void");
    }

    public static final void b(Long l12, Long l13, long j12, Y41.p pVar, Y41.l lVar, AbstractC21692l2 abstractC21692l2, kotlin.ranges.l lVar2, InterfaceC21648j4 interfaceC21648j4, Ce ce2, Y3 y32, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-787063721);
        if ((i12 & 6) == 0) {
            i13 = (bE2.B(l12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.B(l13) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= bE2.n(j12) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= bE2.u(pVar) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= bE2.u(lVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= bE2.u(abstractC21692l2) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((1572864 & i12) == 0) {
            i13 |= bE2.u(lVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i13 |= (16777216 & i12) == 0 ? bE2.B(interfaceC21648j4) : bE2.u(interfaceC21648j4) ? 8388608 : 4194304;
        }
        if ((100663296 & i12) == 0) {
            i13 |= bE2.B(ce2) ? 67108864 : 33554432;
        }
        if ((805306368 & i12) == 0) {
            i13 |= bE2.B(y32) ? 536870912 : 268435456;
        }
        if ((306783379 & i13) == 306783378 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            C21784p2 c21784p2F = abstractC21692l2.f(j12);
            androidx.compose.foundation.lazy.w0 w0VarA = androidx.compose.foundation.lazy.A0.a((((c21784p2F.f37010a - lVar2.f406905b) * 12) + c21784p2F.f37011b) - 1, 0, 2, bE2);
            androidx.compose.ui.v vVarK = androidx.compose.foundation.layout.R1.k(V4.f35603c, 0.0f, 2, androidx.compose.ui.v.f42878y1);
            bE2.I(-483455358);
            C20585k.f28659a.getClass();
            C20585k.l lVar3 = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar3, InterfaceC22215f.a.f39088n, bE2, 0);
            bE2.I(-1323940314);
            int i14 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            C22096n c22096nC = androidx.compose.ui.layout.M.c(vVarK);
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            androidx.compose.runtime.R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar2 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar2);
            }
            androidx.compose.foundation.H.y(0, c22096nC, androidx.compose.runtime.J2.a(bE2), bE2, 2058660585);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            V4.f(y32, abstractC21692l2, bE2, ((i13 >> 27) & 14) | ((i13 >> 12) & 112));
            b12 = bE2;
            a(w0VarA, l12, l13, pVar, lVar, abstractC21692l2, lVar2, interfaceC21648j4, ce2, y32, b12, ((i13 << 3) & 1008) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (3670016 & i13) | (29360128 & i13) | (234881024 & i13) | (1879048192 & i13));
            androidx.compose.foundation.H.B(b12, false, true, false, false);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21513d6(l12, l13, j12, pVar, lVar, abstractC21692l2, lVar2, interfaceC21648j4, ce2, y32, i12);
        }
    }
}
