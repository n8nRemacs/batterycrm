package Fc1;

import Fc1.W4;
import android.graphics.Typeface;

/* loaded from: classes9.dex */
public final class C5 implements D2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Cb1.d f4837a;

    public C5(@Y61.k Cb1.d dVar) {
        this.f4837a = dVar;
    }

    @Override // Fc1.D2
    public final int a() {
        return this.f4837a.f2296a;
    }

    @Override // Fc1.D2
    @Y61.k
    public final InterfaceC13583c4 b() {
        return new C13674m5(this.f4837a.f2298c);
    }

    @Override // Fc1.D2
    @Y61.k
    public final Typeface a(@Y61.k Typeface typeface) {
        Cb1.d dVar = this.f4837a;
        Typeface typeface2 = dVar.f2299d;
        if (typeface2 != null) {
            return typeface2;
        }
        X6 x62 = W4.a.f5280a;
        if (x62 == null) {
            x62 = null;
        }
        return androidx.core.graphics.z.a(x62.f5319a, typeface, dVar.f2296a, dVar.f2297b);
    }
}
