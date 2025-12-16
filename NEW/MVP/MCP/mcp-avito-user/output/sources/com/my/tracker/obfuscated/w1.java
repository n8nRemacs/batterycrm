package com.my.tracker.obfuscated;

/* loaded from: classes7.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f365849a;

    /* renamed from: b, reason: collision with root package name */
    private final String f365850b;

    /* renamed from: c, reason: collision with root package name */
    private final j1 f365851c;

    /* renamed from: d, reason: collision with root package name */
    private final j1[] f365852d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC37842p[] f365853e;

    public w1(long j12, j1 j1Var, String str, j1[] j1VarArr, InterfaceC37842p[] interfaceC37842pArr) {
        this.f365849a = j12;
        this.f365851c = j1Var;
        this.f365850b = str;
        this.f365852d = j1VarArr;
        this.f365853e = interfaceC37842pArr;
    }

    public j1 a() {
        return this.f365851c;
    }

    public InterfaceC37842p[] b() {
        return this.f365853e;
    }

    public String c() {
        return this.f365850b;
    }

    public long d() {
        return this.f365849a;
    }

    public j1[] e() {
        return this.f365852d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f365851c != null) {
            sb2.append("|-----\n| ");
            sb2.append(this.f365851c);
            sb2.append("\n");
        }
        j1[] j1VarArr = this.f365852d;
        if (j1VarArr != null && j1VarArr.length > 0) {
            sb2.append("|-----\n");
            for (j1 j1Var : this.f365852d) {
                sb2.append("| ");
                sb2.append(j1Var);
                sb2.append("\n");
            }
        }
        StringBuilder sb3 = new StringBuilder();
        InterfaceC37842p[] interfaceC37842pArr = this.f365853e;
        if (interfaceC37842pArr != null && interfaceC37842pArr.length > 0) {
            sb3.append("|-----\n");
            for (InterfaceC37842p interfaceC37842p : this.f365853e) {
                sb3.append("| ");
                sb3.append(interfaceC37842p);
                sb3.append("\n");
            }
        }
        return "[TimeSpentTickDTO]\n| timestamp = " + this.f365849a + "\n| customUserId = " + this.f365850b + "\n" + ((Object) sb2) + ((Object) sb3) + "[/TimeSpentTickDTO]\n";
    }
}
