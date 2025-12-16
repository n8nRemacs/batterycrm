package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckAccessModel.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/mortgage/api/model/CheckAccessModel;", "Landroid/os/Parcelable;", "Lcom/avito/android/mortgage/api/model/ConfirmationForm;", "confirmationForm", "", "isSmsSent", "access", "<init>", "(Lcom/avito/android/mortgage/api/model/ConfirmationForm;ZZ)V", "Lcom/avito/android/mortgage/api/model/ConfirmationForm;", "d", "()Lcom/avito/android/mortgage/api/model/ConfirmationForm;", "Z", "()Z", "c", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CheckAccessModel implements Parcelable {

    @k
    public static final Parcelable.Creator<CheckAccessModel> CREATOR = new a();

    @c("access")
    private final boolean access;

    @c("confirmationForm")
    @l
    private final ConfirmationForm confirmationForm;

    @c("isSmsSent")
    private final boolean isSmsSent;

    /* compiled from: CheckAccessModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckAccessModel> {
        @Override // android.os.Parcelable.Creator
        public final CheckAccessModel createFromParcel(Parcel parcel) {
            return new CheckAccessModel(parcel.readInt() == 0 ? null : ConfirmationForm.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckAccessModel[] newArray(int i12) {
            return new CheckAccessModel[i12];
        }
    }

    public CheckAccessModel(@l ConfirmationForm confirmationForm, boolean z12, boolean z13) {
        this.confirmationForm = confirmationForm;
        this.isSmsSent = z12;
        this.access = z13;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getAccess() {
        return this.access;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final ConfirmationForm getConfirmationForm() {
        return this.confirmationForm;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckAccessModel)) {
            return false;
        }
        CheckAccessModel checkAccessModel = (CheckAccessModel) obj;
        return L.f(this.confirmationForm, checkAccessModel.confirmationForm) && this.isSmsSent == checkAccessModel.isSmsSent && this.access == checkAccessModel.access;
    }

    public final int hashCode() {
        ConfirmationForm confirmationForm = this.confirmationForm;
        return Boolean.hashCode(this.access) + r.i((confirmationForm == null ? 0 : confirmationForm.hashCode()) * 31, 31, this.isSmsSent);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckAccessModel(confirmationForm=");
        sb2.append(this.confirmationForm);
        sb2.append(", isSmsSent=");
        sb2.append(this.isSmsSent);
        sb2.append(", access=");
        return r.x(sb2, this.access, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        ConfirmationForm confirmationForm = this.confirmationForm;
        if (confirmationForm == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            confirmationForm.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.isSmsSent ? 1 : 0);
        parcel.writeInt(this.access ? 1 : 0);
    }
}
