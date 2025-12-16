package com.avito.android.verification.verification_finish;

import QM0.a;
import YM0.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class q implements w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f325320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f325321c;

    public /* synthetic */ q(int i12, Y41.l lVar) {
        this.f325320b = i12;
        this.f325321c = lVar;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        switch (this.f325320b) {
            case 0:
                this.f325321c.invoke(new a.c(deepLink));
                break;
            case 1:
                this.f325321c.invoke(new a.b(deepLink));
                break;
            default:
                this.f325321c.invoke(deepLink);
                break;
        }
    }
}
