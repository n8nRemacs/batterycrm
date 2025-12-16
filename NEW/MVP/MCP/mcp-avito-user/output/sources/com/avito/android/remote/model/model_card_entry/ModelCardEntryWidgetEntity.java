package com.avito.android.remote.model.model_card_entry;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
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

/* compiled from: ModelCardEntryWidgetEntity.kt */
@d
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002GHBM\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ^\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020 HÖ\u0001¢\u0006\u0004\b(\u0010\"J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020 HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u0016R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u0018R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001a\"\u0004\b8\u00109R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010=R(\u0010?\u001a\u00020>8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b?\u0010@\u0012\u0004\bE\u0010F\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006I"}, d2 = {"Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "title", "subtitle", "Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity$Action;", "action", "", "Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity$Item;", "items", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity$Action;Ljava/util/List;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity$Action;", "component4", "()Ljava/util/List;", "component5", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component6", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity$Action;Ljava/util/List;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity$Action;", "getAction", "Ljava/util/List;", "getItems", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "Action", "Item", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ModelCardEntryWidgetEntity implements SerpElement, AnalyticsElement, SettingsElement {

    @k
    public static final Parcelable.Creator<ModelCardEntryWidgetEntity> CREATOR = new Creator();

    @c("titleAction")
    @l
    private final Action action;

    @c("analytics")
    @l
    private Analytics analytics;

    @c("items")
    @l
    private final List<Item> items;

    @c("settings")
    @l
    private Settings settings;

    @c("subTitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;
    private transient long uniqueId;

    /* compiled from: ModelCardEntryWidgetEntity.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity$Action;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity$Action;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        /* compiled from: ModelCardEntryWidgetEntity.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Action> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action createFromParcel(@k Parcel parcel) {
                return new Action((DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@l DeepLink deepLink) {
            this.deepLink = deepLink;
        }

        public static /* synthetic */ Action copy$default(Action action, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                deepLink = action.deepLink;
            }
            return action.copy(deepLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final Action copy(@l DeepLink deepLink) {
            return new Action(deepLink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Action) && L.f(this.deepLink, ((Action) other).deepLink);
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        public int hashCode() {
            DeepLink deepLink = this.deepLink;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public String toString() {
            return a.v(new StringBuilder("Action(deepLink="), this.deepLink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.deepLink, flags);
        }
    }

    /* compiled from: ModelCardEntryWidgetEntity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ModelCardEntryWidgetEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ModelCardEntryWidgetEntity createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Action actionCreateFromParcel = parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Item.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new ModelCardEntryWidgetEntity(string, string2, actionCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ModelCardEntryWidgetEntity[] newArray(int i12) {
            return new ModelCardEntryWidgetEntity[i12];
        }
    }

    /* compiled from: ModelCardEntryWidgetEntity.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity$Item;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity$Action;", "action", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity$Action;Lcom/avito/android/remote/model/UniversalImage;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity$Action;", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity$Action;Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity$Item;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/model_card_entry/ModelCardEntryWidgetEntity$Action;", "getAction", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Item implements Parcelable {

        @k
        public static final Parcelable.Creator<Item> CREATOR = new Creator();

        @c("action")
        @l
        private final Action action;

        @c("image")
        @l
        private final UniversalImage image;

        @c("subTitle")
        @l
        private final String subtitle;

        @c("title")
        @l
        private final String title;

        /* compiled from: ModelCardEntryWidgetEntity.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Item createFromParcel(@k Parcel parcel) {
                return new Item(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(Item.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Item[] newArray(int i12) {
                return new Item[i12];
            }
        }

        public Item(@l String str, @l String str2, @l Action action, @l UniversalImage universalImage) {
            this.title = str;
            this.subtitle = str2;
            this.action = action;
            this.image = universalImage;
        }

        public static /* synthetic */ Item copy$default(Item item, String str, String str2, Action action, UniversalImage universalImage, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = item.title;
            }
            if ((i12 & 2) != 0) {
                str2 = item.subtitle;
            }
            if ((i12 & 4) != 0) {
                action = item.action;
            }
            if ((i12 & 8) != 0) {
                universalImage = item.image;
            }
            return item.copy(str, str2, action, universalImage);
        }

        @l
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
        public final Action getAction() {
            return this.action;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final Item copy(@l String title, @l String subtitle, @l Action action, @l UniversalImage image) {
            return new Item(title, subtitle, action, image);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return L.f(this.title, item.title) && L.f(this.subtitle, item.subtitle) && L.f(this.action, item.action) && L.f(this.image, item.image);
        }

        @l
        public final Action getAction() {
            return this.action;
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

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Action action = this.action;
            int iHashCode3 = (iHashCode2 + (action == null ? 0 : action.hashCode())) * 31;
            UniversalImage universalImage = this.image;
            return iHashCode3 + (universalImage != null ? universalImage.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Item(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", action=");
            sb2.append(this.action);
            sb2.append(", image=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            Action action = this.action;
            if (action == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                action.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.image, flags);
        }
    }

    public ModelCardEntryWidgetEntity(@l String str, @l String str2, @l Action action, @l List<Item> list, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.subtitle = str2;
        this.action = action;
        this.items = list;
        this.analytics = analytics;
        this.settings = settings;
    }

    public static /* synthetic */ ModelCardEntryWidgetEntity copy$default(ModelCardEntryWidgetEntity modelCardEntryWidgetEntity, String str, String str2, Action action, List list, Analytics analytics, Settings settings, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = modelCardEntryWidgetEntity.title;
        }
        if ((i12 & 2) != 0) {
            str2 = modelCardEntryWidgetEntity.subtitle;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            action = modelCardEntryWidgetEntity.action;
        }
        Action action2 = action;
        if ((i12 & 8) != 0) {
            list = modelCardEntryWidgetEntity.items;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            analytics = modelCardEntryWidgetEntity.analytics;
        }
        Analytics analytics2 = analytics;
        if ((i12 & 32) != 0) {
            settings = modelCardEntryWidgetEntity.settings;
        }
        return modelCardEntryWidgetEntity.copy(str, str3, action2, list2, analytics2, settings);
    }

    @l
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
    public final Action getAction() {
        return this.action;
    }

    @l
    public final List<Item> component4() {
        return this.items;
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
    public final ModelCardEntryWidgetEntity copy(@l String title, @l String subtitle, @l Action action, @l List<Item> items, @l Analytics analytics, @l Settings settings) {
        return new ModelCardEntryWidgetEntity(title, subtitle, action, items, analytics, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelCardEntryWidgetEntity)) {
            return false;
        }
        ModelCardEntryWidgetEntity modelCardEntryWidgetEntity = (ModelCardEntryWidgetEntity) other;
        return L.f(this.title, modelCardEntryWidgetEntity.title) && L.f(this.subtitle, modelCardEntryWidgetEntity.subtitle) && L.f(this.action, modelCardEntryWidgetEntity.action) && L.f(this.items, modelCardEntryWidgetEntity.items) && L.f(this.analytics, modelCardEntryWidgetEntity.analytics) && L.f(this.settings, modelCardEntryWidgetEntity.settings);
    }

    @l
    public final Action getAction() {
        return this.action;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final List<Item> getItems() {
        return this.items;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Action action = this.action;
        int iHashCode3 = (iHashCode2 + (action == null ? 0 : action.hashCode())) * 31;
        List<Item> list = this.items;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
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
        StringBuilder sb2 = new StringBuilder("ModelCardEntryWidgetEntity(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Action action = this.action;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, flags);
        }
        List<Item> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Item) itA.next()).writeToParcel(parcel, flags);
            }
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

    public /* synthetic */ ModelCardEntryWidgetEntity(String str, String str2, Action action, List list, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, str2, action, list, (i12 & 16) != 0 ? null : analytics, (i12 & 32) != 0 ? null : settings);
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
