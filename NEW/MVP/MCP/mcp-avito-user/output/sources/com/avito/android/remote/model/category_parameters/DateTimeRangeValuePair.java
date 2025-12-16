package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DateTimeRangeParameter.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\r¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DateTimeRangeValuePair;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;", "startValue", "endValue", "<init>", "(Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;)V", "Lcom/avito/android/remote/model/category_parameters/SelectionType;", "startTypes", "endTypes", "scaledToUtcTimeZone", "(Lcom/avito/android/remote/model/category_parameters/SelectionType;Lcom/avito/android/remote/model/category_parameters/SelectionType;)Lcom/avito/android/remote/model/category_parameters/DateTimeRangeValuePair;", "component1", "()Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;", "component2", "copy", "(Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;)Lcom/avito/android/remote/model/category_parameters/DateTimeRangeValuePair;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$Value;", "getStartValue", "getEndValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DateTimeRangeValuePair implements Parcelable {

    @k
    public static final Parcelable.Creator<DateTimeRangeValuePair> CREATOR = new Creator();

    @c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
    @l
    private final DateTimeParameter.Value endValue;

    @c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
    @l
    private final DateTimeParameter.Value startValue;

    /* compiled from: DateTimeRangeParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DateTimeRangeValuePair> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateTimeRangeValuePair createFromParcel(@k Parcel parcel) {
            return new DateTimeRangeValuePair((DateTimeParameter.Value) parcel.readParcelable(DateTimeRangeValuePair.class.getClassLoader()), (DateTimeParameter.Value) parcel.readParcelable(DateTimeRangeValuePair.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateTimeRangeValuePair[] newArray(int i12) {
            return new DateTimeRangeValuePair[i12];
        }
    }

    public DateTimeRangeValuePair(@l DateTimeParameter.Value value, @l DateTimeParameter.Value value2) {
        this.startValue = value;
        this.endValue = value2;
    }

    public static /* synthetic */ DateTimeRangeValuePair copy$default(DateTimeRangeValuePair dateTimeRangeValuePair, DateTimeParameter.Value value, DateTimeParameter.Value value2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            value = dateTimeRangeValuePair.startValue;
        }
        if ((i12 & 2) != 0) {
            value2 = dateTimeRangeValuePair.endValue;
        }
        return dateTimeRangeValuePair.copy(value, value2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final DateTimeParameter.Value getStartValue() {
        return this.startValue;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DateTimeParameter.Value getEndValue() {
        return this.endValue;
    }

    @k
    public final DateTimeRangeValuePair copy(@l DateTimeParameter.Value startValue, @l DateTimeParameter.Value endValue) {
        return new DateTimeRangeValuePair(startValue, endValue);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateTimeRangeValuePair)) {
            return false;
        }
        DateTimeRangeValuePair dateTimeRangeValuePair = (DateTimeRangeValuePair) other;
        return L.f(this.startValue, dateTimeRangeValuePair.startValue) && L.f(this.endValue, dateTimeRangeValuePair.endValue);
    }

    @l
    public final DateTimeParameter.Value getEndValue() {
        return this.endValue;
    }

    @l
    public final DateTimeParameter.Value getStartValue() {
        return this.startValue;
    }

    public int hashCode() {
        DateTimeParameter.Value value = this.startValue;
        int iHashCode = (value == null ? 0 : value.hashCode()) * 31;
        DateTimeParameter.Value value2 = this.endValue;
        return iHashCode + (value2 != null ? value2.hashCode() : 0);
    }

    @k
    public final DateTimeRangeValuePair scaledToUtcTimeZone(@l SelectionType startTypes, @l SelectionType endTypes) {
        DateTimeParameter.Value value = this.startValue;
        DateTimeParameter.Value valueScaleToUtcTimeZone = value != null ? DateTimeRangeParameterKt.scaleToUtcTimeZone(value, startTypes) : null;
        DateTimeParameter.Value value2 = this.endValue;
        return new DateTimeRangeValuePair(valueScaleToUtcTimeZone, value2 != null ? DateTimeRangeParameterKt.scaleToUtcTimeZone(value2, endTypes) : null);
    }

    @k
    public String toString() {
        return "DateTimeRangeValuePair(startValue=" + this.startValue + ", endValue=" + this.endValue + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.startValue, flags);
        parcel.writeParcelable(this.endValue, flags);
    }
}
