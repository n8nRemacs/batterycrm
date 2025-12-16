package com.my.tracker.obfuscated;

/* loaded from: classes7.dex */
public final class k1 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f365685a;

    /* renamed from: b, reason: collision with root package name */
    private long f365686b;

    /* renamed from: c, reason: collision with root package name */
    private long f365687c;

    public k1(int i12) {
        this(i12, 0L, 0L);
    }

    @Override // com.my.tracker.obfuscated.t1
    public int a() {
        return this.f365685a;
    }

    @Override // com.my.tracker.obfuscated.i1, com.my.tracker.obfuscated.j1
    public long b() {
        return this.f365687c;
    }

    @Override // com.my.tracker.obfuscated.i1, com.my.tracker.obfuscated.j1
    public long c() {
        return this.f365686b;
    }

    @Override // com.my.tracker.obfuscated.i1
    public void h() {
        this.f365686b = 0L;
        this.f365687c = 0L;
    }

    @Override // com.my.tracker.obfuscated.i1
    /* renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public k1 f() {
        try {
            k1 k1Var = (k1) super.clone();
            k1Var.h();
            k1Var.a(this.f365687c);
            k1Var.c(this.f365686b);
            return k1Var;
        } catch (CloneNotSupportedException unused) {
            return new k1(this.f365685a, this.f365686b, this.f365687c);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2;
        String strJ = AK.c.j(this.f365686b + this.f365687c, " ms : ", new StringBuilder("total time = "));
        String str2 = "foreground = " + this.f365686b;
        if (this.f365685a == 0) {
            str = "[App Time   TS] id = " + this.f365685a;
            sb2 = new StringBuilder("useful background = ");
        } else {
            str = "[Time Based TS] id = " + this.f365685a;
            sb2 = new StringBuilder("background = ");
        }
        sb2.append(this.f365687c);
        return str + ", " + strJ + str2 + ", " + sb2.toString();
    }

    public k1(int i12, long j12, long j13) {
        this.f365685a = i12;
        this.f365686b = j12;
        this.f365687c = j13;
    }

    @Override // com.my.tracker.obfuscated.i1
    public void a(long j12) {
        this.f365687c += j12;
    }

    @Override // com.my.tracker.obfuscated.i1
    public void c(long j12) {
        this.f365686b += j12;
    }
}
