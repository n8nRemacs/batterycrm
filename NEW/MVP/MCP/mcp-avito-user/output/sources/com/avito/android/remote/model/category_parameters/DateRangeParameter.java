package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.base.Phantom;
import com.avito.android.remote.model.category_parameters.base.Visibility;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DateRangeParameter.kt */
@d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 O2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u00042\u00020\u0005:\u0002OPBK\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017JZ\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b-\u0010\u0013R*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0011\"\u0004\b0\u00101R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b4\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b5\u0010\u0017R \u00106\u001a\u00020\n8\u0016X\u0096D¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109R \u0010<\u001a\u00020\n8\u0016X\u0096D¢\u0006\u0012\n\u0004\b<\u00107\u0012\u0004\b>\u0010;\u001a\u0004\b=\u00109R\"\u0010@\u001a\u0004\u0018\u00010?8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010;\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0013R\u0014\u0010H\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0017R\u0013\u0010L\u001a\u0004\u0018\u00010I8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0013\u0010N\u001a\u0004\u0018\u00010I8F¢\u0006\u0006\u001a\u0004\bM\u0010K¨\u0006Q"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DateRangeParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "Lcom/avito/android/remote/model/category_parameters/base/Visibility;", "Lcom/avito/android/remote/model/category_parameters/base/Phantom;", "", "id", "title", "_value", "", "resetDisabled", "visible", "phantom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getOtherParams", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/category_parameters/DateRangeParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Ljava/util/List;", "get_value", "set_value", "(Ljava/util/List;)V", "Ljava/lang/Boolean;", "getResetDisabled", "getVisible", "getPhantom", "required", "Z", "getRequired", "()Z", "getRequired$annotations", "()V", "immutable", "getImmutable", "getImmutable$annotations", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "()Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation$annotations", "getType", "type", "getUpdatesForm", "updatesForm", "Lcom/avito/android/remote/model/category_parameters/DateRangeParameter$FormattedDateParameter;", "getCheckIn", "()Lcom/avito/android/remote/model/category_parameters/DateRangeParameter$FormattedDateParameter;", "checkIn", "getCheckOut", "checkOut", "Companion", "FormattedDateParameter", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DateRangeParameter extends EditableParameter<List<? extends ParameterSlot>> implements Visibility, Phantom {
    private static final int CHECK_IN_PARAM_IDX = 0;
    private static final int CHECK_OUT_PARAM_IDX = 1;
    private static final int REQUIRED_PARAMS_COUNT = 2;

    @k
    public static final String TYPE = "dateRange";

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private List<? extends ParameterSlot> _value;

    @c("id")
    @k
    private final String id;
    private final boolean immutable;

    @l
    private final AttributedText motivation;

    @c("phantom")
    @l
    private final Boolean phantom;
    private final boolean required;

    @c("resetDisabled")
    @l
    private final Boolean resetDisabled;

    @c("title")
    @k
    private final String title;

    @c("visible")
    @l
    private final Boolean visible;

    @k
    public static final Parcelable.Creator<DateRangeParameter> CREATOR = new Creator();

    /* compiled from: DateRangeParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DateRangeParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateRangeParameter createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(DateRangeParameter.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
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
            return new DateRangeParameter(string, string2, arrayList, boolValueOf, boolValueOf2, boolValueOf3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateRangeParameter[] newArray(int i12) {
            return new DateRangeParameter[i12];
        }
    }

    /* compiled from: DateRangeParameter.kt */
    @s0
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 L2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002LMB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u0012R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u00100R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u0017R \u00103\u001a\u00020 8\u0016X\u0096D¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106R \u00109\u001a\u00020 8\u0016X\u0096D¢\u0006\u0012\n\u0004\b9\u00104\u0012\u0004\b;\u00108\u001a\u0004\b:\u00106R\"\u0010=\u001a\u0004\u0018\u00010<8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u00108\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0012R\u0014\u0010F\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010K\u001a\u00020G8BX\u0082\u0004¢\u0006\f\u0012\u0004\bJ\u00108\u001a\u0004\bH\u0010I¨\u0006N"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DateRangeParameter$FormattedDateParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "", "id", "title", "format", "_value", "Lcom/avito/android/remote/model/category_parameters/DateRangeParameter$FormattedDateParameter$Displaying;", Navigation.DISPLAYING, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/DateRangeParameter$FormattedDateParameter$Displaying;)V", "Ljava/util/Date;", "date", "dateToString", "(Ljava/util/Date;)Ljava/lang/String;", "toDate", "()Ljava/util/Date;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/category_parameters/DateRangeParameter$FormattedDateParameter$Displaying;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/DateRangeParameter$FormattedDateParameter$Displaying;)Lcom/avito/android/remote/model/category_parameters/DateRangeParameter$FormattedDateParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getFormat", "get_value", "set_value", "(Ljava/lang/String;)V", "Lcom/avito/android/remote/model/category_parameters/DateRangeParameter$FormattedDateParameter$Displaying;", "getDisplaying", "required", "Z", "getRequired", "()Z", "getRequired$annotations", "()V", "immutable", "getImmutable", "getImmutable$annotations", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "()Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation$annotations", "getType", "type", "getUpdatesForm", "()Ljava/lang/Boolean;", "updatesForm", "Ljava/text/SimpleDateFormat;", "getDateFormat", "()Ljava/text/SimpleDateFormat;", "getDateFormat$annotations", "dateFormat", "Companion", "Displaying", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class FormattedDateParameter extends EditableParameter<String> {

        @k
        public static final String TYPE = "formattedDate";

        @c("value")
        @l
        private String _value;

        @c(Navigation.DISPLAYING)
        @k
        private final Displaying displaying;

        @c("format")
        @k
        private final String format;

        @c("id")
        @k
        private final String id;
        private final boolean immutable;

        @l
        private final AttributedText motivation;
        private final boolean required;

        @c("title")
        @k
        private final String title;

        @k
        public static final Parcelable.Creator<FormattedDateParameter> CREATOR = new Creator();

        /* compiled from: DateRangeParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FormattedDateParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FormattedDateParameter createFromParcel(@k Parcel parcel) {
                return new FormattedDateParameter(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), Displaying.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final FormattedDateParameter[] newArray(int i12) {
                return new FormattedDateParameter[i12];
            }
        }

        public FormattedDateParameter(@k String str, @k String str2, @k String str3, @l String str4, @k Displaying displaying) {
            this.id = str;
            this.title = str2;
            this.format = str3;
            this._value = str4;
            this.displaying = displaying;
        }

        public static /* synthetic */ FormattedDateParameter copy$default(FormattedDateParameter formattedDateParameter, String str, String str2, String str3, String str4, Displaying displaying, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = formattedDateParameter.id;
            }
            if ((i12 & 2) != 0) {
                str2 = formattedDateParameter.title;
            }
            String str5 = str2;
            if ((i12 & 4) != 0) {
                str3 = formattedDateParameter.format;
            }
            String str6 = str3;
            if ((i12 & 8) != 0) {
                str4 = formattedDateParameter._value;
            }
            String str7 = str4;
            if ((i12 & 16) != 0) {
                displaying = formattedDateParameter.displaying;
            }
            return formattedDateParameter.copy(str, str5, str6, str7, displaying);
        }

        private final SimpleDateFormat getDateFormat() {
            return new SimpleDateFormat(this.format, new Locale("ru", "RU"));
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

        @k
        /* renamed from: component3, reason: from getter */
        public final String getFormat() {
            return this.format;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String get_value() {
            return this._value;
        }

        @k
        /* renamed from: component5, reason: from getter */
        public final Displaying getDisplaying() {
            return this.displaying;
        }

        @k
        public final FormattedDateParameter copy(@k String id2, @k String title, @k String format, @l String _value, @k Displaying displaying) {
            return new FormattedDateParameter(id2, title, format, _value, displaying);
        }

        @k
        public final String dateToString(@k Date date) {
            return getDateFormat().format(date);
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
            if (!(other instanceof FormattedDateParameter)) {
                return false;
            }
            FormattedDateParameter formattedDateParameter = (FormattedDateParameter) other;
            return L.f(this.id, formattedDateParameter.id) && L.f(this.title, formattedDateParameter.title) && L.f(this.format, formattedDateParameter.format) && L.f(this._value, formattedDateParameter._value) && L.f(this.displaying, formattedDateParameter.displaying);
        }

        @k
        public final Displaying getDisplaying() {
            return this.displaying;
        }

        @k
        public final String getFormat() {
            return this.format;
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
            return TYPE;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
        @k
        public Boolean getUpdatesForm() {
            return Boolean.TRUE;
        }

        @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
        public int hashCode() {
            int iD2 = H.d(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.format);
            String str = this._value;
            return this.displaying.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
        }

        @l
        public final Date toDate() {
            String value = getValue();
            if (value != null) {
                return getDateFormat().parse(value);
            }
            return null;
        }

        @k
        public String toString() {
            return "FormattedDateParameter(id=" + this.id + ", title=" + this.title + ", format=" + this.format + ", _value=" + this._value + ", displaying=" + this.displaying + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.format);
            parcel.writeString(this._value);
            this.displaying.writeToParcel(parcel, flags);
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

        /* compiled from: DateRangeParameter.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\r¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DateRangeParameter$FormattedDateParameter$Displaying;", "Landroid/os/Parcelable;", "", "type", ChannelContext.Item.PLACEHOLDER, "", "monthLimit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/avito/android/remote/model/category_parameters/DateRangeParameter$FormattedDateParameter$Displaying;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "getPlaceholder", "Ljava/lang/Integer;", "getMonthLimit", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Displaying implements Parcelable {

            @k
            public static final Parcelable.Creator<Displaying> CREATOR = new Creator();

            @c("monthLimit")
            @l
            private final Integer monthLimit;

            @c(ChannelContext.Item.PLACEHOLDER)
            @l
            private final String placeholder;

            @c("type")
            @k
            private final String type;

            /* compiled from: DateRangeParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Displaying> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Displaying createFromParcel(@k Parcel parcel) {
                    return new Displaying(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Displaying[] newArray(int i12) {
                    return new Displaying[i12];
                }
            }

            public Displaying(@k String str, @l String str2, @l Integer num) {
                this.type = str;
                this.placeholder = str2;
                this.monthLimit = num;
            }

            public static /* synthetic */ Displaying copy$default(Displaying displaying, String str, String str2, Integer num, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = displaying.type;
                }
                if ((i12 & 2) != 0) {
                    str2 = displaying.placeholder;
                }
                if ((i12 & 4) != 0) {
                    num = displaying.monthLimit;
                }
                return displaying.copy(str, str2, num);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final Integer getMonthLimit() {
                return this.monthLimit;
            }

            @k
            public final Displaying copy(@k String type, @l String placeholder, @l Integer monthLimit) {
                return new Displaying(type, placeholder, monthLimit);
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
                return L.f(this.type, displaying.type) && L.f(this.placeholder, displaying.placeholder) && L.f(this.monthLimit, displaying.monthLimit);
            }

            @l
            public final Integer getMonthLimit() {
                return this.monthLimit;
            }

            @l
            public final String getPlaceholder() {
                return this.placeholder;
            }

            @k
            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                String str = this.placeholder;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                Integer num = this.monthLimit;
                return iHashCode2 + (num != null ? num.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Displaying(type=");
                sb2.append(this.type);
                sb2.append(", placeholder=");
                sb2.append(this.placeholder);
                sb2.append(", monthLimit=");
                return s.j(sb2, this.monthLimit, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.type);
                parcel.writeString(this.placeholder);
                Integer num = this.monthLimit;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    a.C(parcel, 1, num);
                }
            }

            public /* synthetic */ Displaying(String str, String str2, Integer num, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : num);
            }
        }

        private static /* synthetic */ void getDateFormat$annotations() {
        }

        public static /* synthetic */ void getImmutable$annotations() {
        }

        public static /* synthetic */ void getMotivation$annotations() {
        }

        public static /* synthetic */ void getRequired$annotations() {
        }
    }

    public /* synthetic */ DateRangeParameter(String str, String str2, List list, Boolean bool, Boolean bool2, Boolean bool3, int i12, C42822w c42822w) {
        this(str, str2, list, (i12 & 8) != 0 ? Boolean.FALSE : bool, (i12 & 16) != 0 ? Boolean.FALSE : bool2, (i12 & 32) != 0 ? Boolean.FALSE : bool3);
    }

    public static /* synthetic */ DateRangeParameter copy$default(DateRangeParameter dateRangeParameter, String str, String str2, List list, Boolean bool, Boolean bool2, Boolean bool3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = dateRangeParameter.id;
        }
        if ((i12 & 2) != 0) {
            str2 = dateRangeParameter.title;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            list = dateRangeParameter._value;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            bool = dateRangeParameter.resetDisabled;
        }
        Boolean bool4 = bool;
        if ((i12 & 16) != 0) {
            bool2 = dateRangeParameter.visible;
        }
        Boolean bool5 = bool2;
        if ((i12 & 32) != 0) {
            bool3 = dateRangeParameter.phantom;
        }
        return dateRangeParameter.copy(str, str3, list2, bool4, bool5, bool3);
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

    @l
    public final List<ParameterSlot> component3() {
        return this._value;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getResetDisabled() {
        return this.resetDisabled;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getPhantom() {
        return this.phantom;
    }

    @k
    public final DateRangeParameter copy(@k String id2, @k String title, @l List<? extends ParameterSlot> _value, @l Boolean resetDisabled, @l Boolean visible, @l Boolean phantom) {
        return new DateRangeParameter(id2, title, _value, resetDisabled, visible, phantom);
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
        if (!(other instanceof DateRangeParameter)) {
            return false;
        }
        DateRangeParameter dateRangeParameter = (DateRangeParameter) other;
        return L.f(this.id, dateRangeParameter.id) && L.f(this.title, dateRangeParameter.title) && L.f(this._value, dateRangeParameter._value) && L.f(this.resetDisabled, dateRangeParameter.resetDisabled) && L.f(this.visible, dateRangeParameter.visible) && L.f(this.phantom, dateRangeParameter.phantom);
    }

    @l
    public final FormattedDateParameter getCheckIn() {
        List<? extends ParameterSlot> value = getValue();
        ParameterSlot parameterSlot = value != null ? (ParameterSlot) C42745f0.K(0, value) : null;
        if (parameterSlot instanceof FormattedDateParameter) {
            return (FormattedDateParameter) parameterSlot;
        }
        return null;
    }

    @l
    public final FormattedDateParameter getCheckOut() {
        List<? extends ParameterSlot> value = getValue();
        ParameterSlot parameterSlot = value != null ? (ParameterSlot) C42745f0.K(1, value) : null;
        if (parameterSlot instanceof FormattedDateParameter) {
            return (FormattedDateParameter) parameterSlot;
        }
        return null;
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

    @k
    public final List<ParameterSlot> getOtherParams() {
        List<? extends ParameterSlot> value = getValue();
        return value == null ? C42784z0.f406748b : value.size() > 2 ? value.subList(2, value.size()) : C42784z0.f406748b;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Phantom
    @l
    public Boolean getPhantom() {
        return this.phantom;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    @l
    public final Boolean getResetDisabled() {
        return this.resetDisabled;
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
    @k
    public Boolean getUpdatesForm() {
        return Boolean.TRUE;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.Visibility
    @l
    public Boolean getVisible() {
        return this.visible;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        List<? extends ParameterSlot> list = this._value;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.resetDisabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.visible;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.phantom;
        return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DateRangeParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", _value=");
        sb2.append(this._value);
        sb2.append(", resetDisabled=");
        sb2.append(this.resetDisabled);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", phantom=");
        return C0.g(sb2, this.phantom, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        List<? extends ParameterSlot> list = this._value;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Boolean bool = this.resetDisabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
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
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public List<? extends ParameterSlot> get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l List<? extends ParameterSlot> list) {
        this._value = list;
    }

    public DateRangeParameter(@k String str, @k String str2, @l List<? extends ParameterSlot> list, @l Boolean bool, @l Boolean bool2, @l Boolean bool3) {
        this.id = str;
        this.title = str2;
        this._value = list;
        this.resetDisabled = bool;
        this.visible = bool2;
        this.phantom = bool3;
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getMotivation$annotations() {
    }

    public static /* synthetic */ void getRequired$annotations() {
    }
}
