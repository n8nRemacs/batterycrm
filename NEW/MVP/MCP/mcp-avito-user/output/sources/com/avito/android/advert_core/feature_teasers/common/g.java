package com.avito.android.advert_core.feature_teasers.common;

import com.avito.android.advert_core.feature_teasers.common.dialog.AdvertDetailsFeatureTeaserDialogInfo;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FeatureTeaserPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/feature_teasers/common/g;", "Lcom/avito/android/advert_core/feature_teasers/common/j;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class g implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final k f83653b;

    /* compiled from: FeatureTeaserPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_advert.advert.items.feature_teaser.f f83655m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailsFeatureTeaserItem f83656n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.user_advert.advert.items.feature_teaser.f fVar, AdvertDetailsFeatureTeaserItem advertDetailsFeatureTeaserItem) {
            super(0);
            this.f83655m = fVar;
            this.f83656n = advertDetailsFeatureTeaserItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.getClass();
            AdvertDetailsFeatureTeaserDialogInfo advertDetailsFeatureTeaserDialogInfo = this.f83656n.f83601h;
            if (advertDetailsFeatureTeaserDialogInfo != null) {
                this.f83655m.jU(advertDetailsFeatureTeaserDialogInfo);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FeatureTeaserPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_advert.advert.items.feature_teaser.f f83658m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AdvertDetailsFeatureTeaserItem f83659n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.user_advert.advert.items.feature_teaser.f fVar, AdvertDetailsFeatureTeaserItem advertDetailsFeatureTeaserItem) {
            super(0);
            this.f83658m = fVar;
            this.f83659n = advertDetailsFeatureTeaserItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.getClass();
            AdvertDetailsFeatureTeaserDialogInfo advertDetailsFeatureTeaserDialogInfo = this.f83659n.f83601h;
            if (advertDetailsFeatureTeaserDialogInfo != null) {
                this.f83658m.jU(advertDetailsFeatureTeaserDialogInfo);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public g(@Y61.k k kVar) {
        this.f83653b = kVar;
    }

    public final void a(@Y61.k l lVar, @Y61.k AdvertDetailsFeatureTeaserItem advertDetailsFeatureTeaserItem) {
        AdvertDetailsFeatureTeaserOption advertDetailsFeatureTeaserOption = advertDetailsFeatureTeaserItem.f83600g;
        String str = null;
        lVar.Is(advertDetailsFeatureTeaserOption != null ? advertDetailsFeatureTeaserOption.f83611b : null, advertDetailsFeatureTeaserOption != null ? advertDetailsFeatureTeaserOption.f83612c : null);
        lVar.f(advertDetailsFeatureTeaserItem.f83602i);
        boolean z12 = advertDetailsFeatureTeaserItem.f83601h instanceof AdvertDetailsFeatureTeaserDialogInfo.CheckedByAvito;
        k kVar = this.f83653b;
        lVar.Wn((!z12 || kVar.c() || kVar.d()) ? advertDetailsFeatureTeaserItem.f83603j : C42784z0.f406748b);
        if (!z12 || (!kVar.c() && !kVar.d())) {
            str = advertDetailsFeatureTeaserItem.f83604k;
        }
        lVar.Ue(str);
        com.avito.android.user_advert.advert.items.feature_teaser.f fVar = (com.avito.android.user_advert.advert.items.feature_teaser.f) lVar;
        lVar.Dx(new a(fVar, advertDetailsFeatureTeaserItem));
        lVar.w2(advertDetailsFeatureTeaserItem.f83606m);
        lVar.a0(new b(fVar, advertDetailsFeatureTeaserItem));
    }
}
