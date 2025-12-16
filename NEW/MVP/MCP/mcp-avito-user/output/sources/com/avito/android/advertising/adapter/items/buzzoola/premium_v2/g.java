package com.avito.android.advertising.adapter.items.buzzoola.premium_v2;

import android.os.Parcelable;
import com.avito.android.advertising.adapter.items.buzzoola.premium.BuzzoolaPremiumItemState;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuzzoolaPremiumV2Presenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.advertising.ui.buzzoola.premium_v2.c f87460l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f87461m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BuzzoolaPremiumV2BannerItem f87462n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.avito.android.advertising.ui.buzzoola.premium_v2.c cVar, j jVar, BuzzoolaPremiumV2BannerItem buzzoolaPremiumV2BannerItem) {
        super(1);
        this.f87460l = cVar;
        this.f87461m = jVar;
        this.f87462n = buzzoolaPremiumV2BannerItem;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        num.intValue();
        Parcelable parcelableK2 = this.f87460l.k2();
        j jVar = this.f87461m;
        long f270085i = this.f87462n.getF270085i();
        Long lValueOf = Long.valueOf(f270085i);
        Map<Long, BuzzoolaPremiumItemState> map = jVar.f87476h.f87380b;
        BuzzoolaPremiumItemState buzzoolaPremiumItemState = map.get(lValueOf);
        if (buzzoolaPremiumItemState == null) {
            buzzoolaPremiumItemState = new BuzzoolaPremiumItemState(null, 1, null);
            map.put(Long.valueOf(f270085i), buzzoolaPremiumItemState);
        }
        buzzoolaPremiumItemState.f87379b = parcelableK2;
        return G0.f406611a;
    }
}
