package com.avito.android.comfortable_deal.client_room.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PartnerStatus.kt */
@F3
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/model/PartnerStatus;", "Landroid/os/Parcelable;", "Agency", "Agent", "Empty", "Lcom/avito/android/comfortable_deal/client_room/model/PartnerStatus$Agency;", "Lcom/avito/android/comfortable_deal/client_room/model/PartnerStatus$Agent;", "Lcom/avito/android/comfortable_deal/client_room/model/PartnerStatus$Empty;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PartnerStatus extends Parcelable {

    /* compiled from: PartnerStatus.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/model/PartnerStatus$Agency;", "Lcom/avito/android/comfortable_deal/client_room/model/PartnerStatus;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @F3
    @d
    public static final /* data */ class Agency implements PartnerStatus {

        @k
        public static final Parcelable.Creator<Agency> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f119871b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f119872c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Image f119873d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Agent f119874e;

        /* compiled from: PartnerStatus.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Agency> {
            @Override // android.os.Parcelable.Creator
            public final Agency createFromParcel(Parcel parcel) {
                return new Agency(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(Agency.class.getClassLoader()), parcel.readInt() == 0 ? null : Agent.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Agency[] newArray(int i12) {
                return new Agency[i12];
            }
        }

        public Agency(@k String str, @k String str2, @l Image image, @l Agent agent) {
            this.f119871b = str;
            this.f119872c = str2;
            this.f119873d = image;
            this.f119874e = agent;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Agency)) {
                return false;
            }
            Agency agency = (Agency) obj;
            return L.f(this.f119871b, agency.f119871b) && L.f(this.f119872c, agency.f119872c) && L.f(this.f119873d, agency.f119873d) && L.f(this.f119874e, agency.f119874e);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f119871b.hashCode() * 31, 31, this.f119872c);
            Image image = this.f119873d;
            int iHashCode = (iD2 + (image == null ? 0 : image.hashCode())) * 31;
            Agent agent = this.f119874e;
            return iHashCode + (agent != null ? agent.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Agency(id=" + this.f119871b + ", name=" + this.f119872c + ", image=" + this.f119873d + ", agent=" + this.f119874e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f119871b);
            parcel.writeString(this.f119872c);
            parcel.writeParcelable(this.f119873d, i12);
            Agent agent = this.f119874e;
            if (agent == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                agent.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: PartnerStatus.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/model/PartnerStatus$Agent;", "Lcom/avito/android/comfortable_deal/client_room/model/PartnerStatus;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @F3
    @d
    public static final /* data */ class Agent implements PartnerStatus {

        @k
        public static final Parcelable.Creator<Agent> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f119875b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f119876c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Image f119877d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f119878e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Integer f119879f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Integer f119880g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f119881h;

        /* compiled from: PartnerStatus.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Agent> {
            @Override // android.os.Parcelable.Creator
            public final Agent createFromParcel(Parcel parcel) {
                return new Agent(parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(Agent.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Agent[] newArray(int i12) {
                return new Agent[i12];
            }
        }

        public Agent(@k String str, @k String str2, @l Image image, @l String str3, @l Integer num, @l Integer num2, @l String str4) {
            this.f119875b = str;
            this.f119876c = str2;
            this.f119877d = image;
            this.f119878e = str3;
            this.f119879f = num;
            this.f119880g = num2;
            this.f119881h = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Agent)) {
                return false;
            }
            Agent agent = (Agent) obj;
            return L.f(this.f119875b, agent.f119875b) && L.f(this.f119876c, agent.f119876c) && L.f(this.f119877d, agent.f119877d) && L.f(this.f119878e, agent.f119878e) && L.f(this.f119879f, agent.f119879f) && L.f(this.f119880g, agent.f119880g) && L.f(this.f119881h, agent.f119881h);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f119875b.hashCode() * 31, 31, this.f119876c);
            Image image = this.f119877d;
            int iHashCode = (iD2 + (image == null ? 0 : image.hashCode())) * 31;
            String str = this.f119878e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f119879f;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f119880g;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.f119881h;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Agent(id=");
            sb2.append(this.f119875b);
            sb2.append(", name=");
            sb2.append(this.f119876c);
            sb2.append(", image=");
            sb2.append(this.f119877d);
            sb2.append(", workRegion=");
            sb2.append(this.f119878e);
            sb2.append(", dealsAmount=");
            sb2.append(this.f119879f);
            sb2.append(", workExperience=");
            sb2.append(this.f119880g);
            sb2.append(", description=");
            return C22026a.c(sb2, this.f119881h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f119875b);
            parcel.writeString(this.f119876c);
            parcel.writeParcelable(this.f119877d, i12);
            parcel.writeString(this.f119878e);
            Integer num = this.f119879f;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.f119880g;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
            parcel.writeString(this.f119881h);
        }
    }

    /* compiled from: PartnerStatus.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/client_room/model/PartnerStatus$Empty;", "Lcom/avito/android/comfortable_deal/client_room/model/PartnerStatus;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @F3
    @d
    public static final /* data */ class Empty implements PartnerStatus {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Empty f119882b = new Empty();

        @k
        public static final Parcelable.Creator<Empty> CREATOR = new a();

        /* compiled from: PartnerStatus.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Empty> {
            @Override // android.os.Parcelable.Creator
            public final Empty createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Empty.f119882b;
            }

            @Override // android.os.Parcelable.Creator
            public final Empty[] newArray(int i12) {
                return new Empty[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public final int hashCode() {
            return 1167943479;
        }

        @k
        public final String toString() {
            return "Empty";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}
