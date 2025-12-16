package com.airbnb.lottie;

import com.airbnb.lottie.B;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class x implements B.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f60164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f60165b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f60166c;

    public /* synthetic */ x(B b12, int i12, int i13) {
        this.f60164a = b12;
        this.f60165b = i12;
        this.f60166c = i13;
    }

    @Override // com.airbnb.lottie.B.a
    public final void run() {
        List<String> list = B.f59013U;
        B b12 = this.f60164a;
        C27291k c27291k = b12.f59035b;
        int i12 = this.f60165b;
        int i13 = this.f60166c;
        if (c27291k == null) {
            b12.f59041h.add(new x(b12, i12, i13));
        } else {
            b12.f59036c.o(i12, i13 + 0.99f);
        }
    }
}
