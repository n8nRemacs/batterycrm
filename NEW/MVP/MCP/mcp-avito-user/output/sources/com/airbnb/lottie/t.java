package com.airbnb.lottie;

import com.airbnb.lottie.B;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class t implements B.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f60052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f60053c;

    public /* synthetic */ t(B b12, String str, int i12) {
        this.f60051a = i12;
        this.f60052b = b12;
        this.f60053c = str;
    }

    @Override // com.airbnb.lottie.B.a
    public final void run() {
        String str = this.f60053c;
        B b12 = this.f60052b;
        switch (this.f60051a) {
            case 0:
                List<String> list = B.f59013U;
                b12.v(str);
                break;
            case 1:
                List<String> list2 = B.f59013U;
                b12.u(str);
                break;
            default:
                List<String> list3 = B.f59013U;
                b12.x(str);
                break;
        }
    }
}
