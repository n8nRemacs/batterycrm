package com.avito.android.comfortable_deal.stages_transition.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import org.threeten.bp.e;
import org.threeten.bp.g;
import org.webrtc.h;

/* compiled from: StageTransitionField.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField;", "Landroid/os/Parcelable;", "CommentField", "DateTimeInputs", "Input", "RadioGroup", "Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField$CommentField;", "Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField$DateTimeInputs;", "Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField$Input;", "Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField$RadioGroup;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface StageTransitionField extends Parcelable {

    /* compiled from: StageTransitionField.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField$CommentField;", "Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class CommentField implements StageTransitionField {

        @k
        public static final Parcelable.Creator<CommentField> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f122947b;

        /* compiled from: StageTransitionField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CommentField> {
            @Override // android.os.Parcelable.Creator
            public final CommentField createFromParcel(Parcel parcel) {
                return new CommentField(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CommentField[] newArray(int i12) {
                return new CommentField[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CommentField() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField
        public final boolean X() {
            String str = this.f122947b;
            return true ^ (str == null || C43066x.K(str));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CommentField) && L.f(this.f122947b, ((CommentField) obj).f122947b);
        }

        public final int hashCode() {
            String str = this.f122947b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CommentField(value="), this.f122947b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f122947b);
        }

        public CommentField(@l String str) {
            this.f122947b = str;
        }

        public /* synthetic */ CommentField(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: StageTransitionField.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField$DateTimeInputs;", "Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class DateTimeInputs implements StageTransitionField {

        @k
        public static final Parcelable.Creator<DateTimeInputs> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final e f122948b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final g f122949c;

        /* compiled from: StageTransitionField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DateTimeInputs> {
            @Override // android.os.Parcelable.Creator
            public final DateTimeInputs createFromParcel(Parcel parcel) {
                return new DateTimeInputs((e) parcel.readSerializable(), (g) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final DateTimeInputs[] newArray(int i12) {
                return new DateTimeInputs[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DateTimeInputs() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField
        public final boolean X() {
            return (this.f122948b == null || this.f122949c == null) ? false : true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DateTimeInputs)) {
                return false;
            }
            DateTimeInputs dateTimeInputs = (DateTimeInputs) obj;
            return L.f(this.f122948b, dateTimeInputs.f122948b) && L.f(this.f122949c, dateTimeInputs.f122949c);
        }

        public final int hashCode() {
            e eVar = this.f122948b;
            int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
            g gVar = this.f122949c;
            return iHashCode + (gVar != null ? gVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DateTimeInputs(date=");
            sb2.append(this.f122948b);
            sb2.append(", time=");
            return h.f(sb2, this.f122949c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeSerializable(this.f122948b);
            parcel.writeSerializable(this.f122949c);
        }

        public DateTimeInputs(@l e eVar, @l g gVar) {
            this.f122948b = eVar;
            this.f122949c = gVar;
        }

        public /* synthetic */ DateTimeInputs(e eVar, g gVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : eVar, (i12 & 2) != 0 ? null : gVar);
        }
    }

    /* compiled from: StageTransitionField.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField$Input;", "Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Input implements StageTransitionField {

        @k
        public static final Parcelable.Creator<Input> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f122950b;

        /* compiled from: StageTransitionField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Input> {
            @Override // android.os.Parcelable.Creator
            public final Input createFromParcel(Parcel parcel) {
                return new Input(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Input[] newArray(int i12) {
                return new Input[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Input() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField
        public final boolean X() {
            String str = this.f122950b;
            return true ^ (str == null || C43066x.K(str));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Input) && L.f(this.f122950b, ((Input) obj).f122950b);
        }

        public final int hashCode() {
            String str = this.f122950b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Input(value="), this.f122950b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f122950b);
        }

        public Input(@l String str) {
            this.f122950b = str;
        }

        public /* synthetic */ Input(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: StageTransitionField.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField$RadioGroup;", "Lcom/avito/android/comfortable_deal/stages_transition/model/StageTransitionField;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class RadioGroup implements StageTransitionField {

        @k
        public static final Parcelable.Creator<RadioGroup> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f122951b;

        /* compiled from: StageTransitionField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RadioGroup> {
            @Override // android.os.Parcelable.Creator
            public final RadioGroup createFromParcel(Parcel parcel) {
                return new RadioGroup(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RadioGroup[] newArray(int i12) {
                return new RadioGroup[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RadioGroup() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.avito.android.comfortable_deal.stages_transition.model.StageTransitionField
        public final boolean X() {
            return this.f122951b != null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RadioGroup) && L.f(this.f122951b, ((RadioGroup) obj).f122951b);
        }

        public final int hashCode() {
            String str = this.f122951b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("RadioGroup(checkedRadio="), this.f122951b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f122951b);
        }

        public RadioGroup(@l String str) {
            this.f122951b = str;
        }

        public /* synthetic */ RadioGroup(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    boolean X();
}
