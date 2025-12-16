package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.nativeads.template.HorizontalOffset;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public final class BannerAppearance implements Parcelable {
    public static final Parcelable.Creator<BannerAppearance> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @P
    private final HorizontalOffset f392780a;

    /* renamed from: b, reason: collision with root package name */
    @P
    private final HorizontalOffset f392781b;

    /* renamed from: c, reason: collision with root package name */
    private final int f392782c;

    /* renamed from: d, reason: collision with root package name */
    private final int f392783d;

    /* renamed from: e, reason: collision with root package name */
    private final float f392784e;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private int f392785a;

        /* renamed from: b, reason: collision with root package name */
        private int f392786b;

        /* renamed from: c, reason: collision with root package name */
        private float f392787c;

        /* renamed from: d, reason: collision with root package name */
        private HorizontalOffset f392788d;

        /* renamed from: e, reason: collision with root package name */
        private HorizontalOffset f392789e;

        @N
        public BannerAppearance build() {
            return new BannerAppearance(this, 0);
        }

        @N
        public Builder setBackgroundColor(int i12) {
            this.f392785a = i12;
            return this;
        }

        @N
        public Builder setBorderColor(int i12) {
            this.f392786b = i12;
            return this;
        }

        @N
        public Builder setBorderWidth(float f12) {
            this.f392787c = f12;
            return this;
        }

        @N
        public Builder setContentPadding(@N HorizontalOffset horizontalOffset) {
            this.f392788d = horizontalOffset;
            return this;
        }

        @N
        public Builder setImageMargins(@N HorizontalOffset horizontalOffset) {
            this.f392789e = horizontalOffset;
            return this;
        }
    }

    public class a implements Parcelable.Creator<BannerAppearance> {
        @Override // android.os.Parcelable.Creator
        public final BannerAppearance createFromParcel(Parcel parcel) {
            return new BannerAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BannerAppearance[] newArray(int i12) {
            return new BannerAppearance[i12];
        }
    }

    public /* synthetic */ BannerAppearance(Builder builder, int i12) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BannerAppearance.class != obj.getClass()) {
            return false;
        }
        BannerAppearance bannerAppearance = (BannerAppearance) obj;
        if (this.f392782c != bannerAppearance.f392782c || this.f392783d != bannerAppearance.f392783d || Float.compare(bannerAppearance.f392784e, this.f392784e) != 0) {
            return false;
        }
        HorizontalOffset horizontalOffset = this.f392780a;
        if (horizontalOffset == null ? bannerAppearance.f392780a != null : !horizontalOffset.equals(bannerAppearance.f392780a)) {
            return false;
        }
        HorizontalOffset horizontalOffset2 = this.f392781b;
        HorizontalOffset horizontalOffset3 = bannerAppearance.f392781b;
        return horizontalOffset2 == null ? horizontalOffset3 == null : horizontalOffset2.equals(horizontalOffset3);
    }

    public int getBackgroundColor() {
        return this.f392782c;
    }

    public int getBorderColor() {
        return this.f392783d;
    }

    public float getBorderWidth() {
        return this.f392784e;
    }

    @P
    public HorizontalOffset getContentPadding() {
        return this.f392780a;
    }

    @P
    public HorizontalOffset getImageMargins() {
        return this.f392781b;
    }

    public int hashCode() {
        int i12 = ((this.f392782c * 31) + this.f392783d) * 31;
        float f12 = this.f392784e;
        int iFloatToIntBits = (i12 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
        HorizontalOffset horizontalOffset = this.f392780a;
        int iHashCode = (iFloatToIntBits + (horizontalOffset != null ? horizontalOffset.hashCode() : 0)) * 31;
        HorizontalOffset horizontalOffset2 = this.f392781b;
        return iHashCode + (horizontalOffset2 != null ? horizontalOffset2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f392782c);
        parcel.writeInt(this.f392783d);
        parcel.writeFloat(this.f392784e);
        parcel.writeParcelable(this.f392780a, 0);
        parcel.writeParcelable(this.f392781b, 0);
    }

    private BannerAppearance(@N Builder builder) {
        this.f392782c = builder.f392785a;
        this.f392783d = builder.f392786b;
        this.f392784e = builder.f392787c;
        this.f392780a = builder.f392788d;
        this.f392781b = builder.f392789e;
    }

    public BannerAppearance(Parcel parcel) {
        this.f392782c = parcel.readInt();
        this.f392783d = parcel.readInt();
        this.f392784e = parcel.readFloat();
        this.f392780a = (HorizontalOffset) parcel.readParcelable(HorizontalOffset.class.getClassLoader());
        this.f392781b = (HorizontalOffset) parcel.readParcelable(HorizontalOffset.class.getClassLoader());
    }
}
