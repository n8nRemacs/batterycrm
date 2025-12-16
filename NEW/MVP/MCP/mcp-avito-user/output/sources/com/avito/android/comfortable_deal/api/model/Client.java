package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Client.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/Client;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/remote/model/Image;", "image", "phone", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "c", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Client implements Parcelable {

    @k
    public static final Parcelable.Creator<Client> CREATOR = new a();

    @c("image")
    @l
    private final Image image;

    @c("name")
    @k
    private final String name;

    @c("phone")
    @l
    private final String phone;

    /* compiled from: Client.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Client> {
        @Override // android.os.Parcelable.Creator
        public final Client createFromParcel(Parcel parcel) {
            return new Client(parcel.readString(), (Image) parcel.readParcelable(Client.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Client[] newArray(int i12) {
            return new Client[i12];
        }
    }

    public Client(@k String str, @l Image image, @l String str2) {
        this.name = str;
        this.image = image;
        this.phone = str2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Client)) {
            return false;
        }
        Client client = (Client) obj;
        return L.f(this.name, client.name) && L.f(this.image, client.image) && L.f(this.phone, client.phone);
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Image image = this.image;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.phone;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Client(name=");
        sb2.append(this.name);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", phone=");
        return C22026a.c(sb2, this.phone, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.name);
        parcel.writeParcelable(this.image, i12);
        parcel.writeString(this.phone);
    }
}
