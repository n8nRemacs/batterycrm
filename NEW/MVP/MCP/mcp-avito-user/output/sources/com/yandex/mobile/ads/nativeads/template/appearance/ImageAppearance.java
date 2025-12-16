package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public final class ImageAppearance implements Parcelable {
    public static final Parcelable.Creator<ImageAppearance> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @P
    private final SizeConstraint f392800a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @P
        private SizeConstraint f392801a;

        @N
        public ImageAppearance build() {
            return new ImageAppearance(this, 0);
        }

        @N
        public Builder setWidthConstraint(@N SizeConstraint sizeConstraint) {
            this.f392801a = sizeConstraint;
            return this;
        }
    }

    public class a implements Parcelable.Creator<ImageAppearance> {
        @Override // android.os.Parcelable.Creator
        public final ImageAppearance createFromParcel(Parcel parcel) {
            return new ImageAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ImageAppearance[] newArray(int i12) {
            return new ImageAppearance[i12];
        }
    }

    public /* synthetic */ ImageAppearance(Builder builder, int i12) {
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
        if (obj == null || ImageAppearance.class != obj.getClass()) {
            return false;
        }
        ImageAppearance imageAppearance = (ImageAppearance) obj;
        SizeConstraint sizeConstraint = this.f392800a;
        if (sizeConstraint != null) {
            if (sizeConstraint.equals(imageAppearance.f392800a)) {
                return true;
            }
        } else if (imageAppearance.f392800a == null) {
            return true;
        }
        return false;
    }

    @P
    public SizeConstraint getWidthConstraint() {
        return this.f392800a;
    }

    public int hashCode() {
        SizeConstraint sizeConstraint = this.f392800a;
        if (sizeConstraint != null) {
            return sizeConstraint.hashCode();
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeParcelable(this.f392800a, i12);
    }

    private ImageAppearance(@N Builder builder) {
        this.f392800a = builder.f392801a;
    }

    public ImageAppearance(Parcel parcel) {
        this.f392800a = (SizeConstraint) parcel.readParcelable(SizeConstraint.class.getClassLoader());
    }
}
