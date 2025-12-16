package com.yandex.mobile.ads.video.parser.offset;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;

/* loaded from: classes8.dex */
public class VastTimeOffset implements Parcelable {
    public static final Parcelable.Creator<VastTimeOffset> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @N
    private final b f392904a;

    /* renamed from: b, reason: collision with root package name */
    private final float f392905b;

    public class a implements Parcelable.Creator<VastTimeOffset> {
        @Override // android.os.Parcelable.Creator
        public final VastTimeOffset createFromParcel(@N Parcel parcel) {
            return new VastTimeOffset(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final VastTimeOffset[] newArray(int i12) {
            return new VastTimeOffset[i12];
        }
    }

    public enum b {
        f392906a,
        f392907b,
        f392908c;

        b() {
        }
    }

    public VastTimeOffset(@N b bVar, float f12) {
        this.f392904a = bVar;
        this.f392905b = f12;
    }

    @N
    public final b c() {
        return this.f392904a;
    }

    public final float d() {
        return this.f392905b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        b bVar = this.f392904a;
        parcel.writeInt(bVar == null ? -1 : bVar.ordinal());
        parcel.writeFloat(this.f392905b);
    }

    public VastTimeOffset(@N Parcel parcel) {
        int i12 = parcel.readInt();
        this.f392904a = i12 == -1 ? null : b.values()[i12];
        this.f392905b = parcel.readFloat();
    }
}
