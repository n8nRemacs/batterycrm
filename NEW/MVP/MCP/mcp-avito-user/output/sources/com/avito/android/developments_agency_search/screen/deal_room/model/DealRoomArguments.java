package com.avito.android.developments_agency_search.screen.deal_room.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.deeplink.DealRoomLink;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DealRoomArguments.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/model/DealRoomArguments;", "Lcom/avito/android/util/OpenParams;", "ClientIdArguments", "ProcessIdArguments", "Lcom/avito/android/developments_agency_search/screen/deal_room/model/DealRoomArguments$ClientIdArguments;", "Lcom/avito/android/developments_agency_search/screen/deal_room/model/DealRoomArguments$ProcessIdArguments;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface DealRoomArguments extends OpenParams {

    /* compiled from: DealRoomArguments.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/model/DealRoomArguments$ClientIdArguments;", "Lcom/avito/android/developments_agency_search/screen/deal_room/model/DealRoomArguments;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ClientIdArguments implements DealRoomArguments {

        @k
        public static final Parcelable.Creator<ClientIdArguments> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f137564b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DealRoomLink.Status f137565c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f137566d;

        /* compiled from: DealRoomArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ClientIdArguments> {
            @Override // android.os.Parcelable.Creator
            public final ClientIdArguments createFromParcel(Parcel parcel) {
                return new ClientIdArguments(parcel.readString(), parcel.readInt() == 0 ? null : DealRoomLink.Status.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ClientIdArguments[] newArray(int i12) {
                return new ClientIdArguments[i12];
            }
        }

        public ClientIdArguments(@k String str, @l DealRoomLink.Status status, @k String str2) {
            this.f137564b = str;
            this.f137565c = status;
            this.f137566d = str2;
        }

        @Override // com.avito.android.developments_agency_search.screen.deal_room.model.DealRoomArguments
        @k
        /* renamed from: R0, reason: from getter */
        public final String getF137569d() {
            return this.f137566d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientIdArguments)) {
                return false;
            }
            ClientIdArguments clientIdArguments = (ClientIdArguments) obj;
            return L.f(this.f137564b, clientIdArguments.f137564b) && this.f137565c == clientIdArguments.f137565c && L.f(this.f137566d, clientIdArguments.f137566d);
        }

        @Override // com.avito.android.developments_agency_search.screen.deal_room.model.DealRoomArguments
        @l
        /* renamed from: getStatus, reason: from getter */
        public final DealRoomLink.Status getF137568c() {
            return this.f137565c;
        }

        public final int hashCode() {
            int iHashCode = this.f137564b.hashCode() * 31;
            DealRoomLink.Status status = this.f137565c;
            return this.f137566d.hashCode() + ((iHashCode + (status == null ? 0 : status.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClientIdArguments(clientId=");
            sb2.append(this.f137564b);
            sb2.append(", status=");
            sb2.append(this.f137565c);
            sb2.append(", parentScreen=");
            return C22026a.c(sb2, this.f137566d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f137564b);
            DealRoomLink.Status status = this.f137565c;
            if (status == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(status.name());
            }
            parcel.writeString(this.f137566d);
        }
    }

    /* compiled from: DealRoomArguments.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/model/DealRoomArguments$ProcessIdArguments;", "Lcom/avito/android/developments_agency_search/screen/deal_room/model/DealRoomArguments;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ProcessIdArguments implements DealRoomArguments {

        @k
        public static final Parcelable.Creator<ProcessIdArguments> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f137567b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DealRoomLink.Status f137568c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f137569d;

        /* compiled from: DealRoomArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ProcessIdArguments> {
            @Override // android.os.Parcelable.Creator
            public final ProcessIdArguments createFromParcel(Parcel parcel) {
                return new ProcessIdArguments(parcel.readString(), parcel.readInt() == 0 ? null : DealRoomLink.Status.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ProcessIdArguments[] newArray(int i12) {
                return new ProcessIdArguments[i12];
            }
        }

        public ProcessIdArguments(@k String str, @l DealRoomLink.Status status, @k String str2) {
            this.f137567b = str;
            this.f137568c = status;
            this.f137569d = str2;
        }

        @Override // com.avito.android.developments_agency_search.screen.deal_room.model.DealRoomArguments
        @k
        /* renamed from: R0, reason: from getter */
        public final String getF137569d() {
            return this.f137569d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProcessIdArguments)) {
                return false;
            }
            ProcessIdArguments processIdArguments = (ProcessIdArguments) obj;
            return L.f(this.f137567b, processIdArguments.f137567b) && this.f137568c == processIdArguments.f137568c && L.f(this.f137569d, processIdArguments.f137569d);
        }

        @Override // com.avito.android.developments_agency_search.screen.deal_room.model.DealRoomArguments
        @l
        /* renamed from: getStatus, reason: from getter */
        public final DealRoomLink.Status getF137568c() {
            return this.f137568c;
        }

        public final int hashCode() {
            int iHashCode = this.f137567b.hashCode() * 31;
            DealRoomLink.Status status = this.f137568c;
            return this.f137569d.hashCode() + ((iHashCode + (status == null ? 0 : status.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProcessIdArguments(processId=");
            sb2.append(this.f137567b);
            sb2.append(", status=");
            sb2.append(this.f137568c);
            sb2.append(", parentScreen=");
            return C22026a.c(sb2, this.f137569d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f137567b);
            DealRoomLink.Status status = this.f137568c;
            if (status == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(status.name());
            }
            parcel.writeString(this.f137569d);
        }
    }

    @k
    /* renamed from: R0 */
    String getF137569d();

    @l
    /* renamed from: getStatus */
    DealRoomLink.Status getF137568c();
}
