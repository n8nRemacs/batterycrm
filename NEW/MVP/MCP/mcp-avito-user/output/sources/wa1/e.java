package wa1;

import android.graphics.Bitmap;
import android.graphics.Color;
import kotlin.G0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import ya1.C50205a;

/* loaded from: classes9.dex */
public final class e extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f441585l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C50205a f441586m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Bitmap f441587n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Bitmap f441588o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p pVar, C50205a c50205a, Bitmap bitmap, Bitmap bitmap2) {
        super(0);
        this.f441585l = pVar;
        this.f441586m = c50205a;
        this.f441587n = bitmap;
        this.f441588o = bitmap2;
    }

    @Override // Y41.a
    public final Object invoke() {
        float[] fArr = this.f441585l.f441618e;
        Bitmap bitmap = this.f441587n;
        int i12 = 0;
        bitmap.setHasAlpha(false);
        int[] iArr = new int[bitmap.getHeight() * bitmap.getWidth()];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        Bitmap bitmap2 = this.f441588o;
        bitmap2.setHasAlpha(false);
        int[] iArr2 = new int[bitmap2.getHeight() * bitmap2.getWidth()];
        bitmap2.getPixels(iArr2, 0, bitmap2.getWidth(), 0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        kotlin.ranges.k it = C42756l.D(iArr).iterator();
        int i13 = 0;
        while (it.f406910d) {
            if (it.a() % 2 == 0) {
                int i14 = iArr[i13];
                C50205a c50205a = this.f441586m;
                fArr[i12] = (Color.red(i14) * 0.6f) / c50205a.f443190a;
                int i15 = i12 + 2;
                fArr[i12 + 1] = (Color.green(i14) * 0.6f) / c50205a.f443191b;
                i12 += 3;
                fArr[i15] = (Color.blue(i14) * 0.6f) / c50205a.f443192c;
            } else {
                int i16 = i13 + 1;
                int i17 = iArr2[i13];
                float f12 = 255;
                fArr[i12] = Color.red(i17) / f12;
                int i18 = i12 + 2;
                fArr[i12 + 1] = Color.green(i17) / f12;
                i12 += 3;
                fArr[i18] = Color.blue(i17) / f12;
                i13 = i16;
            }
        }
        return G0.f406611a;
    }
}
