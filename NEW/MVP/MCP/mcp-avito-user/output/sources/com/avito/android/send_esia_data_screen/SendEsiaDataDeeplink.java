package com.avito.android.send_esia_data_screen;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: SendEsiaDataDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/send_esia_data_screen/SendEsiaDataDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_gig_send-esia-data-screen_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class SendEsiaDataDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<SendEsiaDataDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f268239b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f268240c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f268241d;

    /* compiled from: SendEsiaDataDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SendEsiaDataDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final SendEsiaDataDeeplink createFromParcel(Parcel parcel) {
            return new SendEsiaDataDeeplink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SendEsiaDataDeeplink[] newArray(int i12) {
            return new SendEsiaDataDeeplink[i12];
        }
    }

    public SendEsiaDataDeeplink(@k String str, @k String str2, @k String str3) {
        this.f268239b = str;
        this.f268240c = str2;
        this.f268241d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f268239b);
        parcel.writeString(this.f268240c);
        parcel.writeString(this.f268241d);
    }
}
