package com.avito.android.di.module;

import com.adjust.sdk.Constants;
import com.avito.android.gson.CollectionSkipNullAdapterFactory;
import com.avito.android.remote.model.SerpAdvert;
import com.avito.android.remote.model.ServiceTypeKt;
import com.avito.android.remote.model.search.suggest.BannerSuggestItem;
import com.avito.android.remote.model.search.suggest.BubblesSuggestItem;
import com.avito.android.remote.model.search.suggest.GapSuggestItem;
import com.avito.android.remote.model.search.suggest.GridSuggestSnippetItem;
import com.avito.android.remote.model.search.suggest.HistorySuggestItem;
import com.avito.android.remote.model.search.suggest.IconSource;
import com.avito.android.remote.model.search.suggest.LocalIcon;
import com.avito.android.remote.model.search.suggest.RedesignTextSuggestItem;
import com.avito.android.remote.model.search.suggest.ServerIcon;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.remote.model.search.suggest.SuggestDeeplink;
import com.avito.android.remote.model.search.suggest.SuggestItem;
import com.avito.android.remote.model.search.suggest.SuggestNewQuery;
import com.avito.android.remote.model.search.suggest.SuggestSetFieldValue;
import com.avito.android.remote.model.search.suggest.SuggestSnippetItem;
import com.avito.android.remote.model.search.suggest.TextSuggestItem;
import com.avito.android.remote.model.search.suggest.TitleSuggestItem;
import com.avito.android.remote.model.search.suggest.ToggleSuggestItem;
import com.avito.android.remote.model.section.SectionElement;
import com.avito.android.remote.model.section.VipAdvert;
import com.avito.android.remote.parse.adapter.ConstructorAdvertGalleryItemAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.ActionTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.AdvertCommercialsAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.ApiErrorTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.AttributedTextTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.CreditInfoButtonTypeFactory;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.SuggestsTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.TypedResultTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.UserDialogTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.VipAdvertTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.font_parameter.FontParameterTypeAdapterFactory;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CoreOptimalJsonModule_ProvideCommonTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/di/module/A3;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class A3 implements dagger.internal.h<Set<com.google.gson.r>> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f143820c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final F3 f143821a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f143822b;

    /* compiled from: CoreOptimalJsonModule_ProvideCommonTypeAdapterFactoriesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/A3$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public A3(@Y61.k F3 f32, @Y61.k com.avito.android.S s5) {
        this.f143821a = f32;
        this.f143822b = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        TypedResultTypeAdapterFactory typedResultTypeAdapterFactory = (TypedResultTypeAdapterFactory) this.f143821a.get();
        h31.e eVarB = dagger.internal.g.b(this.f143822b);
        f143820c.getClass();
        C30200u3 c30200u3 = C30200u3.f144612a;
        VipAdvertTypeAdapterFactory vipAdvertTypeAdapterFactory = new VipAdvertTypeAdapterFactory();
        ActionTypeAdapterFactory actionTypeAdapterFactory = new ActionTypeAdapterFactory();
        CreditInfoButtonTypeFactory creditInfoButtonTypeFactory = new CreditInfoButtonTypeFactory();
        SuggestsTypeAdapterFactory suggestsTypeAdapterFactory = new SuggestsTypeAdapterFactory();
        AdvertCommercialsAdapterFactory advertCommercialsAdapterFactory = new AdvertCommercialsAdapterFactory();
        ApiErrorTypeAdapterFactory apiErrorTypeAdapterFactory = new ApiErrorTypeAdapterFactory();
        UserDialogTypeAdapterFactory userDialogTypeAdapterFactory = new UserDialogTypeAdapterFactory();
        com.avito.android.P p12 = (com.avito.android.P) eVarB.get();
        p12.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.P.f67370w0[78];
        FontParameterTypeAdapterFactory fontParameterTypeAdapterFactory = new FontParameterTypeAdapterFactory(((Boolean) p12.f67419l0.a().invoke()).booleanValue());
        AttributedTextTypeAdapterFactory attributedTextTypeAdapterFactory = new AttributedTextTypeAdapterFactory();
        ConstructorAdvertGalleryItemAdapterFactory constructorAdvertGalleryItemAdapterFactory = new ConstructorAdvertGalleryItemAdapterFactory();
        CollectionSkipNullAdapterFactory collectionSkipNullAdapterFactory = new CollectionSkipNullAdapterFactory();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, SectionElement.class);
        optimalRuntimeTypeAdapterFactoryA.b(SerpAdvert.class, "item");
        optimalRuntimeTypeAdapterFactoryA.b(VipAdvert.class, ServiceTypeKt.SERVICE_VIP);
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK = com.yandex.div2.D8.k(SuggestItem.class, TextSuggestItem.class, "text_item_v2", RedesignTextSuggestItem.class, "text_item_v3");
        optimalRuntimeTypeAdapterFactoryK.b(ToggleSuggestItem.class, "toggle");
        optimalRuntimeTypeAdapterFactoryK.b(BubblesSuggestItem.class, "bubble_group");
        optimalRuntimeTypeAdapterFactoryK.b(HistorySuggestItem.class, "history_group");
        optimalRuntimeTypeAdapterFactoryK.b(GapSuggestItem.class, "gap");
        optimalRuntimeTypeAdapterFactoryK.b(TitleSuggestItem.class, "title");
        optimalRuntimeTypeAdapterFactoryK.b(BannerSuggestItem.class, "promo_banner");
        optimalRuntimeTypeAdapterFactoryK.b(SuggestSnippetItem.class, "item_snippet");
        optimalRuntimeTypeAdapterFactoryK.b(GridSuggestSnippetItem.class, "item_snippet_grid");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryK2 = com.yandex.div2.D8.k(SuggestAction.class, SuggestNewQuery.class, "new_query", SuggestAnalyticsEvent.class, "clickstream");
        optimalRuntimeTypeAdapterFactoryK2.b(SuggestDeeplink.class, Constants.DEEPLINK);
        optimalRuntimeTypeAdapterFactoryK2.b(SuggestSetFieldValue.class, "setFieldValue");
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactory = new OptimalRuntimeTypeAdapterFactory(IconSource.class);
        optimalRuntimeTypeAdapterFactory.b(LocalIcon.class, "local");
        optimalRuntimeTypeAdapterFactory.b(ServerIcon.class, "server");
        return kotlin.collections.b1.g(typedResultTypeAdapterFactory, vipAdvertTypeAdapterFactory, actionTypeAdapterFactory, creditInfoButtonTypeFactory, suggestsTypeAdapterFactory, advertCommercialsAdapterFactory, apiErrorTypeAdapterFactory, userDialogTypeAdapterFactory, fontParameterTypeAdapterFactory, attributedTextTypeAdapterFactory, constructorAdvertGalleryItemAdapterFactory, collectionSkipNullAdapterFactory, optimalRuntimeTypeAdapterFactoryA, optimalRuntimeTypeAdapterFactoryK, optimalRuntimeTypeAdapterFactoryK2, optimalRuntimeTypeAdapterFactory);
    }
}
