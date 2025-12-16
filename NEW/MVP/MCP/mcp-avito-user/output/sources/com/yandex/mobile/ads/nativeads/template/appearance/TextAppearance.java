package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public final class TextAppearance implements Parcelable {
    public static final Parcelable.Creator<TextAppearance> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @P
    private final String f392842a;

    /* renamed from: b, reason: collision with root package name */
    private final int f392843b;

    /* renamed from: c, reason: collision with root package name */
    private final float f392844c;

    /* renamed from: d, reason: collision with root package name */
    private final int f392845d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        @P
        private String f392846a;

        /* renamed from: b, reason: collision with root package name */
        private int f392847b;

        /* renamed from: c, reason: collision with root package name */
        private float f392848c;

        /* renamed from: d, reason: collision with root package name */
        private int f392849d;

        @N
        public TextAppearance build() {
            return new TextAppearance(this, 0);
        }

        @N
        public Builder setFontFamilyName(@P String str) {
            this.f392846a = str;
            return this;
        }

        public Builder setFontStyle(int i12) {
            this.f392849d = i12;
            return this;
        }

        @N
        public Builder setTextColor(int i12) {
            this.f392847b = i12;
            return this;
        }

        @N
        public Builder setTextSize(float f12) {
            this.f392848c = f12;
            return this;
        }
    }

    public class a implements Parcelable.Creator<TextAppearance> {
        @Override // android.os.Parcelable.Creator
        public final TextAppearance createFromParcel(Parcel parcel) {
            return new TextAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TextAppearance[] newArray(int i12) {
            return new TextAppearance[i12];
        }
    }

    public /* synthetic */ TextAppearance(Builder builder, int i12) {
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
        if (obj == null || TextAppearance.class != obj.getClass()) {
            return false;
        }
        TextAppearance textAppearance = (TextAppearance) obj;
        if (this.f392843b != textAppearance.f392843b || Float.compare(textAppearance.f392844c, this.f392844c) != 0 || this.f392845d != textAppearance.f392845d) {
            return false;
        }
        String str = this.f392842a;
        if (str != null) {
            if (str.equals(textAppearance.f392842a)) {
                return true;
            }
        } else if (textAppearance.f392842a == null) {
            return true;
        }
        return false;
    }

    @P
    public String getFontFamilyName() {
        return this.f392842a;
    }

    public int getFontStyle() {
        return this.f392845d;
    }

    public int getTextColor() {
        return this.f392843b;
    }

    public float getTextSize() {
        return this.f392844c;
    }

    public int hashCode() {
        int i12 = this.f392843b * 31;
        float f12 = this.f392844c;
        int iFloatToIntBits = (i12 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
        String str = this.f392842a;
        return ((iFloatToIntBits + (str != null ? str.hashCode() : 0)) * 31) + this.f392845d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f392843b);
        parcel.writeFloat(this.f392844c);
        parcel.writeString(this.f392842a);
        parcel.writeInt(this.f392845d);
    }

    private TextAppearance(Builder builder) {
        this.f392843b = builder.f392847b;
        this.f392844c = builder.f392848c;
        this.f392842a = builder.f392846a;
        this.f392845d = builder.f392849d;
    }

    public TextAppearance(Parcel parcel) {
        this.f392843b = parcel.readInt();
        this.f392844c = parcel.readFloat();
        this.f392842a = parcel.readString();
        this.f392845d = parcel.readInt();
    }
}
