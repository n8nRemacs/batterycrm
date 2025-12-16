package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.fl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38811fl implements Parcelable {
    public static final Parcelable.Creator<C38811fl> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f380597a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f380598b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f380599c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f380600d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final C39227wl f380601e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public final C38861hl f380602f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public final C38861hl f380603g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public final C38861hl f380604h;

    /* renamed from: com.yandex.metrica.impl.ob.fl$a */
    public class a implements Parcelable.Creator<C38811fl> {
        @Override // android.os.Parcelable.Creator
        public C38811fl createFromParcel(Parcel parcel) {
            return new C38811fl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C38811fl[] newArray(int i12) {
            return new C38811fl[i12];
        }
    }

    public C38811fl(@j.N C39057pi c39057pi) {
        this(c39057pi.f().f379401j, c39057pi.f().f379403l, c39057pi.f().f379402k, c39057pi.f().f379404m, c39057pi.T(), c39057pi.S(), c39057pi.R(), c39057pi.U());
    }

    public boolean a() {
        return (this.f380601e == null || this.f380602f == null || this.f380603g == null || this.f380604h == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C38811fl.class != obj.getClass()) {
            return false;
        }
        C38811fl c38811fl = (C38811fl) obj;
        if (this.f380597a != c38811fl.f380597a || this.f380598b != c38811fl.f380598b || this.f380599c != c38811fl.f380599c || this.f380600d != c38811fl.f380600d) {
            return false;
        }
        C39227wl c39227wl = this.f380601e;
        if (c39227wl == null ? c38811fl.f380601e != null : !c39227wl.equals(c38811fl.f380601e)) {
            return false;
        }
        C38861hl c38861hl = this.f380602f;
        if (c38861hl == null ? c38811fl.f380602f != null : !c38861hl.equals(c38811fl.f380602f)) {
            return false;
        }
        C38861hl c38861hl2 = this.f380603g;
        if (c38861hl2 == null ? c38811fl.f380603g != null : !c38861hl2.equals(c38811fl.f380603g)) {
            return false;
        }
        C38861hl c38861hl3 = this.f380604h;
        return c38861hl3 != null ? c38861hl3.equals(c38811fl.f380604h) : c38811fl.f380604h == null;
    }

    public int hashCode() {
        int i12 = (((((((this.f380597a ? 1 : 0) * 31) + (this.f380598b ? 1 : 0)) * 31) + (this.f380599c ? 1 : 0)) * 31) + (this.f380600d ? 1 : 0)) * 31;
        C39227wl c39227wl = this.f380601e;
        int iHashCode = (i12 + (c39227wl != null ? c39227wl.hashCode() : 0)) * 31;
        C38861hl c38861hl = this.f380602f;
        int iHashCode2 = (iHashCode + (c38861hl != null ? c38861hl.hashCode() : 0)) * 31;
        C38861hl c38861hl2 = this.f380603g;
        int iHashCode3 = (iHashCode2 + (c38861hl2 != null ? c38861hl2.hashCode() : 0)) * 31;
        C38861hl c38861hl3 = this.f380604h;
        return iHashCode3 + (c38861hl3 != null ? c38861hl3.hashCode() : 0);
    }

    public String toString() {
        return "UiAccessConfig{uiParsingEnabled=" + this.f380597a + ", uiEventSendingEnabled=" + this.f380598b + ", uiCollectingForBridgeEnabled=" + this.f380599c + ", uiRawEventSendingEnabled=" + this.f380600d + ", uiParsingConfig=" + this.f380601e + ", uiEventSendingConfig=" + this.f380602f + ", uiCollectingForBridgeConfig=" + this.f380603g + ", uiRawEventSendingConfig=" + this.f380604h + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeByte(this.f380597a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f380598b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f380599c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f380600d ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f380601e, i12);
        parcel.writeParcelable(this.f380602f, i12);
        parcel.writeParcelable(this.f380603g, i12);
        parcel.writeParcelable(this.f380604h, i12);
    }

    public C38811fl(boolean z12, boolean z13, boolean z14, boolean z15, @j.P C39227wl c39227wl, @j.P C38861hl c38861hl, @j.P C38861hl c38861hl2, @j.P C38861hl c38861hl3) {
        this.f380597a = z12;
        this.f380598b = z13;
        this.f380599c = z14;
        this.f380600d = z15;
        this.f380601e = c39227wl;
        this.f380602f = c38861hl;
        this.f380603g = c38861hl2;
        this.f380604h = c38861hl3;
    }

    public C38811fl(Parcel parcel) {
        this.f380597a = parcel.readByte() != 0;
        this.f380598b = parcel.readByte() != 0;
        this.f380599c = parcel.readByte() != 0;
        this.f380600d = parcel.readByte() != 0;
        this.f380601e = (C39227wl) parcel.readParcelable(C39227wl.class.getClassLoader());
        this.f380602f = (C38861hl) parcel.readParcelable(C38861hl.class.getClassLoader());
        this.f380603g = (C38861hl) parcel.readParcelable(C38861hl.class.getClassLoader());
        this.f380604h = (C38861hl) parcel.readParcelable(C38861hl.class.getClassLoader());
    }
}
