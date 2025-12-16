package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.c2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38717c2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f380273a;

    /* renamed from: b, reason: collision with root package name */
    private final int f380274b;

    /* renamed from: c, reason: collision with root package name */
    private final int f380275c;

    /* renamed from: d, reason: collision with root package name */
    private final float f380276d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private final com.yandex.metrica.b f380277e;

    public C38717c2(int i12, int i13, int i14, float f12, @Y61.l com.yandex.metrica.b bVar) {
        this.f380273a = i12;
        this.f380274b = i13;
        this.f380275c = i14;
        this.f380276d = f12;
        this.f380277e = bVar;
    }

    @Y61.l
    public final com.yandex.metrica.b a() {
        return this.f380277e;
    }

    public final int b() {
        return this.f380275c;
    }

    public final int c() {
        return this.f380274b;
    }

    public final float d() {
        return this.f380276d;
    }

    public final int e() {
        return this.f380273a;
    }

    public boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38717c2)) {
            return false;
        }
        C38717c2 c38717c2 = (C38717c2) obj;
        return this.f380273a == c38717c2.f380273a && this.f380274b == c38717c2.f380274b && this.f380275c == c38717c2.f380275c && Float.compare(this.f380276d, c38717c2.f380276d) == 0 && kotlin.jvm.internal.L.f(this.f380277e, c38717c2.f380277e);
    }

    public int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.f380276d) + (((((this.f380273a * 31) + this.f380274b) * 31) + this.f380275c) * 31)) * 31;
        com.yandex.metrica.b bVar = this.f380277e;
        return iFloatToIntBits + (bVar != null ? bVar.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        return "ScreenInfo(width=" + this.f380273a + ", height=" + this.f380274b + ", dpi=" + this.f380275c + ", scaleFactor=" + this.f380276d + ", deviceType=" + this.f380277e + ")";
    }
}
