package ru.avito.messenger.api.entity.context;

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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/api/entity/context/Unknown;", "Lru/avito/messenger/api/entity/context/ChannelContext;", "Landroid/os/Parcelable;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Unknown implements ChannelContext, Parcelable {

    @k
    public static final Parcelable.Creator<Unknown> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f430734b;

    /* compiled from: Unknown.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Unknown> {
        @Override // android.os.Parcelable.Creator
        public final Unknown createFromParcel(Parcel parcel) {
            return new Unknown(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Unknown[] newArray(int i12) {
            return new Unknown[i12];
        }
    }

    public Unknown(@k String str) {
        this.f430734b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Unknown) && L.f(this.f430734b, ((Unknown) obj).f430734b);
    }

    public final int hashCode() {
        return this.f430734b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("Unknown(type="), this.f430734b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f430734b);
    }
}
