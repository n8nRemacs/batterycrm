package com.avito.android.auto_loans_cabinet.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: AutoLoanCabinetLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/deeplink/AutoLoanCabinetPageLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "_avito_auto-loans-cabinet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final class AutoLoanCabinetPageLink extends DeepLink {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final AutoLoanCabinetPageLink f95351b = new AutoLoanCabinetPageLink();

    @k
    public static final Parcelable.Creator<AutoLoanCabinetPageLink> CREATOR = new a();

    /* compiled from: AutoLoanCabinetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoLoanCabinetPageLink> {
        @Override // android.os.Parcelable.Creator
        public final AutoLoanCabinetPageLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return AutoLoanCabinetPageLink.f95351b;
        }

        @Override // android.os.Parcelable.Creator
        public final AutoLoanCabinetPageLink[] newArray(int i12) {
            return new AutoLoanCabinetPageLink[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
