package com.avito.android.remote.model.sales;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.ToolbarConfigElement;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.sales.utils.Timer;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SalesHeaderWidget.kt */
@d
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004nopqB\u0091\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b5\u00106J°\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b9\u0010)J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010@\u001a\u00020?2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020:HÖ\u0001¢\u0006\u0004\bB\u0010<J \u0010G\u001a\u00020F2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020:HÖ\u0001¢\u0006\u0004\bG\u0010HR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bJ\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\bK\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bM\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bO\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010P\u001a\u0004\bQ\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010R\u001a\u0004\bS\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010T\u001a\u0004\bU\u0010+R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bW\u0010-R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010V\u001a\u0004\bX\u0010-R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010Y\u001a\u0004\bZ\u00100R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010[\u001a\u0004\b\\\u00102R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010]\u001a\u0004\b^\u00104\"\u0004\b_\u0010`R$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010a\u001a\u0004\bb\u00106\"\u0004\bc\u0010dR(\u0010f\u001a\u00020e8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bf\u0010g\u0012\u0004\bl\u0010m\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k¨\u0006r"}, d2 = {"Lcom/avito/android/remote/model/sales/SalesHeaderWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/ToolbarConfigElement;", "Lcom/avito/android/remote/model/SettingsElement;", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedTitle", "attributedSubtitle", "Lcom/avito/android/remote/model/sales/SalesHeaderWidget$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/sales/SaleShortcuts;", "shortcuts", "Lcom/avito/android/remote/model/ToolbarConfig;", "toolbarConfig", "", "stickerText", "Lcom/avito/android/remote/model/sales/SalesHeaderWidget$Timer;", "timer", "Lcom/avito/android/remote/model/UniversalImage;", "image", "bottomImage", "Lcom/avito/android/remote/model/sales/SalesHeaderWidget$ImageDisplayMode;", "imageDisplayMode", "", "internalWidgets", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/sales/SalesHeaderWidget$Style;Lcom/avito/android/remote/model/sales/SaleShortcuts;Lcom/avito/android/remote/model/ToolbarConfig;Ljava/lang/String;Lcom/avito/android/remote/model/sales/SalesHeaderWidget$Timer;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/sales/SalesHeaderWidget$ImageDisplayMode;Ljava/util/List;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Lcom/avito/android/remote/model/sales/SalesHeaderWidget$Style;", "component4", "()Lcom/avito/android/remote/model/sales/SaleShortcuts;", "component5", "()Lcom/avito/android/remote/model/ToolbarConfig;", "component6", "()Ljava/lang/String;", "component7", "()Lcom/avito/android/remote/model/sales/SalesHeaderWidget$Timer;", "component8", "()Lcom/avito/android/remote/model/UniversalImage;", "component9", "component10", "()Lcom/avito/android/remote/model/sales/SalesHeaderWidget$ImageDisplayMode;", "component11", "()Ljava/util/List;", "component12", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component13", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/sales/SalesHeaderWidget$Style;Lcom/avito/android/remote/model/sales/SaleShortcuts;Lcom/avito/android/remote/model/ToolbarConfig;Ljava/lang/String;Lcom/avito/android/remote/model/sales/SalesHeaderWidget$Timer;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/sales/SalesHeaderWidget$ImageDisplayMode;Ljava/util/List;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/sales/SalesHeaderWidget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedTitle", "getAttributedSubtitle", "Lcom/avito/android/remote/model/sales/SalesHeaderWidget$Style;", "getStyle", "Lcom/avito/android/remote/model/sales/SaleShortcuts;", "getShortcuts", "Lcom/avito/android/remote/model/ToolbarConfig;", "getToolbarConfig", "Ljava/lang/String;", "getStickerText", "Lcom/avito/android/remote/model/sales/SalesHeaderWidget$Timer;", "getTimer", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "getBottomImage", "Lcom/avito/android/remote/model/sales/SalesHeaderWidget$ImageDisplayMode;", "getImageDisplayMode", "Ljava/util/List;", "getInternalWidgets", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "DateBadgeStyle", "ImageDisplayMode", "Style", "Timer", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SalesHeaderWidget implements SerpElement, AnalyticsElement, ToolbarConfigElement, SettingsElement {

    @k
    public static final Parcelable.Creator<SalesHeaderWidget> CREATOR = new Creator();

    @c("analytics")
    @l
    private Analytics analytics;

    @c("attributedSubtitle")
    @l
    private final AttributedText attributedSubtitle;

    @c("attributedTitle")
    @l
    private final AttributedText attributedTitle;

    @c("bottomImage")
    @l
    private final UniversalImage bottomImage;

    @c("image")
    @l
    private final UniversalImage image;

    @c("imageDisplayMode")
    @l
    private final ImageDisplayMode imageDisplayMode;

    @c("internalWidgets")
    @l
    private final List<SerpElement> internalWidgets;

    @c("settings")
    @l
    private Settings settings;

    @c("shortcuts")
    @l
    private final SaleShortcuts shortcuts;

    @c("stickerText")
    @l
    private final String stickerText;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final Style style;

    @c("timer")
    @l
    private final Timer timer;

    @c("toolbarConfig")
    @l
    private final ToolbarConfig toolbarConfig;
    private transient long uniqueId;

    /* compiled from: SalesHeaderWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SalesHeaderWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SalesHeaderWidget createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(SalesHeaderWidget.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(SalesHeaderWidget.class.getClassLoader());
            Style styleCreateFromParcel = Style.CREATOR.createFromParcel(parcel);
            SaleShortcuts saleShortcutsCreateFromParcel = parcel.readInt() == 0 ? null : SaleShortcuts.CREATOR.createFromParcel(parcel);
            ToolbarConfig toolbarConfigCreateFromParcel = parcel.readInt() == 0 ? null : ToolbarConfig.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            Timer timerCreateFromParcel = parcel.readInt() == 0 ? null : Timer.CREATOR.createFromParcel(parcel);
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(SalesHeaderWidget.class.getClassLoader());
            UniversalImage universalImage2 = (UniversalImage) parcel.readParcelable(SalesHeaderWidget.class.getClassLoader());
            ImageDisplayMode imageDisplayModeValueOf = parcel.readInt() == 0 ? null : ImageDisplayMode.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(SalesHeaderWidget.class, parcel, arrayList, iL2, 1);
                }
            }
            return new SalesHeaderWidget(attributedText, attributedText2, styleCreateFromParcel, saleShortcutsCreateFromParcel, toolbarConfigCreateFromParcel, string, timerCreateFromParcel, universalImage, universalImage2, imageDisplayModeValueOf, arrayList, parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Settings.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SalesHeaderWidget[] newArray(int i12) {
            return new SalesHeaderWidget[i12];
        }
    }

    /* compiled from: SalesHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/sales/SalesHeaderWidget$DateBadgeStyle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "textColor", "backgroundColor", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/sales/SalesHeaderWidget$DateBadgeStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getTextColor", "getBackgroundColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DateBadgeStyle implements Parcelable {

        @k
        public static final Parcelable.Creator<DateBadgeStyle> CREATOR = new Creator();

        @c("backgroundColor")
        @k
        private final UniversalColor backgroundColor;

        @c("textColor")
        @k
        private final UniversalColor textColor;

        /* compiled from: SalesHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DateBadgeStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DateBadgeStyle createFromParcel(@k Parcel parcel) {
                return new DateBadgeStyle((UniversalColor) parcel.readParcelable(DateBadgeStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(DateBadgeStyle.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DateBadgeStyle[] newArray(int i12) {
                return new DateBadgeStyle[i12];
            }
        }

        public DateBadgeStyle(@k UniversalColor universalColor, @k UniversalColor universalColor2) {
            this.textColor = universalColor;
            this.backgroundColor = universalColor2;
        }

        public static /* synthetic */ DateBadgeStyle copy$default(DateBadgeStyle dateBadgeStyle, UniversalColor universalColor, UniversalColor universalColor2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalColor = dateBadgeStyle.textColor;
            }
            if ((i12 & 2) != 0) {
                universalColor2 = dateBadgeStyle.backgroundColor;
            }
            return dateBadgeStyle.copy(universalColor, universalColor2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @k
        public final DateBadgeStyle copy(@k UniversalColor textColor, @k UniversalColor backgroundColor) {
            return new DateBadgeStyle(textColor, backgroundColor);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateBadgeStyle)) {
                return false;
            }
            DateBadgeStyle dateBadgeStyle = (DateBadgeStyle) other;
            return L.f(this.textColor, dateBadgeStyle.textColor) && L.f(this.backgroundColor, dateBadgeStyle.backgroundColor);
        }

        @k
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @k
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            return this.backgroundColor.hashCode() + (this.textColor.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DateBadgeStyle(textColor=");
            sb2.append(this.textColor);
            sb2.append(", backgroundColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.backgroundColor, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.textColor, flags);
            parcel.writeParcelable(this.backgroundColor, flags);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SalesHeaderWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/sales/SalesHeaderWidget$ImageDisplayMode;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ImageDisplayMode {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ ImageDisplayMode[] $VALUES;

        @c("top")
        public static final ImageDisplayMode TOP = new ImageDisplayMode("TOP", 0);

        @c("bottom")
        public static final ImageDisplayMode BOTTOM = new ImageDisplayMode("BOTTOM", 1);

        private static final /* synthetic */ ImageDisplayMode[] $values() {
            return new ImageDisplayMode[]{TOP, BOTTOM};
        }

        static {
            ImageDisplayMode[] imageDisplayModeArr$values = $values();
            $VALUES = imageDisplayModeArr$values;
            $ENTRIES = kotlin.enums.c.a(imageDisplayModeArr$values);
        }

        private ImageDisplayMode(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<ImageDisplayMode> getEntries() {
            return $ENTRIES;
        }

        public static ImageDisplayMode valueOf(String str) {
            return (ImageDisplayMode) Enum.valueOf(ImageDisplayMode.class, str);
        }

        public static ImageDisplayMode[] values() {
            return (ImageDisplayMode[]) $VALUES.clone();
        }
    }

    /* compiled from: SalesHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/sales/SalesHeaderWidget$Style;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/sales/SalesHeaderWidget$Style;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Style implements Parcelable {

        @k
        public static final Parcelable.Creator<Style> CREATOR = new Creator();

        @c("backgroundColor")
        @k
        private final UniversalColor backgroundColor;

        /* compiled from: SalesHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Style> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Style createFromParcel(@k Parcel parcel) {
                return new Style((UniversalColor) parcel.readParcelable(Style.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Style[] newArray(int i12) {
                return new Style[i12];
            }
        }

        public Style(@k UniversalColor universalColor) {
            this.backgroundColor = universalColor;
        }

        public static /* synthetic */ Style copy$default(Style style, UniversalColor universalColor, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalColor = style.backgroundColor;
            }
            return style.copy(universalColor);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @k
        public final Style copy(@k UniversalColor backgroundColor) {
            return new Style(backgroundColor);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Style) && L.f(this.backgroundColor, ((Style) other).backgroundColor);
        }

        @k
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        public int hashCode() {
            return this.backgroundColor.hashCode();
        }

        @k
        public String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.r(new StringBuilder("Style(backgroundColor="), this.backgroundColor, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.backgroundColor, flags);
        }
    }

    /* compiled from: SalesHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JJ\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u0017¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/sales/SalesHeaderWidget$Timer;", "Landroid/os/Parcelable;", "", DateRangeParameter.FormattedDateParameter.TYPE, "Lcom/avito/android/remote/model/sales/SalesHeaderWidget$DateBadgeStyle;", "dateBadgeStyle", "", "saleEnds", "", "countDownBeforeHours", "Lcom/avito/android/remote/model/sales/utils/Timer$TimerStyle;", "timerStyle", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/sales/SalesHeaderWidget$DateBadgeStyle;Ljava/lang/Long;Ljava/lang/Integer;Lcom/avito/android/remote/model/sales/utils/Timer$TimerStyle;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/sales/SalesHeaderWidget$DateBadgeStyle;", "component3", "()Ljava/lang/Long;", "component4", "()Ljava/lang/Integer;", "component5", "()Lcom/avito/android/remote/model/sales/utils/Timer$TimerStyle;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/sales/SalesHeaderWidget$DateBadgeStyle;Ljava/lang/Long;Ljava/lang/Integer;Lcom/avito/android/remote/model/sales/utils/Timer$TimerStyle;)Lcom/avito/android/remote/model/sales/SalesHeaderWidget$Timer;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFormattedDate", "Lcom/avito/android/remote/model/sales/SalesHeaderWidget$DateBadgeStyle;", "getDateBadgeStyle", "Ljava/lang/Long;", "getSaleEnds", "Ljava/lang/Integer;", "getCountDownBeforeHours", "Lcom/avito/android/remote/model/sales/utils/Timer$TimerStyle;", "getTimerStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Timer implements Parcelable {

        @k
        public static final Parcelable.Creator<Timer> CREATOR = new Creator();

        @c("countDownBeforeHours")
        @l
        private final Integer countDownBeforeHours;

        @c("dateBadgeStyle")
        @l
        private final DateBadgeStyle dateBadgeStyle;

        @c(DateRangeParameter.FormattedDateParameter.TYPE)
        @k
        private final String formattedDate;

        @c("saleEnds")
        @l
        private final Long saleEnds;

        @c("timerStyle")
        @l
        private final Timer.TimerStyle timerStyle;

        /* compiled from: SalesHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Timer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Timer createFromParcel(@k Parcel parcel) {
                return new Timer(parcel.readString(), parcel.readInt() == 0 ? null : DateBadgeStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Timer.TimerStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Timer[] newArray(int i12) {
                return new Timer[i12];
            }
        }

        public Timer(@k String str, @l DateBadgeStyle dateBadgeStyle, @l Long l12, @l Integer num, @l Timer.TimerStyle timerStyle) {
            this.formattedDate = str;
            this.dateBadgeStyle = dateBadgeStyle;
            this.saleEnds = l12;
            this.countDownBeforeHours = num;
            this.timerStyle = timerStyle;
        }

        public static /* synthetic */ Timer copy$default(Timer timer, String str, DateBadgeStyle dateBadgeStyle, Long l12, Integer num, Timer.TimerStyle timerStyle, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = timer.formattedDate;
            }
            if ((i12 & 2) != 0) {
                dateBadgeStyle = timer.dateBadgeStyle;
            }
            DateBadgeStyle dateBadgeStyle2 = dateBadgeStyle;
            if ((i12 & 4) != 0) {
                l12 = timer.saleEnds;
            }
            Long l13 = l12;
            if ((i12 & 8) != 0) {
                num = timer.countDownBeforeHours;
            }
            Integer num2 = num;
            if ((i12 & 16) != 0) {
                timerStyle = timer.timerStyle;
            }
            return timer.copy(str, dateBadgeStyle2, l13, num2, timerStyle);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getFormattedDate() {
            return this.formattedDate;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DateBadgeStyle getDateBadgeStyle() {
            return this.dateBadgeStyle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Long getSaleEnds() {
            return this.saleEnds;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Integer getCountDownBeforeHours() {
            return this.countDownBeforeHours;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Timer.TimerStyle getTimerStyle() {
            return this.timerStyle;
        }

        @k
        public final Timer copy(@k String formattedDate, @l DateBadgeStyle dateBadgeStyle, @l Long saleEnds, @l Integer countDownBeforeHours, @l Timer.TimerStyle timerStyle) {
            return new Timer(formattedDate, dateBadgeStyle, saleEnds, countDownBeforeHours, timerStyle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Timer)) {
                return false;
            }
            Timer timer = (Timer) other;
            return L.f(this.formattedDate, timer.formattedDate) && L.f(this.dateBadgeStyle, timer.dateBadgeStyle) && L.f(this.saleEnds, timer.saleEnds) && L.f(this.countDownBeforeHours, timer.countDownBeforeHours) && L.f(this.timerStyle, timer.timerStyle);
        }

        @l
        public final Integer getCountDownBeforeHours() {
            return this.countDownBeforeHours;
        }

        @l
        public final DateBadgeStyle getDateBadgeStyle() {
            return this.dateBadgeStyle;
        }

        @k
        public final String getFormattedDate() {
            return this.formattedDate;
        }

        @l
        public final Long getSaleEnds() {
            return this.saleEnds;
        }

        @l
        public final Timer.TimerStyle getTimerStyle() {
            return this.timerStyle;
        }

        public int hashCode() {
            int iHashCode = this.formattedDate.hashCode() * 31;
            DateBadgeStyle dateBadgeStyle = this.dateBadgeStyle;
            int iHashCode2 = (iHashCode + (dateBadgeStyle == null ? 0 : dateBadgeStyle.hashCode())) * 31;
            Long l12 = this.saleEnds;
            int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Integer num = this.countDownBeforeHours;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Timer.TimerStyle timerStyle = this.timerStyle;
            return iHashCode4 + (timerStyle != null ? timerStyle.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Timer(formattedDate=" + this.formattedDate + ", dateBadgeStyle=" + this.dateBadgeStyle + ", saleEnds=" + this.saleEnds + ", countDownBeforeHours=" + this.countDownBeforeHours + ", timerStyle=" + this.timerStyle + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.formattedDate);
            DateBadgeStyle dateBadgeStyle = this.dateBadgeStyle;
            if (dateBadgeStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dateBadgeStyle.writeToParcel(parcel, flags);
            }
            Long l12 = this.saleEnds;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            Integer num = this.countDownBeforeHours;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Timer.TimerStyle timerStyle = this.timerStyle;
            if (timerStyle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                timerStyle.writeToParcel(parcel, flags);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SalesHeaderWidget(@l AttributedText attributedText, @l AttributedText attributedText2, @k Style style, @l SaleShortcuts saleShortcuts, @l ToolbarConfig toolbarConfig, @l String str, @l Timer timer, @l UniversalImage universalImage, @l UniversalImage universalImage2, @l ImageDisplayMode imageDisplayMode, @l List<? extends SerpElement> list, @l Analytics analytics, @l Settings settings) {
        this.attributedTitle = attributedText;
        this.attributedSubtitle = attributedText2;
        this.style = style;
        this.shortcuts = saleShortcuts;
        this.toolbarConfig = toolbarConfig;
        this.stickerText = str;
        this.timer = timer;
        this.image = universalImage;
        this.bottomImage = universalImage2;
        this.imageDisplayMode = imageDisplayMode;
        this.internalWidgets = list;
        this.analytics = analytics;
        this.settings = settings;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getAttributedTitle() {
        return this.attributedTitle;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final ImageDisplayMode getImageDisplayMode() {
        return this.imageDisplayMode;
    }

    @l
    public final List<SerpElement> component11() {
        return this.internalWidgets;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final SaleShortcuts getShortcuts() {
        return this.shortcuts;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final ToolbarConfig getToolbarConfig() {
        return this.toolbarConfig;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getStickerText() {
        return this.stickerText;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final UniversalImage getBottomImage() {
        return this.bottomImage;
    }

    @k
    public final SalesHeaderWidget copy(@l AttributedText attributedTitle, @l AttributedText attributedSubtitle, @k Style style, @l SaleShortcuts shortcuts, @l ToolbarConfig toolbarConfig, @l String stickerText, @l Timer timer, @l UniversalImage image, @l UniversalImage bottomImage, @l ImageDisplayMode imageDisplayMode, @l List<? extends SerpElement> internalWidgets, @l Analytics analytics, @l Settings settings) {
        return new SalesHeaderWidget(attributedTitle, attributedSubtitle, style, shortcuts, toolbarConfig, stickerText, timer, image, bottomImage, imageDisplayMode, internalWidgets, analytics, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SalesHeaderWidget)) {
            return false;
        }
        SalesHeaderWidget salesHeaderWidget = (SalesHeaderWidget) other;
        return L.f(this.attributedTitle, salesHeaderWidget.attributedTitle) && L.f(this.attributedSubtitle, salesHeaderWidget.attributedSubtitle) && L.f(this.style, salesHeaderWidget.style) && L.f(this.shortcuts, salesHeaderWidget.shortcuts) && L.f(this.toolbarConfig, salesHeaderWidget.toolbarConfig) && L.f(this.stickerText, salesHeaderWidget.stickerText) && L.f(this.timer, salesHeaderWidget.timer) && L.f(this.image, salesHeaderWidget.image) && L.f(this.bottomImage, salesHeaderWidget.bottomImage) && this.imageDisplayMode == salesHeaderWidget.imageDisplayMode && L.f(this.internalWidgets, salesHeaderWidget.internalWidgets) && L.f(this.analytics, salesHeaderWidget.analytics) && L.f(this.settings, salesHeaderWidget.settings);
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @l
    public final AttributedText getAttributedTitle() {
        return this.attributedTitle;
    }

    @l
    public final UniversalImage getBottomImage() {
        return this.bottomImage;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final ImageDisplayMode getImageDisplayMode() {
        return this.imageDisplayMode;
    }

    @l
    public final List<SerpElement> getInternalWidgets() {
        return this.internalWidgets;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @l
    public final SaleShortcuts getShortcuts() {
        return this.shortcuts;
    }

    @l
    public final String getStickerText() {
        return this.stickerText;
    }

    @k
    public final Style getStyle() {
        return this.style;
    }

    @l
    public final Timer getTimer() {
        return this.timer;
    }

    @Override // com.avito.android.remote.model.ToolbarConfigElement
    @l
    public ToolbarConfig getToolbarConfig() {
        return this.toolbarConfig;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    public int hashCode() {
        AttributedText attributedText = this.attributedTitle;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.attributedSubtitle;
        int iHashCode2 = (this.style.hashCode() + ((iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31)) * 31;
        SaleShortcuts saleShortcuts = this.shortcuts;
        int iHashCode3 = (iHashCode2 + (saleShortcuts == null ? 0 : saleShortcuts.hashCode())) * 31;
        ToolbarConfig toolbarConfig = this.toolbarConfig;
        int iHashCode4 = (iHashCode3 + (toolbarConfig == null ? 0 : toolbarConfig.hashCode())) * 31;
        String str = this.stickerText;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Timer timer = this.timer;
        int iHashCode6 = (iHashCode5 + (timer == null ? 0 : timer.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode7 = (iHashCode6 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UniversalImage universalImage2 = this.bottomImage;
        int iHashCode8 = (iHashCode7 + (universalImage2 == null ? 0 : universalImage2.hashCode())) * 31;
        ImageDisplayMode imageDisplayMode = this.imageDisplayMode;
        int iHashCode9 = (iHashCode8 + (imageDisplayMode == null ? 0 : imageDisplayMode.hashCode())) * 31;
        List<SerpElement> list = this.internalWidgets;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Analytics analytics = this.analytics;
        int iHashCode11 = (iHashCode10 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.settings;
        return iHashCode11 + (settings != null ? settings.hashCode() : 0);
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
        StringBuilder sb2 = new StringBuilder("SalesHeaderWidget(attributedTitle=");
        sb2.append(this.attributedTitle);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.attributedSubtitle);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", shortcuts=");
        sb2.append(this.shortcuts);
        sb2.append(", toolbarConfig=");
        sb2.append(this.toolbarConfig);
        sb2.append(", stickerText=");
        sb2.append(this.stickerText);
        sb2.append(", timer=");
        sb2.append(this.timer);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", bottomImage=");
        sb2.append(this.bottomImage);
        sb2.append(", imageDisplayMode=");
        sb2.append(this.imageDisplayMode);
        sb2.append(", internalWidgets=");
        sb2.append(this.internalWidgets);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.attributedTitle, flags);
        parcel.writeParcelable(this.attributedSubtitle, flags);
        this.style.writeToParcel(parcel, flags);
        SaleShortcuts saleShortcuts = this.shortcuts;
        if (saleShortcuts == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            saleShortcuts.writeToParcel(parcel, flags);
        }
        ToolbarConfig toolbarConfig = this.toolbarConfig;
        if (toolbarConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            toolbarConfig.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.stickerText);
        Timer timer = this.timer;
        if (timer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            timer.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.bottomImage, flags);
        ImageDisplayMode imageDisplayMode = this.imageDisplayMode;
        if (imageDisplayMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(imageDisplayMode.name());
        }
        List<SerpElement> list = this.internalWidgets;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
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

    public static /* synthetic */ void getUniqueId$annotations() {
    }

    public /* synthetic */ SalesHeaderWidget(AttributedText attributedText, AttributedText attributedText2, Style style, SaleShortcuts saleShortcuts, ToolbarConfig toolbarConfig, String str, Timer timer, UniversalImage universalImage, UniversalImage universalImage2, ImageDisplayMode imageDisplayMode, List list, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(attributedText, attributedText2, style, saleShortcuts, toolbarConfig, str, timer, universalImage, universalImage2, imageDisplayMode, list, (i12 & 2048) != 0 ? null : analytics, (i12 & 4096) != 0 ? null : settings);
    }
}
