package com.avito.android.str_core;

import Ju.InterfaceC14249c;
import Ku.AbstractC14350a;
import Ku.i;
import Y61.k;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: OpenSellerOrderBookingDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_core/OpenSellerOrderBookingDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "c", "_avito-discouraged_avito-libs_str-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class OpenSellerOrderBookingDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<OpenSellerOrderBookingDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f288528b;

    /* compiled from: OpenSellerOrderBookingDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OpenSellerOrderBookingDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final OpenSellerOrderBookingDeepLink createFromParcel(Parcel parcel) {
            return new OpenSellerOrderBookingDeepLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OpenSellerOrderBookingDeepLink[] newArray(int i12) {
            return new OpenSellerOrderBookingDeepLink[i12];
        }
    }

    /* compiled from: OpenSellerOrderBookingDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_core/OpenSellerOrderBookingDeepLink$b;", "LKu/a;", "Lcom/avito/android/str_core/OpenSellerOrderBookingDeepLink;", "<init>", "()V", "_avito-discouraged_avito-libs_str-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC14350a<OpenSellerOrderBookingDeepLink> {
        @Override // Ku.AbstractC14350a
        public final DeepLink r(Uri uri, Gson gson, x xVar) {
            return new OpenSellerOrderBookingDeepLink(i.p(uri, "orderId"));
        }
    }

    /* compiled from: OpenSellerOrderBookingDeepLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_core/OpenSellerOrderBookingDeepLink$c;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_avito-libs_str-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f288529b = new c();
    }

    public OpenSellerOrderBookingDeepLink(@k String str) {
        this.f288528b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f288528b);
    }
}
