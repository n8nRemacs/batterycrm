package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import j.N;

/* loaded from: classes8.dex */
public final class SizeConstraint implements Parcelable {
    public static final Parcelable.Creator<SizeConstraint> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @N
    private final SizeConstraintType f392774a;

    /* renamed from: b, reason: collision with root package name */
    private final float f392775b;

    public enum SizeConstraintType {
        FIXED,
        FIXED_RATIO,
        PREFERRED_RATIO;

        SizeConstraintType() {
        }
    }

    public class a implements Parcelable.Creator<SizeConstraint> {
        @Override // android.os.Parcelable.Creator
        public final SizeConstraint createFromParcel(Parcel parcel) {
            return new SizeConstraint(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SizeConstraint[] newArray(int i12) {
            return new SizeConstraint[i12];
        }
    }

    public SizeConstraint(@N SizeConstraintType sizeConstraintType, float f12) {
        this.f392774a = sizeConstraintType;
        this.f392775b = f12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SizeConstraint.class != obj.getClass()) {
            return false;
        }
        SizeConstraint sizeConstraint = (SizeConstraint) obj;
        return Float.compare(sizeConstraint.f392775b, this.f392775b) == 0 && this.f392774a == sizeConstraint.f392774a;
    }

    @N
    public SizeConstraintType getSizeConstraintType() {
        return this.f392774a;
    }

    public float getValue() {
        return this.f392775b;
    }

    public int hashCode() {
        float f12 = this.f392775b;
        int iFloatToIntBits = (f12 != 0.0f ? Float.floatToIntBits(f12) : 0) * 31;
        SizeConstraintType sizeConstraintType = this.f392774a;
        return iFloatToIntBits + (sizeConstraintType != null ? sizeConstraintType.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeFloat(this.f392775b);
        SizeConstraintType sizeConstraintType = this.f392774a;
        parcel.writeInt(sizeConstraintType == null ? -1 : sizeConstraintType.ordinal());
    }

    public SizeConstraint(Parcel parcel) {
        this.f392775b = parcel.readFloat();
        int i12 = parcel.readInt();
        this.f392774a = i12 == -1 ? null : SizeConstraintType.values()[i12];
    }
}
