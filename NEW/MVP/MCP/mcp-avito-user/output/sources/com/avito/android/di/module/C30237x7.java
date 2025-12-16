package com.avito.android.di.module;

import com.avito.android.remote.model.ConstructorAdvertNetworkModel;
import com.avito.android.remote.model.category_parameters.AddressesSearchParameter;
import com.avito.android.remote.model.category_parameters.BeduinParameter;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.GuestsSelectParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.QuartersParameter;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.gallery.GalleryHeaderWidget;
import com.avito.android.remote.model.replace_main_widget.ReplaceMainPageWidget;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.map.Marker;
import com.avito.android.remote.model.search.map.Pin;
import com.avito.android.remote.model.section.complementary_v3.SectionElementV3;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.parse.adapter.AdditionalItemValueTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.TabletDisplayTypeFallbackTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.inline_filters.InlineFilterTypeAdapterFactory;
import com.avito.android.remote.parse.adapter.stream_gson.OptimalRuntimeTypeAdapterFactory;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;

/* compiled from: SearchJsonModule_ProvideCommonTypeAdapterFactoriesFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/di/module/x7;", "Ldagger/internal/h;", "", "Lcom/google/gson/r;", "LX41/o;", "a", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.x7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30237x7 implements dagger.internal.h<Set<com.google.gson.r>> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f144705b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.parse.adapter.S f144706a;

    /* compiled from: SearchJsonModule_ProvideCommonTypeAdapterFactoriesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/x7$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.x7$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30237x7(@Y61.k com.avito.android.remote.parse.adapter.S s5) {
        this.f144706a = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.remote.parse.adapter.Q q12 = (com.avito.android.remote.parse.adapter.Q) this.f144706a.get();
        f144705b.getClass();
        int i12 = C30226w7.f144694a;
        new com.avito.android.remote.parse.adapter.E();
        RuntimeTypeAdapterFactory.f254218g.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = new RuntimeTypeAdapterFactory(Marker.class);
        runtimeTypeAdapterFactory.b(Pin.class, "pin", null);
        InlineFilterTypeAdapterFactory.f254266c.getClass();
        InlineFilterTypeAdapterFactory inlineFilterTypeAdapterFactory = new InlineFilterTypeAdapterFactory(kotlin.collections.P0.g(new kotlin.Q("shortcut", InlineFilterValue.InlineFilterShortcutValue.class), new kotlin.Q("select", InlineFilterValue.InlineFilterSelectValue.class), new kotlin.Q("checkbox", InlineFilterValue.InlineFilterSelectValue.class), new kotlin.Q("multiselect", InlineFilterValue.InlineFilterMultiSelectValue.class), new kotlin.Q(GuestsSelectParameter.TYPE, InlineFilterValue.InlineFilterGuestsSelectValue.class), new kotlin.Q(SectionedMultiselectParameter.TYPE, InlineFilterValue.InlineFilterSectionedMultiSelectValue.class), new kotlin.Q("radioSelect", InlineFilterValue.InlineFilterSelectValue.class), new kotlin.Q("numericRange", InlineFilterValue.InlineFilterNumericRangeValue.class), new kotlin.Q(DateRangeParameter.FormattedDateParameter.TYPE, InlineFilterValue.InlineFilterDateRangeValue.class), new kotlin.Q("segmented", InlineFilterValue.InlineFilterSelectValue.class), new kotlin.Q("suggest", InlineFilterValue.InlineFilterSelectValue.class), new kotlin.Q("searchRadius", InlineFilterValue.InlineRadiusValue.class), new kotlin.Q("radius", InlineFilterValue.InlineFilterRadiusSelectValue.class), new kotlin.Q("chips", InlineFilterValue.InlineFilterMultiSelectValue.class), new kotlin.Q(ServiceTransportationWidget.LocationField.COORDINATES, InlineFilterValue.InlineSearchCoordinatesValue.class), new kotlin.Q(MetroParameter.TYPE, InlineFilterValue.InlineFilterMetroValue.class), new kotlin.Q(DistrictParameter.TYPE, InlineFilterValue.InlineFilterDistrictValue.class), new kotlin.Q("direction", InlineFilterValue.InlineFilterDirectionValue.class), new kotlin.Q(AddressesSearchParameter.TYPE, InlineFilterValue.InlineFilterAddressesValue.class), new kotlin.Q("location", InlineFilterValue.InlineFilterLocationValue.class), new kotlin.Q("categoryNodes", InlineFilterValue.InlineCategoryNodesValue.class), new kotlin.Q("profileCategoryNodes", InlineFilterValue.InlineCategoryNodesValue.class), new kotlin.Q("avitoBlackCategoryNodes", InlineFilterValue.InlineCategoryNodesValue.class), new kotlin.Q(BeduinParameter.TYPE, InlineFilterValue.InlineFilterSelectValue.class), new kotlin.Q(QuartersParameter.TYPE, InlineFilterValue.InlineFilterNumericRangeValue.class), new kotlin.Q("suggestLocation", InlineFilterValue.InlineFilterSuggestLocationValue.class), new kotlin.Q("localPriority", InlineFilterValue.InlineFilterLocalPriorityValue.class)));
        com.avito.android.remote.Z0.f253066a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactoryA = OptimalRuntimeTypeAdapterFactory.a.a(OptimalRuntimeTypeAdapterFactory.f254296d, SectionElementV3.class);
        optimalRuntimeTypeAdapterFactoryA.b(ConstructorAdvertNetworkModel.class, "itemConstructorized");
        TabletDisplayTypeFallbackTypeAdapterFactory tabletDisplayTypeFallbackTypeAdapterFactory = new TabletDisplayTypeFallbackTypeAdapterFactory(q12);
        com.avito.android.remote.parse.adapter.A.f254143a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactory = new OptimalRuntimeTypeAdapterFactory(GalleryHeaderWidget.Button.class);
        optimalRuntimeTypeAdapterFactory.b(GalleryHeaderWidget.ActiveButton.class, "active");
        optimalRuntimeTypeAdapterFactory.b(GalleryHeaderWidget.InactiveButton.class, "inactive");
        com.avito.android.remote.parse.adapter.O.f254200a.getClass();
        OptimalRuntimeTypeAdapterFactory optimalRuntimeTypeAdapterFactory2 = new OptimalRuntimeTypeAdapterFactory(ReplaceMainPageWidget.class);
        optimalRuntimeTypeAdapterFactory2.b(ReplaceMainPageWidget.ReplaceMain.class, "replaceMain");
        optimalRuntimeTypeAdapterFactory2.b(ReplaceMainPageWidget.ShowAvito.class, "showAvito");
        Set setL0 = C42756l.l0(new com.google.gson.r[]{runtimeTypeAdapterFactory, inlineFilterTypeAdapterFactory, optimalRuntimeTypeAdapterFactoryA, tabletDisplayTypeFallbackTypeAdapterFactory, optimalRuntimeTypeAdapterFactory, optimalRuntimeTypeAdapterFactory2, new AdditionalItemValueTypeAdapterFactory()});
        dagger.internal.t.b(setL0, "Cannot return null from a non-@Nullable @Provides method");
        return setL0;
    }
}
