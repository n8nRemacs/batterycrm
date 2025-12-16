package androidx.compose.ui.layout;

import androidx.compose.runtime.F3;
import kotlin.Metadata;

/* compiled from: ContentScale.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/n;", "", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC22374n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f40491a = a.f40492a;

    /* compiled from: ContentScale.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/layout/n$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.n$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f40492a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C1667a f40493b = new C1667a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final e f40494c = new e();

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final c f40495d = new c();

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final d f40496e = new d();

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final f f40497f = new f();

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final r f40498g = new r();

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public static final b f40499h = new b();

        /* compiled from: ContentScale.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/layout/n$a$a", "Landroidx/compose/ui/layout/n;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.layout.n$a$a, reason: collision with other inner class name */
        public static final class C1667a implements InterfaceC22374n {
            @Override // androidx.compose.ui.layout.InterfaceC22374n
            public final long a(long j12, long j13) {
                float fMax = Math.max(Float.intBitsToFloat((int) (j13 >> 32)) / Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j13 & 4294967295L)) / Float.intBitsToFloat((int) (j12 & 4294967295L)));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax) & 4294967295L);
                int i12 = S0.f40400b;
                return jFloatToRawIntBits;
            }
        }

        /* compiled from: ContentScale.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/layout/n$a$b", "Landroidx/compose/ui/layout/n;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.layout.n$a$b */
        public static final class b implements InterfaceC22374n {
            @Override // androidx.compose.ui.layout.InterfaceC22374n
            public final long a(long j12, long j13) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) / Float.intBitsToFloat((int) (j12 >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j13 & 4294967295L)) / Float.intBitsToFloat((int) (j12 & 4294967295L));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
                int i12 = S0.f40400b;
                return jFloatToRawIntBits;
            }
        }

        /* compiled from: ContentScale.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/layout/n$a$c", "Landroidx/compose/ui/layout/n;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.layout.n$a$c */
        public static final class c implements InterfaceC22374n {
            @Override // androidx.compose.ui.layout.InterfaceC22374n
            public final long a(long j12, long j13) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 & 4294967295L)) / Float.intBitsToFloat((int) (j12 & 4294967295L));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
                int i12 = S0.f40400b;
                return jFloatToRawIntBits;
            }
        }

        /* compiled from: ContentScale.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/layout/n$a$d", "Landroidx/compose/ui/layout/n;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.layout.n$a$d */
        public static final class d implements InterfaceC22374n {
            @Override // androidx.compose.ui.layout.InterfaceC22374n
            public final long a(long j12, long j13) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) / Float.intBitsToFloat((int) (j12 >> 32));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
                int i12 = S0.f40400b;
                return jFloatToRawIntBits;
            }
        }

        /* compiled from: ContentScale.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/layout/n$a$e", "Landroidx/compose/ui/layout/n;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.layout.n$a$e */
        public static final class e implements InterfaceC22374n {
            @Override // androidx.compose.ui.layout.InterfaceC22374n
            public final long a(long j12, long j13) {
                float fA2 = C22376o.a(j12, j13);
                long jFloatToRawIntBits = (Float.floatToRawIntBits(fA2) << 32) | (4294967295L & Float.floatToRawIntBits(fA2));
                int i12 = S0.f40400b;
                return jFloatToRawIntBits;
            }
        }

        /* compiled from: ContentScale.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/layout/n$a$f", "Landroidx/compose/ui/layout/n;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.layout.n$a$f */
        public static final class f implements InterfaceC22374n {
            @Override // androidx.compose.ui.layout.InterfaceC22374n
            public final long a(long j12, long j13) {
                if (Float.intBitsToFloat((int) (j12 >> 32)) <= Float.intBitsToFloat((int) (j13 >> 32)) && Float.intBitsToFloat((int) (j12 & 4294967295L)) <= Float.intBitsToFloat((int) (j13 & 4294967295L))) {
                    long jFloatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i12 = S0.f40400b;
                    return jFloatToRawIntBits;
                }
                float fA2 = C22376o.a(j12, j13);
                long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fA2) << 32) | (Float.floatToRawIntBits(fA2) & 4294967295L);
                int i13 = S0.f40400b;
                return jFloatToRawIntBits2;
            }
        }
    }

    long a(long j12, long j13);
}
