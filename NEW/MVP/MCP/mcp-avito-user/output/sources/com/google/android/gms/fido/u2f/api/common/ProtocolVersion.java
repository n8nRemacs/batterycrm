package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import j.N;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
@Deprecated
/* loaded from: classes6.dex */
public enum ProtocolVersion implements Parcelable {
    UNKNOWN(GrsBaseInfo.CountryCodeSource.UNKNOWN),
    /* JADX INFO: Fake field, exist only in values array */
    V1("U2F_V1"),
    /* JADX INFO: Fake field, exist only in values array */
    V2("U2F_V2");


    @N
    public static final Parcelable.Creator<ProtocolVersion> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.u2f.api.common.h
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return ProtocolVersion.a(parcel.readString());
            } catch (ProtocolVersion.UnsupportedProtocolException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i12) {
            return new ProtocolVersion[i12];
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public final String f349912b;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static class UnsupportedProtocolException extends Exception {
    }

    ProtocolVersion(String str) {
        this.f349912b = str;
    }

    @N
    public static ProtocolVersion a(@N String str) throws UnsupportedProtocolException {
        if (str == null) {
            return UNKNOWN;
        }
        for (ProtocolVersion protocolVersion : values()) {
            if (str.equals(protocolVersion.f349912b)) {
                return protocolVersion;
            }
        }
        throw new UnsupportedProtocolException(AK.c.k("Protocol version ", str, " not supported"));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @N
    public final String toString() {
        return this.f349912b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeString(this.f349912b);
    }
}
