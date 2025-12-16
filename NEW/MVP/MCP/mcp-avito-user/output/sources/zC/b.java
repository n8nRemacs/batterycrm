package ZC;

import Y61.k;
import aD.C19757a;
import com.avito.android.remote.model.AvitoForBusinessExitBlock;
import com.avito.android.remote.model.DisclaimerWidget;
import com.avito.android.remote.model.FavoriteAdvertV1;
import com.avito.android.remote.model.FavoriteElement;
import com.avito.android.remote.model.GroupCard;
import com.avito.android.remote.model.PromoBannerRecallWithBenefits;
import com.avito.android.remote.model.PromoBannerRecallWithDescription;
import com.avito.android.remote.model.RelatedProducts;
import com.avito.android.remote.model.SerpBannerContainer;
import com.avito.android.remote.model.WitcherElement;
import com.avito.android.remote.model.vertical_main.InteractiveTitleWidget;
import com.avito.android.remote.model.vertical_main.PromoWidget;
import com.avito.android.remote.model.vertical_main.SalesPromoWidget;
import com.avito.android.remote.parse.adapter.AdvertActionTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import com.my.tracker.ads.AdFormat;
import dagger.internal.t;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;

/* compiled from: FavoritesAdapterJsonModule_ProvideFavoriteItemTypeAdapterFactoryFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"LZC/b;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "a", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<Set<r>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f19962b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AD.c f19963a;

    /* compiled from: FavoritesAdapterJsonModule_ProvideFavoriteItemTypeAdapterFactoryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZC/b$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k AD.c cVar) {
        this.f19963a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f19963a.get();
        f19962b.getClass();
        ZC.a.f19961a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, FavoriteElement.class);
        optimalRuntimeTypeAdapterFactoryA.b(PromoWidget.class, "promoWidget");
        optimalRuntimeTypeAdapterFactoryA.b(FavoriteAdvertV1.class, "item");
        optimalRuntimeTypeAdapterFactoryA.b(SalesPromoWidget.class, "salesPromo");
        optimalRuntimeTypeAdapterFactoryA.b(WitcherElement.class, "witcherAndroid");
        optimalRuntimeTypeAdapterFactoryA.b(PromoBannerRecallWithDescription.class, "premierPartnerFavoritesV1");
        optimalRuntimeTypeAdapterFactoryA.b(PromoBannerRecallWithBenefits.class, "premierPartnerFavoritesV2");
        optimalRuntimeTypeAdapterFactoryA.b(SerpBannerContainer.class, AdFormat.BANNER);
        optimalRuntimeTypeAdapterFactoryA.b(InteractiveTitleWidget.class, "interactiveTitleWidget");
        optimalRuntimeTypeAdapterFactoryA.b(AvitoForBusinessExitBlock.class, "avitoForBusinessExit");
        optimalRuntimeTypeAdapterFactoryA.b(DisclaimerWidget.class, "disclaimerWidget");
        optimalRuntimeTypeAdapterFactoryA.b(GroupCard.class, "groupCard");
        C19757a.f20814a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactory = new OptimalRuntimeTypeAdapterFactory(RelatedProducts.class);
        optimalRuntimeTypeAdapterFactory.b(RelatedProducts.TransactionalItem.class, "trxItem");
        optimalRuntimeTypeAdapterFactory.b(RelatedProducts.ClassifiedItem.class, "clfdItem");
        Set setL0 = C42756l.l0(new r[]{optimalRuntimeTypeAdapterFactoryA, optimalRuntimeTypeAdapterFactory, new AdvertActionTypeAdapterFactory()});
        t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
