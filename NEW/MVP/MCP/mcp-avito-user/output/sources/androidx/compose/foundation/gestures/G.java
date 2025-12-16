package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C20327w;
import kotlin.Metadata;
import l0.g;

/* compiled from: TransformableState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/gestures/G;", "Landroidx/compose/animation/core/H1;", "Landroidx/compose/foundation/gestures/F;", "Landroidx/compose/animation/core/w;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class G implements androidx.compose.animation.core.H1<F, C20327w> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27245a = 0;

    /* compiled from: TransformableState.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/w;", "it", "Landroidx/compose/foundation/gestures/F;", "invoke", "(Landroidx/compose/animation/core/w;)Landroidx/compose/foundation/gestures/F;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C20327w, F> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f27246l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final F invoke(C20327w c20327w) {
            C20327w c20327w2 = c20327w;
            float f12 = c20327w2.f26424a;
            float f13 = c20327w2.f26425b;
            float f14 = c20327w2.f26426c;
            long jFloatToRawIntBits = Float.floatToRawIntBits(f13);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f14);
            g.a aVar = l0.g.f413384b;
            return new F(f12, (jFloatToRawIntBits << 32) | (4294967295L & jFloatToRawIntBits2), c20327w2.f26427d, null);
        }
    }

    /* compiled from: TransformableState.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/F;", "it", "Landroidx/compose/animation/core/w;", "invoke", "(Landroidx/compose/foundation/gestures/F;)Landroidx/compose/animation/core/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<F, C20327w> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f27247l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final C20327w invoke(F f12) {
            F f13 = f12;
            float f14 = f13.f27234a;
            long j12 = f13.f27235b;
            return new C20327w(f14, Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)), f13.f27236c);
        }
    }

    static {
        new G();
    }

    @Override // androidx.compose.animation.core.H1
    @Y61.k
    public final Y41.l<F, C20327w> a() {
        return b.f27247l;
    }

    @Override // androidx.compose.animation.core.H1
    @Y61.k
    public final Y41.l<C20327w, F> b() {
        return a.f27246l;
    }
}
