package com.avito.android.advertising.adapter.items.buzzoola.premium;

import android.os.Parcelable;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuzzoolaPremiumPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advertising.ui.buzzoola.premium.p f87395l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f87396m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BuzzoolaPremiumBannerItem f87397n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.avito.android.advertising.ui.buzzoola.premium.p pVar, j jVar, BuzzoolaPremiumBannerItem buzzoolaPremiumBannerItem) {
        super(1);
        this.f87395l = pVar;
        this.f87396m = jVar;
        this.f87397n = buzzoolaPremiumBannerItem;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        num.intValue();
        Parcelable parcelableK2 = this.f87395l.k2();
        if (parcelableK2 != null) {
            j jVar = this.f87396m;
            long f74291l = this.f87397n.getF77570h();
            Long lValueOf = Long.valueOf(f74291l);
            Map<Long, BuzzoolaPremiumItemState> map = jVar.f87411h.f87380b;
            BuzzoolaPremiumItemState buzzoolaPremiumItemState = map.get(lValueOf);
            if (buzzoolaPremiumItemState == null) {
                buzzoolaPremiumItemState = new BuzzoolaPremiumItemState(null, 1, null);
                map.put(Long.valueOf(f74291l), buzzoolaPremiumItemState);
            }
            buzzoolaPremiumItemState.f87379b = parcelableK2;
        }
        return G0.f406611a;
    }
}
