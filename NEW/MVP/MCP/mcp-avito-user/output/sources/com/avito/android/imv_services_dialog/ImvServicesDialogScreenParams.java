package com.avito.android.imv_services_dialog;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.imv_services.ImvServices;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvServicesDialogFragment.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_services_dialog/ImvServicesDialogScreenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_imv-services-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImvServicesDialogScreenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<ImvServicesDialogScreenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f170746b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImvServices f170747c;

    /* compiled from: ImvServicesDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvServicesDialogScreenParams> {
        @Override // android.os.Parcelable.Creator
        public final ImvServicesDialogScreenParams createFromParcel(Parcel parcel) {
            return new ImvServicesDialogScreenParams(parcel.readString(), (ImvServices) parcel.readParcelable(ImvServicesDialogScreenParams.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ImvServicesDialogScreenParams[] newArray(int i12) {
            return new ImvServicesDialogScreenParams[i12];
        }
    }

    public ImvServicesDialogScreenParams(@k String str, @k ImvServices imvServices) {
        this.f170746b = str;
        this.f170747c = imvServices;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvServicesDialogScreenParams)) {
            return false;
        }
        ImvServicesDialogScreenParams imvServicesDialogScreenParams = (ImvServicesDialogScreenParams) obj;
        return L.f(this.f170746b, imvServicesDialogScreenParams.f170746b) && L.f(this.f170747c, imvServicesDialogScreenParams.f170747c);
    }

    public final int hashCode() {
        return this.f170747c.hashCode() + (this.f170746b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ImvServicesDialogScreenParams(title=" + this.f170746b + ", imvServices=" + this.f170747c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f170746b);
        parcel.writeParcelable(this.f170747c, i12);
    }
}
