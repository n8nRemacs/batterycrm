package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.C20445d2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.text.C20862e2;
import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.foundation.text.selection.C21019j0;
import androidx.compose.foundation.text.selection.C21021k0;
import androidx.compose.foundation.text.selection.InterfaceC21039u;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: CoreTextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "writeable", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V0 {

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/g;", "provide-F1C5BW0", "()J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a implements InterfaceC21039u {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f30575b;

        public a(long j12) {
            this.f30575b = j12;
        }

        @Override // androidx.compose.foundation.text.selection.InterfaceC21039u
        public final long a() {
            return this.f30575b;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b implements PointerInputEventHandler {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ W1 f30576b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C21011f1 f30577c;

        /* compiled from: CoreTextField.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f30578q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.input.pointer.K f30579r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ W1 f30580s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ C21011f1 f30581t;

            /* compiled from: CoreTextField.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", i = {}, l = {1078}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.text.V0$b$a$a, reason: collision with other inner class name */
            public static final class C1602a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f30582q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.input.pointer.K f30583r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ W1 f30584s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1602a(androidx.compose.ui.input.pointer.K k12, W1 w12, Continuation<? super C1602a> continuation) {
                    super(2, continuation);
                    this.f30583r = k12;
                    this.f30584s = w12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new C1602a(this.f30583r, this.f30584s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((C1602a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f30582q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f30582q = 1;
                        if (C21057u1.a(this.f30583r, this.f30584s, this) == coroutine_suspended) {
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

            /* compiled from: CoreTextField.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", i = {}, l = {1081}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.text.V0$b$a$b, reason: collision with other inner class name */
            public static final class C1603b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f30585q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.input.pointer.K f30586r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ C21011f1 f30587s;

                /* compiled from: CoreTextField.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "it", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: androidx.compose.foundation.text.V0$b$a$b$a, reason: collision with other inner class name */
                public static final class C1604a extends kotlin.jvm.internal.N implements Y41.l<l0.g, kotlin.G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ C21011f1 f30588l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C1604a(C21011f1 c21011f1) {
                        super(1);
                        this.f30588l = c21011f1;
                    }

                    @Override // Y41.l
                    public final kotlin.G0 invoke(l0.g gVar) {
                        long j12 = gVar.f413387a;
                        this.f30588l.t();
                        return kotlin.G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1603b(androidx.compose.ui.input.pointer.K k12, C21011f1 c21011f1, Continuation<? super C1603b> continuation) {
                    super(2, continuation);
                    this.f30586r = k12;
                    this.f30587s = c21011f1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new C1603b(this.f30586r, this.f30587s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((C1603b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f30585q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        C1604a c1604a = new C1604a(this.f30587s);
                        this.f30585q = 1;
                        if (C20445d2.g(this.f30586r, null, null, c1604a, this, 7) == coroutine_suspended) {
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
            public a(androidx.compose.ui.input.pointer.K k12, W1 w12, C21011f1 c21011f1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f30579r = k12;
                this.f30580s = w12;
                this.f30581t = c21011f1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f30579r, this.f30580s, this.f30581t, continuation);
                aVar.f30578q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f30578q;
                CoroutineStart coroutineStart = CoroutineStart.f410683e;
                androidx.compose.ui.input.pointer.K k12 = this.f30579r;
                C43259k.d(t12, null, coroutineStart, new C1602a(k12, this.f30580s, null), 1);
                C43259k.d(t12, null, coroutineStart, new C1603b(k12, this.f30581t, null), 1);
                return kotlin.G0.f406611a;
            }
        }

        public b(W1 w12, C21011f1 c21011f1) {
            this.f30576b = w12;
            this.f30577c = c21011f1;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
            Object objC = kotlinx.coroutines.U.c(new a(k12, this.f30576b, this.f30577c, null), continuation);
            return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f30589l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j12) {
            super(1);
            this.f30589l = j12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.semantics.F f12) {
            f12.a(C21021k0.f32054c, new C21019j0(Handle.f30328b, this.f30589l, SelectionHandleAnchor.f31869c, true, null));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C21011f1 f30590l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C21011f1 c21011f1, int i12) {
            super(2);
            this.f30590l = c21011f1;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
            num.intValue();
            int iA2 = C22066f2.a(1);
            V0.c(this.f30590l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0623 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x06d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x08e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0a10  */
    /* JADX WARN: Type inference failed for: r0v117, types: [androidx.compose.ui.v] */
    /* JADX WARN: Type inference failed for: r0v139, types: [androidx.compose.ui.v] */
    /* JADX WARN: Type inference failed for: r14v14, types: [androidx.compose.runtime.B] */
    /* JADX WARN: Type inference failed for: r2v35, types: [Y41.l<androidx.compose.ui.text.input.W, kotlin.G0>] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.ui.text.input.W r92, @Y61.k Y41.l r93, @Y61.l androidx.compose.ui.v r94, @Y61.l androidx.compose.ui.text.x0 r95, @Y61.l androidx.compose.ui.text.input.k0 r96, @Y61.l Y41.l r97, @Y61.l androidx.compose.foundation.interaction.m r98, @Y61.l androidx.compose.ui.graphics.J r99, boolean r100, int r101, int r102, @Y61.l androidx.compose.ui.text.input.C22655v r103, @Y61.l androidx.compose.foundation.text.C20973n1 r104, boolean r105, boolean r106, @Y61.l Y41.q r107, @Y61.l androidx.compose.runtime.A r108, int r109, int r110) {
        /*
            Method dump skipped, instructions count: 2715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.V0.a(androidx.compose.ui.text.input.W, Y41.l, androidx.compose.ui.v, androidx.compose.ui.text.x0, androidx.compose.ui.text.input.k0, Y41.l, androidx.compose.foundation.interaction.m, androidx.compose.ui.graphics.J, boolean, int, int, androidx.compose.ui.text.input.v, androidx.compose.foundation.text.n1, boolean, boolean, Y41.q, androidx.compose.runtime.A, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(androidx.compose.ui.v vVar, C21011f1 c21011f1, C22096n c22096n, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-20551815);
        int i13 = (bE2.B(vVar) ? 4 : 2) | i12 | (bE2.u(c21011f1) ? 32 : 16);
        if (bE2.p(i13 & 1, (i13 & 147) != 146)) {
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, true);
            int i14 = bE2.f37888Q;
            androidx.compose.runtime.O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            C21064w0.a(c21011f1, c22096n, bE2, (i13 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            bE2.X(true);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new T0(vVar, c21011f1, c22096n, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.k androidx.compose.foundation.text.selection.C21011f1 r11, @Y61.l androidx.compose.runtime.A r12, int r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.V0.c(androidx.compose.foundation.text.selection.f1, androidx.compose.runtime.A, int):void");
    }

    public static final void d(C21011f1 c21011f1, boolean z12, androidx.compose.runtime.A a12, int i12) {
        int i13;
        Q2 q2D;
        androidx.compose.ui.text.o0 o0Var;
        androidx.compose.runtime.B bE2 = a12.E(626339208);
        if ((i12 & 6) == 0) {
            i13 = (bE2.u(c21011f1) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= bE2.j(z12) ? 32 : 16;
        }
        if (!bE2.p(i13 & 1, (i13 & 19) != 18)) {
            bE2.f();
        } else if (z12) {
            bE2.C(-1290924834);
            C20985q1 c20985q1 = c21011f1.f31986d;
            androidx.compose.ui.text.o0 o0Var2 = null;
            if (c20985q1 != null && (q2D = c20985q1.d()) != null && (o0Var = q2D.f30513a) != null) {
                C20985q1 c20985q12 = c21011f1.f31986d;
                if (!(c20985q12 != null ? c20985q12.f31793p : true)) {
                    o0Var2 = o0Var;
                }
            }
            if (o0Var2 == null) {
                bE2.C(-1290601288);
            } else {
                bE2.C(-1290601287);
                if (androidx.compose.ui.text.v0.d(c21011f1.m().f42384b)) {
                    bE2.C(-1684179174);
                    bE2.X(false);
                } else {
                    bE2.C(-1685230508);
                    int iB2 = c21011f1.f31984b.b((int) (c21011f1.m().f42384b >> 32));
                    int iB3 = c21011f1.f31984b.b((int) (c21011f1.m().f42384b & 4294967295L));
                    ResolvedTextDirection resolvedTextDirectionA = o0Var2.a(iB2);
                    ResolvedTextDirection resolvedTextDirectionA2 = o0Var2.a(Math.max(iB3 - 1, 0));
                    C20985q1 c20985q13 = c21011f1.f31986d;
                    if (c20985q13 == null || !((Boolean) ((C22082i3) c20985q13.f31790m).getF42167b()).booleanValue()) {
                        bE2.C(-1684548198);
                        bE2.X(false);
                    } else {
                        bE2.C(-1684812473);
                        androidx.compose.foundation.text.selection.o1.a(true, resolvedTextDirectionA, c21011f1, bE2, ((i13 << 6) & 896) | 6);
                        bE2.X(false);
                    }
                    C20985q1 c20985q14 = c21011f1.f31986d;
                    if (c20985q14 == null || !((Boolean) ((C22082i3) c20985q14.f31791n).getF42167b()).booleanValue()) {
                        bE2.C(-1684200998);
                        bE2.X(false);
                    } else {
                        bE2.C(-1684464312);
                        androidx.compose.foundation.text.selection.o1.a(false, resolvedTextDirectionA2, c21011f1, bE2, ((i13 << 6) & 896) | 6);
                        bE2.X(false);
                    }
                    bE2.X(false);
                }
                C20985q1 c20985q15 = c21011f1.f31986d;
                if (c20985q15 != null) {
                    boolean zF2 = kotlin.jvm.internal.L.f(c21011f1.f32003u.f42383a.f42127c, c21011f1.m().f42383a.f42127c);
                    InterfaceC22204y1 interfaceC22204y1 = c20985q15.f31789l;
                    if (!zF2) {
                        ((C22082i3) interfaceC22204y1).setValue(Boolean.FALSE);
                    }
                    if (c20985q15.b()) {
                        if (((Boolean) ((C22082i3) interfaceC22204y1).getF42167b()).booleanValue()) {
                            c21011f1.t();
                        } else {
                            c21011f1.n();
                        }
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                }
            }
            bE2.X(false);
            bE2.X(false);
        } else {
            bE2.C(651160447);
            bE2.X(false);
            c21011f1.n();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new U0(c21011f1, z12, i12);
        }
    }

    public static final void e(C20985q1 c20985q1) {
        androidx.compose.ui.text.input.i0 i0Var = c20985q1.f31782e;
        if (i0Var != null) {
            C20862e2.a aVar = C20862e2.f30700a;
            Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> lVar = c20985q1.f31799v;
            aVar.getClass();
            ((C20985q1.b) lVar).invoke(androidx.compose.ui.text.input.W.a(c20985q1.f31781d.f42456a, null, 0L, 3));
            androidx.compose.ui.text.input.Y y12 = i0Var.f42445a;
            AtomicReference<androidx.compose.ui.text.input.i0> atomicReference = y12.f42389b;
            while (true) {
                if (atomicReference.compareAndSet(i0Var, null)) {
                    y12.f42388a.a();
                    break;
                } else if (atomicReference.get() != i0Var) {
                    break;
                }
            }
        }
        c20985q1.f31782e = null;
    }

    public static final void f(C20985q1 c20985q1, androidx.compose.ui.text.input.W w12, androidx.compose.ui.text.input.L l12) {
        AbstractC22167l.f38720e.getClass();
        AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
        Y41.l<Object, kotlin.G0> f38713f = abstractC22167lA != null ? abstractC22167lA.getF38713f() : null;
        AbstractC22167l abstractC22167lB = AbstractC22167l.a.b(abstractC22167lA);
        try {
            Q2 q2D = c20985q1.d();
            if (q2D == null) {
                return;
            }
            androidx.compose.ui.text.input.i0 i0Var = c20985q1.f31782e;
            if (i0Var == null) {
                return;
            }
            androidx.compose.ui.layout.A aC2 = c20985q1.c();
            if (aC2 == null) {
                return;
            }
            C20862e2.a aVar = C20862e2.f30700a;
            U1 u12 = c20985q1.f31778a;
            androidx.compose.ui.text.o0 o0Var = q2D.f30513a;
            boolean zB2 = c20985q1.b();
            aVar.getClass();
            C20862e2.a.b(w12, u12, o0Var, aC2, i0Var, zB2, l12);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        } finally {
            AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, f38713f);
        }
    }
}
