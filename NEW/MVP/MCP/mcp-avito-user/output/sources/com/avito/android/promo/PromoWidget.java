package com.avito.android.promo;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
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
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: PromoWidget.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B\u009b\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b0\u0010\u001dR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0016\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0018\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/avito/android/promo/PromoWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "title", "text", "promoId", "", "Lcom/avito/android/promo/PromoAction;", "actions", "image", "Lcom/avito/android/promo/MovableImage;", "movableImage", "Lcom/avito/android/promo/PromoAnalyticParams;", "analyticParams", "Lcom/avito/android/promo/PromoStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "isUnifiedConfig", "view", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/promo/MovableImage;Lcom/avito/android/promo/PromoAnalyticParams;Lcom/avito/android/promo/PromoStyle;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getText", "getPromoId", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "getImage", "Lcom/avito/android/promo/MovableImage;", "p4", "()Lcom/avito/android/promo/MovableImage;", "Lcom/avito/android/promo/PromoAnalyticParams;", "getAnalyticParams", "()Lcom/avito/android/promo/PromoAnalyticParams;", "Lcom/avito/android/promo/PromoStyle;", "getStyle", "()Lcom/avito/android/promo/PromoStyle;", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "c", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "a", "_avito_bx-content_widget_promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PromoWidget implements SerpElement, AnalyticsElement, SettingsElement {

    @k
    public static final Parcelable.Creator<PromoWidget> CREATOR;

    @c("actions")
    @l
    private final List<PromoAction> actions;

    @c("analyticParams")
    @l
    private final PromoAnalyticParams analyticParams;

    @c("analytics")
    @l
    private Analytics analytics;

    /* renamed from: b, reason: collision with root package name */
    public transient long f231611b;

    @c("image")
    @l
    private final String image;

    @c("isUnifiedConfig")
    @l
    private final Boolean isUnifiedConfig;

    @c("movableImage")
    @l
    private final MovableImage movableImage;

    @c("promoId")
    @l
    private final String promoId;

    @c("settings")
    @l
    private Settings settings;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final PromoStyle style;

    @c("text")
    @l
    private final String text;

    @c("title")
    @l
    private final String title;

    @c("view")
    @l
    private final String view;

    /* compiled from: PromoWidget.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/promo/PromoWidget$a;", "", "<init>", "()V", "", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/String;", "_avito_bx-content_widget_promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PromoWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PromoWidget> {
        @Override // android.os.Parcelable.Creator
        public final PromoWidget createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(PromoAction.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            String string4 = parcel.readString();
            MovableImage movableImageCreateFromParcel = parcel.readInt() == 0 ? null : MovableImage.CREATOR.createFromParcel(parcel);
            PromoAnalyticParams promoAnalyticParamsCreateFromParcel = parcel.readInt() == 0 ? null : PromoAnalyticParams.CREATOR.createFromParcel(parcel);
            PromoStyle promoStyleCreateFromParcel = parcel.readInt() == 0 ? null : PromoStyle.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PromoWidget(string, string2, string3, arrayList, string4, movableImageCreateFromParcel, promoAnalyticParamsCreateFromParcel, promoStyleCreateFromParcel, boolValueOf, parcel.readString(), (Analytics) parcel.readParcelable(PromoWidget.class.getClassLoader()), (Settings) parcel.readParcelable(PromoWidget.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PromoWidget[] newArray(int i12) {
            return new PromoWidget[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public PromoWidget(@l String str, @l String str2, @l String str3, @l List<PromoAction> list, @l String str4, @l MovableImage movableImage, @l PromoAnalyticParams promoAnalyticParams, @l PromoStyle promoStyle, @l Boolean bool, @l String str5, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.text = str2;
        this.promoId = str3;
        this.actions = list;
        this.image = str4;
        this.movableImage = movableImage;
        this.analyticParams = promoAnalyticParams;
        this.style = promoStyle;
        this.isUnifiedConfig = bool;
        this.view = str5;
        this.analytics = analytics;
        this.settings = settings;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getView() {
        return this.view;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Boolean getIsUnifiedConfig() {
        return this.isUnifiedConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<PromoAction> getActions() {
        return this.actions;
    }

    @l
    public final PromoAnalyticParams getAnalyticParams() {
        return this.analyticParams;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final String getImage() {
        return this.image;
    }

    @l
    public final String getPromoId() {
        return this.promoId;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public final Settings getSettings() {
        return this.settings;
    }

    @l
    public final PromoStyle getStyle() {
        return this.style;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public final long getF231611b() {
        return this.f231611b;
    }

    @l
    /* renamed from: p4, reason: from getter */
    public final MovableImage getMovableImage() {
        return this.movableImage;
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
        this.f231611b = j12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.promoId);
        List<PromoAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((PromoAction) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeString(this.image);
        MovableImage movableImage = this.movableImage;
        if (movableImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            movableImage.writeToParcel(parcel, i12);
        }
        PromoAnalyticParams promoAnalyticParams = this.analyticParams;
        if (promoAnalyticParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoAnalyticParams.writeToParcel(parcel, i12);
        }
        PromoStyle promoStyle = this.style;
        if (promoStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoStyle.writeToParcel(parcel, i12);
        }
        Boolean bool = this.isUnifiedConfig;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.view);
        parcel.writeParcelable(this.analytics, i12);
        parcel.writeParcelable(this.settings, i12);
    }

    public PromoWidget(String str, String str2, String str3, List list, String str4, MovableImage movableImage, PromoAnalyticParams promoAnalyticParams, PromoStyle promoStyle, Boolean bool, String str5, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? C42784z0.f406748b : list, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : movableImage, (i12 & 64) != 0 ? null : promoAnalyticParams, (i12 & 128) != 0 ? null : promoStyle, (i12 & 256) != 0 ? null : bool, (i12 & 512) != 0 ? null : str5, (i12 & 1024) != 0 ? null : analytics, (i12 & 2048) == 0 ? settings : null);
    }
}
