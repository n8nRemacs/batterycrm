package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasAdditionalAction;
import com.avito.android.remote.model.category_parameters.base.HasHtmlValueSupport;
import com.avito.android.remote.model.category_parameters.base.HasTags;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.TextParameter;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.base.WithOnValidationFailedDeeplink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: CharParameter.kt */
@d
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u0084\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\n\u0085\u0001\u0086\u0001\u0084\u0001\u0087\u0001\u0088\u0001BÛ\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0017\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0010\u0010.\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b.\u0010*J\u0010\u0010/\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b/\u0010*J\u0012\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010,J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010,J\u0012\u00106\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010,J\u0018\u0010=\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b=\u00109J\u0012\u0010>\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b@\u00103J\u0012\u0010A\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bA\u00103J\u0012\u0010B\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bB\u0010CJì\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00172\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%HÆ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bF\u0010,J\u0010\u0010H\u001a\u00020GHÖ\u0001¢\u0006\u0004\bH\u0010IJ\u001a\u0010L\u001a\u00020\r2\b\u0010K\u001a\u0004\u0018\u00010JHÖ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020GHÖ\u0001¢\u0006\u0004\bN\u0010IJ \u0010S\u001a\u00020R2\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020GHÖ\u0001¢\u0006\u0004\bS\u0010TJ\u0012\u0010U\u001a\u0004\u0018\u00010\u001fHÂ\u0003¢\u0006\u0004\bU\u0010VR\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010W\u001a\u0004\bX\u0010,R\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010W\u001a\u0004\bY\u0010,R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010Z\u001a\u0004\b[\u0010*R\u001a\u0010\u000f\u001a\u00020\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010Z\u001a\u0004\b\\\u0010*R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010]\u001a\u0004\b^\u00101R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010_\u001a\u0004\b`\u00103R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010W\u0012\u0004\bb\u0010c\u001a\u0004\ba\u0010,R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010W\u001a\u0004\bd\u0010,\"\u0004\be\u0010fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010g\u001a\u0004\bh\u00107R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010i\u001a\u0004\bj\u00109R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010k\u001a\u0004\bl\u0010;R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010W\u001a\u0004\bm\u0010,R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00178\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010i\u001a\u0004\bn\u00109R\u0016\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010oR\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010p\u001a\u0004\bq\u0010?R\u001c\u0010#\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010_\u001a\u0004\br\u00103R\u001c\u0010$\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010_\u001a\u0004\bs\u00103R\u001c\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010t\u001a\u0004\bu\u0010CR*\u0010v\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bv\u0010W\u0012\u0004\by\u0010c\u001a\u0004\bw\u0010,\"\u0004\bx\u0010fR\u0014\u0010{\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010,R\u0011\u0010}\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b|\u0010VR\u0013\u0010\u007f\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b~\u00103R\u001a\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0089\u0001"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CharParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "Lcom/avito/android/remote/model/category_parameters/base/TextParameter;", "Lcom/avito/android/remote/model/category_parameters/base/HasTags;", "Lcom/avito/android/remote/model/category_parameters/base/HasHtmlValueSupport;", "Lcom/avito/android/remote/model/category_parameters/base/HasAdditionalAction;", "Lcom/avito/android/remote/model/category_parameters/WithAutogeneratedValue;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "Lcom/avito/android/remote/model/category_parameters/base/WithOnValidationFailedDeeplink;", "id", "title", "", "required", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "updatesForm", "hint", "_value", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", "", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", "Lcom/avito/android/remote/model/category_parameters/ParamButton;", "button", ChannelContext.Item.PLACEHOLDER, "Lcom/avito/android/remote/model/category_parameters/TextualTag;", "tags", "Lcom/avito/android/remote/model/category_parameters/CharParameter$InputType;", "_inputType", "Lcom/avito/android/remote/model/category_parameters/AutoGeneratedValue;", "autogeneratedValue", "visible", "phantom", "Lcom/avito/android/remote/model/category_parameters/CharParameter$Widget;", "widget", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/ParamButton;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/CharParameter$InputType;Lcom/avito/android/remote/model/category_parameters/AutoGeneratedValue;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/CharParameter$Widget;)V", "hasValue", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component10", "()Ljava/util/List;", "component11", "()Lcom/avito/android/remote/model/category_parameters/ParamButton;", "component12", "component13", "component15", "()Lcom/avito/android/remote/model/category_parameters/AutoGeneratedValue;", "component16", "component17", "component18", "()Lcom/avito/android/remote/model/category_parameters/CharParameter$Widget;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/ParamButton;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/category_parameters/CharParameter$InputType;Lcom/avito/android/remote/model/category_parameters/AutoGeneratedValue;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/CharParameter$Widget;)Lcom/avito/android/remote/model/category_parameters/CharParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component14", "()Lcom/avito/android/remote/model/category_parameters/CharParameter$InputType;", "Ljava/lang/String;", "getId", "getTitle", "Z", "getRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Ljava/lang/Boolean;", "getUpdatesForm", "getHint", "getHint$annotations", "()V", "get_value", "set_value", "(Ljava/lang/String;)V", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "Ljava/util/List;", "getConstraints", "Lcom/avito/android/remote/model/category_parameters/ParamButton;", "getButton", "getPlaceholder", "getTags", "Lcom/avito/android/remote/model/category_parameters/CharParameter$InputType;", "Lcom/avito/android/remote/model/category_parameters/AutoGeneratedValue;", "getAutogeneratedValue", "getVisible", "getPhantom", "Lcom/avito/android/remote/model/category_parameters/CharParameter$Widget;", "getWidget", "renderedHtmlValue", "getRenderedHtmlValue", "setRenderedHtmlValue", "getRenderedHtmlValue$annotations", "getType", "type", "getInputType", "inputType", "getShouldHideValueForAnalytics", "shouldHideValueForAnalytics", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnValidationFailedDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "onValidationFailedDeeplink", "Companion", "AutoBeautification", "AutoDescription", "InputType", "Widget", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CharParameter extends EditableParameter<String> implements TextParameter, HasTags, HasHtmlValueSupport, HasAdditionalAction, WithAutogeneratedValue, Visibility, Phantom, WithOnValidationFailedDeeplink {

    @k
    public static final String LEGACY_TYPE = "description";

    @k
    public static final String TYPE = "char";

    @c("inputType")
    @l
    private final InputType _inputType;

    @c("value")
    @l
    private String _value;

    @c("autoGeneratedValue")
    @l
    private final AutoGeneratedValue autogeneratedValue;

    @c("button")
    @l
    private final ParamButton button;

    @c("constraints")
    @l
    private final List<Constraint> constraints;

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displayingOptions;

    @c("hint")
    @l
    private final String hint;

    @c("id")
    @k
    private final String id;

    @c("immutable")
    private final boolean immutable;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("phantom")
    @l
    private final Boolean phantom;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @l
    private String renderedHtmlValue;

    @c("required")
    private final boolean required;

    @c("tags")
    @l
    private final List<TextualTag> tags;

    @c("title")
    @k
    private final String title;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("visible")
    @l
    private final Boolean visible;

    @c("widget")
    @l
    private final Widget widget;

    @k
    public static final Parcelable.Creator<CharParameter> CREATOR = new Creator();

    /* compiled from: CharParameter.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0002,-B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rJ \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b)\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0013¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification;", "Landroid/os/Parcelable;", "", "minimalSymbolThreshold", "", "generateButtonTitle", "continueWithoutBeautifyButtonTitle", "restoreButtonTitle", "Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification$LoadingOverlay;", "loadingOverlay", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification$LoadingOverlay;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification$LoadingOverlay;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification$LoadingOverlay;)Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getMinimalSymbolThreshold", "Ljava/lang/String;", "getGenerateButtonTitle", "getContinueWithoutBeautifyButtonTitle", "getRestoreButtonTitle", "Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification$LoadingOverlay;", "getLoadingOverlay", "ActionDialog", "LoadingOverlay", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class AutoBeautification implements Parcelable {

        @k
        public static final Parcelable.Creator<AutoBeautification> CREATOR = new Creator();

        @c("continueWithoutBeautifyButtonTitle")
        @k
        private final String continueWithoutBeautifyButtonTitle;

        @c("generateButtonTitle")
        @k
        private final String generateButtonTitle;

        @c("loadingOverlay")
        @k
        private final LoadingOverlay loadingOverlay;

        @c("minimalSymbolThreshold")
        private final int minimalSymbolThreshold;

        @c("restoreButtonTitle")
        @l
        private final String restoreButtonTitle;

        /* compiled from: CharParameter.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification$ActionDialog;", "Landroid/os/Parcelable;", "", "title", "buttonTitle", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification$ActionDialog;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getButtonTitle", "getDescription", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ActionDialog implements Parcelable {

            @k
            public static final Parcelable.Creator<ActionDialog> CREATOR = new Creator();

            @c("buttonTitle")
            @k
            private final String buttonTitle;

            @c("description")
            @k
            private final String description;

            @c("title")
            @k
            private final String title;

            /* compiled from: CharParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ActionDialog> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ActionDialog createFromParcel(@k Parcel parcel) {
                    return new ActionDialog(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ActionDialog[] newArray(int i12) {
                    return new ActionDialog[i12];
                }
            }

            public ActionDialog(@k String str, @k String str2, @k String str3) {
                this.title = str;
                this.buttonTitle = str2;
                this.description = str3;
            }

            public static /* synthetic */ ActionDialog copy$default(ActionDialog actionDialog, String str, String str2, String str3, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = actionDialog.title;
                }
                if ((i12 & 2) != 0) {
                    str2 = actionDialog.buttonTitle;
                }
                if ((i12 & 4) != 0) {
                    str3 = actionDialog.description;
                }
                return actionDialog.copy(str, str2, str3);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getButtonTitle() {
                return this.buttonTitle;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @k
            public final ActionDialog copy(@k String title, @k String buttonTitle, @k String description) {
                return new ActionDialog(title, buttonTitle, description);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActionDialog)) {
                    return false;
                }
                ActionDialog actionDialog = (ActionDialog) other;
                return L.f(this.title, actionDialog.title) && L.f(this.buttonTitle, actionDialog.buttonTitle) && L.f(this.description, actionDialog.description);
            }

            @k
            public final String getButtonTitle() {
                return this.buttonTitle;
            }

            @k
            public final String getDescription() {
                return this.description;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.description.hashCode() + H.d(this.title.hashCode() * 31, 31, this.buttonTitle);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ActionDialog(title=");
                sb2.append(this.title);
                sb2.append(", buttonTitle=");
                sb2.append(this.buttonTitle);
                sb2.append(", description=");
                return C22026a.c(sb2, this.description, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.buttonTitle);
                parcel.writeString(this.description);
            }
        }

        /* compiled from: CharParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoBeautification> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoBeautification createFromParcel(@k Parcel parcel) {
                return new AutoBeautification(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), LoadingOverlay.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoBeautification[] newArray(int i12) {
                return new AutoBeautification[i12];
            }
        }

        /* compiled from: CharParameter.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification$LoadingOverlay;", "Landroid/os/Parcelable;", "", "errorTitle", "processTitle", "successTitle", "cancelButtonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification$LoadingOverlay;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getErrorTitle", "getProcessTitle", "getSuccessTitle", "getCancelButtonTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class LoadingOverlay implements Parcelable {

            @k
            public static final Parcelable.Creator<LoadingOverlay> CREATOR = new Creator();

            @c("cancelButtonTitle")
            @k
            private final String cancelButtonTitle;

            @c("errorTitle")
            @k
            private final String errorTitle;

            @c("processTitle")
            @k
            private final String processTitle;

            @c("successTitle")
            @k
            private final String successTitle;

            /* compiled from: CharParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LoadingOverlay> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final LoadingOverlay createFromParcel(@k Parcel parcel) {
                    return new LoadingOverlay(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final LoadingOverlay[] newArray(int i12) {
                    return new LoadingOverlay[i12];
                }
            }

            public LoadingOverlay(@k String str, @k String str2, @k String str3, @k String str4) {
                this.errorTitle = str;
                this.processTitle = str2;
                this.successTitle = str3;
                this.cancelButtonTitle = str4;
            }

            public static /* synthetic */ LoadingOverlay copy$default(LoadingOverlay loadingOverlay, String str, String str2, String str3, String str4, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = loadingOverlay.errorTitle;
                }
                if ((i12 & 2) != 0) {
                    str2 = loadingOverlay.processTitle;
                }
                if ((i12 & 4) != 0) {
                    str3 = loadingOverlay.successTitle;
                }
                if ((i12 & 8) != 0) {
                    str4 = loadingOverlay.cancelButtonTitle;
                }
                return loadingOverlay.copy(str, str2, str3, str4);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getErrorTitle() {
                return this.errorTitle;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getProcessTitle() {
                return this.processTitle;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final String getSuccessTitle() {
                return this.successTitle;
            }

            @k
            /* renamed from: component4, reason: from getter */
            public final String getCancelButtonTitle() {
                return this.cancelButtonTitle;
            }

            @k
            public final LoadingOverlay copy(@k String errorTitle, @k String processTitle, @k String successTitle, @k String cancelButtonTitle) {
                return new LoadingOverlay(errorTitle, processTitle, successTitle, cancelButtonTitle);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadingOverlay)) {
                    return false;
                }
                LoadingOverlay loadingOverlay = (LoadingOverlay) other;
                return L.f(this.errorTitle, loadingOverlay.errorTitle) && L.f(this.processTitle, loadingOverlay.processTitle) && L.f(this.successTitle, loadingOverlay.successTitle) && L.f(this.cancelButtonTitle, loadingOverlay.cancelButtonTitle);
            }

            @k
            public final String getCancelButtonTitle() {
                return this.cancelButtonTitle;
            }

            @k
            public final String getErrorTitle() {
                return this.errorTitle;
            }

            @k
            public final String getProcessTitle() {
                return this.processTitle;
            }

            @k
            public final String getSuccessTitle() {
                return this.successTitle;
            }

            public int hashCode() {
                return this.cancelButtonTitle.hashCode() + H.d(H.d(this.errorTitle.hashCode() * 31, 31, this.processTitle), 31, this.successTitle);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("LoadingOverlay(errorTitle=");
                sb2.append(this.errorTitle);
                sb2.append(", processTitle=");
                sb2.append(this.processTitle);
                sb2.append(", successTitle=");
                sb2.append(this.successTitle);
                sb2.append(", cancelButtonTitle=");
                return C22026a.c(sb2, this.cancelButtonTitle, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.errorTitle);
                parcel.writeString(this.processTitle);
                parcel.writeString(this.successTitle);
                parcel.writeString(this.cancelButtonTitle);
            }
        }

        public AutoBeautification(int i12, @k String str, @k String str2, @l String str3, @k LoadingOverlay loadingOverlay) {
            this.minimalSymbolThreshold = i12;
            this.generateButtonTitle = str;
            this.continueWithoutBeautifyButtonTitle = str2;
            this.restoreButtonTitle = str3;
            this.loadingOverlay = loadingOverlay;
        }

        public static /* synthetic */ AutoBeautification copy$default(AutoBeautification autoBeautification, int i12, String str, String str2, String str3, LoadingOverlay loadingOverlay, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = autoBeautification.minimalSymbolThreshold;
            }
            if ((i13 & 2) != 0) {
                str = autoBeautification.generateButtonTitle;
            }
            String str4 = str;
            if ((i13 & 4) != 0) {
                str2 = autoBeautification.continueWithoutBeautifyButtonTitle;
            }
            String str5 = str2;
            if ((i13 & 8) != 0) {
                str3 = autoBeautification.restoreButtonTitle;
            }
            String str6 = str3;
            if ((i13 & 16) != 0) {
                loadingOverlay = autoBeautification.loadingOverlay;
            }
            return autoBeautification.copy(i12, str4, str5, str6, loadingOverlay);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMinimalSymbolThreshold() {
            return this.minimalSymbolThreshold;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getGenerateButtonTitle() {
            return this.generateButtonTitle;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getContinueWithoutBeautifyButtonTitle() {
            return this.continueWithoutBeautifyButtonTitle;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getRestoreButtonTitle() {
            return this.restoreButtonTitle;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final LoadingOverlay getLoadingOverlay() {
            return this.loadingOverlay;
        }

        @k
        public final AutoBeautification copy(int minimalSymbolThreshold, @k String generateButtonTitle, @k String continueWithoutBeautifyButtonTitle, @l String restoreButtonTitle, @k LoadingOverlay loadingOverlay) {
            return new AutoBeautification(minimalSymbolThreshold, generateButtonTitle, continueWithoutBeautifyButtonTitle, restoreButtonTitle, loadingOverlay);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoBeautification)) {
                return false;
            }
            AutoBeautification autoBeautification = (AutoBeautification) other;
            return this.minimalSymbolThreshold == autoBeautification.minimalSymbolThreshold && L.f(this.generateButtonTitle, autoBeautification.generateButtonTitle) && L.f(this.continueWithoutBeautifyButtonTitle, autoBeautification.continueWithoutBeautifyButtonTitle) && L.f(this.restoreButtonTitle, autoBeautification.restoreButtonTitle) && L.f(this.loadingOverlay, autoBeautification.loadingOverlay);
        }

        @k
        public final String getContinueWithoutBeautifyButtonTitle() {
            return this.continueWithoutBeautifyButtonTitle;
        }

        @k
        public final String getGenerateButtonTitle() {
            return this.generateButtonTitle;
        }

        @k
        public final LoadingOverlay getLoadingOverlay() {
            return this.loadingOverlay;
        }

        public final int getMinimalSymbolThreshold() {
            return this.minimalSymbolThreshold;
        }

        @l
        public final String getRestoreButtonTitle() {
            return this.restoreButtonTitle;
        }

        public int hashCode() {
            int iD2 = H.d(H.d(Integer.hashCode(this.minimalSymbolThreshold) * 31, 31, this.generateButtonTitle), 31, this.continueWithoutBeautifyButtonTitle);
            String str = this.restoreButtonTitle;
            return this.loadingOverlay.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public String toString() {
            return "AutoBeautification(minimalSymbolThreshold=" + this.minimalSymbolThreshold + ", generateButtonTitle=" + this.generateButtonTitle + ", continueWithoutBeautifyButtonTitle=" + this.continueWithoutBeautifyButtonTitle + ", restoreButtonTitle=" + this.restoreButtonTitle + ", loadingOverlay=" + this.loadingOverlay + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.minimalSymbolThreshold);
            parcel.writeString(this.generateButtonTitle);
            parcel.writeString(this.continueWithoutBeautifyButtonTitle);
            parcel.writeString(this.restoreButtonTitle);
            this.loadingOverlay.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: CharParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CharParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CharParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(CharParameter.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            DisplayingOptions displayingOptionsCreateFromParcel = parcel.readInt() == 0 ? null : DisplayingOptions.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(CharParameter.class, parcel, arrayList, iL2, 1);
                }
            }
            ParamButton paramButtonCreateFromParcel = parcel.readInt() == 0 ? null : ParamButton.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = a.c(TextualTag.CREATOR, parcel, arrayList3, iC2, 1);
                    i13 = i13;
                }
                arrayList2 = arrayList3;
            }
            InputType inputTypeValueOf = parcel.readInt() == 0 ? null : InputType.valueOf(parcel.readString());
            AutoGeneratedValue autoGeneratedValueCreateFromParcel = parcel.readInt() == 0 ? null : AutoGeneratedValue.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CharParameter(string, string2, z12, z13, attributedText, boolValueOf, string3, string4, displayingOptionsCreateFromParcel, arrayList, paramButtonCreateFromParcel, string5, arrayList2, inputTypeValueOf, autoGeneratedValueCreateFromParcel, boolValueOf2, boolValueOf3, parcel.readInt() == 0 ? null : Widget.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CharParameter[] newArray(int i12) {
            return new CharParameter[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CharParameter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CharParameter$InputType;", "", "(Ljava/lang/String;I)V", "TEXT", "NUMERIC", "URI", "VIN", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InputType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;

        @c("text")
        public static final InputType TEXT = new InputType("TEXT", 0);

        @c(NumericParameter.TYPE)
        public static final InputType NUMERIC = new InputType("NUMERIC", 1);

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        public static final InputType URI = new InputType("URI", 2);

        @c("VIN")
        public static final InputType VIN = new InputType("VIN", 3);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{TEXT, NUMERIC, URI, VIN};
        }

        static {
            InputType[] inputTypeArr$values = $values();
            $VALUES = inputTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(inputTypeArr$values);
        }

        private InputType(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<InputType> getEntries() {
            return $ENTRIES;
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    /* compiled from: CharParameter.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CharParameter$Widget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/CharParameter$Widget$Config;", Navigation.CONFIG, "", "type", "<init>", "(Lcom/avito/android/remote/model/category_parameters/CharParameter$Widget$Config;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/CharParameter$Widget$Config;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/category_parameters/CharParameter$Widget$Config;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/CharParameter$Widget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/CharParameter$Widget$Config;", "getConfig", "Ljava/lang/String;", "getType", "Config", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Widget implements Parcelable {

        @k
        public static final Parcelable.Creator<Widget> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @l
        private final Config config;

        @c("type")
        @l
        private final String type;

        /* compiled from: CharParameter.kt */
        @d
        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJX\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020!HÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020!HÖ\u0001¢\u0006\u0004\b-\u0010.R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010\u001b¨\u0006;"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CharParameter$Widget$Config;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", "onValidationFailedDeeplink", "", "shouldHideValueForAnalytics", "Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription;", "autoDescription", "Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification;", "autoBeautification", "Lcom/avito/android/remote/model/category_parameters/MultigeoConfig;", "multiGeoConfig", "", "jobSuggestLimit", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription;Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification;Lcom/avito/android/remote/model/category_parameters/MultigeoConfig;Ljava/lang/Long;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription;", "component4", "()Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification;", "component5", "()Lcom/avito/android/remote/model/category_parameters/MultigeoConfig;", "component6", "()Ljava/lang/Long;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription;Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification;Lcom/avito/android/remote/model/category_parameters/MultigeoConfig;Ljava/lang/Long;)Lcom/avito/android/remote/model/category_parameters/CharParameter$Widget$Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnValidationFailedDeeplink", "Ljava/lang/Boolean;", "getShouldHideValueForAnalytics", "Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription;", "getAutoDescription", "Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoBeautification;", "getAutoBeautification", "Lcom/avito/android/remote/model/category_parameters/MultigeoConfig;", "getMultiGeoConfig", "Ljava/lang/Long;", "getJobSuggestLimit", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Config implements Parcelable {

            @k
            public static final Parcelable.Creator<Config> CREATOR = new Creator();

            @c("autoBeautification")
            @l
            private final AutoBeautification autoBeautification;

            @c("autoDescription")
            @l
            private final AutoDescription autoDescription;

            @c("limit")
            @l
            private final Long jobSuggestLimit;

            @c("multigeo")
            @l
            private final MultigeoConfig multiGeoConfig;

            @c("onValidationFailedDeeplink")
            @l
            private final DeepLink onValidationFailedDeeplink;

            @c("shouldHideValueForAnalytics")
            @l
            private final Boolean shouldHideValueForAnalytics;

            /* compiled from: CharParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config createFromParcel(@k Parcel parcel) {
                    Boolean boolValueOf;
                    DeepLink deepLink = (DeepLink) parcel.readParcelable(Config.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Config(deepLink, boolValueOf, parcel.readInt() == 0 ? null : AutoDescription.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AutoBeautification.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MultigeoConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config[] newArray(int i12) {
                    return new Config[i12];
                }
            }

            public Config() {
                this(null, null, null, null, null, null, 63, null);
            }

            public static /* synthetic */ Config copy$default(Config config, DeepLink deepLink, Boolean bool, AutoDescription autoDescription, AutoBeautification autoBeautification, MultigeoConfig multigeoConfig, Long l12, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    deepLink = config.onValidationFailedDeeplink;
                }
                if ((i12 & 2) != 0) {
                    bool = config.shouldHideValueForAnalytics;
                }
                Boolean bool2 = bool;
                if ((i12 & 4) != 0) {
                    autoDescription = config.autoDescription;
                }
                AutoDescription autoDescription2 = autoDescription;
                if ((i12 & 8) != 0) {
                    autoBeautification = config.autoBeautification;
                }
                AutoBeautification autoBeautification2 = autoBeautification;
                if ((i12 & 16) != 0) {
                    multigeoConfig = config.multiGeoConfig;
                }
                MultigeoConfig multigeoConfig2 = multigeoConfig;
                if ((i12 & 32) != 0) {
                    l12 = config.jobSuggestLimit;
                }
                return config.copy(deepLink, bool2, autoDescription2, autoBeautification2, multigeoConfig2, l12);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final DeepLink getOnValidationFailedDeeplink() {
                return this.onValidationFailedDeeplink;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final Boolean getShouldHideValueForAnalytics() {
                return this.shouldHideValueForAnalytics;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final AutoDescription getAutoDescription() {
                return this.autoDescription;
            }

            @l
            /* renamed from: component4, reason: from getter */
            public final AutoBeautification getAutoBeautification() {
                return this.autoBeautification;
            }

            @l
            /* renamed from: component5, reason: from getter */
            public final MultigeoConfig getMultiGeoConfig() {
                return this.multiGeoConfig;
            }

            @l
            /* renamed from: component6, reason: from getter */
            public final Long getJobSuggestLimit() {
                return this.jobSuggestLimit;
            }

            @k
            public final Config copy(@l DeepLink onValidationFailedDeeplink, @l Boolean shouldHideValueForAnalytics, @l AutoDescription autoDescription, @l AutoBeautification autoBeautification, @l MultigeoConfig multiGeoConfig, @l Long jobSuggestLimit) {
                return new Config(onValidationFailedDeeplink, shouldHideValueForAnalytics, autoDescription, autoBeautification, multiGeoConfig, jobSuggestLimit);
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
                return L.f(this.onValidationFailedDeeplink, config.onValidationFailedDeeplink) && L.f(this.shouldHideValueForAnalytics, config.shouldHideValueForAnalytics) && L.f(this.autoDescription, config.autoDescription) && L.f(this.autoBeautification, config.autoBeautification) && L.f(this.multiGeoConfig, config.multiGeoConfig) && L.f(this.jobSuggestLimit, config.jobSuggestLimit);
            }

            @l
            public final AutoBeautification getAutoBeautification() {
                return this.autoBeautification;
            }

            @l
            public final AutoDescription getAutoDescription() {
                return this.autoDescription;
            }

            @l
            public final Long getJobSuggestLimit() {
                return this.jobSuggestLimit;
            }

            @l
            public final MultigeoConfig getMultiGeoConfig() {
                return this.multiGeoConfig;
            }

            @l
            public final DeepLink getOnValidationFailedDeeplink() {
                return this.onValidationFailedDeeplink;
            }

            @l
            public final Boolean getShouldHideValueForAnalytics() {
                return this.shouldHideValueForAnalytics;
            }

            public int hashCode() {
                DeepLink deepLink = this.onValidationFailedDeeplink;
                int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
                Boolean bool = this.shouldHideValueForAnalytics;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                AutoDescription autoDescription = this.autoDescription;
                int iHashCode3 = (iHashCode2 + (autoDescription == null ? 0 : autoDescription.hashCode())) * 31;
                AutoBeautification autoBeautification = this.autoBeautification;
                int iHashCode4 = (iHashCode3 + (autoBeautification == null ? 0 : autoBeautification.hashCode())) * 31;
                MultigeoConfig multigeoConfig = this.multiGeoConfig;
                int iHashCode5 = (iHashCode4 + (multigeoConfig == null ? 0 : multigeoConfig.hashCode())) * 31;
                Long l12 = this.jobSuggestLimit;
                return iHashCode5 + (l12 != null ? l12.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Config(onValidationFailedDeeplink=");
                sb2.append(this.onValidationFailedDeeplink);
                sb2.append(", shouldHideValueForAnalytics=");
                sb2.append(this.shouldHideValueForAnalytics);
                sb2.append(", autoDescription=");
                sb2.append(this.autoDescription);
                sb2.append(", autoBeautification=");
                sb2.append(this.autoBeautification);
                sb2.append(", multiGeoConfig=");
                sb2.append(this.multiGeoConfig);
                sb2.append(", jobSuggestLimit=");
                return m.m(sb2, this.jobSuggestLimit, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.onValidationFailedDeeplink, flags);
                Boolean bool = this.shouldHideValueForAnalytics;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                AutoDescription autoDescription = this.autoDescription;
                if (autoDescription == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    autoDescription.writeToParcel(parcel, flags);
                }
                AutoBeautification autoBeautification = this.autoBeautification;
                if (autoBeautification == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    autoBeautification.writeToParcel(parcel, flags);
                }
                MultigeoConfig multigeoConfig = this.multiGeoConfig;
                if (multigeoConfig == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    multigeoConfig.writeToParcel(parcel, flags);
                }
                Long l12 = this.jobSuggestLimit;
                if (l12 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l12);
                }
            }

            public Config(@l DeepLink deepLink, @l Boolean bool, @l AutoDescription autoDescription, @l AutoBeautification autoBeautification, @l MultigeoConfig multigeoConfig, @l Long l12) {
                this.onValidationFailedDeeplink = deepLink;
                this.shouldHideValueForAnalytics = bool;
                this.autoDescription = autoDescription;
                this.autoBeautification = autoBeautification;
                this.multiGeoConfig = multigeoConfig;
                this.jobSuggestLimit = l12;
            }

            public /* synthetic */ Config(DeepLink deepLink, Boolean bool, AutoDescription autoDescription, AutoBeautification autoBeautification, MultigeoConfig multigeoConfig, Long l12, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : deepLink, (i12 & 2) != 0 ? null : bool, (i12 & 4) != 0 ? null : autoDescription, (i12 & 8) != 0 ? null : autoBeautification, (i12 & 16) != 0 ? null : multigeoConfig, (i12 & 32) != 0 ? null : l12);
            }
        }

        /* compiled from: CharParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Widget> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Widget createFromParcel(@k Parcel parcel) {
                return new Widget(parcel.readInt() == 0 ? null : Config.CREATOR.createFromParcel(parcel), parcel.readString());
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
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Widget copy$default(Widget widget, Config config, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                config = widget.config;
            }
            if ((i12 & 2) != 0) {
                str = widget.type;
            }
            return widget.copy(config, str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Config getConfig() {
            return this.config;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @k
        public final Widget copy(@l Config config, @l String type) {
            return new Widget(config, type);
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
            return L.f(this.config, widget.config) && L.f(this.type, widget.type);
        }

        @l
        public final Config getConfig() {
            return this.config;
        }

        @l
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            Config config = this.config;
            int iHashCode = (config == null ? 0 : config.hashCode()) * 31;
            String str = this.type;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Widget(config=");
            sb2.append(this.config);
            sb2.append(", type=");
            return C22026a.c(sb2, this.type, ')');
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
            parcel.writeString(this.type);
        }

        public Widget(@l Config config, @l String str) {
            this.config = config;
            this.type = str;
        }

        public /* synthetic */ Widget(Config config, String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : config, (i12 & 2) != 0 ? null : str);
        }
    }

    public /* synthetic */ CharParameter(String str, String str2, boolean z12, boolean z13, AttributedText attributedText, Boolean bool, String str3, String str4, DisplayingOptions displayingOptions, List list, ParamButton paramButton, String str5, List list2, InputType inputType, AutoGeneratedValue autoGeneratedValue, Boolean bool2, Boolean bool3, Widget widget, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, (i12 & 16) != 0 ? null : attributedText, (i12 & 32) != 0 ? null : bool, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : displayingOptions, (i12 & 512) != 0 ? null : list, (i12 & 1024) != 0 ? null : paramButton, (i12 & 2048) != 0 ? null : str5, (i12 & 4096) != 0 ? null : list2, (i12 & 8192) != 0 ? null : inputType, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : autoGeneratedValue, (32768 & i12) != 0 ? Boolean.FALSE : bool2, (65536 & i12) != 0 ? Boolean.FALSE : bool3, (i12 & 131072) != 0 ? null : widget);
    }

    /* renamed from: component14, reason: from getter */
    private final InputType get_inputType() {
        return this._inputType;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    public final List<Constraint> component10() {
        return this.constraints;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final ParamButton getButton() {
        return this.button;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    public final List<TextualTag> component13() {
        return this.tags;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final AutoGeneratedValue getAutogeneratedValue() {
        return this.autogeneratedValue;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final Widget getWidget() {
        return this.widget;
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
    public final String getHint() {
        return this.hint;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String get_value() {
        return this._value;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @k
    public final CharParameter copy(@k String id2, @k String title, boolean required, boolean immutable, @l AttributedText motivation, @l Boolean updatesForm, @l String hint, @l String _value, @l DisplayingOptions displayingOptions, @l List<? extends Constraint> constraints, @l ParamButton button, @l String placeholder, @l List<TextualTag> tags, @l InputType _inputType, @l AutoGeneratedValue autogeneratedValue, @l Boolean visible, @l Boolean phantom, @l Widget widget) {
        return new CharParameter(id2, title, required, immutable, motivation, updatesForm, hint, _value, displayingOptions, constraints, button, placeholder, tags, _inputType, autogeneratedValue, visible, phantom, widget);
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
        if (!(other instanceof CharParameter)) {
            return false;
        }
        CharParameter charParameter = (CharParameter) other;
        return L.f(this.id, charParameter.id) && L.f(this.title, charParameter.title) && this.required == charParameter.required && this.immutable == charParameter.immutable && L.f(this.motivation, charParameter.motivation) && L.f(this.updatesForm, charParameter.updatesForm) && L.f(this.hint, charParameter.hint) && L.f(this._value, charParameter._value) && L.f(this.displayingOptions, charParameter.displayingOptions) && L.f(this.constraints, charParameter.constraints) && L.f(this.button, charParameter.button) && L.f(this.placeholder, charParameter.placeholder) && L.f(this.tags, charParameter.tags) && this._inputType == charParameter._inputType && L.f(this.autogeneratedValue, charParameter.autogeneratedValue) && L.f(this.visible, charParameter.visible) && L.f(this.phantom, charParameter.phantom) && L.f(this.widget, charParameter.widget);
    }

    @Override // com.avito.android.remote.model.category_parameters.WithAutogeneratedValue
    @l
    public AutoGeneratedValue getAutogeneratedValue() {
        return this.autogeneratedValue;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasAdditionalAction
    @l
    public ParamButton getButton() {
        return this.button;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasConstraints
    @l
    public List<Constraint> getConstraints() {
        return this.constraints;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.TextParameter
    @l
    public DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.TextParameter
    @l
    public String getHint() {
        return this.hint;
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

    @k
    public final InputType getInputType() {
        InputType inputType = this._inputType;
        return inputType == null ? InputType.TEXT : inputType;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @l
    public AttributedText getMotivation() {
        return this.motivation;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.WithOnValidationFailedDeeplink
    @l
    public DeepLink getOnValidationFailedDeeplink() {
        Widget.Config config;
        Widget widget = this.widget;
        if (widget == null || (config = widget.getConfig()) == null) {
            return null;
        }
        return config.getOnValidationFailedDeeplink();
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

    @Override // com.avito.android.remote.model.category_parameters.base.HasHtmlValueSupport
    @l
    public String getRenderedHtmlValue() {
        return this.renderedHtmlValue;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    @l
    public final Boolean getShouldHideValueForAnalytics() {
        Widget.Config config;
        Widget widget = this.widget;
        if (widget == null || (config = widget.getConfig()) == null) {
            return null;
        }
        return config.getShouldHideValueForAnalytics();
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasTags
    @l
    public List<TextualTag> getTags() {
        return this.tags;
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
        String value = getValue();
        return !(value == null || value.length() == 0);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.required), 31, this.immutable);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.hint;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this._value;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displayingOptions;
        int iHashCode5 = (iHashCode4 + (displayingOptions == null ? 0 : displayingOptions.hashCode())) * 31;
        List<Constraint> list = this.constraints;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        ParamButton paramButton = this.button;
        int iHashCode7 = (iHashCode6 + (paramButton == null ? 0 : paramButton.hashCode())) * 31;
        String str3 = this.placeholder;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<TextualTag> list2 = this.tags;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        InputType inputType = this._inputType;
        int iHashCode10 = (iHashCode9 + (inputType == null ? 0 : inputType.hashCode())) * 31;
        AutoGeneratedValue autoGeneratedValue = this.autogeneratedValue;
        int iHashCode11 = (iHashCode10 + (autoGeneratedValue == null ? 0 : autoGeneratedValue.hashCode())) * 31;
        Boolean bool2 = this.visible;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phantom;
        int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Widget widget = this.widget;
        return iHashCode13 + (widget != null ? widget.hashCode() : 0);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasHtmlValueSupport
    public void setRenderedHtmlValue(@l String str) {
        this.renderedHtmlValue = str;
    }

    @k
    public String toString() {
        return "CharParameter(id=" + this.id + ", title=" + this.title + ", required=" + this.required + ", immutable=" + this.immutable + ", motivation=" + this.motivation + ", updatesForm=" + this.updatesForm + ", hint=" + this.hint + ", _value=" + this._value + ", displayingOptions=" + this.displayingOptions + ", constraints=" + this.constraints + ", button=" + this.button + ", placeholder=" + this.placeholder + ", tags=" + this.tags + ", _inputType=" + this._inputType + ", autogeneratedValue=" + this.autogeneratedValue + ", visible=" + this.visible + ", phantom=" + this.phantom + ", widget=" + this.widget + ')';
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
        parcel.writeString(this.hint);
        parcel.writeString(this._value);
        DisplayingOptions displayingOptions = this.displayingOptions;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
        List<Constraint> list = this.constraints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        ParamButton paramButton = this.button;
        if (paramButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paramButton.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.placeholder);
        List<TextualTag> list2 = this.tags;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((TextualTag) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        InputType inputType = this._inputType;
        if (inputType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(inputType.name());
        }
        AutoGeneratedValue autoGeneratedValue = this.autogeneratedValue;
        if (autoGeneratedValue == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autoGeneratedValue.writeToParcel(parcel, flags);
        }
        Boolean bool2 = this.visible;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.phantom;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        Widget widget = this.widget;
        if (widget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widget.writeToParcel(parcel, flags);
        }
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public String get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l String str) {
        this._value = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CharParameter(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l Boolean bool, @l String str3, @l String str4, @l DisplayingOptions displayingOptions, @l List<? extends Constraint> list, @l ParamButton paramButton, @l String str5, @l List<TextualTag> list2, @l InputType inputType, @l AutoGeneratedValue autoGeneratedValue, @l Boolean bool2, @l Boolean bool3, @l Widget widget) {
        this.id = str;
        this.title = str2;
        this.required = z12;
        this.immutable = z13;
        this.motivation = attributedText;
        this.updatesForm = bool;
        this.hint = str3;
        this._value = str4;
        this.displayingOptions = displayingOptions;
        this.constraints = list;
        this.button = paramButton;
        this.placeholder = str5;
        this.tags = list2;
        this._inputType = inputType;
        this.autogeneratedValue = autoGeneratedValue;
        this.visible = bool2;
        this.phantom = bool3;
        this.widget = widget;
    }

    /* compiled from: CharParameter.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0002ABBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\\\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b&\u0010!J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b8\u0010\u0013R(\u00109\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b9\u0010:\u0012\u0004\b?\u0010@\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006C"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription;", "Landroid/os/Parcelable;", "", "timeout", "", "buttonTitle", "buttonSecondaryTitle", "Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription$DescriptionLoadingOverlay;", "overlay", "Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription$ConfirmDialog;", "confirmDialog", "", "needPreviousFieldsValidation", "needPreviousFieldsValidationError", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription$DescriptionLoadingOverlay;Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription$ConfirmDialog;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription$DescriptionLoadingOverlay;", "component5", "()Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription$ConfirmDialog;", "component6", "()Ljava/lang/Boolean;", "component7", "copy", "(JLjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription$DescriptionLoadingOverlay;Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription$ConfirmDialog;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getTimeout", "Ljava/lang/String;", "getButtonTitle", "getButtonSecondaryTitle", "Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription$DescriptionLoadingOverlay;", "getOverlay", "Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription$ConfirmDialog;", "getConfirmDialog", "Ljava/lang/Boolean;", "getNeedPreviousFieldsValidation", "getNeedPreviousFieldsValidationError", "didUserGenerateDescription", "Z", "getDidUserGenerateDescription", "()Z", "setDidUserGenerateDescription", "(Z)V", "getDidUserGenerateDescription$annotations", "()V", "ConfirmDialog", "DescriptionLoadingOverlay", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class AutoDescription implements Parcelable {

        @k
        public static final Parcelable.Creator<AutoDescription> CREATOR = new Creator();

        @c("generateButtonSecondaryTitle")
        @l
        private final String buttonSecondaryTitle;

        @c("generateButtonTitle")
        @k
        private final String buttonTitle;

        @c("actionDialog")
        @k
        private final ConfirmDialog confirmDialog;
        private boolean didUserGenerateDescription;

        @c("needPreviousFieldsValidation")
        @l
        private final Boolean needPreviousFieldsValidation;

        @c("needPreviousFieldsValidationError")
        @l
        private final String needPreviousFieldsValidationError;

        @c("loadingOverlay")
        @k
        private final DescriptionLoadingOverlay overlay;

        @c("pseudoTimeoutMs")
        private final long timeout;

        /* compiled from: CharParameter.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription$ConfirmDialog;", "Landroid/os/Parcelable;", "", "title", "description", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription$ConfirmDialog;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "getButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ConfirmDialog implements Parcelable {

            @k
            public static final Parcelable.Creator<ConfirmDialog> CREATOR = new Creator();

            @c("buttonTitle")
            @k
            private final String button;

            @c("description")
            @k
            private final String description;

            @c("title")
            @k
            private final String title;

            /* compiled from: CharParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ConfirmDialog> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ConfirmDialog createFromParcel(@k Parcel parcel) {
                    return new ConfirmDialog(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final ConfirmDialog[] newArray(int i12) {
                    return new ConfirmDialog[i12];
                }
            }

            public ConfirmDialog(@k String str, @k String str2, @k String str3) {
                this.title = str;
                this.description = str2;
                this.button = str3;
            }

            public static /* synthetic */ ConfirmDialog copy$default(ConfirmDialog confirmDialog, String str, String str2, String str3, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = confirmDialog.title;
                }
                if ((i12 & 2) != 0) {
                    str2 = confirmDialog.description;
                }
                if ((i12 & 4) != 0) {
                    str3 = confirmDialog.button;
                }
                return confirmDialog.copy(str, str2, str3);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final String getButton() {
                return this.button;
            }

            @k
            public final ConfirmDialog copy(@k String title, @k String description, @k String button) {
                return new ConfirmDialog(title, description, button);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ConfirmDialog)) {
                    return false;
                }
                ConfirmDialog confirmDialog = (ConfirmDialog) other;
                return L.f(this.title, confirmDialog.title) && L.f(this.description, confirmDialog.description) && L.f(this.button, confirmDialog.button);
            }

            @k
            public final String getButton() {
                return this.button;
            }

            @k
            public final String getDescription() {
                return this.description;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.button.hashCode() + H.d(this.title.hashCode() * 31, 31, this.description);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ConfirmDialog(title=");
                sb2.append(this.title);
                sb2.append(", description=");
                sb2.append(this.description);
                sb2.append(", button=");
                return C22026a.c(sb2, this.button, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
                parcel.writeString(this.button);
            }
        }

        /* compiled from: CharParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoDescription> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoDescription createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                long j12 = parcel.readLong();
                String string = parcel.readString();
                String string2 = parcel.readString();
                DescriptionLoadingOverlay descriptionLoadingOverlayCreateFromParcel = DescriptionLoadingOverlay.CREATOR.createFromParcel(parcel);
                ConfirmDialog confirmDialogCreateFromParcel = ConfirmDialog.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new AutoDescription(j12, string, string2, descriptionLoadingOverlayCreateFromParcel, confirmDialogCreateFromParcel, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AutoDescription[] newArray(int i12) {
                return new AutoDescription[i12];
            }
        }

        /* compiled from: CharParameter.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription$DescriptionLoadingOverlay;", "Landroid/os/Parcelable;", "", "loadingTitle", "errorTitle", "cancelButtonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/CharParameter$AutoDescription$DescriptionLoadingOverlay;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLoadingTitle", "getErrorTitle", "getCancelButtonTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DescriptionLoadingOverlay implements Parcelable {

            @k
            public static final Parcelable.Creator<DescriptionLoadingOverlay> CREATOR = new Creator();

            @c("cancelButtonTitle")
            @k
            private final String cancelButtonTitle;

            @c("errorTitle")
            @k
            private final String errorTitle;

            @c("processTitle")
            @k
            private final String loadingTitle;

            /* compiled from: CharParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DescriptionLoadingOverlay> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DescriptionLoadingOverlay createFromParcel(@k Parcel parcel) {
                    return new DescriptionLoadingOverlay(parcel.readString(), parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DescriptionLoadingOverlay[] newArray(int i12) {
                    return new DescriptionLoadingOverlay[i12];
                }
            }

            public DescriptionLoadingOverlay(@k String str, @k String str2, @k String str3) {
                this.loadingTitle = str;
                this.errorTitle = str2;
                this.cancelButtonTitle = str3;
            }

            public static /* synthetic */ DescriptionLoadingOverlay copy$default(DescriptionLoadingOverlay descriptionLoadingOverlay, String str, String str2, String str3, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = descriptionLoadingOverlay.loadingTitle;
                }
                if ((i12 & 2) != 0) {
                    str2 = descriptionLoadingOverlay.errorTitle;
                }
                if ((i12 & 4) != 0) {
                    str3 = descriptionLoadingOverlay.cancelButtonTitle;
                }
                return descriptionLoadingOverlay.copy(str, str2, str3);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getLoadingTitle() {
                return this.loadingTitle;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getErrorTitle() {
                return this.errorTitle;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final String getCancelButtonTitle() {
                return this.cancelButtonTitle;
            }

            @k
            public final DescriptionLoadingOverlay copy(@k String loadingTitle, @k String errorTitle, @k String cancelButtonTitle) {
                return new DescriptionLoadingOverlay(loadingTitle, errorTitle, cancelButtonTitle);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DescriptionLoadingOverlay)) {
                    return false;
                }
                DescriptionLoadingOverlay descriptionLoadingOverlay = (DescriptionLoadingOverlay) other;
                return L.f(this.loadingTitle, descriptionLoadingOverlay.loadingTitle) && L.f(this.errorTitle, descriptionLoadingOverlay.errorTitle) && L.f(this.cancelButtonTitle, descriptionLoadingOverlay.cancelButtonTitle);
            }

            @k
            public final String getCancelButtonTitle() {
                return this.cancelButtonTitle;
            }

            @k
            public final String getErrorTitle() {
                return this.errorTitle;
            }

            @k
            public final String getLoadingTitle() {
                return this.loadingTitle;
            }

            public int hashCode() {
                return this.cancelButtonTitle.hashCode() + H.d(this.loadingTitle.hashCode() * 31, 31, this.errorTitle);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("DescriptionLoadingOverlay(loadingTitle=");
                sb2.append(this.loadingTitle);
                sb2.append(", errorTitle=");
                sb2.append(this.errorTitle);
                sb2.append(", cancelButtonTitle=");
                return C22026a.c(sb2, this.cancelButtonTitle, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.loadingTitle);
                parcel.writeString(this.errorTitle);
                parcel.writeString(this.cancelButtonTitle);
            }
        }

        public AutoDescription(long j12, @k String str, @l String str2, @k DescriptionLoadingOverlay descriptionLoadingOverlay, @k ConfirmDialog confirmDialog, @l Boolean bool, @l String str3) {
            this.timeout = j12;
            this.buttonTitle = str;
            this.buttonSecondaryTitle = str2;
            this.overlay = descriptionLoadingOverlay;
            this.confirmDialog = confirmDialog;
            this.needPreviousFieldsValidation = bool;
            this.needPreviousFieldsValidationError = str3;
        }

        /* renamed from: component1, reason: from getter */
        public final long getTimeout() {
            return this.timeout;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getButtonSecondaryTitle() {
            return this.buttonSecondaryTitle;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final DescriptionLoadingOverlay getOverlay() {
            return this.overlay;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final ConfirmDialog getConfirmDialog() {
            return this.confirmDialog;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Boolean getNeedPreviousFieldsValidation() {
            return this.needPreviousFieldsValidation;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getNeedPreviousFieldsValidationError() {
            return this.needPreviousFieldsValidationError;
        }

        @k
        public final AutoDescription copy(long timeout, @k String buttonTitle, @l String buttonSecondaryTitle, @k DescriptionLoadingOverlay overlay, @k ConfirmDialog confirmDialog, @l Boolean needPreviousFieldsValidation, @l String needPreviousFieldsValidationError) {
            return new AutoDescription(timeout, buttonTitle, buttonSecondaryTitle, overlay, confirmDialog, needPreviousFieldsValidation, needPreviousFieldsValidationError);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoDescription)) {
                return false;
            }
            AutoDescription autoDescription = (AutoDescription) other;
            return this.timeout == autoDescription.timeout && L.f(this.buttonTitle, autoDescription.buttonTitle) && L.f(this.buttonSecondaryTitle, autoDescription.buttonSecondaryTitle) && L.f(this.overlay, autoDescription.overlay) && L.f(this.confirmDialog, autoDescription.confirmDialog) && L.f(this.needPreviousFieldsValidation, autoDescription.needPreviousFieldsValidation) && L.f(this.needPreviousFieldsValidationError, autoDescription.needPreviousFieldsValidationError);
        }

        @l
        public final String getButtonSecondaryTitle() {
            return this.buttonSecondaryTitle;
        }

        @k
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @k
        public final ConfirmDialog getConfirmDialog() {
            return this.confirmDialog;
        }

        public final boolean getDidUserGenerateDescription() {
            return this.didUserGenerateDescription;
        }

        @l
        public final Boolean getNeedPreviousFieldsValidation() {
            return this.needPreviousFieldsValidation;
        }

        @l
        public final String getNeedPreviousFieldsValidationError() {
            return this.needPreviousFieldsValidationError;
        }

        @k
        public final DescriptionLoadingOverlay getOverlay() {
            return this.overlay;
        }

        public final long getTimeout() {
            return this.timeout;
        }

        public int hashCode() {
            int iD2 = H.d(Long.hashCode(this.timeout) * 31, 31, this.buttonTitle);
            String str = this.buttonSecondaryTitle;
            int iHashCode = (this.confirmDialog.hashCode() + ((this.overlay.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
            Boolean bool = this.needPreviousFieldsValidation;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.needPreviousFieldsValidationError;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final void setDidUserGenerateDescription(boolean z12) {
            this.didUserGenerateDescription = z12;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AutoDescription(timeout=");
            sb2.append(this.timeout);
            sb2.append(", buttonTitle=");
            sb2.append(this.buttonTitle);
            sb2.append(", buttonSecondaryTitle=");
            sb2.append(this.buttonSecondaryTitle);
            sb2.append(", overlay=");
            sb2.append(this.overlay);
            sb2.append(", confirmDialog=");
            sb2.append(this.confirmDialog);
            sb2.append(", needPreviousFieldsValidation=");
            sb2.append(this.needPreviousFieldsValidation);
            sb2.append(", needPreviousFieldsValidationError=");
            return C22026a.c(sb2, this.needPreviousFieldsValidationError, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeLong(this.timeout);
            parcel.writeString(this.buttonTitle);
            parcel.writeString(this.buttonSecondaryTitle);
            this.overlay.writeToParcel(parcel, flags);
            this.confirmDialog.writeToParcel(parcel, flags);
            Boolean bool = this.needPreviousFieldsValidation;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.needPreviousFieldsValidationError);
        }

        public /* synthetic */ AutoDescription(long j12, String str, String str2, DescriptionLoadingOverlay descriptionLoadingOverlay, ConfirmDialog confirmDialog, Boolean bool, String str3, int i12, C42822w c42822w) {
            this(j12, str, (i12 & 4) != 0 ? null : str2, descriptionLoadingOverlay, confirmDialog, bool, str3);
        }

        public static /* synthetic */ void getDidUserGenerateDescription$annotations() {
        }
    }

    @InterfaceC42830m
    public static /* synthetic */ void getHint$annotations() {
    }

    public static /* synthetic */ void getRenderedHtmlValue$annotations() {
    }
}
