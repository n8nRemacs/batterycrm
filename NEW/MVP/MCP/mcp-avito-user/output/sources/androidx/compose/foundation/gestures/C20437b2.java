package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/unit/B;", "velocity", "<anonymous>", "(Landroidx/compose/ui/unit/B;)Landroidx/compose/ui/unit/B;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {748, 751, 754}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
/* renamed from: androidx.compose.foundation.gestures.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20437b2 extends SuspendLambda implements Y41.p<androidx.compose.ui.unit.B, Continuation<? super androidx.compose.ui.unit.B>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public long f27577q;

    /* renamed from: r, reason: collision with root package name */
    public int f27578r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ long f27579s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C20433a2 f27580t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20437b2(C20433a2 c20433a2, Continuation<? super C20437b2> continuation) {
        super(2, continuation);
        this.f27580t = c20433a2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C20437b2 c20437b2 = new C20437b2(this.f27580t, continuation);
        c20437b2.f27579s = ((androidx.compose.ui.unit.B) obj).f42837a;
        return c20437b2;
    }

    @Override // Y41.p
    public final Object invoke(androidx.compose.ui.unit.B b12, Continuation<? super androidx.compose.ui.unit.B> continuation) {
        return ((C20437b2) create(androidx.compose.ui.unit.B.a(b12.f42837a), continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r11.f27578r
            r1 = 3
            r2 = 2
            r3 = 1
            androidx.compose.foundation.gestures.a2 r4 = r11.f27580t
            if (r0 == 0) goto L35
            if (r0 == r3) goto L2e
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1d
            long r0 = r11.f27577q
            long r2 = r11.f27579s
            kotlin.C42729a0.b(r12)
            r9 = r0
            r0 = r12
            goto L78
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L25:
            long r2 = r11.f27577q
            long r7 = r11.f27579s
            kotlin.C42729a0.b(r12)
            r0 = r12
            goto L5d
        L2e:
            long r7 = r11.f27579s
            kotlin.C42729a0.b(r12)
            r0 = r12
            goto L47
        L35:
            kotlin.C42729a0.b(r12)
            long r7 = r11.f27579s
            androidx.compose.ui.input.nestedscroll.b r0 = r4.f27553f
            r11.f27579s = r7
            r11.f27578r = r3
            java.lang.Object r0 = r0.c(r7, r11)
            if (r0 != r6) goto L47
            return r6
        L47:
            androidx.compose.ui.unit.B r0 = (androidx.compose.ui.unit.B) r0
            long r9 = r0.f42837a
            long r9 = androidx.compose.ui.unit.B.e(r7, r9)
            r11.f27579s = r7
            r11.f27577q = r9
            r11.f27578r = r2
            java.lang.Object r0 = r4.b(r9, r11)
            if (r0 != r6) goto L5c
            return r6
        L5c:
            r2 = r9
        L5d:
            androidx.compose.ui.unit.B r0 = (androidx.compose.ui.unit.B) r0
            long r9 = r0.f42837a
            androidx.compose.ui.input.nestedscroll.b r0 = r4.f27553f
            long r2 = androidx.compose.ui.unit.B.e(r2, r9)
            r11.f27579s = r7
            r11.f27577q = r9
            r11.f27578r = r1
            r1 = r2
            r3 = r9
            r5 = r11
            java.lang.Object r0 = r0.a(r1, r3, r5)
            if (r0 != r6) goto L77
            return r6
        L77:
            r2 = r7
        L78:
            androidx.compose.ui.unit.B r0 = (androidx.compose.ui.unit.B) r0
            long r0 = r0.f42837a
            long r0 = androidx.compose.ui.unit.B.e(r9, r0)
            long r0 = androidx.compose.ui.unit.B.e(r2, r0)
            androidx.compose.ui.unit.B r0 = androidx.compose.ui.unit.B.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20437b2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
