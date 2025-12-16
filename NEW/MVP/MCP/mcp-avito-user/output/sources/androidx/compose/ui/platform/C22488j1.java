package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.channels.InterfaceC43125y;

/* compiled from: GlobalSnapshotManager.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", i = {0}, l = {67}, m = "invokeSuspend", n = {"$this$consume$iv$iv"}, s = {"L$0"})
/* renamed from: androidx.compose.ui.platform.j1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22488j1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.channels.K0 f41479q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43125y f41480r;

    /* renamed from: s, reason: collision with root package name */
    public int f41481s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C43108m f41482t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22488j1(C43108m c43108m, Continuation continuation) {
        super(2, continuation);
        this.f41482t = c43108m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C22488j1(this.f41482t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C22488j1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x000f, B:17:0x0034, B:19:0x003c, B:14:0x0027, B:20:0x0051, B:13:0x0022), top: B:27:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x000f, B:17:0x0034, B:19:0x003c, B:14:0x0027, B:20:0x0051, B:13:0x0022), top: B:27:0x0007 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0031 -> B:17:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f41481s
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            kotlinx.coroutines.channels.y r1 = r5.f41480r
            kotlinx.coroutines.channels.K0 r3 = r5.f41479q
            kotlin.C42729a0.b(r6)     // Catch: java.lang.Throwable -> L13
            goto L34
        L13:
            r6 = move-exception
            goto L5a
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.channels.m r3 = r5.f41482t
            kotlinx.coroutines.channels.y r6 = r3.iterator()     // Catch: java.lang.Throwable -> L13
            r1 = r6
        L27:
            r5.f41479q = r3     // Catch: java.lang.Throwable -> L13
            r5.f41480r = r1     // Catch: java.lang.Throwable -> L13
            r5.f41481s = r2     // Catch: java.lang.Throwable -> L13
            java.lang.Object r6 = r1.a(r5)     // Catch: java.lang.Throwable -> L13
            if (r6 != r0) goto L34
            return r0
        L34:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L13
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L13
            if (r6 == 0) goto L51
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L13
            kotlin.G0 r6 = (kotlin.G0) r6     // Catch: java.lang.Throwable -> L13
            java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.C22496l1.f41490c     // Catch: java.lang.Throwable -> L13
            r4 = 0
            r6.set(r4)     // Catch: java.lang.Throwable -> L13
            androidx.compose.runtime.snapshots.l$a r6 = androidx.compose.runtime.snapshots.AbstractC22167l.f38720e     // Catch: java.lang.Throwable -> L13
            r6.getClass()     // Catch: java.lang.Throwable -> L13
            androidx.compose.runtime.snapshots.AbstractC22167l.a.f()     // Catch: java.lang.Throwable -> L13
            goto L27
        L51:
            kotlin.G0 r6 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L13
            r6 = 0
            r3.c(r6)
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        L5a:
            throw r6     // Catch: java.lang.Throwable -> L5b
        L5b:
            r0 = move-exception
            kotlinx.coroutines.channels.D.a(r3, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C22488j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
