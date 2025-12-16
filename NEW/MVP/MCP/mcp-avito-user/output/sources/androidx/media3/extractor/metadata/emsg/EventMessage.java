package androidx.media3.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C23108t;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.util.Arrays;

@J
/* loaded from: classes.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;

    /* renamed from: h, reason: collision with root package name */
    public static final C23108t f50624h;

    /* renamed from: i, reason: collision with root package name */
    public static final C23108t f50625i;

    /* renamed from: b, reason: collision with root package name */
    public final String f50626b;

    /* renamed from: c, reason: collision with root package name */
    public final String f50627c;

    /* renamed from: d, reason: collision with root package name */
    public final long f50628d;

    /* renamed from: e, reason: collision with root package name */
    public final long f50629e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f50630f;

    /* renamed from: g, reason: collision with root package name */
    public int f50631g;

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
        C23108t.b bVar = new C23108t.b();
        bVar.f47787k = "application/id3";
        f50624h = bVar.a();
        C23108t.b bVar2 = new C23108t.b();
        bVar2.f47787k = "application/x-scte35";
        f50625i = bVar2.a();
        CREATOR = new a();
    }

    public EventMessage(String str, String str2, long j12, long j13, byte[] bArr) {
        this.f50626b = str;
        this.f50627c = str2;
        this.f50628d = j12;
        this.f50629e = j13;
        this.f50630f = bArr;
    }

    @Override // androidx.media3.common.Metadata.Entry
    @P
    public final byte[] Z() {
        if (i0() != null) {
            return this.f50630f;
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
        return this.f50628d == eventMessage.f50628d && this.f50629e == eventMessage.f50629e && M.a(this.f50626b, eventMessage.f50626b) && M.a(this.f50627c, eventMessage.f50627c) && Arrays.equals(this.f50630f, eventMessage.f50630f);
    }

    public final int hashCode() {
        if (this.f50631g == 0) {
            String str = this.f50626b;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f50627c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j12 = this.f50628d;
            int i12 = (iHashCode2 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f50629e;
            this.f50631g = Arrays.hashCode(this.f50630f) + ((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31);
        }
        return this.f50631g;
    }

    @Override // androidx.media3.common.Metadata.Entry
    @P
    public final C23108t i0() {
        String str = this.f50626b;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f50625i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f50624h;
            default:
                return null;
        }
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f50626b + ", id=" + this.f50629e + ", durationMs=" + this.f50628d + ", value=" + this.f50627c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f50626b);
        parcel.writeString(this.f50627c);
        parcel.writeLong(this.f50628d);
        parcel.writeLong(this.f50629e);
        parcel.writeByteArray(this.f50630f);
    }

    public EventMessage(Parcel parcel) {
        String string = parcel.readString();
        int i12 = M.f47887a;
        this.f50626b = string;
        this.f50627c = parcel.readString();
        this.f50628d = parcel.readLong();
        this.f50629e = parcel.readLong();
        this.f50630f = parcel.createByteArray();
    }
}
