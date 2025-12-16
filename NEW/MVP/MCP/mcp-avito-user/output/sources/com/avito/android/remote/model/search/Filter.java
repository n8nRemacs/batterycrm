package com.avito.android.remote.model.search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalCheckedImage;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.ClearanceValue;
import com.avito.android.remote.model.category_parameters.DisplayingImageParams;
import com.avito.android.remote.model.category_parameters.SortDirection;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: InlineFilters.kt */
@d
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001:\u0011`abcdefghijklmnopBÃ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b/\u0010.J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b0\u0010.J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u0010!J\u0012\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b2\u0010*J\u0012\u00103\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b5\u00106Jà\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00112\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b9\u0010!J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020\r2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020:HÖ\u0001¢\u0006\u0004\bA\u0010<J \u0010F\u001a\u00020E2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020:HÖ\u0001¢\u0006\u0004\bF\u0010GR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bK\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010L\u001a\u0004\bM\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010N\u001a\u0004\bO\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bP\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010J\u001a\u0004\bQ\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bR\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\b\u000e\u0010*R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010T\u001a\u0004\bU\u0010,R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010V\u001a\u0004\bW\u0010.R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010V\u001a\u0004\bX\u0010.R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010V\u001a\u0004\bY\u0010.R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010J\u001a\u0004\bZ\u0010!R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010S\u001a\u0004\b[\u0010*R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\\\u001a\u0004\b]\u00104R\u001a\u0010\u001b\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010^\u001a\u0004\b_\u00106¨\u0006q"}, d2 = {"Lcom/avito/android/remote/model/search/Filter;", "Landroid/os/Parcelable;", "", "attrId", "", "id", "Lcom/avito/android/remote/model/search/Filter$Widget;", "widget", "Lcom/avito/android/remote/model/search/Filter$Payload;", "payload", "title", "searchHint", "displayTitle", "", "isHighlighted", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "value", "", "Lcom/avito/android/remote/model/search/Filter$InnerOptions;", "options", "Lcom/avito/android/remote/model/search/Filter$InnerOptions$Options;", "selectedOptions", "filters", "changedParamType", "hasSuggest", "Lcom/avito/android/remote/model/text/AttributedText;", "richTitle", "resetAreaOnChange", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$Widget;Lcom/avito/android/remote/model/search/Filter$Payload;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/search/InlineFilterValue;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Z)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/search/Filter$Widget;", "component4", "()Lcom/avito/android/remote/model/search/Filter$Payload;", "component5", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "component9", "()Lcom/avito/android/remote/model/search/InlineFilterValue;", "component10", "()Ljava/util/List;", "component11", "component12", "component13", "component14", "component15", "()Lcom/avito/android/remote/model/text/AttributedText;", "component16", "()Z", "copy", "(Ljava/lang/Long;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$Widget;Lcom/avito/android/remote/model/search/Filter$Payload;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/search/InlineFilterValue;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Z)Lcom/avito/android/remote/model/search/Filter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getAttrId", "Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/search/Filter$Widget;", "getWidget", "Lcom/avito/android/remote/model/search/Filter$Payload;", "getPayload", "getTitle", "getSearchHint", "getDisplayTitle", "Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "getValue", "Ljava/util/List;", "getOptions", "getSelectedOptions", "getFilters", "getChangedParamType", "getHasSuggest", "Lcom/avito/android/remote/model/text/AttributedText;", "getRichTitle", "Z", "getResetAreaOnChange", "AutoShowPresetFiltersDialog", "Config", "Displaying", "Field", "FilterMapping", "FlexSearchDateConfig", "Hint", "InnerOptions", "MultiThemeIcon", "NextAction", "Onboarding", "OptionsGroup", "Payload", "Separator", "Type", "Value", "Widget", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Filter implements Parcelable {

    @k
    public static final Parcelable.Creator<Filter> CREATOR = new Creator();

    @c("attrId")
    @l
    private final Long attrId;

    @c("changedParamType")
    @l
    private final String changedParamType;

    @c("displayTitle")
    @l
    private final String displayTitle;

    @c("filters")
    @l
    private final List<Filter> filters;

    @c("hasSuggest")
    @l
    private final Boolean hasSuggest;

    @c("id")
    @l
    private final String id;

    @c("isHighlighted")
    @l
    private final Boolean isHighlighted;

    @c("options")
    @l
    private final List<InnerOptions> options;

    @c("payload")
    @l
    private final Payload payload;

    @c("resetAreaOnChange")
    private final boolean resetAreaOnChange;

    @c("richTitle")
    @l
    private final AttributedText richTitle;

    @c("searchHint")
    @l
    private final String searchHint;

    @c("selectedOptions")
    @l
    private final List<InnerOptions.Options> selectedOptions;

    @c("title")
    @l
    private final String title;

    @c("value")
    @l
    private final InlineFilterValue value;

    @c("widget")
    @l
    private final Widget widget;

    /* compiled from: InlineFilters.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\f¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog$Button;", "applyButton", "checkboxTitle", "declineButtonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog$Button;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog$Button;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog$Button;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog$Button;", "getApplyButton", "getCheckboxTitle", "getDeclineButtonTitle", "Button", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class AutoShowPresetFiltersDialog implements Parcelable {

        @k
        public static final Parcelable.Creator<AutoShowPresetFiltersDialog> CREATOR = new Creator();

        @c("applyButton")
        @k
        private final Button applyButton;

        @c("checkboxTitle")
        @k
        private final String checkboxTitle;

        @c("declineButtonTitle")
        @k
        private final String declineButtonTitle;

        @c("subtitle")
        @k
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: InlineFilters.kt */
        @d
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\b\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\b\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\b\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR+\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\b\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog$Button;", "Landroid/os/Parcelable;", "", "title", "", "LK51/e;", "params", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/util/Map;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/util/Map;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/Map;", "getParams", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Button implements Parcelable {

            @k
            public static final Parcelable.Creator<Button> CREATOR = new Creator();

            @c(ContextActionHandler.Link.DEEPLINK)
            @k
            private final DeepLink deeplink;

            @c("params")
            @k
            private final Map<String, String> params;

            @c("title")
            @k
            private final String title;

            /* compiled from: InlineFilters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Button> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Button createFromParcel(@k Parcel parcel) {
                    String string = parcel.readString();
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                    return new Button(string, linkedHashMap, (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Button[] newArray(int i12) {
                    return new Button[i12];
                }
            }

            public Button(@k String str, @k Map<String, String> map, @k DeepLink deepLink) {
                this.title = str;
                this.params = map;
                this.deeplink = deepLink;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Button copy$default(Button button, String str, Map map, DeepLink deepLink, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = button.title;
                }
                if ((i12 & 2) != 0) {
                    map = button.params;
                }
                if ((i12 & 4) != 0) {
                    deepLink = button.deeplink;
                }
                return button.copy(str, map, deepLink);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            public final Map<String, String> component2() {
                return this.params;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final DeepLink getDeeplink() {
                return this.deeplink;
            }

            @k
            public final Button copy(@k String title, @k Map<String, String> params, @k DeepLink deeplink) {
                return new Button(title, params, deeplink);
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
                return L.f(this.title, button.title) && L.f(this.params, button.params) && L.f(this.deeplink, button.deeplink);
            }

            @k
            public final DeepLink getDeeplink() {
                return this.deeplink;
            }

            @k
            public final Map<String, String> getParams() {
                return this.params;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.deeplink.hashCode() + AK.c.c(this.title.hashCode() * 31, 31, this.params);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Button(title=");
                sb2.append(this.title);
                sb2.append(", params=");
                sb2.append(this.params);
                sb2.append(", deeplink=");
                return a.v(sb2, this.deeplink, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                Iterator itI = C0.i(parcel, this.params);
                while (itI.hasNext()) {
                    Map.Entry entry = (Map.Entry) itI.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
                parcel.writeParcelable(this.deeplink, flags);
            }
        }

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoShowPresetFiltersDialog> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoShowPresetFiltersDialog createFromParcel(@k Parcel parcel) {
                return new AutoShowPresetFiltersDialog(parcel.readString(), parcel.readString(), Button.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoShowPresetFiltersDialog[] newArray(int i12) {
                return new AutoShowPresetFiltersDialog[i12];
            }
        }

        public AutoShowPresetFiltersDialog(@k String str, @k String str2, @k Button button, @k String str3, @k String str4) {
            this.title = str;
            this.subtitle = str2;
            this.applyButton = button;
            this.checkboxTitle = str3;
            this.declineButtonTitle = str4;
        }

        public static /* synthetic */ AutoShowPresetFiltersDialog copy$default(AutoShowPresetFiltersDialog autoShowPresetFiltersDialog, String str, String str2, Button button, String str3, String str4, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = autoShowPresetFiltersDialog.title;
            }
            if ((i12 & 2) != 0) {
                str2 = autoShowPresetFiltersDialog.subtitle;
            }
            String str5 = str2;
            if ((i12 & 4) != 0) {
                button = autoShowPresetFiltersDialog.applyButton;
            }
            Button button2 = button;
            if ((i12 & 8) != 0) {
                str3 = autoShowPresetFiltersDialog.checkboxTitle;
            }
            String str6 = str3;
            if ((i12 & 16) != 0) {
                str4 = autoShowPresetFiltersDialog.declineButtonTitle;
            }
            return autoShowPresetFiltersDialog.copy(str, str5, button2, str6, str4);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final Button getApplyButton() {
            return this.applyButton;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final String getCheckboxTitle() {
            return this.checkboxTitle;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final String getDeclineButtonTitle() {
            return this.declineButtonTitle;
        }

        @k
        public final AutoShowPresetFiltersDialog copy(@k String title, @k String subtitle, @k Button applyButton, @k String checkboxTitle, @k String declineButtonTitle) {
            return new AutoShowPresetFiltersDialog(title, subtitle, applyButton, checkboxTitle, declineButtonTitle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoShowPresetFiltersDialog)) {
                return false;
            }
            AutoShowPresetFiltersDialog autoShowPresetFiltersDialog = (AutoShowPresetFiltersDialog) other;
            return L.f(this.title, autoShowPresetFiltersDialog.title) && L.f(this.subtitle, autoShowPresetFiltersDialog.subtitle) && L.f(this.applyButton, autoShowPresetFiltersDialog.applyButton) && L.f(this.checkboxTitle, autoShowPresetFiltersDialog.checkboxTitle) && L.f(this.declineButtonTitle, autoShowPresetFiltersDialog.declineButtonTitle);
        }

        @k
        public final Button getApplyButton() {
            return this.applyButton;
        }

        @k
        public final String getCheckboxTitle() {
            return this.checkboxTitle;
        }

        @k
        public final String getDeclineButtonTitle() {
            return this.declineButtonTitle;
        }

        @k
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.declineButtonTitle.hashCode() + H.d((this.applyButton.hashCode() + H.d(this.title.hashCode() * 31, 31, this.subtitle)) * 31, 31, this.checkboxTitle);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AutoShowPresetFiltersDialog(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", applyButton=");
            sb2.append(this.applyButton);
            sb2.append(", checkboxTitle=");
            sb2.append(this.checkboxTitle);
            sb2.append(", declineButtonTitle=");
            return C22026a.c(sb2, this.declineButtonTitle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            this.applyButton.writeToParcel(parcel, flags);
            parcel.writeString(this.checkboxTitle);
            parcel.writeString(this.declineButtonTitle);
        }
    }

    /* compiled from: InlineFilters.kt */
    @d
    @Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bN\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bG\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0005\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\f\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\f\u0012\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\f\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010J\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010\f\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u0010OJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u0010OJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bT\u0010OJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bU\u0010OJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bV\u0010OJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u0010OJ\u0018\u0010X\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0012\u0010Z\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bZ\u0010[J\u0012\u0010\\\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\\\u0010[J\u0012\u0010]\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b]\u0010[J\u0012\u0010^\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b^\u0010[J\u0012\u0010_\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b_\u0010`J\u0012\u0010a\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0012\u0010c\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bc\u0010[J\u0012\u0010d\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bd\u0010eJ\u0018\u0010f\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bf\u0010YJ\u0012\u0010g\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bg\u0010[J\u0012\u0010h\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bh\u0010iJ\u0018\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bj\u0010YJ\u0012\u0010k\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bk\u0010iJ\u0012\u0010l\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0012\u0010n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bn\u0010OJ\u0012\u0010o\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bo\u0010[J\u0012\u0010p\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bp\u0010qJ\u0018\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fHÆ\u0003¢\u0006\u0004\br\u0010YJ\u0012\u0010s\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\bs\u0010iJ\u0012\u0010t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bt\u0010OJ\u0012\u0010u\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\bu\u0010vJ\u0012\u0010w\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bw\u0010[J\u0012\u0010x\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bx\u0010OJ\u0012\u0010y\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\by\u0010OJ\u0012\u0010z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bz\u0010OJ\u0012\u0010{\u001a\u0004\u0018\u000101HÆ\u0003¢\u0006\u0004\b{\u0010|J\u0012\u0010}\u001a\u0004\u0018\u000103HÆ\u0003¢\u0006\u0004\b}\u0010~J\u0018\u0010\u007f\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u007f\u0010YJ\u001a\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b\u0080\u0001\u0010YJ\u0014\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0005\b\u0081\u0001\u0010iJ\u0014\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0005\b\u0082\u0001\u0010iJ\u0014\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0005\b\u0083\u0001\u0010iJ\u0014\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0005\b\u0084\u0001\u0010iJ\u0014\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u0085\u0001\u0010[J\u0015\u0010\u0086\u0001\u001a\u0004\u0018\u00010>HÆ\u0003¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u0015\u0010\u0088\u0001\u001a\u0004\u0018\u00010@HÆ\u0003¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0015\u0010\u008a\u0001\u001a\u0004\u0018\u00010BHÆ\u0003¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0015\u0010\u008c\u0001\u001a\u0004\u0018\u00010DHÆ\u0003¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0015\u0010\u008e\u0001\u001a\u0004\u0018\u00010FHÆ\u0003¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0014\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u0090\u0001\u0010[J\u001a\u0010\u0091\u0001\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010\fHÆ\u0003¢\u0006\u0005\b\u0091\u0001\u0010YJ\u0014\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0005\b\u0092\u0001\u0010[J¡\u0005\u0010\u0093\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\f2\u0010\b\u0002\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\f2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010J\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010\f2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0012\u0010\u0095\u0001\u001a\u00020\u0002HÖ\u0001¢\u0006\u0005\b\u0095\u0001\u0010OJ\u0013\u0010\u0096\u0001\u001a\u00020\u001eHÖ\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001f\u0010\u009a\u0001\u001a\u00020\u000f2\n\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0098\u0001HÖ\u0003¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0013\u0010\u009c\u0001\u001a\u00020\u001eHÖ\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u0097\u0001J'\u0010¡\u0001\u001a\u00030 \u00012\b\u0010\u009e\u0001\u001a\u00030\u009d\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u001eHÖ\u0001¢\u0006\u0006\b¡\u0001\u0010¢\u0001R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0003\u0010£\u0001\u001a\u0005\b¤\u0001\u0010OR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0004\u0010£\u0001\u001a\u0005\b¥\u0001\u0010OR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0006\u0010¦\u0001\u001a\u0005\b§\u0001\u0010RR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0007\u0010£\u0001\u001a\u0005\b¨\u0001\u0010OR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\b\u0010£\u0001\u001a\u0005\b©\u0001\u0010OR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\t\u0010£\u0001\u001a\u0005\bª\u0001\u0010OR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\n\u0010£\u0001\u001a\u0005\b«\u0001\u0010OR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010£\u0001\u001a\u0005\b¬\u0001\u0010OR$\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010\u00ad\u0001\u001a\u0005\b®\u0001\u0010YR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010¯\u0001\u001a\u0005\b°\u0001\u0010[R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010¯\u0001\u001a\u0005\b±\u0001\u0010[R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010¯\u0001\u001a\u0005\b²\u0001\u0010[R(\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0005\b\u0013\u0010¯\u0001\u001a\u0005\b³\u0001\u0010[\"\u0006\b´\u0001\u0010µ\u0001R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0015\u0010¶\u0001\u001a\u0005\b·\u0001\u0010`R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010¸\u0001\u001a\u0005\b¹\u0001\u0010bR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010¯\u0001\u001a\u0005\bº\u0001\u0010[R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010»\u0001\u001a\u0005\b¼\u0001\u0010eR$\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010\u00ad\u0001\u001a\u0005\b½\u0001\u0010YR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010¯\u0001\u001a\u0005\b¾\u0001\u0010[R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010¿\u0001\u001a\u0005\bÀ\u0001\u0010iR$\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b \u0010\u00ad\u0001\u001a\u0005\bÁ\u0001\u0010YR\u001e\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b!\u0010¿\u0001\u001a\u0005\bÂ\u0001\u0010iR\u001e\u0010#\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b#\u0010Ã\u0001\u001a\u0005\bÄ\u0001\u0010mR\u001e\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b$\u0010£\u0001\u001a\u0005\bÅ\u0001\u0010OR\u001d\u0010%\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b%\u0010¯\u0001\u001a\u0004\b%\u0010[R\u001e\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b'\u0010Æ\u0001\u001a\u0005\bÇ\u0001\u0010qR$\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010\u00ad\u0001\u001a\u0005\bÈ\u0001\u0010YR\u001e\u0010)\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010¿\u0001\u001a\u0005\bÉ\u0001\u0010iR\u001e\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010£\u0001\u001a\u0005\bÊ\u0001\u0010OR\u001e\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010Ë\u0001\u001a\u0005\bÌ\u0001\u0010vR\u001e\u0010-\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b-\u0010¯\u0001\u001a\u0005\bÍ\u0001\u0010[R\u001e\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b.\u0010£\u0001\u001a\u0005\bÎ\u0001\u0010OR\u001e\u0010/\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b/\u0010£\u0001\u001a\u0005\bÏ\u0001\u0010OR\u001e\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b0\u0010£\u0001\u001a\u0005\bÐ\u0001\u0010OR\u001e\u00102\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b2\u0010Ñ\u0001\u001a\u0005\bÒ\u0001\u0010|R\u001e\u00104\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b4\u0010Ó\u0001\u001a\u0005\bÔ\u0001\u0010~R$\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b6\u0010\u00ad\u0001\u001a\u0005\bÕ\u0001\u0010YR$\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b8\u0010\u00ad\u0001\u001a\u0005\bÖ\u0001\u0010YR\u001e\u00109\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b9\u0010¿\u0001\u001a\u0005\b×\u0001\u0010iR\u001e\u0010:\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b:\u0010¿\u0001\u001a\u0005\bØ\u0001\u0010iR\u001e\u0010;\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b;\u0010¿\u0001\u001a\u0005\bÙ\u0001\u0010iR\u001e\u0010<\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b<\u0010¿\u0001\u001a\u0005\bÚ\u0001\u0010iR\u001d\u0010=\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b=\u0010¯\u0001\u001a\u0004\b=\u0010[R\u001f\u0010?\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\b?\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010\u0087\u0001R\u001f\u0010A\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bA\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010\u0089\u0001R\u001f\u0010C\u001a\u0004\u0018\u00010B8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bC\u0010ß\u0001\u001a\u0006\bà\u0001\u0010\u008b\u0001R\u001f\u0010E\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bE\u0010á\u0001\u001a\u0006\bâ\u0001\u0010\u008d\u0001R\u001f\u0010G\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\u000f\n\u0005\bG\u0010ã\u0001\u001a\u0006\bä\u0001\u0010\u008f\u0001R\u001b\u0010H\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\u000e\n\u0005\bH\u0010¯\u0001\u001a\u0005\bå\u0001\u0010[R$\u0010J\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\bJ\u0010\u00ad\u0001\u001a\u0005\bæ\u0001\u0010YR\u001d\u0010K\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\r\n\u0005\bK\u0010¯\u0001\u001a\u0004\bK\u0010[¨\u0006ç\u0001"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$Config;", "Landroid/os/Parcelable;", "", "customTitle", "customTitleOn", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedDisplayTitle", "toPlaceholder", "fromPlaceholder", "toValueFormat", "fromValueFormat", "thousandsSeparator", "", "Lcom/avito/android/remote/model/search/Filter$OptionsGroup;", "groups", "", "areGroupsCollapsible", "resetDisabled", "withBackButton", "withSkipButton", "Lcom/avito/android/remote/model/search/WidgetSize;", "size", "Lcom/avito/android/remote/model/search/Filter$NextAction;", "nextAction", "withImages", "Lcom/avito/android/remote/model/category_parameters/SortDirection;", "sortDirection", "Lcom/avito/android/remote/model/search/OptionsTab;", "optionTabs", "hideCounterOnEmptyTabSelection", "", "suggestLimit", "defaultSuggests", "categoryId", "Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "imageParams", "externalId", "isAutoOpen", "Lcom/avito/android/remote/model/search/Filter$Hint;", "hint", "radioIds", "limit", "limitMessage", "Lcom/avito/android/remote/model/search/Theme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "searchAvailable", "icon", "iconOn", "autofocusFilterId", "Lcom/avito/android/remote/model/search/Filter$Displaying;", Navigation.DISPLAYING, "Lcom/avito/android/remote/model/search/Filter$MultiThemeIcon;", "multiThemeIcon", "Lcom/avito/android/remote/model/search/Filter$Field;", LocalPublishState.FIELDS, "Lcom/avito/android/remote/model/search/Filter$Value;", "values", "minGuests", "maxGuests", "maxAdultsCount", "maxChildrenCount", "isNdProfSearch", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog;", "autoShowPresetFiltersDialog", "Lcom/avito/android/remote/model/search/ConfigWidgetType;", "widgetType", "Lcom/avito/android/remote/model/search/ConfigCalendarSelectionType;", "calendarSelectionType", "Lcom/avito/android/remote/model/search/Filter$FlexSearchDateConfig;", "flexSearchDate", "followCategoryDeeplink", "Lcom/avito/android/remote/model/search/Filter$Separator;", "separators", "isToolbarFilter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/search/WidgetSize;Lcom/avito/android/remote/model/search/Filter$NextAction;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/SortDirection;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/search/Filter$Hint;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/remote/model/search/Theme;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$Displaying;Lcom/avito/android/remote/model/search/Filter$MultiThemeIcon;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog;Lcom/avito/android/remote/model/search/ConfigWidgetType;Lcom/avito/android/remote/model/search/ConfigCalendarSelectionType;Lcom/avito/android/remote/model/search/Filter$FlexSearchDateConfig;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/util/List;", "component10", "()Ljava/lang/Boolean;", "component11", "component12", "component13", "component14", "()Lcom/avito/android/remote/model/search/WidgetSize;", "component15", "()Lcom/avito/android/remote/model/search/Filter$NextAction;", "component16", "component17", "()Lcom/avito/android/remote/model/category_parameters/SortDirection;", "component18", "component19", "component20", "()Ljava/lang/Integer;", "component21", "component22", "component23", "()Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "component24", "component25", "component26", "()Lcom/avito/android/remote/model/search/Filter$Hint;", "component27", "component28", "component29", "component30", "()Lcom/avito/android/remote/model/search/Theme;", "component31", "component32", "component33", "component34", "component35", "()Lcom/avito/android/remote/model/search/Filter$Displaying;", "component36", "()Lcom/avito/android/remote/model/search/Filter$MultiThemeIcon;", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component45", "()Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog;", "component46", "()Lcom/avito/android/remote/model/search/ConfigWidgetType;", "component47", "()Lcom/avito/android/remote/model/search/ConfigCalendarSelectionType;", "component48", "()Lcom/avito/android/remote/model/search/Filter$FlexSearchDateConfig;", "component49", "component50", "component51", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/search/WidgetSize;Lcom/avito/android/remote/model/search/Filter$NextAction;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/SortDirection;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/search/Filter$Hint;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/remote/model/search/Theme;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$Displaying;Lcom/avito/android/remote/model/search/Filter$MultiThemeIcon;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog;Lcom/avito/android/remote/model/search/ConfigWidgetType;Lcom/avito/android/remote/model/search/ConfigCalendarSelectionType;Lcom/avito/android/remote/model/search/Filter$FlexSearchDateConfig;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/search/Filter$Config;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCustomTitle", "getCustomTitleOn", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedDisplayTitle", "getToPlaceholder", "getFromPlaceholder", "getToValueFormat", "getFromValueFormat", "getThousandsSeparator", "Ljava/util/List;", "getGroups", "Ljava/lang/Boolean;", "getAreGroupsCollapsible", "getResetDisabled", "getWithBackButton", "getWithSkipButton", "setWithSkipButton", "(Ljava/lang/Boolean;)V", "Lcom/avito/android/remote/model/search/WidgetSize;", "getSize", "Lcom/avito/android/remote/model/search/Filter$NextAction;", "getNextAction", "getWithImages", "Lcom/avito/android/remote/model/category_parameters/SortDirection;", "getSortDirection", "getOptionTabs", "getHideCounterOnEmptyTabSelection", "Ljava/lang/Integer;", "getSuggestLimit", "getDefaultSuggests", "getCategoryId", "Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "getImageParams", "getExternalId", "Lcom/avito/android/remote/model/search/Filter$Hint;", "getHint", "getRadioIds", "getLimit", "getLimitMessage", "Lcom/avito/android/remote/model/search/Theme;", "getTheme", "getSearchAvailable", "getIcon", "getIconOn", "getAutofocusFilterId", "Lcom/avito/android/remote/model/search/Filter$Displaying;", "getDisplaying", "Lcom/avito/android/remote/model/search/Filter$MultiThemeIcon;", "getMultiThemeIcon", "getFields", "getValues", "getMinGuests", "getMaxGuests", "getMaxAdultsCount", "getMaxChildrenCount", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/search/Filter$AutoShowPresetFiltersDialog;", "getAutoShowPresetFiltersDialog", "Lcom/avito/android/remote/model/search/ConfigWidgetType;", "getWidgetType", "Lcom/avito/android/remote/model/search/ConfigCalendarSelectionType;", "getCalendarSelectionType", "Lcom/avito/android/remote/model/search/Filter$FlexSearchDateConfig;", "getFlexSearchDate", "getFollowCategoryDeeplink", "getSeparators", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config implements Parcelable {

        @k
        public static final Parcelable.Creator<Config> CREATOR = new Creator();

        @c("areGroupsCollapsible")
        @l
        private final Boolean areGroupsCollapsible;

        @c("attributedDisplayTitle")
        @l
        private final AttributedText attributedDisplayTitle;

        @c("autoShowPresetFiltersDialog")
        @l
        private final AutoShowPresetFiltersDialog autoShowPresetFiltersDialog;

        @c("autofocusFilterId")
        @l
        private final String autofocusFilterId;

        @c("calendarSelectionType")
        @l
        private final ConfigCalendarSelectionType calendarSelectionType;

        @c("categoryId")
        @l
        private final Integer categoryId;

        @c("customTitle")
        @l
        private final String customTitle;

        @c("customTitleOn")
        @l
        private final String customTitleOn;

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @c("defaultSuggests")
        @l
        private final List<String> defaultSuggests;

        @c(Navigation.DISPLAYING)
        @l
        private final Displaying displaying;

        @c("externalId")
        @l
        private final String externalId;

        @c(LocalPublishState.FIELDS)
        @l
        private final List<Field> fields;

        @c("flexSearchDate")
        @l
        private final FlexSearchDateConfig flexSearchDate;

        @l
        private final transient Boolean followCategoryDeeplink;

        @c("fromPlaceholder")
        @l
        private final String fromPlaceholder;

        @c("fromValueFormat")
        @l
        private final String fromValueFormat;

        @c("groups")
        @l
        private final List<OptionsGroup> groups;

        @c("hideCounterOnEmptyTabSelection")
        @l
        private final Boolean hideCounterOnEmptyTabSelection;

        @c("hint")
        @l
        private final Hint hint;

        @c("icon")
        @l
        private final String icon;

        @c("iconOn")
        @l
        private final String iconOn;

        @c("imageParams")
        @l
        private final DisplayingImageParams imageParams;

        @c("isAutoOpen")
        @l
        private final Boolean isAutoOpen;

        @c("isNdProfSearch")
        @l
        private final Boolean isNdProfSearch;

        @c("isToolbarFilter")
        @l
        private final Boolean isToolbarFilter;

        @c("limit")
        @l
        private final Integer limit;

        @c("limitMessage")
        @l
        private final String limitMessage;

        @c("maxAdultsCount")
        @l
        private final Integer maxAdultsCount;

        @c("maxChildrenCount")
        @l
        private final Integer maxChildrenCount;

        @c("maxGuests")
        @l
        private final Integer maxGuests;

        @c("minGuests")
        @l
        private final Integer minGuests;

        @c("multiThemeIcon")
        @l
        private final MultiThemeIcon multiThemeIcon;

        @c("nextAction")
        @l
        private final NextAction nextAction;

        @c("tabs")
        @l
        private final List<OptionsTab> optionTabs;

        @c("radioIds")
        @l
        private final List<String> radioIds;

        @c("resetDisabled")
        @l
        private final Boolean resetDisabled;

        @c("searchAvailable")
        @l
        private final Boolean searchAvailable;

        @c("separators")
        @l
        private final List<Separator> separators;

        @c("size")
        @l
        private final WidgetSize size;

        @c("sortDirection")
        @l
        private final SortDirection sortDirection;

        @c("suggestLimit")
        @l
        private final Integer suggestLimit;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
        @l
        private final Theme theme;

        @c("thousandsSeparator")
        @l
        private final String thousandsSeparator;

        @c("toPlaceholder")
        @l
        private final String toPlaceholder;

        @c("toValueFormat")
        @l
        private final String toValueFormat;

        @c("values")
        @l
        private final List<Value> values;

        @c("widgetType")
        @l
        private final ConfigWidgetType widgetType;

        @c("withBackButton")
        @l
        private final Boolean withBackButton;

        @c("withImages")
        @l
        private final Boolean withImages;

        @c("withSkipButton")
        @l
        private Boolean withSkipButton;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Config> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Config createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                Boolean bool;
                Boolean bool2;
                ArrayList arrayList2;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                String string = parcel.readString();
                String string2 = parcel.readString();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(Config.class.getClassLoader());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(OptionsGroup.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean boolValueOf3 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean boolValueOf4 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                WidgetSize widgetSizeValueOf = parcel.readInt() == 0 ? null : WidgetSize.valueOf(parcel.readString());
                NextAction nextActionCreateFromParcel = parcel.readInt() == 0 ? null : NextAction.CREATOR.createFromParcel(parcel);
                Boolean boolValueOf5 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                SortDirection sortDirectionValueOf = parcel.readInt() == 0 ? null : SortDirection.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    bool2 = boolValueOf2;
                    bool = boolValueOf3;
                    arrayList2 = null;
                } else {
                    int i13 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(i13);
                    bool = boolValueOf3;
                    int iC3 = 0;
                    while (iC3 != i13) {
                        iC3 = a.c(OptionsTab.CREATOR, parcel, arrayList6, iC3, 1);
                        i13 = i13;
                        boolValueOf2 = boolValueOf2;
                    }
                    bool2 = boolValueOf2;
                    arrayList2 = arrayList6;
                }
                Boolean boolValueOf6 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                DisplayingImageParams displayingImageParamsCreateFromParcel = parcel.readInt() == 0 ? null : DisplayingImageParams.CREATOR.createFromParcel(parcel);
                String string8 = parcel.readString();
                Boolean boolValueOf7 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Hint hintCreateFromParcel = parcel.readInt() == 0 ? null : Hint.CREATOR.createFromParcel(parcel);
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string9 = parcel.readString();
                Theme themeValueOf = parcel.readInt() == 0 ? null : Theme.valueOf(parcel.readString());
                Boolean boolValueOf8 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Displaying displayingCreateFromParcel = parcel.readInt() == 0 ? null : Displaying.CREATOR.createFromParcel(parcel);
                MultiThemeIcon multiThemeIconCreateFromParcel = parcel.readInt() == 0 ? null : MultiThemeIcon.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int i14 = parcel.readInt();
                    ArrayList arrayList7 = new ArrayList(i14);
                    int iC4 = 0;
                    while (iC4 != i14) {
                        iC4 = a.c(Field.CREATOR, parcel, arrayList7, iC4, 1);
                        i14 = i14;
                    }
                    arrayList3 = arrayList7;
                }
                if (parcel.readInt() == 0) {
                    arrayList4 = null;
                } else {
                    int i15 = parcel.readInt();
                    ArrayList arrayList8 = new ArrayList(i15);
                    int iC5 = 0;
                    while (iC5 != i15) {
                        iC5 = a.c(Value.CREATOR, parcel, arrayList8, iC5, 1);
                        i15 = i15;
                    }
                    arrayList4 = arrayList8;
                }
                Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer numValueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Boolean boolValueOf9 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Config.class.getClassLoader());
                AutoShowPresetFiltersDialog autoShowPresetFiltersDialogCreateFromParcel = parcel.readInt() == 0 ? null : AutoShowPresetFiltersDialog.CREATOR.createFromParcel(parcel);
                ConfigWidgetType configWidgetTypeValueOf = parcel.readInt() == 0 ? null : ConfigWidgetType.valueOf(parcel.readString());
                ConfigCalendarSelectionType configCalendarSelectionTypeValueOf = parcel.readInt() == 0 ? null : ConfigCalendarSelectionType.valueOf(parcel.readString());
                FlexSearchDateConfig flexSearchDateConfigCreateFromParcel = parcel.readInt() == 0 ? null : FlexSearchDateConfig.CREATOR.createFromParcel(parcel);
                Boolean boolValueOf10 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                if (parcel.readInt() == 0) {
                    arrayList5 = null;
                } else {
                    int i16 = parcel.readInt();
                    ArrayList arrayList9 = new ArrayList(i16);
                    for (int i17 = 0; i17 != i16; i17++) {
                        arrayList9.add(Separator.valueOf(parcel.readString()));
                    }
                    arrayList5 = arrayList9;
                }
                return new Config(string, string2, attributedText, string3, string4, string5, string6, string7, arrayList, boolValueOf, bool2, bool, boolValueOf4, widgetSizeValueOf, nextActionCreateFromParcel, boolValueOf5, sortDirectionValueOf, arrayList2, boolValueOf6, numValueOf, arrayListCreateStringArrayList, numValueOf2, displayingImageParamsCreateFromParcel, string8, boolValueOf7, hintCreateFromParcel, arrayListCreateStringArrayList2, numValueOf3, string9, themeValueOf, boolValueOf8, string10, string11, string12, displayingCreateFromParcel, multiThemeIconCreateFromParcel, arrayList3, arrayList4, numValueOf4, numValueOf5, numValueOf6, numValueOf7, boolValueOf9, deepLink, autoShowPresetFiltersDialogCreateFromParcel, configWidgetTypeValueOf, configCalendarSelectionTypeValueOf, flexSearchDateConfigCreateFromParcel, boolValueOf10, arrayList5, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Config[] newArray(int i12) {
                return new Config[i12];
            }
        }

        public Config() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 524287, null);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getCustomTitle() {
            return this.customTitle;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final Boolean getAreGroupsCollapsible() {
            return this.areGroupsCollapsible;
        }

        @l
        /* renamed from: component11, reason: from getter */
        public final Boolean getResetDisabled() {
            return this.resetDisabled;
        }

        @l
        /* renamed from: component12, reason: from getter */
        public final Boolean getWithBackButton() {
            return this.withBackButton;
        }

        @l
        /* renamed from: component13, reason: from getter */
        public final Boolean getWithSkipButton() {
            return this.withSkipButton;
        }

        @l
        /* renamed from: component14, reason: from getter */
        public final WidgetSize getSize() {
            return this.size;
        }

        @l
        /* renamed from: component15, reason: from getter */
        public final NextAction getNextAction() {
            return this.nextAction;
        }

        @l
        /* renamed from: component16, reason: from getter */
        public final Boolean getWithImages() {
            return this.withImages;
        }

        @l
        /* renamed from: component17, reason: from getter */
        public final SortDirection getSortDirection() {
            return this.sortDirection;
        }

        @l
        public final List<OptionsTab> component18() {
            return this.optionTabs;
        }

        @l
        /* renamed from: component19, reason: from getter */
        public final Boolean getHideCounterOnEmptyTabSelection() {
            return this.hideCounterOnEmptyTabSelection;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getCustomTitleOn() {
            return this.customTitleOn;
        }

        @l
        /* renamed from: component20, reason: from getter */
        public final Integer getSuggestLimit() {
            return this.suggestLimit;
        }

        @l
        public final List<String> component21() {
            return this.defaultSuggests;
        }

        @l
        /* renamed from: component22, reason: from getter */
        public final Integer getCategoryId() {
            return this.categoryId;
        }

        @l
        /* renamed from: component23, reason: from getter */
        public final DisplayingImageParams getImageParams() {
            return this.imageParams;
        }

        @l
        /* renamed from: component24, reason: from getter */
        public final String getExternalId() {
            return this.externalId;
        }

        @l
        /* renamed from: component25, reason: from getter */
        public final Boolean getIsAutoOpen() {
            return this.isAutoOpen;
        }

        @l
        /* renamed from: component26, reason: from getter */
        public final Hint getHint() {
            return this.hint;
        }

        @l
        public final List<String> component27() {
            return this.radioIds;
        }

        @l
        /* renamed from: component28, reason: from getter */
        public final Integer getLimit() {
            return this.limit;
        }

        @l
        /* renamed from: component29, reason: from getter */
        public final String getLimitMessage() {
            return this.limitMessage;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AttributedText getAttributedDisplayTitle() {
            return this.attributedDisplayTitle;
        }

        @l
        /* renamed from: component30, reason: from getter */
        public final Theme getTheme() {
            return this.theme;
        }

        @l
        /* renamed from: component31, reason: from getter */
        public final Boolean getSearchAvailable() {
            return this.searchAvailable;
        }

        @l
        /* renamed from: component32, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @l
        /* renamed from: component33, reason: from getter */
        public final String getIconOn() {
            return this.iconOn;
        }

        @l
        /* renamed from: component34, reason: from getter */
        public final String getAutofocusFilterId() {
            return this.autofocusFilterId;
        }

        @l
        /* renamed from: component35, reason: from getter */
        public final Displaying getDisplaying() {
            return this.displaying;
        }

        @l
        /* renamed from: component36, reason: from getter */
        public final MultiThemeIcon getMultiThemeIcon() {
            return this.multiThemeIcon;
        }

        @l
        public final List<Field> component37() {
            return this.fields;
        }

        @l
        public final List<Value> component38() {
            return this.values;
        }

        @l
        /* renamed from: component39, reason: from getter */
        public final Integer getMinGuests() {
            return this.minGuests;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getToPlaceholder() {
            return this.toPlaceholder;
        }

        @l
        /* renamed from: component40, reason: from getter */
        public final Integer getMaxGuests() {
            return this.maxGuests;
        }

        @l
        /* renamed from: component41, reason: from getter */
        public final Integer getMaxAdultsCount() {
            return this.maxAdultsCount;
        }

        @l
        /* renamed from: component42, reason: from getter */
        public final Integer getMaxChildrenCount() {
            return this.maxChildrenCount;
        }

        @l
        /* renamed from: component43, reason: from getter */
        public final Boolean getIsNdProfSearch() {
            return this.isNdProfSearch;
        }

        @l
        /* renamed from: component44, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        /* renamed from: component45, reason: from getter */
        public final AutoShowPresetFiltersDialog getAutoShowPresetFiltersDialog() {
            return this.autoShowPresetFiltersDialog;
        }

        @l
        /* renamed from: component46, reason: from getter */
        public final ConfigWidgetType getWidgetType() {
            return this.widgetType;
        }

        @l
        /* renamed from: component47, reason: from getter */
        public final ConfigCalendarSelectionType getCalendarSelectionType() {
            return this.calendarSelectionType;
        }

        @l
        /* renamed from: component48, reason: from getter */
        public final FlexSearchDateConfig getFlexSearchDate() {
            return this.flexSearchDate;
        }

        @l
        /* renamed from: component49, reason: from getter */
        public final Boolean getFollowCategoryDeeplink() {
            return this.followCategoryDeeplink;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getFromPlaceholder() {
            return this.fromPlaceholder;
        }

        @l
        public final List<Separator> component50() {
            return this.separators;
        }

        @l
        /* renamed from: component51, reason: from getter */
        public final Boolean getIsToolbarFilter() {
            return this.isToolbarFilter;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getToValueFormat() {
            return this.toValueFormat;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getFromValueFormat() {
            return this.fromValueFormat;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final String getThousandsSeparator() {
            return this.thousandsSeparator;
        }

        @l
        public final List<OptionsGroup> component9() {
            return this.groups;
        }

        @k
        public final Config copy(@l String customTitle, @l String customTitleOn, @l AttributedText attributedDisplayTitle, @l String toPlaceholder, @l String fromPlaceholder, @l String toValueFormat, @l String fromValueFormat, @l String thousandsSeparator, @l List<OptionsGroup> groups, @l Boolean areGroupsCollapsible, @l Boolean resetDisabled, @l Boolean withBackButton, @l Boolean withSkipButton, @l WidgetSize size, @l NextAction nextAction, @l Boolean withImages, @l SortDirection sortDirection, @l List<OptionsTab> optionTabs, @l Boolean hideCounterOnEmptyTabSelection, @l Integer suggestLimit, @l List<String> defaultSuggests, @l Integer categoryId, @l DisplayingImageParams imageParams, @l String externalId, @l Boolean isAutoOpen, @l Hint hint, @l List<String> radioIds, @l Integer limit, @l String limitMessage, @l Theme theme, @l Boolean searchAvailable, @l String icon, @l String iconOn, @l String autofocusFilterId, @l Displaying displaying, @l MultiThemeIcon multiThemeIcon, @l List<Field> fields, @l List<Value> values, @l Integer minGuests, @l Integer maxGuests, @l Integer maxAdultsCount, @l Integer maxChildrenCount, @l Boolean isNdProfSearch, @l DeepLink deeplink, @l AutoShowPresetFiltersDialog autoShowPresetFiltersDialog, @l ConfigWidgetType widgetType, @l ConfigCalendarSelectionType calendarSelectionType, @l FlexSearchDateConfig flexSearchDate, @l Boolean followCategoryDeeplink, @l List<? extends Separator> separators, @l Boolean isToolbarFilter) {
            return new Config(customTitle, customTitleOn, attributedDisplayTitle, toPlaceholder, fromPlaceholder, toValueFormat, fromValueFormat, thousandsSeparator, groups, areGroupsCollapsible, resetDisabled, withBackButton, withSkipButton, size, nextAction, withImages, sortDirection, optionTabs, hideCounterOnEmptyTabSelection, suggestLimit, defaultSuggests, categoryId, imageParams, externalId, isAutoOpen, hint, radioIds, limit, limitMessage, theme, searchAvailable, icon, iconOn, autofocusFilterId, displaying, multiThemeIcon, fields, values, minGuests, maxGuests, maxAdultsCount, maxChildrenCount, isNdProfSearch, deeplink, autoShowPresetFiltersDialog, widgetType, calendarSelectionType, flexSearchDate, followCategoryDeeplink, separators, isToolbarFilter);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return L.f(this.customTitle, config.customTitle) && L.f(this.customTitleOn, config.customTitleOn) && L.f(this.attributedDisplayTitle, config.attributedDisplayTitle) && L.f(this.toPlaceholder, config.toPlaceholder) && L.f(this.fromPlaceholder, config.fromPlaceholder) && L.f(this.toValueFormat, config.toValueFormat) && L.f(this.fromValueFormat, config.fromValueFormat) && L.f(this.thousandsSeparator, config.thousandsSeparator) && L.f(this.groups, config.groups) && L.f(this.areGroupsCollapsible, config.areGroupsCollapsible) && L.f(this.resetDisabled, config.resetDisabled) && L.f(this.withBackButton, config.withBackButton) && L.f(this.withSkipButton, config.withSkipButton) && this.size == config.size && L.f(this.nextAction, config.nextAction) && L.f(this.withImages, config.withImages) && this.sortDirection == config.sortDirection && L.f(this.optionTabs, config.optionTabs) && L.f(this.hideCounterOnEmptyTabSelection, config.hideCounterOnEmptyTabSelection) && L.f(this.suggestLimit, config.suggestLimit) && L.f(this.defaultSuggests, config.defaultSuggests) && L.f(this.categoryId, config.categoryId) && L.f(this.imageParams, config.imageParams) && L.f(this.externalId, config.externalId) && L.f(this.isAutoOpen, config.isAutoOpen) && L.f(this.hint, config.hint) && L.f(this.radioIds, config.radioIds) && L.f(this.limit, config.limit) && L.f(this.limitMessage, config.limitMessage) && this.theme == config.theme && L.f(this.searchAvailable, config.searchAvailable) && L.f(this.icon, config.icon) && L.f(this.iconOn, config.iconOn) && L.f(this.autofocusFilterId, config.autofocusFilterId) && L.f(this.displaying, config.displaying) && L.f(this.multiThemeIcon, config.multiThemeIcon) && L.f(this.fields, config.fields) && L.f(this.values, config.values) && L.f(this.minGuests, config.minGuests) && L.f(this.maxGuests, config.maxGuests) && L.f(this.maxAdultsCount, config.maxAdultsCount) && L.f(this.maxChildrenCount, config.maxChildrenCount) && L.f(this.isNdProfSearch, config.isNdProfSearch) && L.f(this.deeplink, config.deeplink) && L.f(this.autoShowPresetFiltersDialog, config.autoShowPresetFiltersDialog) && this.widgetType == config.widgetType && this.calendarSelectionType == config.calendarSelectionType && L.f(this.flexSearchDate, config.flexSearchDate) && L.f(this.followCategoryDeeplink, config.followCategoryDeeplink) && L.f(this.separators, config.separators) && L.f(this.isToolbarFilter, config.isToolbarFilter);
        }

        @l
        public final Boolean getAreGroupsCollapsible() {
            return this.areGroupsCollapsible;
        }

        @l
        public final AttributedText getAttributedDisplayTitle() {
            return this.attributedDisplayTitle;
        }

        @l
        public final AutoShowPresetFiltersDialog getAutoShowPresetFiltersDialog() {
            return this.autoShowPresetFiltersDialog;
        }

        @l
        public final String getAutofocusFilterId() {
            return this.autofocusFilterId;
        }

        @l
        public final ConfigCalendarSelectionType getCalendarSelectionType() {
            return this.calendarSelectionType;
        }

        @l
        public final Integer getCategoryId() {
            return this.categoryId;
        }

        @l
        public final String getCustomTitle() {
            return this.customTitle;
        }

        @l
        public final String getCustomTitleOn() {
            return this.customTitleOn;
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final List<String> getDefaultSuggests() {
            return this.defaultSuggests;
        }

        @l
        public final Displaying getDisplaying() {
            return this.displaying;
        }

        @l
        public final String getExternalId() {
            return this.externalId;
        }

        @l
        public final List<Field> getFields() {
            return this.fields;
        }

        @l
        public final FlexSearchDateConfig getFlexSearchDate() {
            return this.flexSearchDate;
        }

        @l
        public final Boolean getFollowCategoryDeeplink() {
            return this.followCategoryDeeplink;
        }

        @l
        public final String getFromPlaceholder() {
            return this.fromPlaceholder;
        }

        @l
        public final String getFromValueFormat() {
            return this.fromValueFormat;
        }

        @l
        public final List<OptionsGroup> getGroups() {
            return this.groups;
        }

        @l
        public final Boolean getHideCounterOnEmptyTabSelection() {
            return this.hideCounterOnEmptyTabSelection;
        }

        @l
        public final Hint getHint() {
            return this.hint;
        }

        @l
        public final String getIcon() {
            return this.icon;
        }

        @l
        public final String getIconOn() {
            return this.iconOn;
        }

        @l
        public final DisplayingImageParams getImageParams() {
            return this.imageParams;
        }

        @l
        public final Integer getLimit() {
            return this.limit;
        }

        @l
        public final String getLimitMessage() {
            return this.limitMessage;
        }

        @l
        public final Integer getMaxAdultsCount() {
            return this.maxAdultsCount;
        }

        @l
        public final Integer getMaxChildrenCount() {
            return this.maxChildrenCount;
        }

        @l
        public final Integer getMaxGuests() {
            return this.maxGuests;
        }

        @l
        public final Integer getMinGuests() {
            return this.minGuests;
        }

        @l
        public final MultiThemeIcon getMultiThemeIcon() {
            return this.multiThemeIcon;
        }

        @l
        public final NextAction getNextAction() {
            return this.nextAction;
        }

        @l
        public final List<OptionsTab> getOptionTabs() {
            return this.optionTabs;
        }

        @l
        public final List<String> getRadioIds() {
            return this.radioIds;
        }

        @l
        public final Boolean getResetDisabled() {
            return this.resetDisabled;
        }

        @l
        public final Boolean getSearchAvailable() {
            return this.searchAvailable;
        }

        @l
        public final List<Separator> getSeparators() {
            return this.separators;
        }

        @l
        public final WidgetSize getSize() {
            return this.size;
        }

        @l
        public final SortDirection getSortDirection() {
            return this.sortDirection;
        }

        @l
        public final Integer getSuggestLimit() {
            return this.suggestLimit;
        }

        @l
        public final Theme getTheme() {
            return this.theme;
        }

        @l
        public final String getThousandsSeparator() {
            return this.thousandsSeparator;
        }

        @l
        public final String getToPlaceholder() {
            return this.toPlaceholder;
        }

        @l
        public final String getToValueFormat() {
            return this.toValueFormat;
        }

        @l
        public final List<Value> getValues() {
            return this.values;
        }

        @l
        public final ConfigWidgetType getWidgetType() {
            return this.widgetType;
        }

        @l
        public final Boolean getWithBackButton() {
            return this.withBackButton;
        }

        @l
        public final Boolean getWithImages() {
            return this.withImages;
        }

        @l
        public final Boolean getWithSkipButton() {
            return this.withSkipButton;
        }

        public int hashCode() {
            String str = this.customTitle;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.customTitleOn;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            AttributedText attributedText = this.attributedDisplayTitle;
            int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            String str3 = this.toPlaceholder;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fromPlaceholder;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.toValueFormat;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.fromValueFormat;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.thousandsSeparator;
            int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            List<OptionsGroup> list = this.groups;
            int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.areGroupsCollapsible;
            int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.resetDisabled;
            int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.withBackButton;
            int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.withSkipButton;
            int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            WidgetSize widgetSize = this.size;
            int iHashCode14 = (iHashCode13 + (widgetSize == null ? 0 : widgetSize.hashCode())) * 31;
            NextAction nextAction = this.nextAction;
            int iHashCode15 = (iHashCode14 + (nextAction == null ? 0 : nextAction.hashCode())) * 31;
            Boolean bool5 = this.withImages;
            int iHashCode16 = (iHashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
            SortDirection sortDirection = this.sortDirection;
            int iHashCode17 = (iHashCode16 + (sortDirection == null ? 0 : sortDirection.hashCode())) * 31;
            List<OptionsTab> list2 = this.optionTabs;
            int iHashCode18 = (iHashCode17 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Boolean bool6 = this.hideCounterOnEmptyTabSelection;
            int iHashCode19 = (iHashCode18 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
            Integer num = this.suggestLimit;
            int iHashCode20 = (iHashCode19 + (num == null ? 0 : num.hashCode())) * 31;
            List<String> list3 = this.defaultSuggests;
            int iHashCode21 = (iHashCode20 + (list3 == null ? 0 : list3.hashCode())) * 31;
            Integer num2 = this.categoryId;
            int iHashCode22 = (iHashCode21 + (num2 == null ? 0 : num2.hashCode())) * 31;
            DisplayingImageParams displayingImageParams = this.imageParams;
            int iHashCode23 = (iHashCode22 + (displayingImageParams == null ? 0 : displayingImageParams.hashCode())) * 31;
            String str8 = this.externalId;
            int iHashCode24 = (iHashCode23 + (str8 == null ? 0 : str8.hashCode())) * 31;
            Boolean bool7 = this.isAutoOpen;
            int iHashCode25 = (iHashCode24 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
            Hint hint = this.hint;
            int iHashCode26 = (iHashCode25 + (hint == null ? 0 : hint.hashCode())) * 31;
            List<String> list4 = this.radioIds;
            int iHashCode27 = (iHashCode26 + (list4 == null ? 0 : list4.hashCode())) * 31;
            Integer num3 = this.limit;
            int iHashCode28 = (iHashCode27 + (num3 == null ? 0 : num3.hashCode())) * 31;
            String str9 = this.limitMessage;
            int iHashCode29 = (iHashCode28 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Theme theme = this.theme;
            int iHashCode30 = (iHashCode29 + (theme == null ? 0 : theme.hashCode())) * 31;
            Boolean bool8 = this.searchAvailable;
            int iHashCode31 = (iHashCode30 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
            String str10 = this.icon;
            int iHashCode32 = (iHashCode31 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.iconOn;
            int iHashCode33 = (iHashCode32 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.autofocusFilterId;
            int iHashCode34 = (iHashCode33 + (str12 == null ? 0 : str12.hashCode())) * 31;
            Displaying displaying = this.displaying;
            int iHashCode35 = (iHashCode34 + (displaying == null ? 0 : displaying.hashCode())) * 31;
            MultiThemeIcon multiThemeIcon = this.multiThemeIcon;
            int iHashCode36 = (iHashCode35 + (multiThemeIcon == null ? 0 : multiThemeIcon.hashCode())) * 31;
            List<Field> list5 = this.fields;
            int iHashCode37 = (iHashCode36 + (list5 == null ? 0 : list5.hashCode())) * 31;
            List<Value> list6 = this.values;
            int iHashCode38 = (iHashCode37 + (list6 == null ? 0 : list6.hashCode())) * 31;
            Integer num4 = this.minGuests;
            int iHashCode39 = (iHashCode38 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.maxGuests;
            int iHashCode40 = (iHashCode39 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.maxAdultsCount;
            int iHashCode41 = (iHashCode40 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.maxChildrenCount;
            int iHashCode42 = (iHashCode41 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Boolean bool9 = this.isNdProfSearch;
            int iHashCode43 = (iHashCode42 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
            DeepLink deepLink = this.deeplink;
            int iHashCode44 = (iHashCode43 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            AutoShowPresetFiltersDialog autoShowPresetFiltersDialog = this.autoShowPresetFiltersDialog;
            int iHashCode45 = (iHashCode44 + (autoShowPresetFiltersDialog == null ? 0 : autoShowPresetFiltersDialog.hashCode())) * 31;
            ConfigWidgetType configWidgetType = this.widgetType;
            int iHashCode46 = (iHashCode45 + (configWidgetType == null ? 0 : configWidgetType.hashCode())) * 31;
            ConfigCalendarSelectionType configCalendarSelectionType = this.calendarSelectionType;
            int iHashCode47 = (iHashCode46 + (configCalendarSelectionType == null ? 0 : configCalendarSelectionType.hashCode())) * 31;
            FlexSearchDateConfig flexSearchDateConfig = this.flexSearchDate;
            int iHashCode48 = (iHashCode47 + (flexSearchDateConfig == null ? 0 : flexSearchDateConfig.hashCode())) * 31;
            Boolean bool10 = this.followCategoryDeeplink;
            int iHashCode49 = (iHashCode48 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
            List<Separator> list7 = this.separators;
            int iHashCode50 = (iHashCode49 + (list7 == null ? 0 : list7.hashCode())) * 31;
            Boolean bool11 = this.isToolbarFilter;
            return iHashCode50 + (bool11 != null ? bool11.hashCode() : 0);
        }

        @l
        public final Boolean isAutoOpen() {
            return this.isAutoOpen;
        }

        @l
        public final Boolean isNdProfSearch() {
            return this.isNdProfSearch;
        }

        @l
        public final Boolean isToolbarFilter() {
            return this.isToolbarFilter;
        }

        public final void setWithSkipButton(@l Boolean bool) {
            this.withSkipButton = bool;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Config(customTitle=");
            sb2.append(this.customTitle);
            sb2.append(", customTitleOn=");
            sb2.append(this.customTitleOn);
            sb2.append(", attributedDisplayTitle=");
            sb2.append(this.attributedDisplayTitle);
            sb2.append(", toPlaceholder=");
            sb2.append(this.toPlaceholder);
            sb2.append(", fromPlaceholder=");
            sb2.append(this.fromPlaceholder);
            sb2.append(", toValueFormat=");
            sb2.append(this.toValueFormat);
            sb2.append(", fromValueFormat=");
            sb2.append(this.fromValueFormat);
            sb2.append(", thousandsSeparator=");
            sb2.append(this.thousandsSeparator);
            sb2.append(", groups=");
            sb2.append(this.groups);
            sb2.append(", areGroupsCollapsible=");
            sb2.append(this.areGroupsCollapsible);
            sb2.append(", resetDisabled=");
            sb2.append(this.resetDisabled);
            sb2.append(", withBackButton=");
            sb2.append(this.withBackButton);
            sb2.append(", withSkipButton=");
            sb2.append(this.withSkipButton);
            sb2.append(", size=");
            sb2.append(this.size);
            sb2.append(", nextAction=");
            sb2.append(this.nextAction);
            sb2.append(", withImages=");
            sb2.append(this.withImages);
            sb2.append(", sortDirection=");
            sb2.append(this.sortDirection);
            sb2.append(", optionTabs=");
            sb2.append(this.optionTabs);
            sb2.append(", hideCounterOnEmptyTabSelection=");
            sb2.append(this.hideCounterOnEmptyTabSelection);
            sb2.append(", suggestLimit=");
            sb2.append(this.suggestLimit);
            sb2.append(", defaultSuggests=");
            sb2.append(this.defaultSuggests);
            sb2.append(", categoryId=");
            sb2.append(this.categoryId);
            sb2.append(", imageParams=");
            sb2.append(this.imageParams);
            sb2.append(", externalId=");
            sb2.append(this.externalId);
            sb2.append(", isAutoOpen=");
            sb2.append(this.isAutoOpen);
            sb2.append(", hint=");
            sb2.append(this.hint);
            sb2.append(", radioIds=");
            sb2.append(this.radioIds);
            sb2.append(", limit=");
            sb2.append(this.limit);
            sb2.append(", limitMessage=");
            sb2.append(this.limitMessage);
            sb2.append(", theme=");
            sb2.append(this.theme);
            sb2.append(", searchAvailable=");
            sb2.append(this.searchAvailable);
            sb2.append(", icon=");
            sb2.append(this.icon);
            sb2.append(", iconOn=");
            sb2.append(this.iconOn);
            sb2.append(", autofocusFilterId=");
            sb2.append(this.autofocusFilterId);
            sb2.append(", displaying=");
            sb2.append(this.displaying);
            sb2.append(", multiThemeIcon=");
            sb2.append(this.multiThemeIcon);
            sb2.append(", fields=");
            sb2.append(this.fields);
            sb2.append(", values=");
            sb2.append(this.values);
            sb2.append(", minGuests=");
            sb2.append(this.minGuests);
            sb2.append(", maxGuests=");
            sb2.append(this.maxGuests);
            sb2.append(", maxAdultsCount=");
            sb2.append(this.maxAdultsCount);
            sb2.append(", maxChildrenCount=");
            sb2.append(this.maxChildrenCount);
            sb2.append(", isNdProfSearch=");
            sb2.append(this.isNdProfSearch);
            sb2.append(", deeplink=");
            sb2.append(this.deeplink);
            sb2.append(", autoShowPresetFiltersDialog=");
            sb2.append(this.autoShowPresetFiltersDialog);
            sb2.append(", widgetType=");
            sb2.append(this.widgetType);
            sb2.append(", calendarSelectionType=");
            sb2.append(this.calendarSelectionType);
            sb2.append(", flexSearchDate=");
            sb2.append(this.flexSearchDate);
            sb2.append(", followCategoryDeeplink=");
            sb2.append(this.followCategoryDeeplink);
            sb2.append(", separators=");
            sb2.append(this.separators);
            sb2.append(", isToolbarFilter=");
            return C0.g(sb2, this.isToolbarFilter, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.customTitle);
            parcel.writeString(this.customTitleOn);
            parcel.writeParcelable(this.attributedDisplayTitle, flags);
            parcel.writeString(this.toPlaceholder);
            parcel.writeString(this.fromPlaceholder);
            parcel.writeString(this.toValueFormat);
            parcel.writeString(this.fromValueFormat);
            parcel.writeString(this.thousandsSeparator);
            List<OptionsGroup> list = this.groups;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((OptionsGroup) itA.next()).writeToParcel(parcel, flags);
                }
            }
            Boolean bool = this.areGroupsCollapsible;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            Boolean bool2 = this.resetDisabled;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool2);
            }
            Boolean bool3 = this.withBackButton;
            if (bool3 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool3);
            }
            Boolean bool4 = this.withSkipButton;
            if (bool4 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool4);
            }
            WidgetSize widgetSize = this.size;
            if (widgetSize == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(widgetSize.name());
            }
            NextAction nextAction = this.nextAction;
            if (nextAction == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                nextAction.writeToParcel(parcel, flags);
            }
            Boolean bool5 = this.withImages;
            if (bool5 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool5);
            }
            SortDirection sortDirection = this.sortDirection;
            if (sortDirection == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(sortDirection.name());
            }
            List<OptionsTab> list2 = this.optionTabs;
            if (list2 == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA2 = a.A(list2, parcel, 1);
                while (itA2.hasNext()) {
                    ((OptionsTab) itA2.next()).writeToParcel(parcel, flags);
                }
            }
            Boolean bool6 = this.hideCounterOnEmptyTabSelection;
            if (bool6 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool6);
            }
            Integer num = this.suggestLimit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            parcel.writeStringList(this.defaultSuggests);
            Integer num2 = this.categoryId;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num2);
            }
            DisplayingImageParams displayingImageParams = this.imageParams;
            if (displayingImageParams == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                displayingImageParams.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.externalId);
            Boolean bool7 = this.isAutoOpen;
            if (bool7 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool7);
            }
            Hint hint = this.hint;
            if (hint == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                hint.writeToParcel(parcel, flags);
            }
            parcel.writeStringList(this.radioIds);
            Integer num3 = this.limit;
            if (num3 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num3);
            }
            parcel.writeString(this.limitMessage);
            Theme theme = this.theme;
            if (theme == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(theme.name());
            }
            Boolean bool8 = this.searchAvailable;
            if (bool8 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool8);
            }
            parcel.writeString(this.icon);
            parcel.writeString(this.iconOn);
            parcel.writeString(this.autofocusFilterId);
            Displaying displaying = this.displaying;
            if (displaying == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                displaying.writeToParcel(parcel, flags);
            }
            MultiThemeIcon multiThemeIcon = this.multiThemeIcon;
            if (multiThemeIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                multiThemeIcon.writeToParcel(parcel, flags);
            }
            List<Field> list3 = this.fields;
            if (list3 == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA3 = a.A(list3, parcel, 1);
                while (itA3.hasNext()) {
                    ((Field) itA3.next()).writeToParcel(parcel, flags);
                }
            }
            List<Value> list4 = this.values;
            if (list4 == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA4 = a.A(list4, parcel, 1);
                while (itA4.hasNext()) {
                    ((Value) itA4.next()).writeToParcel(parcel, flags);
                }
            }
            Integer num4 = this.minGuests;
            if (num4 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num4);
            }
            Integer num5 = this.maxGuests;
            if (num5 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num5);
            }
            Integer num6 = this.maxAdultsCount;
            if (num6 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num6);
            }
            Integer num7 = this.maxChildrenCount;
            if (num7 == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num7);
            }
            Boolean bool9 = this.isNdProfSearch;
            if (bool9 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool9);
            }
            parcel.writeParcelable(this.deeplink, flags);
            AutoShowPresetFiltersDialog autoShowPresetFiltersDialog = this.autoShowPresetFiltersDialog;
            if (autoShowPresetFiltersDialog == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                autoShowPresetFiltersDialog.writeToParcel(parcel, flags);
            }
            ConfigWidgetType configWidgetType = this.widgetType;
            if (configWidgetType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(configWidgetType.name());
            }
            ConfigCalendarSelectionType configCalendarSelectionType = this.calendarSelectionType;
            if (configCalendarSelectionType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(configCalendarSelectionType.name());
            }
            FlexSearchDateConfig flexSearchDateConfig = this.flexSearchDate;
            if (flexSearchDateConfig == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                flexSearchDateConfig.writeToParcel(parcel, flags);
            }
            Boolean bool10 = this.followCategoryDeeplink;
            if (bool10 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool10);
            }
            List<Separator> list5 = this.separators;
            if (list5 == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA5 = a.A(list5, parcel, 1);
                while (itA5.hasNext()) {
                    parcel.writeString(((Separator) itA5.next()).name());
                }
            }
            Boolean bool11 = this.isToolbarFilter;
            if (bool11 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Config(@l String str, @l String str2, @l AttributedText attributedText, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l List<OptionsGroup> list, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l Boolean bool4, @l WidgetSize widgetSize, @l NextAction nextAction, @l Boolean bool5, @l SortDirection sortDirection, @l List<OptionsTab> list2, @l Boolean bool6, @l Integer num, @l List<String> list3, @l Integer num2, @l DisplayingImageParams displayingImageParams, @l String str8, @l Boolean bool7, @l Hint hint, @l List<String> list4, @l Integer num3, @l String str9, @l Theme theme, @l Boolean bool8, @l String str10, @l String str11, @l String str12, @l Displaying displaying, @l MultiThemeIcon multiThemeIcon, @l List<Field> list5, @l List<Value> list6, @l Integer num4, @l Integer num5, @l Integer num6, @l Integer num7, @l Boolean bool9, @l DeepLink deepLink, @l AutoShowPresetFiltersDialog autoShowPresetFiltersDialog, @l ConfigWidgetType configWidgetType, @l ConfigCalendarSelectionType configCalendarSelectionType, @l FlexSearchDateConfig flexSearchDateConfig, @l Boolean bool10, @l List<? extends Separator> list7, @l Boolean bool11) {
            this.customTitle = str;
            this.customTitleOn = str2;
            this.attributedDisplayTitle = attributedText;
            this.toPlaceholder = str3;
            this.fromPlaceholder = str4;
            this.toValueFormat = str5;
            this.fromValueFormat = str6;
            this.thousandsSeparator = str7;
            this.groups = list;
            this.areGroupsCollapsible = bool;
            this.resetDisabled = bool2;
            this.withBackButton = bool3;
            this.withSkipButton = bool4;
            this.size = widgetSize;
            this.nextAction = nextAction;
            this.withImages = bool5;
            this.sortDirection = sortDirection;
            this.optionTabs = list2;
            this.hideCounterOnEmptyTabSelection = bool6;
            this.suggestLimit = num;
            this.defaultSuggests = list3;
            this.categoryId = num2;
            this.imageParams = displayingImageParams;
            this.externalId = str8;
            this.isAutoOpen = bool7;
            this.hint = hint;
            this.radioIds = list4;
            this.limit = num3;
            this.limitMessage = str9;
            this.theme = theme;
            this.searchAvailable = bool8;
            this.icon = str10;
            this.iconOn = str11;
            this.autofocusFilterId = str12;
            this.displaying = displaying;
            this.multiThemeIcon = multiThemeIcon;
            this.fields = list5;
            this.values = list6;
            this.minGuests = num4;
            this.maxGuests = num5;
            this.maxAdultsCount = num6;
            this.maxChildrenCount = num7;
            this.isNdProfSearch = bool9;
            this.deeplink = deepLink;
            this.autoShowPresetFiltersDialog = autoShowPresetFiltersDialog;
            this.widgetType = configWidgetType;
            this.calendarSelectionType = configCalendarSelectionType;
            this.flexSearchDate = flexSearchDateConfig;
            this.followCategoryDeeplink = bool10;
            this.separators = list7;
            this.isToolbarFilter = bool11;
        }

        public /* synthetic */ Config(String str, String str2, AttributedText attributedText, String str3, String str4, String str5, String str6, String str7, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, WidgetSize widgetSize, NextAction nextAction, Boolean bool5, SortDirection sortDirection, List list2, Boolean bool6, Integer num, List list3, Integer num2, DisplayingImageParams displayingImageParams, String str8, Boolean bool7, Hint hint, List list4, Integer num3, String str9, Theme theme, Boolean bool8, String str10, String str11, String str12, Displaying displaying, MultiThemeIcon multiThemeIcon, List list5, List list6, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool9, DeepLink deepLink, AutoShowPresetFiltersDialog autoShowPresetFiltersDialog, ConfigWidgetType configWidgetType, ConfigCalendarSelectionType configCalendarSelectionType, FlexSearchDateConfig flexSearchDateConfig, Boolean bool10, List list7, Boolean bool11, int i12, int i13, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : attributedText, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : str6, (i12 & 128) != 0 ? null : str7, (i12 & 256) != 0 ? null : list, (i12 & 512) != 0 ? null : bool, (i12 & 1024) != 0 ? null : bool2, (i12 & 2048) != 0 ? null : bool3, (i12 & 4096) != 0 ? null : bool4, (i12 & 8192) != 0 ? null : widgetSize, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : nextAction, (i12 & 32768) != 0 ? Boolean.FALSE : bool5, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : sortDirection, (i12 & 131072) != 0 ? null : list2, (i12 & 262144) != 0 ? null : bool6, (i12 & 524288) != 0 ? null : num, (i12 & 1048576) != 0 ? null : list3, (i12 & 2097152) != 0 ? null : num2, (i12 & 4194304) != 0 ? null : displayingImageParams, (i12 & 8388608) != 0 ? null : str8, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? Boolean.FALSE : bool7, (i12 & 33554432) != 0 ? null : hint, (i12 & 67108864) != 0 ? null : list4, (i12 & 134217728) != 0 ? null : num3, (i12 & 268435456) != 0 ? null : str9, (i12 & 536870912) != 0 ? null : theme, (i12 & 1073741824) != 0 ? null : bool8, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : str10, (i13 & 1) != 0 ? null : str11, (i13 & 2) != 0 ? null : str12, (i13 & 4) != 0 ? null : displaying, (i13 & 8) != 0 ? null : multiThemeIcon, (i13 & 16) != 0 ? null : list5, (i13 & 32) != 0 ? null : list6, (i13 & 64) != 0 ? null : num4, (i13 & 128) != 0 ? null : num5, (i13 & 256) != 0 ? null : num6, (i13 & 512) != 0 ? null : num7, (i13 & 1024) != 0 ? null : bool9, (i13 & 2048) != 0 ? null : deepLink, (i13 & 4096) != 0 ? null : autoShowPresetFiltersDialog, (i13 & 8192) != 0 ? null : configWidgetType, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : configCalendarSelectionType, (i13 & 32768) != 0 ? null : flexSearchDateConfig, (i13 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? Boolean.FALSE : bool10, (i13 & 131072) != 0 ? null : list7, (i13 & 262144) != 0 ? null : bool11);
        }
    }

    /* compiled from: InlineFilters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Filter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Filter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Boolean boolValueOf2;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            Widget widgetCreateFromParcel = parcel.readInt() == 0 ? null : Widget.CREATOR.createFromParcel(parcel);
            Payload payloadCreateFromParcel = parcel.readInt() == 0 ? null : Payload.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            InlineFilterValue inlineFilterValue = (InlineFilterValue) parcel.readParcelable(Filter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(InnerOptions.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = a.c(InnerOptions.Options.CREATOR, parcel, arrayList5, iC3, 1);
                    i13 = i13;
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                arrayList4 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                int iC4 = 0;
                while (iC4 != i14) {
                    iC4 = a.c(Filter.CREATOR, parcel, arrayList6, iC4, 1);
                    i14 = i14;
                    arrayList2 = arrayList2;
                }
                arrayList3 = arrayList2;
                arrayList4 = arrayList6;
            }
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Filter(lValueOf, string, widgetCreateFromParcel, payloadCreateFromParcel, string2, string3, string4, boolValueOf, inlineFilterValue, arrayList, arrayList3, arrayList4, string5, boolValueOf2, (AttributedText) parcel.readParcelable(Filter.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Filter[] newArray(int i12) {
            return new Filter[i12];
        }
    }

    /* compiled from: InlineFilters.kt */
    @d
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b$\u0010%J\u001e\u0010&\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ¦\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b0\u0010+J \u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b5\u00106R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b\u0007\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b=\u0010\u0019R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b@\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bA\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bC\u0010#R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bE\u0010%R(\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010>\u001a\u0004\bF\u0010\u001f¨\u0006G"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$Displaying;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/search/Filter$Onboarding;", "onboarding", "", "error", "", "isRequired", "preventClose", "buttonTitle", "", "Lcom/avito/android/remote/model/category_parameters/ClearanceValue;", "clearanceValues", "bottomSheetStyle", "itemsStyle", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "mapping", "", "monthLimit", "groupedMultiselectIds", "<init>", "(Lcom/avito/android/remote/model/search/Filter$Onboarding;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;Ljava/lang/Integer;Ljava/util/List;)V", "component1", "()Lcom/avito/android/remote/model/search/Filter$Onboarding;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "()Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "component10", "()Ljava/lang/Integer;", "component11", "copy", "(Lcom/avito/android/remote/model/search/Filter$Onboarding;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$FilterMapping;Ljava/lang/Integer;Ljava/util/List;)Lcom/avito/android/remote/model/search/Filter$Displaying;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/search/Filter$Onboarding;", "getOnboarding", "Ljava/lang/String;", "getError", "Ljava/lang/Boolean;", "getPreventClose", "getButtonTitle", "Ljava/util/List;", "getClearanceValues", "getBottomSheetStyle", "getItemsStyle", "Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "getMapping", "Ljava/lang/Integer;", "getMonthLimit", "getGroupedMultiselectIds", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Displaying implements Parcelable {

        @k
        public static final Parcelable.Creator<Displaying> CREATOR = new Creator();

        @c("bottomSheetStyle")
        @l
        private final String bottomSheetStyle;

        @c("buttonTitle")
        @l
        private final String buttonTitle;

        @c("clearanceValues")
        @l
        private final List<ClearanceValue> clearanceValues;

        @c("error")
        @l
        private final String error;

        @c("checkboxGroups")
        @l
        private final List<List<String>> groupedMultiselectIds;

        @c("isRequired")
        @l
        private final Boolean isRequired;

        @c("itemsStyle")
        @l
        private final String itemsStyle;

        @c("mapping")
        @l
        private final FilterMapping mapping;

        @c("monthLimit")
        @l
        private final Integer monthLimit;

        @c("onboarding")
        @l
        private final Onboarding onboarding;

        @c("preventClose")
        @l
        private final Boolean preventClose;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Displaying> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Displaying createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                Onboarding onboardingCreateFromParcel = parcel.readInt() == 0 ? null : Onboarding.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(ClearanceValue.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                FilterMapping filterMappingCreateFromParcel = parcel.readInt() == 0 ? null : FilterMapping.CREATOR.createFromParcel(parcel);
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i13 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        arrayList3.add(parcel.createStringArrayList());
                    }
                    arrayList2 = arrayList3;
                }
                return new Displaying(onboardingCreateFromParcel, string, boolValueOf, boolValueOf2, string2, arrayList, string3, string4, filterMappingCreateFromParcel, numValueOf, arrayList2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Displaying[] newArray(int i12) {
                return new Displaying[i12];
            }
        }

        public Displaying() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Onboarding getOnboarding() {
            return this.onboarding;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final Integer getMonthLimit() {
            return this.monthLimit;
        }

        @l
        public final List<List<String>> component11() {
            return this.groupedMultiselectIds;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getIsRequired() {
            return this.isRequired;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Boolean getPreventClose() {
            return this.preventClose;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        public final List<ClearanceValue> component6() {
            return this.clearanceValues;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getBottomSheetStyle() {
            return this.bottomSheetStyle;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final String getItemsStyle() {
            return this.itemsStyle;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final FilterMapping getMapping() {
            return this.mapping;
        }

        @k
        public final Displaying copy(@l Onboarding onboarding, @l String error, @l Boolean isRequired, @l Boolean preventClose, @l String buttonTitle, @l List<ClearanceValue> clearanceValues, @l String bottomSheetStyle, @l String itemsStyle, @l FilterMapping mapping, @l Integer monthLimit, @l List<? extends List<String>> groupedMultiselectIds) {
            return new Displaying(onboarding, error, isRequired, preventClose, buttonTitle, clearanceValues, bottomSheetStyle, itemsStyle, mapping, monthLimit, groupedMultiselectIds);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Displaying)) {
                return false;
            }
            Displaying displaying = (Displaying) other;
            return L.f(this.onboarding, displaying.onboarding) && L.f(this.error, displaying.error) && L.f(this.isRequired, displaying.isRequired) && L.f(this.preventClose, displaying.preventClose) && L.f(this.buttonTitle, displaying.buttonTitle) && L.f(this.clearanceValues, displaying.clearanceValues) && L.f(this.bottomSheetStyle, displaying.bottomSheetStyle) && L.f(this.itemsStyle, displaying.itemsStyle) && L.f(this.mapping, displaying.mapping) && L.f(this.monthLimit, displaying.monthLimit) && L.f(this.groupedMultiselectIds, displaying.groupedMultiselectIds);
        }

        @l
        public final String getBottomSheetStyle() {
            return this.bottomSheetStyle;
        }

        @l
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        public final List<ClearanceValue> getClearanceValues() {
            return this.clearanceValues;
        }

        @l
        public final String getError() {
            return this.error;
        }

        @l
        public final List<List<String>> getGroupedMultiselectIds() {
            return this.groupedMultiselectIds;
        }

        @l
        public final String getItemsStyle() {
            return this.itemsStyle;
        }

        @l
        public final FilterMapping getMapping() {
            return this.mapping;
        }

        @l
        public final Integer getMonthLimit() {
            return this.monthLimit;
        }

        @l
        public final Onboarding getOnboarding() {
            return this.onboarding;
        }

        @l
        public final Boolean getPreventClose() {
            return this.preventClose;
        }

        public int hashCode() {
            Onboarding onboarding = this.onboarding;
            int iHashCode = (onboarding == null ? 0 : onboarding.hashCode()) * 31;
            String str = this.error;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isRequired;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.preventClose;
            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str2 = this.buttonTitle;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<ClearanceValue> list = this.clearanceValues;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.bottomSheetStyle;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.itemsStyle;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            FilterMapping filterMapping = this.mapping;
            int iHashCode9 = (iHashCode8 + (filterMapping == null ? 0 : filterMapping.hashCode())) * 31;
            Integer num = this.monthLimit;
            int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
            List<List<String>> list2 = this.groupedMultiselectIds;
            return iHashCode10 + (list2 != null ? list2.hashCode() : 0);
        }

        @l
        public final Boolean isRequired() {
            return this.isRequired;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Displaying(onboarding=");
            sb2.append(this.onboarding);
            sb2.append(", error=");
            sb2.append(this.error);
            sb2.append(", isRequired=");
            sb2.append(this.isRequired);
            sb2.append(", preventClose=");
            sb2.append(this.preventClose);
            sb2.append(", buttonTitle=");
            sb2.append(this.buttonTitle);
            sb2.append(", clearanceValues=");
            sb2.append(this.clearanceValues);
            sb2.append(", bottomSheetStyle=");
            sb2.append(this.bottomSheetStyle);
            sb2.append(", itemsStyle=");
            sb2.append(this.itemsStyle);
            sb2.append(", mapping=");
            sb2.append(this.mapping);
            sb2.append(", monthLimit=");
            sb2.append(this.monthLimit);
            sb2.append(", groupedMultiselectIds=");
            return H.p(sb2, this.groupedMultiselectIds, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Onboarding onboarding = this.onboarding;
            if (onboarding == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                onboarding.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.error);
            Boolean bool = this.isRequired;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            Boolean bool2 = this.preventClose;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool2);
            }
            parcel.writeString(this.buttonTitle);
            List<ClearanceValue> list = this.clearanceValues;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((ClearanceValue) itA.next()).writeToParcel(parcel, flags);
                }
            }
            parcel.writeString(this.bottomSheetStyle);
            parcel.writeString(this.itemsStyle);
            FilterMapping filterMapping = this.mapping;
            if (filterMapping == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                filterMapping.writeToParcel(parcel, flags);
            }
            Integer num = this.monthLimit;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            List<List<String>> list2 = this.groupedMultiselectIds;
            if (list2 == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeStringList((List) itA2.next());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Displaying(@l Onboarding onboarding, @l String str, @l Boolean bool, @l Boolean bool2, @l String str2, @l List<ClearanceValue> list, @l String str3, @l String str4, @l FilterMapping filterMapping, @l Integer num, @l List<? extends List<String>> list2) {
            this.onboarding = onboarding;
            this.error = str;
            this.isRequired = bool;
            this.preventClose = bool2;
            this.buttonTitle = str2;
            this.clearanceValues = list;
            this.bottomSheetStyle = str3;
            this.itemsStyle = str4;
            this.mapping = filterMapping;
            this.monthLimit = num;
            this.groupedMultiselectIds = list2;
        }

        public /* synthetic */ Displaying(Onboarding onboarding, String str, Boolean bool, Boolean bool2, String str2, List list, String str3, String str4, FilterMapping filterMapping, Integer num, List list2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : onboarding, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? Boolean.FALSE : bool, (i12 & 8) != 0 ? Boolean.FALSE : bool2, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : list, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : filterMapping, (i12 & 512) != 0 ? null : num, (i12 & 1024) == 0 ? list2 : null);
        }
    }

    /* compiled from: InlineFilters.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$Field;", "Landroid/os/Parcelable;", "", "id", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/search/Filter$Field;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Field implements Parcelable {

        @k
        public static final Parcelable.Creator<Field> CREATOR = new Creator();

        @c("id")
        @k
        private final String id;

        @c("value")
        @k
        private final String value;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Field> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Field createFromParcel(@k Parcel parcel) {
                return new Field(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Field[] newArray(int i12) {
                return new Field[i12];
            }
        }

        public Field(@k String str, @k String str2) {
            this.id = str;
            this.value = str2;
        }

        public static /* synthetic */ Field copy$default(Field field, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = field.id;
            }
            if ((i12 & 2) != 0) {
                str2 = field.value;
            }
            return field.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @k
        public final Field copy(@k String id2, @k String value) {
            return new Field(id2, value);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Field)) {
                return false;
            }
            Field field = (Field) other;
            return L.f(this.id, field.id) && L.f(this.value, field.value);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @k
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.id.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Field(id=");
            sb2.append(this.id);
            sb2.append(", value=");
            return C22026a.c(sb2, this.value, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.value);
        }
    }

    /* compiled from: InlineFilters.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "Landroid/os/Parcelable;", "", "inSearch", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/search/Filter$FilterMapping;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getInSearch", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FilterMapping implements Parcelable {

        @k
        public static final Parcelable.Creator<FilterMapping> CREATOR = new Creator();

        @c("inSearch")
        @l
        private final String inSearch;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FilterMapping> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FilterMapping createFromParcel(@k Parcel parcel) {
                return new FilterMapping(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FilterMapping[] newArray(int i12) {
                return new FilterMapping[i12];
            }
        }

        public FilterMapping(@l String str) {
            this.inSearch = str;
        }

        public static /* synthetic */ FilterMapping copy$default(FilterMapping filterMapping, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = filterMapping.inSearch;
            }
            return filterMapping.copy(str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getInSearch() {
            return this.inSearch;
        }

        @k
        public final FilterMapping copy(@l String inSearch) {
            return new FilterMapping(inSearch);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FilterMapping) && L.f(this.inSearch, ((FilterMapping) other).inSearch);
        }

        @l
        public final String getInSearch() {
            return this.inSearch;
        }

        public int hashCode() {
            String str = this.inSearch;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("FilterMapping(inSearch="), this.inSearch, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.inSearch);
        }
    }

    /* compiled from: InlineFilters.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\nJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$FlexSearchDateConfig;", "Landroid/os/Parcelable;", "", "defaultValue", "", "Lcom/avito/android/remote/model/search/Filter$FlexSearchDateConfig$FlexSearchDateOption;", "values", "<init>", "(ILjava/util/List;)V", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/avito/android/remote/model/search/Filter$FlexSearchDateConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getDefaultValue", "Ljava/util/List;", "getValues", "FlexSearchDateOption", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class FlexSearchDateConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<FlexSearchDateConfig> CREATOR = new Creator();

        @c("defaultValue")
        private final int defaultValue;

        @c("values")
        @k
        private final List<FlexSearchDateOption> values;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FlexSearchDateConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FlexSearchDateConfig createFromParcel(@k Parcel parcel) {
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = a.c(FlexSearchDateOption.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new FlexSearchDateConfig(i12, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FlexSearchDateConfig[] newArray(int i12) {
                return new FlexSearchDateConfig[i12];
            }
        }

        /* compiled from: InlineFilters.kt */
        @d
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bJ \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u0007\u0010\u000f¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$FlexSearchDateConfig$FlexSearchDateOption;", "Landroid/os/Parcelable;", "", "id", "", "title", "", "isSelected", "<init>", "(ILjava/lang/String;Z)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(ILjava/lang/String;Z)Lcom/avito/android/remote/model/search/Filter$FlexSearchDateConfig$FlexSearchDateOption;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/String;", "getTitle", "Z", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FlexSearchDateOption implements Parcelable {

            @k
            public static final Parcelable.Creator<FlexSearchDateOption> CREATOR = new Creator();

            @c("id")
            private final int id;

            @c("isSelected")
            private final boolean isSelected;

            @c("title")
            @k
            private final String title;

            /* compiled from: InlineFilters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<FlexSearchDateOption> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final FlexSearchDateOption createFromParcel(@k Parcel parcel) {
                    return new FlexSearchDateOption(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final FlexSearchDateOption[] newArray(int i12) {
                    return new FlexSearchDateOption[i12];
                }
            }

            public FlexSearchDateOption(int i12, @k String str, boolean z12) {
                this.id = i12;
                this.title = str;
                this.isSelected = z12;
            }

            public static /* synthetic */ FlexSearchDateOption copy$default(FlexSearchDateOption flexSearchDateOption, int i12, String str, boolean z12, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i12 = flexSearchDateOption.id;
                }
                if ((i13 & 2) != 0) {
                    str = flexSearchDateOption.title;
                }
                if ((i13 & 4) != 0) {
                    z12 = flexSearchDateOption.isSelected;
                }
                return flexSearchDateOption.copy(i12, str, z12);
            }

            /* renamed from: component1, reason: from getter */
            public final int getId() {
                return this.id;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @k
            public final FlexSearchDateOption copy(int id2, @k String title, boolean isSelected) {
                return new FlexSearchDateOption(id2, title, isSelected);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FlexSearchDateOption)) {
                    return false;
                }
                FlexSearchDateOption flexSearchDateOption = (FlexSearchDateOption) other;
                return this.id == flexSearchDateOption.id && L.f(this.title, flexSearchDateOption.title) && this.isSelected == flexSearchDateOption.isSelected;
            }

            public final int getId() {
                return this.id;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isSelected) + H.d(Integer.hashCode(this.id) * 31, 31, this.title);
            }

            public final boolean isSelected() {
                return this.isSelected;
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("FlexSearchDateOption(id=");
                sb2.append(this.id);
                sb2.append(", title=");
                sb2.append(this.title);
                sb2.append(", isSelected=");
                return r.x(sb2, this.isSelected, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(this.id);
                parcel.writeString(this.title);
                parcel.writeInt(this.isSelected ? 1 : 0);
            }
        }

        public FlexSearchDateConfig(int i12, @k List<FlexSearchDateOption> list) {
            this.defaultValue = i12;
            this.values = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FlexSearchDateConfig copy$default(FlexSearchDateConfig flexSearchDateConfig, int i12, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = flexSearchDateConfig.defaultValue;
            }
            if ((i13 & 2) != 0) {
                list = flexSearchDateConfig.values;
            }
            return flexSearchDateConfig.copy(i12, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDefaultValue() {
            return this.defaultValue;
        }

        @k
        public final List<FlexSearchDateOption> component2() {
            return this.values;
        }

        @k
        public final FlexSearchDateConfig copy(int defaultValue, @k List<FlexSearchDateOption> values) {
            return new FlexSearchDateConfig(defaultValue, values);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FlexSearchDateConfig)) {
                return false;
            }
            FlexSearchDateConfig flexSearchDateConfig = (FlexSearchDateConfig) other;
            return this.defaultValue == flexSearchDateConfig.defaultValue && L.f(this.values, flexSearchDateConfig.values);
        }

        public final int getDefaultValue() {
            return this.defaultValue;
        }

        @k
        public final List<FlexSearchDateOption> getValues() {
            return this.values;
        }

        public int hashCode() {
            return this.values.hashCode() + (Integer.hashCode(this.defaultValue) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FlexSearchDateConfig(defaultValue=");
            sb2.append(this.defaultValue);
            sb2.append(", values=");
            return H.p(sb2, this.values, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.defaultValue);
            Iterator itJ = C0.j(this.values, parcel);
            while (itJ.hasNext()) {
                ((FlexSearchDateOption) itJ.next()).writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: InlineFilters.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$Hint;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUrl", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Hint implements Parcelable {

        @k
        public static final Parcelable.Creator<Hint> CREATOR = new Creator();

        @c("title")
        @l
        private final String title;

        @c(ContextActionHandler.Link.URL)
        @l
        private final DeepLink url;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Hint> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Hint createFromParcel(@k Parcel parcel) {
                return new Hint(parcel.readString(), (DeepLink) parcel.readParcelable(Hint.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Hint[] newArray(int i12) {
                return new Hint[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Hint() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final DeepLink getUrl() {
            return this.url;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.url, flags);
        }

        public Hint(@l String str, @l DeepLink deepLink) {
            this.title = str;
            this.url = deepLink;
        }

        public /* synthetic */ Hint(String str, DeepLink deepLink, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : deepLink);
        }
    }

    /* compiled from: InlineFilters.kt */
    @d
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\r¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$MultiThemeIcon;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", Constants.NORMAL, "selected", "Lcom/avito/android/remote/model/Size;", "size", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/Size;)V", "component1", "()Lcom/avito/android/remote/model/UniversalImage;", "component2", "component3", "()Lcom/avito/android/remote/model/Size;", "copy", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/Size;)Lcom/avito/android/remote/model/search/Filter$MultiThemeIcon;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getNormal", "getSelected", "Lcom/avito/android/remote/model/Size;", "getSize", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MultiThemeIcon implements Parcelable {

        @k
        public static final Parcelable.Creator<MultiThemeIcon> CREATOR = new Creator();

        @c(Constants.NORMAL)
        @k
        private final UniversalImage normal;

        @c("selected")
        @k
        private final UniversalImage selected;

        @c("size")
        @k
        private final Size size;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MultiThemeIcon> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MultiThemeIcon createFromParcel(@k Parcel parcel) {
                return new MultiThemeIcon((UniversalImage) parcel.readParcelable(MultiThemeIcon.class.getClassLoader()), (UniversalImage) parcel.readParcelable(MultiThemeIcon.class.getClassLoader()), (Size) parcel.readParcelable(MultiThemeIcon.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final MultiThemeIcon[] newArray(int i12) {
                return new MultiThemeIcon[i12];
            }
        }

        public MultiThemeIcon(@k UniversalImage universalImage, @k UniversalImage universalImage2, @k Size size) {
            this.normal = universalImage;
            this.selected = universalImage2;
            this.size = size;
        }

        public static /* synthetic */ MultiThemeIcon copy$default(MultiThemeIcon multiThemeIcon, UniversalImage universalImage, UniversalImage universalImage2, Size size, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalImage = multiThemeIcon.normal;
            }
            if ((i12 & 2) != 0) {
                universalImage2 = multiThemeIcon.selected;
            }
            if ((i12 & 4) != 0) {
                size = multiThemeIcon.size;
            }
            return multiThemeIcon.copy(universalImage, universalImage2, size);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final UniversalImage getNormal() {
            return this.normal;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UniversalImage getSelected() {
            return this.selected;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final Size getSize() {
            return this.size;
        }

        @k
        public final MultiThemeIcon copy(@k UniversalImage normal, @k UniversalImage selected, @k Size size) {
            return new MultiThemeIcon(normal, selected, size);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiThemeIcon)) {
                return false;
            }
            MultiThemeIcon multiThemeIcon = (MultiThemeIcon) other;
            return L.f(this.normal, multiThemeIcon.normal) && L.f(this.selected, multiThemeIcon.selected) && L.f(this.size, multiThemeIcon.size);
        }

        @k
        public final UniversalImage getNormal() {
            return this.normal;
        }

        @k
        public final UniversalImage getSelected() {
            return this.selected;
        }

        @k
        public final Size getSize() {
            return this.size;
        }

        public int hashCode() {
            return this.size.hashCode() + a.a(this.normal.hashCode() * 31, 31, this.selected);
        }

        @k
        public String toString() {
            return "MultiThemeIcon(normal=" + this.normal + ", selected=" + this.selected + ", size=" + this.size + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.normal, flags);
            parcel.writeParcelable(this.selected, flags);
            parcel.writeParcelable(this.size, flags);
        }
    }

    /* compiled from: InlineFilters.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$NextAction;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/search/NextActionType;", "type", "", "focusField", "<init>", "(Lcom/avito/android/remote/model/search/NextActionType;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/search/NextActionType;", "getType", "()Lcom/avito/android/remote/model/search/NextActionType;", "Ljava/lang/String;", "getFocusField", "()Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NextAction implements Parcelable {

        @k
        public static final Parcelable.Creator<NextAction> CREATOR = new Creator();

        @c("focusField")
        @l
        private final String focusField;

        @c("type")
        @l
        private final NextActionType type;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NextAction> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NextAction createFromParcel(@k Parcel parcel) {
                return new NextAction(parcel.readInt() == 0 ? null : NextActionType.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NextAction[] newArray(int i12) {
                return new NextAction[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NextAction() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getFocusField() {
            return this.focusField;
        }

        @l
        public final NextActionType getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            NextActionType nextActionType = this.type;
            if (nextActionType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(nextActionType.name());
            }
            parcel.writeString(this.focusField);
        }

        public NextAction(@l NextActionType nextActionType, @l String str) {
            this.type = nextActionType;
            this.focusField = str;
        }

        public /* synthetic */ NextAction(NextActionType nextActionType, String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : nextActionType, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: InlineFilters.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u00010BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b-\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0015¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$Onboarding;", "Landroid/os/Parcelable;", "", "priority", "", "title", "text", "buttonTitle", "onceShowId", "Lcom/avito/android/remote/model/search/Filter$Onboarding$OnTapAction;", "onTapAction", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$Onboarding$OnTapAction;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/search/Filter$Onboarding$OnTapAction;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$Onboarding$OnTapAction;)Lcom/avito/android/remote/model/search/Filter$Onboarding;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getPriority", "Ljava/lang/String;", "getTitle", "getText", "getButtonTitle", "getOnceShowId", "Lcom/avito/android/remote/model/search/Filter$Onboarding$OnTapAction;", "getOnTapAction", "OnTapAction", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Onboarding implements Parcelable {

        @k
        public static final Parcelable.Creator<Onboarding> CREATOR = new Creator();

        @c("buttonTitle")
        @l
        private final String buttonTitle;

        @c("onTapAction")
        @l
        private final OnTapAction onTapAction;

        @c("onceShowId")
        @l
        private final String onceShowId;

        @c("priority")
        @l
        private final Integer priority;

        @c("text")
        @l
        private final String text;

        @c("title")
        @l
        private final String title;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Onboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Onboarding createFromParcel(@k Parcel parcel) {
                return new Onboarding(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? OnTapAction.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Onboarding[] newArray(int i12) {
                return new Onboarding[i12];
            }
        }

        /* compiled from: InlineFilters.kt */
        @d
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/search/Filter$Onboarding$OnTapAction;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "nextOnboardingId", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)Lcom/avito/android/remote/model/search/Filter$Onboarding$OnTapAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Ljava/lang/String;", "getNextOnboardingId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OnTapAction implements Parcelable {

            @k
            public static final Parcelable.Creator<OnTapAction> CREATOR = new Creator();

            @c(ContextActionHandler.Link.DEEPLINK)
            @l
            private final DeepLink deeplink;

            @c("nextOnboardingId")
            @l
            private final String nextOnboardingId;

            /* compiled from: InlineFilters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OnTapAction> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OnTapAction createFromParcel(@k Parcel parcel) {
                    return new OnTapAction((DeepLink) parcel.readParcelable(OnTapAction.class.getClassLoader()), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OnTapAction[] newArray(int i12) {
                    return new OnTapAction[i12];
                }
            }

            public OnTapAction(@l DeepLink deepLink, @l String str) {
                this.deeplink = deepLink;
                this.nextOnboardingId = str;
            }

            public static /* synthetic */ OnTapAction copy$default(OnTapAction onTapAction, DeepLink deepLink, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    deepLink = onTapAction.deeplink;
                }
                if ((i12 & 2) != 0) {
                    str = onTapAction.nextOnboardingId;
                }
                return onTapAction.copy(deepLink, str);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final DeepLink getDeeplink() {
                return this.deeplink;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getNextOnboardingId() {
                return this.nextOnboardingId;
            }

            @k
            public final OnTapAction copy(@l DeepLink deeplink, @l String nextOnboardingId) {
                return new OnTapAction(deeplink, nextOnboardingId);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OnTapAction)) {
                    return false;
                }
                OnTapAction onTapAction = (OnTapAction) other;
                return L.f(this.deeplink, onTapAction.deeplink) && L.f(this.nextOnboardingId, onTapAction.nextOnboardingId);
            }

            @l
            public final DeepLink getDeeplink() {
                return this.deeplink;
            }

            @l
            public final String getNextOnboardingId() {
                return this.nextOnboardingId;
            }

            public int hashCode() {
                DeepLink deepLink = this.deeplink;
                int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
                String str = this.nextOnboardingId;
                return iHashCode + (str != null ? str.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("OnTapAction(deeplink=");
                sb2.append(this.deeplink);
                sb2.append(", nextOnboardingId=");
                return C22026a.c(sb2, this.nextOnboardingId, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.deeplink, flags);
                parcel.writeString(this.nextOnboardingId);
            }
        }

        public Onboarding() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ Onboarding copy$default(Onboarding onboarding, Integer num, String str, String str2, String str3, String str4, OnTapAction onTapAction, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                num = onboarding.priority;
            }
            if ((i12 & 2) != 0) {
                str = onboarding.title;
            }
            String str5 = str;
            if ((i12 & 4) != 0) {
                str2 = onboarding.text;
            }
            String str6 = str2;
            if ((i12 & 8) != 0) {
                str3 = onboarding.buttonTitle;
            }
            String str7 = str3;
            if ((i12 & 16) != 0) {
                str4 = onboarding.onceShowId;
            }
            String str8 = str4;
            if ((i12 & 32) != 0) {
                onTapAction = onboarding.onTapAction;
            }
            return onboarding.copy(num, str5, str6, str7, str8, onTapAction);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Integer getPriority() {
            return this.priority;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final OnTapAction getOnTapAction() {
            return this.onTapAction;
        }

        @k
        public final Onboarding copy(@l Integer priority, @l String title, @l String text, @l String buttonTitle, @l String onceShowId, @l OnTapAction onTapAction) {
            return new Onboarding(priority, title, text, buttonTitle, onceShowId, onTapAction);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) other;
            return L.f(this.priority, onboarding.priority) && L.f(this.title, onboarding.title) && L.f(this.text, onboarding.text) && L.f(this.buttonTitle, onboarding.buttonTitle) && L.f(this.onceShowId, onboarding.onceShowId) && L.f(this.onTapAction, onboarding.onTapAction);
        }

        @l
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        public final OnTapAction getOnTapAction() {
            return this.onTapAction;
        }

        @l
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        @l
        public final Integer getPriority() {
            return this.priority;
        }

        @l
        public final String getText() {
            return this.text;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Integer num = this.priority;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.text;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.buttonTitle;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.onceShowId;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            OnTapAction onTapAction = this.onTapAction;
            return iHashCode5 + (onTapAction != null ? onTapAction.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Onboarding(priority=" + this.priority + ", title=" + this.title + ", text=" + this.text + ", buttonTitle=" + this.buttonTitle + ", onceShowId=" + this.onceShowId + ", onTapAction=" + this.onTapAction + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Integer num = this.priority;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            parcel.writeString(this.title);
            parcel.writeString(this.text);
            parcel.writeString(this.buttonTitle);
            parcel.writeString(this.onceShowId);
            OnTapAction onTapAction = this.onTapAction;
            if (onTapAction == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                onTapAction.writeToParcel(parcel, flags);
            }
        }

        public Onboarding(@l Integer num, @l String str, @l String str2, @l String str3, @l String str4, @l OnTapAction onTapAction) {
            this.priority = num;
            this.title = str;
            this.text = str2;
            this.buttonTitle = str3;
            this.onceShowId = str4;
            this.onTapAction = onTapAction;
        }

        public /* synthetic */ Onboarding(Integer num, String str, String str2, String str3, String str4, OnTapAction onTapAction, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : onTapAction);
        }
    }

    /* compiled from: InlineFilters.kt */
    @d
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$Payload;", "Landroid/os/Parcelable;", "", "saveSearchInHeaderOnScroll", "<init>", "(Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Boolean;)Lcom/avito/android/remote/model/search/Filter$Payload;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getSaveSearchInHeaderOnScroll", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload implements Parcelable {

        @k
        public static final Parcelable.Creator<Payload> CREATOR = new Creator();

        @c("saveSearchInHeaderOnScroll")
        @l
        private final Boolean saveSearchInHeaderOnScroll;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Payload> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Payload createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Payload(boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Payload[] newArray(int i12) {
                return new Payload[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Payload() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Payload copy$default(Payload payload, Boolean bool, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                bool = payload.saveSearchInHeaderOnScroll;
            }
            return payload.copy(bool);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Boolean getSaveSearchInHeaderOnScroll() {
            return this.saveSearchInHeaderOnScroll;
        }

        @k
        public final Payload copy(@l Boolean saveSearchInHeaderOnScroll) {
            return new Payload(saveSearchInHeaderOnScroll);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Payload) && L.f(this.saveSearchInHeaderOnScroll, ((Payload) other).saveSearchInHeaderOnScroll);
        }

        @l
        public final Boolean getSaveSearchInHeaderOnScroll() {
            return this.saveSearchInHeaderOnScroll;
        }

        public int hashCode() {
            Boolean bool = this.saveSearchInHeaderOnScroll;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @k
        public String toString() {
            return C0.g(new StringBuilder("Payload(saveSearchInHeaderOnScroll="), this.saveSearchInHeaderOnScroll, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Boolean bool = this.saveSearchInHeaderOnScroll;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }

        public Payload(@l Boolean bool) {
            this.saveSearchInHeaderOnScroll = bool;
        }

        public /* synthetic */ Payload(Boolean bool, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? Boolean.FALSE : bool);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InlineFilters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$Separator;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Separator {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Separator[] $VALUES;

        @c("top")
        public static final Separator TOP = new Separator("TOP", 0);

        @c("bottom")
        public static final Separator BOTTOM = new Separator("BOTTOM", 1);

        private static final /* synthetic */ Separator[] $values() {
            return new Separator[]{TOP, BOTTOM};
        }

        static {
            Separator[] separatorArr$values = $values();
            $VALUES = separatorArr$values;
            $ENTRIES = kotlin.enums.c.a(separatorArr$values);
        }

        private Separator(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<Separator> getEntries() {
            return $ENTRIES;
        }

        public static Separator valueOf(String str) {
            return (Separator) Enum.valueOf(Separator.class, str);
        }

        public static Separator[] values() {
            return (Separator[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InlineFilters.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$Type;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "IMAGE_LEFT", "IMAGE_RIGHT", "BRANDSPACE", "CANDY", "ND_PROF_SEARCH", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @l
        private final String type;

        @c("imageLeft")
        public static final Type IMAGE_LEFT = new Type("IMAGE_LEFT", 0, "imageLeft");

        @c("imageRight")
        public static final Type IMAGE_RIGHT = new Type("IMAGE_RIGHT", 1, "imageRight");

        @c("brandspace")
        public static final Type BRANDSPACE = new Type("BRANDSPACE", 2, "brandspace");

        @c("candy")
        public static final Type CANDY = new Type("CANDY", 3, "candy");

        @c("ndProfSearch")
        public static final Type ND_PROF_SEARCH = new Type("ND_PROF_SEARCH", 4, "ndProfSearch");

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{IMAGE_LEFT, IMAGE_RIGHT, BRANDSPACE, CANDY, ND_PROF_SEARCH};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = kotlin.enums.c.a(typeArr$values);
        }

        private Type(String str, int i12, String str2) {
            this.type = str2;
        }

        @k
        public static kotlin.enums.a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @l
        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: InlineFilters.kt */
    @d
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0013¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$Value;", "Landroid/os/Parcelable;", "", "value", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(ZLjava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(ZLjava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/search/Filter$Value;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getValue", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Value implements Parcelable {

        @k
        public static final Parcelable.Creator<Value> CREATOR = new Creator();

        @c("image")
        @l
        private final UniversalImage image;

        @c("text")
        @k
        private final AttributedText text;

        @c("title")
        @k
        private final String title;

        @c("value")
        private final boolean value;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Value> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value createFromParcel(@k Parcel parcel) {
                return new Value(parcel.readInt() != 0, parcel.readString(), (AttributedText) parcel.readParcelable(Value.class.getClassLoader()), (UniversalImage) parcel.readParcelable(Value.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value[] newArray(int i12) {
                return new Value[i12];
            }
        }

        public Value(boolean z12, @k String str, @k AttributedText attributedText, @l UniversalImage universalImage) {
            this.value = z12;
            this.title = str;
            this.text = attributedText;
            this.image = universalImage;
        }

        public static /* synthetic */ Value copy$default(Value value, boolean z12, String str, AttributedText attributedText, UniversalImage universalImage, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = value.value;
            }
            if ((i12 & 2) != 0) {
                str = value.title;
            }
            if ((i12 & 4) != 0) {
                attributedText = value.text;
            }
            if ((i12 & 8) != 0) {
                universalImage = value.image;
            }
            return value.copy(z12, str, attributedText, universalImage);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final Value copy(boolean value, @k String title, @k AttributedText text, @l UniversalImage image) {
            return new Value(value, title, text, image);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return this.value == value.value && L.f(this.title, value.title) && L.f(this.text, value.text) && L.f(this.image, value.image);
        }

        @l
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final AttributedText getText() {
            return this.text;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final boolean getValue() {
            return this.value;
        }

        public int hashCode() {
            int iB2 = a.b(H.d(Boolean.hashCode(this.value) * 31, 31, this.title), 31, this.text);
            UniversalImage universalImage = this.image;
            return iB2 + (universalImage == null ? 0 : universalImage.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Value(value=");
            sb2.append(this.value);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", text=");
            sb2.append(this.text);
            sb2.append(", image=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.value ? 1 : 0);
            parcel.writeString(this.title);
            parcel.writeParcelable(this.text, flags);
            parcel.writeParcelable(this.image, flags);
        }
    }

    public Filter(@l Long l12, @l String str, @l Widget widget, @l Payload payload, @l String str2, @l String str3, @l String str4, @l Boolean bool, @l InlineFilterValue inlineFilterValue, @l List<InnerOptions> list, @l List<InnerOptions.Options> list2, @l List<Filter> list3, @l String str5, @l Boolean bool2, @l AttributedText attributedText, boolean z12) {
        this.attrId = l12;
        this.id = str;
        this.widget = widget;
        this.payload = payload;
        this.title = str2;
        this.searchHint = str3;
        this.displayTitle = str4;
        this.isHighlighted = bool;
        this.value = inlineFilterValue;
        this.options = list;
        this.selectedOptions = list2;
        this.filters = list3;
        this.changedParamType = str5;
        this.hasSuggest = bool2;
        this.richTitle = attributedText;
        this.resetAreaOnChange = z12;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Long getAttrId() {
        return this.attrId;
    }

    @l
    public final List<InnerOptions> component10() {
        return this.options;
    }

    @l
    public final List<InnerOptions.Options> component11() {
        return this.selectedOptions;
    }

    @l
    public final List<Filter> component12() {
        return this.filters;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final String getChangedParamType() {
        return this.changedParamType;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final Boolean getHasSuggest() {
        return this.hasSuggest;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final AttributedText getRichTitle() {
        return this.richTitle;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getResetAreaOnChange() {
        return this.resetAreaOnChange;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Widget getWidget() {
        return this.widget;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Payload getPayload() {
        return this.payload;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getSearchHint() {
        return this.searchHint;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getIsHighlighted() {
        return this.isHighlighted;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final InlineFilterValue getValue() {
        return this.value;
    }

    @k
    public final Filter copy(@l Long attrId, @l String id2, @l Widget widget, @l Payload payload, @l String title, @l String searchHint, @l String displayTitle, @l Boolean isHighlighted, @l InlineFilterValue value, @l List<InnerOptions> options, @l List<InnerOptions.Options> selectedOptions, @l List<Filter> filters, @l String changedParamType, @l Boolean hasSuggest, @l AttributedText richTitle, boolean resetAreaOnChange) {
        return new Filter(attrId, id2, widget, payload, title, searchHint, displayTitle, isHighlighted, value, options, selectedOptions, filters, changedParamType, hasSuggest, richTitle, resetAreaOnChange);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Filter)) {
            return false;
        }
        Filter filter = (Filter) other;
        return L.f(this.attrId, filter.attrId) && L.f(this.id, filter.id) && L.f(this.widget, filter.widget) && L.f(this.payload, filter.payload) && L.f(this.title, filter.title) && L.f(this.searchHint, filter.searchHint) && L.f(this.displayTitle, filter.displayTitle) && L.f(this.isHighlighted, filter.isHighlighted) && L.f(this.value, filter.value) && L.f(this.options, filter.options) && L.f(this.selectedOptions, filter.selectedOptions) && L.f(this.filters, filter.filters) && L.f(this.changedParamType, filter.changedParamType) && L.f(this.hasSuggest, filter.hasSuggest) && L.f(this.richTitle, filter.richTitle) && this.resetAreaOnChange == filter.resetAreaOnChange;
    }

    @l
    public final Long getAttrId() {
        return this.attrId;
    }

    @l
    public final String getChangedParamType() {
        return this.changedParamType;
    }

    @l
    public final String getDisplayTitle() {
        return this.displayTitle;
    }

    @l
    public final List<Filter> getFilters() {
        return this.filters;
    }

    @l
    public final Boolean getHasSuggest() {
        return this.hasSuggest;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final List<InnerOptions> getOptions() {
        return this.options;
    }

    @l
    public final Payload getPayload() {
        return this.payload;
    }

    public final boolean getResetAreaOnChange() {
        return this.resetAreaOnChange;
    }

    @l
    public final AttributedText getRichTitle() {
        return this.richTitle;
    }

    @l
    public final String getSearchHint() {
        return this.searchHint;
    }

    @l
    public final List<InnerOptions.Options> getSelectedOptions() {
        return this.selectedOptions;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final InlineFilterValue getValue() {
        return this.value;
    }

    @l
    public final Widget getWidget() {
        return this.widget;
    }

    public int hashCode() {
        Long l12 = this.attrId;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Widget widget = this.widget;
        int iHashCode3 = (iHashCode2 + (widget == null ? 0 : widget.hashCode())) * 31;
        Payload payload = this.payload;
        int iHashCode4 = (iHashCode3 + (payload == null ? 0 : payload.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.searchHint;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayTitle;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isHighlighted;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        InlineFilterValue inlineFilterValue = this.value;
        int iHashCode9 = (iHashCode8 + (inlineFilterValue == null ? 0 : inlineFilterValue.hashCode())) * 31;
        List<InnerOptions> list = this.options;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<InnerOptions.Options> list2 = this.selectedOptions;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Filter> list3 = this.filters;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str5 = this.changedParamType;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.hasSuggest;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AttributedText attributedText = this.richTitle;
        return Boolean.hashCode(this.resetAreaOnChange) + ((iHashCode14 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @l
    public final Boolean isHighlighted() {
        return this.isHighlighted;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Filter(attrId=");
        sb2.append(this.attrId);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", widget=");
        sb2.append(this.widget);
        sb2.append(", payload=");
        sb2.append(this.payload);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", searchHint=");
        sb2.append(this.searchHint);
        sb2.append(", displayTitle=");
        sb2.append(this.displayTitle);
        sb2.append(", isHighlighted=");
        sb2.append(this.isHighlighted);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", selectedOptions=");
        sb2.append(this.selectedOptions);
        sb2.append(", filters=");
        sb2.append(this.filters);
        sb2.append(", changedParamType=");
        sb2.append(this.changedParamType);
        sb2.append(", hasSuggest=");
        sb2.append(this.hasSuggest);
        sb2.append(", richTitle=");
        sb2.append(this.richTitle);
        sb2.append(", resetAreaOnChange=");
        return r.x(sb2, this.resetAreaOnChange, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Long l12 = this.attrId;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.id);
        Widget widget = this.widget;
        if (widget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widget.writeToParcel(parcel, flags);
        }
        Payload payload = this.payload;
        if (payload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            payload.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.searchHint);
        parcel.writeString(this.displayTitle);
        Boolean bool = this.isHighlighted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.value, flags);
        List<InnerOptions> list = this.options;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((InnerOptions) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<InnerOptions.Options> list2 = this.selectedOptions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((InnerOptions.Options) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        List<Filter> list3 = this.filters;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                ((Filter) itA3.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.changedParamType);
        Boolean bool2 = this.hasSuggest;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeParcelable(this.richTitle, flags);
        parcel.writeInt(this.resetAreaOnChange ? 1 : 0);
    }

    /* compiled from: InlineFilters.kt */
    @d
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$OptionsGroup;", "Landroid/os/Parcelable;", "", "", "groupIds", "groupTitle", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getGroupIds", "()Ljava/util/List;", "Ljava/lang/String;", "getGroupTitle", "()Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OptionsGroup implements Parcelable {

        @k
        public static final Parcelable.Creator<OptionsGroup> CREATOR = new Creator();

        @c("groupIds")
        @k
        private final List<String> groupIds;

        @c("groupTitle")
        @l
        private final String groupTitle;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<OptionsGroup> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OptionsGroup createFromParcel(@k Parcel parcel) {
                return new OptionsGroup(parcel.createStringArrayList(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final OptionsGroup[] newArray(int i12) {
                return new OptionsGroup[i12];
            }
        }

        public OptionsGroup(@k List<String> list, @l String str) {
            this.groupIds = list;
            this.groupTitle = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final List<String> getGroupIds() {
            return this.groupIds;
        }

        @l
        public final String getGroupTitle() {
            return this.groupTitle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeStringList(this.groupIds);
            parcel.writeString(this.groupTitle);
        }

        public /* synthetic */ OptionsGroup(List list, String str, int i12, C42822w c42822w) {
            this(list, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: InlineFilters.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001f !B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/search/Filter$InnerOptions;", "Landroid/os/Parcelable;", "", "id", "title", "", "Lcom/avito/android/remote/model/search/Filter$InnerOptions$Options;", "options", "", "default", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getOptions", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getDefault", "()Ljava/lang/Boolean;", "Display", "Options", "State", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class InnerOptions implements Parcelable {

        @k
        public static final Parcelable.Creator<InnerOptions> CREATOR = new Creator();

        @c("default")
        @l
        private final Boolean default;

        @c("id")
        @l
        private final String id;

        @c("options")
        @l
        private final List<Options> options;

        @c("title")
        @l
        private final String title;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InnerOptions> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InnerOptions createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                Boolean boolValueOf = null;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = a.c(Options.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new InnerOptions(string, string2, arrayList, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InnerOptions[] newArray(int i12) {
                return new InnerOptions[i12];
            }
        }

        /* compiled from: InlineFilters.kt */
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001EBa\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jj\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020$HÖ\u0001¢\u0006\u0004\b,\u0010&J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020$HÖ\u0001¢\u0006\u0004\b1\u00102R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010\u0018R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u00109\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010<R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010\u001c\"\u0004\b?\u0010@R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010 ¨\u0006F"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$InnerOptions$Display;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Color;", "color", "", "icon", "Lcom/avito/android/remote/model/search/Filter$Type;", "type", "Lcom/avito/android/remote/model/UniversalImage;", "multiThemeImages", "Lcom/avito/android/remote/model/UniversalCheckedImage;", "image", "", "Lcom/avito/android/remote/model/UniversalColor;", "gradientColors", "Lcom/avito/android/remote/model/search/Filter$InnerOptions$Display$Link;", "link", "<init>", "(Lcom/avito/android/remote/model/Color;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$Type;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalCheckedImage;Ljava/util/List;Lcom/avito/android/remote/model/search/Filter$InnerOptions$Display$Link;)V", "component1", "()Lcom/avito/android/remote/model/Color;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/search/Filter$Type;", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "component5", "()Lcom/avito/android/remote/model/UniversalCheckedImage;", "component6", "()Ljava/util/List;", "component7", "()Lcom/avito/android/remote/model/search/Filter$InnerOptions$Display$Link;", "copy", "(Lcom/avito/android/remote/model/Color;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$Type;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalCheckedImage;Ljava/util/List;Lcom/avito/android/remote/model/search/Filter$InnerOptions$Display$Link;)Lcom/avito/android/remote/model/search/Filter$InnerOptions$Display;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Color;", "getColor", "Ljava/lang/String;", "getIcon", "Lcom/avito/android/remote/model/search/Filter$Type;", "getType", "Lcom/avito/android/remote/model/UniversalImage;", "getMultiThemeImages", "setMultiThemeImages", "(Lcom/avito/android/remote/model/UniversalImage;)V", "Lcom/avito/android/remote/model/UniversalCheckedImage;", "getImage", "setImage", "(Lcom/avito/android/remote/model/UniversalCheckedImage;)V", "Ljava/util/List;", "getGradientColors", "Lcom/avito/android/remote/model/search/Filter$InnerOptions$Display$Link;", "getLink", "Link", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Display implements Parcelable {

            @k
            public static final Parcelable.Creator<Display> CREATOR = new Creator();

            @c("color")
            @l
            private final Color color;

            @c("gradientColors")
            @l
            private final List<UniversalColor> gradientColors;

            @c("icon")
            @l
            private final String icon;

            @c("image")
            @l
            private UniversalCheckedImage image;

            @c("link")
            @l
            private final Link link;

            @c("multiThemeImages")
            @l
            private UniversalImage multiThemeImages;

            @c("type")
            @l
            private final Type type;

            /* compiled from: InlineFilters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Display> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Display createFromParcel(@k Parcel parcel) {
                    ArrayList arrayList;
                    Color color = (Color) parcel.readParcelable(Display.class.getClassLoader());
                    String string = parcel.readString();
                    Type typeValueOf = parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString());
                    UniversalImage universalImage = (UniversalImage) parcel.readParcelable(Display.class.getClassLoader());
                    UniversalCheckedImage universalCheckedImage = (UniversalCheckedImage) parcel.readParcelable(Display.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i12 = parcel.readInt();
                        arrayList = new ArrayList(i12);
                        int iL2 = 0;
                        while (iL2 != i12) {
                            iL2 = a.l(Display.class, parcel, arrayList, iL2, 1);
                        }
                    }
                    return new Display(color, string, typeValueOf, universalImage, universalCheckedImage, arrayList, parcel.readInt() != 0 ? Link.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Display[] newArray(int i12) {
                    return new Display[i12];
                }
            }

            /* compiled from: InlineFilters.kt */
            @d
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$InnerOptions$Display$Link;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Link implements Parcelable {

                @k
                public static final Parcelable.Creator<Link> CREATOR = new Creator();

                @c(TooltipAttribute.PARAM_DEEP_LINK)
                @l
                private final DeepLink deepLink;

                /* compiled from: InlineFilters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Link> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Link createFromParcel(@k Parcel parcel) {
                        return new Link((DeepLink) parcel.readParcelable(Link.class.getClassLoader()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Link[] newArray(int i12) {
                        return new Link[i12];
                    }
                }

                public Link(@l DeepLink deepLink) {
                    this.deepLink = deepLink;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @l
                public final DeepLink getDeepLink() {
                    return this.deepLink;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeParcelable(this.deepLink, flags);
                }
            }

            public Display() {
                this(null, null, null, null, null, null, null, 127, null);
            }

            public static /* synthetic */ Display copy$default(Display display, Color color, String str, Type type, UniversalImage universalImage, UniversalCheckedImage universalCheckedImage, List list, Link link, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    color = display.color;
                }
                if ((i12 & 2) != 0) {
                    str = display.icon;
                }
                String str2 = str;
                if ((i12 & 4) != 0) {
                    type = display.type;
                }
                Type type2 = type;
                if ((i12 & 8) != 0) {
                    universalImage = display.multiThemeImages;
                }
                UniversalImage universalImage2 = universalImage;
                if ((i12 & 16) != 0) {
                    universalCheckedImage = display.image;
                }
                UniversalCheckedImage universalCheckedImage2 = universalCheckedImage;
                if ((i12 & 32) != 0) {
                    list = display.gradientColors;
                }
                List list2 = list;
                if ((i12 & 64) != 0) {
                    link = display.link;
                }
                return display.copy(color, str2, type2, universalImage2, universalCheckedImage2, list2, link);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final Color getColor() {
                return this.color;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final Type getType() {
                return this.type;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final UniversalImage getMultiThemeImages() {
                return this.multiThemeImages;
            }

            @l
            /* renamed from: component5, reason: from getter */
            public final UniversalCheckedImage getImage() {
                return this.image;
            }

            @l
            public final List<UniversalColor> component6() {
                return this.gradientColors;
            }

            @l
            /* renamed from: component7, reason: from getter */
            public final Link getLink() {
                return this.link;
            }

            @k
            public final Display copy(@l Color color, @l String icon, @l Type type, @l UniversalImage multiThemeImages, @l UniversalCheckedImage image, @l List<UniversalColor> gradientColors, @l Link link) {
                return new Display(color, icon, type, multiThemeImages, image, gradientColors, link);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Display)) {
                    return false;
                }
                Display display = (Display) other;
                return L.f(this.color, display.color) && L.f(this.icon, display.icon) && this.type == display.type && L.f(this.multiThemeImages, display.multiThemeImages) && L.f(this.image, display.image) && L.f(this.gradientColors, display.gradientColors) && L.f(this.link, display.link);
            }

            @l
            public final Color getColor() {
                return this.color;
            }

            @l
            public final List<UniversalColor> getGradientColors() {
                return this.gradientColors;
            }

            @l
            public final String getIcon() {
                return this.icon;
            }

            @l
            public final UniversalCheckedImage getImage() {
                return this.image;
            }

            @l
            public final Link getLink() {
                return this.link;
            }

            @l
            public final UniversalImage getMultiThemeImages() {
                return this.multiThemeImages;
            }

            @l
            public final Type getType() {
                return this.type;
            }

            public int hashCode() {
                Color color = this.color;
                int iHashCode = (color == null ? 0 : color.hashCode()) * 31;
                String str = this.icon;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Type type = this.type;
                int iHashCode3 = (iHashCode2 + (type == null ? 0 : type.hashCode())) * 31;
                UniversalImage universalImage = this.multiThemeImages;
                int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
                UniversalCheckedImage universalCheckedImage = this.image;
                int iHashCode5 = (iHashCode4 + (universalCheckedImage == null ? 0 : universalCheckedImage.hashCode())) * 31;
                List<UniversalColor> list = this.gradientColors;
                int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
                Link link = this.link;
                return iHashCode6 + (link != null ? link.hashCode() : 0);
            }

            public final void setImage(@l UniversalCheckedImage universalCheckedImage) {
                this.image = universalCheckedImage;
            }

            public final void setMultiThemeImages(@l UniversalImage universalImage) {
                this.multiThemeImages = universalImage;
            }

            @k
            public String toString() {
                return "Display(color=" + this.color + ", icon=" + this.icon + ", type=" + this.type + ", multiThemeImages=" + this.multiThemeImages + ", image=" + this.image + ", gradientColors=" + this.gradientColors + ", link=" + this.link + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.color, flags);
                parcel.writeString(this.icon);
                Type type = this.type;
                if (type == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(type.name());
                }
                parcel.writeParcelable(this.multiThemeImages, flags);
                parcel.writeParcelable(this.image, flags);
                List<UniversalColor> list = this.gradientColors;
                if (list == null) {
                    parcel.writeInt(0);
                } else {
                    Iterator itA = a.A(list, parcel, 1);
                    while (itA.hasNext()) {
                        parcel.writeParcelable((Parcelable) itA.next(), flags);
                    }
                }
                Link link = this.link;
                if (link == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    link.writeToParcel(parcel, flags);
                }
            }

            public Display(@l Color color, @l String str, @l Type type, @l UniversalImage universalImage, @l UniversalCheckedImage universalCheckedImage, @l List<UniversalColor> list, @l Link link) {
                this.color = color;
                this.icon = str;
                this.type = type;
                this.multiThemeImages = universalImage;
                this.image = universalCheckedImage;
                this.gradientColors = list;
                this.link = link;
            }

            public /* synthetic */ Display(Color color, String str, Type type, UniversalImage universalImage, UniversalCheckedImage universalCheckedImage, List list, Link link, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : color, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : type, (i12 & 8) != 0 ? null : universalImage, (i12 & 16) != 0 ? null : universalCheckedImage, (i12 & 32) != 0 ? null : list, (i12 & 64) != 0 ? null : link);
            }
        }

        /* compiled from: InlineFilters.kt */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b1\u00100R\u0016\u00103\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001eR\u0014\u00105\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u001e¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$InnerOptions$Options;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "optionId", "title", "subtitle", "Lcom/avito/android/remote/model/search/Filter$InnerOptions$State;", "newState", "Lcom/avito/android/remote/model/Image;", "image", "sortParam", "Lcom/avito/android/remote/model/search/Filter$InnerOptions$Display;", "display", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "toInt", "fromInt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$InnerOptions$State;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$InnerOptions$Display;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Integer;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getOptionId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/search/Filter$InnerOptions$State;", "getNewState", "()Lcom/avito/android/remote/model/search/Filter$InnerOptions$State;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "getSortParam", "Lcom/avito/android/remote/model/search/Filter$InnerOptions$Display;", "getDisplay", "()Lcom/avito/android/remote/model/search/Filter$InnerOptions$Display;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Integer;", "getToInt", "()Ljava/lang/Integer;", "getFromInt", "getName", "name", "getId", "id", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class Options implements ParcelableEntity<String> {

            @k
            public static final Parcelable.Creator<Options> CREATOR = new Creator();

            @c(Constants.DEEPLINK)
            @l
            private final DeepLink deeplink;

            @c("display")
            @l
            private final Display display;

            @c("fromInt")
            @l
            private final Integer fromInt;

            @c("images")
            @l
            private final Image image;

            @c("newState")
            @l
            private final State newState;

            @c("id")
            @l
            private final String optionId;

            @c("sortParam")
            @l
            private final String sortParam;

            @c("subtitle")
            @l
            private final String subtitle;

            @c("title")
            @l
            private final String title;

            @c("toInt")
            @l
            private final Integer toInt;

            /* compiled from: InlineFilters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Options> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Options createFromParcel(@k Parcel parcel) {
                    return new Options(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : State.CREATOR.createFromParcel(parcel), (Image) parcel.readParcelable(Options.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Display.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(Options.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Options[] newArray(int i12) {
                    return new Options[i12];
                }
            }

            public Options(@l String str, @l String str2, @l String str3, @l State state, @l Image image, @l String str4, @l Display display, @l DeepLink deepLink, @l Integer num, @l Integer num2) {
                this.optionId = str;
                this.title = str2;
                this.subtitle = str3;
                this.newState = state;
                this.image = image;
                this.sortParam = str4;
                this.display = display;
                this.deeplink = deepLink;
                this.toInt = num;
                this.fromInt = num2;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final DeepLink getDeeplink() {
                return this.deeplink;
            }

            @l
            public final Display getDisplay() {
                return this.display;
            }

            @l
            public final Integer getFromInt() {
                return this.fromInt;
            }

            @l
            public final Image getImage() {
                return this.image;
            }

            @Override // com.avito.android.remote.model.Entity
            @l
            /* renamed from: getName, reason: from getter */
            public String getF259205c() {
                return this.title;
            }

            @l
            public final State getNewState() {
                return this.newState;
            }

            @l
            public final String getOptionId() {
                return this.optionId;
            }

            @l
            public final String getSortParam() {
                return this.sortParam;
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
            public final Integer getToInt() {
                return this.toInt;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.optionId);
                parcel.writeString(this.title);
                parcel.writeString(this.subtitle);
                State state = this.newState;
                if (state == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    state.writeToParcel(parcel, flags);
                }
                parcel.writeParcelable(this.image, flags);
                parcel.writeString(this.sortParam);
                Display display = this.display;
                if (display == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    display.writeToParcel(parcel, flags);
                }
                parcel.writeParcelable(this.deeplink, flags);
                Integer num = this.toInt;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num);
                }
                Integer num2 = this.fromInt;
                if (num2 == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num2);
                }
            }

            @Override // com.avito.android.remote.model.Entity
            @k
            public String getId() {
                return String.valueOf(this.optionId);
            }

            public /* synthetic */ Options(String str, String str2, String str3, State state, Image image, String str4, Display display, DeepLink deepLink, Integer num, Integer num2, int i12, C42822w c42822w) {
                this(str, str2, str3, state, (i12 & 16) != 0 ? null : image, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : display, (i12 & 128) != 0 ? null : deepLink, (i12 & 256) != 0 ? null : num, (i12 & 512) != 0 ? null : num2);
            }
        }

        /* compiled from: InlineFilters.kt */
        @d
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$InnerOptions$State;", "Landroid/os/Parcelable;", "", "displayTitle", "", "isHighlighted", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDisplayTitle", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class State implements Parcelable {

            @k
            public static final Parcelable.Creator<State> CREATOR = new Creator();

            @c("displayTitle")
            @l
            private final String displayTitle;

            @c("isHighlighted")
            @l
            private final Boolean isHighlighted;

            /* compiled from: InlineFilters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<State> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final State createFromParcel(@k Parcel parcel) {
                    Boolean boolValueOf;
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new State(string, boolValueOf);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final State[] newArray(int i12) {
                    return new State[i12];
                }
            }

            public State(@l String str, @l Boolean bool) {
                this.displayTitle = str;
                this.isHighlighted = bool;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final String getDisplayTitle() {
                return this.displayTitle;
            }

            @l
            /* renamed from: isHighlighted, reason: from getter */
            public final Boolean getIsHighlighted() {
                return this.isHighlighted;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.displayTitle);
                Boolean bool = this.isHighlighted;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
            }
        }

        public InnerOptions(@l String str, @l String str2, @l List<Options> list, @l Boolean bool) {
            this.id = str;
            this.title = str2;
            this.options = list;
            this.default = bool;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Boolean getDefault() {
            return this.default;
        }

        @l
        public final String getId() {
            return this.id;
        }

        @l
        public final List<Options> getOptions() {
            return this.options;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            List<Options> list = this.options;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((Options) itA.next()).writeToParcel(parcel, flags);
                }
            }
            Boolean bool = this.default;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }

        public /* synthetic */ InnerOptions(String str, String str2, List list, Boolean bool, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, str2, list, bool);
        }
    }

    /* compiled from: InlineFilters.kt */
    @d
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJd\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020#HÖ\u0001¢\u0006\u0004\b*\u0010%J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020#HÖ\u0001¢\u0006\u0004\b/\u00100R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010\u001dR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010\u001f¨\u0006?"}, d2 = {"Lcom/avito/android/remote/model/search/Filter$Widget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/search/WidgetType;", "type", "", "format", "Lcom/avito/android/remote/model/search/Filter$Config;", Navigation.CONFIG, "Lcom/avito/android/remote/model/search/TooltipInfo;", TooltipAttribute.ATTRIBUTE_TYPE, "Lcom/avito/android/remote/model/search/Layout;", "layout", "", "resetDisabled", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "universalPage", "<init>", "(Lcom/avito/android/remote/model/search/WidgetType;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$Config;Lcom/avito/android/remote/model/search/TooltipInfo;Lcom/avito/android/remote/model/search/Layout;Ljava/lang/Boolean;Lcom/avito/android/beduin_models/BeduinUniversalPageContent;)V", "component1", "()Lcom/avito/android/remote/model/search/WidgetType;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/search/Filter$Config;", "component4", "()Lcom/avito/android/remote/model/search/TooltipInfo;", "component5", "()Lcom/avito/android/remote/model/search/Layout;", "component6", "()Ljava/lang/Boolean;", "component7", "()Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "copy", "(Lcom/avito/android/remote/model/search/WidgetType;Ljava/lang/String;Lcom/avito/android/remote/model/search/Filter$Config;Lcom/avito/android/remote/model/search/TooltipInfo;Lcom/avito/android/remote/model/search/Layout;Ljava/lang/Boolean;Lcom/avito/android/beduin_models/BeduinUniversalPageContent;)Lcom/avito/android/remote/model/search/Filter$Widget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/search/WidgetType;", "getType", "Ljava/lang/String;", "getFormat", "Lcom/avito/android/remote/model/search/Filter$Config;", "getConfig", "Lcom/avito/android/remote/model/search/TooltipInfo;", "getTooltip", "Lcom/avito/android/remote/model/search/Layout;", "getLayout", "Ljava/lang/Boolean;", "getResetDisabled", "Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "getUniversalPage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Widget implements Parcelable {

        @k
        public static final Parcelable.Creator<Widget> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @l
        private final Config config;

        @c("format")
        @l
        private final String format;

        @c("layout")
        @l
        private final Layout layout;

        @c("resetDisabled")
        @l
        private final Boolean resetDisabled;

        @c(TooltipAttribute.ATTRIBUTE_TYPE)
        @l
        private final TooltipInfo tooltip;

        @c("type")
        @l
        private final WidgetType type;

        @c("universalPage")
        @l
        private final BeduinUniversalPageContent universalPage;

        /* compiled from: InlineFilters.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Widget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                WidgetType widgetTypeCreateFromParcel = parcel.readInt() == 0 ? null : WidgetType.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                Config configCreateFromParcel = parcel.readInt() == 0 ? null : Config.CREATOR.createFromParcel(parcel);
                TooltipInfo tooltipInfoCreateFromParcel = parcel.readInt() == 0 ? null : TooltipInfo.CREATOR.createFromParcel(parcel);
                Layout layoutValueOf = parcel.readInt() == 0 ? null : Layout.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Widget(widgetTypeCreateFromParcel, string, configCreateFromParcel, tooltipInfoCreateFromParcel, layoutValueOf, boolValueOf, (BeduinUniversalPageContent) parcel.readParcelable(Widget.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget[] newArray(int i12) {
                return new Widget[i12];
            }
        }

        public Widget(@l WidgetType widgetType, @l String str, @l Config config, @l TooltipInfo tooltipInfo, @l Layout layout, @l Boolean bool, @l BeduinUniversalPageContent beduinUniversalPageContent) {
            this.type = widgetType;
            this.format = str;
            this.config = config;
            this.tooltip = tooltipInfo;
            this.layout = layout;
            this.resetDisabled = bool;
            this.universalPage = beduinUniversalPageContent;
        }

        public static /* synthetic */ Widget copy$default(Widget widget, WidgetType widgetType, String str, Config config, TooltipInfo tooltipInfo, Layout layout, Boolean bool, BeduinUniversalPageContent beduinUniversalPageContent, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                widgetType = widget.type;
            }
            if ((i12 & 2) != 0) {
                str = widget.format;
            }
            String str2 = str;
            if ((i12 & 4) != 0) {
                config = widget.config;
            }
            Config config2 = config;
            if ((i12 & 8) != 0) {
                tooltipInfo = widget.tooltip;
            }
            TooltipInfo tooltipInfo2 = tooltipInfo;
            if ((i12 & 16) != 0) {
                layout = widget.layout;
            }
            Layout layout2 = layout;
            if ((i12 & 32) != 0) {
                bool = widget.resetDisabled;
            }
            Boolean bool2 = bool;
            if ((i12 & 64) != 0) {
                beduinUniversalPageContent = widget.universalPage;
            }
            return widget.copy(widgetType, str2, config2, tooltipInfo2, layout2, bool2, beduinUniversalPageContent);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final WidgetType getType() {
            return this.type;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getFormat() {
            return this.format;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Config getConfig() {
            return this.config;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final TooltipInfo getTooltip() {
            return this.tooltip;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final Layout getLayout() {
            return this.layout;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Boolean getResetDisabled() {
            return this.resetDisabled;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final BeduinUniversalPageContent getUniversalPage() {
            return this.universalPage;
        }

        @k
        public final Widget copy(@l WidgetType type, @l String format, @l Config config, @l TooltipInfo tooltip, @l Layout layout, @l Boolean resetDisabled, @l BeduinUniversalPageContent universalPage) {
            return new Widget(type, format, config, tooltip, layout, resetDisabled, universalPage);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Widget)) {
                return false;
            }
            Widget widget = (Widget) other;
            return this.type == widget.type && L.f(this.format, widget.format) && L.f(this.config, widget.config) && L.f(this.tooltip, widget.tooltip) && this.layout == widget.layout && L.f(this.resetDisabled, widget.resetDisabled) && L.f(this.universalPage, widget.universalPage);
        }

        @l
        public final Config getConfig() {
            return this.config;
        }

        @l
        public final String getFormat() {
            return this.format;
        }

        @l
        public final Layout getLayout() {
            return this.layout;
        }

        @l
        public final Boolean getResetDisabled() {
            return this.resetDisabled;
        }

        @l
        public final TooltipInfo getTooltip() {
            return this.tooltip;
        }

        @l
        public final WidgetType getType() {
            return this.type;
        }

        @l
        public final BeduinUniversalPageContent getUniversalPage() {
            return this.universalPage;
        }

        public int hashCode() {
            WidgetType widgetType = this.type;
            int iHashCode = (widgetType == null ? 0 : widgetType.hashCode()) * 31;
            String str = this.format;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Config config = this.config;
            int iHashCode3 = (iHashCode2 + (config == null ? 0 : config.hashCode())) * 31;
            TooltipInfo tooltipInfo = this.tooltip;
            int iHashCode4 = (iHashCode3 + (tooltipInfo == null ? 0 : tooltipInfo.hashCode())) * 31;
            Layout layout = this.layout;
            int iHashCode5 = (iHashCode4 + (layout == null ? 0 : layout.hashCode())) * 31;
            Boolean bool = this.resetDisabled;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            BeduinUniversalPageContent beduinUniversalPageContent = this.universalPage;
            return iHashCode6 + (beduinUniversalPageContent != null ? beduinUniversalPageContent.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Widget(type=" + this.type + ", format=" + this.format + ", config=" + this.config + ", tooltip=" + this.tooltip + ", layout=" + this.layout + ", resetDisabled=" + this.resetDisabled + ", universalPage=" + this.universalPage + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            WidgetType widgetType = this.type;
            if (widgetType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                widgetType.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.format);
            Config config = this.config;
            if (config == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                config.writeToParcel(parcel, flags);
            }
            TooltipInfo tooltipInfo = this.tooltip;
            if (tooltipInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tooltipInfo.writeToParcel(parcel, flags);
            }
            Layout layout = this.layout;
            if (layout == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(layout.name());
            }
            Boolean bool = this.resetDisabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeParcelable(this.universalPage, flags);
        }

        public /* synthetic */ Widget(WidgetType widgetType, String str, Config config, TooltipInfo tooltipInfo, Layout layout, Boolean bool, BeduinUniversalPageContent beduinUniversalPageContent, int i12, C42822w c42822w) {
            this(widgetType, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : config, (i12 & 8) != 0 ? null : tooltipInfo, (i12 & 16) != 0 ? null : layout, (i12 & 32) != 0 ? null : bool, (i12 & 64) == 0 ? beduinUniversalPageContent : null);
        }
    }

    public /* synthetic */ Filter(Long l12, String str, Widget widget, Payload payload, String str2, String str3, String str4, Boolean bool, InlineFilterValue inlineFilterValue, List list, List list2, List list3, String str5, Boolean bool2, AttributedText attributedText, boolean z12, int i12, C42822w c42822w) {
        this(l12, str, widget, (i12 & 8) != 0 ? null : payload, str2, (i12 & 32) != 0 ? null : str3, str4, bool, inlineFilterValue, list, list2, (i12 & 2048) != 0 ? null : list3, str5, (i12 & 8192) != 0 ? null : bool2, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : attributedText, (i12 & 32768) != 0 ? false : z12);
    }
}
