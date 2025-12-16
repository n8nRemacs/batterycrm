package com.avito.android.remote.model.replace_main_widget;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReplaceMainPageWidget.kt */
@d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\r\u000eB\u0007\b\u0004¢\u0006\u0002\u0010\u0005R \u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "()V", "uniqueId", "", "getUniqueId$annotations", "getUniqueId", "()J", "setUniqueId", "(J)V", "ReplaceMain", "ShowAvito", "Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget$ReplaceMain;", "Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget$ShowAvito;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ReplaceMainPageWidget implements SerpElement, Parcelable, AnalyticsElement, SettingsElement {
    private long uniqueId;

    /* compiled from: ReplaceMainPageWidget.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u00013B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0010R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010.R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget$ReplaceMain;", "Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget$ReplaceMain$Button;", "button", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget$ReplaceMain$Button;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget$ReplaceMain$Button;", "component3", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component4", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget$ReplaceMain$Button;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget$ReplaceMain;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget$ReplaceMain$Button;", "getButton", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "Button", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ReplaceMain extends ReplaceMainPageWidget implements Parcelable {

        @k
        public static final Parcelable.Creator<ReplaceMain> CREATOR = new Creator();

        @c("analytics")
        @l
        private Analytics analytics;

        @c("button")
        @k
        private final Button button;

        @c("settings")
        @l
        private Settings settings;

        @c("text")
        @k
        private final String text;

        /* compiled from: ReplaceMainPageWidget.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget$ReplaceMain$Button;", "Landroid/os/Parcelable;", "", "buttonTitle", "clearShowId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget$ReplaceMain$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getButtonTitle", "getClearShowId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Button implements Parcelable {

            @k
            public static final Parcelable.Creator<Button> CREATOR = new Creator();

            @c("title")
            @k
            private final String buttonTitle;

            @c("clearShowId")
            @k
            private final String clearShowId;

            /* compiled from: ReplaceMainPageWidget.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Button> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Button createFromParcel(@k Parcel parcel) {
                    return new Button(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Button[] newArray(int i12) {
                    return new Button[i12];
                }
            }

            public Button(@k String str, @k String str2) {
                this.buttonTitle = str;
                this.clearShowId = str2;
            }

            public static /* synthetic */ Button copy$default(Button button, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = button.buttonTitle;
                }
                if ((i12 & 2) != 0) {
                    str2 = button.clearShowId;
                }
                return button.copy(str, str2);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getButtonTitle() {
                return this.buttonTitle;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getClearShowId() {
                return this.clearShowId;
            }

            @k
            public final Button copy(@k String buttonTitle, @k String clearShowId) {
                return new Button(buttonTitle, clearShowId);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Button)) {
                    return false;
                }
                Button button = (Button) other;
                return L.f(this.buttonTitle, button.buttonTitle) && L.f(this.clearShowId, button.clearShowId);
            }

            @k
            public final String getButtonTitle() {
                return this.buttonTitle;
            }

            @k
            public final String getClearShowId() {
                return this.clearShowId;
            }

            public int hashCode() {
                return this.clearShowId.hashCode() + (this.buttonTitle.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Button(buttonTitle=");
                sb2.append(this.buttonTitle);
                sb2.append(", clearShowId=");
                return C22026a.c(sb2, this.clearShowId, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.buttonTitle);
                parcel.writeString(this.clearShowId);
            }
        }

        /* compiled from: ReplaceMainPageWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ReplaceMain> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ReplaceMain createFromParcel(@k Parcel parcel) {
                return new ReplaceMain(parcel.readString(), Button.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ReplaceMain[] newArray(int i12) {
                return new ReplaceMain[i12];
            }
        }

        public /* synthetic */ ReplaceMain(String str, Button button, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
            this(str, button, (i12 & 4) != 0 ? null : analytics, (i12 & 8) != 0 ? null : settings);
        }

        public static /* synthetic */ ReplaceMain copy$default(ReplaceMain replaceMain, String str, Button button, Analytics analytics, Settings settings, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = replaceMain.text;
            }
            if ((i12 & 2) != 0) {
                button = replaceMain.button;
            }
            if ((i12 & 4) != 0) {
                analytics = replaceMain.analytics;
            }
            if ((i12 & 8) != 0) {
                settings = replaceMain.settings;
            }
            return replaceMain.copy(str, button, analytics, settings);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Button getButton() {
            return this.button;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Analytics getAnalytics() {
            return this.analytics;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Settings getSettings() {
            return this.settings;
        }

        @k
        public final ReplaceMain copy(@k String text, @k Button button, @l Analytics analytics, @l Settings settings) {
            return new ReplaceMain(text, button, analytics, settings);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReplaceMain)) {
                return false;
            }
            ReplaceMain replaceMain = (ReplaceMain) other;
            return L.f(this.text, replaceMain.text) && L.f(this.button, replaceMain.button) && L.f(this.analytics, replaceMain.analytics) && L.f(this.settings, replaceMain.settings);
        }

        @Override // com.avito.android.remote.model.AnalyticsElement
        @l
        public Analytics getAnalytics() {
            return this.analytics;
        }

        @k
        public final Button getButton() {
            return this.button;
        }

        @Override // com.avito.android.remote.model.SettingsElement
        @l
        public Settings getSettings() {
            return this.settings;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = (this.button.hashCode() + (this.text.hashCode() * 31)) * 31;
            Analytics analytics = this.analytics;
            int iHashCode2 = (iHashCode + (analytics == null ? 0 : analytics.hashCode())) * 31;
            Settings settings = this.settings;
            return iHashCode2 + (settings != null ? settings.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.AnalyticsElement
        public void setAnalytics(@l Analytics analytics) {
            this.analytics = analytics;
        }

        @Override // com.avito.android.remote.model.SettingsElement
        public void setSettings(@l Settings settings) {
            this.settings = settings;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ReplaceMain(text=");
            sb2.append(this.text);
            sb2.append(", button=");
            sb2.append(this.button);
            sb2.append(", analytics=");
            sb2.append(this.analytics);
            sb2.append(", settings=");
            return b.f(sb2, this.settings, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            this.button.writeToParcel(parcel, flags);
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

        public ReplaceMain(@k String str, @k Button button, @l Analytics analytics, @l Settings settings) {
            super(null);
            this.text = str;
            this.button = button;
            this.analytics = analytics;
            this.settings = settings;
        }
    }

    /* compiled from: ReplaceMainPageWidget.kt */
    @d
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0010R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010.R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget$ShowAvito;", "Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component4", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/replace_main_widget/ReplaceMainPageWidget$ShowAvito;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowAvito extends ReplaceMainPageWidget implements Parcelable {

        @k
        public static final Parcelable.Creator<ShowAvito> CREATOR = new Creator();

        @c("analytics")
        @l
        private Analytics analytics;

        @c(Constants.DEEPLINK)
        @k
        private final DeepLink deeplink;

        @c("settings")
        @l
        private Settings settings;

        @c("text")
        @k
        private final String text;

        /* compiled from: ReplaceMainPageWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ShowAvito> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ShowAvito createFromParcel(@k Parcel parcel) {
                return new ShowAvito(parcel.readString(), (DeepLink) parcel.readParcelable(ShowAvito.class.getClassLoader()), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ShowAvito[] newArray(int i12) {
                return new ShowAvito[i12];
            }
        }

        public /* synthetic */ ShowAvito(String str, DeepLink deepLink, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? null : analytics, (i12 & 8) != 0 ? null : settings);
        }

        public static /* synthetic */ ShowAvito copy$default(ShowAvito showAvito, String str, DeepLink deepLink, Analytics analytics, Settings settings, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = showAvito.text;
            }
            if ((i12 & 2) != 0) {
                deepLink = showAvito.deeplink;
            }
            if ((i12 & 4) != 0) {
                analytics = showAvito.analytics;
            }
            if ((i12 & 8) != 0) {
                settings = showAvito.settings;
            }
            return showAvito.copy(str, deepLink, analytics, settings);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Analytics getAnalytics() {
            return this.analytics;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Settings getSettings() {
            return this.settings;
        }

        @k
        public final ShowAvito copy(@k String text, @k DeepLink deeplink, @l Analytics analytics, @l Settings settings) {
            return new ShowAvito(text, deeplink, analytics, settings);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowAvito)) {
                return false;
            }
            ShowAvito showAvito = (ShowAvito) other;
            return L.f(this.text, showAvito.text) && L.f(this.deeplink, showAvito.deeplink) && L.f(this.analytics, showAvito.analytics) && L.f(this.settings, showAvito.settings);
        }

        @Override // com.avito.android.remote.model.AnalyticsElement
        @l
        public Analytics getAnalytics() {
            return this.analytics;
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @Override // com.avito.android.remote.model.SettingsElement
        @l
        public Settings getSettings() {
            return this.settings;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iE2 = a.e(this.deeplink, this.text.hashCode() * 31, 31);
            Analytics analytics = this.analytics;
            int iHashCode = (iE2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
            Settings settings = this.settings;
            return iHashCode + (settings != null ? settings.hashCode() : 0);
        }

        @Override // com.avito.android.remote.model.AnalyticsElement
        public void setAnalytics(@l Analytics analytics) {
            this.analytics = analytics;
        }

        @Override // com.avito.android.remote.model.SettingsElement
        public void setSettings(@l Settings settings) {
            this.settings = settings;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ShowAvito(text=");
            sb2.append(this.text);
            sb2.append(", deeplink=");
            sb2.append(this.deeplink);
            sb2.append(", analytics=");
            sb2.append(this.analytics);
            sb2.append(", settings=");
            return b.f(sb2, this.settings, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeParcelable(this.deeplink, flags);
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

        public ShowAvito(@k String str, @k DeepLink deepLink, @l Analytics analytics, @l Settings settings) {
            super(null);
            this.text = str;
            this.deeplink = deepLink;
            this.analytics = analytics;
            this.settings = settings;
        }
    }

    public /* synthetic */ ReplaceMainPageWidget(C42822w c42822w) {
        this();
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    private ReplaceMainPageWidget() {
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
