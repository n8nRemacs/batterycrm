package com.avito.android.mortgage_invite.model.participant;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ParticipantResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_invite/model/participant/ParticipantResult;", "Landroid/os/Parcelable;", "ApplicationCreated", "Dismissed", "Lcom/avito/android/mortgage_invite/model/participant/ParticipantResult$ApplicationCreated;", "Lcom/avito/android/mortgage_invite/model/participant/ParticipantResult$Dismissed;", "_avito_mortgage-invite_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ParticipantResult extends Parcelable {

    /* compiled from: ParticipantResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/model/participant/ParticipantResult$ApplicationCreated;", "Lcom/avito/android/mortgage_invite/model/participant/ParticipantResult;", "_avito_mortgage-invite_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ApplicationCreated implements ParticipantResult {

        @k
        public static final Parcelable.Creator<ApplicationCreated> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f205968b;

        /* compiled from: ParticipantResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ApplicationCreated> {
            @Override // android.os.Parcelable.Creator
            public final ApplicationCreated createFromParcel(Parcel parcel) {
                return new ApplicationCreated(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ApplicationCreated[] newArray(int i12) {
                return new ApplicationCreated[i12];
            }
        }

        public ApplicationCreated(@k String str) {
            this.f205968b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplicationCreated) && L.f(this.f205968b, ((ApplicationCreated) obj).f205968b);
        }

        public final int hashCode() {
            return this.f205968b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ApplicationCreated(applicationId="), this.f205968b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f205968b);
        }
    }

    /* compiled from: ParticipantResult.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/model/participant/ParticipantResult$Dismissed;", "Lcom/avito/android/mortgage_invite/model/participant/ParticipantResult;", "<init>", "()V", "_avito_mortgage-invite_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Dismissed implements ParticipantResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Dismissed f205969b = new Dismissed();

        @k
        public static final Parcelable.Creator<Dismissed> CREATOR = new a();

        /* compiled from: ParticipantResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Dismissed> {
            @Override // android.os.Parcelable.Creator
            public final Dismissed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Dismissed.f205969b;
            }

            @Override // android.os.Parcelable.Creator
            public final Dismissed[] newArray(int i12) {
                return new Dismissed[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return 1439000126;
        }

        @k
        public final String toString() {
            return "Dismissed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}
