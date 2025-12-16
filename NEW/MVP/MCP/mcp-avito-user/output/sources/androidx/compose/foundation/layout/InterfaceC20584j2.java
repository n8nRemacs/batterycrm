package androidx.compose.foundation.layout;

import android.graphics.Insets;
import kotlin.Metadata;
import l0.g;

/* compiled from: WindowInsetsConnection.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bc\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/j2;", "", "a", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* renamed from: androidx.compose.foundation.layout.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
interface InterfaceC20584j2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f28653a = a.f28654a;

    default float a(float f12, float f13) {
        return kotlin.ranges.s.c(f(f12, f13), 0.0f);
    }

    @Y61.k
    Insets b(@Y61.k Insets insets, int i12);

    int c(@Y61.k Insets insets);

    default float d(float f12, float f13) {
        return kotlin.ranges.s.a(f(f12, f13), 0.0f);
    }

    long e(long j12);

    float f(float f12, float f13);

    long g(long j12, float f12);

    /* compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/j2$a;", "", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.j2$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f28654a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f28655b = new b();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final d f28656c = new d();

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final c f28657d = new c();

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final C1587a f28658e = new C1587a();

        /* compiled from: WindowInsetsConnection.android.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/layout/j2$a$a", "Landroidx/compose/foundation/layout/j2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.j2$a$a, reason: collision with other inner class name */
        public static final class C1587a implements InterfaceC20584j2 {
            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final Insets b(Insets insets, int i12) {
                return Insets.of(insets.left, insets.top, insets.right, i12);
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final int c(Insets insets) {
                return insets.bottom;
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final long e(long j12) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 & 4294967295L));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                g.a aVar = l0.g.f413384b;
                return jFloatToRawIntBits;
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final float f(float f12, float f13) {
                return -f13;
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final long g(long j12, float f12) {
                return androidx.compose.ui.unit.C.a(0.0f, androidx.compose.ui.unit.B.d(j12) + f12);
            }
        }

        /* compiled from: WindowInsetsConnection.android.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/layout/j2$a$c", "Landroidx/compose/foundation/layout/j2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.j2$a$c */
        public static final class c implements InterfaceC20584j2 {
            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final Insets b(Insets insets, int i12) {
                return Insets.of(insets.left, insets.top, i12, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final int c(Insets insets) {
                return insets.right;
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final long e(long j12) {
                long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j12 >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
                g.a aVar = l0.g.f413384b;
                return jFloatToRawIntBits;
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final float f(float f12, float f13) {
                return -f12;
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final long g(long j12, float f12) {
                return androidx.compose.ui.unit.C.a(androidx.compose.ui.unit.B.c(j12) + f12, 0.0f);
            }
        }

        /* compiled from: WindowInsetsConnection.android.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/layout/j2$a$b", "Landroidx/compose/foundation/layout/j2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.j2$a$b */
        public static final class b implements InterfaceC20584j2 {
            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final Insets b(Insets insets, int i12) {
                return Insets.of(i12, insets.top, insets.right, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final int c(Insets insets) {
                return insets.left;
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final long e(long j12) {
                long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j12 >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
                g.a aVar = l0.g.f413384b;
                return jFloatToRawIntBits;
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final long g(long j12, float f12) {
                return androidx.compose.ui.unit.C.a(androidx.compose.ui.unit.B.c(j12) - f12, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final float f(float f12, float f13) {
                return f12;
            }
        }

        /* compiled from: WindowInsetsConnection.android.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/layout/j2$a$d", "Landroidx/compose/foundation/layout/j2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.layout.j2$a$d */
        public static final class d implements InterfaceC20584j2 {
            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final Insets b(Insets insets, int i12) {
                return Insets.of(insets.left, i12, insets.right, insets.bottom);
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final int c(Insets insets) {
                return insets.top;
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final long e(long j12) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 & 4294967295L));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
                g.a aVar = l0.g.f413384b;
                return jFloatToRawIntBits;
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final long g(long j12, float f12) {
                return androidx.compose.ui.unit.C.a(0.0f, androidx.compose.ui.unit.B.d(j12) - f12);
            }

            @Override // androidx.compose.foundation.layout.InterfaceC20584j2
            public final float f(float f12, float f13) {
                return f13;
            }
        }
    }
}
