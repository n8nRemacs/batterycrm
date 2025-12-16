package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;

/* loaded from: classes8.dex */
public final class RatingAppearance implements Parcelable {
    public static final Parcelable.Creator<RatingAppearance> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final int f392838a;

    /* renamed from: b, reason: collision with root package name */
    private final int f392839b;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private int f392840a;

        /* renamed from: b, reason: collision with root package name */
        private int f392841b;

        @N
        public RatingAppearance build() {
            return new RatingAppearance(this, 0);
        }

        @N
        public Builder setBackgroundStarColor(int i12) {
            this.f392840a = i12;
            return this;
        }

        @N
        public Builder setProgressStarColor(int i12) {
            this.f392841b = i12;
            return this;
        }
    }

    public class a implements Parcelable.Creator<RatingAppearance> {
        @Override // android.os.Parcelable.Creator
        public final RatingAppearance createFromParcel(Parcel parcel) {
            return new RatingAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAppearance[] newArray(int i12) {
            return new RatingAppearance[i12];
        }
    }

    public /* synthetic */ RatingAppearance(Builder builder, int i12) {
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
        if (obj == null || RatingAppearance.class != obj.getClass()) {
            return false;
        }
        RatingAppearance ratingAppearance = (RatingAppearance) obj;
        return this.f392838a == ratingAppearance.f392838a && this.f392839b == ratingAppearance.f392839b;
    }

    public int getBackgroundStarColor() {
        return this.f392838a;
    }

    public int getProgressStarColor() {
        return this.f392839b;
    }

    public int hashCode() {
        return (this.f392838a * 31) + this.f392839b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f392838a);
        parcel.writeInt(this.f392839b);
    }

    private RatingAppearance(@N Builder builder) {
        this.f392838a = builder.f392840a;
        this.f392839b = builder.f392841b;
    }

    public RatingAppearance(Parcel parcel) {
        this.f392838a = parcel.readInt();
        this.f392839b = parcel.readInt();
    }
}
