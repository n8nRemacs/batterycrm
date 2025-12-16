package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: WitcherElement.kt */
@d
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005QRSTUB¹\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020 HÖ\u0001¢\u0006\u0004\b'\u0010(R\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b4\u00103R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b5\u00103R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b9\u00103R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010BR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00106\u001a\u0004\bC\u00108R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010D\u001a\u0004\bE\u0010FR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006V"}, d2 = {"Lcom/avito/android/remote/model/WitcherElement;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/FavoriteElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "uniqueId", "Lcom/avito/android/remote/model/WitcherElement$SelectionType;", "selectionType", "", "titleText", "title", "subtitleText", "", "items", "legacyActionTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "legacyActionLink", "Lcom/avito/android/remote/model/ButtonAction;", "action", "", "wrapAction", "Lcom/avito/android/remote/model/WitcherElement$WidgetIndents;", "widgetsIndents", "Lcom/avito/android/remote/model/WitcherElement$AnalyticsMode;", "analyticsMode", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(JLcom/avito/android/remote/model/WitcherElement$SelectionType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/ButtonAction;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/WitcherElement$AnalyticsMode;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "Lcom/avito/android/remote/model/WitcherElement$SelectionType;", "getSelectionType", "()Lcom/avito/android/remote/model/WitcherElement$SelectionType;", "Ljava/lang/String;", "getTitleText", "()Ljava/lang/String;", "getTitle", "getSubtitleText", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getLegacyActionTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLegacyActionLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/ButtonAction;", "getAction", "()Lcom/avito/android/remote/model/ButtonAction;", "Ljava/lang/Boolean;", "getWrapAction", "()Ljava/lang/Boolean;", "getWidgetsIndents", "Lcom/avito/android/remote/model/WitcherElement$AnalyticsMode;", "getAnalyticsMode", "()Lcom/avito/android/remote/model/WitcherElement$AnalyticsMode;", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "AnalyticsMode", "Indents", "SelectionType", "WidgetIndents", "WidgetType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WitcherElement implements SerpElement, AnalyticsElement, FavoriteElement, SettingsElement {

    @k
    public static final Parcelable.Creator<WitcherElement> CREATOR = new Creator();

    @c("action")
    @l
    private final ButtonAction action;

    @c("analytics")
    @l
    private Analytics analytics;

    @c("analyticsMode")
    @l
    private final AnalyticsMode analyticsMode;

    @c("items")
    @l
    private final List<SerpElement> items;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink legacyActionLink;

    @c("button_text")
    @l
    private final String legacyActionTitle;

    @c("selection_type")
    @l
    private final SelectionType selectionType;

    @c("settings")
    @l
    private Settings settings;

    @c("subtitle_text")
    @l
    private final String subtitleText;

    @c("title")
    @l
    private final String title;

    @c("title_text")
    @l
    private final String titleText;
    private long uniqueId;

    @c("widgetsIndents")
    @l
    private final List<WidgetIndents> widgetsIndents;

    @c("wrapAction")
    @l
    private final Boolean wrapAction;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WitcherElement.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/WitcherElement$AnalyticsMode;", "", "(Ljava/lang/String;I)V", "REAL_ESTATE", "DEFAULT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnalyticsMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AnalyticsMode[] $VALUES;

        @c("real_estate")
        public static final AnalyticsMode REAL_ESTATE = new AnalyticsMode("REAL_ESTATE", 0);

        @com.avito.android.gson.c
        public static final AnalyticsMode DEFAULT = new AnalyticsMode("DEFAULT", 1);

        private static final /* synthetic */ AnalyticsMode[] $values() {
            return new AnalyticsMode[]{REAL_ESTATE, DEFAULT};
        }

        static {
            AnalyticsMode[] analyticsModeArr$values = $values();
            $VALUES = analyticsModeArr$values;
            $ENTRIES = kotlin.enums.c.a(analyticsModeArr$values);
        }

        private AnalyticsMode(String str, int i12) {
        }

        @k
        public static a<AnalyticsMode> getEntries() {
            return $ENTRIES;
        }

        public static AnalyticsMode valueOf(String str) {
            return (AnalyticsMode) Enum.valueOf(AnalyticsMode.class, str);
        }

        public static AnalyticsMode[] values() {
            return (AnalyticsMode[]) $VALUES.clone();
        }
    }

    /* compiled from: WitcherElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WitcherElement> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final WitcherElement createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            ArrayList arrayList2;
            long j12 = parcel.readLong();
            SelectionType selectionTypeValueOf = parcel.readInt() == 0 ? null : SelectionType.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(WitcherElement.class, parcel, arrayList, iL2, 1);
                }
            }
            String string4 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(WitcherElement.class.getClassLoader());
            ButtonAction buttonActionCreateFromParcel = parcel.readInt() == 0 ? null : ButtonAction.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(WidgetIndents.CREATOR, parcel, arrayList2, iC2, 1);
                    i13 = i13;
                }
            }
            return new WitcherElement(j12, selectionTypeValueOf, string, string2, string3, arrayList, string4, deepLink, buttonActionCreateFromParcel, boolValueOf, arrayList2, parcel.readInt() == 0 ? null : AnalyticsMode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Settings.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final WitcherElement[] newArray(int i12) {
            return new WitcherElement[i12];
        }
    }

    /* compiled from: WitcherElement.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\n¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/WitcherElement$Indents;", "Landroid/os/Parcelable;", "", "top", "bottom", "start", "end", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/remote/model/WitcherElement$Indents;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getTop", "getBottom", "getStart", "getEnd", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Indents implements Parcelable {

        @k
        public static final Parcelable.Creator<Indents> CREATOR = new Creator();

        @c("bottom")
        @l
        private final Integer bottom;

        @c("end")
        @l
        private final Integer end;

        @c("start")
        @l
        private final Integer start;

        @c("top")
        @l
        private final Integer top;

        /* compiled from: WitcherElement.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Indents> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Indents createFromParcel(@k Parcel parcel) {
                return new Indents(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Indents[] newArray(int i12) {
                return new Indents[i12];
            }
        }

        public Indents() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Indents copy$default(Indents indents, Integer num, Integer num2, Integer num3, Integer num4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                num = indents.top;
            }
            if ((i12 & 2) != 0) {
                num2 = indents.bottom;
            }
            if ((i12 & 4) != 0) {
                num3 = indents.start;
            }
            if ((i12 & 8) != 0) {
                num4 = indents.end;
            }
            return indents.copy(num, num2, num3, num4);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Integer getTop() {
            return this.top;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Integer getBottom() {
            return this.bottom;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Integer getStart() {
            return this.start;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Integer getEnd() {
            return this.end;
        }

        @k
        public final Indents copy(@l Integer top, @l Integer bottom, @l Integer start, @l Integer end) {
            return new Indents(top, bottom, start, end);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Indents)) {
                return false;
            }
            Indents indents = (Indents) other;
            return L.f(this.top, indents.top) && L.f(this.bottom, indents.bottom) && L.f(this.start, indents.start) && L.f(this.end, indents.end);
        }

        @l
        public final Integer getBottom() {
            return this.bottom;
        }

        @l
        public final Integer getEnd() {
            return this.end;
        }

        @l
        public final Integer getStart() {
            return this.start;
        }

        @l
        public final Integer getTop() {
            return this.top;
        }

        public int hashCode() {
            Integer num = this.top;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.bottom;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.start;
            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.end;
            return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Indents(top=");
            sb2.append(this.top);
            sb2.append(", bottom=");
            sb2.append(this.bottom);
            sb2.append(", start=");
            sb2.append(this.start);
            sb2.append(", end=");
            return s.j(sb2, this.end, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Integer num = this.top;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.bottom;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
            Integer num3 = this.start;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num3);
            }
            Integer num4 = this.end;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num4);
            }
        }

        public Indents(@l Integer num, @l Integer num2, @l Integer num3, @l Integer num4) {
            this.top = num;
            this.bottom = num2;
            this.start = num3;
            this.end = num4;
        }

        public /* synthetic */ Indents(Integer num, Integer num2, Integer num3, Integer num4, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2, (i12 & 4) != 0 ? null : num3, (i12 & 8) != 0 ? null : num4);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WitcherElement.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/WitcherElement$SelectionType;", "", "(Ljava/lang/String;I)V", "SCROLLABLE_CLICKABLE_HEADER", "TRANSPARENT", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelectionType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SelectionType[] $VALUES;

        @c("carousel_clickable_header")
        public static final SelectionType SCROLLABLE_CLICKABLE_HEADER = new SelectionType("SCROLLABLE_CLICKABLE_HEADER", 0);

        @c("transparent")
        public static final SelectionType TRANSPARENT = new SelectionType("TRANSPARENT", 1);

        private static final /* synthetic */ SelectionType[] $values() {
            return new SelectionType[]{SCROLLABLE_CLICKABLE_HEADER, TRANSPARENT};
        }

        static {
            SelectionType[] selectionTypeArr$values = $values();
            $VALUES = selectionTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(selectionTypeArr$values);
        }

        private SelectionType(String str, int i12) {
        }

        @k
        public static a<SelectionType> getEntries() {
            return $ENTRIES;
        }

        public static SelectionType valueOf(String str) {
            return (SelectionType) Enum.valueOf(SelectionType.class, str);
        }

        public static SelectionType[] values() {
            return (SelectionType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WitcherElement.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/WitcherElement$WidgetType;", "", "(Ljava/lang/String;I)V", "EXTERNAL_ROOT_CONTAINER", "INNER_ROOT_CONTAINER", "TITLE", "SUBTITLE", "CONTENT_CONTAINER", "BUTTON", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class WidgetType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ WidgetType[] $VALUES;

        @c("external_root_container")
        public static final WidgetType EXTERNAL_ROOT_CONTAINER = new WidgetType("EXTERNAL_ROOT_CONTAINER", 0);

        @c("inner_root_container")
        public static final WidgetType INNER_ROOT_CONTAINER = new WidgetType("INNER_ROOT_CONTAINER", 1);

        @c("title")
        public static final WidgetType TITLE = new WidgetType("TITLE", 2);

        @c("subtitle")
        public static final WidgetType SUBTITLE = new WidgetType("SUBTITLE", 3);

        @c("content_container")
        public static final WidgetType CONTENT_CONTAINER = new WidgetType("CONTENT_CONTAINER", 4);

        @c("button")
        public static final WidgetType BUTTON = new WidgetType("BUTTON", 5);

        private static final /* synthetic */ WidgetType[] $values() {
            return new WidgetType[]{EXTERNAL_ROOT_CONTAINER, INNER_ROOT_CONTAINER, TITLE, SUBTITLE, CONTENT_CONTAINER, BUTTON};
        }

        static {
            WidgetType[] widgetTypeArr$values = $values();
            $VALUES = widgetTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(widgetTypeArr$values);
        }

        private WidgetType(String str, int i12) {
        }

        @k
        public static a<WidgetType> getEntries() {
            return $ENTRIES;
        }

        public static WidgetType valueOf(String str) {
            return (WidgetType) Enum.valueOf(WidgetType.class, str);
        }

        public static WidgetType[] values() {
            return (WidgetType[]) $VALUES.clone();
        }
    }

    public WitcherElement() {
        this(0L, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final ButtonAction getAction() {
        return this.action;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final AnalyticsMode getAnalyticsMode() {
        return this.analyticsMode;
    }

    @l
    public final List<SerpElement> getItems() {
        return this.items;
    }

    @l
    public final DeepLink getLegacyActionLink() {
        return this.legacyActionLink;
    }

    @l
    public final String getLegacyActionTitle() {
        return this.legacyActionTitle;
    }

    @l
    public final SelectionType getSelectionType() {
        return this.selectionType;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @l
    public final String getSubtitleText() {
        return this.subtitleText;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getTitleText() {
        return this.titleText;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    @l
    public final List<WidgetIndents> getWidgetsIndents() {
        return this.widgetsIndents;
    }

    @l
    public final Boolean getWrapAction() {
        return this.wrapAction;
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
        parcel.writeLong(this.uniqueId);
        SelectionType selectionType = this.selectionType;
        if (selectionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(selectionType.name());
        }
        parcel.writeString(this.titleText);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitleText);
        List<SerpElement> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.legacyActionTitle);
        parcel.writeParcelable(this.legacyActionLink, flags);
        ButtonAction buttonAction = this.action;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonAction.writeToParcel(parcel, flags);
        }
        Boolean bool = this.wrapAction;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<WidgetIndents> list2 = this.widgetsIndents;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((WidgetIndents) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        AnalyticsMode analyticsMode = this.analyticsMode;
        if (analyticsMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(analyticsMode.name());
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

    /* JADX WARN: Multi-variable type inference failed */
    public WitcherElement(long j12, @l SelectionType selectionType, @l String str, @l String str2, @l String str3, @l List<? extends SerpElement> list, @l String str4, @l DeepLink deepLink, @l ButtonAction buttonAction, @l Boolean bool, @l List<WidgetIndents> list2, @l AnalyticsMode analyticsMode, @l Analytics analytics, @l Settings settings) {
        this.uniqueId = j12;
        this.selectionType = selectionType;
        this.titleText = str;
        this.title = str2;
        this.subtitleText = str3;
        this.items = list;
        this.legacyActionTitle = str4;
        this.legacyActionLink = deepLink;
        this.action = buttonAction;
        this.wrapAction = bool;
        this.widgetsIndents = list2;
        this.analyticsMode = analyticsMode;
        this.analytics = analytics;
        this.settings = settings;
    }

    /* compiled from: WitcherElement.kt */
    @d
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\f¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/WitcherElement$WidgetIndents;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/WitcherElement$WidgetType;", "widgetType", "Lcom/avito/android/remote/model/WitcherElement$Indents;", "margins", "paddings", "<init>", "(Lcom/avito/android/remote/model/WitcherElement$WidgetType;Lcom/avito/android/remote/model/WitcherElement$Indents;Lcom/avito/android/remote/model/WitcherElement$Indents;)V", "component1", "()Lcom/avito/android/remote/model/WitcherElement$WidgetType;", "component2", "()Lcom/avito/android/remote/model/WitcherElement$Indents;", "component3", "copy", "(Lcom/avito/android/remote/model/WitcherElement$WidgetType;Lcom/avito/android/remote/model/WitcherElement$Indents;Lcom/avito/android/remote/model/WitcherElement$Indents;)Lcom/avito/android/remote/model/WitcherElement$WidgetIndents;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/WitcherElement$WidgetType;", "getWidgetType", "Lcom/avito/android/remote/model/WitcherElement$Indents;", "getMargins", "getPaddings", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WidgetIndents implements Parcelable {

        @k
        public static final Parcelable.Creator<WidgetIndents> CREATOR = new Creator();

        @c("margins")
        @l
        private final Indents margins;

        @c("paddings")
        @l
        private final Indents paddings;

        @c("widgetType")
        @k
        private final WidgetType widgetType;

        /* compiled from: WitcherElement.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WidgetIndents> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final WidgetIndents createFromParcel(@k Parcel parcel) {
                return new WidgetIndents(WidgetType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Indents.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Indents.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final WidgetIndents[] newArray(int i12) {
                return new WidgetIndents[i12];
            }
        }

        public WidgetIndents(@k WidgetType widgetType, @l Indents indents, @l Indents indents2) {
            this.widgetType = widgetType;
            this.margins = indents;
            this.paddings = indents2;
        }

        public static /* synthetic */ WidgetIndents copy$default(WidgetIndents widgetIndents, WidgetType widgetType, Indents indents, Indents indents2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                widgetType = widgetIndents.widgetType;
            }
            if ((i12 & 2) != 0) {
                indents = widgetIndents.margins;
            }
            if ((i12 & 4) != 0) {
                indents2 = widgetIndents.paddings;
            }
            return widgetIndents.copy(widgetType, indents, indents2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final WidgetType getWidgetType() {
            return this.widgetType;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Indents getMargins() {
            return this.margins;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Indents getPaddings() {
            return this.paddings;
        }

        @k
        public final WidgetIndents copy(@k WidgetType widgetType, @l Indents margins, @l Indents paddings) {
            return new WidgetIndents(widgetType, margins, paddings);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WidgetIndents)) {
                return false;
            }
            WidgetIndents widgetIndents = (WidgetIndents) other;
            return this.widgetType == widgetIndents.widgetType && L.f(this.margins, widgetIndents.margins) && L.f(this.paddings, widgetIndents.paddings);
        }

        @l
        public final Indents getMargins() {
            return this.margins;
        }

        @l
        public final Indents getPaddings() {
            return this.paddings;
        }

        @k
        public final WidgetType getWidgetType() {
            return this.widgetType;
        }

        public int hashCode() {
            int iHashCode = this.widgetType.hashCode() * 31;
            Indents indents = this.margins;
            int iHashCode2 = (iHashCode + (indents == null ? 0 : indents.hashCode())) * 31;
            Indents indents2 = this.paddings;
            return iHashCode2 + (indents2 != null ? indents2.hashCode() : 0);
        }

        @k
        public String toString() {
            return "WidgetIndents(widgetType=" + this.widgetType + ", margins=" + this.margins + ", paddings=" + this.paddings + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.widgetType.name());
            Indents indents = this.margins;
            if (indents == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                indents.writeToParcel(parcel, flags);
            }
            Indents indents2 = this.paddings;
            if (indents2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                indents2.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ WidgetIndents(WidgetType widgetType, Indents indents, Indents indents2, int i12, C42822w c42822w) {
            this(widgetType, (i12 & 2) != 0 ? null : indents, (i12 & 4) != 0 ? null : indents2);
        }
    }

    public WitcherElement(long j12, SelectionType selectionType, String str, String str2, String str3, List list, String str4, DeepLink deepLink, ButtonAction buttonAction, Boolean bool, List list2, AnalyticsMode analyticsMode, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0L : j12, (i12 & 2) != 0 ? null : selectionType, (i12 & 4) != 0 ? "" : str, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? C42784z0.f406748b : list, (i12 & 64) == 0 ? str4 : "", (i12 & 128) != 0 ? null : deepLink, (i12 & 256) != 0 ? null : buttonAction, (i12 & 512) != 0 ? null : bool, (i12 & 1024) != 0 ? null : list2, (i12 & 2048) != 0 ? AnalyticsMode.DEFAULT : analyticsMode, (i12 & 4096) != 0 ? null : analytics, (i12 & 8192) == 0 ? settings : null);
    }
}
