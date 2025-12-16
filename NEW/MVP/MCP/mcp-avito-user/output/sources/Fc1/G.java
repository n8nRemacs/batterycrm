package Fc1;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class G {

    @kotlin.jvm.internal.s0
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l f4961l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.l lVar) {
            super(1);
            this.f4961l = lVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Integer num) {
            int iIntValue = num.intValue();
            int i12 = kotlin.jvm.internal.J.f406821a;
            if (iIntValue != -1) {
                this.f4961l.invoke(Integer.valueOf(iIntValue + 1));
            }
            return kotlin.G0.f406611a;
        }
    }

    @kotlin.jvm.internal.s0
    @DebugMetadata(c = "feedback.shared.sdk.ui.pages.fields.stars.compose.components.FeedbackStarsComponentKt$FeedbackStarsComponent$1$1", f = "FeedbackStarsComponent.kt", i = {0, 0}, l = {45}, m = "invokeSuspend", n = {"$this$forEach$iv", "it"}, s = {"L$0", "I$2"})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int[] f4962q;

        /* renamed from: r, reason: collision with root package name */
        public InterfaceC22196w1 f4963r;

        /* renamed from: s, reason: collision with root package name */
        public int f4964s;

        /* renamed from: t, reason: collision with root package name */
        public int f4965t;

        /* renamed from: u, reason: collision with root package name */
        public int f4966u;

        /* renamed from: v, reason: collision with root package name */
        public int f4967v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f4968w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Integer> f4969x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, kotlin.G0> f4970y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC22196w1 interfaceC22196w1, InterfaceC22204y1<Integer> interfaceC22204y1, Y41.l<? super Integer, kotlin.G0> lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f4968w = interfaceC22196w1;
            this.f4969x = interfaceC22204y1;
            this.f4970y = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f4968w, this.f4969x, this.f4970y, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0069 -> B:19:0x006c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f4967v
                androidx.compose.runtime.y1<java.lang.Integer> r2 = r10.f4969x
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 != r3) goto L1b
                int r1 = r10.f4966u
                int r4 = r10.f4965t
                int r5 = r10.f4964s
                androidx.compose.runtime.w1 r6 = r10.f4963r
                int[] r7 = r10.f4962q
                kotlin.C42729a0.b(r11)
                goto L6c
            L1b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L23:
                kotlin.C42729a0.b(r11)
                androidx.compose.runtime.w1 r11 = r10.f4968w
                int r1 = r11.e()
                java.lang.Object r4 = r2.getF42167b()
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                int r5 = r1 - r4
                int r5 = java.lang.Math.abs(r5)
                int r5 = r5 + r3
                int[] r6 = new int[r5]
                r7 = 0
                r8 = r7
            L41:
                if (r8 >= r5) goto L4f
                if (r1 <= r4) goto L48
                int r9 = r1 - r8
                goto L4a
            L48:
                int r9 = r1 + r8
            L4a:
                r6[r8] = r9
                int r8 = r8 + 1
                goto L41
            L4f:
                r4 = r5
                r5 = r7
                r7 = r6
                r6 = r11
            L53:
                if (r5 >= r4) goto L71
                r1 = r7[r5]
                r10.f4962q = r7
                r10.f4963r = r6
                r10.f4964s = r5
                r10.f4965t = r4
                r10.f4966u = r1
                r10.f4967v = r3
                r8 = 25
                java.lang.Object r11 = kotlinx.coroutines.C43131e0.b(r8, r10)
                if (r11 != r0) goto L6c
                return r0
            L6c:
                r6.L3(r1)
                int r5 = r5 + r3
                goto L53
            L71:
                Y41.l<java.lang.Integer, kotlin.G0> r11 = r10.f4970y
                java.lang.Object r0 = r2.getF42167b()
                r11.invoke(r0)
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: Fc1.G.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, kotlin.G0> f4971l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f4972m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, Y41.l lVar) {
            super(2);
            this.f4971l = lVar;
            this.f4972m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f4972m | 1);
            G.a(this.f4971l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<Integer> f4973l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC22204y1<Integer> interfaceC22204y1) {
            super(1);
            this.f4973l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Integer num) {
            this.f4973l.setValue(Integer.valueOf(num.intValue()));
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Y41.l<? super java.lang.Integer, kotlin.G0> r13, @Y61.l androidx.compose.runtime.A r14, int r15) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.G.a(Y41.l, androidx.compose.runtime.A, int):void");
    }
}
