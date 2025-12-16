package com.avito.android.category.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.avito.android.category.CategoryItemLink;
import com.avito.android.category.element.CategoryWidgetElement;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: CategoryWidget.kt */
@K51.d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001$BI\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/avito/android/category/widget/CategoryWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "title", "Lcom/avito/android/category/CategoryItemLink;", "titleAction", "", "Lcom/avito/android/category/element/CategoryWidgetElement;", "items", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Lcom/avito/android/category/CategoryItemLink;Ljava/util/List;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/category/CategoryItemLink;", "c", "()Lcom/avito/android/category/CategoryItemLink;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "a", "_avito_bx-content_widget_category_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CategoryWidget implements SerpElement, AnalyticsElement, SettingsElement {

    @Y61.k
    public static final Parcelable.Creator<CategoryWidget> CREATOR;

    @com.google.gson.annotations.c("analytics")
    @Y61.l
    private Analytics analytics;

    /* renamed from: b, reason: collision with root package name */
    public long f116725b;

    @com.google.gson.annotations.c("items")
    @Y61.l
    private final List<CategoryWidgetElement> items;

    @com.google.gson.annotations.c("settings")
    @Y61.l
    private Settings settings;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    @com.google.gson.annotations.c("titleAction")
    @Y61.l
    private final CategoryItemLink titleAction;

    /* compiled from: CategoryWidget.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/category/widget/CategoryWidget$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_bx-content_widget_category_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CategoryWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CategoryWidget> {
        @Override // android.os.Parcelable.Creator
        public final CategoryWidget createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ArrayList arrayList = null;
            CategoryItemLink categoryItemLinkCreateFromParcel = parcel.readInt() == 0 ? null : CategoryItemLink.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(CategoryWidgetElement.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new CategoryWidget(string, categoryItemLinkCreateFromParcel, arrayList, (Analytics) parcel.readParcelable(CategoryWidget.class.getClassLoader()), (Settings) parcel.readParcelable(CategoryWidget.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryWidget[] newArray(int i12) {
            return new CategoryWidget[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public CategoryWidget() {
        this(null, null, null, null, null, 31, null);
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final CategoryItemLink getTitleAction() {
        return this.titleAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @Y61.l
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @Y61.l
    public final List<CategoryWidgetElement> getItems() {
        return this.items;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @Y61.l
    public final Settings getSettings() {
        return this.settings;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public final long getF116725b() {
        return this.f116725b;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    public final void setAnalytics(@Y61.l Analytics analytics) {
        this.analytics = analytics;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    public final void setSettings(@Y61.l Settings settings) {
        this.settings = settings;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final void setUniqueId(long j12) {
        this.f116725b = j12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        CategoryItemLink categoryItemLink = this.titleAction;
        if (categoryItemLink == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            categoryItemLink.writeToParcel(parcel, i12);
        }
        List<CategoryWidgetElement> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((CategoryWidgetElement) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.analytics, i12);
        parcel.writeParcelable(this.settings, i12);
    }

    public CategoryWidget(@Y61.l String str, @Y61.l CategoryItemLink categoryItemLink, @Y61.l List<CategoryWidgetElement> list, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.title = str;
        this.titleAction = categoryItemLink;
        this.items = list;
        this.analytics = analytics;
        this.settings = settings;
    }

    public CategoryWidget(String str, CategoryItemLink categoryItemLink, List list, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : categoryItemLink, (i12 & 4) != 0 ? C42784z0.f406748b : list, (i12 & 8) != 0 ? null : analytics, (i12 & 16) != 0 ? null : settings);
    }
}
