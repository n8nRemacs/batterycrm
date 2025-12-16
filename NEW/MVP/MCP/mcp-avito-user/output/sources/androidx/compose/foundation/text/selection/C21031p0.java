package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C20321u;
import androidx.compose.animation.core.H1;
import androidx.compose.animation.core.J1;
import kotlin.Metadata;
import l0.g;

/* compiled from: SelectionMagnifier.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Ll0/g;", "animatedCenter", "targetValue", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21031p0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C20321u f32100a = new C20321u(Float.NaN, Float.NaN);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final H1<l0.g, C20321u> f32101b = J1.a(a.f32104l, b.f32105l);

    /* renamed from: c, reason: collision with root package name */
    public static final long f32102c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.R0<l0.g> f32103d;

    /* compiled from: SelectionMagnifier.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "it", "Landroidx/compose/animation/core/u;", "invoke-k-4lQ0M", "(J)Landroidx/compose/animation/core/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.selection.p0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<l0.g, C20321u> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f32104l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final C20321u invoke(l0.g gVar) {
            long j12 = gVar.f413387a;
            return (9223372034707292159L & j12) != 9205357640488583168L ? new C20321u(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L))) : C21031p0.f32100a;
        }
    }

    /* compiled from: SelectionMagnifier.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/u;", "it", "Ll0/g;", "invoke-tuRUvjQ", "(Landroidx/compose/animation/core/u;)J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.selection.p0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<C20321u, l0.g> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f32105l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final l0.g invoke(C20321u c20321u) {
            C20321u c20321u2 = c20321u;
            float f12 = c20321u2.f26407a;
            float f13 = c20321u2.f26408b;
            return l0.g.a((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
        }
    }

    static {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        f32102c = jFloatToRawIntBits;
        f32103d = new androidx.compose.animation.core.R0<>(0.0f, 0.0f, l0.g.a(jFloatToRawIntBits), 3, null);
    }
}
