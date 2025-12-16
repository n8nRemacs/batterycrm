package com.my.tracker.obfuscated;

/* renamed from: com.my.tracker.obfuscated.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37843q implements InterfaceC37841o {

    /* renamed from: a, reason: collision with root package name */
    private final int f365734a;

    /* renamed from: b, reason: collision with root package name */
    private int f365735b;

    public C37843q(int i12) {
        this.f365734a = i12;
        h();
    }

    @Override // com.my.tracker.obfuscated.t1
    public int a() {
        return this.f365734a;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC37841o, com.my.tracker.obfuscated.InterfaceC37842p
    public int d() {
        return this.f365735b;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC37841o
    public void g() {
        this.f365735b++;
    }

    public void h() {
        this.f365735b = 0;
    }

    public String toString() {
        return "[CountBased TS] id = " + this.f365734a + ", count = " + this.f365735b;
    }
}
