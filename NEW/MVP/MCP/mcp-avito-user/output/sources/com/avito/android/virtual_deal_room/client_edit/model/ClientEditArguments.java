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

/* compiled from: ClientEditArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/model/ClientEditArguments;", "Landroid/os/Parcelable;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ClientEditArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ClientEditArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f326189b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f326190c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f326191d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f326192e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f326193f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f326194g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f326195h;

    /* compiled from: ClientEditArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ClientEditArguments> {
        @Override // android.os.Parcelable.Creator
        public final ClientEditArguments createFromParcel(Parcel parcel) {
            return new ClientEditArguments(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ClientEditArguments[] newArray(int i12) {
            return new ClientEditArguments[i12];
        }
    }

    public ClientEditArguments(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k String str6, @k String str7) {
        this.f326189b = str;
        this.f326190c = str2;
        this.f326191d = str3;
        this.f326192e = str4;
        this.f326193f = str5;
        this.f326194g = str6;
        this.f326195h = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientEditArguments)) {
            return false;
        }
        ClientEditArguments clientEditArguments = (ClientEditArguments) obj;
        return L.f(this.f326189b, clientEditArguments.f326189b) && L.f(this.f326190c, clientEditArguments.f326190c) && L.f(this.f326191d, clientEditArguments.f326191d) && L.f(this.f326192e, clientEditArguments.f326192e) && L.f(this.f326193f, clientEditArguments.f326193f) && L.f(this.f326194g, clientEditArguments.f326194g) && L.f(this.f326195h, clientEditArguments.f326195h);
    }

    public final int hashCode() {
        return this.f326195h.hashCode() + H.d(H.d(H.d(H.d(H.d(this.f326189b.hashCode() * 31, 31, this.f326190c), 31, this.f326191d), 31, this.f326192e), 31, this.f326193f), 31, this.f326194g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientEditArguments(id=");
        sb2.append(this.f326189b);
        sb2.append(", firstName=");
        sb2.append(this.f326190c);
        sb2.append(", lastName=");
        sb2.append(this.f326191d);
        sb2.append(", middleName=");
        sb2.append(this.f326192e);
        sb2.append(", phone=");
        sb2.append(this.f326193f);
        sb2.append(", email=");
        sb2.append(this.f326194g);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f326195h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f326189b);
        parcel.writeString(this.f326190c);
        parcel.writeString(this.f326191d);
        parcel.writeString(this.f326192e);
        parcel.writeString(this.f326193f);
        parcel.writeString(this.f326194g);
        parcel.writeString(this.f326195h);
    }
}
