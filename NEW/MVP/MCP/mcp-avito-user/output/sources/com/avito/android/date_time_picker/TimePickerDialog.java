package com.avito.android.date_time_picker;

import Y61.l;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.lib.design.picker.m;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.internal.n;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: TimePickerDialog.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialog;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "AfterThanProvidedValidationRule", "BeforeThanProvidedValidationRule", "NoValidationRule", "NotLaterThanNowValidationRule", "PickerWheel", "ValidationErrorType", "ValidationRule", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimePickerDialog extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final TimePickerArguments f132615E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final l41.g<org.threeten.bp.f> f132616F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final String f132617G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final Object f132618H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final Object f132619I;

    /* renamed from: J, reason: collision with root package name */
    public int f132620J;

    /* renamed from: K, reason: collision with root package name */
    public int f132621K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f132622L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public String f132623M;

    /* renamed from: N, reason: collision with root package name */
    public Button f132624N;

    /* renamed from: O, reason: collision with root package name */
    public Picker f132625O;

    /* renamed from: P, reason: collision with root package name */
    public TextView f132626P;

    /* compiled from: TimePickerDialog.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialog$AfterThanProvidedValidationRule;", "Lcom/avito/android/date_time_picker/TimePickerDialog$ValidationRule;", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AfterThanProvidedValidationRule implements ValidationRule {

        @Y61.k
        public static final Parcelable.Creator<AfterThanProvidedValidationRule> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final org.threeten.bp.f f132627b;

        /* compiled from: TimePickerDialog.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AfterThanProvidedValidationRule> {
            @Override // android.os.Parcelable.Creator
            public final AfterThanProvidedValidationRule createFromParcel(Parcel parcel) {
                return new AfterThanProvidedValidationRule((org.threeten.bp.f) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final AfterThanProvidedValidationRule[] newArray(int i12) {
                return new AfterThanProvidedValidationRule[i12];
            }
        }

        public AfterThanProvidedValidationRule(@Y61.k org.threeten.bp.f fVar) {
            this.f132627b = fVar;
        }

        @Override // com.avito.android.date_time_picker.TimePickerDialog.ValidationRule
        public final boolean G3(@Y61.k org.threeten.bp.f fVar, int i12, int i13) {
            return fVar.R(i12).S(i13).C(this.f132627b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeSerializable(this.f132627b);
        }
    }

    /* compiled from: TimePickerDialog.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialog$BeforeThanProvidedValidationRule;", "Lcom/avito/android/date_time_picker/TimePickerDialog$ValidationRule;", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BeforeThanProvidedValidationRule implements ValidationRule {

        @Y61.k
        public static final Parcelable.Creator<BeforeThanProvidedValidationRule> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final org.threeten.bp.f f132628b;

        /* compiled from: TimePickerDialog.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BeforeThanProvidedValidationRule> {
            @Override // android.os.Parcelable.Creator
            public final BeforeThanProvidedValidationRule createFromParcel(Parcel parcel) {
                return new BeforeThanProvidedValidationRule((org.threeten.bp.f) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final BeforeThanProvidedValidationRule[] newArray(int i12) {
                return new BeforeThanProvidedValidationRule[i12];
            }
        }

        public BeforeThanProvidedValidationRule(@Y61.k org.threeten.bp.f fVar) {
            this.f132628b = fVar;
        }

        @Override // com.avito.android.date_time_picker.TimePickerDialog.ValidationRule
        public final boolean G3(@Y61.k org.threeten.bp.f fVar, int i12, int i13) {
            return fVar.R(i12).S(i13).E(this.f132628b);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeSerializable(this.f132628b);
        }
    }

    /* compiled from: TimePickerDialog.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialog$NoValidationRule;", "Lcom/avito/android/date_time_picker/TimePickerDialog$ValidationRule;", "<init>", "()V", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoValidationRule implements ValidationRule {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final NoValidationRule f132629b = new NoValidationRule();

        @Y61.k
        public static final Parcelable.Creator<NoValidationRule> CREATOR = new a();

        /* compiled from: TimePickerDialog.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NoValidationRule> {
            @Override // android.os.Parcelable.Creator
            public final NoValidationRule createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NoValidationRule.f132629b;
            }

            @Override // android.os.Parcelable.Creator
            public final NoValidationRule[] newArray(int i12) {
                return new NoValidationRule[i12];
            }
        }

        @Override // com.avito.android.date_time_picker.TimePickerDialog.ValidationRule
        public final boolean G3(@Y61.k org.threeten.bp.f fVar, int i12, int i13) {
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: TimePickerDialog.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialog$NotLaterThanNowValidationRule;", "Lcom/avito/android/date_time_picker/TimePickerDialog$ValidationRule;", "<init>", "()V", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotLaterThanNowValidationRule implements ValidationRule {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final NotLaterThanNowValidationRule f132630b = new NotLaterThanNowValidationRule();

        @Y61.k
        public static final Parcelable.Creator<NotLaterThanNowValidationRule> CREATOR = new a();

        /* compiled from: TimePickerDialog.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NotLaterThanNowValidationRule> {
            @Override // android.os.Parcelable.Creator
            public final NotLaterThanNowValidationRule createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NotLaterThanNowValidationRule.f132630b;
            }

            @Override // android.os.Parcelable.Creator
            public final NotLaterThanNowValidationRule[] newArray(int i12) {
                return new NotLaterThanNowValidationRule[i12];
            }
        }

        @Override // com.avito.android.date_time_picker.TimePickerDialog.ValidationRule
        public final boolean G3(@Y61.k org.threeten.bp.f fVar, int i12, int i13) {
            return fVar.R(i12).S(i13).C(org.threeten.bp.f.F());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: TimePickerDialog.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialog$PickerWheel;", "Landroid/os/Parcelable;", "EndAfterStart", "EndBeforeStart", "None", "Lcom/avito/android/date_time_picker/TimePickerDialog$PickerWheel$EndAfterStart;", "Lcom/avito/android/date_time_picker/TimePickerDialog$PickerWheel$EndBeforeStart;", "Lcom/avito/android/date_time_picker/TimePickerDialog$PickerWheel$None;", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PickerWheel extends Parcelable {

        /* compiled from: TimePickerDialog.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialog$PickerWheel$EndAfterStart;", "Lcom/avito/android/date_time_picker/TimePickerDialog$PickerWheel;", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class EndAfterStart implements PickerWheel {

            @Y61.k
            public static final Parcelable.Creator<EndAfterStart> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final org.threeten.bp.g f132631b;

            /* compiled from: TimePickerDialog.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<EndAfterStart> {
                @Override // android.os.Parcelable.Creator
                public final EndAfterStart createFromParcel(Parcel parcel) {
                    return new EndAfterStart((org.threeten.bp.g) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final EndAfterStart[] newArray(int i12) {
                    return new EndAfterStart[i12];
                }
            }

            public EndAfterStart(@Y61.k org.threeten.bp.g gVar) {
                this.f132631b = gVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EndAfterStart) && L.f(this.f132631b, ((EndAfterStart) obj).f132631b);
            }

            public final int hashCode() {
                return this.f132631b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return org.webrtc.h.f(new StringBuilder("EndAfterStart(localTime="), this.f132631b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeSerializable(this.f132631b);
            }
        }

        /* compiled from: TimePickerDialog.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialog$PickerWheel$EndBeforeStart;", "Lcom/avito/android/date_time_picker/TimePickerDialog$PickerWheel;", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class EndBeforeStart implements PickerWheel {

            @Y61.k
            public static final Parcelable.Creator<EndBeforeStart> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final org.threeten.bp.g f132632b;

            /* compiled from: TimePickerDialog.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<EndBeforeStart> {
                @Override // android.os.Parcelable.Creator
                public final EndBeforeStart createFromParcel(Parcel parcel) {
                    return new EndBeforeStart((org.threeten.bp.g) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final EndBeforeStart[] newArray(int i12) {
                    return new EndBeforeStart[i12];
                }
            }

            public EndBeforeStart(@Y61.k org.threeten.bp.g gVar) {
                this.f132632b = gVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EndBeforeStart) && L.f(this.f132632b, ((EndBeforeStart) obj).f132632b);
            }

            public final int hashCode() {
                return this.f132632b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return org.webrtc.h.f(new StringBuilder("EndBeforeStart(localTime="), this.f132632b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeSerializable(this.f132632b);
            }
        }

        /* compiled from: TimePickerDialog.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialog$PickerWheel$None;", "Lcom/avito/android/date_time_picker/TimePickerDialog$PickerWheel;", "<init>", "()V", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class None implements PickerWheel {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final None f132633b = new None();

            @Y61.k
            public static final Parcelable.Creator<None> CREATOR = new a();

            /* compiled from: TimePickerDialog.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<None> {
                @Override // android.os.Parcelable.Creator
                public final None createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return None.f132633b;
                }

                @Override // android.os.Parcelable.Creator
                public final None[] newArray(int i12) {
                    return new None[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof None);
            }

            public final int hashCode() {
                return 467245968;
            }

            @Y61.k
            public final String toString() {
                return "None";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TimePickerDialog.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialog$ValidationErrorType;", "", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ValidationErrorType {

        /* renamed from: b, reason: collision with root package name */
        public static final ValidationErrorType f132634b;

        /* renamed from: c, reason: collision with root package name */
        public static final ValidationErrorType f132635c;

        /* renamed from: d, reason: collision with root package name */
        public static final ValidationErrorType f132636d;

        /* renamed from: e, reason: collision with root package name */
        public static final ValidationErrorType f132637e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ValidationErrorType[] f132638f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f132639g;

        static {
            ValidationErrorType validationErrorType = new ValidationErrorType("BLOCK_APPLY_BUTTON", 0);
            f132634b = validationErrorType;
            ValidationErrorType validationErrorType2 = new ValidationErrorType("SHOW_ERROR_TEXT", 1);
            f132635c = validationErrorType2;
            ValidationErrorType validationErrorType3 = new ValidationErrorType("SHOW_ERROR_TOAST", 2);
            f132636d = validationErrorType3;
            ValidationErrorType validationErrorType4 = new ValidationErrorType("IGNORE_ERROR", 3);
            f132637e = validationErrorType4;
            ValidationErrorType[] validationErrorTypeArr = {validationErrorType, validationErrorType2, validationErrorType3, validationErrorType4};
            f132638f = validationErrorTypeArr;
            f132639g = kotlin.enums.c.a(validationErrorTypeArr);
        }

        public ValidationErrorType() {
            throw null;
        }

        public static ValidationErrorType valueOf(String str) {
            return (ValidationErrorType) Enum.valueOf(ValidationErrorType.class, str);
        }

        public static ValidationErrorType[] values() {
            return (ValidationErrorType[]) f132638f.clone();
        }
    }

    /* compiled from: TimePickerDialog.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialog$ValidationRule;", "Landroid/os/Parcelable;", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ValidationRule extends Parcelable {
        boolean G3(@Y61.k org.threeten.bp.f fVar, int i12, int i13);
    }

    /* compiled from: TimePickerDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<View, G0> {
        public a() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.C] */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            Picker picker = (Picker) view2.findViewById(R.id.picker);
            TimePickerDialog timePickerDialog = TimePickerDialog.this;
            timePickerDialog.f132625O = picker;
            timePickerDialog.f132626P = (TextView) view2.findViewById(R.id.picker_status);
            com.avito.android.lib.design.bottom_sheet.d.I(timePickerDialog, true);
            Picker picker2 = timePickerDialog.f132625O;
            if (picker2 == null) {
                picker2 = null;
            }
            ?? r42 = timePickerDialog.f132618H;
            List list = (List) r42.getValue();
            TimePickerArguments timePickerArguments = timePickerDialog.f132615E;
            Picker.d(picker2, list, new m(null, timePickerArguments.f132614k, 0, 5, null), 12);
            picker2.a(":");
            ?? r52 = timePickerDialog.f132619I;
            Picker.d(picker2, (List) r52.getValue(), new m(null, timePickerArguments.f132614k, 0, 5, null), 12);
            picker2.setFirstWheelValue((com.avito.android.lib.design.picker.k) ((List) r42.getValue()).get((timePickerDialog.f132620J - ((Number) timePickerDialog.f132622L.getValue()).intValue()) / timePickerArguments.f132611h));
            picker2.setSecondWheelValue((com.avito.android.lib.design.picker.k) ((List) r52.getValue()).get(timePickerDialog.f132621K / timePickerArguments.f132610g));
            Button button = timePickerDialog.f132624N;
            if (button == null) {
                button = null;
            }
            D6.k(button);
            Button button2 = timePickerDialog.f132624N;
            if (button2 == null) {
                button2 = null;
            }
            button2.setText(timePickerDialog.f132617G);
            g gVar = new g(timePickerDialog);
            picker2.setOnScrollStartedCallback(gVar);
            picker2.setOnSecondScrollStartedCallback(gVar);
            picker2.setOnSelection(new com.avito.android.date_time_picker.f(timePickerDialog));
            Button button3 = timePickerDialog.f132624N;
            (button3 != null ? button3 : null).setOnClickListener(new com.avito.android.comfortable_deal.deal.item.agent.h(timePickerDialog, 23));
            return G0.f406611a;
        }
    }

    /* compiled from: TimePickerDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<View, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            TimePickerDialog.this.f132624N = (Button) view.findViewById(R.id.apply);
            return G0.f406611a;
        }
    }

    /* compiled from: TimePickerDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[PickerHeaderType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PickerHeaderType pickerHeaderType = PickerHeaderType.f132601b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ValidationErrorType.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ValidationErrorType validationErrorType = ValidationErrorType.f132634b;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ValidationErrorType validationErrorType2 = ValidationErrorType.f132634b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ValidationErrorType validationErrorType3 = ValidationErrorType.f132634b;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: TimePickerDialog.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Integer> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            TimePickerDialog timePickerDialog = TimePickerDialog.this;
            PickerWheel pickerWheel = timePickerDialog.f132615E.f132607d;
            int iIntValue = 0;
            if (pickerWheel instanceof PickerWheel.EndAfterStart) {
                Integer numValueOf = Integer.valueOf(((PickerWheel.EndAfterStart) pickerWheel).f132631b.f422072b);
                Integer numValueOf2 = Integer.valueOf(((PickerWheel.EndAfterStart) timePickerDialog.f132615E.f132607d).f132631b.f422072b);
                Integer numValueOf3 = Integer.valueOf(((PickerWheel.EndAfterStart) r0.f132607d).f132631b.f422072b - 1);
                if (!numValueOf.equals(0)) {
                    numValueOf2 = numValueOf3;
                }
                iIntValue = numValueOf2.intValue();
            } else if (!(pickerWheel instanceof PickerWheel.EndBeforeStart) && !L.f(pickerWheel, PickerWheel.None.f132633b)) {
                throw new NoWhenBranchMatchedException();
            }
            return Integer.valueOf(iIntValue);
        }
    }

    /* compiled from: TimePickerDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/lib/design/picker/k;", "", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<List<? extends com.avito.android.lib.design.picker.k<Integer>>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends com.avito.android.lib.design.picker.k<Integer>> invoke() {
            TimePickerDialog timePickerDialog = TimePickerDialog.this;
            PickerWheel pickerWheel = timePickerDialog.f132615E.f132607d;
            int iIntValue = 1;
            if (pickerWheel instanceof PickerWheel.EndAfterStart) {
                Integer numValueOf = Integer.valueOf(((PickerWheel.EndAfterStart) pickerWheel).f132631b.f422072b);
                if (numValueOf.equals(0)) {
                    numValueOf = 1;
                }
                iIntValue = numValueOf.intValue();
            } else if (pickerWheel instanceof PickerWheel.EndBeforeStart) {
                iIntValue = 0;
            } else if (!L.f(pickerWheel, PickerWheel.None.f132633b)) {
                throw new NoWhenBranchMatchedException();
            }
            TimePickerArguments timePickerArguments = timePickerDialog.f132615E;
            PickerWheel pickerWheel2 = timePickerArguments.f132607d;
            int iIntValue2 = 24;
            if (!(pickerWheel2 instanceof PickerWheel.EndAfterStart)) {
                if (pickerWheel2 instanceof PickerWheel.EndBeforeStart) {
                    Integer numValueOf2 = Integer.valueOf(((PickerWheel.EndBeforeStart) pickerWheel2).f132632b.f422072b);
                    if (numValueOf2.equals(0)) {
                        numValueOf2 = 24;
                    }
                    iIntValue2 = numValueOf2.intValue();
                } else if (!L.f(pickerWheel2, PickerWheel.None.f132633b)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return TimePickerDialog.V(timePickerDialog, iIntValue, iIntValue2, timePickerArguments.f132611h);
        }
    }

    /* compiled from: TimePickerDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lcom/avito/android/lib/design/picker/k;", "", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<List<? extends com.avito.android.lib.design.picker.k<Integer>>> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends com.avito.android.lib.design.picker.k<Integer>> invoke() {
            TimePickerDialog timePickerDialog = TimePickerDialog.this;
            return TimePickerDialog.V(timePickerDialog, 0, 59, timePickerDialog.f132615E.f132610g);
        }
    }

    public TimePickerDialog(@Y61.k Context context, @Y61.k TimePickerArguments timePickerArguments, @Y61.k l41.g<org.threeten.bp.f> gVar) {
        super(context, 0, 2, null);
        this.f132615E = timePickerArguments;
        this.f132616F = gVar;
        this.f132617G = context.getString(timePickerArguments.f132606c);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f132618H = C42727D.b(lazyThreadSafetyMode, new e());
        this.f132619I = C42727D.b(lazyThreadSafetyMode, new f());
        this.f132622L = C42727D.c(new d());
        this.f132623M = context.getString(R.string.dialog_time_error);
        org.threeten.bp.f fVar = timePickerArguments.f132609f;
        Integer numValueOf = Integer.valueOf(fVar.f421949c.f422072b);
        org.threeten.bp.g gVar2 = fVar.f421949c;
        this.f132620J = (numValueOf.equals(0) ? 23 : Integer.valueOf(gVar2.f422072b - 1)).intValue();
        this.f132621K = gVar2.f422073c;
        S(C35835l0.g(context).y);
        B(R.layout.time_picker_dialog, R.layout.time_picker_dialog_footer, new a(), new b(), true);
        String string = context.getString(timePickerArguments.f132613j);
        int iOrdinal = timePickerArguments.f132605b.ordinal();
        if (iOrdinal == 0) {
            com.avito.android.lib.design.bottom_sheet.j.c(this, string, true, 0, 0, 0, 120);
        } else {
            if (iOrdinal != 1) {
                return;
            }
            com.avito.android.lib.design.bottom_sheet.d.M(this, string, true, true, 2);
        }
    }

    public static final ArrayList V(TimePickerDialog timePickerDialog, int i12, int i13, int i14) {
        timePickerDialog.getClass();
        ArrayList arrayList = new ArrayList();
        if (i14 <= 0) {
            throw new IllegalArgumentException(r.p("Step must be positive, was: ", i14, '.'));
        }
        int iA2 = n.a(i12, i13, i14);
        if (i12 <= iA2) {
            while (true) {
                int i15 = i12 % i13;
                arrayList.add(new com.avito.android.lib.design.picker.k(Integer.valueOf(i15), i15 < 10 ? AK.c.g(i15, "0") : String.valueOf(i15)));
                if (i12 == iA2) {
                    break;
                }
                i12 += i14;
            }
        }
        return arrayList;
    }
}
