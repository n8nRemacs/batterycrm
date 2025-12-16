package com.avito.android.inline_filters.dialog;

import EN.b;
import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.B2;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.Theme;
import com.avito.android.inline_filters.InlineFiltersCommonViewInfo;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31046f;
import com.avito.android.inline_filters.W;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerConfig;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerMode;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerType;
import com.avito.android.inline_filters.calendar.FiltersCalendarPickerUiConfig;
import com.avito.android.inline_filters.calendar.SelectedDateRange;
import com.avito.android.inline_filters.dialog.InlineFilterDialogOpener;
import com.avito.android.inline_filters.dialog.calendar.C31003c;
import com.avito.android.inline_filters.dialog.category_nodes.C31009d;
import com.avito.android.inline_filters.dialog.location_group.C31013b;
import com.avito.android.inline_filters.dialog.location_group.LocationGroupFilterData;
import com.avito.android.inline_filters.dialog.select.C31039i;
import com.avito.android.location_picker.analytics.LocationPickerScreenOpenEvent;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.search.ConfigCalendarSelectionType;
import com.avito.android.remote.model.search.ConfigWidgetType;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.suggest_locations.OpenEventFromBlock;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import lE.C43624b;

/* compiled from: InlineFilterDialogFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/d;", "Lcom/avito/android/inline_filters/dialog/b;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.dialog.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31010d implements InterfaceC30999b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Activity f171532a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.x f171533b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final s f171534c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final B2 f171535d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C43624b f171536e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.inline_filters.dialog.calendar.date_range.a f171537f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f171538g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f171539h;

    /* compiled from: InlineFilterDialogFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.inline_filters.dialog.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171540a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f171541b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f171542c;

        static {
            int[] iArr = new int[ConfigCalendarSelectionType.values().length];
            try {
                iArr[ConfigCalendarSelectionType.SINGLE_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConfigCalendarSelectionType.DATE_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f171540a = iArr;
            int[] iArr2 = new int[WidgetType.values().length];
            try {
                iArr2[WidgetType.Select.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[WidgetType.NumericRange.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WidgetType.Multiselect.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[WidgetType.Direction.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[WidgetType.District.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[WidgetType.Calendar.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[WidgetType.Suggest.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[WidgetType.SearchRadius.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[WidgetType.RadioSelect.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[WidgetType.Group.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[WidgetType.SuggestLocation.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[WidgetType.Location.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[WidgetType.Addresses.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[WidgetType.Metro.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[WidgetType.AvitoBlackCategoryNodes.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[WidgetType.ProfileCategoryNodes.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[WidgetType.CategoryNodes.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[WidgetType.Quarters.ordinal()] = 18;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[WidgetType.CategoryWithParams.ordinal()] = 19;
            } catch (NoSuchFieldError unused21) {
            }
            f171541b = iArr2;
            int[] iArr3 = new int[InlineFilterDialogOpener.Source.values().length];
            try {
                InlineFilterDialogOpener.Source source = InlineFilterDialogOpener.Source.f171141b;
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                InlineFilterDialogOpener.Source source2 = InlineFilterDialogOpener.Source.f171141b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                InlineFilterDialogOpener.Source source3 = InlineFilterDialogOpener.Source.f171141b;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            f171542c = iArr3;
        }
    }

    /* compiled from: InlineFilterDialogFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEN/b;", "result", "Lkotlin/G0;", "invoke", "(LEN/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.inline_filters.dialog.d$b */
    public static final class b extends N implements Y41.l<EN.b, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f171544m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f171545n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Filter f171546o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.a<G0> aVar, Y41.p<? super Filter, ? super InlineFilterValue, G0> pVar, Filter filter) {
            super(1);
            this.f171544m = (N) aVar;
            this.f171545n = (N) pVar;
            this.f171546o = filter;
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [Y41.p, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r3v3, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(EN.b bVar) {
            EN.b bVar2 = bVar;
            if (bVar2 instanceof b.a ? true : bVar2 instanceof b.d ? true : bVar2 instanceof b.C0228b) {
                C31010d.this.f171537f.getClass();
                InlineFilterValue.InlineFilterDateRangeValue inlineFilterDateRangeValueA = com.avito.android.inline_filters.dialog.calendar.date_range.a.a(bVar2);
                if (inlineFilterDateRangeValueA != null) {
                    this.f171545n.invoke(this.f171546o, inlineFilterDateRangeValueA);
                }
            } else if (bVar2.equals(b.c.f3941a)) {
                this.f171544m.invoke();
            }
            return G0.f406611a;
        }
    }

    @Inject
    public C31010d(@Y61.k Activity activity, @Y61.k com.avito.android.select.x xVar, @Y61.k s sVar, @Y61.k B2 b22, @Y61.k C43624b c43624b, @Y61.k com.avito.android.inline_filters.dialog.calendar.date_range.a aVar, @Y61.k com.avito.android.util.text.a aVar2) {
        this.f171532a = activity;
        this.f171533b = xVar;
        this.f171534c = sVar;
        this.f171535d = b22;
        this.f171536e = c43624b;
        this.f171537f = aVar;
        this.f171538g = aVar2;
        this.f171539h = ((ActivityC22955m) activity).getSupportFragmentManager();
    }

    @Override // com.avito.android.inline_filters.dialog.InterfaceC30999b
    @Y61.l
    public final AbstractC30998a<E> a(@Y61.l Fragment fragment, @Y61.k Filter filter, @Y61.k List<com.avito.android.inline_filters.dialog.select.adapter.i> list, @Y61.l Parcelable parcelable, @Y61.l SearchParams searchParams, @Y61.l InterfaceC30995b interfaceC30995b, @Y61.l W w12, @Y61.l InterfaceC31046f interfaceC31046f, @Y61.l com.avito.android.location.r rVar, @Y61.l CN.f fVar, @Y61.l com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l PresentationType presentationType, @Y61.l Map<String, String> map, @Y61.l InlineFilterDialogOpener.Source source, @Y61.k Y41.p<? super Filter, ? super InlineFilterValue, G0> pVar, @Y61.l Y41.l<? super LocationGroupFilterData, G0> lVar, @Y61.k Y41.p<? super DeepLink, ? super Boolean, G0> pVar2, @Y61.l Y41.p<? super DeepLink, ? super Boolean, G0> pVar3, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.l<? super Integer, G0> lVar2, @Y61.l Y41.l<? super Integer, G0> lVar3, @Y61.l MetroResponseBody metroResponseBody, @Y61.l InlineFiltersCommonViewInfo inlineFiltersCommonViewInfo, @Y61.l String str, @Y61.l String str2, @Y61.l Filter filter2, @Y61.l Filter filter3, @Y61.l Y41.l<? super List<? extends Q<Filter, ? extends InlineFilterValue>>, G0> lVar4) {
        Filter.Config config;
        Filter.Config config2;
        List<Filter.OptionsGroup> groups;
        Integer monthLimit;
        FiltersCalendarPickerMode normal;
        Filter.Config config3;
        Boolean withSkipButton;
        String title;
        Filter.Config config4;
        Filter.Config config5;
        Filter.Config config6;
        Filter.Displaying displaying;
        Filter.Config config7;
        Filter.Displaying displaying2;
        Filter.Config config8;
        Filter.Config config9;
        Filter.Displaying displaying3;
        Context contextA = com.avito.android.lib.deprecated_design.f.a(this.f171532a, Theme.AVITO_RE_23.f133713b);
        Filter.Widget widget = filter.getWidget();
        AbstractC30998a<E> eVar = null;
        eventSource = null;
        LocationPickerScreenOpenEvent.EventSource eventSource = null;
        resetDisabled = null;
        Boolean resetDisabled = null;
        widgetType = null;
        ConfigWidgetType widgetType = null;
        WidgetType type = widget != null ? widget.getType() : null;
        switch (type == null ? -1 : a.f171541b[type.ordinal()]) {
            case 1:
                return new com.avito.android.inline_filters.dialog.select.E(contextA, filter, list, parcelable, pVar, aVar2, lVar2, aVar, R.style.Re23_BottomSheet_Default);
            case 2:
                Filter.Widget widget2 = filter.getWidget();
                if (widget2 != null && (config = widget2.getConfig()) != null) {
                    widgetType = config.getWidgetType();
                }
                return widgetType == ConfigWidgetType.SELECT ? new com.avito.android.inline_filters.dialog.numeric_range_select.v(contextA, filter, parcelable, pVar, aVar2, this.f171539h) : new com.avito.android.inline_filters.dialog.range.g(contextA, filter, parcelable, pVar, aVar2, R.style.Re23_BottomSheet_Default);
            case 3:
                Filter.Widget widget3 = filter.getWidget();
                return ((widget3 == null || (config2 = widget3.getConfig()) == null || (groups = config2.getGroups()) == null) ? 0 : groups.size()) > 0 ? new ON.a(contextA, this.f171539h, filter, this.f171533b, list, pVar, aVar2) : new C31039i(contextA, filter, list, parcelable, pVar, aVar2, aVar, inlineFiltersCommonViewInfo, R.style.Re23_BottomSheet_Default);
            case 4:
            case 5:
                return new C31039i(contextA, filter, list, parcelable, pVar, aVar2, aVar, inlineFiltersCommonViewInfo, R.style.Re23_BottomSheet_Default);
            case 6:
                Filter.Widget widget4 = filter.getWidget();
                boolean zF2 = (widget4 == null || (config9 = widget4.getConfig()) == null || (displaying3 = config9.getDisplaying()) == null) ? false : L.f(displaying3.getPreventClose(), Boolean.TRUE);
                Filter.Widget widget5 = filter.getWidget();
                ConfigCalendarSelectionType calendarSelectionType = (widget5 == null || (config8 = widget5.getConfig()) == null) ? null : config8.getCalendarSelectionType();
                i = calendarSelectionType != null ? a.f171540a[calendarSelectionType.ordinal()] : -1;
                FiltersCalendarPickerType filtersCalendarPickerType = i != 1 ? i != 2 ? FiltersCalendarPickerType.f171051c : FiltersCalendarPickerType.f171051c : FiltersCalendarPickerType.f171050b;
                C43624b c43624b = this.f171536e;
                c43624b.getClass();
                kotlin.reflect.n<Object> nVar = C43624b.f413639o[6];
                if (((Boolean) c43624b.f413646h.a().invoke()).booleanValue()) {
                    Filter.Widget widget6 = filter.getWidget();
                    monthLimit = (widget6 == null || (config7 = widget6.getConfig()) == null || (displaying2 = config7.getDisplaying()) == null) ? null : displaying2.getMonthLimit();
                } else {
                    monthLimit = 7;
                }
                InlineFilterValue value = filter.getValue();
                InlineFilterValue.InlineFilterDateRangeValue inlineFilterDateRangeValue = value instanceof InlineFilterValue.InlineFilterDateRangeValue ? (InlineFilterValue.InlineFilterDateRangeValue) value : null;
                if (zF2) {
                    Filter.Widget widget7 = filter.getWidget();
                    normal = new FiltersCalendarPickerMode.Strict((widget7 == null || (config6 = widget7.getConfig()) == null || (displaying = config6.getDisplaying()) == null) ? null : displaying.getButtonTitle());
                } else {
                    Filter.Widget widget8 = filter.getWidget();
                    if (widget8 != null && (config3 = widget8.getConfig()) != null && (withSkipButton = config3.getWithSkipButton()) != null) {
                        zBooleanValue = withSkipButton.booleanValue();
                    }
                    normal = new FiltersCalendarPickerMode.Normal(zBooleanValue);
                }
                b bVar = new b(aVar2, pVar, filter);
                FiltersCalendarPickerConfig filtersCalendarPickerConfig = new FiltersCalendarPickerConfig(new SelectedDateRange(inlineFilterDateRangeValue != null ? inlineFilterDateRangeValue.getFrom() : null, inlineFilterDateRangeValue != null ? inlineFilterDateRangeValue.getTo() : null), filtersCalendarPickerType, monthLimit, null);
                Filter.Widget widget9 = filter.getWidget();
                if (widget9 == null || (config5 = widget9.getConfig()) == null || (title = config5.getCustomTitle()) == null) {
                    title = filter.getTitle();
                }
                Filter.Widget widget10 = filter.getWidget();
                if (widget10 != null && (config4 = widget10.getConfig()) != null) {
                    resetDisabled = config4.getResetDisabled();
                }
                return new C31003c(contextA, bVar, parcelable, filtersCalendarPickerConfig, new FiltersCalendarPickerUiConfig(title, normal, resetDisabled));
            case 7:
                return new com.avito.android.inline_filters.dialog.suggest.b(contextA, filter, parcelable, searchParams, pVar, aVar2, lVar2, R.style.Re23_BottomSheet_Default);
            case 8:
                if (source != null && a.f171542c[source.ordinal()] == 1) {
                    eventSource = LocationPickerScreenOpenEvent.EventSource.f182200d;
                }
                return new com.avito.android.inline_filters.dialog.search_radius.b(contextA, filter, searchParams, eventSource, this.f171539h, pVar, aVar2, lVar2, inlineFiltersCommonViewInfo, str, R.style.Re23_BottomSheet_Default);
            case 9:
                return new com.avito.android.inline_filters.dialog.select.B(contextA, filter, interfaceC31046f, searchParams, list, parcelable, pVar, aVar2);
            case 10:
                return L.f(filter.getId(), "locationGroup") ? new C31013b(fragment, this.f171539h, contextA, filter, map, this, interfaceC30995b, w12, interfaceC31046f, rVar, fVar, presentationType, str2, source, lVar, searchParams, parcelable, pVar2, aVar2, filter2, filter3, this.f171535d, false, false, null, R.style.Re23_BottomSheet_Default, this.f171538g, 29360128, null) : new com.avito.android.inline_filters.dialog.group.b(contextA, filter, parcelable, this.f171534c, inlineFiltersCommonViewInfo, lVar4, aVar2, aVar);
            case 11:
            case 12:
                int i12 = source == null ? -1 : a.f171542c[source.ordinal()];
                if (i12 == 1) {
                    OpenEventFromBlock[] openEventFromBlockArr = OpenEventFromBlock.f292117b;
                    i = 11;
                } else if (i12 == 2) {
                    OpenEventFromBlock[] openEventFromBlockArr2 = OpenEventFromBlock.f292117b;
                    i = 12;
                } else if (i12 != 3) {
                    OpenEventFromBlock[] openEventFromBlockArr3 = OpenEventFromBlock.f292117b;
                } else {
                    OpenEventFromBlock[] openEventFromBlockArr4 = OpenEventFromBlock.f292117b;
                    i = 14;
                }
                int i13 = i;
                Filter.Widget widget11 = filter.getWidget();
                eVar = new com.avito.android.inline_filters.dialog.suggest_location.e(contextA, filter, rVar, i13, searchParams, this.f171539h, pVar, lVar2, lVar3, R.style.Re23_BottomSheet_Default, Boolean.valueOf((widget11 != null ? widget11.getType() : null) == WidgetType.SuggestLocation));
                break;
            case 13:
                eVar = new com.avito.android.inline_filters.dialog.addresses.d(contextA, filter, searchParams, this.f171539h, pVar, lVar2);
                break;
            case 14:
                eVar = new com.avito.android.inline_filters.dialog.metro.c(contextA, filter, metroResponseBody, searchParams, this.f171539h, pVar, aVar2, lVar2, R.style.Re23_BottomSheet_Default);
                break;
            case 15:
            case 16:
            case 17:
                eVar = new C31009d(contextA, filter, fVar, aVar, parcelable, pVar2, pVar3, aVar2);
                break;
            case 18:
                eVar = new com.avito.android.inline_filters.dialog.select.r(contextA, filter, list, parcelable, pVar, aVar2, R.style.Re23_BottomSheet_Default, false, false, 384, null);
                break;
            case 19:
                eVar = new com.avito.android.inline_filters.dialog.category_with_params.a(contextA, filter, this.f171539h, aVar, interfaceC30995b, map, searchParams, presentationType, str2, pVar, aVar2);
                break;
        }
        return eVar;
    }
}
