package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RubricatorWidget.kt */
@d
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004JKLMBS\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ^\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b*\u0010$J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b/\u00100R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\u0016R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b8\u0010\u001aR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010\u001c\"\u0004\b;\u0010<R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010@R(\u0010B\u001a\u00020A8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bB\u0010C\u0012\u0004\bH\u0010I\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006N"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/RubricatorWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/SettingsElement;", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType;", "displayingOptions", "", "title", "", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetItem;", "items", "additionalButton", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetItem;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetItem;", "component5", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component6", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetItem;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/vertical_main/RubricatorWidget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType;", "getDisplayingOptions", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getItems", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetItem;", "getAdditionalButton", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "ActionedImage", "RubricatorWidgetAction", "RubricatorWidgetItem", "RubricatorWidgetType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RubricatorWidget implements SerpElement, AnalyticsElement, Parcelable, SettingsElement {

    @k
    public static final Parcelable.Creator<RubricatorWidget> CREATOR = new Creator();

    @c("additionalButton")
    @l
    private final RubricatorWidgetItem additionalButton;

    @c("analytics")
    @l
    private Analytics analytics;

    @c("displayingOptions")
    @l
    private final RubricatorWidgetType displayingOptions;

    @c("items")
    @l
    private final List<RubricatorWidgetItem> items;

    @c("settings")
    @l
    private Settings settings;

    @c("title")
    @l
    private final String title;
    private long uniqueId;

    /* compiled from: RubricatorWidget.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$ActionedImage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetAction;", "action", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetAction;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "component2", "()Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetAction;", "copy", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetAction;)Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$ActionedImage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetAction;", "getAction", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActionedImage implements Parcelable {

        @k
        public static final Parcelable.Creator<ActionedImage> CREATOR = new Creator();

        @c("action")
        @k
        private final RubricatorWidgetAction action;

        @c("image")
        @l
        private final UniversalImage image;

        /* compiled from: RubricatorWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActionedImage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionedImage createFromParcel(@k Parcel parcel) {
                return new ActionedImage((UniversalImage) parcel.readParcelable(ActionedImage.class.getClassLoader()), RubricatorWidgetAction.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionedImage[] newArray(int i12) {
                return new ActionedImage[i12];
            }
        }

        public ActionedImage(@l UniversalImage universalImage, @k RubricatorWidgetAction rubricatorWidgetAction) {
            this.image = universalImage;
            this.action = rubricatorWidgetAction;
        }

        public static /* synthetic */ ActionedImage copy$default(ActionedImage actionedImage, UniversalImage universalImage, RubricatorWidgetAction rubricatorWidgetAction, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalImage = actionedImage.image;
            }
            if ((i12 & 2) != 0) {
                rubricatorWidgetAction = actionedImage.action;
            }
            return actionedImage.copy(universalImage, rubricatorWidgetAction);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final RubricatorWidgetAction getAction() {
            return this.action;
        }

        @k
        public final ActionedImage copy(@l UniversalImage image, @k RubricatorWidgetAction action) {
            return new ActionedImage(image, action);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionedImage)) {
                return false;
            }
            ActionedImage actionedImage = (ActionedImage) other;
            return L.f(this.image, actionedImage.image) && L.f(this.action, actionedImage.action);
        }

        @k
        public final RubricatorWidgetAction getAction() {
            return this.action;
        }

        @l
        public final UniversalImage getImage() {
            return this.image;
        }

        public int hashCode() {
            UniversalImage universalImage = this.image;
            return this.action.hashCode() + ((universalImage == null ? 0 : universalImage.hashCode()) * 31);
        }

        @k
        public String toString() {
            return "ActionedImage(image=" + this.image + ", action=" + this.action + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
            this.action.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: RubricatorWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RubricatorWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RubricatorWidget createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            RubricatorWidgetType rubricatorWidgetType = (RubricatorWidgetType) parcel.readParcelable(RubricatorWidget.class.getClassLoader());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(RubricatorWidgetItem.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new RubricatorWidget(rubricatorWidgetType, string, arrayList, parcel.readInt() == 0 ? null : RubricatorWidgetItem.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RubricatorWidget[] newArray(int i12) {
            return new RubricatorWidget[i12];
        }
    }

    /* compiled from: RubricatorWidget.kt */
    @d
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJh\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020!HÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020!HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b3\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010\u001bR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010\u001d¨\u0006<"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetAction;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "iconUri", "", "title", "subtitle", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "", "activeForSearch", "", "actions", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;ZLjava/util/List;)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component6", "()Z", "component7", "()Ljava/util/List;", "copy", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;ZLjava/util/List;)Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/net/Uri;", "getIconUri", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "Z", "getActiveForSearch", "Ljava/util/List;", "getActions", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RubricatorWidgetAction implements Parcelable {

        @k
        public static final Parcelable.Creator<RubricatorWidgetAction> CREATOR = new Creator();

        @c("actions")
        @l
        private final List<RubricatorWidgetAction> actions;

        @c("activeForSearch")
        private final boolean activeForSearch;

        @c("iconUri")
        @l
        private final Uri iconUri;

        @c("image")
        @l
        private final UniversalImage image;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @l
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        /* compiled from: RubricatorWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RubricatorWidgetAction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final RubricatorWidgetAction createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                Uri uri = (Uri) parcel.readParcelable(RubricatorWidgetAction.class.getClassLoader());
                String string = parcel.readString();
                String string2 = parcel.readString();
                UniversalImage universalImage = (UniversalImage) parcel.readParcelable(RubricatorWidgetAction.class.getClassLoader());
                DeepLink deepLink = (DeepLink) parcel.readParcelable(RubricatorWidgetAction.class.getClassLoader());
                int iC2 = 0;
                boolean z12 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    while (iC2 != i12) {
                        iC2 = a.c(RubricatorWidgetAction.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new RubricatorWidgetAction(uri, string, string2, universalImage, deepLink, z12, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final RubricatorWidgetAction[] newArray(int i12) {
                return new RubricatorWidgetAction[i12];
            }
        }

        public RubricatorWidgetAction(@l Uri uri, @l String str, @l String str2, @l UniversalImage universalImage, @l DeepLink deepLink, boolean z12, @l List<RubricatorWidgetAction> list) {
            this.iconUri = uri;
            this.title = str;
            this.subtitle = str2;
            this.image = universalImage;
            this.uri = deepLink;
            this.activeForSearch = z12;
            this.actions = list;
        }

        public static /* synthetic */ RubricatorWidgetAction copy$default(RubricatorWidgetAction rubricatorWidgetAction, Uri uri, String str, String str2, UniversalImage universalImage, DeepLink deepLink, boolean z12, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                uri = rubricatorWidgetAction.iconUri;
            }
            if ((i12 & 2) != 0) {
                str = rubricatorWidgetAction.title;
            }
            String str3 = str;
            if ((i12 & 4) != 0) {
                str2 = rubricatorWidgetAction.subtitle;
            }
            String str4 = str2;
            if ((i12 & 8) != 0) {
                universalImage = rubricatorWidgetAction.image;
            }
            UniversalImage universalImage2 = universalImage;
            if ((i12 & 16) != 0) {
                deepLink = rubricatorWidgetAction.uri;
            }
            DeepLink deepLink2 = deepLink;
            if ((i12 & 32) != 0) {
                z12 = rubricatorWidgetAction.activeForSearch;
            }
            boolean z13 = z12;
            if ((i12 & 64) != 0) {
                list = rubricatorWidgetAction.actions;
            }
            return rubricatorWidgetAction.copy(uri, str3, str4, universalImage2, deepLink2, z13, list);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Uri getIconUri() {
            return this.iconUri;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getActiveForSearch() {
            return this.activeForSearch;
        }

        @l
        public final List<RubricatorWidgetAction> component7() {
            return this.actions;
        }

        @k
        public final RubricatorWidgetAction copy(@l Uri iconUri, @l String title, @l String subtitle, @l UniversalImage image, @l DeepLink uri, boolean activeForSearch, @l List<RubricatorWidgetAction> actions) {
            return new RubricatorWidgetAction(iconUri, title, subtitle, image, uri, activeForSearch, actions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RubricatorWidgetAction)) {
                return false;
            }
            RubricatorWidgetAction rubricatorWidgetAction = (RubricatorWidgetAction) other;
            return L.f(this.iconUri, rubricatorWidgetAction.iconUri) && L.f(this.title, rubricatorWidgetAction.title) && L.f(this.subtitle, rubricatorWidgetAction.subtitle) && L.f(this.image, rubricatorWidgetAction.image) && L.f(this.uri, rubricatorWidgetAction.uri) && this.activeForSearch == rubricatorWidgetAction.activeForSearch && L.f(this.actions, rubricatorWidgetAction.actions);
        }

        @l
        public final List<RubricatorWidgetAction> getActions() {
            return this.actions;
        }

        public final boolean getActiveForSearch() {
            return this.activeForSearch;
        }

        @l
        public final Uri getIconUri() {
            return this.iconUri;
        }

        @l
        public final UniversalImage getImage() {
            return this.image;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        public int hashCode() {
            Uri uri = this.iconUri;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            UniversalImage universalImage = this.image;
            int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
            DeepLink deepLink = this.uri;
            int i12 = r.i((iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.activeForSearch);
            List<RubricatorWidgetAction> list = this.actions;
            return i12 + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RubricatorWidgetAction(iconUri=");
            sb2.append(this.iconUri);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", image=");
            sb2.append(this.image);
            sb2.append(", uri=");
            sb2.append(this.uri);
            sb2.append(", activeForSearch=");
            sb2.append(this.activeForSearch);
            sb2.append(", actions=");
            return H.p(sb2, this.actions, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.iconUri, flags);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.image, flags);
            parcel.writeParcelable(this.uri, flags);
            parcel.writeInt(this.activeForSearch ? 1 : 0);
            List<RubricatorWidgetAction> list = this.actions;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((RubricatorWidgetAction) itA.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: RubricatorWidget.kt */
    @d
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JN\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0014¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetItem;", "Landroid/os/Parcelable;", "", "title", "subtitle", "displayTitle", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$ActionedImage;", "actionedImage", "", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetAction;", "actions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$ActionedImage;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$ActionedImage;", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$ActionedImage;Ljava/util/List;)Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getDisplayTitle", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$ActionedImage;", "getActionedImage", "Ljava/util/List;", "getActions", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RubricatorWidgetItem implements Parcelable {

        @k
        public static final Parcelable.Creator<RubricatorWidgetItem> CREATOR = new Creator();

        @c("actionedImage")
        @k
        private final ActionedImage actionedImage;

        @c("actions")
        @l
        private final List<RubricatorWidgetAction> actions;

        @c("displayTitle")
        @l
        private final String displayTitle;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: RubricatorWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<RubricatorWidgetItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final RubricatorWidgetItem createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                ActionedImage actionedImageCreateFromParcel = ActionedImage.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(RubricatorWidgetAction.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                return new RubricatorWidgetItem(string, string2, string3, actionedImageCreateFromParcel, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final RubricatorWidgetItem[] newArray(int i12) {
                return new RubricatorWidgetItem[i12];
            }
        }

        public RubricatorWidgetItem(@k String str, @l String str2, @l String str3, @k ActionedImage actionedImage, @l List<RubricatorWidgetAction> list) {
            this.title = str;
            this.subtitle = str2;
            this.displayTitle = str3;
            this.actionedImage = actionedImage;
            this.actions = list;
        }

        public static /* synthetic */ RubricatorWidgetItem copy$default(RubricatorWidgetItem rubricatorWidgetItem, String str, String str2, String str3, ActionedImage actionedImage, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = rubricatorWidgetItem.title;
            }
            if ((i12 & 2) != 0) {
                str2 = rubricatorWidgetItem.subtitle;
            }
            String str4 = str2;
            if ((i12 & 4) != 0) {
                str3 = rubricatorWidgetItem.displayTitle;
            }
            String str5 = str3;
            if ((i12 & 8) != 0) {
                actionedImage = rubricatorWidgetItem.actionedImage;
            }
            ActionedImage actionedImage2 = actionedImage;
            if ((i12 & 16) != 0) {
                list = rubricatorWidgetItem.actions;
            }
            return rubricatorWidgetItem.copy(str, str4, str5, actionedImage2, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final ActionedImage getActionedImage() {
            return this.actionedImage;
        }

        @l
        public final List<RubricatorWidgetAction> component5() {
            return this.actions;
        }

        @k
        public final RubricatorWidgetItem copy(@k String title, @l String subtitle, @l String displayTitle, @k ActionedImage actionedImage, @l List<RubricatorWidgetAction> actions) {
            return new RubricatorWidgetItem(title, subtitle, displayTitle, actionedImage, actions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RubricatorWidgetItem)) {
                return false;
            }
            RubricatorWidgetItem rubricatorWidgetItem = (RubricatorWidgetItem) other;
            return L.f(this.title, rubricatorWidgetItem.title) && L.f(this.subtitle, rubricatorWidgetItem.subtitle) && L.f(this.displayTitle, rubricatorWidgetItem.displayTitle) && L.f(this.actionedImage, rubricatorWidgetItem.actionedImage) && L.f(this.actions, rubricatorWidgetItem.actions);
        }

        @k
        public final ActionedImage getActionedImage() {
            return this.actionedImage;
        }

        @l
        public final List<RubricatorWidgetAction> getActions() {
            return this.actions;
        }

        @l
        public final String getDisplayTitle() {
            return this.displayTitle;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.displayTitle;
            int iHashCode3 = (this.actionedImage.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            List<RubricatorWidgetAction> list = this.actions;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("RubricatorWidgetItem(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", displayTitle=");
            sb2.append(this.displayTitle);
            sb2.append(", actionedImage=");
            sb2.append(this.actionedImage);
            sb2.append(", actions=");
            return H.p(sb2, this.actions, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.displayTitle);
            this.actionedImage.writeToParcel(parcel, flags);
            List<RubricatorWidgetAction> list = this.actions;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((RubricatorWidgetAction) itA.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: RubricatorWidget.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType;", "Landroid/os/Parcelable;", "()V", "DynamicColumns", "FixedColumns", "Scrollable", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType$DynamicColumns;", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType$FixedColumns;", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType$Scrollable;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class RubricatorWidgetType implements Parcelable {

        /* compiled from: RubricatorWidget.kt */
        @d
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType$DynamicColumns;", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DynamicColumns extends RubricatorWidgetType {

            @k
            public static final DynamicColumns INSTANCE = new DynamicColumns();

            @k
            public static final Parcelable.Creator<DynamicColumns> CREATOR = new Creator();

            /* compiled from: RubricatorWidget.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DynamicColumns> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DynamicColumns createFromParcel(@k Parcel parcel) {
                    parcel.readInt();
                    return DynamicColumns.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DynamicColumns[] newArray(int i12) {
                    return new DynamicColumns[i12];
                }
            }

            private DynamicColumns() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof DynamicColumns);
            }

            public int hashCode() {
                return 269897554;
            }

            @k
            public String toString() {
                return "DynamicColumns";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: RubricatorWidget.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\b¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType$FixedColumns;", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType;", "", "columnCount", "tabletColumnCount", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType$FixedColumns;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getColumnCount", "getTabletColumnCount", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FixedColumns extends RubricatorWidgetType {

            @k
            public static final Parcelable.Creator<FixedColumns> CREATOR = new Creator();

            @c("columnCount")
            @l
            private final Integer columnCount;

            @c("tabletColumnCount")
            @l
            private final Integer tabletColumnCount;

            /* compiled from: RubricatorWidget.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<FixedColumns> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final FixedColumns createFromParcel(@k Parcel parcel) {
                    return new FixedColumns(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final FixedColumns[] newArray(int i12) {
                    return new FixedColumns[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public FixedColumns() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ FixedColumns copy$default(FixedColumns fixedColumns, Integer num, Integer num2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    num = fixedColumns.columnCount;
                }
                if ((i12 & 2) != 0) {
                    num2 = fixedColumns.tabletColumnCount;
                }
                return fixedColumns.copy(num, num2);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final Integer getColumnCount() {
                return this.columnCount;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final Integer getTabletColumnCount() {
                return this.tabletColumnCount;
            }

            @k
            public final FixedColumns copy(@l Integer columnCount, @l Integer tabletColumnCount) {
                return new FixedColumns(columnCount, tabletColumnCount);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FixedColumns)) {
                    return false;
                }
                FixedColumns fixedColumns = (FixedColumns) other;
                return L.f(this.columnCount, fixedColumns.columnCount) && L.f(this.tabletColumnCount, fixedColumns.tabletColumnCount);
            }

            @l
            public final Integer getColumnCount() {
                return this.columnCount;
            }

            @l
            public final Integer getTabletColumnCount() {
                return this.tabletColumnCount;
            }

            public int hashCode() {
                Integer num = this.columnCount;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.tabletColumnCount;
                return iHashCode + (num2 != null ? num2.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("FixedColumns(columnCount=");
                sb2.append(this.columnCount);
                sb2.append(", tabletColumnCount=");
                return s.j(sb2, this.tabletColumnCount, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                Integer num = this.columnCount;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num);
                }
                Integer num2 = this.tabletColumnCount;
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num2);
                }
            }

            public /* synthetic */ FixedColumns(Integer num, Integer num2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2);
            }

            public FixedColumns(@l Integer num, @l Integer num2) {
                super(null);
                this.columnCount = num;
                this.tabletColumnCount = num2;
            }
        }

        /* compiled from: RubricatorWidget.kt */
        @d
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType$Scrollable;", "Lcom/avito/android/remote/model/vertical_main/RubricatorWidget$RubricatorWidgetType;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Scrollable extends RubricatorWidgetType {

            @k
            public static final Scrollable INSTANCE = new Scrollable();

            @k
            public static final Parcelable.Creator<Scrollable> CREATOR = new Creator();

            /* compiled from: RubricatorWidget.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Scrollable> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Scrollable createFromParcel(@k Parcel parcel) {
                    parcel.readInt();
                    return Scrollable.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Scrollable[] newArray(int i12) {
                    return new Scrollable[i12];
                }
            }

            private Scrollable() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(1);
            }
        }

        public /* synthetic */ RubricatorWidgetType(C42822w c42822w) {
            this();
        }

        private RubricatorWidgetType() {
        }
    }

    public RubricatorWidget(@l RubricatorWidgetType rubricatorWidgetType, @l String str, @l List<RubricatorWidgetItem> list, @l RubricatorWidgetItem rubricatorWidgetItem, @l Analytics analytics, @l Settings settings) {
        this.displayingOptions = rubricatorWidgetType;
        this.title = str;
        this.items = list;
        this.additionalButton = rubricatorWidgetItem;
        this.analytics = analytics;
        this.settings = settings;
    }

    public static /* synthetic */ RubricatorWidget copy$default(RubricatorWidget rubricatorWidget, RubricatorWidgetType rubricatorWidgetType, String str, List list, RubricatorWidgetItem rubricatorWidgetItem, Analytics analytics, Settings settings, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            rubricatorWidgetType = rubricatorWidget.displayingOptions;
        }
        if ((i12 & 2) != 0) {
            str = rubricatorWidget.title;
        }
        String str2 = str;
        if ((i12 & 4) != 0) {
            list = rubricatorWidget.items;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            rubricatorWidgetItem = rubricatorWidget.additionalButton;
        }
        RubricatorWidgetItem rubricatorWidgetItem2 = rubricatorWidgetItem;
        if ((i12 & 16) != 0) {
            analytics = rubricatorWidget.analytics;
        }
        Analytics analytics2 = analytics;
        if ((i12 & 32) != 0) {
            settings = rubricatorWidget.settings;
        }
        return rubricatorWidget.copy(rubricatorWidgetType, str2, list2, rubricatorWidgetItem2, analytics2, settings);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final RubricatorWidgetType getDisplayingOptions() {
        return this.displayingOptions;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<RubricatorWidgetItem> component3() {
        return this.items;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final RubricatorWidgetItem getAdditionalButton() {
        return this.additionalButton;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    @k
    public final RubricatorWidget copy(@l RubricatorWidgetType displayingOptions, @l String title, @l List<RubricatorWidgetItem> items, @l RubricatorWidgetItem additionalButton, @l Analytics analytics, @l Settings settings) {
        return new RubricatorWidget(displayingOptions, title, items, additionalButton, analytics, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RubricatorWidget)) {
            return false;
        }
        RubricatorWidget rubricatorWidget = (RubricatorWidget) other;
        return L.f(this.displayingOptions, rubricatorWidget.displayingOptions) && L.f(this.title, rubricatorWidget.title) && L.f(this.items, rubricatorWidget.items) && L.f(this.additionalButton, rubricatorWidget.additionalButton) && L.f(this.analytics, rubricatorWidget.analytics) && L.f(this.settings, rubricatorWidget.settings);
    }

    @l
    public final RubricatorWidgetItem getAdditionalButton() {
        return this.additionalButton;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final RubricatorWidgetType getDisplayingOptions() {
        return this.displayingOptions;
    }

    @l
    public final List<RubricatorWidgetItem> getItems() {
        return this.items;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public long getF105229b() {
        return this.uniqueId;
    }

    public int hashCode() {
        RubricatorWidgetType rubricatorWidgetType = this.displayingOptions;
        int iHashCode = (rubricatorWidgetType == null ? 0 : rubricatorWidgetType.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<RubricatorWidgetItem> list = this.items;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        RubricatorWidgetItem rubricatorWidgetItem = this.additionalButton;
        int iHashCode4 = (iHashCode3 + (rubricatorWidgetItem == null ? 0 : rubricatorWidgetItem.hashCode())) * 31;
        Analytics analytics = this.analytics;
        int iHashCode5 = (iHashCode4 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.settings;
        return iHashCode5 + (settings != null ? settings.hashCode() : 0);
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

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RubricatorWidget(displayingOptions=");
        sb2.append(this.displayingOptions);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", additionalButton=");
        sb2.append(this.additionalButton);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.displayingOptions, flags);
        parcel.writeString(this.title);
        List<RubricatorWidgetItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((RubricatorWidgetItem) itA.next()).writeToParcel(parcel, flags);
            }
        }
        RubricatorWidgetItem rubricatorWidgetItem = this.additionalButton;
        if (rubricatorWidgetItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rubricatorWidgetItem.writeToParcel(parcel, flags);
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

    public /* synthetic */ RubricatorWidget(RubricatorWidgetType rubricatorWidgetType, String str, List list, RubricatorWidgetItem rubricatorWidgetItem, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : rubricatorWidgetType, (i12 & 2) != 0 ? null : str, list, (i12 & 8) != 0 ? null : rubricatorWidgetItem, (i12 & 16) != 0 ? null : analytics, (i12 & 32) != 0 ? null : settings);
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
