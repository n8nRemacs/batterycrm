package com.avito.android.advert.item.safedeal;

import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.remote.safedeal.SafeDeal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertSafeDealPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "components", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.safedeal.v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28193v extends kotlin.jvm.internal.N implements Y41.l<List<? extends TrustFactorsComponent>, List<? extends TrustFactorsComponent>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f79252l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C28180h f79253m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SafeDeal.Component.Button f79254n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28193v(String str, C28180h c28180h, SafeDeal.Component.Button button) {
        super(1);
        this.f79252l = str;
        this.f79253m = c28180h;
        this.f79254n = button;
    }

    @Override // Y41.l
    public final List<? extends TrustFactorsComponent> invoke(List<? extends TrustFactorsComponent> list) {
        ArrayList arrayList = new ArrayList();
        for (TrustFactorsComponent trustFactorsComponentA : list) {
            if (kotlin.jvm.internal.L.f(trustFactorsComponentA.getF84275c(), this.f79252l)) {
                com.avito.android.advert.item.safedeal.trust_factors.a aVar = this.f79253m.f78837r;
                SafeDeal.Component.Button button = this.f79254n;
                aVar.getClass();
                trustFactorsComponentA = com.avito.android.advert.item.safedeal.trust_factors.a.a(button);
            }
            arrayList.add(trustFactorsComponentA);
        }
        return arrayList;
    }
}
