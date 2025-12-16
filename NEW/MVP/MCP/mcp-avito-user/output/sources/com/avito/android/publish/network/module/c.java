package com.avito.android.publish.network.module;

import Tk0.C15372a;
import com.adjust.sdk.Constants;
import com.avito.android.publish.details.beduin.custom_actions.ContinuePublishAction;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.AddressesSearchParameter;
import com.avito.android.remote.model.category_parameters.BannerCheckBoxWithImageParameter;
import com.avito.android.remote.model.category_parameters.BeduinParameter;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import com.avito.android.remote.model.category_parameters.CategoryAndTypeParameter;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.CheckinCheckoutParameter;
import com.avito.android.remote.model.category_parameters.ChildrenAgesGroup;
import com.avito.android.remote.model.category_parameters.ChildrenAgesParameter;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.avito.android.remote.model.category_parameters.DateTimeIntervalParameter;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import com.avito.android.remote.model.category_parameters.DateTimeRangeParameter;
import com.avito.android.remote.model.category_parameters.DirectionParameter;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.EditCategoryParameter;
import com.avito.android.remote.model.category_parameters.EmailParameter;
import com.avito.android.remote.model.category_parameters.EntryPointParameter;
import com.avito.android.remote.model.category_parameters.FileUploaderParameter;
import com.avito.android.remote.model.category_parameters.FiltersBackNavigationSlot;
import com.avito.android.remote.model.category_parameters.GroupParameter;
import com.avito.android.remote.model.category_parameters.GuestsSelectParameter;
import com.avito.android.remote.model.category_parameters.HeaderH2Parameter;
import com.avito.android.remote.model.category_parameters.HeaderH5Parameter;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.KeywordsParameter;
import com.avito.android.remote.model.category_parameters.LastSearchParameter;
import com.avito.android.remote.model.category_parameters.LocalPriorityParameter;
import com.avito.android.remote.model.category_parameters.LocationParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.MultiGeoParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.NumericParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.PhoneParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter;
import com.avito.android.remote.model.category_parameters.QuartersParameter;
import com.avito.android.remote.model.category_parameters.RadiusParameter;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectCategoryParameter;
import com.avito.android.remote.model.category_parameters.SelectDeepLinkParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.StrDurationDiscountsParameter;
import com.avito.android.remote.model.category_parameters.StrDurationDiscountsSelect;
import com.avito.android.remote.model.category_parameters.StrEarlyBookingDiscountParameter;
import com.avito.android.remote.model.category_parameters.SuggestLocationParameter;
import com.avito.android.remote.model.category_parameters.UnknownParameter;
import com.avito.android.remote.model.category_parameters.VideoParameter;
import com.avito.android.remote.model.category_parameters.VideoUploadParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.recommendation_cards.RecommendationCardsParameter;
import com.avito.android.remote.model.category_parameters.slot.BaseSlot;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.remote.model.search.suggest.SuggestDeeplink;
import com.avito.android.remote.model.search.suggest.SuggestNewQuery;
import com.avito.android.remote.model.search.suggest.SuggestSetFieldValue;
import com.avito.android.remote.parse.adapter.C34371n;
import com.avito.android.remote.parse.adapter.CharParameterTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.CommonNumberParameterTypeAdapter;
import com.avito.android.remote.parse.adapter.HiddenParameterTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.N;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import com.google.gson.r;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import kotlin.collections.C42756l;
import se0.C48165a;

/* compiled from: PublishJsonModule_ProvideTypeAdapterFactoriesFactory.java */
@e
@x
@y
/* loaded from: classes16.dex */
public final class c implements h<Set<r>> {

