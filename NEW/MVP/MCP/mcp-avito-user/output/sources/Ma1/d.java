package ma1;

import android.graphics.Bitmap;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.N;
import ya1.C50206b;
import ya1.C50207c;

/* loaded from: classes9.dex */
public final class d extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f414597l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bitmap f414598m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Bitmap bitmap) {
        super(0);
        this.f414597l = eVar;
        this.f414598m = bitmap;
    }

    @Override // Y41.a
    public final Object invoke() {
        C44038a c44038a = this.f414597l.f414601d;
        c44038a.getClass();
        C50206b c50206bF = c44038a.f414589a.f(this.f414598m, 220, 220, 0, null);
        FloatBuffer floatBuffer = c44038a.f414592d;
        floatBuffer.clear();
        FloatBuffer floatBuffer2 = c44038a.f414591c;
        floatBuffer2.rewind();
        float[] fArrArray = floatBuffer2.array();
        c44038a.f414589a.getClass();
        C50207c.g(c50206bF.f443193a, fArrArray);
        c44038a.f414590b.run(floatBuffer2, floatBuffer);
        floatBuffer.rewind();
        float[] fArrArray2 = floatBuffer.array();
        float[] fArr = new float[3];
        boolean z12 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= 3) {
                break;
            }
            float f12 = fArrArray2[i12];
            for (int i13 = 1; i13 < 784; i13++) {
                float f13 = fArrArray2[(i13 * 3) + i12];
                if (f13 > f12) {
                    f12 = f13;
                }
            }
            fArr[i12] = f12;
            i12++;
        }
        if (fArr[2] >= 0.7f && fArr[1] >= 0.5f) {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
