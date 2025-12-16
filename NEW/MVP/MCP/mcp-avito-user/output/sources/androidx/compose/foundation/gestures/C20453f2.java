package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC22325c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: TapGestureDetector.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/ui/input/pointer/C;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)Landroidx/compose/ui/input/pointer/C;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", i = {0, 0}, l = {227}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull", "minUptime"}, s = {"L$0", "J$0"})
/* renamed from: androidx.compose.foundation.gestures.f2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20453f2 extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super androidx.compose.ui.input.pointer.C>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public long f27703q;

    /* renamed from: r, reason: collision with root package name */
    public int f27704r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27705s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.input.pointer.C f27706t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20453f2(androidx.compose.ui.input.pointer.C c12, Continuation<? super C20453f2> continuation) {
        super(2, continuation);
        this.f27706t = c12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C20453f2 c20453f2 = new C20453f2(this.f27706t, continuation);
        c20453f2.f27705s = obj;
        return c20453f2;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super androidx.compose.ui.input.pointer.C> continuation) {
        return ((C20453f2) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003e -> B:12:0x0041). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f27704r
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            long r3 = r7.f27703q
            java.lang.Object r1 = r7.f27705s
            androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r1
            kotlin.C42729a0.b(r8)
            goto L41
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f27705s
            androidx.compose.ui.input.pointer.c r8 = (androidx.compose.ui.input.pointer.InterfaceC22325c) r8
            androidx.compose.ui.input.pointer.C r1 = r7.f27706t
            androidx.compose.ui.platform.x2 r3 = r8.getViewConfiguration()
            r3.getClass()
            r3 = 40
            long r5 = r1.f40117b
            long r3 = r3 + r5
            r1 = r8
        L33:
            r7.f27705s = r1
            r7.f27703q = r3
            r7.f27704r = r2
            r8 = 3
            java.lang.Object r8 = androidx.compose.foundation.gestures.C20445d2.c(r1, r7, r8)
            if (r8 != r0) goto L41
            return r0
        L41:
            androidx.compose.ui.input.pointer.C r8 = (androidx.compose.ui.input.pointer.C) r8
            long r5 = r8.f40117b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L33
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20453f2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
