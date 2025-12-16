package com.yandex.mobile.ads.exo.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.Cif;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.vw;
import j.P;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class EventMessage implements Metadata.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final String f382954a;

    /* renamed from: b, reason: collision with root package name */
    public final String f382955b;

    /* renamed from: c, reason: collision with root package name */
    public final long f382956c;

    /* renamed from: d, reason: collision with root package name */
    public final long f382957d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f382958e;

    /* renamed from: f, reason: collision with root package name */
    private int f382959f;

    /* renamed from: g, reason: collision with root package name */
    private static final vw f382952g = new vw.a().f("application/id3").a();

    /* renamed from: h, reason: collision with root package name */
    private static final vw f382953h = new vw.a().f("application/x-scte35").a();
    public static final Parcelable.Creator<EventMessage> CREATOR = new a();

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

    public EventMessage(String str, String str2, long j12, long j13, byte[] bArr) {
        this.f382954a = str;
        this.f382955b = str2;
        this.f382956c = j12;
        this.f382957d = j13;
        this.f382958e = bArr;
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    @P
    public final vw a() {
        String str = this.f382954a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f382953h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f382952g;
            default:
                return null;
        }
    }

    @Override // com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    @P
    public final byte[] b() {
        if (a() != null) {
            return this.f382958e;
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
        return this.f382956c == eventMessage.f382956c && this.f382957d == eventMessage.f382957d && pc1.a(this.f382954a, eventMessage.f382954a) && pc1.a(this.f382955b, eventMessage.f382955b) && Arrays.equals(this.f382958e, eventMessage.f382958e);
    }

    public final int hashCode() {
        if (this.f382959f == 0) {
            String str = this.f382954a;
            int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
            String str2 = this.f382955b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j12 = this.f382956c;
            int i12 = (iHashCode2 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f382957d;
            this.f382959f = Arrays.hashCode(this.f382958e) + ((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31);
        }
        return this.f382959f;
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("EMSG: scheme=");
        sbA.append(this.f382954a);
        sbA.append(", id=");
        sbA.append(this.f382957d);
        sbA.append(", durationMs=");
        sbA.append(this.f382956c);
        sbA.append(", value=");
        sbA.append(this.f382955b);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f382954a);
        parcel.writeString(this.f382955b);
        parcel.writeLong(this.f382956c);
        parcel.writeLong(this.f382957d);
        parcel.writeByteArray(this.f382958e);
    }

    public EventMessage(Parcel parcel) {
        this.f382954a = (String) pc1.a(parcel.readString());
        this.f382955b = (String) pc1.a(parcel.readString());
        this.f382956c = parcel.readLong();
        this.f382957d = parcel.readLong();
        this.f382958e = (byte[]) pc1.a(parcel.createByteArray());
    }
}
