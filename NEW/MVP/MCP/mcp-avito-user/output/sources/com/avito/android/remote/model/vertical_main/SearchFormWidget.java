package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.HeaderToolbarElement;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: SearchFormWidget.kt */
@d
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0087\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010,R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b-\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR(\u0010H\u001a\u00020G8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bH\u0010I\u0012\u0004\bN\u0010O\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006P"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/SearchFormWidget;", "Lcom/avito/android/remote/model/vertical_main/FilterFormWidget;", "Lcom/avito/android/remote/model/HeaderToolbarElement;", "", "title", "", "Lcom/avito/android/remote/model/search/Filter;", "filters", "Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAction;", "action", "Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetSubmitParam;", "submitParams", "Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAnalyticParams;", "analyticParams", "", "selectedFiltersCount", "", "showInHeaderToolbar", "Lcom/avito/android/remote/model/vertical_main/StyleBlock;", "styleBlock", "Lcom/avito/android/remote/model/vertical_main/BottomContent;", "bottomContent", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAction;Ljava/util/List;Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAnalyticParams;Ljava/lang/Integer;ZLcom/avito/android/remote/model/vertical_main/StyleBlock;Lcom/avito/android/remote/model/vertical_main/BottomContent;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getFilters", "()Ljava/util/List;", "Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAction;", "getAction", "()Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAction;", "getSubmitParams", "Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAnalyticParams;", "getAnalyticParams", "()Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAnalyticParams;", "Ljava/lang/Integer;", "getSelectedFiltersCount", "()Ljava/lang/Integer;", "Z", "getShowInHeaderToolbar", "()Z", "Lcom/avito/android/remote/model/vertical_main/StyleBlock;", "getStyleBlock", "()Lcom/avito/android/remote/model/vertical_main/StyleBlock;", "Lcom/avito/android/remote/model/vertical_main/BottomContent;", "getBottomContent", "()Lcom/avito/android/remote/model/vertical_main/BottomContent;", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SearchFormWidget implements FilterFormWidget, HeaderToolbarElement {

    @k
    public static final Parcelable.Creator<SearchFormWidget> CREATOR = new Creator();

    @c("action")
    @l
    private final SearchFormWidgetAction action;

    @c("analyticParams")
    @l
    private final SearchFormWidgetAnalyticParams analyticParams;

    @c("analytics")
    @l
    private Analytics analytics;

    @c("bottomContent")
    @l
    private final BottomContent bottomContent;

    @c("filters")
    @k
    private final List<Filter> filters;

    @c("selectedFiltersCount")
    @l
    private final Integer selectedFiltersCount;

    @c("settings")
    @l
    private Settings settings;

    @c("headerToolbar")
    private final boolean showInHeaderToolbar;

    @c("styleBlock")
    @l
    private final StyleBlock styleBlock;

    @c("submitParams")
    @k
    private final List<SearchFormWidgetSubmitParam> submitParams;

    @c("title")
    @k
    private final String title;
    private long uniqueId;

    /* compiled from: SearchFormWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SearchFormWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SearchFormWidget createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Filter.CREATOR, parcel, arrayList, iC2, 1);
            }
            SearchFormWidgetAction searchFormWidgetActionCreateFromParcel = parcel.readInt() == 0 ? null : SearchFormWidgetAction.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int iC3 = 0;
            while (iC3 != i13) {
                iC3 = a.c(SearchFormWidgetSubmitParam.CREATOR, parcel, arrayList2, iC3, 1);
            }
            return new SearchFormWidget(string, arrayList, searchFormWidgetActionCreateFromParcel, arrayList2, parcel.readInt() == 0 ? null : SearchFormWidgetAnalyticParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : StyleBlock.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BottomContent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SearchFormWidget[] newArray(int i12) {
            return new SearchFormWidget[i12];
        }
    }

    public SearchFormWidget(@k String str, @k List<Filter> list, @l SearchFormWidgetAction searchFormWidgetAction, @k List<SearchFormWidgetSubmitParam> list2, @l SearchFormWidgetAnalyticParams searchFormWidgetAnalyticParams, @l Integer num, boolean z12, @l StyleBlock styleBlock, @l BottomContent bottomContent, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.filters = list;
        this.action = searchFormWidgetAction;
        this.submitParams = list2;
        this.analyticParams = searchFormWidgetAnalyticParams;
        this.selectedFiltersCount = num;
        this.showInHeaderToolbar = z12;
        this.styleBlock = styleBlock;
        this.bottomContent = bottomContent;
        this.analytics = analytics;
        this.settings = settings;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.vertical_main.FilterFormWidget
    @l
    public SearchFormWidgetAction getAction() {
        return this.action;
    }

    @l
    public final SearchFormWidgetAnalyticParams getAnalyticParams() {
        return this.analyticParams;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final BottomContent getBottomContent() {
        return this.bottomContent;
    }

    @Override // com.avito.android.remote.model.vertical_main.FilterFormWidget
    @k
    public List<Filter> getFilters() {
        return this.filters;
    }

    @l
    public final Integer getSelectedFiltersCount() {
        return this.selectedFiltersCount;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @Override // com.avito.android.remote.model.HeaderToolbarElement
    public boolean getShowInHeaderToolbar() {
        return this.showInHeaderToolbar;
    }

    @Override // com.avito.android.remote.model.vertical_main.FilterFormWidget
    @l
    public StyleBlock getStyleBlock() {
        return this.styleBlock;
    }

    @Override // com.avito.android.remote.model.vertical_main.FilterFormWidget
    @k
    public List<SearchFormWidgetSubmitParam> getSubmitParams() {
        return this.submitParams;
    }

    @Override // com.avito.android.remote.model.vertical_main.FilterFormWidget
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    public void setAnalytics(@l Analytics analytics) {
        this.analytics = analytics;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    public void setSettings(@l Settings settings) {
        this.settings = settings;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.filters, parcel);
        while (itJ.hasNext()) {
            ((Filter) itJ.next()).writeToParcel(parcel, flags);
        }
        SearchFormWidgetAction searchFormWidgetAction = this.action;
        if (searchFormWidgetAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchFormWidgetAction.writeToParcel(parcel, flags);
        }
        Iterator itJ2 = C0.j(this.submitParams, parcel);
        while (itJ2.hasNext()) {
            ((SearchFormWidgetSubmitParam) itJ2.next()).writeToParcel(parcel, flags);
        }
        SearchFormWidgetAnalyticParams searchFormWidgetAnalyticParams = this.analyticParams;
        if (searchFormWidgetAnalyticParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchFormWidgetAnalyticParams.writeToParcel(parcel, flags);
        }
        Integer num = this.selectedFiltersCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeInt(this.showInHeaderToolbar ? 1 : 0);
        StyleBlock styleBlock = this.styleBlock;
        if (styleBlock == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleBlock.writeToParcel(parcel, flags);
        }
        BottomContent bottomContent = this.bottomContent;
        if (bottomContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bottomContent.writeToParcel(parcel, flags);
        }
        Analytics analytics = this.analytics;
        if (analytics == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analytics.writeToParcel(parcel, flags);
        }
        Settings settings = this.settings;
        if (settings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            settings.writeToParcel(parcel, flags);
        }
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }

    public SearchFormWidget(String str, List list, SearchFormWidgetAction searchFormWidgetAction, List list2, SearchFormWidgetAnalyticParams searchFormWidgetAnalyticParams, Integer num, boolean z12, StyleBlock styleBlock, BottomContent bottomContent, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? C42784z0.f406748b : list, searchFormWidgetAction, (i12 & 8) != 0 ? C42784z0.f406748b : list2, searchFormWidgetAnalyticParams, num, (i12 & 64) != 0 ? false : z12, (i12 & 128) != 0 ? null : styleBlock, (i12 & 256) != 0 ? null : bottomContent, (i12 & 512) != 0 ? null : analytics, (i12 & 1024) != 0 ? null : settings);
    }
}
