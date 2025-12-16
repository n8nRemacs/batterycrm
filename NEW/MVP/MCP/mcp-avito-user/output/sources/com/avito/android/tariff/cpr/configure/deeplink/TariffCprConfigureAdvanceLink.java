package com.avito.android.tariff.cpr.configure.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: TariffCprConfigureAdvanceLink.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/deeplink/TariffCprConfigureAdvanceLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "", "configureContext", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class TariffCprConfigureAdvanceLink extends PaidServicesLink {

    @Y61.k
    public static final Parcelable.Creator<TariffCprConfigureAdvanceLink> CREATOR = new a();

    @com.google.gson.annotations.c("context")
    @Y61.k
    private final String configureContext;

    /* compiled from: TariffCprConfigureAdvanceLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCprConfigureAdvanceLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCprConfigureAdvanceLink createFromParcel(Parcel parcel) {
            return new TariffCprConfigureAdvanceLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCprConfigureAdvanceLink[] newArray(int i12) {
            return new TariffCprConfigureAdvanceLink[i12];
        }
    }

    public TariffCprConfigureAdvanceLink(@Y61.k String str) {
        this.configureContext = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getConfigureContext() {
        return this.configureContext;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.configureContext);
    }
}
