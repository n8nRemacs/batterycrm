package com.avito.android.photo_cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotoSource.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_cache/PhotoSource;", "", "Landroid/os/Parcelable;", "_avito_photo-cache_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoSource implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PhotoSource> CREATOR;

    /* renamed from: c, reason: collision with root package name */
    public static final PhotoSource f216293c;

    /* renamed from: d, reason: collision with root package name */
    public static final PhotoSource f216294d;

    /* renamed from: e, reason: collision with root package name */
    public static final PhotoSource f216295e;

    /* renamed from: f, reason: collision with root package name */
    public static final PhotoSource f216296f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ PhotoSource[] f216297g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f216298h;

    /* renamed from: b, reason: collision with root package name */
    public final int f216299b;

    static {
        PhotoSource photoSource = new PhotoSource(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
        f216293c = photoSource;
        PhotoSource photoSource2 = new PhotoSource("CAMERA", 1, 1);
        f216294d = photoSource2;
        PhotoSource photoSource3 = new PhotoSource("CAMERA_TEMP", 2, 1);
        f216295e = photoSource3;
        PhotoSource photoSource4 = new PhotoSource("GALLERY", 3, 2);
        f216296f = photoSource4;
        PhotoSource[] photoSourceArr = {photoSource, photoSource2, photoSource3, photoSource4};
        f216297g = photoSourceArr;
        f216298h = kotlin.enums.c.a(photoSourceArr);
        CREATOR = new Parcelable.Creator<PhotoSource>() { // from class: com.avito.android.photo_cache.PhotoSource.a
            @Override // android.os.Parcelable.Creator
            public final PhotoSource createFromParcel(Parcel parcel) {
                return PhotoSource.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PhotoSource[] newArray(int i12) {
                return new PhotoSource[i12];
            }
        };
    }

    public PhotoSource(String str, int i12, int i13) {
        this.f216299b = i13;
    }

    public static PhotoSource valueOf(String str) {
        return (PhotoSource) Enum.valueOf(PhotoSource.class, str);
    }

    public static PhotoSource[] values() {
        return (PhotoSource[]) f216297g.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
