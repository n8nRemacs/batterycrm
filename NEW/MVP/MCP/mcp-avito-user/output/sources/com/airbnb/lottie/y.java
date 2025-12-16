package com.airbnb.lottie;

import com.airbnb.lottie.B;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class y implements B.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B f60168b;

    public /* synthetic */ y(B b12, int i12) {
        this.f60167a = i12;
        this.f60168b = b12;
    }

    @Override // com.airbnb.lottie.B.a
    public final void run() {
        B b12 = this.f60168b;
        switch (this.f60167a) {
            case 0:
                List<String> list = B.f59013U;
                b12.p();
                break;
            default:
                List<String> list2 = B.f59013U;
                b12.n();
                break;
        }
    }
}
