package com.avito.android.beduin.common.component.stepper;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.ErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.StepperErrorTransform;
import com.avito.android.beduin.common.form.transforms.StepperValueTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinStepperModel.kt */
@K51.d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b)\u0010\u0017R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "value", "minValue", "maxValue", "errorMessage", "Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel$Error;", "error", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onChangeValueActions", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;IIILjava/lang/String;Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel$Error;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "I", "h", "()I", "e", "d", "getErrorMessage", "getErrorMessage$annotations", "()V", "Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel$Error;", "c", "()Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel$Error;", "Ljava/util/List;", "f", "()Ljava/util/List;", "getStyle", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "Error", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinStepperModel extends LeafBeduinModel {

    @Y61.k
    public static final Parcelable.Creator<BeduinStepperModel> CREATOR = new a();

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @Y61.l
    private final DisplayingPredicate displayingPredicate;

    @com.google.gson.annotations.c("error")
    @Y61.l
    private final Error error;

    @com.google.gson.annotations.c("errorMessage")
    @Y61.l
    private final String errorMessage;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("maxValue")
    private final int maxValue;

    @com.google.gson.annotations.c("minValue")
    private final int minValue;

    @com.google.gson.annotations.c("onChangeValueActions")
    @Y61.l
    private final List<BeduinAction> onChangeValueActions;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @Y61.l
    private final String style;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @Y61.l
    private final BeduinComponentTheme theme;

    @com.google.gson.annotations.c("value")
    private final int value;

    /* compiled from: BeduinStepperModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel$Error;", "Landroid/os/Parcelable;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        @com.google.gson.annotations.c("message")
        @Y61.l
        private final String message;

        /* compiled from: BeduinStepperModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error(@Y61.l String str) {
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.message, ((Error) obj).message);
        }

        @Y61.l
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            String str = this.message;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(message="), this.message, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.message);
        }
    }

    /* compiled from: BeduinStepperModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinStepperModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinStepperModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinStepperModel.class.getClassLoader());
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            String string2 = parcel.readString();
            Error errorCreateFromParcel = parcel.readInt() == 0 ? null : Error.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                arrayList = new ArrayList(i15);
                int iL2 = 0;
                while (iL2 != i15) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinStepperModel.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BeduinStepperModel(string, displayingPredicate, i12, i13, i14, string2, errorCreateFromParcel, arrayList, parcel.readString(), parcel.readInt() != 0 ? BeduinComponentTheme.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinStepperModel[] newArray(int i12) {
            return new BeduinStepperModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinStepperModel(@Y61.k String str, @Y61.l DisplayingPredicate displayingPredicate, int i12, int i13, int i14, @Y61.l String str2, @Y61.l Error error, @Y61.l List<? extends BeduinAction> list, @Y61.l String str3, @Y61.l BeduinComponentTheme beduinComponentTheme) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.value = i12;
        this.minValue = i13;
        this.maxValue = i14;
        this.errorMessage = str2;
        this.error = error;
        this.onChangeValueActions = list;
        this.style = str3;
        this.theme = beduinComponentTheme;
    }

    public static BeduinStepperModel a(BeduinStepperModel beduinStepperModel, DisplayingPredicate displayingPredicate, int i12, String str, Error error, int i13) {
        String str2 = beduinStepperModel.id;
        DisplayingPredicate displayingPredicate2 = (i13 & 2) != 0 ? beduinStepperModel.displayingPredicate : displayingPredicate;
        int i14 = (i13 & 4) != 0 ? beduinStepperModel.value : i12;
        int i15 = (i13 & 8) != 0 ? beduinStepperModel.minValue : -1;
        int i16 = (i13 & 16) != 0 ? beduinStepperModel.maxValue : -1;
        String str3 = (i13 & 32) != 0 ? beduinStepperModel.errorMessage : str;
        Error error2 = (i13 & 64) != 0 ? beduinStepperModel.error : error;
        List<BeduinAction> list = beduinStepperModel.onChangeValueActions;
        String str4 = beduinStepperModel.style;
        BeduinComponentTheme beduinComponentTheme = beduinStepperModel.theme;
        beduinStepperModel.getClass();
        return new BeduinStepperModel(str2, displayingPredicate2, i14, i15, i16, str3, error2, list, str4, beduinComponentTheme);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public final BeduinModel apply(@Y61.k BeduinModelTransform beduinModelTransform) {
        return beduinModelTransform instanceof ErrorMessageTransform ? a(this, null, 0, ((ErrorMessageTransform) beduinModelTransform).getErrorMessage(), null, 991) : beduinModelTransform instanceof StepperErrorTransform ? a(this, null, 0, null, ((StepperErrorTransform) beduinModelTransform).getError(), 959) : beduinModelTransform instanceof DisplayPredicateTransform ? a(this, ((DisplayPredicateTransform) beduinModelTransform).getDisplayingPredicate(), 0, null, null, 1021) : beduinModelTransform instanceof StepperValueTransform ? a(this, null, ((StepperValueTransform) beduinModelTransform).getValue(), null, null, 1019) : this;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    /* renamed from: d, reason: from getter */
    public final int getMaxValue() {
        return this.maxValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final int getMinValue() {
        return this.minValue;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinStepperModel)) {
            return false;
        }
        BeduinStepperModel beduinStepperModel = (BeduinStepperModel) obj;
        return L.f(this.id, beduinStepperModel.id) && L.f(this.displayingPredicate, beduinStepperModel.displayingPredicate) && this.value == beduinStepperModel.value && this.minValue == beduinStepperModel.minValue && this.maxValue == beduinStepperModel.maxValue && L.f(this.errorMessage, beduinStepperModel.errorMessage) && L.f(this.error, beduinStepperModel.error) && L.f(this.onChangeValueActions, beduinStepperModel.onChangeValueActions) && L.f(this.style, beduinStepperModel.style) && this.theme == beduinStepperModel.theme;
    }

    @Y61.l
    public final List<BeduinAction> f() {
        return this.onChangeValueActions;
    }

    public final int g() {
        BeduinComponentTheme beduinComponentTheme = this.theme;
        return beduinComponentTheme != null ? beduinComponentTheme.f100608b : BeduinComponentTheme.AVITO_LOOK_AND_FEEL.f100608b;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.l
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Y61.l
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public final String getId() {
        return this.id;
    }

    @Y61.l
    public final String getStyle() {
        return this.style;
    }

    /* renamed from: h, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iE2 = r.e(this.maxValue, r.e(this.minValue, r.e(this.value, (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31, 31), 31), 31);
        String str = this.errorMessage;
        int iHashCode2 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        Error error = this.error;
        int iHashCode3 = (iHashCode2 + (error == null ? 0 : error.hashCode())) * 31;
        List<BeduinAction> list = this.onChangeValueActions;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.style;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        return iHashCode5 + (beduinComponentTheme != null ? beduinComponentTheme.hashCode() : 0);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    public final boolean isValid() {
        String str = this.errorMessage;
        return (str == null || str.length() == 0) && this.error == null;
    }

    @Y61.k
    public final String toString() {
        return "BeduinStepperModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", value=" + this.value + ", minValue=" + this.minValue + ", maxValue=" + this.maxValue + ", errorMessage=" + this.errorMessage + ", error=" + this.error + ", onChangeValueActions=" + this.onChangeValueActions + ", style=" + this.style + ", theme=" + this.theme + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, i12);
        parcel.writeInt(this.value);
        parcel.writeInt(this.minValue);
        parcel.writeInt(this.maxValue);
        parcel.writeString(this.errorMessage);
        Error error = this.error;
        if (error == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            error.writeToParcel(parcel, i12);
        }
        List<BeduinAction> list = this.onChangeValueActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this.style);
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, i12);
        }
    }
}
