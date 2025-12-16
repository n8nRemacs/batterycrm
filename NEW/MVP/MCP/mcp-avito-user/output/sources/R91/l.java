package R91;

import aa1.q;
import android.content.Context;
import android.graphics.Bitmap;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import wa1.r;
import xa1.C49909c;
import ya1.C50206b;
import ya1.C50207c;

/* loaded from: classes9.dex */
public final class l extends a {

    /* renamed from: i, reason: collision with root package name */
    public final C49909c f14159i;

    public l(Context context) {
        super(context);
        this.f14159i = new C49909c(this.f14113c);
    }

    @Override // R91.a
    public final k a(Bitmap bitmap) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C50206b c50206bF = this.f14114d.f(bitmap, 288, 416, 64, this.f14111a);
        FloatBuffer floatBuffer = this.f14118h;
        floatBuffer.clear();
        this.f14114d.getClass();
        Bitmap bitmap2 = c50206bF.f443193a;
        float[] fArr = this.f14117g;
        C50207c.g(bitmap2, fArr);
        this.f14116f.run(FloatBuffer.wrap(fArr), floatBuffer);
        q qVarA = this.f14115e.a(c50206bF.f443197e, c50206bF.f443198f, c50206bF.f443199g, c50206bF.f443200h, floatBuffer);
        int iCurrentTimeMillis = (int) (1000 / (System.currentTimeMillis() - jCurrentTimeMillis));
        ArrayList arrayList = qVarA.f20977b;
        boolean z12 = false;
        boolean zB2 = this.f14159i.b(arrayList, false, qVarA.f20979d, iCurrentTimeMillis);
        int i12 = this.f14112b;
        float f12 = i12;
        float f13 = 0.2f * f12;
        float f14 = f12 - f13;
        int[] iArr = r.f441622b;
        boolean z13 = true;
        for (int i13 = 0; i13 < 2; i13++) {
            if (f13 <= ((int[]) arrayList.get(iArr[i13]))[0]) {
                z13 = false;
            }
        }
        int[] iArr2 = r.f441623c;
        boolean z14 = z13;
        for (int i14 = 0; i14 < 2; i14++) {
            if (f14 >= ((int[]) arrayList.get(iArr2[i14]))[0]) {
                z14 = false;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i15 = 0;
        for (Object obj : arrayList) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                C42745f0.H0();
                throw null;
            }
            if (C42756l.G(i15, r.f441621a) >= 0) {
                arrayList2.add(obj);
            }
            i15 = i16;
        }
        if (arrayList2.isEmpty()) {
            z12 = true;
        } else {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                int[] iArr3 = (int[]) it.next();
                int i17 = iArr3[0];
                int i18 = iArr3[1];
                if (i17 < 0 || i17 > i12 || i18 < 0 || i18 > this.f14113c) {
                    break;
                }
            }
            z12 = true;
        }
        return new k(arrayList, qVarA.f20979d, z12, zB2, z14);
    }
}
