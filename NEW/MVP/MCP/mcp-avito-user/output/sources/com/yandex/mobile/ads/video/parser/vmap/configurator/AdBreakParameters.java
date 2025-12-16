package com.yandex.mobile.ads.video.parser.vmap.configurator;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public class AdBreakParameters implements Parcelable {
    public static final Parcelable.Creator<AdBreakParameters> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @P
    private final String f392914a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final String f392915b;

    /* renamed from: c, reason: collision with root package name */
    @P
    private final String f392916c;

    public class a implements Parcelable.Creator<AdBreakParameters> {
        @Override // android.os.Parcelable.Creator
        public final AdBreakParameters createFromParcel(@N Parcel parcel) {
            return new AdBreakParameters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdBreakParameters[] newArray(int i12) {
            return new AdBreakParameters[i12];
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @P
        private String f392917a;

        /* renamed from: b, reason: collision with root package name */
        @P
        private String f392918b;

        /* renamed from: c, reason: collision with root package name */
        @P
        private String f392919c;

        @N
        public final void a(@N String str) {
            this.f392918b = str;
        }

        @N
        public final void b(@N String str) {
            this.f392917a = str;
        }

        @N
        public final void c(@N String str) {
            this.f392919c = str;
        }
    }

    public /* synthetic */ AdBreakParameters(b bVar, int i12) {
        this(bVar);
    }

    @P
    public final String c() {
        return this.f392915b;
    }

    @P
    public final String d() {
        return this.f392914a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @P
    public final String e() {
        return this.f392916c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeString(this.f392914a);
        parcel.writeString(this.f392915b);
        parcel.writeString(this.f392916c);
    }

    private AdBreakParameters(@N b bVar) {
        this.f392914a = bVar.f392917a;
        this.f392915b = bVar.f392918b;
        this.f392916c = bVar.f392919c;
    }

    public AdBreakParameters(@N Parcel parcel) {
        this.f392914a = parcel.readString();
        this.f392915b = parcel.readString();
        this.f392916c = parcel.readString();
    }
}
