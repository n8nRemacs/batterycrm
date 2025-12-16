package ru.avito.messenger.api.entity.body;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Unknown.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/api/entity/body/Unknown;", "Lru/avito/messenger/api/entity/body/MessageBody;", "LV81/a;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Unknown implements MessageBody, V81.a {

    @k
    public static final Parcelable.Creator<Unknown> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f430728b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f430729c;

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
        this.f430728b = str;
        this.f430729c = str2;
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
        return L.f(this.f430728b, unknown.f430728b) && L.f(this.f430729c, unknown.f430729c);
    }

    @Override // V81.a
    @l
    /* renamed from: getRandomId, reason: from getter */
    public final String getF430729c() {
        return this.f430729c;
    }

    public final int hashCode() {
        int iHashCode = this.f430728b.hashCode() * 31;
        String str = this.f430729c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Unknown(type=");
        sb2.append(this.f430728b);
        sb2.append(", randomId=");
        return C22026a.c(sb2, this.f430729c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f430728b);
        parcel.writeString(this.f430729c);
    }

    public /* synthetic */ Unknown(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2);
    }
}
