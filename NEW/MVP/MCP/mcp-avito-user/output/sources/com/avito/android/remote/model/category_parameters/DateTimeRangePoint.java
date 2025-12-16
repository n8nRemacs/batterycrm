package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DateTimeRangePoint.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0014R*\u0010/\u001a\u0004\u0018\u00010.8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b5\u00106\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DateTimeRangePoint;", "Lcom/avito/android/remote/model/category_parameters/base/HasError;", "Landroid/os/Parcelable;", "", "title", "", "required", "Lcom/avito/android/remote/model/category_parameters/SelectionType;", "selectionType", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$PresentTimeOptions;", "presentTime", "<init>", "(Ljava/lang/String;ZLcom/avito/android/remote/model/category_parameters/SelectionType;Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$PresentTimeOptions;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/avito/android/remote/model/category_parameters/SelectionType;", "component4", "()Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$PresentTimeOptions;", "copy", "(Ljava/lang/String;ZLcom/avito/android/remote/model/category_parameters/SelectionType;Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$PresentTimeOptions;)Lcom/avito/android/remote/model/category_parameters/DateTimeRangePoint;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Z", "getRequired", "Lcom/avito/android/remote/model/category_parameters/SelectionType;", "getSelectionType", "Lcom/avito/android/remote/model/category_parameters/DateTimeParameter$PresentTimeOptions;", "getPresentTime", "Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "error", "Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "getError", "()Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "setError", "(Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;)V", "getError$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DateTimeRangePoint implements HasError, Parcelable {

    @k
    public static final Parcelable.Creator<DateTimeRangePoint> CREATOR = new Creator();

    @l
    private transient HasError.Error error;

    @c("presentTimeOptions")
    @l
    private final DateTimeParameter.PresentTimeOptions presentTime;

    @c("required")
    private final boolean required;

    @c("selectionType")
    @l
    private final SelectionType selectionType;

    @c("title")
    @k
    private final String title;

    /* compiled from: DateTimeRangePoint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DateTimeRangePoint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateTimeRangePoint createFromParcel(@k Parcel parcel) {
            return new DateTimeRangePoint(parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SelectionType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DateTimeParameter.PresentTimeOptions.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DateTimeRangePoint[] newArray(int i12) {
            return new DateTimeRangePoint[i12];
        }
    }

    public DateTimeRangePoint(@k String str, boolean z12, @l SelectionType selectionType, @l DateTimeParameter.PresentTimeOptions presentTimeOptions) {
        this.title = str;
        this.required = z12;
        this.selectionType = selectionType;
        this.presentTime = presentTimeOptions;
    }

    public static /* synthetic */ DateTimeRangePoint copy$default(DateTimeRangePoint dateTimeRangePoint, String str, boolean z12, SelectionType selectionType, DateTimeParameter.PresentTimeOptions presentTimeOptions, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = dateTimeRangePoint.title;
        }
        if ((i12 & 2) != 0) {
            z12 = dateTimeRangePoint.required;
        }
        if ((i12 & 4) != 0) {
            selectionType = dateTimeRangePoint.selectionType;
        }
        if ((i12 & 8) != 0) {
            presentTimeOptions = dateTimeRangePoint.presentTime;
        }
        return dateTimeRangePoint.copy(str, z12, selectionType, presentTimeOptions);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public void applyPretendResult(@l PretendErrorValue pretendErrorValue) {
        HasError.DefaultImpls.applyPretendResult(this, pretendErrorValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public void clearError() {
        HasError.DefaultImpls.clearError(this);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final SelectionType getSelectionType() {
        return this.selectionType;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DateTimeParameter.PresentTimeOptions getPresentTime() {
        return this.presentTime;
    }

    @k
    public final DateTimeRangePoint copy(@k String title, boolean required, @l SelectionType selectionType, @l DateTimeParameter.PresentTimeOptions presentTime) {
        return new DateTimeRangePoint(title, required, selectionType, presentTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DateTimeRangePoint)) {
            return false;
        }
        DateTimeRangePoint dateTimeRangePoint = (DateTimeRangePoint) other;
        return L.f(this.title, dateTimeRangePoint.title) && this.required == dateTimeRangePoint.required && L.f(this.selectionType, dateTimeRangePoint.selectionType) && L.f(this.presentTime, dateTimeRangePoint.presentTime);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    @l
    public HasError.Error getError() {
        return this.error;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    @l
    public AttributedText getErrorMessage() {
        return HasError.DefaultImpls.getErrorMessage((HasError) this);
    }

    @l
    public final DateTimeParameter.PresentTimeOptions getPresentTime() {
        return this.presentTime;
    }

    public final boolean getRequired() {
        return this.required;
    }

    @l
    public final SelectionType getSelectionType() {
        return this.selectionType;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public boolean hasError() {
        return HasError.DefaultImpls.hasError(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public boolean hasErrorMessage() {
        return HasError.DefaultImpls.hasErrorMessage(this);
    }

    public int hashCode() {
        int i12 = r.i(this.title.hashCode() * 31, 31, this.required);
        SelectionType selectionType = this.selectionType;
        int iHashCode = (i12 + (selectionType == null ? 0 : selectionType.hashCode())) * 31;
        DateTimeParameter.PresentTimeOptions presentTimeOptions = this.presentTime;
        return iHashCode + (presentTimeOptions != null ? presentTimeOptions.hashCode() : 0);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public void setError(@l HasError.Error error) {
        this.error = error;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public void setErrorMessage(@l String str) {
        HasError.DefaultImpls.setErrorMessage(this, str);
    }

    @k
    public String toString() {
        return "DateTimeRangePoint(title=" + this.title + ", required=" + this.required + ", selectionType=" + this.selectionType + ", presentTime=" + this.presentTime + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeInt(this.required ? 1 : 0);
        SelectionType selectionType = this.selectionType;
        if (selectionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectionType.writeToParcel(parcel, flags);
        }
        DateTimeParameter.PresentTimeOptions presentTimeOptions = this.presentTime;
        if (presentTimeOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            presentTimeOptions.writeToParcel(parcel, flags);
        }
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    @l
    /* renamed from: getErrorMessage, reason: collision with other method in class */
    public String mo56getErrorMessage() {
        return HasError.DefaultImpls.m57getErrorMessage((HasError) this);
    }

    public static /* synthetic */ void getError$annotations() {
    }
}
