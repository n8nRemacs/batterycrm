package com.avito.android.publish;

import com.avito.android.publish.C33880m;
import com.avito.android.remote.model.fees.FeePricingParamsResponse;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: FeesParamsInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/fees/FeePricingParamsResponse;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.p, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33978p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33880m.c f238170b;

    public C33978p(C33880m.c cVar) {
        this.f238170b = cVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        if (p22 instanceof P2.b) {
            this.f238170b.f237391c = ((FeePricingParamsResponse) ((P2.b) p22).f318720a).getParams();
            return;
        }
        if (!(p22 instanceof P2.a)) {
            p22.equals(P2.c.f318721a);
            return;
        }
        V2.f318762a.d("FeePricingParams", "loadFeePricingParams failed: " + ((P2.a) p22).f318719a);
    }
}
