package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.w0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39206w0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f382093a;

    public C39206w0(long j12) {
        this.f382093a = j12;
    }

    public final long a() {
        return this.f382093a;
    }

    public boolean equals(@Y61.l Object obj) {
        if (this != obj) {
            return (obj instanceof C39206w0) && this.f382093a == ((C39206w0) obj).f382093a;
        }
        return true;
    }

    public int hashCode() {
        long j12 = this.f382093a;
        return (int) (j12 ^ (j12 >>> 32));
    }

    @Y61.k
    public String toString() {
        return AK.c.j(this.f382093a, ")", new StringBuilder("EasyCollectingConfig(firstLaunchDelaySeconds="));
    }
}
