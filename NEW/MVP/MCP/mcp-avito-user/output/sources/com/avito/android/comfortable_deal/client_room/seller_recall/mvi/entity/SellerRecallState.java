package com.avito.android.comfortable_deal.client_room.seller_recall.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.comfortable_deal.client_room.model.PartnerStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SellerRecallState.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerRecallState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f119997b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f119998c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f119999d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f120000e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f120001f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final PartnerStatus f120002g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f119996h = new a(null);

    @k
    public static final Parcelable.Creator<SellerRecallState> CREATOR = new b();

    /* compiled from: SellerRecallState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/seller_recall/mvi/entity/SellerRecallState$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SellerRecallState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SellerRecallState> {
        @Override // android.os.Parcelable.Creator
        public final SellerRecallState createFromParcel(Parcel parcel) {
            return new SellerRecallState(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (PartnerStatus) parcel.readParcelable(SellerRecallState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SellerRecallState[] newArray(int i12) {
            return new SellerRecallState[i12];
        }
    }

    public SellerRecallState(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k PartnerStatus partnerStatus) {
        this.f119997b = str;
        this.f119998c = str2;
        this.f119999d = str3;
        this.f120000e = str4;
        this.f120001f = str5;
        this.f120002g = partnerStatus;
    }

    public static SellerRecallState a(SellerRecallState sellerRecallState, String str, String str2, String str3, int i12) {
        if ((i12 & 1) != 0) {
            str = sellerRecallState.f119997b;
        }
        String str4 = str;
        if ((i12 & 2) != 0) {
            str2 = sellerRecallState.f119998c;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            str3 = sellerRecallState.f119999d;
        }
        String str6 = sellerRecallState.f120000e;
        String str7 = sellerRecallState.f120001f;
        PartnerStatus partnerStatus = sellerRecallState.f120002g;
        sellerRecallState.getClass();
        return new SellerRecallState(str4, str5, str3, str6, str7, partnerStatus);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerRecallState)) {
            return false;
        }
        SellerRecallState sellerRecallState = (SellerRecallState) obj;
        return L.f(this.f119997b, sellerRecallState.f119997b) && L.f(this.f119998c, sellerRecallState.f119998c) && L.f(this.f119999d, sellerRecallState.f119999d) && L.f(this.f120000e, sellerRecallState.f120000e) && L.f(this.f120001f, sellerRecallState.f120001f) && L.f(this.f120002g, sellerRecallState.f120002g);
    }

    public final int hashCode() {
        return this.f120002g.hashCode() + H.d(H.d(H.d(H.d(this.f119997b.hashCode() * 31, 31, this.f119998c), 31, this.f119999d), 31, this.f120000e), 31, this.f120001f);
    }

    @k
    public final String toString() {
        return "SellerRecallState(phoneText=" + this.f119997b + ", commentText=" + this.f119998c + ", reasonText=" + this.f119999d + ", leadId=" + this.f120000e + ", source=" + this.f120001f + ", status=" + this.f120002g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f119997b);
        parcel.writeString(this.f119998c);
        parcel.writeString(this.f119999d);
        parcel.writeString(this.f120000e);
        parcel.writeString(this.f120001f);
        parcel.writeParcelable(this.f120002g, i12);
    }
}
