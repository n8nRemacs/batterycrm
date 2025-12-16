package com.avito.android.remote.model.inset;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AnalyticsElement;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.SettingsElement;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.sales.utils.Timer;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ItemsCarouselWidget.kt */
@d
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\t\n\u0002\b\u0011\b\u0087\b\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0010\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u008f\u0001\u0095\u0001\u0096\u0001Bß\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0012\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b2\u00101J\u0012\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b<\u0010;J\u0012\u0010=\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0012\u0010K\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u008c\u0002\u0010M\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&HÆ\u0001¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bO\u0010+J\u0010\u0010Q\u001a\u00020PHÖ\u0001¢\u0006\u0004\bQ\u0010RJ\u001a\u0010V\u001a\u00020U2\b\u0010T\u001a\u0004\u0018\u00010SHÖ\u0003¢\u0006\u0004\bV\u0010WJ\u0010\u0010X\u001a\u00020PHÖ\u0001¢\u0006\u0004\bX\u0010RJ \u0010]\u001a\u00020\\2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010[\u001a\u00020PHÖ\u0001¢\u0006\u0004\b]\u0010^R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010_\u001a\u0004\b`\u0010+R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010_\u001a\u0004\ba\u0010+R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010b\u001a\u0004\bc\u0010.R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010b\u001a\u0004\bd\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010e\u001a\u0004\bf\u00101R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010e\u001a\u0004\bg\u00101R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010h\u001a\u0004\bi\u00104R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010h\u001a\u0004\bj\u00104R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010k\u001a\u0004\bl\u00107R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010m\u001a\u0004\bn\u00109R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010o\u001a\u0004\bp\u0010;R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010o\u001a\u0004\bq\u0010;R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010r\u001a\u0004\bs\u0010>R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010t\u001a\u0004\bu\u0010@R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010v\u001a\u0004\bw\u0010BR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010x\u001a\u0004\by\u0010DR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010z\u001a\u0004\b{\u0010FR\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010|\u001a\u0004\b}\u0010HR&\u0010%\u001a\u0004\u0018\u00010$8\u0016@\u0016X\u0097\u000e¢\u0006\u0014\n\u0004\b%\u0010~\u001a\u0004\b\u007f\u0010J\"\u0006\b\u0080\u0001\u0010\u0081\u0001R(\u0010'\u001a\u0004\u0018\u00010&8\u0016@\u0016X\u0097\u000e¢\u0006\u0016\n\u0005\b'\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010L\"\u0006\b\u0084\u0001\u0010\u0085\u0001R2\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0016@\u0016X\u0096\u000e¢\u0006 \n\u0006\b\u0087\u0001\u0010\u0088\u0001\u0012\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u0097\u0001"}, d2 = {"Lcom/avito/android/remote/model/inset/ItemsCarouselWidget;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/AnalyticsElement;", "Lcom/avito/android/remote/model/SettingsElement;", "", "title", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedTitle", "attributedSubtitle", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "snippetTextColor", "Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$PriceStyle;", "oldPriceStyle", "discountPercentStyle", "Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Action;", "titleAction", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "", "items", "Lcom/avito/android/remote/model/inset/AdditionalItem;", "additionalItems", "Lcom/avito/android/remote/model/inset/ItemsRequestParams;", "itemsRequestParams", "Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$BackgroundImage;", "backgroundImage", "Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$IconImage;", "iconImage", "Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Button;", "button", "Lcom/avito/android/remote/model/sales/utils/Timer;", "timer", "Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Analytics;", "analyticForm", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$PriceStyle;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$PriceStyle;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Action;Lcom/avito/android/remote/model/SerpDisplayType;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/inset/ItemsRequestParams;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$BackgroundImage;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$IconImage;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Button;Lcom/avito/android/remote/model/sales/utils/Timer;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Analytics;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "component5", "()Lcom/avito/android/remote/model/UniversalColor;", "component6", "component7", "()Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$PriceStyle;", "component8", "component9", "()Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Action;", "component10", "()Lcom/avito/android/remote/model/SerpDisplayType;", "component11", "()Ljava/util/List;", "component12", "component13", "()Lcom/avito/android/remote/model/inset/ItemsRequestParams;", "component14", "()Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$BackgroundImage;", "component15", "()Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$IconImage;", "component16", "()Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Button;", "component17", "()Lcom/avito/android/remote/model/sales/utils/Timer;", "component18", "()Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Analytics;", "component19", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "component20", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$PriceStyle;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$PriceStyle;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Action;Lcom/avito/android/remote/model/SerpDisplayType;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/inset/ItemsRequestParams;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$BackgroundImage;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$IconImage;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Button;Lcom/avito/android/remote/model/sales/utils/Timer;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Analytics;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)Lcom/avito/android/remote/model/inset/ItemsCarouselWidget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedTitle", "getAttributedSubtitle", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "getSnippetTextColor", "Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$PriceStyle;", "getOldPriceStyle", "getDiscountPercentStyle", "Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Action;", "getTitleAction", "Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplayType", "Ljava/util/List;", "getItems", "getAdditionalItems", "Lcom/avito/android/remote/model/inset/ItemsRequestParams;", "getItemsRequestParams", "Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$BackgroundImage;", "getBackgroundImage", "Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$IconImage;", "getIconImage", "Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Button;", "getButton", "Lcom/avito/android/remote/model/sales/utils/Timer;", "getTimer", "Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Analytics;", "getAnalyticForm", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "Companion", "Action", "Analytics", "BackgroundImage", "Button", "ButtonColors", "IconImage", "PriceStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ItemsCarouselWidget implements SerpElement, AnalyticsElement, SettingsElement {

    @k
    public static final String RECS_PARAMS_SOURCE = "recs";

    @c("additionalItems")
    @l
    private final List<AdditionalItem> additionalItems;

    @c("analyticForm")
    @l
    private final Analytics analyticForm;

    @c("analytics")
    @l
    private com.avito.android.remote.model.widget_analytics.Analytics analytics;

    @c("attributedSubtitle")
    @l
    private final AttributedText attributedSubtitle;

    @c("attributedTitle")
    @l
    private final AttributedText attributedTitle;

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("backgroundImage")
    @l
    private final BackgroundImage backgroundImage;

    @c("button")
    @l
    private final Button button;

    @c("discountPercentStyle")
    @l
    private final PriceStyle discountPercentStyle;

    @c("displayType")
    @l
    private final SerpDisplayType displayType;

    @c("iconImage")
    @l
    private final IconImage iconImage;

    @c("items")
    @l
    private final List<SerpElement> items;

    @c("itemsRequestParams")
    @l
    private final ItemsRequestParams itemsRequestParams;

    @c("snippetOldPriceStyle")
    @l
    private final PriceStyle oldPriceStyle;

    @c("settings")
    @l
    private Settings settings;

    @c("snippetTextColor")
    @l
    private final UniversalColor snippetTextColor;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("timer")
    @l
    private final Timer timer;

    @c("title")
    @l
    private final String title;

    @c("titleAction")
    @l
    private final Action titleAction;
    private transient long uniqueId;

    @k
    public static final Parcelable.Creator<ItemsCarouselWidget> CREATOR = new Creator();

    /* compiled from: ItemsCarouselWidget.kt */
    @d
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Action;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "buttonStyle", "Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$ButtonColors;", "buttonColors", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$ButtonColors;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$ButtonColors;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$ButtonColors;)Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Action;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/lang/String;", "getButtonStyle", "Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$ButtonColors;", "getButtonColors", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new Creator();

        @c("buttonColors")
        @l
        private final ButtonColors buttonColors;

        @c("buttonStyle")
        @l
        private final String buttonStyle;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deepLink;

        /* compiled from: ItemsCarouselWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Action> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action createFromParcel(@k Parcel parcel) {
                return new Action((DeepLink) parcel.readParcelable(Action.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : ButtonColors.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@l DeepLink deepLink, @l String str, @l ButtonColors buttonColors) {
            this.deepLink = deepLink;
            this.buttonStyle = str;
            this.buttonColors = buttonColors;
        }

        public static /* synthetic */ Action copy$default(Action action, DeepLink deepLink, String str, ButtonColors buttonColors, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                deepLink = action.deepLink;
            }
            if ((i12 & 2) != 0) {
                str = action.buttonStyle;
            }
            if ((i12 & 4) != 0) {
                buttonColors = action.buttonColors;
            }
            return action.copy(deepLink, str, buttonColors);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getButtonStyle() {
            return this.buttonStyle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final ButtonColors getButtonColors() {
            return this.buttonColors;
        }

        @k
        public final Action copy(@l DeepLink deepLink, @l String buttonStyle, @l ButtonColors buttonColors) {
            return new Action(deepLink, buttonStyle, buttonColors);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return L.f(this.deepLink, action.deepLink) && L.f(this.buttonStyle, action.buttonStyle) && L.f(this.buttonColors, action.buttonColors);
        }

        @l
        public final ButtonColors getButtonColors() {
            return this.buttonColors;
        }

        @l
        public final String getButtonStyle() {
            return this.buttonStyle;
        }

        @l
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        public int hashCode() {
            DeepLink deepLink = this.deepLink;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            String str = this.buttonStyle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ButtonColors buttonColors = this.buttonColors;
            return iHashCode2 + (buttonColors != null ? buttonColors.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Action(deepLink=" + this.deepLink + ", buttonStyle=" + this.buttonStyle + ", buttonColors=" + this.buttonColors + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.deepLink, flags);
            parcel.writeString(this.buttonStyle);
            ButtonColors buttonColors = this.buttonColors;
            if (buttonColors == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                buttonColors.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: ItemsCarouselWidget.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Analytics;", "Landroid/os/Parcelable;", "", "mcid", "", "cwid", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Analytics;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getMcid", "Ljava/lang/String;", "getCwid", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Analytics implements Parcelable {

        @k
        public static final Parcelable.Creator<Analytics> CREATOR = new Creator();

        @c("cwid")
        @l
        private final String cwid;

        @c("mcid")
        @l
        private final Long mcid;

        /* compiled from: ItemsCarouselWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Analytics> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Analytics createFromParcel(@k Parcel parcel) {
                return new Analytics(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Analytics[] newArray(int i12) {
                return new Analytics[i12];
            }
        }

        public Analytics(@l Long l12, @l String str) {
            this.mcid = l12;
            this.cwid = str;
        }

        public static /* synthetic */ Analytics copy$default(Analytics analytics, Long l12, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                l12 = analytics.mcid;
            }
            if ((i12 & 2) != 0) {
                str = analytics.cwid;
            }
            return analytics.copy(l12, str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Long getMcid() {
            return this.mcid;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getCwid() {
            return this.cwid;
        }

        @k
        public final Analytics copy(@l Long mcid, @l String cwid) {
            return new Analytics(mcid, cwid);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) other;
            return L.f(this.mcid, analytics.mcid) && L.f(this.cwid, analytics.cwid);
        }

        @l
        public final String getCwid() {
            return this.cwid;
        }

        @l
        public final Long getMcid() {
            return this.mcid;
        }

        public int hashCode() {
            Long l12 = this.mcid;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            String str = this.cwid;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Analytics(mcid=");
            sb2.append(this.mcid);
            sb2.append(", cwid=");
            return C22026a.c(sb2, this.cwid, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Long l12 = this.mcid;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeString(this.cwid);
        }
    }

    /* compiled from: ItemsCarouselWidget.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$BackgroundImage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$BackgroundImage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BackgroundImage implements Parcelable {

        @k
        public static final Parcelable.Creator<BackgroundImage> CREATOR = new Creator();

        @c("image")
        @k
        private final UniversalImage image;

        /* compiled from: ItemsCarouselWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BackgroundImage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BackgroundImage createFromParcel(@k Parcel parcel) {
                return new BackgroundImage((UniversalImage) parcel.readParcelable(BackgroundImage.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BackgroundImage[] newArray(int i12) {
                return new BackgroundImage[i12];
            }
        }

        public BackgroundImage(@k UniversalImage universalImage) {
            this.image = universalImage;
        }

        public static /* synthetic */ BackgroundImage copy$default(BackgroundImage backgroundImage, UniversalImage universalImage, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalImage = backgroundImage.image;
            }
            return backgroundImage.copy(universalImage);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final BackgroundImage copy(@k UniversalImage image) {
            return new BackgroundImage(image);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BackgroundImage) && L.f(this.image, ((BackgroundImage) other).image);
        }

        @k
        public final UniversalImage getImage() {
            return this.image;
        }

        public int hashCode() {
            return this.image.hashCode();
        }

        @k
        public String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.s(new StringBuilder("BackgroundImage(image="), this.image, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
        }
    }

    /* compiled from: ItemsCarouselWidget.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Button;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "getStyle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new Creator();

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        /* compiled from: ItemsCarouselWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Button> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button createFromParcel(@k Parcel parcel) {
                return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @k DeepLink deepLink, @l String str2) {
            this.title = str;
            this.uri = deepLink;
            this.style = str2;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, DeepLink deepLink, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = button.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = button.uri;
            }
            if ((i12 & 4) != 0) {
                str2 = button.style;
            }
            return button.copy(str, deepLink, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final Button copy(@k String title, @k DeepLink uri, @l String style) {
            return new Button(title, uri, style);
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
            return L.f(this.title, button.title) && L.f(this.uri, button.uri) && L.f(this.style, button.style);
        }

        @l
        public final String getStyle() {
            return this.style;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final DeepLink getUri() {
            return this.uri;
        }

        public int hashCode() {
            int iE2 = a.e(this.uri, this.title.hashCode() * 31, 31);
            String str = this.style;
            return iE2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.title);
            sb2.append(", uri=");
            sb2.append(this.uri);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.uri, flags);
            parcel.writeString(this.style);
        }
    }

    /* compiled from: ItemsCarouselWidget.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$ButtonColors;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "textColor", "backgroundColor", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "component2", "copy", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$ButtonColors;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getTextColor", "getBackgroundColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ButtonColors implements Parcelable {

        @k
        public static final Parcelable.Creator<ButtonColors> CREATOR = new Creator();

        @c("backgroundColor")
        @k
        private final UniversalColor backgroundColor;

        @c("textColor")
        @k
        private final UniversalColor textColor;

        /* compiled from: ItemsCarouselWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonColors> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ButtonColors createFromParcel(@k Parcel parcel) {
                return new ButtonColors((UniversalColor) parcel.readParcelable(ButtonColors.class.getClassLoader()), (UniversalColor) parcel.readParcelable(ButtonColors.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ButtonColors[] newArray(int i12) {
                return new ButtonColors[i12];
            }
        }

        public ButtonColors(@k UniversalColor universalColor, @k UniversalColor universalColor2) {
            this.textColor = universalColor;
            this.backgroundColor = universalColor2;
        }

        public static /* synthetic */ ButtonColors copy$default(ButtonColors buttonColors, UniversalColor universalColor, UniversalColor universalColor2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalColor = buttonColors.textColor;
            }
            if ((i12 & 2) != 0) {
                universalColor2 = buttonColors.backgroundColor;
            }
            return buttonColors.copy(universalColor, universalColor2);
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
        public final ButtonColors copy(@k UniversalColor textColor, @k UniversalColor backgroundColor) {
            return new ButtonColors(textColor, backgroundColor);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonColors)) {
                return false;
            }
            ButtonColors buttonColors = (ButtonColors) other;
            return L.f(this.textColor, buttonColors.textColor) && L.f(this.backgroundColor, buttonColors.backgroundColor);
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
            StringBuilder sb2 = new StringBuilder("ButtonColors(textColor=");
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

    /* compiled from: ItemsCarouselWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemsCarouselWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemsCarouselWidget createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ItemsCarouselWidget.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(ItemsCarouselWidget.class.getClassLoader());
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(ItemsCarouselWidget.class.getClassLoader());
            UniversalColor universalColor2 = (UniversalColor) parcel.readParcelable(ItemsCarouselWidget.class.getClassLoader());
            PriceStyle priceStyleCreateFromParcel = parcel.readInt() == 0 ? null : PriceStyle.CREATOR.createFromParcel(parcel);
            PriceStyle priceStyleCreateFromParcel2 = parcel.readInt() == 0 ? null : PriceStyle.CREATOR.createFromParcel(parcel);
            Action actionCreateFromParcel = parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel);
            SerpDisplayType serpDisplayTypeValueOf = parcel.readInt() == 0 ? null : SerpDisplayType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(ItemsCarouselWidget.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = a.l(ItemsCarouselWidget.class, parcel, arrayList2, iL3, 1);
                    i13 = i13;
                }
            }
            return new ItemsCarouselWidget(string, string2, attributedText, attributedText2, universalColor, universalColor2, priceStyleCreateFromParcel, priceStyleCreateFromParcel2, actionCreateFromParcel, serpDisplayTypeValueOf, arrayList, arrayList2, parcel.readInt() == 0 ? null : ItemsRequestParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BackgroundImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IconImage.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Timer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : com.avito.android.remote.model.widget_analytics.Analytics.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Settings.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemsCarouselWidget[] newArray(int i12) {
            return new ItemsCarouselWidget[i12];
        }
    }

    /* compiled from: ItemsCarouselWidget.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$IconImage;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$IconImage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IconImage implements Parcelable {

        @k
        public static final Parcelable.Creator<IconImage> CREATOR = new Creator();

        @c("image")
        @l
        private final UniversalImage image;

        /* compiled from: ItemsCarouselWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IconImage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final IconImage createFromParcel(@k Parcel parcel) {
                return new IconImage((UniversalImage) parcel.readParcelable(IconImage.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final IconImage[] newArray(int i12) {
                return new IconImage[i12];
            }
        }

        public IconImage(@l UniversalImage universalImage) {
            this.image = universalImage;
        }

        public static /* synthetic */ IconImage copy$default(IconImage iconImage, UniversalImage universalImage, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalImage = iconImage.image;
            }
            return iconImage.copy(universalImage);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final IconImage copy(@l UniversalImage image) {
            return new IconImage(image);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IconImage) && L.f(this.image, ((IconImage) other).image);
        }

        @l
        public final UniversalImage getImage() {
            return this.image;
        }

        public int hashCode() {
            UniversalImage universalImage = this.image;
            if (universalImage == null) {
                return 0;
            }
            return universalImage.hashCode();
        }

        @k
        public String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.s(new StringBuilder("IconImage(image="), this.image, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
        }
    }

    /* compiled from: ItemsCarouselWidget.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$PriceStyle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/inset/ItemsCarouselWidget$PriceStyle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PriceStyle implements Parcelable {

        @k
        public static final Parcelable.Creator<PriceStyle> CREATOR = new Creator();

        @c("color")
        @l
        private final UniversalColor color;

        /* compiled from: ItemsCarouselWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PriceStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PriceStyle createFromParcel(@k Parcel parcel) {
                return new PriceStyle((UniversalColor) parcel.readParcelable(PriceStyle.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PriceStyle[] newArray(int i12) {
                return new PriceStyle[i12];
            }
        }

        public PriceStyle(@l UniversalColor universalColor) {
            this.color = universalColor;
        }

        public static /* synthetic */ PriceStyle copy$default(PriceStyle priceStyle, UniversalColor universalColor, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalColor = priceStyle.color;
            }
            return priceStyle.copy(universalColor);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final UniversalColor getColor() {
            return this.color;
        }

        @k
        public final PriceStyle copy(@l UniversalColor color) {
            return new PriceStyle(color);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PriceStyle) && L.f(this.color, ((PriceStyle) other).color);
        }

        @l
        public final UniversalColor getColor() {
            return this.color;
        }

        public int hashCode() {
            UniversalColor universalColor = this.color;
            if (universalColor == null) {
                return 0;
            }
            return universalColor.hashCode();
        }

        @k
        public String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.r(new StringBuilder("PriceStyle(color="), this.color, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.color, flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ItemsCarouselWidget(@l String str, @l String str2, @l AttributedText attributedText, @l AttributedText attributedText2, @l UniversalColor universalColor, @l UniversalColor universalColor2, @l PriceStyle priceStyle, @l PriceStyle priceStyle2, @l Action action, @l SerpDisplayType serpDisplayType, @l List<? extends SerpElement> list, @l List<? extends AdditionalItem> list2, @l ItemsRequestParams itemsRequestParams, @l BackgroundImage backgroundImage, @l IconImage iconImage, @l Button button, @l Timer timer, @l Analytics analytics, @l com.avito.android.remote.model.widget_analytics.Analytics analytics2, @l Settings settings) {
        this.title = str;
        this.subtitle = str2;
        this.attributedTitle = attributedText;
        this.attributedSubtitle = attributedText2;
        this.backgroundColor = universalColor;
        this.snippetTextColor = universalColor2;
        this.oldPriceStyle = priceStyle;
        this.discountPercentStyle = priceStyle2;
        this.titleAction = action;
        this.displayType = serpDisplayType;
        this.items = list;
        this.additionalItems = list2;
        this.itemsRequestParams = itemsRequestParams;
        this.backgroundImage = backgroundImage;
        this.iconImage = iconImage;
        this.button = button;
        this.timer = timer;
        this.analyticForm = analytics;
        this.analytics = analytics2;
        this.settings = settings;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @l
    public final List<SerpElement> component11() {
        return this.items;
    }

    @l
    public final List<AdditionalItem> component12() {
        return this.additionalItems;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final ItemsRequestParams getItemsRequestParams() {
        return this.itemsRequestParams;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final BackgroundImage getBackgroundImage() {
        return this.backgroundImage;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final IconImage getIconImage() {
        return this.iconImage;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final Timer getTimer() {
        return this.timer;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final Analytics getAnalyticForm() {
        return this.analyticForm;
    }

    @l
    /* renamed from: component19, reason: from getter */
    public final com.avito.android.remote.model.widget_analytics.Analytics getAnalytics() {
        return this.analytics;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component20, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getAttributedTitle() {
        return this.attributedTitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final UniversalColor getSnippetTextColor() {
        return this.snippetTextColor;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final PriceStyle getOldPriceStyle() {
        return this.oldPriceStyle;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final PriceStyle getDiscountPercentStyle() {
        return this.discountPercentStyle;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Action getTitleAction() {
        return this.titleAction;
    }

    @k
    public final ItemsCarouselWidget copy(@l String title, @l String subtitle, @l AttributedText attributedTitle, @l AttributedText attributedSubtitle, @l UniversalColor backgroundColor, @l UniversalColor snippetTextColor, @l PriceStyle oldPriceStyle, @l PriceStyle discountPercentStyle, @l Action titleAction, @l SerpDisplayType displayType, @l List<? extends SerpElement> items, @l List<? extends AdditionalItem> additionalItems, @l ItemsRequestParams itemsRequestParams, @l BackgroundImage backgroundImage, @l IconImage iconImage, @l Button button, @l Timer timer, @l Analytics analyticForm, @l com.avito.android.remote.model.widget_analytics.Analytics analytics, @l Settings settings) {
        return new ItemsCarouselWidget(title, subtitle, attributedTitle, attributedSubtitle, backgroundColor, snippetTextColor, oldPriceStyle, discountPercentStyle, titleAction, displayType, items, additionalItems, itemsRequestParams, backgroundImage, iconImage, button, timer, analyticForm, analytics, settings);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemsCarouselWidget)) {
            return false;
        }
        ItemsCarouselWidget itemsCarouselWidget = (ItemsCarouselWidget) other;
        return L.f(this.title, itemsCarouselWidget.title) && L.f(this.subtitle, itemsCarouselWidget.subtitle) && L.f(this.attributedTitle, itemsCarouselWidget.attributedTitle) && L.f(this.attributedSubtitle, itemsCarouselWidget.attributedSubtitle) && L.f(this.backgroundColor, itemsCarouselWidget.backgroundColor) && L.f(this.snippetTextColor, itemsCarouselWidget.snippetTextColor) && L.f(this.oldPriceStyle, itemsCarouselWidget.oldPriceStyle) && L.f(this.discountPercentStyle, itemsCarouselWidget.discountPercentStyle) && L.f(this.titleAction, itemsCarouselWidget.titleAction) && this.displayType == itemsCarouselWidget.displayType && L.f(this.items, itemsCarouselWidget.items) && L.f(this.additionalItems, itemsCarouselWidget.additionalItems) && L.f(this.itemsRequestParams, itemsCarouselWidget.itemsRequestParams) && L.f(this.backgroundImage, itemsCarouselWidget.backgroundImage) && L.f(this.iconImage, itemsCarouselWidget.iconImage) && L.f(this.button, itemsCarouselWidget.button) && L.f(this.timer, itemsCarouselWidget.timer) && L.f(this.analyticForm, itemsCarouselWidget.analyticForm) && L.f(this.analytics, itemsCarouselWidget.analytics) && L.f(this.settings, itemsCarouselWidget.settings);
    }

    @l
    public final List<AdditionalItem> getAdditionalItems() {
        return this.additionalItems;
    }

    @l
    public final Analytics getAnalyticForm() {
        return this.analyticForm;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public com.avito.android.remote.model.widget_analytics.Analytics getAnalytics() {
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
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final BackgroundImage getBackgroundImage() {
        return this.backgroundImage;
    }

    @l
    public final Button getButton() {
        return this.button;
    }

    @l
    public final PriceStyle getDiscountPercentStyle() {
        return this.discountPercentStyle;
    }

    @l
    public final SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @l
    public final IconImage getIconImage() {
        return this.iconImage;
    }

    @l
    public final List<SerpElement> getItems() {
        return this.items;
    }

    @l
    public final ItemsRequestParams getItemsRequestParams() {
        return this.itemsRequestParams;
    }

    @l
    public final PriceStyle getOldPriceStyle() {
        return this.oldPriceStyle;
    }

    @Override // com.avito.android.remote.model.SettingsElement
    @l
    public Settings getSettings() {
        return this.settings;
    }

    @l
    public final UniversalColor getSnippetTextColor() {
        return this.snippetTextColor;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final Timer getTimer() {
        return this.timer;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final Action getTitleAction() {
        return this.titleAction;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public long getF107426b() {
        return this.uniqueId;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.attributedTitle;
        int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.attributedSubtitle;
        int iHashCode4 = (iHashCode3 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        UniversalColor universalColor = this.backgroundColor;
        int iHashCode5 = (iHashCode4 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.snippetTextColor;
        int iHashCode6 = (iHashCode5 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        PriceStyle priceStyle = this.oldPriceStyle;
        int iHashCode7 = (iHashCode6 + (priceStyle == null ? 0 : priceStyle.hashCode())) * 31;
        PriceStyle priceStyle2 = this.discountPercentStyle;
        int iHashCode8 = (iHashCode7 + (priceStyle2 == null ? 0 : priceStyle2.hashCode())) * 31;
        Action action = this.titleAction;
        int iHashCode9 = (iHashCode8 + (action == null ? 0 : action.hashCode())) * 31;
        SerpDisplayType serpDisplayType = this.displayType;
        int iHashCode10 = (iHashCode9 + (serpDisplayType == null ? 0 : serpDisplayType.hashCode())) * 31;
        List<SerpElement> list = this.items;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        List<AdditionalItem> list2 = this.additionalItems;
        int iHashCode12 = (iHashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ItemsRequestParams itemsRequestParams = this.itemsRequestParams;
        int iHashCode13 = (iHashCode12 + (itemsRequestParams == null ? 0 : itemsRequestParams.hashCode())) * 31;
        BackgroundImage backgroundImage = this.backgroundImage;
        int iHashCode14 = (iHashCode13 + (backgroundImage == null ? 0 : backgroundImage.hashCode())) * 31;
        IconImage iconImage = this.iconImage;
        int iHashCode15 = (iHashCode14 + (iconImage == null ? 0 : iconImage.hashCode())) * 31;
        Button button = this.button;
        int iHashCode16 = (iHashCode15 + (button == null ? 0 : button.hashCode())) * 31;
        Timer timer = this.timer;
        int iHashCode17 = (iHashCode16 + (timer == null ? 0 : timer.hashCode())) * 31;
        Analytics analytics = this.analyticForm;
        int iHashCode18 = (iHashCode17 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        com.avito.android.remote.model.widget_analytics.Analytics analytics2 = this.analytics;
        int iHashCode19 = (iHashCode18 + (analytics2 == null ? 0 : analytics2.hashCode())) * 31;
        Settings settings = this.settings;
        return iHashCode19 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    public void setAnalytics(@l com.avito.android.remote.model.widget_analytics.Analytics analytics) {
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
        StringBuilder sb2 = new StringBuilder("ItemsCarouselWidget(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", attributedTitle=");
        sb2.append(this.attributedTitle);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.attributedSubtitle);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", snippetTextColor=");
        sb2.append(this.snippetTextColor);
        sb2.append(", oldPriceStyle=");
        sb2.append(this.oldPriceStyle);
        sb2.append(", discountPercentStyle=");
        sb2.append(this.discountPercentStyle);
        sb2.append(", titleAction=");
        sb2.append(this.titleAction);
        sb2.append(", displayType=");
        sb2.append(this.displayType);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", additionalItems=");
        sb2.append(this.additionalItems);
        sb2.append(", itemsRequestParams=");
        sb2.append(this.itemsRequestParams);
        sb2.append(", backgroundImage=");
        sb2.append(this.backgroundImage);
        sb2.append(", iconImage=");
        sb2.append(this.iconImage);
        sb2.append(", button=");
        sb2.append(this.button);
        sb2.append(", timer=");
        sb2.append(this.timer);
        sb2.append(", analyticForm=");
        sb2.append(this.analyticForm);
        sb2.append(", analytics=");
        sb2.append(this.analytics);
        sb2.append(", settings=");
        return b.f(sb2, this.settings, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.attributedTitle, flags);
        parcel.writeParcelable(this.attributedSubtitle, flags);
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.snippetTextColor, flags);
        PriceStyle priceStyle = this.oldPriceStyle;
        if (priceStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceStyle.writeToParcel(parcel, flags);
        }
        PriceStyle priceStyle2 = this.discountPercentStyle;
        if (priceStyle2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceStyle2.writeToParcel(parcel, flags);
        }
        Action action = this.titleAction;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, flags);
        }
        SerpDisplayType serpDisplayType = this.displayType;
        if (serpDisplayType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serpDisplayType.name());
        }
        List<SerpElement> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<AdditionalItem> list2 = this.additionalItems;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        ItemsRequestParams itemsRequestParams = this.itemsRequestParams;
        if (itemsRequestParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            itemsRequestParams.writeToParcel(parcel, flags);
        }
        BackgroundImage backgroundImage = this.backgroundImage;
        if (backgroundImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            backgroundImage.writeToParcel(parcel, flags);
        }
        IconImage iconImage = this.iconImage;
        if (iconImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconImage.writeToParcel(parcel, flags);
        }
        Button button = this.button;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, flags);
        }
        Timer timer = this.timer;
        if (timer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            timer.writeToParcel(parcel, flags);
        }
        Analytics analytics = this.analyticForm;
        if (analytics == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analytics.writeToParcel(parcel, flags);
        }
        com.avito.android.remote.model.widget_analytics.Analytics analytics2 = this.analytics;
        if (analytics2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            analytics2.writeToParcel(parcel, flags);
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

    public /* synthetic */ ItemsCarouselWidget(String str, String str2, AttributedText attributedText, AttributedText attributedText2, UniversalColor universalColor, UniversalColor universalColor2, PriceStyle priceStyle, PriceStyle priceStyle2, Action action, SerpDisplayType serpDisplayType, List list, List list2, ItemsRequestParams itemsRequestParams, BackgroundImage backgroundImage, IconImage iconImage, Button button, Timer timer, Analytics analytics, com.avito.android.remote.model.widget_analytics.Analytics analytics2, Settings settings, int i12, C42822w c42822w) {
        this(str, str2, attributedText, attributedText2, universalColor, universalColor2, priceStyle, priceStyle2, action, serpDisplayType, list, list2, itemsRequestParams, backgroundImage, iconImage, button, timer, analytics, (i12 & 262144) != 0 ? null : analytics2, (i12 & 524288) != 0 ? null : settings);
    }
}
