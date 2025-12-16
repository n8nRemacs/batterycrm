package com.avito.android.mortgage_invite.client_search.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageClientSearchResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/model/MortgageClientSearchResult;", "Landroid/os/Parcelable;", "ClientSelected", "NewClientSelected", "Lcom/avito/android/mortgage_invite/client_search/model/MortgageClientSearchResult$ClientSelected;", "Lcom/avito/android/mortgage_invite/client_search/model/MortgageClientSearchResult$NewClientSelected;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface MortgageClientSearchResult extends Parcelable {

    /* compiled from: MortgageClientSearchResult.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/model/MortgageClientSearchResult$ClientSelected;", "Lcom/avito/android/mortgage_invite/client_search/model/MortgageClientSearchResult;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ClientSelected implements MortgageClientSearchResult {

        @k
        public static final Parcelable.Creator<ClientSelected> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MortgageClient f205407b;

        /* compiled from: MortgageClientSearchResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ClientSelected> {
            @Override // android.os.Parcelable.Creator
            public final ClientSelected createFromParcel(Parcel parcel) {
                return new ClientSelected(MortgageClient.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ClientSelected[] newArray(int i12) {
                return new ClientSelected[i12];
            }
        }

        public ClientSelected(@k MortgageClient mortgageClient) {
            this.f205407b = mortgageClient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientSelected) && L.f(this.f205407b, ((ClientSelected) obj).f205407b);
        }

        public final int hashCode() {
            return this.f205407b.hashCode();
        }

        @k
        public final String toString() {
            return "ClientSelected(client=" + this.f205407b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f205407b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: MortgageClientSearchResult.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/model/MortgageClientSearchResult$NewClientSelected;", "Lcom/avito/android/mortgage_invite/client_search/model/MortgageClientSearchResult;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class NewClientSelected implements MortgageClientSearchResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final NewClientSelected f205408b = new NewClientSelected();

        @k
        public static final Parcelable.Creator<NewClientSelected> CREATOR = new a();

        /* compiled from: MortgageClientSearchResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NewClientSelected> {
            @Override // android.os.Parcelable.Creator
            public final NewClientSelected createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NewClientSelected.f205408b;
            }

            @Override // android.os.Parcelable.Creator
            public final NewClientSelected[] newArray(int i12) {
                return new NewClientSelected[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof NewClientSelected);
        }

        public final int hashCode() {
            return -1517873112;
        }

        @k
        public final String toString() {
            return "NewClientSelected";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}
