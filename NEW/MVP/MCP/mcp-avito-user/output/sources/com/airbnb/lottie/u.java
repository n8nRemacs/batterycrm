package com.airbnb.lottie;

import com.airbnb.lottie.B;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class u implements B.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f60055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f60056c;

    public /* synthetic */ u(B b12, int i12, int i13) {
        this.f60054a = i13;
        this.f60055b = b12;
        this.f60056c = i12;
    }

    @Override // com.airbnb.lottie.B.a
    public final void run() {
        int i12 = this.f60056c;
        B b12 = this.f60055b;
        switch (this.f60054a) {
            case 0:
                List<String> list = B.f59013U;
                b12.t(i12);
                break;
            case 1:
                List<String> list2 = B.f59013U;
                b12.w(i12);
                break;
            default:
                List<String> list3 = B.f59013U;
                b12.s(i12);
                break;
        }
    }
}
