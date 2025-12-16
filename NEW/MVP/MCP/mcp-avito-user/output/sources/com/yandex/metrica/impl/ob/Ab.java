package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public final class Ab {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final String f377767a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final com.yandex.metrica.appsetid.c f377768b;

    public Ab(@Y61.l String str, @Y61.k com.yandex.metrica.appsetid.c cVar) {
        this.f377767a = str;
        this.f377768b = cVar;
    }

    @Y61.l
    public final String a() {
        return this.f377767a;
    }

    @Y61.k
    public final com.yandex.metrica.appsetid.c b() {
        return this.f377768b;
    }

    public boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ab)) {
            return false;
        }
        Ab ab2 = (Ab) obj;
        return kotlin.jvm.internal.L.f(this.f377767a, ab2.f377767a) && kotlin.jvm.internal.L.f(this.f377768b, ab2.f377768b);
    }

    public int hashCode() {
        String str = this.f377767a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        com.yandex.metrica.appsetid.c cVar = this.f377768b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        return "AppSetId(id=" + this.f377767a + ", scope=" + this.f377768b + ")";
    }
}
