package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.x2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39232x2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f382159a;

    public C39232x2() {
        this(new com.yandex.metrica.coreutils.services.e());
    }

    private boolean a(long j12, long j13, long j14) {
        return j12 < j13 || j12 - j13 >= j14;
    }

    public boolean b(long j12, long j13, @j.N String str) {
        return a(this.f382159a.c(), j12, j13);
    }

    @j.k0
    public C39232x2(@j.N com.yandex.metrica.coreutils.services.f fVar) {
        this.f382159a = fVar;
    }

    public boolean a(long j12, long j13, @j.N String str) {
        return a(this.f382159a.b(), j12, j13);
    }
}
