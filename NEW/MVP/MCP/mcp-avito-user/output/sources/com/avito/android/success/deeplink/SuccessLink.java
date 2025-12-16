package com.avito.android.success.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: SuccessLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/success/deeplink/SuccessLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class SuccessLink extends DeepLink {

    @k
    public static final Parcelable.Creator<SuccessLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f291568b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f291569c;

    /* compiled from: SuccessLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuccessLink> {
        @Override // android.os.Parcelable.Creator
        public final SuccessLink createFromParcel(Parcel parcel) {
            return new SuccessLink(parcel.readString(), (DeepLink) parcel.readParcelable(SuccessLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuccessLink[] newArray(int i12) {
            return new SuccessLink[i12];
        }
    }

    public SuccessLink(@k String str, @l DeepLink deepLink) {
        this.f291568b = str;
        this.f291569c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f291568b);
        parcel.writeParcelable(this.f291569c, i12);
    }
}
