package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.C20445d2;
import androidx.compose.foundation.gestures.InterfaceC20509u1;
import androidx.compose.foundation.interaction.o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: TextFieldPressGestureFilter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class A2 implements PointerInputEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f30157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<o.b> f30158c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.interaction.m f30159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f30160e;

    /* compiled from: TextFieldPressGestureFilter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/u1;", "Ll0/g;", "it", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/u1;Ll0/g;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC20509u1, l0.g, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f30161q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC20509u1 f30162r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ long f30163s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f30164t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<o.b> f30165u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.interaction.m f30166v;

        /* compiled from: TextFieldPressGestureFilter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", i = {1}, l = {60, 64}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
        /* renamed from: androidx.compose.foundation.text.A2$a$a, reason: collision with other inner class name */
        public static final class C1601a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public Object f30167q;

            /* renamed from: r, reason: collision with root package name */
            public int f30168r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1<o.b> f30169s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ long f30170t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.foundation.interaction.m f30171u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1601a(InterfaceC22204y1<o.b> interfaceC22204y1, long j12, androidx.compose.foundation.interaction.m mVar, Continuation<? super C1601a> continuation) {
                super(2, continuation);
                this.f30169s = interfaceC22204y1;
                this.f30170t = j12;
                this.f30171u = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                return new C1601a(this.f30169s, this.f30170t, this.f30171u, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((C1601a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r9.f30168r
                    r2 = 0
                    androidx.compose.foundation.interaction.m r3 = r9.f30171u
                    r4 = 2
                    r5 = 1
                    androidx.compose.runtime.y1<androidx.compose.foundation.interaction.o$b> r6 = r9.f30169s
                    if (r1 == 0) goto L2b
                    if (r1 == r5) goto L23
                    if (r1 != r4) goto L1b
                    java.lang.Object r0 = r9.f30167q
                    androidx.compose.foundation.interaction.o$b r0 = (androidx.compose.foundation.interaction.o.b) r0
                    kotlin.C42729a0.b(r10)
                    goto L61
                L1b:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L23:
                    java.lang.Object r1 = r9.f30167q
                    androidx.compose.runtime.y1 r1 = (androidx.compose.runtime.InterfaceC22204y1) r1
                    kotlin.C42729a0.b(r10)
                    goto L49
                L2b:
                    kotlin.C42729a0.b(r10)
                    java.lang.Object r10 = r6.getF42167b()
                    androidx.compose.foundation.interaction.o$b r10 = (androidx.compose.foundation.interaction.o.b) r10
                    if (r10 == 0) goto L4c
                    androidx.compose.foundation.interaction.o$a r1 = new androidx.compose.foundation.interaction.o$a
                    r1.<init>(r10)
                    if (r3 == 0) goto L48
                    r9.f30167q = r6
                    r9.f30168r = r5
                    java.lang.Object r10 = r3.b(r1, r9)
                    if (r10 != r0) goto L48
                    return r0
                L48:
                    r1 = r6
                L49:
                    r1.setValue(r2)
                L4c:
                    androidx.compose.foundation.interaction.o$b r10 = new androidx.compose.foundation.interaction.o$b
                    long r7 = r9.f30170t
                    r10.<init>(r7, r2)
                    if (r3 == 0) goto L62
                    r9.f30167q = r10
                    r9.f30168r = r4
                    java.lang.Object r1 = r3.b(r10, r9)
                    if (r1 != r0) goto L60
                    return r0
                L60:
                    r0 = r10
                L61:
                    r10 = r0
                L62:
                    r6.setValue(r10)
                    kotlin.G0 r10 = kotlin.G0.f406611a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.A2.a.C1601a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: TextFieldPressGestureFilter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public InterfaceC22204y1 f30172q;

            /* renamed from: r, reason: collision with root package name */
            public int f30173r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1<o.b> f30174s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ boolean f30175t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.foundation.interaction.m f30176u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC22204y1<o.b> interfaceC22204y1, boolean z12, androidx.compose.foundation.interaction.m mVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f30174s = interfaceC22204y1;
                this.f30175t = z12;
                this.f30176u = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f30174s, this.f30175t, this.f30176u, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                InterfaceC22204y1<o.b> interfaceC22204y1;
                InterfaceC22204y1<o.b> interfaceC22204y12;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f30173r;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    interfaceC22204y1 = this.f30174s;
                    o.b f42167b = interfaceC22204y1.getF42167b();
                    if (f42167b != null) {
                        androidx.compose.foundation.interaction.j cVar = this.f30175t ? new o.c(f42167b) : new o.a(f42167b);
                        androidx.compose.foundation.interaction.m mVar = this.f30176u;
                        if (mVar != null) {
                            this.f30172q = interfaceC22204y1;
                            this.f30173r = 1;
                            if (mVar.b(cVar, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            interfaceC22204y12 = interfaceC22204y1;
                        }
                        interfaceC22204y1.setValue(null);
                    }
                    return kotlin.G0.f406611a;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC22204y12 = this.f30172q;
                C42729a0.b(obj);
                interfaceC22204y1 = interfaceC22204y12;
                interfaceC22204y1.setValue(null);
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlinx.coroutines.T t12, InterfaceC22204y1<o.b> interfaceC22204y1, androidx.compose.foundation.interaction.m mVar, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f30164t = t12;
            this.f30165u = interfaceC22204y1;
            this.f30166v = mVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC20509u1 interfaceC20509u1, l0.g gVar, Continuation<? super kotlin.G0> continuation) {
            long j12 = gVar.f413387a;
            a aVar = new a(this.f30164t, this.f30165u, this.f30166v, continuation);
            aVar.f30162r = interfaceC20509u1;
            aVar.f30163s = j12;
            return aVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f30161q;
            kotlinx.coroutines.T t12 = this.f30164t;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC20509u1 interfaceC20509u1 = this.f30162r;
                C43259k.d(t12, null, null, new C1601a(this.f30165u, this.f30163s, this.f30166v, null), 3);
                this.f30161q = 1;
                obj = interfaceC20509u1.p0(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            C43259k.d(t12, null, null, new b(this.f30165u, ((Boolean) obj).booleanValue(), this.f30166v, null), 3);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldPressGestureFilter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "it", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<l0.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f30177l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC22204y1 interfaceC22204y1) {
            super(1);
            this.f30177l = interfaceC22204y1;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(l0.g gVar) {
            ((Y41.l) this.f30177l.getF42167b()).invoke(l0.g.a(gVar.f413387a));
            return kotlin.G0.f406611a;
        }
    }

    public A2(kotlinx.coroutines.T t12, InterfaceC22204y1 interfaceC22204y1, androidx.compose.foundation.interaction.m mVar, InterfaceC22204y1 interfaceC22204y12) {
        this.f30157b = t12;
        this.f30158c = interfaceC22204y1;
        this.f30159d = mVar;
        this.f30160e = interfaceC22204y12;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
        Object objE = C20445d2.e(k12, new a(this.f30157b, this.f30158c, this.f30159d, null), new b(this.f30160e), continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : kotlin.G0.f406611a;
    }
}
