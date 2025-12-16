package com.avito.android.travel_payment_methods.items.loan_terms;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements com.avito.android.deep_linking.links.w {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f302514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A f302515c;

    public /* synthetic */ z(A a12, int i12) {
        this.f302514b = i12;
        this.f302515c = a12;
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(DeepLink deepLink) {
        switch (this.f302514b) {
            case 0:
                Y41.l<? super DeepLink, G0> lVar = this.f302515c.f302485h;
                if (lVar != null) {
                    lVar.invoke(deepLink);
                    break;
                }
                break;
            default:
                Y41.l<? super DeepLink, G0> lVar2 = this.f302515c.f302485h;
                if (lVar2 != null) {
                    lVar2.invoke(deepLink);
                    break;
                }
                break;
        }
    }
}
