package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasConstraints;
import com.avito.android.remote.model.category_parameters.base.HasPlaceholder;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.random.f;
import nj0.InterfaceC44435b;
import okhttp3.internal.http2.Http2;

/* compiled from: AddressParameter.kt */
@s0
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b5\b\u0087\b\u0018\u0000 \u0084\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0012\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001BÙ\u0001\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b/\u0010(J\u0010\u00100\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b0\u0010(J\u0012\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b9\u0010-J\u0012\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b:\u00104J\u0012\u0010;\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bC\u00104J\u0012\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bD\u00104J\u0012\u0010E\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bG\u00102J\u0018\u0010H\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"HÆ\u0003¢\u0006\u0004\bH\u0010IJò\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"HÆ\u0001¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\bL\u0010-J\u0010\u0010N\u001a\u00020MHÖ\u0001¢\u0006\u0004\bN\u0010OJ\u001a\u0010R\u001a\u00020\n2\b\u0010Q\u001a\u0004\u0018\u00010PHÖ\u0003¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020MHÖ\u0001¢\u0006\u0004\bT\u0010OJ \u0010Y\u001a\u00020X2\u0006\u0010V\u001a\u00020U2\u0006\u0010W\u001a\u00020MHÖ\u0001¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020)2\u0006\u0010[\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\\\u0010]R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010^\u001a\u0004\b_\u0010-R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010^\u001a\u0004\b`\u0010-R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010a\u001a\u0004\bb\u0010(R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010a\u001a\u0004\bc\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010d\u001a\u0004\be\u00102R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010f\u001a\u0004\bg\u00104R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010h\u001a\u0004\bi\u00106R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010j\u001a\u0004\bk\u00108\"\u0004\bl\u0010mR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010^\u001a\u0004\bn\u0010-R$\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010f\u001a\u0004\b\u0014\u00104\"\u0004\bo\u0010pR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010q\u001a\u0004\br\u0010<\"\u0004\bs\u0010tR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010u\u001a\u0004\bv\u0010>R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010w\u001a\u0004\bx\u0010@R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010y\u001a\u0004\bz\u0010BR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010f\u001a\u0004\b{\u00104R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010f\u001a\u0004\b|\u00104R\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010}\u001a\u0004\b~\u0010FR\u001c\u0010!\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010d\u001a\u0004\b\u007f\u00102R$\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b$\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010IR\u0016\u0010\u0083\u0001\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010-¨\u0006\u008d\u0001"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "Lcom/avito/android/remote/model/category_parameters/base/HasPlaceholder;", "Lcom/avito/android/remote/model/category_parameters/base/HasConstraints;", "", "id", "title", "", "required", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "updatesForm", "Lcom/avito/android/remote/model/category_parameters/SuggestData;", "suggestData", "_value", ChannelContext.Item.PLACEHOLDER, "isAddressesLoaded", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$EmptyValueErrorPlace;", "errorPlace", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", Navigation.DISPLAYING, "Lcom/avito/android/remote/model/category_parameters/AddressParameter$GeoFlowType;", "flowType", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$ValidationRules;", "validationRules", "visible", "phantom", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$Widget;", "widget", "subtitle", "", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/SuggestData;Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/AddressParameter$EmptyValueErrorPlace;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Lcom/avito/android/remote/model/category_parameters/AddressParameter$GeoFlowType;Lcom/avito/android/remote/model/category_parameters/AddressParameter$ValidationRules;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/AddressParameter$Widget;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "hasValue", "()Z", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value$PublishValueSellerAddressData;", "getSelectedValue", "()Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value$PublishValueSellerAddressData;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Ljava/lang/Boolean;", "component7", "()Lcom/avito/android/remote/model/category_parameters/SuggestData;", "component8", "()Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;", "component9", "component10", "component11", "()Lcom/avito/android/remote/model/category_parameters/AddressParameter$EmptyValueErrorPlace;", "component12", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component13", "()Lcom/avito/android/remote/model/category_parameters/AddressParameter$GeoFlowType;", "component14", "()Lcom/avito/android/remote/model/category_parameters/AddressParameter$ValidationRules;", "component15", "component16", "component17", "()Lcom/avito/android/remote/model/category_parameters/AddressParameter$Widget;", "component18", "component19", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/SuggestData;Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/AddressParameter$EmptyValueErrorPlace;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Lcom/avito/android/remote/model/category_parameters/AddressParameter$GeoFlowType;Lcom/avito/android/remote/model/category_parameters/AddressParameter$ValidationRules;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/AddressParameter$Widget;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/AddressParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "addressText", "invalidAddressStub", "(Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value$PublishValueSellerAddressData;", "Ljava/lang/String;", "getId", "getTitle", "Z", "getRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "Lcom/avito/android/remote/model/category_parameters/SuggestData;", "getSuggestData", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;", "get_value", "set_value", "(Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;)V", "getPlaceholder", "setAddressesLoaded", "(Ljava/lang/Boolean;)V", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$EmptyValueErrorPlace;", "getErrorPlace", "setErrorPlace", "(Lcom/avito/android/remote/model/category_parameters/AddressParameter$EmptyValueErrorPlace;)V", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplaying", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$GeoFlowType;", "getFlowType", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$ValidationRules;", "getValidationRules", "getVisible", "getPhantom", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$Widget;", "getWidget", "getSubtitle", "Ljava/util/List;", "getConstraints", "getType", "type", "Companion", "EmptyValueErrorPlace", "GeoFlowType", "InputStyle", "MotivationPosition", "SellerAddresses", "ValidationRules", "Value", "Widget", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes17.dex */
public final /* data */ class AddressParameter extends EditableParameter<Value> implements Visibility, Phantom, HasPlaceholder, HasConstraints {

    @k
    public static final String TYPE = "address";

    @c("value")
    @l
    private Value _value;

    @c("constraints")
    @l
    private final List<Constraint> constraints;

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displaying;

    @c("emptyValueErrorPlace")
    @l
    private EmptyValueErrorPlace errorPlace;

    @c("flowType")
    @l
    private final GeoFlowType flowType;

    @c("id")
    @k
    private final String id;

    @c("immutable")
    private final boolean immutable;

    @c("isAddressesLoaded")
    @l
    private Boolean isAddressesLoaded;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("phantom")
    @l
    private final Boolean phantom;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c("required")
    private final boolean required;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("suggestData")
    @l
    private final SuggestData suggestData;

    @c("title")
    @k
    private final String title;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("validationRules")
    @l
    private final ValidationRules validationRules;

    @c("visible")
    @l
    private final Boolean visible;

    @c("widget")
    @l
    private final Widget widget;

    @k
    public static final Parcelable.Creator<AddressParameter> CREATOR = new Creator();

    /* compiled from: AddressParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddressParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddressParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(AddressParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            SuggestData suggestDataCreateFromParcel = parcel.readInt() == 0 ? null : SuggestData.CREATOR.createFromParcel(parcel);
            Value valueCreateFromParcel = parcel.readInt() == 0 ? null : Value.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            EmptyValueErrorPlace emptyValueErrorPlaceValueOf = parcel.readInt() == 0 ? null : EmptyValueErrorPlace.valueOf(parcel.readString());
            DisplayingOptions displayingOptionsCreateFromParcel = parcel.readInt() == 0 ? null : DisplayingOptions.CREATOR.createFromParcel(parcel);
            GeoFlowType geoFlowTypeValueOf = parcel.readInt() == 0 ? null : GeoFlowType.valueOf(parcel.readString());
            ValidationRules validationRulesCreateFromParcel = parcel.readInt() == 0 ? null : ValidationRules.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Widget widgetCreateFromParcel = parcel.readInt() == 0 ? null : Widget.CREATOR.createFromParcel(parcel);
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(AddressParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(AddressParameter.class, parcel, arrayList2, iL2, 1);
                    i12 = i12;
                }
                arrayList = arrayList2;
            }
            return new AddressParameter(string, string2, z12, z13, attributedText, boolValueOf, suggestDataCreateFromParcel, valueCreateFromParcel, string3, boolValueOf2, emptyValueErrorPlaceValueOf, displayingOptionsCreateFromParcel, geoFlowTypeValueOf, validationRulesCreateFromParcel, boolValueOf3, boolValueOf4, widgetCreateFromParcel, attributedText2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddressParameter[] newArray(int i12) {
            return new AddressParameter[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AddressParameter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$EmptyValueErrorPlace;", "", "(Ljava/lang/String;I)V", "LOCATION_WIDGET", "ADDRESSES_LIST", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EmptyValueErrorPlace {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ EmptyValueErrorPlace[] $VALUES;
        public static final EmptyValueErrorPlace LOCATION_WIDGET = new EmptyValueErrorPlace("LOCATION_WIDGET", 0);
        public static final EmptyValueErrorPlace ADDRESSES_LIST = new EmptyValueErrorPlace("ADDRESSES_LIST", 1);

        private static final /* synthetic */ EmptyValueErrorPlace[] $values() {
            return new EmptyValueErrorPlace[]{LOCATION_WIDGET, ADDRESSES_LIST};
        }

        static {
            EmptyValueErrorPlace[] emptyValueErrorPlaceArr$values = $values();
            $VALUES = emptyValueErrorPlaceArr$values;
            $ENTRIES = kotlin.enums.c.a(emptyValueErrorPlaceArr$values);
        }

        private EmptyValueErrorPlace(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<EmptyValueErrorPlace> getEntries() {
            return $ENTRIES;
        }

        public static EmptyValueErrorPlace valueOf(String str) {
            return (EmptyValueErrorPlace) Enum.valueOf(EmptyValueErrorPlace.class, str);
        }

        public static EmptyValueErrorPlace[] values() {
            return (EmptyValueErrorPlace[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AddressParameter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$GeoFlowType;", "", "(Ljava/lang/String;I)V", "MAP", "SUGGEST", "HISTORICAL_SUGGEST", "SUGGEST_REGION", "SELLER_ADDRESS", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GeoFlowType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ GeoFlowType[] $VALUES;

        @c("map")
        public static final GeoFlowType MAP = new GeoFlowType("MAP", 0);

        @c("suggest")
        public static final GeoFlowType SUGGEST = new GeoFlowType("SUGGEST", 1);

        @c("historicalSuggest")
        public static final GeoFlowType HISTORICAL_SUGGEST = new GeoFlowType("HISTORICAL_SUGGEST", 2);

        @c("suggestRegion")
        public static final GeoFlowType SUGGEST_REGION = new GeoFlowType("SUGGEST_REGION", 3);

        @c("sellerAddresses")
        public static final GeoFlowType SELLER_ADDRESS = new GeoFlowType("SELLER_ADDRESS", 4);

        private static final /* synthetic */ GeoFlowType[] $values() {
            return new GeoFlowType[]{MAP, SUGGEST, HISTORICAL_SUGGEST, SUGGEST_REGION, SELLER_ADDRESS};
        }

        static {
            GeoFlowType[] geoFlowTypeArr$values = $values();
            $VALUES = geoFlowTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(geoFlowTypeArr$values);
        }

        private GeoFlowType(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<GeoFlowType> getEntries() {
            return $ENTRIES;
        }

        public static GeoFlowType valueOf(String str) {
            return (GeoFlowType) Enum.valueOf(GeoFlowType.class, str);
        }

        public static GeoFlowType[] values() {
            return (GeoFlowType[]) $VALUES.clone();
        }
    }

    /* compiled from: AddressParameter.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$InputStyle;", "Landroid/os/Parcelable;", "", "name", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/AddressParameter$InputStyle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getTheme", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InputStyle implements Parcelable {

        @k
        public static final Parcelable.Creator<InputStyle> CREATOR = new Creator();

        @c("name")
        @k
        private final String name;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
        @k
        private final String theme;

        /* compiled from: AddressParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InputStyle createFromParcel(@k Parcel parcel) {
                return new InputStyle(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final InputStyle[] newArray(int i12) {
                return new InputStyle[i12];
            }
        }

        public InputStyle(@k String str, @k String str2) {
            this.name = str;
            this.theme = str2;
        }

        public static /* synthetic */ InputStyle copy$default(InputStyle inputStyle, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = inputStyle.name;
            }
            if ((i12 & 2) != 0) {
                str2 = inputStyle.theme;
            }
            return inputStyle.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTheme() {
            return this.theme;
        }

        @k
        public final InputStyle copy(@k String name, @k String theme) {
            return new InputStyle(name, theme);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputStyle)) {
                return false;
            }
            InputStyle inputStyle = (InputStyle) other;
            return L.f(this.name, inputStyle.name) && L.f(this.theme, inputStyle.theme);
        }

        @k
        public final String getName() {
            return this.name;
        }

        @k
        public final String getTheme() {
            return this.theme;
        }

        public int hashCode() {
            return this.theme.hashCode() + (this.name.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("InputStyle(name=");
            sb2.append(this.name);
            sb2.append(", theme=");
            return C22026a.c(sb2, this.theme, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeString(this.theme);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AddressParameter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$MotivationPosition;", "", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MotivationPosition {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ MotivationPosition[] $VALUES;

        @c("top")
        public static final MotivationPosition TOP = new MotivationPosition("TOP", 0);

        @c("bottom")
        public static final MotivationPosition BOTTOM = new MotivationPosition("BOTTOM", 1);

        private static final /* synthetic */ MotivationPosition[] $values() {
            return new MotivationPosition[]{TOP, BOTTOM};
        }

        static {
            MotivationPosition[] motivationPositionArr$values = $values();
            $VALUES = motivationPositionArr$values;
            $ENTRIES = kotlin.enums.c.a(motivationPositionArr$values);
        }

        private MotivationPosition(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<MotivationPosition> getEntries() {
            return $ENTRIES;
        }

        public static MotivationPosition valueOf(String str) {
            return (MotivationPosition) Enum.valueOf(MotivationPosition.class, str);
        }

        public static MotivationPosition[] values() {
            return (MotivationPosition[]) $VALUES.clone();
        }
    }

    /* compiled from: AddressParameter.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0002=>BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014Jp\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020!HÖ\u0001¢\u0006\u0004\b)\u0010#J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020!HÖ\u0001¢\u0006\u0004\b.\u0010/R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b8\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b;\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b<\u0010\u0014¨\u0006?"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "Lcom/avito/android/deep_linking/links/DeepLink;", "hint", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses$AddButton;", "addButton", "", "addressError", "addedToast", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses$DeleteAddressSheet;", "deleteAddressSheet", "invalidAddress", "invalidAddressHint", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses$AddButton;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses$DeleteAddressSheet;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses$AddButton;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses$DeleteAddressSheet;", "component7", "component8", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses$AddButton;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses$DeleteAddressSheet;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Lcom/avito/android/deep_linking/links/DeepLink;", "getHint", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses$AddButton;", "getAddButton", "Ljava/lang/String;", "getAddressError", "getAddedToast", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses$DeleteAddressSheet;", "getDeleteAddressSheet", "getInvalidAddress", "getInvalidAddressHint", "AddButton", "DeleteAddressSheet", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class SellerAddresses implements Parcelable {

        @k
        public static final Parcelable.Creator<SellerAddresses> CREATOR = new Creator();

        @c("addButton")
        @l
        private final AddButton addButton;

        @c("addedToast")
        @l
        private final String addedToast;

        @c("addressError")
        @l
        private final String addressError;

        @c("deleteAddressSheet")
        @l
        private final DeleteAddressSheet deleteAddressSheet;

        @c("hint")
        @l
        private final DeepLink hint;

        @c("invalidAddress")
        @l
        private final String invalidAddress;

        @c("invalidAddressHint")
        @l
        private final DeepLink invalidAddressHint;

        @c("motivation")
        @l
        private final AttributedText motivation;

        /* compiled from: AddressParameter.kt */
        @d
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses$AddButton;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "icon", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.URL, "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses$AddButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Ljava/lang/String;", "getIcon", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUrl", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AddButton implements Parcelable {

            @k
            public static final Parcelable.Creator<AddButton> CREATOR = new Creator();

            @c("icon")
            @l
            private final String icon;

            @c("title")
            @l
            private final AttributedText title;

            @c(ContextActionHandler.Link.URL)
            @k
            private final DeepLink url;

            /* compiled from: AddressParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AddButton> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final AddButton createFromParcel(@k Parcel parcel) {
                    return new AddButton((AttributedText) parcel.readParcelable(AddButton.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(AddButton.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final AddButton[] newArray(int i12) {
                    return new AddButton[i12];
                }
            }

            public AddButton(@l AttributedText attributedText, @l String str, @k DeepLink deepLink) {
                this.title = attributedText;
                this.icon = str;
                this.url = deepLink;
            }

            public static /* synthetic */ AddButton copy$default(AddButton addButton, AttributedText attributedText, String str, DeepLink deepLink, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    attributedText = addButton.title;
                }
                if ((i12 & 2) != 0) {
                    str = addButton.icon;
                }
                if ((i12 & 4) != 0) {
                    deepLink = addButton.url;
                }
                return addButton.copy(attributedText, str, deepLink);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final AttributedText getTitle() {
                return this.title;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final DeepLink getUrl() {
                return this.url;
            }

            @k
            public final AddButton copy(@l AttributedText title, @l String icon, @k DeepLink url) {
                return new AddButton(title, icon, url);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AddButton)) {
                    return false;
                }
                AddButton addButton = (AddButton) other;
                return L.f(this.title, addButton.title) && L.f(this.icon, addButton.icon) && L.f(this.url, addButton.url);
            }

            @l
            public final String getIcon() {
                return this.icon;
            }

            @l
            public final AttributedText getTitle() {
                return this.title;
            }

            @k
            public final DeepLink getUrl() {
                return this.url;
            }

            public int hashCode() {
                AttributedText attributedText = this.title;
                int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
                String str = this.icon;
                return this.url.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("AddButton(title=");
                sb2.append(this.title);
                sb2.append(", icon=");
                sb2.append(this.icon);
                sb2.append(", url=");
                return a.v(sb2, this.url, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.title, flags);
                parcel.writeString(this.icon);
                parcel.writeParcelable(this.url, flags);
            }
        }

        /* compiled from: AddressParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SellerAddresses> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SellerAddresses createFromParcel(@k Parcel parcel) {
                return new SellerAddresses((AttributedText) parcel.readParcelable(SellerAddresses.class.getClassLoader()), (DeepLink) parcel.readParcelable(SellerAddresses.class.getClassLoader()), parcel.readInt() == 0 ? null : AddButton.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? DeleteAddressSheet.CREATOR.createFromParcel(parcel) : null, parcel.readString(), (DeepLink) parcel.readParcelable(SellerAddresses.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SellerAddresses[] newArray(int i12) {
                return new SellerAddresses[i12];
            }
        }

        /* compiled from: AddressParameter.kt */
        @d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses$DeleteAddressSheet;", "Landroid/os/Parcelable;", "", "buttonText", "description", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses$DeleteAddressSheet;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getButtonText", "getDescription", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DeleteAddressSheet implements Parcelable {

            @k
            public static final Parcelable.Creator<DeleteAddressSheet> CREATOR = new Creator();

            @c("buttonText")
            @k
            private final String buttonText;

            @c("description")
            @k
            private final String description;

            @c("title")
            @k
            private final AttributedText title;

            /* compiled from: AddressParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DeleteAddressSheet> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DeleteAddressSheet createFromParcel(@k Parcel parcel) {
                    return new DeleteAddressSheet(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(DeleteAddressSheet.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DeleteAddressSheet[] newArray(int i12) {
                    return new DeleteAddressSheet[i12];
                }
            }

            public DeleteAddressSheet(@k String str, @k String str2, @k AttributedText attributedText) {
                this.buttonText = str;
                this.description = str2;
                this.title = attributedText;
            }

            public static /* synthetic */ DeleteAddressSheet copy$default(DeleteAddressSheet deleteAddressSheet, String str, String str2, AttributedText attributedText, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = deleteAddressSheet.buttonText;
                }
                if ((i12 & 2) != 0) {
                    str2 = deleteAddressSheet.description;
                }
                if ((i12 & 4) != 0) {
                    attributedText = deleteAddressSheet.title;
                }
                return deleteAddressSheet.copy(str, str2, attributedText);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getButtonText() {
                return this.buttonText;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final AttributedText getTitle() {
                return this.title;
            }

            @k
            public final DeleteAddressSheet copy(@k String buttonText, @k String description, @k AttributedText title) {
                return new DeleteAddressSheet(buttonText, description, title);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DeleteAddressSheet)) {
                    return false;
                }
                DeleteAddressSheet deleteAddressSheet = (DeleteAddressSheet) other;
                return L.f(this.buttonText, deleteAddressSheet.buttonText) && L.f(this.description, deleteAddressSheet.description) && L.f(this.title, deleteAddressSheet.title);
            }

            @k
            public final String getButtonText() {
                return this.buttonText;
            }

            @k
            public final String getDescription() {
                return this.description;
            }

            @k
            public final AttributedText getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.title.hashCode() + H.d(this.buttonText.hashCode() * 31, 31, this.description);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("DeleteAddressSheet(buttonText=");
                sb2.append(this.buttonText);
                sb2.append(", description=");
                sb2.append(this.description);
                sb2.append(", title=");
                return a.w(sb2, this.title, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.buttonText);
                parcel.writeString(this.description);
                parcel.writeParcelable(this.title, flags);
            }
        }

        public SellerAddresses(@l AttributedText attributedText, @l DeepLink deepLink, @l AddButton addButton, @l String str, @l String str2, @l DeleteAddressSheet deleteAddressSheet, @l String str3, @l DeepLink deepLink2) {
            this.motivation = attributedText;
            this.hint = deepLink;
            this.addButton = addButton;
            this.addressError = str;
            this.addedToast = str2;
            this.deleteAddressSheet = deleteAddressSheet;
            this.invalidAddress = str3;
            this.invalidAddressHint = deepLink2;
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final AttributedText getMotivation() {
            return this.motivation;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final DeepLink getHint() {
            return this.hint;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AddButton getAddButton() {
            return this.addButton;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getAddressError() {
            return this.addressError;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final String getAddedToast() {
            return this.addedToast;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final DeleteAddressSheet getDeleteAddressSheet() {
            return this.deleteAddressSheet;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getInvalidAddress() {
            return this.invalidAddress;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final DeepLink getInvalidAddressHint() {
            return this.invalidAddressHint;
        }

        @k
        public final SellerAddresses copy(@l AttributedText motivation, @l DeepLink hint, @l AddButton addButton, @l String addressError, @l String addedToast, @l DeleteAddressSheet deleteAddressSheet, @l String invalidAddress, @l DeepLink invalidAddressHint) {
            return new SellerAddresses(motivation, hint, addButton, addressError, addedToast, deleteAddressSheet, invalidAddress, invalidAddressHint);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SellerAddresses)) {
                return false;
            }
            SellerAddresses sellerAddresses = (SellerAddresses) other;
            return L.f(this.motivation, sellerAddresses.motivation) && L.f(this.hint, sellerAddresses.hint) && L.f(this.addButton, sellerAddresses.addButton) && L.f(this.addressError, sellerAddresses.addressError) && L.f(this.addedToast, sellerAddresses.addedToast) && L.f(this.deleteAddressSheet, sellerAddresses.deleteAddressSheet) && L.f(this.invalidAddress, sellerAddresses.invalidAddress) && L.f(this.invalidAddressHint, sellerAddresses.invalidAddressHint);
        }

        @l
        public final AddButton getAddButton() {
            return this.addButton;
        }

        @l
        public final String getAddedToast() {
            return this.addedToast;
        }

        @l
        public final String getAddressError() {
            return this.addressError;
        }

        @l
        public final DeleteAddressSheet getDeleteAddressSheet() {
            return this.deleteAddressSheet;
        }

        @l
        public final DeepLink getHint() {
            return this.hint;
        }

        @l
        public final String getInvalidAddress() {
            return this.invalidAddress;
        }

        @l
        public final DeepLink getInvalidAddressHint() {
            return this.invalidAddressHint;
        }

        @l
        public final AttributedText getMotivation() {
            return this.motivation;
        }

        public int hashCode() {
            AttributedText attributedText = this.motivation;
            int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
            DeepLink deepLink = this.hint;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            AddButton addButton = this.addButton;
            int iHashCode3 = (iHashCode2 + (addButton == null ? 0 : addButton.hashCode())) * 31;
            String str = this.addressError;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.addedToast;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeleteAddressSheet deleteAddressSheet = this.deleteAddressSheet;
            int iHashCode6 = (iHashCode5 + (deleteAddressSheet == null ? 0 : deleteAddressSheet.hashCode())) * 31;
            String str3 = this.invalidAddress;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            DeepLink deepLink2 = this.invalidAddressHint;
            return iHashCode7 + (deepLink2 != null ? deepLink2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("SellerAddresses(motivation=");
            sb2.append(this.motivation);
            sb2.append(", hint=");
            sb2.append(this.hint);
            sb2.append(", addButton=");
            sb2.append(this.addButton);
            sb2.append(", addressError=");
            sb2.append(this.addressError);
            sb2.append(", addedToast=");
            sb2.append(this.addedToast);
            sb2.append(", deleteAddressSheet=");
            sb2.append(this.deleteAddressSheet);
            sb2.append(", invalidAddress=");
            sb2.append(this.invalidAddress);
            sb2.append(", invalidAddressHint=");
            return a.v(sb2, this.invalidAddressHint, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.motivation, flags);
            parcel.writeParcelable(this.hint, flags);
            AddButton addButton = this.addButton;
            if (addButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                addButton.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.addressError);
            parcel.writeString(this.addedToast);
            DeleteAddressSheet deleteAddressSheet = this.deleteAddressSheet;
            if (deleteAddressSheet == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                deleteAddressSheet.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.invalidAddress);
            parcel.writeParcelable(this.invalidAddressHint, flags);
        }
    }

    /* compiled from: AddressParameter.kt */
    @s0
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$ValidationRules;", "Landroid/os/Parcelable;", "", "minimalPrecision", "<init>", "(Ljava/lang/String;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "convertToFieldMap", "()Ljava/util/HashMap;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/AddressParameter$ValidationRules;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMinimalPrecision", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ValidationRules implements Parcelable {

        @k
        public static final Parcelable.Creator<ValidationRules> CREATOR = new Creator();

        @c("minimalPrecision")
        @l
        private final String minimalPrecision;

        /* compiled from: AddressParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ValidationRules> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ValidationRules createFromParcel(@k Parcel parcel) {
                return new ValidationRules(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ValidationRules[] newArray(int i12) {
                return new ValidationRules[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ValidationRules() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ValidationRules copy$default(ValidationRules validationRules, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = validationRules.minimalPrecision;
            }
            return validationRules.copy(str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getMinimalPrecision() {
            return this.minimalPrecision;
        }

        @k
        public final HashMap<String, String> convertToFieldMap() {
            String str = this.minimalPrecision;
            if (str == null) {
                str = "";
            }
            return P0.e(new Q("validationRules[minimalPrecision]", str));
        }

        @k
        public final ValidationRules copy(@l String minimalPrecision) {
            return new ValidationRules(minimalPrecision);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ValidationRules) && L.f(this.minimalPrecision, ((ValidationRules) other).minimalPrecision);
        }

        @l
        public final String getMinimalPrecision() {
            return this.minimalPrecision;
        }

        public int hashCode() {
            String str = this.minimalPrecision;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("ValidationRules(minimalPrecision="), this.minimalPrecision, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.minimalPrecision);
        }

        public ValidationRules(@l String str) {
            this.minimalPrecision = str;
        }

        public /* synthetic */ ValidationRules(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: AddressParameter.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$Widget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$Widget$Config;", Navigation.CONFIG, "<init>", "(Lcom/avito/android/remote/model/category_parameters/AddressParameter$Widget$Config;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/AddressParameter$Widget$Config;", "copy", "(Lcom/avito/android/remote/model/category_parameters/AddressParameter$Widget$Config;)Lcom/avito/android/remote/model/category_parameters/AddressParameter$Widget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$Widget$Config;", "getConfig", "Config", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Widget implements Parcelable {

        @k
        public static final Parcelable.Creator<Widget> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @l
        private final Config config;

        /* compiled from: AddressParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Widget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget createFromParcel(@k Parcel parcel) {
                return new Widget(parcel.readInt() == 0 ? null : Config.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget[] newArray(int i12) {
                return new Widget[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Widget() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Widget copy$default(Widget widget, Config config, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                config = widget.config;
            }
            return widget.copy(config);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Config getConfig() {
            return this.config;
        }

        @k
        public final Widget copy(@l Config config) {
            return new Widget(config);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Widget) && L.f(this.config, ((Widget) other).config);
        }

        @l
        public final Config getConfig() {
            return this.config;
        }

        public int hashCode() {
            Config config = this.config;
            if (config == null) {
                return 0;
            }
            return config.hashCode();
        }

        @k
        public String toString() {
            return "Widget(config=" + this.config + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Config config = this.config;
            if (config == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                config.writeToParcel(parcel, flags);
            }
        }

        public Widget(@l Config config) {
            this.config = config;
        }

        public /* synthetic */ Widget(Config config, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : config);
        }

        /* compiled from: AddressParameter.kt */
        @d
        @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!Jp\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b-\u0010'J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020%HÖ\u0001¢\u0006\u0004\b2\u00103R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b9\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b<\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010!¨\u0006C"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$Widget$Config;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/TooltipOptions;", "tooltipOptions", "", "type", "Lcom/avito/android/remote/model/text/AttributedText;", "subtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "hint", "motivation", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$MotivationPosition;", "position", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$InputStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses;", "sellerAddressesFlow", "<init>", "(Lcom/avito/android/remote/model/category_parameters/TooltipOptions;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/AddressParameter$MotivationPosition;Lcom/avito/android/remote/model/category_parameters/AddressParameter$InputStyle;Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/TooltipOptions;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "component6", "()Lcom/avito/android/remote/model/category_parameters/AddressParameter$MotivationPosition;", "component7", "()Lcom/avito/android/remote/model/category_parameters/AddressParameter$InputStyle;", "component8", "()Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses;", "copy", "(Lcom/avito/android/remote/model/category_parameters/TooltipOptions;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/AddressParameter$MotivationPosition;Lcom/avito/android/remote/model/category_parameters/AddressParameter$InputStyle;Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses;)Lcom/avito/android/remote/model/category_parameters/AddressParameter$Widget$Config;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/TooltipOptions;", "getTooltipOptions", "Ljava/lang/String;", "getType", "Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getHint", "getMotivation", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$MotivationPosition;", "getPosition", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$InputStyle;", "getStyle", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$SellerAddresses;", "getSellerAddressesFlow", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Config implements Parcelable {

            @k
            public static final Parcelable.Creator<Config> CREATOR = new Creator();

            @c("hint")
            @l
            private final DeepLink hint;

            @c("motivation")
            @l
            private final AttributedText motivation;

            @c("position")
            @l
            private final MotivationPosition position;

            @c("sellerAddresses")
            @l
            private final SellerAddresses sellerAddressesFlow;

            @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
            @l
            private final InputStyle style;

            @c("subtitle")
            @l
            private final AttributedText subtitle;

            @c(TooltipAttribute.ATTRIBUTE_TYPE)
            @l
            private final TooltipOptions tooltipOptions;

            @c("type")
            @l
            private final String type;

            /* compiled from: AddressParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config createFromParcel(@k Parcel parcel) {
                    return new Config(parcel.readInt() == 0 ? null : TooltipOptions.CREATOR.createFromParcel(parcel), parcel.readString(), (AttributedText) parcel.readParcelable(Config.class.getClassLoader()), (DeepLink) parcel.readParcelable(Config.class.getClassLoader()), (AttributedText) parcel.readParcelable(Config.class.getClassLoader()), parcel.readInt() == 0 ? null : MotivationPosition.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : InputStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SellerAddresses.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config[] newArray(int i12) {
                    return new Config[i12];
                }
            }

            public Config(@l TooltipOptions tooltipOptions, @l String str, @l AttributedText attributedText, @l DeepLink deepLink, @l AttributedText attributedText2, @l MotivationPosition motivationPosition, @l InputStyle inputStyle, @l SellerAddresses sellerAddresses) {
                this.tooltipOptions = tooltipOptions;
                this.type = str;
                this.subtitle = attributedText;
                this.hint = deepLink;
                this.motivation = attributedText2;
                this.position = motivationPosition;
                this.style = inputStyle;
                this.sellerAddressesFlow = sellerAddresses;
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final TooltipOptions getTooltipOptions() {
                return this.tooltipOptions;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getType() {
                return this.type;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final AttributedText getSubtitle() {
                return this.subtitle;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final DeepLink getHint() {
                return this.hint;
            }

            @l
            /* renamed from: component5, reason: from getter */
            public final AttributedText getMotivation() {
                return this.motivation;
            }

            @l
            /* renamed from: component6, reason: from getter */
            public final MotivationPosition getPosition() {
                return this.position;
            }

            @l
            /* renamed from: component7, reason: from getter */
            public final InputStyle getStyle() {
                return this.style;
            }

            @l
            /* renamed from: component8, reason: from getter */
            public final SellerAddresses getSellerAddressesFlow() {
                return this.sellerAddressesFlow;
            }

            @k
            public final Config copy(@l TooltipOptions tooltipOptions, @l String type, @l AttributedText subtitle, @l DeepLink hint, @l AttributedText motivation, @l MotivationPosition position, @l InputStyle style, @l SellerAddresses sellerAddressesFlow) {
                return new Config(tooltipOptions, type, subtitle, hint, motivation, position, style, sellerAddressesFlow);
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
                return L.f(this.tooltipOptions, config.tooltipOptions) && L.f(this.type, config.type) && L.f(this.subtitle, config.subtitle) && L.f(this.hint, config.hint) && L.f(this.motivation, config.motivation) && this.position == config.position && L.f(this.style, config.style) && L.f(this.sellerAddressesFlow, config.sellerAddressesFlow);
            }

            @l
            public final DeepLink getHint() {
                return this.hint;
            }

            @l
            public final AttributedText getMotivation() {
                return this.motivation;
            }

            @l
            public final MotivationPosition getPosition() {
                return this.position;
            }

            @l
            public final SellerAddresses getSellerAddressesFlow() {
                return this.sellerAddressesFlow;
            }

            @l
            public final InputStyle getStyle() {
                return this.style;
            }

            @l
            public final AttributedText getSubtitle() {
                return this.subtitle;
            }

            @l
            public final TooltipOptions getTooltipOptions() {
                return this.tooltipOptions;
            }

            @l
            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                TooltipOptions tooltipOptions = this.tooltipOptions;
                int iHashCode = (tooltipOptions == null ? 0 : tooltipOptions.hashCode()) * 31;
                String str = this.type;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                AttributedText attributedText = this.subtitle;
                int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                DeepLink deepLink = this.hint;
                int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
                AttributedText attributedText2 = this.motivation;
                int iHashCode5 = (iHashCode4 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
                MotivationPosition motivationPosition = this.position;
                int iHashCode6 = (iHashCode5 + (motivationPosition == null ? 0 : motivationPosition.hashCode())) * 31;
                InputStyle inputStyle = this.style;
                int iHashCode7 = (iHashCode6 + (inputStyle == null ? 0 : inputStyle.hashCode())) * 31;
                SellerAddresses sellerAddresses = this.sellerAddressesFlow;
                return iHashCode7 + (sellerAddresses != null ? sellerAddresses.hashCode() : 0);
            }

            @k
            public String toString() {
                return "Config(tooltipOptions=" + this.tooltipOptions + ", type=" + this.type + ", subtitle=" + this.subtitle + ", hint=" + this.hint + ", motivation=" + this.motivation + ", position=" + this.position + ", style=" + this.style + ", sellerAddressesFlow=" + this.sellerAddressesFlow + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                TooltipOptions tooltipOptions = this.tooltipOptions;
                if (tooltipOptions == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    tooltipOptions.writeToParcel(parcel, flags);
                }
                parcel.writeString(this.type);
                parcel.writeParcelable(this.subtitle, flags);
                parcel.writeParcelable(this.hint, flags);
                parcel.writeParcelable(this.motivation, flags);
                MotivationPosition motivationPosition = this.position;
                if (motivationPosition == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(motivationPosition.name());
                }
                InputStyle inputStyle = this.style;
                if (inputStyle == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    inputStyle.writeToParcel(parcel, flags);
                }
                SellerAddresses sellerAddresses = this.sellerAddressesFlow;
                if (sellerAddresses == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    sellerAddresses.writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Config(TooltipOptions tooltipOptions, String str, AttributedText attributedText, DeepLink deepLink, AttributedText attributedText2, MotivationPosition motivationPosition, InputStyle inputStyle, SellerAddresses sellerAddresses, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : tooltipOptions, (i12 & 2) != 0 ? null : str, attributedText, deepLink, (i12 & 16) != 0 ? null : attributedText2, (i12 & 32) != 0 ? MotivationPosition.BOTTOM : motivationPosition, (i12 & 64) != 0 ? null : inputStyle, (i12 & 128) != 0 ? null : sellerAddresses);
            }
        }
    }

    public /* synthetic */ AddressParameter(String str, String str2, boolean z12, boolean z13, AttributedText attributedText, Boolean bool, SuggestData suggestData, Value value, String str3, Boolean bool2, EmptyValueErrorPlace emptyValueErrorPlace, DisplayingOptions displayingOptions, GeoFlowType geoFlowType, ValidationRules validationRules, Boolean bool3, Boolean bool4, Widget widget, AttributedText attributedText2, List list, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, attributedText, bool, suggestData, value, (i12 & 256) != 0 ? null : str3, (i12 & 512) != 0 ? null : bool2, (i12 & 1024) != 0 ? EmptyValueErrorPlace.LOCATION_WIDGET : emptyValueErrorPlace, (i12 & 2048) != 0 ? null : displayingOptions, (i12 & 4096) != 0 ? null : geoFlowType, (i12 & 8192) != 0 ? null : validationRules, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? Boolean.FALSE : bool3, (32768 & i12) != 0 ? Boolean.FALSE : bool4, (65536 & i12) != 0 ? null : widget, (131072 & i12) != 0 ? null : attributedText2, (i12 & 262144) != 0 ? new ArrayList() : list);
    }

    private final Value.PublishValueSellerAddressData invalidAddressStub(String addressText) {
        f.f406882b.getClass();
        return new Value.PublishValueSellerAddressData("", String.valueOf(f.f406883c.i()), Boolean.TRUE, addressText, addressText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Boolean getIsAddressesLoaded() {
        return this.isAddressesLoaded;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final EmptyValueErrorPlace getErrorPlace() {
        return this.errorPlace;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final DisplayingOptions getDisplaying() {
        return this.displaying;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final GeoFlowType getFlowType() {
        return this.flowType;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final ValidationRules getValidationRules() {
        return this.validationRules;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final Widget getWidget() {
        return this.widget;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final List<Constraint> component19() {
        return this.constraints;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final SuggestData getSuggestData() {
        return this.suggestData;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Value get_value() {
        return this._value;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @k
    public final AddressParameter copy(@k String id2, @k String title, boolean required, boolean immutable, @l AttributedText motivation, @l Boolean updatesForm, @l SuggestData suggestData, @l Value _value, @l String placeholder, @l Boolean isAddressesLoaded, @l EmptyValueErrorPlace errorPlace, @l DisplayingOptions displaying, @l GeoFlowType flowType, @l ValidationRules validationRules, @l Boolean visible, @l Boolean phantom, @l Widget widget, @l AttributedText subtitle, @l List<? extends Constraint> constraints) {
        return new AddressParameter(id2, title, required, immutable, motivation, updatesForm, suggestData, _value, placeholder, isAddressesLoaded, errorPlace, displaying, flowType, validationRules, visible, phantom, widget, subtitle, constraints);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressParameter)) {
            return false;
        }
        AddressParameter addressParameter = (AddressParameter) other;
        return L.f(this.id, addressParameter.id) && L.f(this.title, addressParameter.title) && this.required == addressParameter.required && this.immutable == addressParameter.immutable && L.f(this.motivation, addressParameter.motivation) && L.f(this.updatesForm, addressParameter.updatesForm) && L.f(this.suggestData, addressParameter.suggestData) && L.f(this._value, addressParameter._value) && L.f(this.placeholder, addressParameter.placeholder) && L.f(this.isAddressesLoaded, addressParameter.isAddressesLoaded) && this.errorPlace == addressParameter.errorPlace && L.f(this.displaying, addressParameter.displaying) && this.flowType == addressParameter.flowType && L.f(this.validationRules, addressParameter.validationRules) && L.f(this.visible, addressParameter.visible) && L.f(this.phantom, addressParameter.phantom) && L.f(this.widget, addressParameter.widget) && L.f(this.subtitle, addressParameter.subtitle) && L.f(this.constraints, addressParameter.constraints);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasConstraints
    @l
    public List<Constraint> getConstraints() {
        return this.constraints;
    }

    @l
    public final DisplayingOptions getDisplaying() {
        return this.displaying;
    }

    @l
    public final EmptyValueErrorPlace getErrorPlace() {
        return this.errorPlace;
    }

    @l
    public final GeoFlowType getFlowType() {
        return this.flowType;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
    @k
    public String getId() {
        return this.id;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getImmutable() {
        return this.immutable;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @l
    public AttributedText getMotivation() {
        return this.motivation;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Phantom
    @l
    public Boolean getPhantom() {
        return this.phantom;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasPlaceholder
    @l
    public String getPlaceholder() {
        return this.placeholder;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    @l
    public final Value.PublishValueSellerAddressData getSelectedValue() {
        String text;
        Value.PublishValueSellerAddressData addressData;
        Value value = getValue();
        if (value != null && (addressData = value.getAddressData()) != null) {
            return addressData;
        }
        Value value2 = getValue();
        if (value2 == null || (text = value2.getText()) == null) {
            return null;
        }
        return invalidAddressStub(text);
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final SuggestData getSuggestData() {
        return this.suggestData;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return TYPE;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @l
    public Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    public final ValidationRules getValidationRules() {
        return this.validationRules;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @l
    public final Widget getWidget() {
        return this.widget;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public boolean hasValue() {
        String text;
        Value value = getValue();
        return (value == null || (text = value.getText()) == null || text.length() == 0 || value.getLat() == 0.0d || value.getLng() == 0.0d) ? false : true;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required), 31, this.immutable);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        SuggestData suggestData = this.suggestData;
        int iHashCode3 = (iHashCode2 + (suggestData == null ? 0 : suggestData.hashCode())) * 31;
        Value value = this._value;
        int iHashCode4 = (iHashCode3 + (value == null ? 0 : value.hashCode())) * 31;
        String str = this.placeholder;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.isAddressesLoaded;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        EmptyValueErrorPlace emptyValueErrorPlace = this.errorPlace;
        int iHashCode7 = (iHashCode6 + (emptyValueErrorPlace == null ? 0 : emptyValueErrorPlace.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displaying;
        int iHashCode8 = (iHashCode7 + (displayingOptions == null ? 0 : displayingOptions.hashCode())) * 31;
        GeoFlowType geoFlowType = this.flowType;
        int iHashCode9 = (iHashCode8 + (geoFlowType == null ? 0 : geoFlowType.hashCode())) * 31;
        ValidationRules validationRules = this.validationRules;
        int iHashCode10 = (iHashCode9 + (validationRules == null ? 0 : validationRules.hashCode())) * 31;
        Boolean bool3 = this.visible;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.phantom;
        int iHashCode12 = (iHashCode11 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Widget widget = this.widget;
        int iHashCode13 = (iHashCode12 + (widget == null ? 0 : widget.hashCode())) * 31;
        AttributedText attributedText2 = this.subtitle;
        int iHashCode14 = (iHashCode13 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        List<Constraint> list = this.constraints;
        return iHashCode14 + (list != null ? list.hashCode() : 0);
    }

    @l
    public final Boolean isAddressesLoaded() {
        return this.isAddressesLoaded;
    }

    public final void setAddressesLoaded(@l Boolean bool) {
        this.isAddressesLoaded = bool;
    }

    public final void setErrorPlace(@l EmptyValueErrorPlace emptyValueErrorPlace) {
        this.errorPlace = emptyValueErrorPlace;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AddressParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", required=");
        sb2.append(this.required);
        sb2.append(", immutable=");
        sb2.append(this.immutable);
        sb2.append(", motivation=");
        sb2.append(this.motivation);
        sb2.append(", updatesForm=");
        sb2.append(this.updatesForm);
        sb2.append(", suggestData=");
        sb2.append(this.suggestData);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", isAddressesLoaded=");
        sb2.append(this.isAddressesLoaded);
        sb2.append(", errorPlace=");
        sb2.append(this.errorPlace);
        sb2.append(", displaying=");
        sb2.append(this.displaying);
        sb2.append(", flowType=");
        sb2.append(this.flowType);
        sb2.append(", validationRules=");
        sb2.append(this.validationRules);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        sb2.append(this.phantom);
        sb2.append(", widget=");
        sb2.append(this.widget);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", constraints=");
        return H.p(sb2, this.constraints, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.required ? 1 : 0);
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        SuggestData suggestData = this.suggestData;
        if (suggestData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            suggestData.writeToParcel(parcel, flags);
        }
        Value value = this._value;
        if (value == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            value.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.placeholder);
        Boolean bool2 = this.isAddressesLoaded;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        EmptyValueErrorPlace emptyValueErrorPlace = this.errorPlace;
        if (emptyValueErrorPlace == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(emptyValueErrorPlace.name());
        }
        DisplayingOptions displayingOptions = this.displaying;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
        GeoFlowType geoFlowType = this.flowType;
        if (geoFlowType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(geoFlowType.name());
        }
        ValidationRules validationRules = this.validationRules;
        if (validationRules == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            validationRules.writeToParcel(parcel, flags);
        }
        Boolean bool3 = this.visible;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        Boolean bool4 = this.phantom;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        Widget widget = this.widget;
        if (widget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widget.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.subtitle, flags);
        List<Constraint> list = this.constraints;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public Value get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l Value value) {
        this._value = value;
    }

    /* compiled from: AddressParameter.kt */
    @s0
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000223B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013R\u0011\u0010/\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b.\u0010\u0010R\u0011\u00101\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b0\u0010\u0010¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;", "Landroid/os/Parcelable;", "", "lat", Value.LNG, "", "text", "jsonWebToken", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value$PublishValueSellerAddressData;", "addressData", "<init>", "(DDLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value$PublishValueSellerAddressData;)V", "component1", "()D", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value$PublishValueSellerAddressData;", "copy", "(DDLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value$PublishValueSellerAddressData;)Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "D", "getLat", "getLng", "Ljava/lang/String;", "getText", "getJsonWebToken", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value$PublishValueSellerAddressData;", "getAddressData", "getFormattedLat", "formattedLat", "getFormattedLng", "formattedLng", "Companion", "PublishValueSellerAddressData", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Value implements Parcelable {

        @k
        public static final String ADDRESS_DATA = "sellerAddressData";

        @k
        public static final String JSON_WEB_TOKEN = "jwt";

        @k
        public static final String LAT = "lat";

        @k
        public static final String LNG = "lng";

        @k
        public static final String TEXT = "text";

        @k
        private static final DecimalFormat coordinateFormat;

        @k
        private static final DecimalFormatSymbols formatSymbols;

        @c(ADDRESS_DATA)
        @l
        private final PublishValueSellerAddressData addressData;

        @c(JSON_WEB_TOKEN)
        @l
        private final String jsonWebToken;

        @c("lat")
        private final double lat;

        @c(LNG)
        private final double lng;

        @c("text")
        @l
        private final String text;

        @k
        public static final Parcelable.Creator<Value> CREATOR = new Creator();

        /* compiled from: AddressParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Value> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value createFromParcel(@k Parcel parcel) {
                return new Value(parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PublishValueSellerAddressData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value[] newArray(int i12) {
                return new Value[i12];
            }
        }

        /* compiled from: AddressParameter.kt */
        @d
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0006\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value$PublishValueSellerAddressData;", "Landroid/os/Parcelable;", "", "house", "id", "", "isDisabled", "location", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHouse", "()Ljava/lang/String;", "getId", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getLocation", "getName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class PublishValueSellerAddressData implements Parcelable {

            @k
            public static final Parcelable.Creator<PublishValueSellerAddressData> CREATOR = new Creator();

            @c("house")
            @l
            private final String house;

            @c("id")
            @k
            private final String id;

            @c("isDisabled")
            @l
            private final Boolean isDisabled;

            @c("location")
            @k
            private final String location;

            @c("name")
            @k
            private final String name;

            /* compiled from: AddressParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<PublishValueSellerAddressData> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final PublishValueSellerAddressData createFromParcel(@k Parcel parcel) {
                    Boolean boolValueOf;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new PublishValueSellerAddressData(string, string2, boolValueOf, parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final PublishValueSellerAddressData[] newArray(int i12) {
                    return new PublishValueSellerAddressData[i12];
                }
            }

            public PublishValueSellerAddressData(@l String str, @k String str2, @l Boolean bool, @k String str3, @k String str4) {
                this.house = str;
                this.id = str2;
                this.isDisabled = bool;
                this.location = str3;
                this.name = str4;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final String getHouse() {
                return this.house;
            }

            @k
            public final String getId() {
                return this.id;
            }

            @k
            public final String getLocation() {
                return this.location;
            }

            @k
            public final String getName() {
                return this.name;
            }

            @l
            /* renamed from: isDisabled, reason: from getter */
            public final Boolean getIsDisabled() {
                return this.isDisabled;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.house);
                parcel.writeString(this.id);
                Boolean bool = this.isDisabled;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                parcel.writeString(this.location);
                parcel.writeString(this.name);
            }
        }

        static {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
            decimalFormatSymbols.setDecimalSeparator('.');
            formatSymbols = decimalFormatSymbols;
            coordinateFormat = new DecimalFormat("0.000000", decimalFormatSymbols);
        }

        public Value(double d12, double d13, @l String str, @l String str2, @l PublishValueSellerAddressData publishValueSellerAddressData) {
            this.lat = d12;
            this.lng = d13;
            this.text = str;
            this.jsonWebToken = str2;
            this.addressData = publishValueSellerAddressData;
        }

        /* renamed from: component1, reason: from getter */
        public final double getLat() {
            return this.lat;
        }

        /* renamed from: component2, reason: from getter */
        public final double getLng() {
            return this.lng;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getJsonWebToken() {
            return this.jsonWebToken;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final PublishValueSellerAddressData getAddressData() {
            return this.addressData;
        }

        @k
        public final Value copy(double lat, double lng, @l String text, @l String jsonWebToken, @l PublishValueSellerAddressData addressData) {
            return new Value(lat, lng, text, jsonWebToken, addressData);
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
            return Double.compare(this.lat, value.lat) == 0 && Double.compare(this.lng, value.lng) == 0 && L.f(this.text, value.text) && L.f(this.jsonWebToken, value.jsonWebToken) && L.f(this.addressData, value.addressData);
        }

        @l
        public final PublishValueSellerAddressData getAddressData() {
            return this.addressData;
        }

        @InterfaceC44435b(name = "lat")
        @k
        public final String getFormattedLat() {
            return coordinateFormat.format(this.lat);
        }

        @InterfaceC44435b(name = LNG)
        @k
        public final String getFormattedLng() {
            return coordinateFormat.format(this.lng);
        }

        @l
        @InterfaceC44435b(name = JSON_WEB_TOKEN)
        public final String getJsonWebToken() {
            return this.jsonWebToken;
        }

        public final double getLat() {
            return this.lat;
        }

        public final double getLng() {
            return this.lng;
        }

        @l
        @InterfaceC44435b(name = "text")
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iD2 = e.d(Double.hashCode(this.lat) * 31, 31, this.lng);
            String str = this.text;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.jsonWebToken;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            PublishValueSellerAddressData publishValueSellerAddressData = this.addressData;
            return iHashCode2 + (publishValueSellerAddressData != null ? publishValueSellerAddressData.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Value(lat=" + this.lat + ", lng=" + this.lng + ", text=" + this.text + ", jsonWebToken=" + this.jsonWebToken + ", addressData=" + this.addressData + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeDouble(this.lat);
            parcel.writeDouble(this.lng);
            parcel.writeString(this.text);
            parcel.writeString(this.jsonWebToken);
            PublishValueSellerAddressData publishValueSellerAddressData = this.addressData;
            if (publishValueSellerAddressData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                publishValueSellerAddressData.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ Value(double d12, double d13, String str, String str2, PublishValueSellerAddressData publishValueSellerAddressData, int i12, C42822w c42822w) {
            this(d12, d13, str, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : publishValueSellerAddressData);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddressParameter(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l Boolean bool, @l SuggestData suggestData, @l Value value, @l String str3, @l Boolean bool2, @l EmptyValueErrorPlace emptyValueErrorPlace, @l DisplayingOptions displayingOptions, @l GeoFlowType geoFlowType, @l ValidationRules validationRules, @l Boolean bool3, @l Boolean bool4, @l Widget widget, @l AttributedText attributedText2, @l List<? extends Constraint> list) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.immutable = z13;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this.suggestData = suggestData;
        this._value = value;
        this.placeholder = str3;
        this.isAddressesLoaded = bool2;
        this.errorPlace = emptyValueErrorPlace;
        this.displaying = displayingOptions;
        this.flowType = geoFlowType;
        this.validationRules = validationRules;
        this.visible = bool3;
        this.phantom = bool4;
        this.widget = widget;
        this.subtitle = attributedText2;
        this.constraints = list;
    }
}
