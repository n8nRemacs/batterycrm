package ru.avito.messenger.api.entity.body.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Unknown.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/api/entity/body/item/Unknown;", "Lru/avito/messenger/api/entity/body/item/BodyItem;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Unknown implements BodyItem {

    @k
    public static final Parcelable.Creator<Unknown> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f430731b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f430732c;

    /* compiled from: Unknown.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Unknown> {
        @Override // android.os.Parcelable.Creator
        public final Unknown createFromParcel(Parcel parcel) {
            return new Unknown(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Unknown[] newArray(int i12) {
            return new Unknown[i12];
        }
    }

    public Unknown(@k String str, @l String str2) {
        this.f430731b = str;
        this.f430732c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Unknown)) {
            return false;
        }
        Unknown unknown = (Unknown) obj;
        return L.f(this.f430731b, unknown.f430731b) && L.f(this.f430732c, unknown.f430732c);
    }

    public final int hashCode() {
        int iHashCode = this.f430731b.hashCode() * 31;
        String str = this.f430732c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Unknown(type=");
        sb2.append(this.f430731b);
        sb2.append(", subtype=");
        return C22026a.c(sb2, this.f430732c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f430731b);
        parcel.writeString(this.f430732c);
    }
}
