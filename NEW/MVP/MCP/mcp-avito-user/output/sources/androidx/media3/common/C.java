package androidx.media3.common;

/* compiled from: MediaPeriodId.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    public final Object f47212a;

    /* renamed from: b, reason: collision with root package name */
    public final int f47213b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47214c;

    /* renamed from: d, reason: collision with root package name */
    public final long f47215d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47216e;

    public C(Object obj) {
        this(obj, -1L);
    }

    public final boolean a() {
        return this.f47213b != -1;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c12 = (C) obj;
        return this.f47212a.equals(c12.f47212a) && this.f47213b == c12.f47213b && this.f47214c == c12.f47214c && this.f47215d == c12.f47215d && this.f47216e == c12.f47216e;
    }

    public final int hashCode() {
        return ((((((C23088b.a(527, 31, this.f47212a) + this.f47213b) * 31) + this.f47214c) * 31) + ((int) this.f47215d)) * 31) + this.f47216e;
    }

    public C(Object obj, long j12) {
        this(obj, -1, -1, j12, -1);
    }

    public C(C c12) {
        this.f47212a = c12.f47212a;
        this.f47213b = c12.f47213b;
        this.f47214c = c12.f47214c;
        this.f47215d = c12.f47215d;
        this.f47216e = c12.f47216e;
    }

    public C(Object obj, int i12, int i13, long j12, int i14) {
        this.f47212a = obj;
        this.f47213b = i12;
        this.f47214c = i13;
        this.f47215d = j12;
        this.f47216e = i14;
    }
}
