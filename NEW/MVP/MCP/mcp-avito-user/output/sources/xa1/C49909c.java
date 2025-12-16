package xa1;

import java.util.ArrayList;
import kotlin.ranges.k;
import kotlin.ranges.s;
import wa1.r;
import za1.C50536a;
import za1.C50537b;

/* renamed from: xa1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49909c {

    /* renamed from: a, reason: collision with root package name */
    public final int f442552a;

    /* renamed from: b, reason: collision with root package name */
    public final C50536a f442553b = new C50536a(0.8f);

    /* renamed from: c, reason: collision with root package name */
    public final C50536a f442554c = new C50536a(5.0f);

    /* renamed from: d, reason: collision with root package name */
    public final C50536a f442555d = new C50536a(0.8f);

    /* renamed from: e, reason: collision with root package name */
    public final C50536a f442556e = new C50536a(5.0f);

    /* renamed from: f, reason: collision with root package name */
    public final float[] f442557f = new float[2];

    /* renamed from: g, reason: collision with root package name */
    public final float[] f442558g = new float[2];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f442559h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f442560i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final float[] f442561j = new float[2];

    /* renamed from: k, reason: collision with root package name */
    public final float[] f442562k = new float[2];

    public C49909c(int i12) {
        this.f442552a = i12;
    }

    public static void a(ArrayList arrayList, int[] iArr, float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        k it = s.r(0, 4).iterator();
        while (it.f406910d) {
            int i12 = iArr[it.a()];
            fArr[0] = fArr[0] + ((int[]) arrayList.get(i12))[0];
            fArr[1] = fArr[1] + ((int[]) arrayList.get(i12))[1];
        }
        float f12 = 4;
        fArr[0] = fArr[0] / f12;
        fArr[1] = fArr[1] / f12;
    }

    public final boolean b(ArrayList arrayList, boolean z12, boolean z13, int i12) {
        float[] fArr = this.f442558g;
        float[] fArr2 = this.f442557f;
        C50536a c50536a = this.f442553b;
        C50536a c50536a2 = this.f442554c;
        if (z12) {
            int[] iArr = wa1.s.f441624a;
            float[] fArr3 = this.f442561j;
            a(arrayList, iArr, fArr3);
            c50536a.a(fArr3, fArr2);
            c50536a2.a(fArr3, fArr);
        } else {
            C50537b c50537b = c50536a.f444079b;
            c50537b.f444084c = c50537b.f444083b;
            c50537b.f444085d = 0.0f;
            C50537b c50537b2 = c50536a.f444080c;
            c50537b2.f444084c = c50537b2.f444083b;
            c50537b2.f444085d = 0.0f;
            c50536a.f444081d = 0;
            C50537b c50537b3 = c50536a2.f444079b;
            c50537b3.f444084c = c50537b3.f444083b;
            c50537b3.f444085d = 0.0f;
            C50537b c50537b4 = c50536a2.f444080c;
            c50537b4.f444084c = c50537b4.f444083b;
            c50537b4.f444085d = 0.0f;
            c50536a2.f444081d = 0;
        }
        float[] fArr4 = this.f442560i;
        float[] fArr5 = this.f442559h;
        C50536a c50536a3 = this.f442555d;
        C50536a c50536a4 = this.f442556e;
        if (z13) {
            int[] iArr2 = r.f441621a;
            float[] fArr6 = this.f442562k;
            a(arrayList, iArr2, fArr6);
            c50536a3.a(fArr6, fArr5);
            c50536a4.a(fArr6, fArr4);
        } else {
            C50537b c50537b5 = c50536a3.f444079b;
            c50537b5.f444084c = c50537b5.f444083b;
            c50537b5.f444085d = 0.0f;
            C50537b c50537b6 = c50536a3.f444080c;
            c50537b6.f444084c = c50537b6.f444083b;
            c50537b6.f444085d = 0.0f;
            c50536a3.f444081d = 0;
            C50537b c50537b7 = c50536a4.f444079b;
            c50537b7.f444084c = c50537b7.f444083b;
            c50537b7.f444085d = 0.0f;
            C50537b c50537b8 = c50536a4.f444080c;
            c50537b8.f444084c = c50537b8.f444083b;
            c50537b8.f444085d = 0.0f;
            c50536a4.f444081d = 0;
        }
        if (c50536a2.f444081d < c50536a2.f444078a || c50536a4.f444081d < c50536a4.f444078a) {
            return false;
        }
        float f12 = (this.f442552a * 0.35f) / i12;
        float f13 = fArr2[0] - fArr[0];
        float f14 = fArr2[1] - fArr[1];
        float fSqrt = (float) Math.sqrt((f14 * f14) + (f13 * f13));
        float f15 = fArr5[0] - fArr4[0];
        float f16 = fArr5[1] - fArr4[1];
        return fSqrt <= f12 && ((float) Math.sqrt((double) ((f16 * f16) + (f15 * f15)))) <= f12;
    }
}
