package androidx.compose.ui.graphics;

import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: Path.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "a", "Direction", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Path {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Path.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/Path$Direction;", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Direction {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Direction[] f39304b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f39305c;

        static {
            Direction[] directionArr = {new Direction("CounterClockwise", 0), new Direction("Clockwise", 1)};
            f39304b = directionArr;
            f39305c = kotlin.enums.c.a(directionArr);
        }

        public Direction() {
            throw null;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f39304b.clone();
        }
    }

    /* compiled from: Path.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/Path$a;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f39306a = 0;

        static {
            new a();
        }
    }

    /* compiled from: Path.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    static {
        int i12 = a.f39306a;
    }

    static /* synthetic */ void b(Path path, l0.l lVar) {
        Direction[] directionArr = Direction.f39304b;
        path.c(lVar);
    }

    static /* synthetic */ void q(Path path, l0.j jVar) {
        Direction[] directionArr = Direction.f39304b;
        path.a(jVar);
    }

    static void t(C22277p c22277p, Path path) {
        l0.g.f413384b.getClass();
        c22277p.v(path, 0L);
    }

    void a(@Y61.k l0.j jVar);

    void c(@Y61.k l0.l lVar);

    void close();

    @InterfaceC42830m
    void d(float f12, float f13, float f14, float f15);

    void e(long j12);

    default void f(float f12, float f13, float f14, float f15) {
        d(f12, f13, f14, f15);
    }

    @InterfaceC42830m
    /* synthetic */ void g(l0.l lVar);

    int h();

    void i(float f12, float f13);

    boolean j();

    @InterfaceC42830m
    void k(float f12, float f13, float f14, float f15);

    void l(int i12);

    void m(float f12, float f13, float f14, float f15, float f16, float f17);

    void n(float f12, float f13);

    void o(float f12, float f13);

    void p(float f12, float f13, float f14, float f15, float f16, float f17);

    void r(float f12, float f13);

    void reset();

    default void rewind() {
        reset();
    }

    default void s(float f12, float f13, float f14, float f15) {
        k(f12, f13, f14, f15);
    }

    boolean u(@Y61.k Path path, @Y61.k Path path2, int i12);
}
