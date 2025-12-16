package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;

    /* renamed from: h, reason: collision with root package name */
    public static final I f345638h;

    /* renamed from: i, reason: collision with root package name */
    public static final I f345639i;

    /* renamed from: b, reason: collision with root package name */
    public final String f345640b;

    /* renamed from: c, reason: collision with root package name */
    public final String f345641c;

    /* renamed from: d, reason: collision with root package name */
    public final long f345642d;

    /* renamed from: e, reason: collision with root package name */
    public final long f345643e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f345644f;

    /* renamed from: g, reason: collision with root package name */
    public int f345645g;

    public class a implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        public final EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EventMessage[] newArray(int i12) {
            return new EventMessage[i12];
        }
    }

    static {
        I.b bVar = new I.b();
        bVar.f343504k = "application/id3";
        f345638h = bVar.a();
        I.b bVar2 = new I.b();
        bVar2.f343504k = "application/x-scte35";
        f345639i = bVar2.a();
        CREATOR = new a();
    }

    public EventMessage(String str, String str2, long j12, long j13, byte[] bArr) {
        this.f345640b = str;
        this.f345641c = str2;
        this.f345642d = j12;
        this.f345643e = j13;
        this.f345644f = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @P
    public final byte[] Z() {
        if (i0() != null) {
            return this.f345644f;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.f345642d == eventMessage.f345642d && this.f345643e == eventMessage.f345643e && U.a(this.f345640b, eventMessage.f345640b) && U.a(this.f345641c, eventMessage.f345641c) && Arrays.equals(this.f345644f, eventMessage.f345644f);
    }

    public final int hashCode() {
        if (this.f345645g == 0) {
            String str = this.f345640b;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f345641c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j12 = this.f345642d;
            int i12 = (iHashCode2 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f345643e;
            this.f345645g = Arrays.hashCode(this.f345644f) + ((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31);
        }
        return this.f345645g;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    @P
    public final I i0() {
        String str = this.f345640b;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f345639i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f345638h;
            default:
                return null;
        }
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f345640b + ", id=" + this.f345643e + ", durationMs=" + this.f345642d + ", value=" + this.f345641c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f345640b);
        parcel.writeString(this.f345641c);
        parcel.writeLong(this.f345642d);
        parcel.writeLong(this.f345643e);
        parcel.writeByteArray(this.f345644f);
    }

    public EventMessage(Parcel parcel) {
        String string = parcel.readString();
        int i12 = U.f348106a;
        this.f345640b = string;
        this.f345641c = parcel.readString();
        this.f345642d = parcel.readLong();
        this.f345643e = parcel.readLong();
        this.f345644f = parcel.createByteArray();
    }
}
