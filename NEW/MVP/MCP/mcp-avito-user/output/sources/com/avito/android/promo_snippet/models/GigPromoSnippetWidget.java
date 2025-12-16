package com.avito.android.promo_snippet.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GigPromoSnippetWidget.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B?\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/avito/android/promo_snippet/models/GigPromoSnippetWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "title", "Lcom/avito/android/promo_snippet/models/MoreMotivations;", "moreButton", "", "Lcom/avito/android/promo_snippet/models/MotivationItem;", "motivations", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Lcom/avito/android/promo_snippet/models/MoreMotivations;Ljava/util/List;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/promo_snippet/models/MoreMotivations;", "c", "()Lcom/avito/android/promo_snippet/models/MoreMotivations;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GigPromoSnippetWidget implements SerpElement, Parcelable, AnalyticsElement, SettingsElement {

    @k
    public static final Parcelable.Creator<GigPromoSnippetWidget> CREATOR = new a();

    @c("analytics")
    @l
    private Analytics analytics;

    /* renamed from: b, reason: collision with root package name */
    public transient long f231756b;

    @c("moreButton")
    @l
    private final MoreMotivations moreButton;

    @c("motivations")
    @k
    private final List<MotivationItem> motivations;

    @c("settings")
    @l
    private Settings settings;

    @c("title")
    @k
    private final String title;

    /* compiled from: GigPromoSnippetWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigPromoSnippetWidget> {
        @Override // android.os.Parcelable.Creator
        public final GigPromoSnippetWidget createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            MoreMotivations moreMotivationsCreateFromParcel = parcel.readInt() == 0 ? null : MoreMotivations.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(MotivationItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new GigPromoSnippetWidget(string, moreMotivationsCreateFromParcel, arrayList, (Analytics) parcel.readParcelable(GigPromoSnippetWidget.class.getClassLoader()), (Settings) parcel.readParcelable(GigPromoSnippetWidget.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GigPromoSnippetWidget[] newArray(int i12) {
            return new GigPromoSnippetWidget[i12];
        }
    }

    public GigPromoSnippetWidget(@k String str, @l MoreMotivations moreMotivations, @k List<MotivationItem> list, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.moreButton = moreMotivations;
        this.motivations = list;
        this.analytics = analytics;
        this.settings = settings;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final MoreMotivations getMoreButton() {
        return this.moreButton;
    }

    @k
    public final List<MotivationItem> d() {
        return this.motivations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public final Settings getSettings() {
        return this.settings;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final long getUniqueId() {
        return this.f231756b;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    public final void setAnalytics(@l Analytics analytics) {
        this.analytics = analytics;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    public final void setSettings(@l Settings settings) {
        this.settings = settings;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final void setUniqueId(long j12) {
        this.f231756b = j12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        MoreMotivations moreMotivations = this.moreButton;
        if (moreMotivations == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moreMotivations.writeToParcel(parcel, i12);
        }
        Iterator itJ = C0.j(this.motivations, parcel);
        while (itJ.hasNext()) {
            ((MotivationItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.analytics, i12);
        parcel.writeParcelable(this.settings, i12);
    }

    public /* synthetic */ GigPromoSnippetWidget(String str, MoreMotivations moreMotivations, List list, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, moreMotivations, list, (i12 & 8) != 0 ? null : analytics, (i12 & 16) != 0 ? null : settings);
    }
}
