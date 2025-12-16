package androidx.work.impl.workers;

import androidx.work.G;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConstraintTrackingWorker.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f56082a = 0;

    static {
        G.b("ConstraintTrkngWrkr");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.work.impl.constraints.f r4, androidx.work.impl.model.H r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.work.impl.workers.f
            if (r0 == 0) goto L13
            r0 = r6
            androidx.work.impl.workers.f r0 = (androidx.work.impl.workers.f) r0
            int r1 = r0.f56080r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56080r = r1
            goto L18
        L13:
            androidx.work.impl.workers.f r0 = new androidx.work.impl.workers.f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f56079q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f56080r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L51
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.flow.i r4 = r4.b(r5)
            androidx.work.impl.workers.g r6 = new androidx.work.impl.workers.g
            r2 = 0
            r6.<init>(r5, r2)
            kotlinx.coroutines.flow.r1 r5 = new kotlinx.coroutines.flow.r1
            r5.<init>(r6, r4)
            androidx.work.impl.workers.e r4 = new androidx.work.impl.workers.e
            r4.<init>(r5)
            r0.f56080r = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.C43175k.y(r4, r0)
            if (r6 != r1) goto L51
            goto L59
        L51:
            androidx.work.impl.constraints.b$b r6 = (androidx.work.impl.constraints.b.C1953b) r6
            int r4 = r6.f55670a
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.h.a(androidx.work.impl.constraints.f, androidx.work.impl.model.H, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
