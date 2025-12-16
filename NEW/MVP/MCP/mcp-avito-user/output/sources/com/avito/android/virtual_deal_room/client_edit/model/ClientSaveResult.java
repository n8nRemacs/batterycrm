package com.avito.android.virtual_deal_room.client_edit.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientSaveResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/model/ClientSaveResult;", "Landroid/os/Parcelable;", "Dismissed", "Saved", "Lcom/avito/android/virtual_deal_room/client_edit/model/ClientSaveResult$Dismissed;", "Lcom/avito/android/virtual_deal_room/client_edit/model/ClientSaveResult$Saved;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ClientSaveResult extends Parcelable {

    /* compiled from: ClientSaveResult.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/model/ClientSaveResult$Dismissed;", "Lcom/avito/android/virtual_deal_room/client_edit/model/ClientSaveResult;", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Dismissed implements ClientSaveResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Dismissed f326196b = new Dismissed();

        @k
        public static final Parcelable.Creator<Dismissed> CREATOR = new a();

        /* compiled from: ClientSaveResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Dismissed> {
            @Override // android.os.Parcelable.Creator
            public final Dismissed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Dismissed.f326196b;
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
            return 1371205108;
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

    /* compiled from: ClientSaveResult.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/model/ClientSaveResult$Saved;", "Lcom/avito/android/virtual_deal_room/client_edit/model/ClientSaveResult;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Saved implements ClientSaveResult {

        @k
        public static final Parcelable.Creator<Saved> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326197b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f326198c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f326199d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f326200e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f326201f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f326202g;

        /* compiled from: ClientSaveResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Saved> {
            @Override // android.os.Parcelable.Creator
            public final Saved createFromParcel(Parcel parcel) {
                return new Saved(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Saved[] newArray(int i12) {
                return new Saved[i12];
            }
        }

        public Saved(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k String str6) {
            this.f326197b = str;
            this.f326198c = str2;
            this.f326199d = str3;
            this.f326200e = str4;
            this.f326201f = str5;
            this.f326202g = str6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Saved)) {
                return false;
            }
            Saved saved = (Saved) obj;
            return L.f(this.f326197b, saved.f326197b) && L.f(this.f326198c, saved.f326198c) && L.f(this.f326199d, saved.f326199d) && L.f(this.f326200e, saved.f326200e) && L.f(this.f326201f, saved.f326201f) && L.f(this.f326202g, saved.f326202g);
        }

        public final int hashCode() {
            return this.f326202g.hashCode() + H.d(H.d(H.d(H.d(this.f326197b.hashCode() * 31, 31, this.f326198c), 31, this.f326199d), 31, this.f326200e), 31, this.f326201f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Saved(id=");
            sb2.append(this.f326197b);
            sb2.append(", name=");
            sb2.append(this.f326198c);
            sb2.append(", surname=");
            sb2.append(this.f326199d);
            sb2.append(", patronymic=");
            sb2.append(this.f326200e);
            sb2.append(", phone=");
            sb2.append(this.f326201f);
            sb2.append(", email=");
            return C22026a.c(sb2, this.f326202g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f326197b);
            parcel.writeString(this.f326198c);
            parcel.writeString(this.f326199d);
            parcel.writeString(this.f326200e);
            parcel.writeString(this.f326201f);
            parcel.writeString(this.f326202g);
        }
    }
}
