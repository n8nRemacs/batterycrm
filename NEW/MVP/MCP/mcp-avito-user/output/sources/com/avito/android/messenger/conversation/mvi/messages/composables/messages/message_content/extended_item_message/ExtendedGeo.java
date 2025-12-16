package com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.extended_item_message;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedItemData.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/composables/messages/message_content/extended_item_message/ExtendedGeo;", "Landroid/os/Parcelable;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ExtendedGeo implements Parcelable {

    @k
    public static final Parcelable.Creator<ExtendedGeo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f192462b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f192463c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ArrayList f192464d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f192465e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f192466f;

    /* compiled from: ExtendedItemData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedGeo> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedGeo createFromParcel(Parcel parcel) {
            return new ExtendedGeo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedGeo[] newArray(int i12) {
            return new ExtendedGeo[i12];
        }
    }

    public ExtendedGeo(@l String str, @l String str2, @l String str3, @l String str4, @l ArrayList arrayList) {
        this.f192462b = str;
        this.f192463c = str2;
        this.f192464d = arrayList;
        this.f192465e = str3;
        this.f192466f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedGeo)) {
            return false;
        }
        ExtendedGeo extendedGeo = (ExtendedGeo) obj;
        return L.f(this.f192462b, extendedGeo.f192462b) && L.f(this.f192463c, extendedGeo.f192463c) && L.f(this.f192464d, extendedGeo.f192464d) && L.f(this.f192465e, extendedGeo.f192465e) && L.f(this.f192466f, extendedGeo.f192466f);
    }

    public final int hashCode() {
        String str = this.f192462b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f192463c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList arrayList = this.f192464d;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str3 = this.f192465e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f192466f;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedGeo(distance=");
        sb2.append(this.f192462b);
        sb2.append(", distanceInTime=");
        sb2.append(this.f192463c);
        sb2.append(", lines=");
        sb2.append(this.f192464d);
        sb2.append(", name=");
        sb2.append(this.f192465e);
        sb2.append(", address=");
        return C22026a.c(sb2, this.f192466f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f192462b);
        parcel.writeString(this.f192463c);
        parcel.writeStringList(this.f192464d);
        parcel.writeString(this.f192465e);
        parcel.writeString(this.f192466f);
    }
}
