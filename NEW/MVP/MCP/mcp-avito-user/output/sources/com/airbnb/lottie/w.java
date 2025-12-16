package com.airbnb.lottie;

import com.airbnb.lottie.B;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class w implements B.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f60162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f60163c;

    public /* synthetic */ w(B b12, float f12, int i12) {
        this.f60161a = i12;
        this.f60162b = b12;
        this.f60163c = f12;
    }

    @Override // com.airbnb.lottie.B.a
    public final void run() {
        float f12 = this.f60163c;
        B b12 = this.f60162b;
        switch (this.f60161a) {
            case 0:
                List<String> list = B.f59013U;
                C27291k c27291k = b12.f59035b;
                if (c27291k != null) {
                    float f13 = com.airbnb.lottie.utils.j.f(c27291k.f59593l, c27291k.f59594m, f12);
                    com.airbnb.lottie.utils.h hVar = b12.f59036c;
                    hVar.o(hVar.f60116k, f13);
                    break;
                } else {
                    b12.f59041h.add(new w(b12, f12, 0));
                    break;
                }
            case 1:
                List<String> list2 = B.f59013U;
                C27291k c27291k2 = b12.f59035b;
                if (c27291k2 != null) {
                    b12.w((int) com.airbnb.lottie.utils.j.f(c27291k2.f59593l, c27291k2.f59594m, f12));
                    break;
                } else {
                    b12.f59041h.add(new w(b12, f12, 1));
                    break;
                }
            default:
                List<String> list3 = B.f59013U;
                b12.y(f12);
                break;
        }
    }
}
