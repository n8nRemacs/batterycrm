package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public final class Uh {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f379691a;

    /* renamed from: b, reason: collision with root package name */
    private final int f379692b;

    /* renamed from: c, reason: collision with root package name */
    private final int f379693c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f379694d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f379695e;

    public Uh(@Y61.k String str, int i12, int i13, boolean z12, boolean z13) {
        this.f379691a = str;
        this.f379692b = i12;
        this.f379693c = i13;
        this.f379694d = z12;
        this.f379695e = z13;
    }

    public final int a() {
        return this.f379693c;
    }

    public final int b() {
        return this.f379692b;
    }

    @Y61.k
    public final String c() {
        return this.f379691a;
    }

    public final boolean d() {
        return this.f379694d;
    }

    public final boolean e() {
        return this.f379695e;
    }

    public boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uh)) {
            return false;
        }
        Uh uh2 = (Uh) obj;
        return kotlin.jvm.internal.L.f(this.f379691a, uh2.f379691a) && this.f379692b == uh2.f379692b && this.f379693c == uh2.f379693c && this.f379694d == uh2.f379694d && this.f379695e == uh2.f379695e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f379691a;
        int iHashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f379692b) * 31) + this.f379693c) * 31;
        boolean z12 = this.f379694d;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int i13 = (iHashCode + i12) * 31;
        boolean z13 = this.f379695e;
        return i13 + (z13 ? 1 : z13 ? 1 : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EgressConfig(url=");
        sb2.append(this.f379691a);
        sb2.append(", repeatedDelay=");
        sb2.append(this.f379692b);
        sb2.append(", randomDelayWindow=");
        sb2.append(this.f379693c);
        sb2.append(", isBackgroundAllowed=");
        sb2.append(this.f379694d);
        sb2.append(", isDiagnosticsEnabled=");
        return androidx.appcompat.app.r.s(")", sb2, this.f379695e);
    }
}
