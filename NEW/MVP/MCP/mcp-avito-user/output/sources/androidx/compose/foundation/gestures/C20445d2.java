package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.C22341t;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Collection;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: TapGestureDetector.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.gestures.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20445d2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.q<InterfaceC20509u1, l0.g, Continuation<? super kotlin.G0>, Object> f27614a = new a(3, null);

    /* compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/u1;", "Ll0/g;", "it", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/u1;Ll0/g;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.d2$a */
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC20509u1, l0.g, Continuation<? super kotlin.G0>, Object> {
        public a() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC20509u1 interfaceC20509u1, l0.g gVar, Continuation<? super kotlin.G0> continuation) {
            long j12 = gVar.f413387a;
            return new a(3, continuation).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 0}, l = {291}, m = "awaitFirstDown", n = {"$this$awaitFirstDown", "pass", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"})
    /* renamed from: androidx.compose.foundation.gestures.d2$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public InterfaceC22325c f27615q;

        /* renamed from: r, reason: collision with root package name */
        public PointerEventPass f27616r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f27617s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f27618t;

        /* renamed from: u, reason: collision with root package name */
        public int f27619u;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f27618t = obj;
            this.f27619u |= BeduinInputModel.MIN_TEXT_VERSION;
            return C20445d2.b(null, false, null, this);
        }
    }

    /* compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.d2$c */
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27620q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27621r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.K f27622s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f27623t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f27624u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ C20521y1 f27625v;

        /* compiled from: TapGestureDetector.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", i = {0, 0, 1}, l = {251, 257}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "resetJob", "resetJob"}, s = {"L$0", "L$1", "L$0"})
        /* renamed from: androidx.compose.foundation.gestures.d2$c$a */
        public static final class a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public Object f27626q;

            /* renamed from: r, reason: collision with root package name */
            public int f27627r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f27628s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f27629t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ SuspendLambda f27630u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.N f27631v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ C20521y1 f27632w;

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.d2$c$a$a, reason: collision with other inner class name */
            public static final class C1577a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f27633q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SuspendLambda f27634r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ C20521y1 f27635s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.input.pointer.C f27636t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C1577a(Y41.q<? super InterfaceC20509u1, ? super l0.g, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar, C20521y1 c20521y1, androidx.compose.ui.input.pointer.C c12, Continuation<? super C1577a> continuation) {
                    super(2, continuation);
                    this.f27634r = (SuspendLambda) qVar;
                    this.f27635s = c20521y1;
                    this.f27636t = c12;
                }

                /* JADX WARN: Type inference failed for: r1v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new C1577a(this.f27634r, this.f27635s, this.f27636t, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((C1577a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                /* JADX WARN: Type inference failed for: r1v1, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f27633q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        l0.g gVarA = l0.g.a(this.f27636t.f40118c);
                        this.f27633q = 1;
                        if (this.f27634r.invoke(this.f27635s, gVarA, this) == coroutine_suspended) {
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

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.d2$c$a$b */
            public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ C20521y1 f27637q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(C20521y1 c20521y1, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f27637q = c20521y1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f27637q, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    this.f27637q.f();
                    return kotlin.G0.f406611a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.d2$c$a$c, reason: collision with other inner class name */
            public static final class C1578c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ C20521y1 f27638q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1578c(C20521y1 c20521y1, Continuation<? super C1578c> continuation) {
                    super(2, continuation);
                    this.f27638q = c20521y1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new C1578c(this.f27638q, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((C1578c) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    this.f27638q.m();
                    return kotlin.G0.f406611a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1", f = "TapGestureDetector.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.d2$c$a$d */
            public static final class d extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f27639q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ C20521y1 f27640r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(C20521y1 c20521y1, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f27640r = c20521y1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new d(this.f27640r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((d) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f27639q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f27639q = 1;
                        if (this.f27640r.r(this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(kotlinx.coroutines.T t12, Y41.q<? super InterfaceC20509u1, ? super l0.g, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar, Y41.l<? super l0.g, kotlin.G0> lVar, C20521y1 c20521y1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f27629t = t12;
                this.f27630u = (SuspendLambda) qVar;
                this.f27631v = (kotlin.jvm.internal.N) lVar;
                this.f27632w = c20521y1;
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
            /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                ?? r32 = this.f27631v;
                C20521y1 c20521y1 = this.f27632w;
                a aVar = new a(this.f27629t, this.f27630u, r32, c20521y1, continuation);
                aVar.f27628s = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
                return ((a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
            /* JADX WARN: Type inference failed for: r0v3, types: [Y41.l, kotlin.jvm.internal.N] */
            /* JADX WARN: Type inference failed for: r8v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r10.f27627r
                    androidx.compose.foundation.gestures.y1 r2 = r10.f27632w
                    r3 = 0
                    r4 = 1
                    kotlinx.coroutines.T r5 = r10.f27629t
                    r6 = 2
                    if (r1 == 0) goto L2f
                    if (r1 == r4) goto L23
                    if (r1 != r6) goto L1b
                    java.lang.Object r0 = r10.f27628s
                    kotlinx.coroutines.N0 r0 = (kotlinx.coroutines.N0) r0
                    kotlin.C42729a0.b(r11)
                    goto L77
                L1b:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L23:
                    java.lang.Object r1 = r10.f27626q
                    kotlinx.coroutines.N0 r1 = (kotlinx.coroutines.N0) r1
                    java.lang.Object r4 = r10.f27628s
                    androidx.compose.ui.input.pointer.c r4 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r4
                    kotlin.C42729a0.b(r11)
                    goto L54
                L2f:
                    kotlin.C42729a0.b(r11)
                    java.lang.Object r11 = r10.f27628s
                    androidx.compose.ui.input.pointer.c r11 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r11
                    kotlinx.coroutines.CoroutineStart r1 = androidx.compose.foundation.gestures.C20445d2.h()
                    androidx.compose.foundation.gestures.d2$c$a$d r7 = new androidx.compose.foundation.gestures.d2$c$a$d
                    r7.<init>(r2, r3)
                    kotlinx.coroutines.N0 r1 = kotlinx.coroutines.C43259k.d(r5, r3, r1, r7, r4)
                    r10.f27628s = r11
                    r10.f27626q = r1
                    r10.f27627r = r4
                    r4 = 3
                    java.lang.Object r4 = androidx.compose.foundation.gestures.C20445d2.c(r11, r10, r4)
                    if (r4 != r0) goto L51
                    return r0
                L51:
                    r9 = r4
                    r4 = r11
                    r11 = r9
                L54:
                    androidx.compose.ui.input.pointer.C r11 = (androidx.compose.ui.input.pointer.C) r11
                    r11.a()
                    Y41.q<androidx.compose.foundation.gestures.u1, l0.g, kotlin.coroutines.Continuation<? super kotlin.G0>, java.lang.Object> r7 = androidx.compose.foundation.gestures.C20445d2.f27614a
                    kotlin.coroutines.jvm.internal.SuspendLambda r8 = r10.f27630u
                    if (r8 == r7) goto L67
                    androidx.compose.foundation.gestures.d2$c$a$a r7 = new androidx.compose.foundation.gestures.d2$c$a$a
                    r7.<init>(r8, r2, r11, r3)
                    androidx.compose.foundation.gestures.C20445d2.j(r5, r1, r7)
                L67:
                    r10.f27628s = r1
                    r10.f27626q = r3
                    r10.f27627r = r6
                    androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.f40174c
                    java.lang.Object r11 = androidx.compose.foundation.gestures.C20445d2.l(r4, r11, r10)
                    if (r11 != r0) goto L76
                    return r0
                L76:
                    r0 = r1
                L77:
                    androidx.compose.ui.input.pointer.C r11 = (androidx.compose.ui.input.pointer.C) r11
                    if (r11 != 0) goto L84
                    androidx.compose.foundation.gestures.d2$c$a$b r11 = new androidx.compose.foundation.gestures.d2$c$a$b
                    r11.<init>(r2, r3)
                    androidx.compose.foundation.gestures.C20445d2.j(r5, r0, r11)
                    goto L9a
                L84:
                    r11.a()
                    androidx.compose.foundation.gestures.d2$c$a$c r1 = new androidx.compose.foundation.gestures.d2$c$a$c
                    r1.<init>(r2, r3)
                    androidx.compose.foundation.gestures.C20445d2.j(r5, r0, r1)
                    kotlin.jvm.internal.N r0 = r10.f27631v
                    long r1 = r11.f40118c
                    l0.g r11 = l0.g.a(r1)
                    r0.invoke(r11)
                L9a:
                    kotlin.G0 r11 = kotlin.G0.f406611a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20445d2.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(androidx.compose.ui.input.pointer.K k12, Y41.q<? super InterfaceC20509u1, ? super l0.g, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar, Y41.l<? super l0.g, kotlin.G0> lVar, C20521y1 c20521y1, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f27622s = k12;
            this.f27623t = (SuspendLambda) qVar;
            this.f27624u = (kotlin.jvm.internal.N) lVar;
            this.f27625v = c20521y1;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            ?? r32 = this.f27624u;
            C20521y1 c20521y1 = this.f27625v;
            c cVar = new c(this.f27622s, this.f27623t, r32, c20521y1, continuation);
            cVar.f27621r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        /* JADX WARN: Type inference failed for: r6v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27620q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a((kotlinx.coroutines.T) this.f27621r, this.f27623t, this.f27624u, this.f27625v, null);
                this.f27620q = 1;
                if (C20444d1.c(this.f27622s, aVar, this) == coroutine_suspended) {
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

    /* compiled from: TapGestureDetector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.d2$d */
    public static final class d extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27641q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27642r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.input.pointer.K f27643s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.q<InterfaceC20509u1, l0.g, Continuation<? super kotlin.G0>, Object> f27644t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.l<l0.g, kotlin.G0> f27645u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Y41.l<l0.g, kotlin.G0> f27646v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Y41.l<l0.g, kotlin.G0> f27647w;

        /* compiled from: TapGestureDetector.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7}, l = {105, 116, 119, 122, 149, 167, 169, 180}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "resetJob", "$this$awaitEachGesture", "down", "resetJob", "resetJob", "$this$awaitEachGesture", "upOrCancel", "cancelOrReleaseJob", "resetJob", "upOrCancel", "$this$awaitEachGesture", "resetJob", "upOrCancel", "secondDown", "resetJob"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0"})
        /* renamed from: androidx.compose.foundation.gestures.d2$d$a */
        public static final class a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: A, reason: collision with root package name */
            public final /* synthetic */ C20521y1 f27648A;

            /* renamed from: q, reason: collision with root package name */
            public Object f27649q;

            /* renamed from: r, reason: collision with root package name */
            public Object f27650r;

            /* renamed from: s, reason: collision with root package name */
            public androidx.compose.ui.input.pointer.C f27651s;

            /* renamed from: t, reason: collision with root package name */
            public int f27652t;

            /* renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f27653u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f27654v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Y41.q<InterfaceC20509u1, l0.g, Continuation<? super kotlin.G0>, Object> f27655w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ Y41.l<l0.g, kotlin.G0> f27656x;

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ Y41.l<l0.g, kotlin.G0> f27657y;

            /* renamed from: z, reason: collision with root package name */
            public final /* synthetic */ Y41.l<l0.g, kotlin.G0> f27658z;

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.d2$d$a$a, reason: collision with other inner class name */
            public static final class C1579a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f27659q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ Y41.q<InterfaceC20509u1, l0.g, Continuation<? super kotlin.G0>, Object> f27660r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ C20521y1 f27661s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.input.pointer.C f27662t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C1579a(Y41.q<? super InterfaceC20509u1, ? super l0.g, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar, C20521y1 c20521y1, androidx.compose.ui.input.pointer.C c12, Continuation<? super C1579a> continuation) {
                    super(2, continuation);
                    this.f27660r = qVar;
                    this.f27661s = c20521y1;
                    this.f27662t = c12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new C1579a(this.f27660r, this.f27661s, this.f27662t, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((C1579a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f27659q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        l0.g gVarA = l0.g.a(this.f27662t.f40118c);
                        this.f27659q = 1;
                        if (this.f27660r.invoke(this.f27661s, gVarA, this) == coroutine_suspended) {
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

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.d2$d$a$b */
            public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ C20521y1 f27663q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(C20521y1 c20521y1, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f27663q = c20521y1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f27663q, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    this.f27663q.m();
                    return kotlin.G0.f406611a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.d2$d$a$c */
            public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ C20521y1 f27664q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(C20521y1 c20521y1, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f27664q = c20521y1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f27664q, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    this.f27664q.f();
                    return kotlin.G0.f406611a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.d2$d$a$d, reason: collision with other inner class name */
            public static final class C1580d extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ C20521y1 f27665q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1580d(C20521y1 c20521y1, Continuation<? super C1580d> continuation) {
                    super(2, continuation);
                    this.f27665q = c20521y1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new C1580d(this.f27665q, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((C1580d) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    this.f27665q.m();
                    return kotlin.G0.f406611a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", i = {}, l = {157, 158}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.d2$d$a$e */
            public static final class e extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f27666q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.N0 f27667r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ C20521y1 f27668s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(kotlinx.coroutines.N0 n02, C20521y1 c20521y1, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f27667r = n02;
                    this.f27668s = c20521y1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new e(this.f27667r, this.f27668s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((e) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f27666q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f27666q = 1;
                        if (this.f27667r.A(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C42729a0.b(obj);
                            return kotlin.G0.f406611a;
                        }
                        C42729a0.b(obj);
                    }
                    this.f27666q = 2;
                    if (this.f27668s.r(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.G0.f406611a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.d2$d$a$f */
            public static final class f extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f27669q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ Y41.q<InterfaceC20509u1, l0.g, Continuation<? super kotlin.G0>, Object> f27670r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ C20521y1 f27671s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.input.pointer.C f27672t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public f(Y41.q<? super InterfaceC20509u1, ? super l0.g, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar, C20521y1 c20521y1, androidx.compose.ui.input.pointer.C c12, Continuation<? super f> continuation) {
                    super(2, continuation);
                    this.f27670r = qVar;
                    this.f27671s = c20521y1;
                    this.f27672t = c12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new f(this.f27670r, this.f27671s, this.f27672t, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((f) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f27669q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        l0.g gVarA = l0.g.a(this.f27672t.f40118c);
                        this.f27669q = 1;
                        if (this.f27670r.invoke(this.f27671s, gVarA, this) == coroutine_suspended) {
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

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.d2$d$a$g */
            public static final class g extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ C20521y1 f27673q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(C20521y1 c20521y1, Continuation<? super g> continuation) {
                    super(2, continuation);
                    this.f27673q = c20521y1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new g(this.f27673q, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((g) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    this.f27673q.m();
                    return kotlin.G0.f406611a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.d2$d$a$h */
            public static final class h extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ C20521y1 f27674q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public h(C20521y1 c20521y1, Continuation<? super h> continuation) {
                    super(2, continuation);
                    this.f27674q = c20521y1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new h(this.f27674q, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((h) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    this.f27674q.f();
                    return kotlin.G0.f406611a;
                }
            }

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1", f = "TapGestureDetector.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.d2$d$a$i */
            public static final class i extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f27675q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ C20521y1 f27676r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i(C20521y1 c20521y1, Continuation<? super i> continuation) {
                    super(2, continuation);
                    this.f27676r = c20521y1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new i(this.f27676r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((i) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f27675q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f27675q = 1;
                        if (this.f27676r.r(this) == coroutine_suspended) {
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

            /* compiled from: TapGestureDetector.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.gestures.d2$d$a$j */
            public static final class j extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ C20521y1 f27677q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public j(C20521y1 c20521y1, Continuation<? super j> continuation) {
                    super(2, continuation);
                    this.f27677q = c20521y1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new j(this.f27677q, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((j) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    this.f27677q.m();
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(kotlinx.coroutines.T t12, Y41.q<? super InterfaceC20509u1, ? super l0.g, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar, Y41.l<? super l0.g, kotlin.G0> lVar, Y41.l<? super l0.g, kotlin.G0> lVar2, Y41.l<? super l0.g, kotlin.G0> lVar3, C20521y1 c20521y1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f27654v = t12;
                this.f27655w = qVar;
                this.f27656x = lVar;
                this.f27657y = lVar2;
                this.f27658z = lVar3;
                this.f27648A = c20521y1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f27654v, this.f27655w, this.f27656x, this.f27657y, this.f27658z, this.f27648A, continuation);
                aVar.f27653u = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
                return ((a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x00cd  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0102  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0127  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0138  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0150  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0180  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x018d  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x01dd  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x0205  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0217  */
            /* JADX WARN: Removed duplicated region for block: B:88:0x022c  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 614
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20445d2.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.q qVar, androidx.compose.ui.input.pointer.K k12, Continuation continuation) {
            super(2, continuation);
            this.f27643s = k12;
            this.f27644t = qVar;
            this.f27645u = lVar;
            this.f27646v = lVar2;
            this.f27647w = lVar3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            Y41.l<l0.g, kotlin.G0> lVar = this.f27646v;
            Y41.l<l0.g, kotlin.G0> lVar2 = this.f27647w;
            androidx.compose.ui.input.pointer.K k12 = this.f27643s;
            d dVar = new d(this.f27645u, lVar, lVar2, this.f27644t, k12, continuation);
            dVar.f27642r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f27641q;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f27642r;
                androidx.compose.ui.input.pointer.K k12 = this.f27643s;
                C20521y1 c20521y1 = new C20521y1(k12);
                a aVar = new a(t12, this.f27644t, this.f27645u, this.f27646v, this.f27647w, c20521y1, null);
                this.f27641q = 1;
                if (C20444d1.c(k12, aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[LOOP:0: B:19:0x0050->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0040 -> B:18:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.InterfaceC22325c r8, kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.C20457g2
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.g2 r0 = (androidx.compose.foundation.gestures.C20457g2) r0
            int r1 = r0.f27726s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27726s = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.g2 r0 = new androidx.compose.foundation.gestures.g2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27725r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27726s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.compose.ui.input.pointer.c r8 = r0.f27724q
            kotlin.C42729a0.b(r9)
            goto L43
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.C42729a0.b(r9)
        L36:
            r0.f27724q = r8
            r0.f27726s = r3
            androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.ui.input.pointer.PointerEventPass.f40174c
            java.lang.Object r9 = r8.N1(r9, r0)
            if (r9 != r1) goto L43
            goto L79
        L43:
            androidx.compose.ui.input.pointer.s r9 = (androidx.compose.ui.input.pointer.C22340s) r9
            java.lang.Object r2 = r9.f40278a
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.C r7 = (androidx.compose.ui.input.pointer.C) r7
            r7.a()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.lang.Object r9 = r9.f40278a
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L67:
            if (r5 >= r2) goto L77
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.C r4 = (androidx.compose.ui.input.pointer.C) r4
            boolean r4 = r4.f40119d
            if (r4 == 0) goto L74
            goto L36
        L74:
            int r5 = r5 + 1
            goto L67
        L77:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20445d2.a(androidx.compose.ui.input.pointer.c, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:18:0x004d). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@Y61.k androidx.compose.ui.input.pointer.InterfaceC22325c r6, boolean r7, @Y61.k androidx.compose.ui.input.pointer.PointerEventPass r8, @Y61.k kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.C> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.C20445d2.b
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.d2$b r0 = (androidx.compose.foundation.gestures.C20445d2.b) r0
            int r1 = r0.f27619u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27619u = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.d2$b r0 = new androidx.compose.foundation.gestures.d2$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27618t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27619u
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r6 = r0.f27617s
            androidx.compose.ui.input.pointer.PointerEventPass r7 = r0.f27616r
            androidx.compose.ui.input.pointer.c r8 = r0.f27615q
            kotlin.C42729a0.b(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L4d
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.C42729a0.b(r9)
        L3e:
            r0.f27615q = r6
            r0.f27616r = r8
            r0.f27617s = r7
            r0.f27619u = r3
            java.lang.Object r9 = r6.N1(r8, r0)
            if (r9 != r1) goto L4d
            return r1
        L4d:
            androidx.compose.ui.input.pointer.s r9 = (androidx.compose.ui.input.pointer.C22340s) r9
            r2 = 0
            boolean r4 = i(r9, r7, r2)
            if (r4 == 0) goto L3e
            java.lang.Object r6 = r9.f40278a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20445d2.b(androidx.compose.ui.input.pointer.c, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object c(InterfaceC22325c interfaceC22325c, Continuation continuation, int i12) {
        PointerEventPass pointerEventPass = PointerEventPass.f40173b;
        boolean z12 = (i12 & 1) != 0;
        if ((i12 & 2) != 0) {
            pointerEventPass = PointerEventPass.f40174c;
        }
        return b(interfaceC22325c, z12, pointerEventPass, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0045 -> B:18:0x0048). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@Y61.k androidx.compose.ui.input.pointer.InterfaceC22325c r6, @Y61.k androidx.compose.ui.input.pointer.PointerEventPass r7, @Y61.k kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.C20449e2
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.e2 r0 = (androidx.compose.foundation.gestures.C20449e2) r0
            int r1 = r0.f27692t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27692t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.e2 r0 = new androidx.compose.foundation.gestures.e2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27691s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27692t
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            androidx.compose.ui.input.pointer.PointerEventPass r6 = r0.f27690r
            androidx.compose.ui.input.pointer.c r7 = r0.f27689q
            kotlin.C42729a0.b(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L48
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.C42729a0.b(r8)
        L3b:
            r0.f27689q = r6
            r0.f27690r = r7
            r0.f27692t = r3
            java.lang.Object r8 = r6.N1(r7, r0)
            if (r8 != r1) goto L48
            return r1
        L48:
            androidx.compose.ui.input.pointer.s r8 = (androidx.compose.ui.input.pointer.C22340s) r8
            r2 = 0
            boolean r4 = i(r8, r2, r3)
            if (r4 == 0) goto L3b
            java.lang.Object r6 = r8.f40278a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20445d2.d(androidx.compose.ui.input.pointer.c, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public static final Object e(@Y61.k androidx.compose.ui.input.pointer.K k12, @Y61.k Y41.q<? super InterfaceC20509u1, ? super l0.g, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar, @Y61.l Y41.l<? super l0.g, kotlin.G0> lVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objC = kotlinx.coroutines.U.c(new c(k12, qVar, lVar, new C20521y1(k12), null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }

    @Y61.l
    public static final Object f(@Y61.l Y41.l lVar, @Y61.l Y41.l lVar2, @Y61.l Y41.l lVar3, @Y61.k Y41.q qVar, @Y61.k androidx.compose.ui.input.pointer.K k12, @Y61.k Continuation continuation) {
        Object objC = kotlinx.coroutines.U.c(new d(lVar2, lVar, lVar3, qVar, k12, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }

    public static /* synthetic */ Object g(androidx.compose.ui.input.pointer.K k12, Y41.l lVar, Y41.q qVar, Y41.l lVar2, Continuation continuation, int i12) {
        Y41.l lVar3 = (i12 & 2) != 0 ? null : lVar;
        if ((i12 & 4) != 0) {
            qVar = f27614a;
        }
        return f(null, lVar3, (i12 & 8) != 0 ? null : lVar2, qVar, k12, continuation);
    }

    public static final CoroutineStart h() {
        return androidx.compose.foundation.N0.f26805c ? CoroutineStart.f410683e : CoroutineStart.f410680b;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    public static final boolean i(C22340s c22340s, boolean z12, boolean z13) {
        if (z13) {
            ?? r72 = c22340s.f40278a;
            int size = ((Collection) r72).size();
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    int i13 = ((androidx.compose.ui.input.pointer.C) r72.get(i12)).f40124i;
                    androidx.compose.ui.input.pointer.U.f40189b.getClass();
                    if (!androidx.compose.ui.input.pointer.U.a(i13, androidx.compose.ui.input.pointer.U.f40191d)) {
                        break;
                    }
                    i12++;
                } else if ((c22340s.f40280c & 33) == 0) {
                    return false;
                }
            }
        }
        ?? r52 = c22340s.f40278a;
        int size2 = ((Collection) r52).size();
        int i14 = 0;
        while (true) {
            boolean zA2 = true;
            if (i14 >= size2) {
                return true;
            }
            androidx.compose.ui.input.pointer.C c12 = (androidx.compose.ui.input.pointer.C) r52.get(i14);
            if (!z12) {
                zA2 = C22341t.a(c12);
            } else if (c12.b() || c12.f40123h || !c12.f40119d) {
                zA2 = false;
            }
            if (!zA2) {
                return false;
            }
            i14++;
        }
    }

    public static kotlinx.coroutines.N0 j(kotlinx.coroutines.T t12, kotlinx.coroutines.N0 n02, Y41.p pVar) {
        return C43259k.d(t12, null, h(), new C20461h2(n02, pVar, null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.foundation.gestures.e1$a] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(@Y61.k androidx.compose.ui.input.pointer.InterfaceC22325c r7, @Y61.k androidx.compose.ui.input.pointer.PointerEventPass r8, @Y61.k kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.C20465i2
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.i2 r0 = (androidx.compose.foundation.gestures.C20465i2) r0
            int r1 = r0.f27766s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27766s = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.i2 r0 = new androidx.compose.foundation.gestures.i2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27765r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27766s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.l0$h r7 = r0.f27764q
            kotlin.C42729a0.b(r9)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L58
            goto L55
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.jvm.internal.l0$h r9 = androidx.compose.foundation.H.t(r9)
            androidx.compose.foundation.gestures.e1$a r2 = androidx.compose.foundation.gestures.AbstractC20448e1.a.f27686a
            r9.f406842b = r2
            androidx.compose.ui.platform.x2 r2 = r7.getViewConfiguration()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L58
            long r4 = r2.c()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L58
            androidx.compose.foundation.gestures.j2 r2 = new androidx.compose.foundation.gestures.j2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L58
            r6 = 0
            r2.<init>(r8, r9, r6)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L58
            r0.f27764q = r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L58
            r0.f27766s = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L58
            java.lang.Object r7 = r7.U1(r4, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L58
            if (r7 != r1) goto L54
            return r1
        L54:
            r7 = r9
        L55:
            T r7 = r7.f406842b
            return r7
        L58:
            androidx.compose.foundation.gestures.e1$c r7 = androidx.compose.foundation.gestures.AbstractC20448e1.c.f27688a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20445d2.k(androidx.compose.ui.input.pointer.c, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        r0 = ((java.util.Collection) r12).size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (r9 >= r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        r10 = (androidx.compose.ui.input.pointer.C) r12.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        if (r10.b() != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a2, code lost:
    
        if (androidx.compose.ui.input.pointer.C22341t.e(r10, r8.a(), r8.J1()) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        r0 = androidx.compose.ui.input.pointer.PointerEventPass.f40175d;
        r1.f27824q = r8;
        r1.f27825r = r3;
        r1.f27827t = 2;
        r0 = r8.N1(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
    
        if (r0 != r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
    
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b7 -> B:13:0x0032). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(@Y61.k androidx.compose.ui.input.pointer.InterfaceC22325c r17, @Y61.k androidx.compose.ui.input.pointer.PointerEventPass r18, @Y61.k kotlin.coroutines.jvm.internal.BaseContinuationImpl r19) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20445d2.l(androidx.compose.ui.input.pointer.c, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
