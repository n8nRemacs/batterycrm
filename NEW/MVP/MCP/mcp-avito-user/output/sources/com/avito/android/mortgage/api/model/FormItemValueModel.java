package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FormItemValueModel.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/mortgage/api/model/FormItemValueModel;", "Landroid/os/Parcelable;", "Lcom/avito/android/mortgage/api/model/DataHolder;", "data", "", "value", "<init>", "(Lcom/avito/android/mortgage/api/model/DataHolder;Ljava/lang/String;)V", "Lcom/avito/android/mortgage/api/model/DataHolder;", "c", "()Lcom/avito/android/mortgage/api/model/DataHolder;", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FormItemValueModel implements Parcelable {

    @k
    public static final Parcelable.Creator<FormItemValueModel> CREATOR = new a();

    @c("data")
    @l
    private final DataHolder data;

    @c("value")
    @l
    private final String value;

    /* compiled from: FormItemValueModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FormItemValueModel> {
        @Override // android.os.Parcelable.Creator
        public final FormItemValueModel createFromParcel(Parcel parcel) {
            return new FormItemValueModel((DataHolder) parcel.readParcelable(FormItemValueModel.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FormItemValueModel[] newArray(int i12) {
            return new FormItemValueModel[i12];
        }
    }

    public FormItemValueModel(@l DataHolder dataHolder, @l String str) {
        this.data = dataHolder;
        this.value = str;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DataHolder getData() {
        return this.data;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormItemValueModel)) {
            return false;
        }
        FormItemValueModel formItemValueModel = (FormItemValueModel) obj;
        return L.f(this.data, formItemValueModel.data) && L.f(this.value, formItemValueModel.value);
    }

    @l
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        DataHolder dataHolder = this.data;
        int iHashCode = (dataHolder == null ? 0 : dataHolder.hashCode()) * 31;
        String str = this.value;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FormItemValueModel(data=");
        sb2.append(this.data);
        sb2.append(", value=");
        return C22026a.c(sb2, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.data, i12);
        parcel.writeString(this.value);
    }
}
