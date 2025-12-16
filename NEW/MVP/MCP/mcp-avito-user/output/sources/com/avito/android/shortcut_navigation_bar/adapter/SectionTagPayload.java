package com.avito.android.shortcut_navigation_bar.adapter;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShortcutNavigationItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/SectionTagPayload;", "Landroid/os/Parcelable;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionTagPayload implements Parcelable {

    @k
    public static final Parcelable.Creator<SectionTagPayload> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f283239b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f283240c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f283241d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f283242e;

    /* compiled from: ShortcutNavigationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SectionTagPayload> {
        @Override // android.os.Parcelable.Creator
        public final SectionTagPayload createFromParcel(Parcel parcel) {
            return new SectionTagPayload(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SectionTagPayload[] newArray(int i12) {
            return new SectionTagPayload[i12];
        }
    }

    public SectionTagPayload(@k String str, @k String str2, @l String str3, boolean z12) {
        this.f283239b = str;
        this.f283240c = str2;
        this.f283241d = str3;
        this.f283242e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionTagPayload)) {
            return false;
        }
        SectionTagPayload sectionTagPayload = (SectionTagPayload) obj;
        return L.f(this.f283239b, sectionTagPayload.f283239b) && L.f(this.f283240c, sectionTagPayload.f283240c) && L.f(this.f283241d, sectionTagPayload.f283241d) && this.f283242e == sectionTagPayload.f283242e;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f283239b.hashCode() * 31, 31, this.f283240c);
        String str = this.f283241d;
        return Boolean.hashCode(this.f283242e) + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionTagPayload(feedId=");
        sb2.append(this.f283239b);
        sb2.append(", filter=");
        sb2.append(this.f283240c);
        sb2.append(", unsetId=");
        sb2.append(this.f283241d);
        sb2.append(", selected=");
        return r.x(sb2, this.f283242e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f283239b);
        parcel.writeString(this.f283240c);
        parcel.writeString(this.f283241d);
        parcel.writeInt(this.f283242e ? 1 : 0);
    }
}
