package com.akita.compose.component.stepper;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20318t;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.M1;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.U2;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.C22274n0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.v;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import shark.AndroidResourceIdNames;

/* compiled from: Stepper.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003¨\u0006\u0003²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "currValue", "nextValue", "stepper_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l {

    /* compiled from: Stepper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.akita.compose.component.stepper.StepperKt$Stepper$1", f = "Stepper.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f62887q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ StepperState f62888r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C20268c<androidx.compose.ui.unit.h, C20318t> f62889s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StepperState stepperState, C20268c<androidx.compose.ui.unit.h, C20318t> c20268c, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f62888r = stepperState;
            this.f62889s = c20268c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f62888r, this.f62889s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f62887q;
            if (i12 == 0) {
                C42729a0.b(obj);
                if (this.f62888r == StepperState.f62830d) {
                    this.f62887q = 1;
                    if (l.e(this.f62889s, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: Stepper.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ w f62890l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f62891m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f62892n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ StepperState f62893o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w wVar, int i12, int i13, StepperState stepperState) {
            super(2);
            this.f62890l = wVar;
            this.f62891m = i12;
            this.f62892n = i13;
            this.f62893o = stepperState;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r10, java.lang.Integer r11) {
            /*
                r9 = this;
                r7 = r10
                androidx.compose.runtime.A r7 = (androidx.compose.runtime.A) r7
                java.lang.Number r11 = (java.lang.Number) r11
                int r10 = r11.intValue()
                r10 = r10 & 11
                r11 = 2
                if (r10 != r11) goto L19
                boolean r10 = r7.c()
                if (r10 != 0) goto L15
                goto L19
            L15:
                r7.f()
                goto L5b
            L19:
                com.akita.compose.component.stepper.w r10 = r9.f62890l
                java.lang.String r0 = r10.f62951m
                r11 = 2106358411(0x7d8c7a8b, float:2.3341025E37)
                r7.C(r11)
                int r11 = r9.f62891m
                boolean r1 = r7.m(r11)
                int r2 = r9.f62892n
                boolean r3 = r7.m(r2)
                r1 = r1 | r3
                java.lang.Object r3 = r7.t()
                if (r1 != 0) goto L3f
                androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
                r1.getClass()
                androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
                if (r3 != r1) goto L47
            L3f:
                com.akita.compose.component.stepper.m r3 = new com.akita.compose.component.stepper.m
                r3.<init>(r11, r2)
                r7.H(r3)
            L47:
                r4 = r3
                Y41.a r4 = (Y41.a) r4
                r7.h()
                com.akita.compose.component.stepper.StepperState r5 = r9.f62893o
                float r3 = r10.f62949k
                float r6 = r10.f62953o
                com.akita.compose.foundation.r r1 = r10.f62939a
                com.akita.compose.component.stepper.a r2 = r10.f62946h
                r8 = 0
                com.akita.compose.component.stepper.l.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            L5b:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.stepper.l.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Stepper.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ w f62894l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f62895m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f62896n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ StepperState f62897o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w wVar, int i12, int i13, StepperState stepperState) {
            super(2);
            this.f62894l = wVar;
            this.f62895m = i12;
            this.f62896n = i13;
            this.f62897o = stepperState;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r10, java.lang.Integer r11) {
            /*
                r9 = this;
                r7 = r10
                androidx.compose.runtime.A r7 = (androidx.compose.runtime.A) r7
                java.lang.Number r11 = (java.lang.Number) r11
                int r10 = r11.intValue()
                r10 = r10 & 11
                r11 = 2
                if (r10 != r11) goto L19
                boolean r10 = r7.c()
                if (r10 != 0) goto L15
                goto L19
            L15:
                r7.f()
                goto L5b
            L19:
                com.akita.compose.component.stepper.w r10 = r9.f62894l
                java.lang.String r0 = r10.f62952n
                r11 = 2106369995(0x7d8ca7cb, float:2.3370394E37)
                r7.C(r11)
                int r11 = r9.f62895m
                boolean r1 = r7.m(r11)
                int r2 = r9.f62896n
                boolean r3 = r7.m(r2)
                r1 = r1 | r3
                java.lang.Object r3 = r7.t()
                if (r1 != 0) goto L3f
                androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
                r1.getClass()
                androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
                if (r3 != r1) goto L47
            L3f:
                com.akita.compose.component.stepper.n r3 = new com.akita.compose.component.stepper.n
                r3.<init>(r11, r2)
                r7.H(r3)
            L47:
                r4 = r3
                Y41.a r4 = (Y41.a) r4
                r7.h()
                com.akita.compose.component.stepper.StepperState r5 = r9.f62897o
                float r3 = r10.f62949k
                float r6 = r10.f62953o
                com.akita.compose.foundation.r r1 = r10.f62939a
                com.akita.compose.component.stepper.a r2 = r10.f62946h
                r8 = 0
                com.akita.compose.component.stepper.l.c(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            L5b:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.stepper.l.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Stepper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ T f62898l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C20268c<androidx.compose.ui.unit.h, C20318t> f62899m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C20268c c20268c, T t12) {
            super(0);
            this.f62898l = t12;
            this.f62899m = c20268c;
        }

        @Override // Y41.a
        public final G0 invoke() {
            C43259k.d(this.f62898l, null, null, new o(this.f62899m, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: Stepper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f62900l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ w f62901m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f62902n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ StepperState f62903o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C20268c<androidx.compose.ui.unit.h, C20318t> f62904p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z12, w wVar, int i12, StepperState stepperState, C20268c<androidx.compose.ui.unit.h, C20318t> c20268c) {
            super(2);
            this.f62900l = z12;
            this.f62901m = wVar;
            this.f62902n = i12;
            this.f62903o = stepperState;
            this.f62904p = c20268c;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else if (this.f62900l) {
                a13.C(873677685);
                com.akita.compose.component.spinner.b.a(this.f62901m.f62947i, null, a13, 0, 2);
                a13.h();
            } else {
                a13.C(873743033);
                androidx.compose.ui.v vVarA = C22274n0.a(androidx.compose.ui.v.f42878y1, new p(this.f62904p));
                l.d(this.f62902n, this.f62901m, this.f62903o, vVarA, a13, 0);
                a13.h();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Stepper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f62905l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f62906m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ w f62907n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f62908o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ StepperState f62909p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f62910q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f62911r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f62912s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f62913t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f62914u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f62915v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(int i12, Y41.l<? super Integer, G0> lVar, w wVar, androidx.compose.ui.v vVar, StepperState stepperState, boolean z12, int i13, int i14, int i15, int i16, int i17) {
            super(2);
            this.f62905l = i12;
            this.f62906m = lVar;
            this.f62907n = wVar;
            this.f62908o = vVar;
            this.f62909p = stepperState;
            this.f62910q = z12;
            this.f62911r = i13;
            this.f62912s = i14;
            this.f62913t = i15;
            this.f62914u = i16;
            this.f62915v = i17;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f62914u | 1);
            int i12 = this.f62911r;
            l.a(this.f62905l, this.f62906m, this.f62907n, this.f62908o, this.f62909p, this.f62910q, i12, this.f62912s, this.f62913t, a12, iA2, this.f62915v);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r31, @Y61.k Y41.l<? super java.lang.Integer, kotlin.G0> r32, @Y61.k com.akita.compose.component.stepper.w r33, @Y61.l androidx.compose.ui.v r34, @Y61.l com.akita.compose.component.stepper.StepperState r35, boolean r36, int r37, int r38, int r39, @Y61.l androidx.compose.runtime.A r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.stepper.l.a(int, Y41.l, com.akita.compose.component.stepper.w, androidx.compose.ui.v, com.akita.compose.component.stepper.StepperState, boolean, int, int, int, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0309  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r35, Y41.l r36, androidx.compose.runtime.internal.C22096n r37, androidx.compose.runtime.internal.C22096n r38, Y41.a r39, androidx.compose.ui.v r40, boolean r41, int r42, int r43, int r44, long r45, float r47, long r48, androidx.compose.foundation.shape.n r50, androidx.compose.runtime.internal.C22096n r51, androidx.compose.runtime.A r52, int r53) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.stepper.l.b(int, Y41.l, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, Y41.a, androidx.compose.ui.v, boolean, int, int, int, long, float, long, androidx.compose.foundation.shape.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }

    public static final void c(String str, com.akita.compose.foundation.r rVar, com.akita.compose.component.stepper.a aVar, float f12, Y41.a aVar2, StepperState stepperState, float f13, A a12, int i12) {
        int i13;
        B bE2 = a12.E(332655313);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(rVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(aVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.k(f12) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.u(aVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.B(stepperState) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((3670016 & i12) == 0) {
            i13 |= bE2.k(f13) ? 1048576 : 524288;
        }
        if ((2995931 & i13) == 599186 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarO = C20588k2.o(aVar3, f12);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarO);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            com.akita.compose.foundation.ui.o.a(str, rVar, M1.c(0.0f, f13, 1, aVar3), com.akita.compose.foundation.q.a(((androidx.compose.ui.graphics.T) aVar.a((!((Boolean) aVar2.invoke()).booleanValue() || stepperState == StepperState.f62829c) ? StepperState.f62829c : stepperState, bE2).getF42167b()).f39331a), bE2, i13 & WebSocketProtocol.PAYLOAD_SHORT, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.akita.compose.component.stepper.c(str, rVar, aVar, f12, aVar2, stepperState, f13, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(int i12, w wVar, StepperState stepperState, androidx.compose.ui.v vVar, A a12, int i13) {
        int i14;
        InterfaceC22204y1 interfaceC22204y1;
        B b12;
        boolean z12;
        Map map;
        androidx.compose.ui.v vVarA;
        B bE2 = a12.E(1622474585);
        if ((i13 & 14) == 0) {
            i14 = (bE2.m(i12) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= bE2.B(wVar) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= bE2.B(stepperState) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            i14 |= bE2.B(vVar) ? 2048 : 1024;
        }
        if ((i14 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
            bE2.C(-605088395);
            Object objT = bE2.t();
            A.f37866a.getClass();
            Object obj = A.a.f37868b;
            if (objT == obj) {
                objT = U2.a(i12);
                bE2.H(objT);
            }
            InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
            Object objI = com.akita.compose.component.accordion.s.i(-605086505, bE2, false);
            if (objI == obj) {
                objI = C22126m3.g(null);
                bE2.H(objI);
            }
            InterfaceC22204y1 interfaceC22204y12 = (InterfaceC22204y1) objI;
            Object objI2 = com.akita.compose.component.accordion.s.i(-605084522, bE2, false);
            if (objI2 == obj) {
                objI2 = new LinkedHashMap();
                bE2.H(objI2);
            }
            Map map2 = (Map) objI2;
            bE2.X(false);
            float fA02 = dVar.A0(wVar.f62939a.f63647d);
            bE2.C(-605078982);
            int i15 = i14 & 14;
            boolean z13 = i15 == 4;
            Object objT2 = bE2.t();
            if (z13 || objT2 == obj) {
                if (i12 > interfaceC22196w1.e()) {
                    fA02 = -fA02;
                }
                objT2 = Float.valueOf(fA02);
                bE2.H(objT2);
            }
            float fFloatValue = ((Number) objT2).floatValue();
            bE2.X(false);
            Map map3 = map2;
            C22187u0.d(new com.akita.compose.component.stepper.e(map2, i12, interfaceC22196w1, interfaceC22204y12, fFloatValue, null), bE2, Integer.valueOf(i12));
            Integer numValueOf = Integer.valueOf(i12);
            bE2.C(-605027632);
            boolean z14 = i15 == 4;
            Object objT3 = bE2.t();
            if (z14 || objT3 == obj) {
                interfaceC22204y1 = interfaceC22204y12;
                objT3 = new g(i12, interfaceC22196w1, interfaceC22204y1);
                bE2.H(objT3);
            } else {
                interfaceC22204y1 = interfaceC22204y12;
            }
            bE2.X(false);
            C22187u0.a(numValueOf, (Y41.l) objT3, bE2);
            long j12 = ((androidx.compose.ui.graphics.T) wVar.f62940b.a(stepperState, bE2).getF42167b()).f39331a;
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.i iVar = InterfaceC22215f.a.f39080f;
            com.akita.compose.foundation.r rVar = wVar.f62939a;
            androidx.compose.ui.v vVarB = androidx.compose.ui.draw.k.b(M1.c(0.0f, wVar.f62953o, 1, R1.h(C20588k2.f(vVar, dVar.E(rVar.f63647d)), wVar.f62941c)));
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
            int i16 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, interfaceC22365i0D);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            x0 x0VarD = rVar.d(new Object[0], bE2);
            bE2.C(-103399245);
            boolean zB2 = bE2.B(x0VarD);
            Object objT4 = bE2.t();
            if (zB2 || objT4 == obj) {
                objT4 = x0.b(x0VarD, 0L, 0L, null, null, 0L, 0, 0L, null, null, 16777151);
                bE2.H(objT4);
            }
            x0 x0Var = (x0) objT4;
            bE2.X(false);
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, bE2, 0);
            int i17 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, aVar2);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, c20568f2A);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            String strValueOf = String.valueOf(interfaceC22196w1.e());
            int i18 = 0;
            int i19 = 0;
            while (i18 < strValueOf.length()) {
                int i22 = i19 + 1;
                String strValueOf2 = String.valueOf(strValueOf.charAt(i18));
                if (((Integer) interfaceC22204y1.getF42167b()) != null) {
                    map = map3;
                    vVarA = C22274n0.a(androidx.compose.ui.v.f42878y1, new h(map, i19));
                } else {
                    map = map3;
                    vVarA = androidx.compose.ui.v.f42878y1;
                }
                B b13 = bE2;
                com.akita.compose.foundation.ui.p.d(strValueOf2, x0Var, vVarA, j12, null, 0, 0, false, null, b13, 0, 496);
                i18++;
                bE2 = b13;
                i19 = i22;
                map3 = map;
            }
            b12 = bE2;
            Map map4 = map3;
            b12.X(true);
            Integer num = (Integer) interfaceC22204y1.getF42167b();
            if (num == null) {
                z12 = true;
            } else {
                int iIntValue = num.intValue();
                v.a aVar3 = androidx.compose.ui.v.f42878y1;
                C20585k.f28659a.getClass();
                C20585k.C1589k c1589k = C20585k.f28660b;
                InterfaceC22215f.f39074a.getClass();
                int i23 = 0;
                C20568f2 c20568f2A2 = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, b12, 0);
                int i24 = b12.f37888Q;
                O1 o1S3 = b12.S();
                androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(b12, aVar3);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                b12.A();
                if (b12.f37887P) {
                    b12.b(aVar4);
                } else {
                    b12.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, b12, c20568f2A2);
                R3.b(InterfaceC22413h.a.f40795f, b12, o1S3);
                Y41.p<InterfaceC22413h, Integer, G0> pVar5 = InterfaceC22413h.a.f40799j;
                if (b12.f37887P || !L.f(b12.t(), Integer.valueOf(i24))) {
                    AK.c.y(i24, b12, i24, pVar5);
                }
                R3.b(InterfaceC22413h.a.f40793d, b12, vVarC3);
                C20576h2 c20576h22 = C20576h2.f28641a;
                String strValueOf3 = String.valueOf(iIntValue);
                int i25 = 0;
                while (i25 < strValueOf3.length()) {
                    com.akita.compose.foundation.ui.p.d(String.valueOf(strValueOf3.charAt(i25)), x0Var, C22274n0.a(androidx.compose.ui.v.f42878y1, new i(map4, i23, fFloatValue)), j12, null, 0, 0, false, null, b12, 0, 496);
                    i25++;
                    i23++;
                }
                z12 = true;
                b12.X(true);
                G0 g02 = G0.f406611a;
            }
            b12.X(z12);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(i12, wVar, stepperState, vVar, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(androidx.compose.animation.core.C20268c r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.stepper.l.e(androidx.compose.animation.core.c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
