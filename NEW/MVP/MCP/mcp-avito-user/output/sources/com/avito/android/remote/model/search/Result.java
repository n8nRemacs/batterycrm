package com.avito.android.remote.model.search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: InlineFilters.kt */
@d
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b*\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b-\u0010'J\u0012\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b2\u0010'J\u0012\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b3\u0010,J\u0012\u00104\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b6\u00107JÖ\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u0010\u0010>\u001a\u00020=HÖ\u0001¢\u0006\u0004\b>\u0010?J\u001a\u0010C\u001a\u00020B2\b\u0010A\u001a\u0004\u0018\u00010@HÖ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020=HÖ\u0001¢\u0006\u0004\bE\u0010?J \u0010J\u001a\u00020I2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020=HÖ\u0001¢\u0006\u0004\bJ\u0010KR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010N\u001a\u0004\bO\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010P\u001a\u0004\bQ\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010P\u001a\u0004\bR\u0010$R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010S\u001a\u0004\bT\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010U\u001a\u0004\bV\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010U\u001a\u0004\bW\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010X\u001a\u0004\bY\u0010,R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\bZ\u0010'R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010[\u001a\u0004\b\\\u0010/R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010]\u001a\u0004\b^\u00101R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010S\u001a\u0004\b_\u0010'R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010X\u001a\u0004\b`\u0010,R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010a\u001a\u0004\bb\u00105R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010c\u001a\u0004\bd\u00107¨\u0006e"}, d2 = {"Lcom/avito/android/remote/model/search/Result;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/search/OnResult;", "onResult", "Lcom/avito/android/remote/model/search/Header;", "header", "Lcom/avito/android/remote/model/search/EntryPoint;", "topEntryPoint", "bottomEntryPoint", "", "Lcom/avito/android/remote/model/search/Filter;", "filters", "geoFilter", "actionHorizontalBlock", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/remote/model/search/Tab;", "tabs", "Lcom/avito/android/remote/model/search/TopWidget;", "topWidget", "Lcom/avito/android/remote/model/search/TabsConfig;", "tabsConfig", "Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetSubmitParam;", "submitParams", "additionalAction", "Lcom/avito/android/remote/model/search/Filter$Onboarding;", "filtersButtonOnboarding", "Lcom/avito/android/remote/model/search/MapEntryAction;", "mapEntryAction", "<init>", "(Lcom/avito/android/remote/model/search/OnResult;Lcom/avito/android/remote/model/search/Header;Lcom/avito/android/remote/model/search/EntryPoint;Lcom/avito/android/remote/model/search/EntryPoint;Ljava/util/List;Lcom/avito/android/remote/model/search/Filter;Lcom/avito/android/remote/model/search/Filter;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Lcom/avito/android/remote/model/search/TopWidget;Lcom/avito/android/remote/model/search/TabsConfig;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/search/Filter$Onboarding;Lcom/avito/android/remote/model/search/MapEntryAction;)V", "component1", "()Lcom/avito/android/remote/model/search/OnResult;", "component2", "()Lcom/avito/android/remote/model/search/Header;", "component3", "()Lcom/avito/android/remote/model/search/EntryPoint;", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/avito/android/remote/model/search/Filter;", "component7", "component8", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component9", "component10", "()Lcom/avito/android/remote/model/search/TopWidget;", "component11", "()Lcom/avito/android/remote/model/search/TabsConfig;", "component12", "component13", "component14", "()Lcom/avito/android/remote/model/search/Filter$Onboarding;", "component15", "()Lcom/avito/android/remote/model/search/MapEntryAction;", "copy", "(Lcom/avito/android/remote/model/search/OnResult;Lcom/avito/android/remote/model/search/Header;Lcom/avito/android/remote/model/search/EntryPoint;Lcom/avito/android/remote/model/search/EntryPoint;Ljava/util/List;Lcom/avito/android/remote/model/search/Filter;Lcom/avito/android/remote/model/search/Filter;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Lcom/avito/android/remote/model/search/TopWidget;Lcom/avito/android/remote/model/search/TabsConfig;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/search/Filter$Onboarding;Lcom/avito/android/remote/model/search/MapEntryAction;)Lcom/avito/android/remote/model/search/Result;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/search/OnResult;", "getOnResult", "Lcom/avito/android/remote/model/search/Header;", "getHeader", "Lcom/avito/android/remote/model/search/EntryPoint;", "getTopEntryPoint", "getBottomEntryPoint", "Ljava/util/List;", "getFilters", "Lcom/avito/android/remote/model/search/Filter;", "getGeoFilter", "getActionHorizontalBlock", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "getTabs", "Lcom/avito/android/remote/model/search/TopWidget;", "getTopWidget", "Lcom/avito/android/remote/model/search/TabsConfig;", "getTabsConfig", "getSubmitParams", "getAdditionalAction", "Lcom/avito/android/remote/model/search/Filter$Onboarding;", "getFiltersButtonOnboarding", "Lcom/avito/android/remote/model/search/MapEntryAction;", "getMapEntryAction", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Result implements Parcelable {

    @k
    public static final Parcelable.Creator<Result> CREATOR = new Creator();

    @c("actionHorizontalBlock")
    @l
    private final Filter actionHorizontalBlock;

    @c("additionalAction")
    @l
    private final DeepLink additionalAction;

    @c("bottomEntryPoint")
    @l
    private final EntryPoint bottomEntryPoint;

    @c("filters")
    @l
    private final List<Filter> filters;

    @c("filtersButtonOnboarding")
    @l
    private final Filter.Onboarding filtersButtonOnboarding;

    @c("locationGroup")
    @l
    private final Filter geoFilter;

    @c("header")
    @l
    private final Header header;

    @c("mapEntryAction")
    @l
    private final MapEntryAction mapEntryAction;

    @c("onResult")
    @l
    private final OnResult onResult;

    @c("submitParams")
    @l
    private final List<SearchFormWidgetSubmitParam> submitParams;

    @c("tabs")
    @l
    private final List<Tab> tabs;

    @c("tabsConfig")
    @l
    private final TabsConfig tabsConfig;

    @c("topEntryPoint")
    @l
    private final EntryPoint topEntryPoint;

    @c("topWidget")
    @l
    private final TopWidget topWidget;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* compiled from: InlineFilters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Result> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Result createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            TabsConfig tabsConfig;
            OnResult onResultCreateFromParcel = parcel.readInt() == 0 ? null : OnResult.CREATOR.createFromParcel(parcel);
            Header headerCreateFromParcel = parcel.readInt() == 0 ? null : Header.CREATOR.createFromParcel(parcel);
            EntryPoint entryPointCreateFromParcel = parcel.readInt() == 0 ? null : EntryPoint.CREATOR.createFromParcel(parcel);
            EntryPoint entryPointCreateFromParcel2 = parcel.readInt() == 0 ? null : EntryPoint.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(Filter.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            Filter filterCreateFromParcel = parcel.readInt() == 0 ? null : Filter.CREATOR.createFromParcel(parcel);
            Filter filterCreateFromParcel2 = parcel.readInt() == 0 ? null : Filter.CREATOR.createFromParcel(parcel);
            DeepLink deepLink = (DeepLink) parcel.readParcelable(Result.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iC4 = 0;
                while (iC4 != i13) {
                    iC4 = a.c(Tab.CREATOR, parcel, arrayList4, iC4, 1);
                }
                arrayList2 = arrayList4;
            }
            TopWidget topWidgetCreateFromParcel = parcel.readInt() == 0 ? null : TopWidget.CREATOR.createFromParcel(parcel);
            TabsConfig tabsConfigCreateFromParcel = parcel.readInt() == 0 ? null : TabsConfig.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                tabsConfig = tabsConfigCreateFromParcel;
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList3 = new ArrayList(i14);
                while (iC2 != i14) {
                    iC2 = a.c(SearchFormWidgetSubmitParam.CREATOR, parcel, arrayList3, iC2, 1);
                    i14 = i14;
                    tabsConfigCreateFromParcel = tabsConfigCreateFromParcel;
                }
                tabsConfig = tabsConfigCreateFromParcel;
            }
            return new Result(onResultCreateFromParcel, headerCreateFromParcel, entryPointCreateFromParcel, entryPointCreateFromParcel2, arrayList, filterCreateFromParcel, filterCreateFromParcel2, deepLink, arrayList2, topWidgetCreateFromParcel, tabsConfig, arrayList3, (DeepLink) parcel.readParcelable(Result.class.getClassLoader()), parcel.readInt() == 0 ? null : Filter.Onboarding.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MapEntryAction.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Result[] newArray(int i12) {
            return new Result[i12];
        }
    }

    public Result(@l OnResult onResult, @l Header header, @l EntryPoint entryPoint, @l EntryPoint entryPoint2, @l List<Filter> list, @l Filter filter, @l Filter filter2, @l DeepLink deepLink, @l List<Tab> list2, @l TopWidget topWidget, @l TabsConfig tabsConfig, @l List<SearchFormWidgetSubmitParam> list3, @l DeepLink deepLink2, @l Filter.Onboarding onboarding, @l MapEntryAction mapEntryAction) {
        this.onResult = onResult;
        this.header = header;
        this.topEntryPoint = entryPoint;
        this.bottomEntryPoint = entryPoint2;
        this.filters = list;
        this.geoFilter = filter;
        this.actionHorizontalBlock = filter2;
        this.uri = deepLink;
        this.tabs = list2;
        this.topWidget = topWidget;
        this.tabsConfig = tabsConfig;
        this.submitParams = list3;
        this.additionalAction = deepLink2;
        this.filtersButtonOnboarding = onboarding;
        this.mapEntryAction = mapEntryAction;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final OnResult getOnResult() {
        return this.onResult;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final TopWidget getTopWidget() {
        return this.topWidget;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final TabsConfig getTabsConfig() {
        return this.tabsConfig;
    }

    @l
    public final List<SearchFormWidgetSubmitParam> component12() {
        return this.submitParams;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final DeepLink getAdditionalAction() {
        return this.additionalAction;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final Filter.Onboarding getFiltersButtonOnboarding() {
        return this.filtersButtonOnboarding;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final MapEntryAction getMapEntryAction() {
        return this.mapEntryAction;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final EntryPoint getTopEntryPoint() {
        return this.topEntryPoint;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final EntryPoint getBottomEntryPoint() {
        return this.bottomEntryPoint;
    }

    @l
    public final List<Filter> component5() {
        return this.filters;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Filter getGeoFilter() {
        return this.geoFilter;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Filter getActionHorizontalBlock() {
        return this.actionHorizontalBlock;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    @l
    public final List<Tab> component9() {
        return this.tabs;
    }

    @k
    public final Result copy(@l OnResult onResult, @l Header header, @l EntryPoint topEntryPoint, @l EntryPoint bottomEntryPoint, @l List<Filter> filters, @l Filter geoFilter, @l Filter actionHorizontalBlock, @l DeepLink uri, @l List<Tab> tabs, @l TopWidget topWidget, @l TabsConfig tabsConfig, @l List<SearchFormWidgetSubmitParam> submitParams, @l DeepLink additionalAction, @l Filter.Onboarding filtersButtonOnboarding, @l MapEntryAction mapEntryAction) {
        return new Result(onResult, header, topEntryPoint, bottomEntryPoint, filters, geoFilter, actionHorizontalBlock, uri, tabs, topWidget, tabsConfig, submitParams, additionalAction, filtersButtonOnboarding, mapEntryAction);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Result)) {
            return false;
        }
        Result result = (Result) other;
        return L.f(this.onResult, result.onResult) && L.f(this.header, result.header) && L.f(this.topEntryPoint, result.topEntryPoint) && L.f(this.bottomEntryPoint, result.bottomEntryPoint) && L.f(this.filters, result.filters) && L.f(this.geoFilter, result.geoFilter) && L.f(this.actionHorizontalBlock, result.actionHorizontalBlock) && L.f(this.uri, result.uri) && L.f(this.tabs, result.tabs) && L.f(this.topWidget, result.topWidget) && L.f(this.tabsConfig, result.tabsConfig) && L.f(this.submitParams, result.submitParams) && L.f(this.additionalAction, result.additionalAction) && L.f(this.filtersButtonOnboarding, result.filtersButtonOnboarding) && L.f(this.mapEntryAction, result.mapEntryAction);
    }

    @l
    public final Filter getActionHorizontalBlock() {
        return this.actionHorizontalBlock;
    }

    @l
    public final DeepLink getAdditionalAction() {
        return this.additionalAction;
    }

    @l
    public final EntryPoint getBottomEntryPoint() {
        return this.bottomEntryPoint;
    }

    @l
    public final List<Filter> getFilters() {
        return this.filters;
    }

    @l
    public final Filter.Onboarding getFiltersButtonOnboarding() {
        return this.filtersButtonOnboarding;
    }

    @l
    public final Filter getGeoFilter() {
        return this.geoFilter;
    }

    @l
    public final Header getHeader() {
        return this.header;
    }

    @l
    public final MapEntryAction getMapEntryAction() {
        return this.mapEntryAction;
    }

    @l
    public final OnResult getOnResult() {
        return this.onResult;
    }

    @l
    public final List<SearchFormWidgetSubmitParam> getSubmitParams() {
        return this.submitParams;
    }

    @l
    public final List<Tab> getTabs() {
        return this.tabs;
    }

    @l
    public final TabsConfig getTabsConfig() {
        return this.tabsConfig;
    }

    @l
    public final EntryPoint getTopEntryPoint() {
        return this.topEntryPoint;
    }

    @l
    public final TopWidget getTopWidget() {
        return this.topWidget;
    }

    @l
    public final DeepLink getUri() {
        return this.uri;
    }

    public int hashCode() {
        OnResult onResult = this.onResult;
        int iHashCode = (onResult == null ? 0 : onResult.hashCode()) * 31;
        Header header = this.header;
        int iHashCode2 = (iHashCode + (header == null ? 0 : header.hashCode())) * 31;
        EntryPoint entryPoint = this.topEntryPoint;
        int iHashCode3 = (iHashCode2 + (entryPoint == null ? 0 : entryPoint.hashCode())) * 31;
        EntryPoint entryPoint2 = this.bottomEntryPoint;
        int iHashCode4 = (iHashCode3 + (entryPoint2 == null ? 0 : entryPoint2.hashCode())) * 31;
        List<Filter> list = this.filters;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Filter filter = this.geoFilter;
        int iHashCode6 = (iHashCode5 + (filter == null ? 0 : filter.hashCode())) * 31;
        Filter filter2 = this.actionHorizontalBlock;
        int iHashCode7 = (iHashCode6 + (filter2 == null ? 0 : filter2.hashCode())) * 31;
        DeepLink deepLink = this.uri;
        int iHashCode8 = (iHashCode7 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        List<Tab> list2 = this.tabs;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        TopWidget topWidget = this.topWidget;
        int iHashCode10 = (iHashCode9 + (topWidget == null ? 0 : topWidget.hashCode())) * 31;
        TabsConfig tabsConfig = this.tabsConfig;
        int iHashCode11 = (iHashCode10 + (tabsConfig == null ? 0 : tabsConfig.hashCode())) * 31;
        List<SearchFormWidgetSubmitParam> list3 = this.submitParams;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        DeepLink deepLink2 = this.additionalAction;
        int iHashCode13 = (iHashCode12 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        Filter.Onboarding onboarding = this.filtersButtonOnboarding;
        int iHashCode14 = (iHashCode13 + (onboarding == null ? 0 : onboarding.hashCode())) * 31;
        MapEntryAction mapEntryAction = this.mapEntryAction;
        return iHashCode14 + (mapEntryAction != null ? mapEntryAction.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Result(onResult=" + this.onResult + ", header=" + this.header + ", topEntryPoint=" + this.topEntryPoint + ", bottomEntryPoint=" + this.bottomEntryPoint + ", filters=" + this.filters + ", geoFilter=" + this.geoFilter + ", actionHorizontalBlock=" + this.actionHorizontalBlock + ", uri=" + this.uri + ", tabs=" + this.tabs + ", topWidget=" + this.topWidget + ", tabsConfig=" + this.tabsConfig + ", submitParams=" + this.submitParams + ", additionalAction=" + this.additionalAction + ", filtersButtonOnboarding=" + this.filtersButtonOnboarding + ", mapEntryAction=" + this.mapEntryAction + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        OnResult onResult = this.onResult;
        if (onResult == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onResult.writeToParcel(parcel, flags);
        }
        Header header = this.header;
        if (header == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            header.writeToParcel(parcel, flags);
        }
        EntryPoint entryPoint = this.topEntryPoint;
        if (entryPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entryPoint.writeToParcel(parcel, flags);
        }
        EntryPoint entryPoint2 = this.bottomEntryPoint;
        if (entryPoint2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            entryPoint2.writeToParcel(parcel, flags);
        }
        List<Filter> list = this.filters;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Filter) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Filter filter = this.geoFilter;
        if (filter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            filter.writeToParcel(parcel, flags);
        }
        Filter filter2 = this.actionHorizontalBlock;
        if (filter2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            filter2.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.uri, flags);
        List<Tab> list2 = this.tabs;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((Tab) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        TopWidget topWidget = this.topWidget;
        if (topWidget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            topWidget.writeToParcel(parcel, flags);
        }
        TabsConfig tabsConfig = this.tabsConfig;
        if (tabsConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tabsConfig.writeToParcel(parcel, flags);
        }
        List<SearchFormWidgetSubmitParam> list3 = this.submitParams;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                ((SearchFormWidgetSubmitParam) itA3.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeParcelable(this.additionalAction, flags);
        Filter.Onboarding onboarding = this.filtersButtonOnboarding;
        if (onboarding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            onboarding.writeToParcel(parcel, flags);
        }
        MapEntryAction mapEntryAction = this.mapEntryAction;
        if (mapEntryAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mapEntryAction.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ Result(OnResult onResult, Header header, EntryPoint entryPoint, EntryPoint entryPoint2, List list, Filter filter, Filter filter2, DeepLink deepLink, List list2, TopWidget topWidget, TabsConfig tabsConfig, List list3, DeepLink deepLink2, Filter.Onboarding onboarding, MapEntryAction mapEntryAction, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : onResult, header, (i12 & 4) != 0 ? null : entryPoint, (i12 & 8) != 0 ? null : entryPoint2, list, (i12 & 32) != 0 ? null : filter, (i12 & 64) != 0 ? null : filter2, deepLink, (i12 & 256) != 0 ? null : list2, (i12 & 512) != 0 ? null : topWidget, (i12 & 1024) != 0 ? null : tabsConfig, (i12 & 2048) != 0 ? null : list3, (i12 & 4096) != 0 ? null : deepLink2, (i12 & 8192) != 0 ? null : onboarding, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : mapEntryAction);
    }
}
