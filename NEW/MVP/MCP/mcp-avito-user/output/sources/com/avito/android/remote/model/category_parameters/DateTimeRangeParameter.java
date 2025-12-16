package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DateTimeRangeParameter.kt */
@s0
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 g2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002ghBS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJh\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010\u0014J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020#HÖ\u0001¢\u0006\u0004\b*\u0010%J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020#HÖ\u0001¢\u0006\u0004\b/\u00100R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b3\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010\u001dR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010@R4\u0010C\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010A8\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0004\bC\u0010D\u0012\u0004\bI\u0010J\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0014\u0010L\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0014R\u0014\u0010N\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0012R\u0013\u0010R\u001a\u0004\u0018\u00010O8F¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0013\u0010T\u001a\u0004\u0018\u00010O8F¢\u0006\u0006\u001a\u0004\bS\u0010QR%\u0010Z\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020V\u0018\u00010Uj\u0004\u0018\u0001`W8F¢\u0006\u0006\u001a\u0004\bX\u0010YR\u001f\u0010\\\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010&0U8F¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0011\u0010^\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b]\u0010\u0014R\u0011\u0010`\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b_\u0010\u0014R'\u0010f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010O\u0012\u0006\u0012\u0004\u0018\u00010c0b0a8F¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006i"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "Lcom/avito/android/remote/model/category_parameters/DateTimeRangeValuePair;", "", "id", "title", "", "parameterRequired", "immutable", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter$Widget;", "widget", "updatesForm", "_value", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter$Widget;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DateTimeRangeValuePair;)V", "hasValue", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "component6", "()Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter$Widget;", "component7", "()Ljava/lang/Boolean;", "component8", "()Lcom/avito/android/remote/model/category_parameters/DateTimeRangeValuePair;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZLcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter$Widget;Ljava/lang/Boolean;Lcom/avito/android/remote/model/category_parameters/DateTimeRangeValuePair;)Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Z", "getParameterRequired", "getImmutable", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter$Widget;", "getWidget", "Ljava/lang/Boolean;", "getUpdatesForm", "Lcom/avito/android/remote/model/category_parameters/DateTimeRangeValuePair;", "get_value", "set_value", "(Lcom/avito/android/remote/model/category_parameters/DateTimeRangeValuePair;)V", "Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "value", "error", "Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "getError", "()Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "setError", "(Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;)V", "getError$annotations", "()V", "getType", "type", "getRequired", "required", "Lcom/avito/android/remote/model/category_parameters/DateTimeRangePoint;", "getStart", "()Lcom/avito/android/remote/model/category_parameters/DateTimeRangePoint;", "start", "getEnd", "end", "", "Lcom/avito/android/remote/model/category_parameters/DateTimeRangeWheel;", "Lcom/avito/android/remote/model/category_parameters/DateTimeRangeWheelsContainer;", "getWheels", "()Ljava/util/Map;", "wheels", "getParametersMap", "parametersMap", "getStartId", "startId", "getEndId", "endId", "", "Lkotlin/Q;", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;", "getPointValue", "()Ljava/util/List;", "pointValue", "Companion", "Widget", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes17.dex */
public final /* data */ class DateTimeRangeParameter extends EditableParameter<DateTimeRangeValuePair> {

    @k
    public static final String TYPE = "datetimeRange";

    @c("value")
    @l
    private DateTimeRangeValuePair _value;

    @l
    private transient HasError.Error error;

    @c("id")
    @k
    private final String id;

    @c("immutable")
    private final boolean immutable;

    @c("motivation")
    @l
    private final AttributedText motivation;

    @c("required")
    private final boolean parameterRequired;

    @c("title")
    @k
    private final String title;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("widget")
    @l
    private final Widget widget;

    @k
    public static final Parcelable.Creator<DateTimeRangeParameter> CREATOR = new Creator();

    /* compiled from: DateTimeRangeParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DateTimeRangeParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateTimeRangeParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(DateTimeRangeParameter.class.getClassLoader());
            Widget widgetCreateFromParcel = parcel.readInt() == 0 ? null : Widget.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DateTimeRangeParameter(string, string2, z12, z13, attributedText, widgetCreateFromParcel, boolValueOf, parcel.readInt() != 0 ? DateTimeRangeValuePair.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateTimeRangeParameter[] newArray(int i12) {
            return new DateTimeRangeParameter[i12];
        }
    }

    /* compiled from: DateTimeRangeParameter.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter$Widget;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter$Widget$Config;", Navigation.CONFIG, "<init>", "(Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter$Widget$Config;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter$Widget$Config;", "copy", "(Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter$Widget$Config;)Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter$Widget;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter$Widget$Config;", "getConfig", "Config", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Widget implements Parcelable {

        @k
        public static final Parcelable.Creator<Widget> CREATOR = new Creator();

        @c(Navigation.CONFIG)
        @l
        private final Config config;

        /* compiled from: DateTimeRangeParameter.kt */
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

        /* compiled from: DateTimeRangeParameter.kt */
        @d
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010JF\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\rR.\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0010¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter$Widget$Config;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/DateTimeRangePoint;", "start", "end", "", "", "Lcom/avito/android/remote/model/category_parameters/DateTimeRangeWheel;", "Lcom/avito/android/remote/model/category_parameters/DateTimeRangeWheelsContainer;", "wheels", "<init>", "(Lcom/avito/android/remote/model/category_parameters/DateTimeRangePoint;Lcom/avito/android/remote/model/category_parameters/DateTimeRangePoint;Ljava/util/Map;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/DateTimeRangePoint;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Lcom/avito/android/remote/model/category_parameters/DateTimeRangePoint;Lcom/avito/android/remote/model/category_parameters/DateTimeRangePoint;Ljava/util/Map;)Lcom/avito/android/remote/model/category_parameters/DateTimeRangeParameter$Widget$Config;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/DateTimeRangePoint;", "getStart", "getEnd", "Ljava/util/Map;", "getWheels", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Config implements Parcelable {

            @k
            public static final Parcelable.Creator<Config> CREATOR = new Creator();

            @c("end")
            @l
            private final DateTimeRangePoint end;

            @c("start")
            @l
            private final DateTimeRangePoint start;

            @c("wheels")
            @l
            private final Map<String, DateTimeRangeWheel> wheels;

            /* compiled from: DateTimeRangeParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Config> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config createFromParcel(@k Parcel parcel) {
                    LinkedHashMap linkedHashMap = null;
                    DateTimeRangePoint dateTimeRangePointCreateFromParcel = parcel.readInt() == 0 ? null : DateTimeRangePoint.CREATOR.createFromParcel(parcel);
                    DateTimeRangePoint dateTimeRangePointCreateFromParcel2 = parcel.readInt() == 0 ? null : DateTimeRangePoint.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        int i12 = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                        for (int i13 = 0; i13 != i12; i13++) {
                            linkedHashMap2.put(parcel.readString(), DateTimeRangeWheel.CREATOR.createFromParcel(parcel));
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new Config(dateTimeRangePointCreateFromParcel, dateTimeRangePointCreateFromParcel2, linkedHashMap);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Config[] newArray(int i12) {
                    return new Config[i12];
                }
            }

            public Config(@l DateTimeRangePoint dateTimeRangePoint, @l DateTimeRangePoint dateTimeRangePoint2, @l Map<String, DateTimeRangeWheel> map) {
                this.start = dateTimeRangePoint;
                this.end = dateTimeRangePoint2;
                this.wheels = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Config copy$default(Config config, DateTimeRangePoint dateTimeRangePoint, DateTimeRangePoint dateTimeRangePoint2, Map map, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    dateTimeRangePoint = config.start;
                }
                if ((i12 & 2) != 0) {
                    dateTimeRangePoint2 = config.end;
                }
                if ((i12 & 4) != 0) {
                    map = config.wheels;
                }
                return config.copy(dateTimeRangePoint, dateTimeRangePoint2, map);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final DateTimeRangePoint getStart() {
                return this.start;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final DateTimeRangePoint getEnd() {
                return this.end;
            }

            @l
            public final Map<String, DateTimeRangeWheel> component3() {
                return this.wheels;
            }

            @k
            public final Config copy(@l DateTimeRangePoint start, @l DateTimeRangePoint end, @l Map<String, DateTimeRangeWheel> wheels) {
                return new Config(start, end, wheels);
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
                return L.f(this.start, config.start) && L.f(this.end, config.end) && L.f(this.wheels, config.wheels);
            }

            @l
            public final DateTimeRangePoint getEnd() {
                return this.end;
            }

            @l
            public final DateTimeRangePoint getStart() {
                return this.start;
            }

            @l
            public final Map<String, DateTimeRangeWheel> getWheels() {
                return this.wheels;
            }

            public int hashCode() {
                DateTimeRangePoint dateTimeRangePoint = this.start;
                int iHashCode = (dateTimeRangePoint == null ? 0 : dateTimeRangePoint.hashCode()) * 31;
                DateTimeRangePoint dateTimeRangePoint2 = this.end;
                int iHashCode2 = (iHashCode + (dateTimeRangePoint2 == null ? 0 : dateTimeRangePoint2.hashCode())) * 31;
                Map<String, DateTimeRangeWheel> map = this.wheels;
                return iHashCode2 + (map != null ? map.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Config(start=");
                sb2.append(this.start);
                sb2.append(", end=");
                sb2.append(this.end);
                sb2.append(", wheels=");
                return r.w(sb2, this.wheels, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                DateTimeRangePoint dateTimeRangePoint = this.start;
                if (dateTimeRangePoint == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    dateTimeRangePoint.writeToParcel(parcel, flags);
                }
                DateTimeRangePoint dateTimeRangePoint2 = this.end;
                if (dateTimeRangePoint2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    dateTimeRangePoint2.writeToParcel(parcel, flags);
                }
                Map<String, DateTimeRangeWheel> map = this.wheels;
                if (map == null) {
                    parcel.writeInt(0);
                    return;
                }
                Iterator itH = C0.h(parcel, 1, map);
                while (itH.hasNext()) {
                    Map.Entry entry = (Map.Entry) itH.next();
                    parcel.writeString((String) entry.getKey());
                    ((DateTimeRangeWheel) entry.getValue()).writeToParcel(parcel, flags);
                }
            }

            public /* synthetic */ Config(DateTimeRangePoint dateTimeRangePoint, DateTimeRangePoint dateTimeRangePoint2, Map map, int i12, C42822w c42822w) {
                this(dateTimeRangePoint, dateTimeRangePoint2, (i12 & 4) != 0 ? null : map);
            }
        }

        public /* synthetic */ Widget(Config config, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : config);
        }
    }

    public /* synthetic */ DateTimeRangeParameter(String str, String str2, boolean z12, boolean z13, AttributedText attributedText, Widget widget, Boolean bool, DateTimeRangeValuePair dateTimeRangeValuePair, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, attributedText, (i12 & 32) != 0 ? null : widget, bool, (i12 & 128) != 0 ? null : dateTimeRangeValuePair);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getParameterRequired() {
        return this.parameterRequired;
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
    public final Widget getWidget() {
        return this.widget;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final DateTimeRangeValuePair get_value() {
        return this._value;
    }

    @k
    public final DateTimeRangeParameter copy(@k String id2, @k String title, boolean parameterRequired, boolean immutable, @l AttributedText motivation, @l Widget widget, @l Boolean updatesForm, @l DateTimeRangeValuePair _value) {
        return new DateTimeRangeParameter(id2, title, parameterRequired, immutable, motivation, widget, updatesForm, _value);
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
        if (!(other instanceof DateTimeRangeParameter)) {
            return false;
        }
        DateTimeRangeParameter dateTimeRangeParameter = (DateTimeRangeParameter) other;
        return L.f(this.id, dateTimeRangeParameter.id) && L.f(this.title, dateTimeRangeParameter.title) && this.parameterRequired == dateTimeRangeParameter.parameterRequired && this.immutable == dateTimeRangeParameter.immutable && L.f(this.motivation, dateTimeRangeParameter.motivation) && L.f(this.widget, dateTimeRangeParameter.widget) && L.f(this.updatesForm, dateTimeRangeParameter.updatesForm) && L.f(this._value, dateTimeRangeParameter._value);
    }

    @l
    public final DateTimeRangePoint getEnd() {
        Widget.Config config;
        Widget widget = this.widget;
        if (widget == null || (config = widget.getConfig()) == null) {
            return null;
        }
        return config.getEnd();
    }

    @k
    public final String getEndId() {
        return getId() + "-end";
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter, com.avito.android.remote.model.category_parameters.base.HasError
    @l
    public HasError.Error getError() {
        return this.error;
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

    public final boolean getParameterRequired() {
        return this.parameterRequired;
    }

    @k
    public final Map<String, Object> getParametersMap() {
        DateTimeParameter.Value endValue;
        DateTimeParameter.Value startValue;
        DateTimeRangeValuePair dateTimeRangeValuePair = get_value();
        String formValue = null;
        Q q12 = new Q(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, (dateTimeRangeValuePair == null || (startValue = dateTimeRangeValuePair.getStartValue()) == null) ? null : DateTimeParameterKt.toFormValue(startValue));
        DateTimeRangeValuePair dateTimeRangeValuePair2 = get_value();
        if (dateTimeRangeValuePair2 != null && (endValue = dateTimeRangeValuePair2.getEndValue()) != null) {
            formValue = DateTimeParameterKt.toFormValue(endValue);
        }
        return P0.g(q12, new Q(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, formValue));
    }

    @k
    public final List<Q<DateTimeRangePoint, DateTimeParameter.Value>> getPointValue() {
        DateTimeRangePoint start = getStart();
        DateTimeRangeValuePair value = getValue();
        Q q12 = new Q(start, value != null ? value.getStartValue() : null);
        DateTimeRangePoint end = getEnd();
        DateTimeRangeValuePair value2 = getValue();
        return C42745f0.U(q12, new Q(end, value2 != null ? value2.getEndValue() : null));
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        if (this.parameterRequired) {
            return true;
        }
        DateTimeRangePoint start = getStart();
        if (start != null && start.getRequired()) {
            return true;
        }
        DateTimeRangePoint end = getEnd();
        return end != null && end.getRequired();
    }

    @l
    public final DateTimeRangePoint getStart() {
        Widget.Config config;
        Widget widget = this.widget;
        if (widget == null || (config = widget.getConfig()) == null) {
            return null;
        }
        return config.getStart();
    }

    @k
    public final String getStartId() {
        return getId() + "-start";
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
    public final Map<String, DateTimeRangeWheel> getWheels() {
        Widget.Config config;
        Widget widget = this.widget;
        if (widget == null || (config = widget.getConfig()) == null) {
            return null;
        }
        return config.getWheels();
    }

    @l
    public final Widget getWidget() {
        return this.widget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public boolean hasValue() {
        boolean zBooleanValue;
        List<Q<DateTimeRangePoint, DateTimeParameter.Value>> pointValue = getPointValue();
        ArrayList arrayList = new ArrayList(C42745f0.q(pointValue, 10));
        Iterator<T> it = pointValue.iterator();
        while (true) {
            zBooleanValue = true;
            if (!it.hasNext()) {
                break;
            }
            Q q12 = (Q) it.next();
            DateTimeRangePoint dateTimeRangePoint = (DateTimeRangePoint) q12.f406619b;
            DateTimeParameter.Value value = (DateTimeParameter.Value) q12.f406620c;
            if (((dateTimeRangePoint != null && dateTimeRangePoint.getRequired()) || this.parameterRequired) && value == null) {
                zBooleanValue = false;
            }
            arrayList.add(Boolean.valueOf(zBooleanValue));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            zBooleanValue &= ((Boolean) it2.next()).booleanValue();
        }
        return zBooleanValue;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int i12 = r.i(r.i(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.parameterRequired), 31, this.immutable);
        AttributedText attributedText = this.motivation;
        int iHashCode = (i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Widget widget = this.widget;
        int iHashCode2 = (iHashCode + (widget == null ? 0 : widget.hashCode())) * 31;
        Boolean bool = this.updatesForm;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        DateTimeRangeValuePair dateTimeRangeValuePair = this._value;
        return iHashCode3 + (dateTimeRangeValuePair != null ? dateTimeRangeValuePair.hashCode() : 0);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter, com.avito.android.remote.model.category_parameters.base.HasError
    public void setError(@l HasError.Error error) {
        DateTimeRangePoint start = getStart();
        if (start != null) {
            start.setError(error);
        }
        DateTimeRangePoint end = getEnd();
        if (end != null) {
            end.setError(error);
        }
        this.error = error;
    }

    @k
    public String toString() {
        return "DateTimeRangeParameter(id=" + this.id + ", title=" + this.title + ", parameterRequired=" + this.parameterRequired + ", immutable=" + this.immutable + ", motivation=" + this.motivation + ", widget=" + this.widget + ", updatesForm=" + this.updatesForm + ", _value=" + this._value + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.parameterRequired ? 1 : 0);
        parcel.writeInt(this.immutable ? 1 : 0);
        parcel.writeParcelable(this.motivation, flags);
        Widget widget = this.widget;
        if (widget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widget.writeToParcel(parcel, flags);
        }
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        DateTimeRangeValuePair dateTimeRangeValuePair = this._value;
        if (dateTimeRangeValuePair == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dateTimeRangeValuePair.writeToParcel(parcel, flags);
        }
    }

    public DateTimeRangeParameter(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText, @l Widget widget, @l Boolean bool, @l DateTimeRangeValuePair dateTimeRangeValuePair) {
        this.id = str;
        this.title = str2;
        this.parameterRequired = z12;
        this.immutable = z13;
        this.motivation = attributedText;
        this.widget = widget;
        this.updatesForm = bool;
        this._value = dateTimeRangeValuePair;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public DateTimeRangeValuePair get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l DateTimeRangeValuePair dateTimeRangeValuePair) {
        this._value = dateTimeRangeValuePair;
    }

    public static /* synthetic */ void getError$annotations() {
    }
}
