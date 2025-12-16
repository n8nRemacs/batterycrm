package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.G;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j.N;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@SafeParcelable.a
@SafeParcelable.g
@Deprecated
/* loaded from: classes6.dex */
public class ChannelIdValue extends AbstractSafeParcelable {

    @N
    public static final Parcelable.Creator<ChannelIdValue> CREATOR = new d();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.c
    public final ChannelIdValueType f349894b;

    /* renamed from: c, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349895c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349896d;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public enum ChannelIdValueType implements Parcelable {
        ABSENT(0),
        STRING(1),
        /* JADX INFO: Fake field, exist only in values array */
        OBJECT(2);


        @N
        public static final Parcelable.Creator<ChannelIdValueType> CREATOR = new c();

        /* renamed from: b, reason: collision with root package name */
        public final int f349900b;

        ChannelIdValueType(int i12) {
            this.f349900b = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            parcel.writeInt(this.f349900b);
        }
    }

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedChannelIdValueTypeException extends Exception {
    }

    static {
        new ChannelIdValue();
        new ChannelIdValue("unavailable");
        new ChannelIdValue("unused");
    }

    public ChannelIdValue() {
        this.f349894b = ChannelIdValueType.ABSENT;
        this.f349896d = null;
        this.f349895c = null;
    }

    @N
    public static ChannelIdValueType h(int i12) throws UnsupportedChannelIdValueTypeException {
        for (ChannelIdValueType channelIdValueType : ChannelIdValueType.values()) {
            if (i12 == channelIdValueType.f349900b) {
                return channelIdValueType;
            }
        }
        throw new UnsupportedChannelIdValueTypeException(G.e(i12, "ChannelIdValueType ", " not supported"));
    }

    public final boolean equals(@N Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelIdValue)) {
            return false;
        }
        ChannelIdValue channelIdValue = (ChannelIdValue) obj;
        ChannelIdValueType channelIdValueType = channelIdValue.f349894b;
        ChannelIdValueType channelIdValueType2 = this.f349894b;
        if (!channelIdValueType2.equals(channelIdValueType)) {
            return false;
        }
        int iOrdinal = channelIdValueType2.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1) {
            return this.f349895c.equals(channelIdValue.f349895c);
        }
        if (iOrdinal != 2) {
            return false;
        }
        return this.f349896d.equals(channelIdValue.f349896d);
    }

    public final int hashCode() {
        int i12;
        int iHashCode;
        ChannelIdValueType channelIdValueType = this.f349894b;
        int iHashCode2 = channelIdValueType.hashCode() + 31;
        int iOrdinal = channelIdValueType.ordinal();
        if (iOrdinal == 1) {
            i12 = iHashCode2 * 31;
            iHashCode = this.f349895c.hashCode();
        } else {
            if (iOrdinal != 2) {
                return iHashCode2;
            }
            i12 = iHashCode2 * 31;
            iHashCode = this.f349896d.hashCode();
        }
        return iHashCode + i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        int i13 = this.f349894b.f349900b;
        TX0.a.q(parcel, 2, 4);
        parcel.writeInt(i13);
        TX0.a.j(parcel, 3, this.f349895c, false);
        TX0.a.j(parcel, 4, this.f349896d, false);
        TX0.a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public ChannelIdValue(@SafeParcelable.e int i12, @SafeParcelable.e String str, @SafeParcelable.e String str2) {
        try {
            this.f349894b = h(i12);
            this.f349895c = str;
            this.f349896d = str2;
        } catch (UnsupportedChannelIdValueTypeException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public ChannelIdValue(String str) {
        this.f349895c = str;
        this.f349894b = ChannelIdValueType.STRING;
        this.f349896d = null;
    }
}
