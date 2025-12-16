package com.avito.security;

/* loaded from: classes5.dex */
public final class x0 extends v0 {

    /* renamed from: f, reason: collision with root package name */
    public static final a f338635f = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final x0 f338634e = new x0(1, 0);

    public static final class a {
        private a() {
        }

        public final x0 a() {
            return x0.f338634e;
        }

        public /* synthetic */ a(d0 d0Var) {
            this();
        }
    }

    public x0(int i12, int i13) {
        super(i12, i13, 1);
    }

    @Override // com.avito.security.v0
    public boolean equals(Object obj) {
        if (obj instanceof x0) {
            if (!isEmpty() || !((x0) obj).isEmpty()) {
                x0 x0Var = (x0) obj;
                if (a() != x0Var.a() || b() != x0Var.b()) {
                }
            }
            return true;
        }
        return false;
    }

    public Integer f() {
        return Integer.valueOf(b());
    }

    public Integer g() {
        return Integer.valueOf(a());
    }

    @Override // com.avito.security.v0
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    @Override // com.avito.security.v0
    public boolean isEmpty() {
        return a() > b();
    }

    @Override // com.avito.security.v0
    public String toString() {
        return a() + ".." + b();
    }
}
