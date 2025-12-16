package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.si, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39128si {

    /* renamed from: a, reason: collision with root package name */
    private final int f381842a;

    public C39128si(int i12) {
        this.f381842a = i12;
    }

    public final int a() {
        return this.f381842a;
    }

    public boolean equals(@Y61.l Object obj) {
        if (this != obj) {
            return (obj instanceof C39128si) && this.f381842a == ((C39128si) obj).f381842a;
        }
        return true;
    }

    public int hashCode() {
        return this.f381842a;
    }

    @Y61.k
    public String toString() {
        return AK.c.i(this.f381842a, ")", new StringBuilder("StartupUpdateConfig(intervalSeconds="));
    }
}
