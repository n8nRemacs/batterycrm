package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b,\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b-\u0010\"R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b.\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010=\u001a\u00020<8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b=\u0010>\u0012\u0004\bC\u0010D\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/PublishFormWidget;", "Lcom/avito/android/remote/model/vertical_main/FilterFormWidget;", "", "title", "", "Lcom/avito/android/remote/model/search/Filter;", "filters", "Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAction;", "action", "Lcom/avito/android/remote/model/vertical_main/PromoStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetSubmitParam;", "submitParams", "activeFieldId", "categoryId", "Lcom/avito/android/remote/model/vertical_main/StyleBlock;", "styleBlock", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAction;Lcom/avito/android/remote/model/vertical_main/PromoStyle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/vertical_main/StyleBlock;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getFilters", "()Ljava/util/List;", "Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAction;", "getAction", "()Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAction;", "Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "getStyle", "()Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "getSubmitParams", "getActiveFieldId", "getCategoryId", "Lcom/avito/android/remote/model/vertical_main/StyleBlock;", "getStyleBlock", "()Lcom/avito/android/remote/model/vertical_main/StyleBlock;", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PublishFormWidget implements FilterFormWidget {

    @k
    public static final Parcelable.Creator<PublishFormWidget> CREATOR = new Creator();

    @c("action")
    @l
    private final SearchFormWidgetAction action;

    @c("activeFieldId")
    @l
    private final String activeFieldId;

    @c("analytics")
    @l
    private Analytics analytics;

    @c("categoryId")
    @k
    private final String categoryId;

    @c("filters")
    @k
    private final List<Filter> filters;

    @c("settings")
    @l
    private Settings settings;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final PromoStyle style;

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
    public static final class Creator implements Parcelable.Creator<PublishFormWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PublishFormWidget createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = a.c(Filter.CREATOR, parcel, arrayList, iC3, 1);
            }
            SearchFormWidgetAction searchFormWidgetActionCreateFromParcel = parcel.readInt() == 0 ? null : SearchFormWidgetAction.CREATOR.createFromParcel(parcel);
            PromoStyle promoStyleCreateFromParcel = parcel.readInt() == 0 ? null : PromoStyle.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = a.c(SearchFormWidgetSubmitParam.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new PublishFormWidget(string, arrayList, searchFormWidgetActionCreateFromParcel, promoStyleCreateFromParcel, arrayList2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StyleBlock.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PublishFormWidget[] newArray(int i12) {
            return new PublishFormWidget[i12];
        }
    }

    public PublishFormWidget(@k String str, @k List<Filter> list, @l SearchFormWidgetAction searchFormWidgetAction, @l PromoStyle promoStyle, @k List<SearchFormWidgetSubmitParam> list2, @l String str2, @k String str3, @l StyleBlock styleBlock, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.filters = list;
        this.action = searchFormWidgetAction;
        this.style = promoStyle;
        this.submitParams = list2;
        this.activeFieldId = str2;
        this.categoryId = str3;
        this.styleBlock = styleBlock;
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
    public final String getActiveFieldId() {
        return this.activeFieldId;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @k
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Override // com.avito.android.remote.model.vertical_main.FilterFormWidget
    @k
    public List<Filter> getFilters() {
        return this.filters;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @l
    public final PromoStyle getStyle() {
        return this.style;
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
        PromoStyle promoStyle = this.style;
        if (promoStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoStyle.writeToParcel(parcel, flags);
        }
        Iterator itJ2 = C0.j(this.submitParams, parcel);
        while (itJ2.hasNext()) {
            ((SearchFormWidgetSubmitParam) itJ2.next()).writeToParcel(parcel, flags);
        }
        parcel.writeString(this.activeFieldId);
        parcel.writeString(this.categoryId);
        StyleBlock styleBlock = this.styleBlock;
        if (styleBlock == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleBlock.writeToParcel(parcel, flags);
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

    public PublishFormWidget(String str, List list, SearchFormWidgetAction searchFormWidgetAction, PromoStyle promoStyle, List list2, String str2, String str3, StyleBlock styleBlock, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? C42784z0.f406748b : list, searchFormWidgetAction, promoStyle, (i12 & 16) != 0 ? C42784z0.f406748b : list2, str2, str3, (i12 & 128) != 0 ? null : styleBlock, (i12 & 256) != 0 ? null : analytics, (i12 & 512) != 0 ? null : settings);
    }
}
