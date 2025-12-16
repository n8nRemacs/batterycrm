package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.C20444d1;
import androidx.compose.foundation.gestures.C20495q0;
import androidx.compose.foundation.text.W1;
import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.InterfaceC22544x2;
import com.facebook.imageutils.JfifUtil;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: SelectionGestures.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20998b0 {

    /* compiled from: SelectionGestures.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.selection.b0$a */
    public static final class a implements PointerInputEventHandler {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21028o f31916b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ W1 f31917c;

        /* compiled from: SelectionGestures.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", i = {0}, l = {107, 113, 115}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
        /* renamed from: androidx.compose.foundation.text.selection.b0$a$a, reason: collision with other inner class name */
        public static final class C1627a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f31918q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f31919r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC21028o f31920s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ C21020k f31921t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ W1 f31922u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1627a(W1 w12, C21020k c21020k, InterfaceC21028o interfaceC21028o, Continuation continuation) {
                super(2, continuation);
                this.f31920s = interfaceC21028o;
                this.f31921t = c21020k;
                this.f31922u = w12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                C1627a c1627a = new C1627a(this.f31922u, this.f31921t, this.f31920s, continuation);
                c1627a.f31919r = obj;
                return c1627a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
                return ((C1627a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
            /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r9.f31918q
                    r2 = 1
                    r3 = 3
                    r4 = 2
                    if (r1 == 0) goto L26
                    if (r1 == r2) goto L1e
                    if (r1 == r4) goto L1a
                    if (r1 != r3) goto L12
                    goto L1a
                L12:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1a:
                    kotlin.C42729a0.b(r10)
                    goto L86
                L1e:
                    java.lang.Object r1 = r9.f31919r
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                    kotlin.C42729a0.b(r10)
                    goto L39
                L26:
                    kotlin.C42729a0.b(r10)
                    java.lang.Object r10 = r9.f31919r
                    r1 = r10
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                    r9.f31919r = r1
                    r9.f31918q = r2
                    java.lang.Object r10 = androidx.compose.foundation.text.selection.C20998b0.a(r1, r9)
                    if (r10 != r0) goto L39
                    return r0
                L39:
                    androidx.compose.ui.input.pointer.s r10 = (androidx.compose.ui.input.pointer.C22340s) r10
                    boolean r2 = androidx.compose.foundation.text.selection.C20998b0.h(r10)
                    r5 = 0
                    if (r2 == 0) goto L73
                    int r2 = r10.f40280c
                    r2 = r2 & 33
                    if (r2 == 0) goto L73
                    java.lang.Object r2 = r10.f40278a
                    r6 = r2
                    java.util.Collection r6 = (java.util.Collection) r6
                    int r6 = r6.size()
                    r7 = 0
                L52:
                    if (r7 >= r6) goto L64
                    java.lang.Object r8 = r2.get(r7)
                    androidx.compose.ui.input.pointer.C r8 = (androidx.compose.ui.input.pointer.C) r8
                    boolean r8 = r8.b()
                    if (r8 == 0) goto L61
                    goto L73
                L61:
                    int r7 = r7 + 1
                    goto L52
                L64:
                    r9.f31919r = r5
                    r9.f31918q = r4
                    androidx.compose.foundation.text.selection.k r2 = r9.f31921t
                    androidx.compose.foundation.text.selection.o r3 = r9.f31920s
                    java.lang.Object r10 = androidx.compose.foundation.text.selection.C20998b0.b(r1, r3, r2, r10, r9)
                    if (r10 != r0) goto L86
                    return r0
                L73:
                    boolean r2 = androidx.compose.foundation.text.selection.C20998b0.h(r10)
                    if (r2 != 0) goto L86
                    r9.f31919r = r5
                    r9.f31918q = r3
                    androidx.compose.foundation.text.W1 r2 = r9.f31922u
                    java.lang.Object r10 = androidx.compose.foundation.text.selection.C20998b0.d(r1, r2, r10, r9)
                    if (r10 != r0) goto L86
                    return r0
                L86:
                    kotlin.G0 r10 = kotlin.G0.f406611a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C20998b0.a.C1627a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(InterfaceC21028o interfaceC21028o, W1 w12) {
            this.f31916b = interfaceC21028o;
            this.f31917c = w12;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
            Object objC = C20444d1.c(k12, new C1627a(this.f31917c, new C21020k(k12.getViewConfiguration()), this.f31916b, null), continuation);
            return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
        }
    }

    /* compiled from: SelectionGestures.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGesturePointerInputBtf2$2", f = "SelectionGestures.kt", i = {0}, l = {209, JfifUtil.MARKER_EOI, 220, 221}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.text.selection.b0$b */
    public static final class b extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f31923q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f31924r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C21020k f31925s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC21028o f31926t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ W1 f31927u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(W1 w12, C21020k c21020k, InterfaceC21028o interfaceC21028o, Continuation continuation) {
            super(2, continuation);
            this.f31925s = c21020k;
            this.f31926t = interfaceC21028o;
            this.f31927u = w12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f31927u, this.f31925s, this.f31926t, continuation);
            bVar.f31924r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
        /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f31923q
                r2 = 1
                r3 = 4
                r4 = 3
                r5 = 2
                if (r1 == 0) goto L2a
                if (r1 == r2) goto L22
                if (r1 == r5) goto L1d
                if (r1 == r4) goto L1d
                if (r1 != r3) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1d:
                kotlin.C42729a0.b(r14)
                goto L98
            L22:
                java.lang.Object r1 = r13.f31924r
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                kotlin.C42729a0.b(r14)
                goto L3d
            L2a:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.f31924r
                r1 = r14
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                r13.f31924r = r1
                r13.f31923q = r2
                java.lang.Object r14 = androidx.compose.foundation.text.selection.C20998b0.a(r1, r13)
                if (r14 != r0) goto L3d
                return r0
            L3d:
                androidx.compose.ui.input.pointer.s r14 = (androidx.compose.ui.input.pointer.C22340s) r14
                androidx.compose.foundation.text.selection.k r6 = r13.f31925s
                r6.a(r14)
                boolean r7 = androidx.compose.foundation.text.selection.C20998b0.h(r14)
                r8 = 0
                if (r7 == 0) goto L7a
                int r9 = r14.f40280c
                r9 = r9 & 33
                if (r9 == 0) goto L7a
                java.lang.Object r9 = r14.f40278a
                r10 = r9
                java.util.Collection r10 = (java.util.Collection) r10
                int r10 = r10.size()
                r11 = 0
            L5b:
                if (r11 >= r10) goto L6d
                java.lang.Object r12 = r9.get(r11)
                androidx.compose.ui.input.pointer.C r12 = (androidx.compose.ui.input.pointer.C) r12
                boolean r12 = r12.b()
                if (r12 == 0) goto L6a
                goto L7a
            L6a:
                int r11 = r11 + 1
                goto L5b
            L6d:
                r13.f31924r = r8
                r13.f31923q = r5
                androidx.compose.foundation.text.selection.o r2 = r13.f31926t
                java.lang.Object r14 = androidx.compose.foundation.text.selection.C20998b0.c(r1, r2, r6, r14, r13)
                if (r14 != r0) goto L98
                return r0
            L7a:
                if (r7 != 0) goto L98
                int r5 = r6.f32050b
                androidx.compose.foundation.text.W1 r6 = r13.f31927u
                if (r5 != r2) goto L8d
                r13.f31924r = r8
                r13.f31923q = r4
                java.lang.Object r14 = androidx.compose.foundation.text.selection.C20998b0.e(r1, r6, r14, r13)
                if (r14 != r0) goto L98
                return r0
            L8d:
                r13.f31924r = r8
                r13.f31923q = r3
                java.lang.Object r14 = androidx.compose.foundation.text.selection.C20998b0.f(r1, r6, r14, r13)
                if (r14 != r0) goto L98
                return r0
            L98:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C20998b0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SelectionGestures.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.selection.b0$c */
    public static final class c implements PointerInputEventHandler {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Boolean, kotlin.G0> f31928b;

        /* compiled from: SelectionGestures.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
        /* renamed from: androidx.compose.foundation.text.selection.b0$c$a */
        public static final class a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f31929q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f31930r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Y41.l<Boolean, kotlin.G0> f31931s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Y41.l<? super Boolean, kotlin.G0> lVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f31931s = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f31931s, continuation);
                aVar.f31930r = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
                return ((a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r4.f31929q
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.f31930r
                    androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                    kotlin.C42729a0.b(r5)
                    goto L30
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1b:
                    kotlin.C42729a0.b(r5)
                    java.lang.Object r5 = r4.f31930r
                    androidx.compose.ui.input.pointer.c r5 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r5
                    r1 = r5
                L23:
                    androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.f40173b
                    r4.f31930r = r1
                    r4.f31929q = r2
                    java.lang.Object r5 = r1.N1(r5, r4)
                    if (r5 != r0) goto L30
                    return r0
                L30:
                    androidx.compose.ui.input.pointer.s r5 = (androidx.compose.ui.input.pointer.C22340s) r5
                    boolean r5 = androidx.compose.foundation.text.selection.C20998b0.h(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                    Y41.l<java.lang.Boolean, kotlin.G0> r3 = r4.f31931s
                    r3.invoke(r5)
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C20998b0.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super Boolean, kotlin.G0> lVar) {
            this.f31928b = lVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
            Object objN0 = k12.N0(new a(this.f31928b, null), continuation);
            return objN0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN0 : kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0040 -> B:18:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.InterfaceC22325c r7, kotlin.coroutines.jvm.internal.BaseContinuationImpl r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.text.selection.U
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.text.selection.U r0 = (androidx.compose.foundation.text.selection.U) r0
            int r1 = r0.f31879s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31879s = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.U r0 = new androidx.compose.foundation.text.selection.U
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f31878r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f31879s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.compose.ui.input.pointer.c r7 = r0.f31877q
            kotlin.C42729a0.b(r8)
            goto L43
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            kotlin.C42729a0.b(r8)
        L36:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.ui.input.pointer.PointerEventPass.f40174c
            r0.f31877q = r7
            r0.f31879s = r3
            java.lang.Object r8 = r7.N1(r8, r0)
            if (r8 != r1) goto L43
            goto L62
        L43:
            androidx.compose.ui.input.pointer.s r8 = (androidx.compose.ui.input.pointer.C22340s) r8
            java.lang.Object r2 = r8.f40278a
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r5 = 0
        L4f:
            if (r5 >= r4) goto L61
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.input.pointer.C r6 = (androidx.compose.ui.input.pointer.C) r6
            boolean r6 = androidx.compose.ui.input.pointer.C22341t.a(r6)
            if (r6 != 0) goto L5e
            goto L36
        L5e:
            int r5 = r5 + 1
            goto L4f
        L61:
            r1 = r8
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C20998b0.a(androidx.compose.ui.input.pointer.c, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(androidx.compose.ui.input.pointer.InterfaceC22325c r9, androidx.compose.foundation.text.selection.InterfaceC21028o r10, androidx.compose.foundation.text.selection.C21020k r11, androidx.compose.ui.input.pointer.C22340s r12, kotlin.coroutines.jvm.internal.BaseContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C20998b0.b(androidx.compose.ui.input.pointer.c, androidx.compose.foundation.text.selection.o, androidx.compose.foundation.text.selection.k, androidx.compose.ui.input.pointer.s, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x002f, B:46:0x00db, B:48:0x00e3, B:50:0x00e7, B:52:0x00f6, B:54:0x0102, B:42:0x00ab), top: B:61:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.compose.ui.input.pointer.InterfaceC22325c r9, androidx.compose.foundation.text.selection.InterfaceC21028o r10, androidx.compose.foundation.text.selection.C21020k r11, androidx.compose.ui.input.pointer.C22340s r12, kotlin.coroutines.jvm.internal.BaseContinuationImpl r13) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C20998b0.c(androidx.compose.ui.input.pointer.c, androidx.compose.foundation.text.selection.o, androidx.compose.foundation.text.selection.k, androidx.compose.ui.input.pointer.s, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:13:0x002c, B:33:0x008e, B:35:0x0096, B:37:0x00a6, B:39:0x00b2, B:40:0x00b5, B:41:0x00b8, B:42:0x00bc, B:20:0x0041, B:26:0x0064, B:28:0x0068, B:30:0x0072, B:23:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc A[Catch: CancellationException -> 0x0030, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:13:0x002c, B:33:0x008e, B:35:0x0096, B:37:0x00a6, B:39:0x00b2, B:40:0x00b5, B:41:0x00b8, B:42:0x00bc, B:20:0x0041, B:26:0x0064, B:28:0x0068, B:30:0x0072, B:23:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(androidx.compose.ui.input.pointer.InterfaceC22325c r8, androidx.compose.foundation.text.W1 r9, androidx.compose.ui.input.pointer.C22340s r10, kotlin.coroutines.jvm.internal.BaseContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.C21001c0
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.c0 r0 = (androidx.compose.foundation.text.selection.C21001c0) r0
            int r1 = r0.f31939u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31939u = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.c0 r0 = new androidx.compose.foundation.text.selection.c0
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f31938t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f31939u
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L48
            if (r2 == r3) goto L3b
            if (r2 != r4) goto L33
            androidx.compose.foundation.text.W1 r9 = r0.f31936r
            androidx.compose.ui.input.pointer.c r8 = r0.f31935q
            kotlin.C42729a0.b(r11)     // Catch: java.util.concurrent.CancellationException -> L30
            goto L8e
        L30:
            r8 = move-exception
            goto Lc2
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            androidx.compose.ui.input.pointer.C r8 = r0.f31937s
            androidx.compose.foundation.text.W1 r9 = r0.f31936r
            androidx.compose.ui.input.pointer.c r10 = r0.f31935q
            kotlin.C42729a0.b(r11)     // Catch: java.util.concurrent.CancellationException -> L30
            r7 = r10
            r10 = r8
            r8 = r7
            goto L64
        L48:
            kotlin.C42729a0.b(r11)
            java.lang.Object r10 = r10.f40278a     // Catch: java.util.concurrent.CancellationException -> L30
            java.lang.Object r10 = kotlin.collections.C42745f0.E(r10)     // Catch: java.util.concurrent.CancellationException -> L30
            androidx.compose.ui.input.pointer.C r10 = (androidx.compose.ui.input.pointer.C) r10     // Catch: java.util.concurrent.CancellationException -> L30
            long r5 = r10.f40116a     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f31935q = r8     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f31936r = r9     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f31937s = r10     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f31939u = r3     // Catch: java.util.concurrent.CancellationException -> L30
            java.lang.Object r11 = androidx.compose.foundation.gestures.C20495q0.d(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L30
            if (r11 != r1) goto L64
            goto Lc1
        L64:
            androidx.compose.ui.input.pointer.C r11 = (androidx.compose.ui.input.pointer.C) r11     // Catch: java.util.concurrent.CancellationException -> L30
            if (r11 == 0) goto Lbf
            androidx.compose.ui.platform.x2 r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L30
            boolean r10 = g(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L30
            if (r10 == 0) goto Lbf
            long r2 = r11.f40118c     // Catch: java.util.concurrent.CancellationException -> L30
            r9.a(r2)     // Catch: java.util.concurrent.CancellationException -> L30
            long r10 = r11.f40116a     // Catch: java.util.concurrent.CancellationException -> L30
            androidx.compose.foundation.text.selection.d0 r2 = new androidx.compose.foundation.text.selection.d0     // Catch: java.util.concurrent.CancellationException -> L30
            r2.<init>(r9)     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f31935q = r8     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f31936r = r9     // Catch: java.util.concurrent.CancellationException -> L30
            r3 = 0
            r0.f31937s = r3     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f31939u = r4     // Catch: java.util.concurrent.CancellationException -> L30
            java.lang.Object r11 = androidx.compose.foundation.gestures.C20495q0.i(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L30
            if (r11 != r1) goto L8e
            goto Lc1
        L8e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L30
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L30
            if (r10 == 0) goto Lbc
            androidx.compose.ui.input.pointer.s r8 = r8.C0()     // Catch: java.util.concurrent.CancellationException -> L30
            java.lang.Object r8 = r8.f40278a     // Catch: java.util.concurrent.CancellationException -> L30
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.util.concurrent.CancellationException -> L30
            int r10 = r10.size()     // Catch: java.util.concurrent.CancellationException -> L30
            r11 = 0
        La4:
            if (r11 >= r10) goto Lb8
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L30
            androidx.compose.ui.input.pointer.C r0 = (androidx.compose.ui.input.pointer.C) r0     // Catch: java.util.concurrent.CancellationException -> L30
            boolean r1 = androidx.compose.ui.input.pointer.C22341t.b(r0)     // Catch: java.util.concurrent.CancellationException -> L30
            if (r1 == 0) goto Lb5
            r0.a()     // Catch: java.util.concurrent.CancellationException -> L30
        Lb5:
            int r11 = r11 + 1
            goto La4
        Lb8:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> L30
            goto Lbf
        Lbc:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L30
        Lbf:
            kotlin.G0 r1 = kotlin.G0.f406611a
        Lc1:
            return r1
        Lc2:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C20998b0.d(androidx.compose.ui.input.pointer.c, androidx.compose.foundation.text.W1, androidx.compose.ui.input.pointer.s, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:13:0x002c, B:33:0x008e, B:35:0x0096, B:37:0x00a6, B:39:0x00b2, B:40:0x00b5, B:41:0x00b8, B:42:0x00bc, B:20:0x0041, B:26:0x0064, B:28:0x0068, B:30:0x0072, B:23:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc A[Catch: CancellationException -> 0x0030, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:13:0x002c, B:33:0x008e, B:35:0x0096, B:37:0x00a6, B:39:0x00b2, B:40:0x00b5, B:41:0x00b8, B:42:0x00bc, B:20:0x0041, B:26:0x0064, B:28:0x0068, B:30:0x0072, B:23:0x004b), top: B:47:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(androidx.compose.ui.input.pointer.InterfaceC22325c r8, androidx.compose.foundation.text.W1 r9, androidx.compose.ui.input.pointer.C22340s r10, kotlin.coroutines.jvm.internal.BaseContinuationImpl r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.C21007e0
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.e0 r0 = (androidx.compose.foundation.text.selection.C21007e0) r0
            int r1 = r0.f31975u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31975u = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.e0 r0 = new androidx.compose.foundation.text.selection.e0
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f31974t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f31975u
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L48
            if (r2 == r3) goto L3b
            if (r2 != r4) goto L33
            androidx.compose.foundation.text.W1 r9 = r0.f31972r
            androidx.compose.ui.input.pointer.c r8 = r0.f31971q
            kotlin.C42729a0.b(r11)     // Catch: java.util.concurrent.CancellationException -> L30
            goto L8e
        L30:
            r8 = move-exception
            goto Lc2
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            androidx.compose.ui.input.pointer.C r8 = r0.f31973s
            androidx.compose.foundation.text.W1 r9 = r0.f31972r
            androidx.compose.ui.input.pointer.c r10 = r0.f31971q
            kotlin.C42729a0.b(r11)     // Catch: java.util.concurrent.CancellationException -> L30
            r7 = r10
            r10 = r8
            r8 = r7
            goto L64
        L48:
            kotlin.C42729a0.b(r11)
            java.lang.Object r10 = r10.f40278a     // Catch: java.util.concurrent.CancellationException -> L30
            java.lang.Object r10 = kotlin.collections.C42745f0.E(r10)     // Catch: java.util.concurrent.CancellationException -> L30
            androidx.compose.ui.input.pointer.C r10 = (androidx.compose.ui.input.pointer.C) r10     // Catch: java.util.concurrent.CancellationException -> L30
            long r5 = r10.f40116a     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f31971q = r8     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f31972r = r9     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f31973s = r10     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f31975u = r3     // Catch: java.util.concurrent.CancellationException -> L30
            java.lang.Object r11 = androidx.compose.foundation.gestures.C20495q0.d(r8, r5, r0)     // Catch: java.util.concurrent.CancellationException -> L30
            if (r11 != r1) goto L64
            goto Lc1
        L64:
            androidx.compose.ui.input.pointer.C r11 = (androidx.compose.ui.input.pointer.C) r11     // Catch: java.util.concurrent.CancellationException -> L30
            if (r11 == 0) goto Lbf
            androidx.compose.ui.platform.x2 r2 = r8.getViewConfiguration()     // Catch: java.util.concurrent.CancellationException -> L30
            boolean r10 = g(r2, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L30
            if (r10 == 0) goto Lbf
            long r2 = r11.f40118c     // Catch: java.util.concurrent.CancellationException -> L30
            r9.a(r2)     // Catch: java.util.concurrent.CancellationException -> L30
            long r10 = r11.f40116a     // Catch: java.util.concurrent.CancellationException -> L30
            androidx.compose.foundation.text.selection.f0 r2 = new androidx.compose.foundation.text.selection.f0     // Catch: java.util.concurrent.CancellationException -> L30
            r2.<init>(r9)     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f31971q = r8     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f31972r = r9     // Catch: java.util.concurrent.CancellationException -> L30
            r3 = 0
            r0.f31973s = r3     // Catch: java.util.concurrent.CancellationException -> L30
            r0.f31975u = r4     // Catch: java.util.concurrent.CancellationException -> L30
            java.lang.Object r11 = androidx.compose.foundation.gestures.C20495q0.i(r8, r10, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L30
            if (r11 != r1) goto L8e
            goto Lc1
        L8e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.util.concurrent.CancellationException -> L30
            boolean r10 = r11.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L30
            if (r10 == 0) goto Lbc
            androidx.compose.ui.input.pointer.s r8 = r8.C0()     // Catch: java.util.concurrent.CancellationException -> L30
            java.lang.Object r8 = r8.f40278a     // Catch: java.util.concurrent.CancellationException -> L30
            r10 = r8
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.util.concurrent.CancellationException -> L30
            int r10 = r10.size()     // Catch: java.util.concurrent.CancellationException -> L30
            r11 = 0
        La4:
            if (r11 >= r10) goto Lb8
            java.lang.Object r0 = r8.get(r11)     // Catch: java.util.concurrent.CancellationException -> L30
            androidx.compose.ui.input.pointer.C r0 = (androidx.compose.ui.input.pointer.C) r0     // Catch: java.util.concurrent.CancellationException -> L30
            boolean r1 = androidx.compose.ui.input.pointer.C22341t.b(r0)     // Catch: java.util.concurrent.CancellationException -> L30
            if (r1 == 0) goto Lb5
            r0.a()     // Catch: java.util.concurrent.CancellationException -> L30
        Lb5:
            int r11 = r11 + 1
            goto La4
        Lb8:
            r9.onStop()     // Catch: java.util.concurrent.CancellationException -> L30
            goto Lbf
        Lbc:
            r9.onCancel()     // Catch: java.util.concurrent.CancellationException -> L30
        Lbf:
            kotlin.G0 r1 = kotlin.G0.f406611a
        Lc1:
            return r1
        Lc2:
            r9.onCancel()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C20998b0.e(androidx.compose.ui.input.pointer.c, androidx.compose.foundation.text.W1, androidx.compose.ui.input.pointer.s, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6 A[Catch: CancellationException -> 0x0032, TryCatch #1 {CancellationException -> 0x0032, blocks: (B:13:0x002d, B:43:0x00ce, B:45:0x00d6, B:47:0x00e6, B:49:0x00f2, B:50:0x00f5, B:51:0x00f8, B:52:0x00fc, B:28:0x0093, B:30:0x0097, B:31:0x0099, B:33:0x009d, B:34:0x00a0, B:36:0x00a9, B:37:0x00af, B:39:0x00b3, B:40:0x00b8, B:25:0x0059), top: B:59:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc A[Catch: CancellationException -> 0x0032, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0032, blocks: (B:13:0x002d, B:43:0x00ce, B:45:0x00d6, B:47:0x00e6, B:49:0x00f2, B:50:0x00f5, B:51:0x00f8, B:52:0x00fc, B:28:0x0093, B:30:0x0097, B:31:0x0099, B:33:0x009d, B:34:0x00a0, B:36:0x00a9, B:37:0x00af, B:39:0x00b3, B:40:0x00b8, B:25:0x0059), top: B:59:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(androidx.compose.ui.input.pointer.InterfaceC22325c r12, androidx.compose.foundation.text.W1 r13, androidx.compose.ui.input.pointer.C22340s r14, kotlin.coroutines.jvm.internal.BaseContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.C20998b0.f(androidx.compose.ui.input.pointer.c, androidx.compose.foundation.text.W1, androidx.compose.ui.input.pointer.s, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    public static final boolean g(InterfaceC22544x2 interfaceC22544x2, androidx.compose.ui.input.pointer.C c12, androidx.compose.ui.input.pointer.C c13) {
        return l0.g.e(l0.g.i(c12.f40118c, c13.f40118c)) < C20495q0.l(interfaceC22544x2, c12.f40124i);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    public static final boolean h(@Y61.k C22340s c22340s) {
        ?? r52 = c22340s.f40278a;
        int size = ((Collection) r52).size();
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = ((androidx.compose.ui.input.pointer.C) r52.get(i12)).f40124i;
            androidx.compose.ui.input.pointer.U.f40189b.getClass();
            if (!androidx.compose.ui.input.pointer.U.a(i13, androidx.compose.ui.input.pointer.U.f40191d)) {
                return false;
            }
        }
        return true;
    }

    @Y61.k
    public static final androidx.compose.ui.v i(@Y61.k androidx.compose.ui.v vVar, @Y61.k InterfaceC21028o interfaceC21028o, @Y61.k W1 w12) {
        a aVar = new a(interfaceC21028o, w12);
        C22340s c22340s = androidx.compose.ui.input.pointer.Z.f40198a;
        return vVar.d0(new SuspendPointerInputElement(interfaceC21028o, w12, null, aVar, 4, null));
    }

    @Y61.l
    public static final Object j(@Y61.k androidx.compose.ui.input.pointer.K k12, @Y61.k InterfaceC21028o interfaceC21028o, @Y61.k W1 w12, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objC = C20444d1.c(k12, new b(w12, new C21020k(k12.getViewConfiguration()), interfaceC21028o, null), continuation);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }

    @Y61.k
    public static final androidx.compose.ui.v k(@Y61.k androidx.compose.ui.v vVar, @Y61.k Y41.l<? super Boolean, kotlin.G0> lVar) {
        return androidx.compose.ui.input.pointer.Z.e(vVar, 8675309, new c(lVar));
    }
}
