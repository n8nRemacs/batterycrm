package com.avito.android.date_time_picker;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.date_time_picker.TimePickerDialog;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TimePickerDialog.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerArguments;", "Landroid/os/Parcelable;", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TimePickerArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<TimePickerArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PickerHeaderType f132605b;

    /* renamed from: c, reason: collision with root package name */
    public final int f132606c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TimePickerDialog.PickerWheel f132607d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TimePickerDialog.ValidationErrorType f132608e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final org.threeten.bp.f f132609f;

    /* renamed from: g, reason: collision with root package name */
    public final int f132610g;

    /* renamed from: h, reason: collision with root package name */
    public final int f132611h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TimePickerDialog.ValidationRule f132612i;

    /* renamed from: j, reason: collision with root package name */
    public final int f132613j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f132614k;

    /* compiled from: TimePickerDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TimePickerArguments> {
        @Override // android.os.Parcelable.Creator
        public final TimePickerArguments createFromParcel(Parcel parcel) {
            return new TimePickerArguments(PickerHeaderType.valueOf(parcel.readString()), parcel.readInt(), (TimePickerDialog.PickerWheel) parcel.readParcelable(TimePickerArguments.class.getClassLoader()), TimePickerDialog.ValidationErrorType.valueOf(parcel.readString()), (org.threeten.bp.f) parcel.readSerializable(), parcel.readInt(), parcel.readInt(), (TimePickerDialog.ValidationRule) parcel.readParcelable(TimePickerArguments.class.getClassLoader()), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final TimePickerArguments[] newArray(int i12) {
            return new TimePickerArguments[i12];
        }
    }

    public TimePickerArguments(@Y61.k PickerHeaderType pickerHeaderType, @e0 int i12, @Y61.k TimePickerDialog.PickerWheel pickerWheel, @Y61.k TimePickerDialog.ValidationErrorType validationErrorType, @Y61.k org.threeten.bp.f fVar, int i13, int i14, @Y61.k TimePickerDialog.ValidationRule validationRule, int i15, boolean z12) {
        this.f132605b = pickerHeaderType;
        this.f132606c = i12;
        this.f132607d = pickerWheel;
        this.f132608e = validationErrorType;
        this.f132609f = fVar;
        this.f132610g = i13;
        this.f132611h = i14;
        this.f132612i = validationRule;
        this.f132613j = i15;
        this.f132614k = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimePickerArguments)) {
            return false;
        }
        TimePickerArguments timePickerArguments = (TimePickerArguments) obj;
        return this.f132605b == timePickerArguments.f132605b && this.f132606c == timePickerArguments.f132606c && L.f(this.f132607d, timePickerArguments.f132607d) && this.f132608e == timePickerArguments.f132608e && L.f(this.f132609f, timePickerArguments.f132609f) && this.f132610g == timePickerArguments.f132610g && this.f132611h == timePickerArguments.f132611h && L.f(this.f132612i, timePickerArguments.f132612i) && this.f132613j == timePickerArguments.f132613j && this.f132614k == timePickerArguments.f132614k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f132614k) + r.e(this.f132613j, (this.f132612i.hashCode() + r.e(this.f132611h, r.e(this.f132610g, (this.f132609f.hashCode() + ((this.f132608e.hashCode() + ((this.f132607d.hashCode() + r.e(this.f132606c, this.f132605b.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31), 31)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimePickerArguments(pickerHeaderType=");
        sb2.append(this.f132605b);
        sb2.append(", applyTextRes=");
        sb2.append(this.f132606c);
        sb2.append(", pickerWheel=");
        sb2.append(this.f132607d);
        sb2.append(", validationErrorType=");
        sb2.append(this.f132608e);
        sb2.append(", initialDateTime=");
        sb2.append(this.f132609f);
        sb2.append(", minutesStep=");
        sb2.append(this.f132610g);
        sb2.append(", hoursStep=");
        sb2.append(this.f132611h);
        sb2.append(", validationRule=");
        sb2.append(this.f132612i);
        sb2.append(", pickerTitle=");
        sb2.append(this.f132613j);
        sb2.append(", isCycled=");
        return r.x(sb2, this.f132614k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f132605b.name());
        parcel.writeInt(this.f132606c);
        parcel.writeParcelable(this.f132607d, i12);
        parcel.writeString(this.f132608e.name());
        parcel.writeSerializable(this.f132609f);
        parcel.writeInt(this.f132610g);
        parcel.writeInt(this.f132611h);
        parcel.writeParcelable(this.f132612i, i12);
        parcel.writeInt(this.f132613j);
        parcel.writeInt(this.f132614k ? 1 : 0);
    }

    public /* synthetic */ TimePickerArguments(PickerHeaderType pickerHeaderType, int i12, TimePickerDialog.PickerWheel pickerWheel, TimePickerDialog.ValidationErrorType validationErrorType, org.threeten.bp.f fVar, int i13, int i14, TimePickerDialog.ValidationRule validationRule, int i15, boolean z12, int i16, C42822w c42822w) {
        this((i16 & 1) != 0 ? PickerHeaderType.f132601b : pickerHeaderType, (i16 & 2) != 0 ? R.string.dialog_select : i12, (i16 & 4) != 0 ? TimePickerDialog.PickerWheel.None.f132633b : pickerWheel, (i16 & 8) != 0 ? TimePickerDialog.ValidationErrorType.f132635c : validationErrorType, fVar, (i16 & 32) != 0 ? 1 : i13, (i16 & 64) != 0 ? 1 : i14, (i16 & 128) != 0 ? TimePickerDialog.NoValidationRule.f132629b : validationRule, (i16 & 256) != 0 ? R.string.dialog_time_to_select : i15, (i16 & 512) != 0 ? true : z12);
    }
}
