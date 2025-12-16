package za1;

/* renamed from: za1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50536a {

    /* renamed from: a, reason: collision with root package name */
    public final float f444078a;

    /* renamed from: b, reason: collision with root package name */
    public final C50537b f444079b;

    /* renamed from: c, reason: collision with root package name */
    public final C50537b f444080c;

    /* renamed from: d, reason: collision with root package name */
    public int f444081d;

    public C50536a(float f12) {
        this.f444078a = f12;
        this.f444079b = new C50537b(f12);
        this.f444080c = new C50537b(f12);
    }

    public final void a(float[] fArr, float[] fArr2) {
        float f12 = fArr[0];
        C50537b c50537b = this.f444079b;
        float f13 = c50537b.f444082a * f12;
        float f14 = c50537b.f444085d;
        float f15 = c50537b.f444083b;
        float f16 = (f14 * f15) + f13;
        float f17 = c50537b.f444084c;
        c50537b.f444084c = f17 * f15;
        c50537b.f444085d = f16;
        fArr2[0] = f16 / (1.0f - f17);
        float f18 = fArr[1];
        C50537b c50537b2 = this.f444080c;
        float f19 = c50537b2.f444082a * f18;
        float f22 = c50537b2.f444085d;
        float f23 = c50537b2.f444083b;
        float f24 = (f22 * f23) + f19;
        float f25 = c50537b2.f444084c;
        c50537b2.f444084c = f25 * f23;
        c50537b2.f444085d = f24;
        fArr2[1] = f24 / (1.0f - f25);
        this.f444081d++;
    }
}
