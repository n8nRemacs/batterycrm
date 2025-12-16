package com.yandex.mobile.ads.video.models.ad;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;

/* loaded from: classes8.dex */
public final class JavaScriptResource implements Parcelable {
    public static final Parcelable.Creator<JavaScriptResource> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @N
    private final String f392901a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final String f392902b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f392903c;

    public class a implements Parcelable.Creator<JavaScriptResource> {
        @Override // android.os.Parcelable.Creator
        public final JavaScriptResource createFromParcel(@N Parcel parcel) {
            return new JavaScriptResource(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final JavaScriptResource[] newArray(int i12) {
            return new JavaScriptResource[i12];
        }
    }

    public /* synthetic */ JavaScriptResource(Parcel parcel, int i12) {
        this(parcel);
    }

    @N
    public final String c() {
        return this.f392901a;
    }

    @N
    public final String d() {
        return this.f392902b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JavaScriptResource.class != obj.getClass()) {
            return false;
        }
        JavaScriptResource javaScriptResource = (JavaScriptResource) obj;
        if (this.f392903c == javaScriptResource.f392903c && this.f392901a.equals(javaScriptResource.f392901a)) {
            return this.f392902b.equals(javaScriptResource.f392902b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f392902b.hashCode() + (((this.f392901a.hashCode() * 31) + (this.f392903c ? 1 : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        parcel.writeString(this.f392901a);
        parcel.writeInt(this.f392903c ? 1 : 0);
        parcel.writeString(this.f392902b);
    }

    public JavaScriptResource(@N String str, @N String str2, boolean z12) {
        this.f392901a = str;
        this.f392902b = str2;
        this.f392903c = z12;
    }

    private JavaScriptResource(@N Parcel parcel) {
        this.f392901a = parcel.readString();
        this.f392903c = parcel.readInt() != 0;
        this.f392902b = parcel.readString();
    }
}
