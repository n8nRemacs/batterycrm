package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.qa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39073qa implements Parcelable {
    public static final Parcelable.Creator<C39073qa> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f381452a;

    /* renamed from: b, reason: collision with root package name */
    public final int f381453b;

    /* renamed from: com.yandex.metrica.impl.ob.qa$a */
    public class a implements Parcelable.Creator<C39073qa> {
        @Override // android.os.Parcelable.Creator
        public C39073qa createFromParcel(Parcel parcel) {
            return new C39073qa(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C39073qa[] newArray(int i12) {
            return new C39073qa[i12];
        }
    }

    public C39073qa(long j12, int i12) {
        this.f381452a = j12;
        this.f381453b = i12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DiagnosticsConfig{expirationTimestampSeconds=");
        sb2.append(this.f381452a);
        sb2.append(", intervalSeconds=");
        return androidx.appcompat.app.r.t(sb2, this.f381453b, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeLong(this.f381452a);
        parcel.writeInt(this.f381453b);
    }

    public C39073qa(Parcel parcel) {
        this.f381452a = parcel.readLong();
        this.f381453b = parcel.readInt();
    }
}
