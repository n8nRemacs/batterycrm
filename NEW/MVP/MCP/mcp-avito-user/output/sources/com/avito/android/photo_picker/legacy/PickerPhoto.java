package com.avito.android.photo_picker.legacy;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.photo_cache.EnhanceState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PickerPhoto.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_picker/legacy/PickerPhoto;", "Landroid/os/Parcelable;", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PickerPhoto implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PickerPhoto> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f219613b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Uri f219614c;

    /* renamed from: d, reason: collision with root package name */
    public final int f219615d;

    /* renamed from: e, reason: collision with root package name */
    public final int f219616e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Uri f219617f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Uri f219618g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f219619h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final EnhanceState f219620i;

    /* compiled from: PickerPhoto.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PickerPhoto> {
        @Override // android.os.Parcelable.Creator
        public final PickerPhoto createFromParcel(Parcel parcel) {
            return new PickerPhoto(parcel.readString(), (Uri) parcel.readParcelable(PickerPhoto.class.getClassLoader()), parcel.readInt(), parcel.readInt(), (Uri) parcel.readParcelable(PickerPhoto.class.getClassLoader()), (Uri) parcel.readParcelable(PickerPhoto.class.getClassLoader()), parcel.readString(), EnhanceState.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final PickerPhoto[] newArray(int i12) {
            return new PickerPhoto[i12];
        }
    }

    public PickerPhoto(@Y61.k String str, @Y61.k Uri uri, int i12, int i13, @Y61.l Uri uri2, @Y61.l Uri uri3, @Y61.l String str2, @Y61.k EnhanceState enhanceState) {
        this.f219613b = str;
        this.f219614c = uri;
        this.f219615d = i12;
        this.f219616e = i13;
        this.f219617f = uri2;
        this.f219618g = uri3;
        this.f219619h = str2;
        this.f219620i = enhanceState;
    }

    public static PickerPhoto a(PickerPhoto pickerPhoto, Uri uri, Uri uri2, int i12) {
        String str = pickerPhoto.f219613b;
        Uri uri3 = pickerPhoto.f219614c;
        int i13 = pickerPhoto.f219615d;
        int i14 = pickerPhoto.f219616e;
        if ((i12 & 16) != 0) {
            uri = pickerPhoto.f219617f;
        }
        Uri uri4 = uri;
        if ((i12 & 32) != 0) {
            uri2 = pickerPhoto.f219618g;
        }
        String str2 = pickerPhoto.f219619h;
        EnhanceState enhanceState = pickerPhoto.f219620i;
        pickerPhoto.getClass();
        return new PickerPhoto(str, uri3, i13, i14, uri4, uri2, str2, enhanceState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PickerPhoto)) {
            return false;
        }
        PickerPhoto pickerPhoto = (PickerPhoto) obj;
        return kotlin.jvm.internal.L.f(this.f219613b, pickerPhoto.f219613b) && kotlin.jvm.internal.L.f(this.f219614c, pickerPhoto.f219614c) && this.f219615d == pickerPhoto.f219615d && this.f219616e == pickerPhoto.f219616e && kotlin.jvm.internal.L.f(this.f219617f, pickerPhoto.f219617f) && kotlin.jvm.internal.L.f(this.f219618g, pickerPhoto.f219618g) && kotlin.jvm.internal.L.f(this.f219619h, pickerPhoto.f219619h) && this.f219620i == pickerPhoto.f219620i;
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f219616e, androidx.appcompat.app.r.e(this.f219615d, androidx.media3.exoplayer.analytics.m.e(this.f219614c, this.f219613b.hashCode() * 31, 31), 31), 31);
        Uri uri = this.f219617f;
        int iHashCode = (iE2 + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.f219618g;
        int iHashCode2 = (iHashCode + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        String str = this.f219619h;
        return this.f219620i.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "PickerPhoto(id=" + this.f219613b + ", source=" + this.f219614c + ", position=" + this.f219615d + ", from=" + this.f219616e + ", thumbnail=" + this.f219617f + ", uri=" + this.f219618g + ", uploadId=" + this.f219619h + ", enhanceState=" + this.f219620i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f219613b);
        parcel.writeParcelable(this.f219614c, i12);
        parcel.writeInt(this.f219615d);
        parcel.writeInt(this.f219616e);
        parcel.writeParcelable(this.f219617f, i12);
        parcel.writeParcelable(this.f219618g, i12);
        parcel.writeString(this.f219619h);
        parcel.writeString(this.f219620i.name());
    }

    public /* synthetic */ PickerPhoto(String str, Uri uri, int i12, int i13, Uri uri2, Uri uri3, String str2, EnhanceState enhanceState, int i14, C42822w c42822w) {
        this(str, uri, i12, i13, (i14 & 16) != 0 ? null : uri2, (i14 & 32) != 0 ? null : uri3, (i14 & 64) != 0 ? null : str2, (i14 & 128) != 0 ? EnhanceState.f216287c : enhanceState);
    }
}
