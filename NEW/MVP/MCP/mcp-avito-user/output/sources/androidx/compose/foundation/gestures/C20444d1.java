package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: ForEachGesture.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.gestures.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20444d1 {

    /* compiled from: ForEachGesture.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", i = {0, 1, 2}, l = {102, 105, 110}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "$this$awaitPointerEventScope", "$this$awaitPointerEventScope"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: androidx.compose.foundation.gestures.d1$a */
    public static final class a extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f27605q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f27606r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext f27607s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ RestrictedSuspendLambda f27608t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(CoroutineContext coroutineContext, Y41.p<? super InterfaceC22325c, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f27607s = coroutineContext;
            this.f27608t = (RestrictedSuspendLambda) pVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.RestrictedSuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f27607s, this.f27608t, continuation);
            aVar.f27606r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2, types: [androidx.compose.ui.input.pointer.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.ui.input.pointer.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7, types: [Y41.p, kotlin.coroutines.jvm.internal.RestrictedSuspendLambda] */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005b -> B:12:0x002a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0072 -> B:12:0x002a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f27605q
                kotlin.coroutines.CoroutineContext r2 = r8.f27607s
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L36
                if (r1 == r5) goto L2e
                if (r1 == r4) goto L23
                if (r1 != r3) goto L1b
                java.lang.Object r1 = r8.f27606r
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                kotlin.C42729a0.b(r9)
                goto L2a
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                java.lang.Object r1 = r8.f27606r
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                kotlin.C42729a0.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2c
            L2a:
                r9 = r1
                goto L3d
            L2c:
                r9 = move-exception
                goto L62
            L2e:
                java.lang.Object r1 = r8.f27606r
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
                kotlin.C42729a0.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2c
                goto L51
            L36:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f27606r
                androidx.compose.ui.input.pointer.c r9 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r9
            L3d:
                boolean r1 = kotlinx.coroutines.Q0.h(r2)
                if (r1 == 0) goto L76
                kotlin.coroutines.jvm.internal.RestrictedSuspendLambda r1 = r8.f27608t     // Catch: java.util.concurrent.CancellationException -> L5e
                r8.f27606r = r9     // Catch: java.util.concurrent.CancellationException -> L5e
                r8.f27605q = r5     // Catch: java.util.concurrent.CancellationException -> L5e
                java.lang.Object r1 = r1.invoke(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5e
                if (r1 != r0) goto L50
                return r0
            L50:
                r1 = r9
            L51:
                r8.f27606r = r1     // Catch: java.util.concurrent.CancellationException -> L2c
                r8.f27605q = r4     // Catch: java.util.concurrent.CancellationException -> L2c
                androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.ui.input.pointer.PointerEventPass.f40175d     // Catch: java.util.concurrent.CancellationException -> L2c
                java.lang.Object r9 = androidx.compose.foundation.gestures.C20444d1.b(r1, r9, r8)     // Catch: java.util.concurrent.CancellationException -> L2c
                if (r9 != r0) goto L2a
                return r0
            L5e:
                r1 = move-exception
                r7 = r1
                r1 = r9
                r9 = r7
            L62:
                boolean r6 = kotlinx.coroutines.Q0.h(r2)
                if (r6 == 0) goto L75
                r8.f27606r = r1
                r8.f27605q = r3
                androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.ui.input.pointer.PointerEventPass.f40175d
                java.lang.Object r9 = androidx.compose.foundation.gestures.C20444d1.b(r1, r9, r8)
                if (r9 != r0) goto L2a
                return r0
            L75:
                throw r9
            L76:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20444d1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ForEachGesture.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {48, 51, 56}, m = "forEachGesture", n = {"$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext", "$this$forEachGesture", "block", "currentContext"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    /* renamed from: androidx.compose.foundation.gestures.d1$b */
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public androidx.compose.ui.input.pointer.K f27609q;

        /* renamed from: r, reason: collision with root package name */
        public Y41.p f27610r;

        /* renamed from: s, reason: collision with root package name */
        public CoroutineContext f27611s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f27612t;

        /* renamed from: u, reason: collision with root package name */
        public int f27613u;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f27612t = obj;
            this.f27613u |= BeduinInputModel.MIN_TEXT_VERSION;
            return C20444d1.d(null, null, this);
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.List] */
    public static final boolean a(@Y61.k InterfaceC22325c interfaceC22325c) {
        ?? r52 = interfaceC22325c.C0().f40278a;
        int size = ((Collection) r52).size();
        boolean z12 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                break;
            }
            if (((androidx.compose.ui.input.pointer.C) r52.get(i12)).f40119d) {
                z12 = true;
                break;
            }
            i12++;
        }
        return !z12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (a(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004b -> B:19:0x004e). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@Y61.k androidx.compose.ui.input.pointer.InterfaceC22325c r7, @Y61.k androidx.compose.ui.input.pointer.PointerEventPass r8, @Y61.k kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.C20440c1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.c1 r0 = (androidx.compose.foundation.gestures.C20440c1) r0
            int r1 = r0.f27593t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27593t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.c1 r0 = new androidx.compose.foundation.gestures.c1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27592s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27593t
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            androidx.compose.ui.input.pointer.PointerEventPass r7 = r0.f27591r
            androidx.compose.ui.input.pointer.c r8 = r0.f27590q
            kotlin.C42729a0.b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L4e
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.C42729a0.b(r9)
            boolean r9 = a(r7)
            if (r9 != 0) goto L6a
        L41:
            r0.f27590q = r7
            r0.f27591r = r8
            r0.f27593t = r3
            java.lang.Object r9 = r7.N1(r8, r0)
            if (r9 != r1) goto L4e
            return r1
        L4e:
            androidx.compose.ui.input.pointer.s r9 = (androidx.compose.ui.input.pointer.C22340s) r9
            java.lang.Object r9 = r9.f40278a
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
        L5a:
            if (r4 >= r2) goto L6a
            java.lang.Object r5 = r9.get(r4)
            androidx.compose.ui.input.pointer.C r5 = (androidx.compose.ui.input.pointer.C) r5
            boolean r5 = r5.f40119d
            if (r5 == 0) goto L67
            goto L41
        L67:
            int r4 = r4 + 1
            goto L5a
        L6a:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20444d1.b(androidx.compose.ui.input.pointer.c, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    @Y61.l
    public static final Object c(@Y61.k androidx.compose.ui.input.pointer.K k12, @Y61.k Y41.p<? super InterfaceC22325c, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objN0 = k12.N0(new a(continuation.getF411960f(), pVar, null), continuation);
        return objN0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN0 : kotlin.G0.f406611a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x004b, code lost:
    
        if (kotlin.G0.f406611a == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x004b, code lost:
    
        if (r11 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[Catch: CancellationException -> 0x004e, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x004e, blocks: (B:31:0x007d, B:34:0x0098, B:17:0x0048, B:22:0x0058), top: B:52:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.ui.input.pointer.K] */
    /* JADX WARN: Type inference failed for: r2v14, types: [androidx.compose.ui.input.pointer.K] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.K] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.K] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.ui.input.pointer.K] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r9v13, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Y61.l
    @kotlin.InterfaceC42830m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@Y61.k androidx.compose.ui.input.pointer.K r9, @Y61.k Y41.p<? super androidx.compose.ui.input.pointer.K, ? super kotlin.coroutines.Continuation<? super kotlin.G0>, ? extends java.lang.Object> r10, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r11) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20444d1.d(androidx.compose.ui.input.pointer.K, Y41.p, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
