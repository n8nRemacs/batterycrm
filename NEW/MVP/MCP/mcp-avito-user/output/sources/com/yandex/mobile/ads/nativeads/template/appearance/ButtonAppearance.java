package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;
import j.P;

/* loaded from: classes8.dex */
public final class ButtonAppearance implements Parcelable {
    public static final Parcelable.Creator<ButtonAppearance> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @P
    private final TextAppearance f392790a;

    /* renamed from: b, reason: collision with root package name */
    private final int f392791b;

    /* renamed from: c, reason: collision with root package name */
    private final float f392792c;

    /* renamed from: d, reason: collision with root package name */
    private final int f392793d;

    /* renamed from: e, reason: collision with root package name */
    private final int f392794e;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private int f392795a;

        /* renamed from: b, reason: collision with root package name */
        private float f392796b;

        /* renamed from: c, reason: collision with root package name */
        private int f392797c;

        /* renamed from: d, reason: collision with root package name */
        private int f392798d;

        /* renamed from: e, reason: collision with root package name */
        private TextAppearance f392799e;

        @N
        public ButtonAppearance build() {
            return new ButtonAppearance(this, 0);
        }

        @N
        public Builder setBorderColor(int i12) {
            this.f392795a = i12;
            return this;
        }

        @N
        public Builder setBorderWidth(float f12) {
            this.f392796b = f12;
            return this;
        }

        @N
        public Builder setNormalColor(int i12) {
            this.f392797c = i12;
            return this;
        }

        @N
        public Builder setPressedColor(int i12) {
            this.f392798d = i12;
            return this;
        }

        @N
        public Builder setTextAppearance(@N TextAppearance textAppearance) {
            this.f392799e = textAppearance;
            return this;
        }
    }

    public class a implements Parcelable.Creator<ButtonAppearance> {
        @Override // android.os.Parcelable.Creator
        public final ButtonAppearance createFromParcel(Parcel parcel) {
            return new ButtonAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonAppearance[] newArray(int i12) {
            return new ButtonAppearance[i12];
        }
    }

    public /* synthetic */ ButtonAppearance(Builder builder, int i12) {
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
        if (obj == null || ButtonAppearance.class != obj.getClass()) {
            return false;
        }
        ButtonAppearance buttonAppearance = (ButtonAppearance) obj;
        if (this.f392791b != buttonAppearance.f392791b || Float.compare(buttonAppearance.f392792c, this.f392792c) != 0 || this.f392793d != buttonAppearance.f392793d || this.f392794e != buttonAppearance.f392794e) {
            return false;
        }
        TextAppearance textAppearance = this.f392790a;
        if (textAppearance != null) {
            if (textAppearance.equals(buttonAppearance.f392790a)) {
                return true;
            }
        } else if (buttonAppearance.f392790a == null) {
            return true;
        }
        return false;
    }

    public int getBorderColor() {
        return this.f392791b;
    }

    public float getBorderWidth() {
        return this.f392792c;
    }

    public int getNormalColor() {
        return this.f392793d;
    }

    public int getPressedColor() {
        return this.f392794e;
    }

    @P
    public TextAppearance getTextAppearance() {
        return this.f392790a;
    }

    public int hashCode() {
        int i12 = this.f392791b * 31;
        float f12 = this.f392792c;
        int iFloatToIntBits = (((((i12 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31) + this.f392793d) * 31) + this.f392794e) * 31;
        TextAppearance textAppearance = this.f392790a;
        return iFloatToIntBits + (textAppearance != null ? textAppearance.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f392791b);
        parcel.writeFloat(this.f392792c);
        parcel.writeInt(this.f392793d);
        parcel.writeInt(this.f392794e);
        parcel.writeParcelable(this.f392790a, 0);
    }

    private ButtonAppearance(@N Builder builder) {
        this.f392791b = builder.f392795a;
        this.f392792c = builder.f392796b;
        this.f392793d = builder.f392797c;
        this.f392794e = builder.f392798d;
        this.f392790a = builder.f392799e;
    }

    public ButtonAppearance(Parcel parcel) {
        this.f392791b = parcel.readInt();
        this.f392792c = parcel.readFloat();
        this.f392793d = parcel.readInt();
        this.f392794e = parcel.readInt();
        this.f392790a = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
    }
}
