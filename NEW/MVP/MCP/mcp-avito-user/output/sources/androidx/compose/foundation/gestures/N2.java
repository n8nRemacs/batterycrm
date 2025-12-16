package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C20318t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UpdatableAnimationState.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/N2;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class N2 {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f27384f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final C20318t f27385g = new C20318t(0.0f);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.animation.core.K1<C20318t> f27386a;

    /* renamed from: b, reason: collision with root package name */
    public long f27387b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public C20318t f27388c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27389d;

    /* renamed from: e, reason: collision with root package name */
    public float f27390e;

    /* compiled from: UpdatableAnimationState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/gestures/N2$a;", "", "<init>", "()V", "", "VisibilityThreshold", "F", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public N2(@Y61.k androidx.compose.animation.core.R0 r02) {
        int i12 = kotlin.jvm.internal.A.f406820a;
        this.f27386a = r02.a(androidx.compose.animation.core.J1.f26075a);
        this.f27387b = Long.MIN_VALUE;
        this.f27388c = f27385g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f A[Catch: all -> 0x010b, PHI: r0 r2 r4 r12 r13
  0x008f: PHI (r0v20 Y41.l) = (r0v10 Y41.l), (r0v21 Y41.l) binds: [B:31:0x0086, B:40:0x00d0] A[DONT_GENERATE, DONT_INLINE]
  0x008f: PHI (r2v8 Y41.a) = (r2v5 Y41.a), (r2v9 Y41.a) binds: [B:31:0x0086, B:40:0x00d0] A[DONT_GENERATE, DONT_INLINE]
  0x008f: PHI (r4v5 androidx.compose.foundation.gestures.N2) = (r4v2 androidx.compose.foundation.gestures.N2), (r4v6 androidx.compose.foundation.gestures.N2) binds: [B:31:0x0086, B:40:0x00d0] A[DONT_GENERATE, DONT_INLINE]
  0x008f: PHI (r12v2 androidx.compose.foundation.gestures.O2) = (r12v0 androidx.compose.foundation.gestures.O2), (r12v3 androidx.compose.foundation.gestures.O2) binds: [B:31:0x0086, B:40:0x00d0] A[DONT_GENERATE, DONT_INLINE]
  0x008f: PHI (r13v1 float) = (r13v0 float), (r13v2 float) binds: [B:31:0x0086, B:40:0x00d0] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x010b, blocks: (B:38:0x00cb, B:32:0x008f, B:35:0x00a7), top: B:58:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[Catch: all -> 0x010b, TryCatch #1 {all -> 0x010b, blocks: (B:38:0x00cb, B:32:0x008f, B:35:0x00a7), top: B:58:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de A[Catch: all -> 0x003d, TryCatch #2 {all -> 0x003d, blocks: (B:13:0x0038, B:49:0x00ff, B:42:0x00d3, B:45:0x00de), top: B:60:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c8 -> B:58:0x00cb). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k Y41.l r18, @Y61.k Y41.a r19, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.N2.a(Y41.l, Y41.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
