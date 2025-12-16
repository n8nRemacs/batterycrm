package z21;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OverflowItemStrategy.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lz21/e;", "", "a", "b", "c", "Lz21/e$a;", "Lz21/e$c;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final b f443813b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f443814a;

    /* compiled from: OverflowItemStrategy.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz21/e$a;", "Lz21/e;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends e {

        /* renamed from: c, reason: collision with root package name */
        public final int f443815c;

        /* renamed from: d, reason: collision with root package name */
        public final int f443816d;

        public a(int i12, int i13) {
            super(i13, null);
            this.f443815c = i12;
            this.f443816d = i13;
        }

        @Override // z21.e
        public final int a() {
            if (this.f443814a <= 0) {
                return -1;
            }
            return Math.min(this.f443815c + 1, this.f443816d - 1);
        }

        @Override // z21.e
        public final int b() {
            if (this.f443814a <= 0) {
                return -1;
            }
            return Math.max(0, this.f443815c - 1);
        }
    }

    /* compiled from: OverflowItemStrategy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz21/e$b;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: OverflowItemStrategy.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz21/e$c;", "Lz21/e;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c extends e {

        /* renamed from: c, reason: collision with root package name */
        public final int f443817c;

        /* renamed from: d, reason: collision with root package name */
        public final int f443818d;

        public c(int i12, int i13) {
            super(i13, null);
            this.f443817c = i12;
            this.f443818d = i13;
        }

        @Override // z21.e
        public final int a() {
            if (this.f443814a <= 0) {
                return -1;
            }
            return (this.f443817c + 1) % this.f443818d;
        }

        @Override // z21.e
        public final int b() {
            if (this.f443814a <= 0) {
                return -1;
            }
            int i12 = this.f443817c - 1;
            int i13 = this.f443818d;
            return (i12 + i13) % i13;
        }
    }

    public e(int i12, C42822w c42822w) {
        this.f443814a = i12;
    }

    public abstract int a();

    public abstract int b();
}
