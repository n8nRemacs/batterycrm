package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasAdditionalAction;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.TextParameter;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PriceParameter.kt */
@d
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0003edfB\u0095\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010 J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010 J\u0012\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b-\u0010&J\u0012\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b.\u0010&J\u0012\u0010/\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b1\u00102J¬\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u0010 J\u0010\u00107\u001a\u000206HÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010;\u001a\u00020\u000b2\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u000206HÖ\u0001¢\u0006\u0004\b=\u00108J \u0010B\u001a\u00020A2\u0006\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u000206HÖ\u0001¢\u0006\u0004\bB\u0010CR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010D\u001a\u0004\bE\u0010 R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bF\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010#R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bJ\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bL\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010M\u001a\u0004\bN\u0010(R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010D\u001a\u0004\bO\u0010 \"\u0004\bP\u0010QR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010R\u001a\u0004\bS\u0010+R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010D\u001a\u0004\bT\u0010 R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bU\u0010&R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\bV\u0010&R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010W\u001a\u0004\bX\u00100R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010Y\u001a\u0004\bZ\u00102R \u0010[\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\u0012\n\u0004\b[\u0010I\u0012\u0004\b]\u0010^\u001a\u0004\b\\\u0010\u001eR\"\u0010_\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b_\u0010D\u0012\u0004\ba\u0010^\u001a\u0004\b`\u0010 R\u0014\u0010c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010 ¨\u0006g"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/PriceParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "Lcom/avito/android/remote/model/category_parameters/base/TextParameter;", "Lcom/avito/android/remote/model/category_parameters/base/HasAdditionalAction;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "id", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "", "required", "updatesForm", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "displayingOptions", "_value", "", "Lcom/avito/android/remote/model/category_parameters/Constraint;", "constraints", ChannelContext.Item.PLACEHOLDER, "visible", "phantom", "Lcom/avito/android/remote/model/category_parameters/ParamButton;", "button", "Lcom/avito/android/remote/model/category_parameters/PriceParameter$Widget;", "widget", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;ZLjava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/ParamButton;Lcom/avito/android/remote/model/category_parameters/PriceParameter$Widget;)V", "hasValue", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/text/AttributedText;", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "()Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "component11", "component12", "()Lcom/avito/android/remote/model/category_parameters/ParamButton;", "component13", "()Lcom/avito/android/remote/model/category_parameters/PriceParameter$Widget;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;ZLjava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/ParamButton;Lcom/avito/android/remote/model/category_parameters/PriceParameter$Widget;)Lcom/avito/android/remote/model/category_parameters/PriceParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Z", "getRequired", "Ljava/lang/Boolean;", "getUpdatesForm", "Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "getDisplayingOptions", "get_value", "set_value", "(Ljava/lang/String;)V", "Ljava/util/List;", "getConstraints", "getPlaceholder", "getVisible", "getPhantom", "Lcom/avito/android/remote/model/category_parameters/ParamButton;", "getButton", "Lcom/avito/android/remote/model/category_parameters/PriceParameter$Widget;", "getWidget", "immutable", "getImmutable", "getImmutable$annotations", "()V", "hint", "getHint", "getHint$annotations", "getType", "type", "Companion", "AbnormalPriceData", "Widget", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PriceParameter extends EditableParameter<String> implements TextParameter, HasAdditionalAction, Visibility, Phantom {

    @k
    public static final String TYPE = "price";

    @c("value")
    @l
    private String _value;

    @c("button")
    @l
    private final ParamButton button;

    @c("constraints")
    @l
    private final List<Constraint> constraints;

    @c(Navigation.DISPLAYING)
    @l
    private final DisplayingOptions displayingOptions;

    @l
    private final String hint;

    @c("id")
    @k
    private final String id;
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

    @c("required")
    private final boolean required;

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
    public static final Parcelable.Creator<PriceParameter> CREATOR = new Creator();

    /* compiled from: PriceParameter.kt */
    @d
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/category_parameters/PriceParameter$AbnormalPriceData;", "Landroid/os/Parcelable;", "", "errorMessage", "", "minValue", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/avito/android/remote/model/category_parameters/PriceParameter$AbnormalPriceData;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getErrorMessage", "I", "getMinValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AbnormalPriceData implements Parcelable {

        @k
        public static final Parcelable.Creator<AbnormalPriceData> CREATOR = new Creator();

        @c("errorMessage")
        @k
        private final String errorMessage;

        @c("minValue")
        private final int minValue;

        /* compiled from: PriceParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AbnormalPriceData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AbnormalPriceData createFromParcel(@k Parcel parcel) {
                return new AbnormalPriceData(parcel.readString(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AbnormalPriceData[] newArray(int i12) {
                return new AbnormalPriceData[i12];
            }
        }

        public AbnormalPriceData(@k String str, int i12) {
            this.errorMessage = str;
            this.minValue = i12;
        }

        public static /* synthetic */ AbnormalPriceData copy$default(AbnormalPriceData abnormalPriceData, String str, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = abnormalPriceData.errorMessage;
            }
            if ((i13 & 2) != 0) {
                i12 = abnormalPriceData.minValue;
            }
            return abnormalPriceData.copy(str, i12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMinValue() {
            return this.minValue;
        }

        @k
        public final AbnormalPriceData copy(@k String errorMessage, int minValue) {
            return new AbnormalPriceData(errorMessage, minValue);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AbnormalPriceData)) {
                return false;
            }
            AbnormalPriceData abnormalPriceData = (AbnormalPriceData) other;
            return L.f(this.errorMessage, abnormalPriceData.errorMessage) && this.minValue == abnormalPriceData.minValue;
        }

        @k
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final int getMinValue() {
            return this.minValue;
        }

        public int hashCode() {
            return Integer.hashCode(this.minValue) + (this.errorMessage.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AbnormalPriceData(errorMessage=");
            sb2.append(this.errorMessage);
            sb2.append(", minValue=");
            return r.t(sb2, this.minValue, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.errorMessage);
            parcel.writeInt(this.minValue);
        }
    }

    /* compiled from: PriceParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PriceParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PriceParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(PriceParameter.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            DisplayingOptions displayingOptionsCreateFromParcel = parcel.readInt() == 0 ? null : DisplayingOptions.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(PriceParameter.class, parcel, arrayList, iL2, 1);
                }
            }
            String string4 = parcel.readString();
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
            return new PriceParameter(string, string2, attributedText, z12, boolValueOf, displayingOptionsCreateFromParcel, string3, arrayList, string4, boolValueOf2, boolValueOf3, parcel.readInt() == 0 ? null : ParamButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Widget.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PriceParameter[] newArray(int i12) {
            return new PriceParameter[i12];
        }
    }

    /* compiled from: PriceParameter.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/PriceParameter$Widget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/PriceParameter$Widget$Config;", Navigation.CONFIG, "", "type", "<init>", "(Lcom/avito/android/remote/model/category_parameters/PriceParameter$Widget$Config;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/PriceParameter$Widget$Config;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/category_parameters/PriceParameter$Widget$Config;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/PriceParameter$Widget;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/PriceParameter$Widget$Config;", "getConfig", "Ljava/lang/String;", "getType", "Config", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* compiled from: PriceParameter.kt */
        @d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/PriceParameter$Widget$Config;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/PriceParameter$AbnormalPriceData;", "abnormalPriceData", "<init>", "(Lcom/avito/android/remote/model/category_parameters/PriceParameter$AbnormalPriceData;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/PriceParameter$AbnormalPriceData;", "copy", "(Lcom/avito/android/remote/model/category_parameters/PriceParameter$AbnormalPriceData;)Lcom/avito/android/remote/model/category_parameters/PriceParameter$Widget$Config;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/PriceParameter$AbnormalPriceData;", "getAbnormalPriceData", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Config implements Parcelable {

            @k
            public static final Parcelable.Creator<Config> CREATOR = new Creator();

            @c("abnormalLowPriceData")
            @l
            private final AbnormalPriceData abnormalPriceData;

            /* compiled from: PriceParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config createFromParcel(@k Parcel parcel) {
                    return new Config(parcel.readInt() == 0 ? null : AbnormalPriceData.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config[] newArray(int i12) {
                    return new Config[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Config() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Config copy$default(Config config, AbnormalPriceData abnormalPriceData, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    abnormalPriceData = config.abnormalPriceData;
                }
                return config.copy(abnormalPriceData);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final AbnormalPriceData getAbnormalPriceData() {
                return this.abnormalPriceData;
            }

            @k
            public final Config copy(@l AbnormalPriceData abnormalPriceData) {
                return new Config(abnormalPriceData);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Config) && L.f(this.abnormalPriceData, ((Config) other).abnormalPriceData);
            }

            @l
            public final AbnormalPriceData getAbnormalPriceData() {
                return this.abnormalPriceData;
            }

            public int hashCode() {
                AbnormalPriceData abnormalPriceData = this.abnormalPriceData;
                if (abnormalPriceData == null) {
                    return 0;
                }
                return abnormalPriceData.hashCode();
            }

            @k
            public String toString() {
                return "Config(abnormalPriceData=" + this.abnormalPriceData + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                AbnormalPriceData abnormalPriceData = this.abnormalPriceData;
                if (abnormalPriceData == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    abnormalPriceData.writeToParcel(parcel, flags);
                }
            }

            public Config(@l AbnormalPriceData abnormalPriceData) {
                this.abnormalPriceData = abnormalPriceData;
            }

            public /* synthetic */ Config(AbnormalPriceData abnormalPriceData, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : abnormalPriceData);
            }
        }

        /* compiled from: PriceParameter.kt */
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

    public /* synthetic */ PriceParameter(String str, String str2, AttributedText attributedText, boolean z12, Boolean bool, DisplayingOptions displayingOptions, String str3, List list, String str4, Boolean bool2, Boolean bool3, ParamButton paramButton, Widget widget, int i12, C42822w c42822w) {
        this(str, str2, attributedText, z12, bool, displayingOptions, (i12 & 64) != 0 ? null : str3, list, (i12 & 256) != 0 ? null : str4, (i12 & 512) != 0 ? Boolean.FALSE : bool2, (i12 & 1024) != 0 ? Boolean.FALSE : bool3, (i12 & 2048) != 0 ? null : paramButton, (i12 & 4096) != 0 ? null : widget);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final ParamButton getButton() {
        return this.button;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Widget getWidget() {
        return this.widget;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getMotivation() {
        return this.motivation;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final DisplayingOptions getDisplayingOptions() {
        return this.displayingOptions;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String get_value() {
        return this._value;
    }

    @l
    public final List<Constraint> component8() {
        return this.constraints;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @k
    public final PriceParameter copy(@k String id2, @k String title, @l AttributedText motivation, boolean required, @l Boolean updatesForm, @l DisplayingOptions displayingOptions, @l String _value, @l List<? extends Constraint> constraints, @l String placeholder, @l Boolean visible, @l Boolean phantom, @l ParamButton button, @l Widget widget) {
        return new PriceParameter(id2, title, motivation, required, updatesForm, displayingOptions, _value, constraints, placeholder, visible, phantom, button, widget);
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
        if (!(other instanceof PriceParameter)) {
            return false;
        }
        PriceParameter priceParameter = (PriceParameter) other;
        return L.f(this.id, priceParameter.id) && L.f(this.title, priceParameter.title) && L.f(this.motivation, priceParameter.motivation) && this.required == priceParameter.required && L.f(this.updatesForm, priceParameter.updatesForm) && L.f(this.displayingOptions, priceParameter.displayingOptions) && L.f(this._value, priceParameter._value) && L.f(this.constraints, priceParameter.constraints) && L.f(this.placeholder, priceParameter.placeholder) && L.f(this.visible, priceParameter.visible) && L.f(this.phantom, priceParameter.phantom) && L.f(this.button, priceParameter.button) && L.f(this.widget, priceParameter.widget);
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

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return "price";
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
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        AttributedText attributedText = this.motivation;
        int i12 = r.i((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.required);
        Boolean bool = this.updatesForm;
        int iHashCode = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
        DisplayingOptions displayingOptions = this.displayingOptions;
        int iHashCode2 = (iHashCode + (displayingOptions == null ? 0 : displayingOptions.hashCode())) * 31;
        String str = this._value;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<Constraint> list = this.constraints;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.placeholder;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.visible;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phantom;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        ParamButton paramButton = this.button;
        int iHashCode8 = (iHashCode7 + (paramButton == null ? 0 : paramButton.hashCode())) * 31;
        Widget widget = this.widget;
        return iHashCode8 + (widget != null ? widget.hashCode() : 0);
    }

    @k
    public String toString() {
        return "PriceParameter(id=" + this.id + ", title=" + this.title + ", motivation=" + this.motivation + ", required=" + this.required + ", updatesForm=" + this.updatesForm + ", displayingOptions=" + this.displayingOptions + ", _value=" + this._value + ", constraints=" + this.constraints + ", placeholder=" + this.placeholder + ", visible=" + this.visible + ", phantom=" + this.phantom + ", button=" + this.button + ", widget=" + this.widget + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.motivation, flags);
        parcel.writeInt(this.required ? 1 : 0);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        DisplayingOptions displayingOptions = this.displayingOptions;
        if (displayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displayingOptions.writeToParcel(parcel, flags);
        }
        parcel.writeString(this._value);
        List<Constraint> list = this.constraints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.placeholder);
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
        ParamButton paramButton = this.button;
        if (paramButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paramButton.writeToParcel(parcel, flags);
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
    public PriceParameter(@k String str, @k String str2, @l AttributedText attributedText, boolean z12, @l Boolean bool, @l DisplayingOptions displayingOptions, @l String str3, @l List<? extends Constraint> list, @l String str4, @l Boolean bool2, @l Boolean bool3, @l ParamButton paramButton, @l Widget widget) {
        this.id = str;
        this.title = str2;
        this.motivation = attributedText;
        this.required = z12;
        this.updatesForm = bool;
        this.displayingOptions = displayingOptions;
        this._value = str3;
        this.constraints = list;
        this.placeholder = str4;
        this.visible = bool2;
        this.phantom = bool3;
        this.button = paramButton;
        this.widget = widget;
    }

    @InterfaceC42830m
    public static /* synthetic */ void getHint$annotations() {
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }
}
