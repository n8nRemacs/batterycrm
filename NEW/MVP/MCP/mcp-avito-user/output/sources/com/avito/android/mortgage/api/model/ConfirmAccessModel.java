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

/* compiled from: ConfirmAccessModel.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/mortgage/api/model/ConfirmAccessModel;", "Landroid/os/Parcelable;", "", "error", "", "access", "<init>", "(Ljava/lang/String;Z)V", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "Z", "c", "()Z", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ConfirmAccessModel implements Parcelable {

    @k
    public static final Parcelable.Creator<ConfirmAccessModel> CREATOR = new a();

    @c("access")
    private final boolean access;

    @c("error")
    @l
    private final String error;

    /* compiled from: ConfirmAccessModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConfirmAccessModel> {
        @Override // android.os.Parcelable.Creator
        public final ConfirmAccessModel createFromParcel(Parcel parcel) {
            return new ConfirmAccessModel(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ConfirmAccessModel[] newArray(int i12) {
            return new ConfirmAccessModel[i12];
        }
    }

    public ConfirmAccessModel(@l String str, boolean z12) {
        this.error = str;
        this.access = z12;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getAccess() {
        return this.access;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmAccessModel)) {
            return false;
        }
        ConfirmAccessModel confirmAccessModel = (ConfirmAccessModel) obj;
        return L.f(this.error, confirmAccessModel.error) && this.access == confirmAccessModel.access;
    }

    @l
    public final String getError() {
        return this.error;
    }

    public final int hashCode() {
        String str = this.error;
        return Boolean.hashCode(this.access) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmAccessModel(error=");
        sb2.append(this.error);
        sb2.append(", access=");
        return r.x(sb2, this.access, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.error);
        parcel.writeInt(this.access ? 1 : 0);
    }
}
