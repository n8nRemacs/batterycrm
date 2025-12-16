package androidx.compose.ui.scrollcapture;

import Y41.p;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/scrollcapture/i;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f41705a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p<Float, Continuation<? super Float>, Object> f41706b;

    /* renamed from: c, reason: collision with root package name */
    public float f41707c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(int i12, @Y61.k p<? super Float, ? super Continuation<? super Float>, ? extends Object> pVar) {
        this.f41705a = i12;
        this.f41706b = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(float r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.scrollcapture.h
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.scrollcapture.h r0 = (androidx.compose.ui.scrollcapture.h) r0
            int r1 = r0.f41704t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41704t = r1
            goto L18
        L13:
            androidx.compose.ui.scrollcapture.h r0 = new androidx.compose.ui.scrollcapture.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f41702r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f41704t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f41701q
            androidx.compose.ui.scrollcapture.i r5 = (androidx.compose.ui.scrollcapture.i) r5
            kotlin.C42729a0.b(r6)
            goto L4c
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r5)
            r0.f41701q = r4
            r0.f41704t = r3
            Y41.p<java.lang.Float, kotlin.coroutines.Continuation<? super java.lang.Float>, java.lang.Object> r6 = r4.f41706b
            androidx.compose.ui.scrollcapture.d r6 = (androidx.compose.ui.scrollcapture.d) r6
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r5 = r4
        L4c:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.f41707c
            float r0 = r0 + r6
            r5.f41707c = r0
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.scrollcapture.i.a(float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
