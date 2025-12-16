package com.avito.security;

/* loaded from: classes5.dex */
public class v0 implements Iterable<Integer> {

    /* renamed from: d, reason: collision with root package name */
    public static final a f338625d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f338626a;

    /* renamed from: b, reason: collision with root package name */
    private final int f338627b;

    /* renamed from: c, reason: collision with root package name */
    private final int f338628c;

    public static final class a {
        private a() {
        }

        public final v0 a(int i12, int i13, int i14) {
            return new v0(i12, i13, i14);
        }

        public /* synthetic */ a(d0 d0Var) {
            this();
        }
    }

    public v0(int i12, int i13, int i14) {
        if (i14 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i14 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f338626a = i12;
        this.f338627b = p1.b(i12, i13, i14);
        this.f338628c = i14;
    }

    public final int a() {
        return this.f338626a;
    }

    public final int b() {
        return this.f338627b;
    }

    public final int c() {
        return this.f338628c;
    }

    @Override // java.lang.Iterable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public u0 iterator() {
        return new w0(this.f338626a, this.f338627b, this.f338628c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof v0) {
            if (!isEmpty() || !((v0) obj).isEmpty()) {
                v0 v0Var = (v0) obj;
                if (this.f338626a != v0Var.f338626a || this.f338627b != v0Var.f338627b || this.f338628c != v0Var.f338628c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f338626a * 31) + this.f338627b) * 31) + this.f338628c;
    }

    public boolean isEmpty() {
        return this.f338628c <= 0 ? this.f338626a < this.f338627b : this.f338626a > this.f338627b;
    }

    public String toString() {
        StringBuilder sb2;
        int i12;
        if (this.f338628c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f338626a);
            sb2.append("..");
            sb2.append(this.f338627b);
            sb2.append(" step ");
            i12 = this.f338628c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f338626a);
            sb2.append(" downTo ");
            sb2.append(this.f338627b);
            sb2.append(" step ");
            i12 = -this.f338628c;
        }
        sb2.append(i12);
        return sb2.toString();
    }
}
