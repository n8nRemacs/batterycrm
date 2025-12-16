package R91;

import aa1.q;
import android.content.Context;
import android.graphics.Bitmap;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import xa1.C49907a;
import xa1.C49908b;
import xa1.C49909c;
import ya1.C50206b;
import ya1.C50207c;

/* loaded from: classes9.dex */
public final class m extends a {

    /* renamed from: i, reason: collision with root package name */
    public final C49907a f14160i;

    /* renamed from: j, reason: collision with root package name */
    public final C49908b f14161j;

    /* renamed from: k, reason: collision with root package name */
    public final C49909c f14162k;

    public m(Context context) {
        super(context);
        int i12 = this.f14112b;
        this.f14160i = new C49907a(i12, this.f14113c);
        this.f14161j = new C49908b(i12);
        this.f14162k = new C49909c(this.f14113c);
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
        return new k(arrayList, qVarA.f20976a, this.f14160i.a(arrayList), this.f14162k.b(arrayList, qVarA.f20978c, qVarA.f20979d, iCurrentTimeMillis), this.f14161j.a(arrayList));
    }
}
