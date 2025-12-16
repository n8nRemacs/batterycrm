package Fc1;

import Fc1.C13615g0;

/* renamed from: Fc1.f2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13608f2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C13615g0.b f5498a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C13615g0.c f5499b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C13615g0.d f5500c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C13615g0.e f5501d;

    public C13608f2(@Y61.k C13615g0.b bVar, @Y61.k C13615g0.c cVar, @Y61.k C13615g0.d dVar, @Y61.k C13615g0.e eVar) {
        this.f5498a = bVar;
        this.f5499b = cVar;
        this.f5500c = dVar;
        this.f5501d = eVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13608f2)) {
            return false;
        }
        C13608f2 c13608f2 = (C13608f2) obj;
        return this.f5498a.equals(c13608f2.f5498a) && this.f5499b.equals(c13608f2.f5499b) && this.f5500c.equals(c13608f2.f5500c) && this.f5501d.equals(c13608f2.f5501d);
    }

    public final int hashCode() {
        return this.f5501d.hashCode() + ((this.f5500c.hashCode() + ((this.f5499b.hashCode() + (this.f5498a.hashCode() * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "ScreenshotFieldCallbacks(takeClick=" + this.f5498a + ", attachClick=" + this.f5499b + ", deleteClick=" + this.f5500c + ", previewClick=" + this.f5501d + ')';
    }
}