    /* compiled from: PublishJsonModule_ProvideTypeAdapterFactoriesFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f237463a = new c();
    }

    public static c a() {
        return a.f237463a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.network.module.a.f237461a.getClass();
        RuntimeTypeAdapterFactory.f254218g.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = new RuntimeTypeAdapterFactory(CategoryPublishStep.class);
        runtimeTypeAdapterFactory.b(CategoryPublishStep.Wizard.class, "wizard", null);
        runtimeTypeAdapterFactory.b(CategoryPublishStep.Params.class, "params", null);
        runtimeTypeAdapterFactory.b(CategoryPublishStep.Select.class, "select", null);
        runtimeTypeAdapterFactory.b(CategoryPublishStep.Vin.class, "vin", null);
        runtimeTypeAdapterFactory.b(CategoryPublishStep.Premoderation.class, "premoderation", null);
        runtimeTypeAdapterFactory.b(CategoryPublishStep.Accordion.class, "accordion", null);
        runtimeTypeAdapterFactory.b(CategoryPublishStep.SuggestCategory.class, "suggestCategory", null);
        runtimeTypeAdapterFactory.b(CategoryPublishStep.Request.class, "request", null);
        runtimeTypeAdapterFactory.b(CategoryPublishStep.Params.class, "contacts", null);
        runtimeTypeAdapterFactory.b(CategoryPublishStep.PriceList.class, "priceList", null);
        runtimeTypeAdapterFactory.b(CategoryPublishStep.Restriction.class, "restriction", null);
        new N();
        new C34371n();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory2 = new RuntimeTypeAdapterFactory(ParameterSlot.class);
        runtimeTypeAdapterFactory2.b(PhoneParameter.class, "phone", null);
        runtimeTypeAdapterFactory2.b(EditableParameter.class, IntParameter.TYPE, new CommonNumberParameterTypeAdapter());
        runtimeTypeAdapterFactory2.b(BooleanParameter.class, BooleanParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(FiltersBackNavigationSlot.class, FiltersBackNavigationSlot.TYPE, null);
        runtimeTypeAdapterFactory2.b(CategoryAndTypeParameter.class, CategoryAndTypeParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(NumericParameter.class, NumericParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(SelectParameter.Flat.class, "select", null);
        runtimeTypeAdapterFactory2.b(SelectParameter.Flat.class, "chips", null);
        runtimeTypeAdapterFactory2.b(SelectParameter.Sectioned.class, SelectParameter.Sectioned.TYPE, null);
        runtimeTypeAdapterFactory2.b(AddressParameter.class, AddressParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(MultiGeoParameter.class, MultiGeoParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(ObjectsParameter.class, ObjectsParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(DateTimeIntervalParameter.class, DateTimeIntervalParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(DateTimeRangeParameter.class, DateTimeRangeParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(DateTimeParameter.class, "date", null);
        runtimeTypeAdapterFactory2.b(MultiselectParameter.class, "multiselect", null);
        runtimeTypeAdapterFactory2.b(GuestsSelectParameter.class, GuestsSelectParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(SectionedMultiselectParameter.class, SectionedMultiselectParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(BottomSheetGroupParameter.class, BottomSheetGroupParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(EmailParameter.class, "email", null);
        runtimeTypeAdapterFactory2.b(LocationParameter.class, "location", null);
        runtimeTypeAdapterFactory2.b(RadiusParameter.class, "searchRadius", null);
        runtimeTypeAdapterFactory2.b(RadiusParameter.class, "radius", null);
        runtimeTypeAdapterFactory2.b(MetroParameter.class, MetroParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(DirectionParameter.class, "direction", null);
        runtimeTypeAdapterFactory2.b(DistrictParameter.class, DistrictParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(AddressesSearchParameter.class, AddressesSearchParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(SelectCategoryParameter.class, "category", null);
        runtimeTypeAdapterFactory2.b(PriceParameter.class, "price", null);
        runtimeTypeAdapterFactory2.b(GroupParameter.class, "group", null);
        runtimeTypeAdapterFactory2.b(HeaderH2Parameter.class, HeaderH2Parameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(HeaderH5Parameter.class, HeaderH5Parameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(CharParameter.class, "description", null);
        runtimeTypeAdapterFactory2.b(PhotoParameter.class, PhotoParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(EditCategoryParameter.class, EditCategoryParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(DateRangeParameter.class, DateRangeParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(DateRangeParameter.FormattedDateParameter.class, DateRangeParameter.FormattedDateParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(SelectDeepLinkParameter.class, SelectDeepLinkParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(VideoParameter.class, "video", null);
        runtimeTypeAdapterFactory2.b(VideoUploadParameter.class, VideoUploadParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(QuartersParameter.class, QuartersParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(HiddenParameter.class, HiddenParameter.TYPE, new HiddenParameterTypeAdapterFactory());
        runtimeTypeAdapterFactory2.f254223f = UnknownParameter.class;
        runtimeTypeAdapterFactory2.b(CharParameter.class, CharParameter.TYPE, new CharParameterTypeAdapterFactory());
        runtimeTypeAdapterFactory2.b(BeduinParameter.class, BeduinParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(KeywordsParameter.class, KeywordsParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(FileUploaderParameter.class, FileUploaderParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(CheckinCheckoutParameter.class, CheckinCheckoutParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(EntryPointParameter.class, EntryPointParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(PublishMethodWithAllSelectedValueParameter.class, PublishMethodWithAllSelectedValueParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(ChildrenAgesGroup.class, ChildrenAgesGroup.TYPE, null);
        runtimeTypeAdapterFactory2.b(ChildrenAgesParameter.class, ChildrenAgesParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(StrDurationDiscountsParameter.class, StrDurationDiscountsParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(StrDurationDiscountsSelect.class, StrDurationDiscountsSelect.TYPE, null);
        runtimeTypeAdapterFactory2.b(StrEarlyBookingDiscountParameter.class, StrEarlyBookingDiscountParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(BannerCheckBoxWithImageParameter.class, BannerCheckBoxWithImageParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(LocalPriorityParameter.class, "localPriority", null);
        runtimeTypeAdapterFactory2.b(SuggestLocationParameter.class, "suggestLocation", null);
        runtimeTypeAdapterFactory2.b(RecommendationCardsParameter.class, RecommendationCardsParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(LastSearchParameter.class, LastSearchParameter.TYPE, null);
        runtimeTypeAdapterFactory2.b(BaseSlot.class, "slot", null);
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, SuggestAction.class);
        optimalRuntimeTypeAdapterFactoryA.b(SuggestNewQuery.class, "new_query");
        optimalRuntimeTypeAdapterFactoryA.b(SuggestAnalyticsEvent.class, "clickstream");
        optimalRuntimeTypeAdapterFactoryA.b(SuggestDeeplink.class, Constants.DEEPLINK);
        optimalRuntimeTypeAdapterFactoryA.b(SuggestSetFieldValue.class, "setFieldValue");
        C48165a.f437939a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactory = new OptimalRuntimeTypeAdapterFactory(ContinuePublishAction.class);
        optimalRuntimeTypeAdapterFactory.b(ContinuePublishAction.ContinuePublish.class, "continuePublish");
        optimalRuntimeTypeAdapterFactory.b(ContinuePublishAction.PerformDeeplink.class, "performDeeplink");
        C15372a.f15830a.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory3 = new RuntimeTypeAdapterFactory(RecommendationCardsParameter.ParameterCard.class);
        runtimeTypeAdapterFactory3.b(RecommendationCardsParameter.ParameterCard.Select.class, "select", null);
        runtimeTypeAdapterFactory3.b(RecommendationCardsParameter.ParameterCard.MultiSelect.class, "multiselect", null);
        Set setL0 = C42756l.l0(new r[]{runtimeTypeAdapterFactory, runtimeTypeAdapterFactory2, optimalRuntimeTypeAdapterFactoryA, optimalRuntimeTypeAdapterFactory, runtimeTypeAdapterFactory3});
        t.d(setL0);
        return setL0;
    }
}
