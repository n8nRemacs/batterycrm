package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class HorizontalOffset implements Parcelable {
    public static final Parcelable.Creator<HorizontalOffset> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final float f392735a;

    /* renamed from: b, reason: collision with root package name */
    private final float f392736b;

    public class a implements Parcelable.Creator<HorizontalOffset> {
        @Override // android.os.Parcelable.Creator
        public final HorizontalOffset createFromParcel(Parcel parcel) {
            return new HorizontalOffset(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final HorizontalOffset[] newArray(int i12) {
            return new HorizontalOffset[i12];
        }
    }

    public HorizontalOffset(float f12, float f13) {
        this.f392735a = f12;
        this.f392736b = f13;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HorizontalOffset.class != obj.getClass()) {
            return false;
        }
        HorizontalOffset horizontalOffset = (HorizontalOffset) obj;
        return Float.compare(horizontalOffset.f392735a, this.f392735a) == 0 && Float.compare(horizontalOffset.f392736b, this.f392736b) == 0;
    }

    public float getLeft() {
        return this.f392735a;
    }

    public float getRight() {
        return this.f392736b;
    }

    public int hashCode() {
        float f12 = this.f392735a;
        int iFloatToIntBits = (f12 != 0.0f ? Float.floatToIntBits(f12) : 0) * 31;
        float f13 = this.f392736b;
        return iFloatToIntBits + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0);
    }

    public String toString() {
        return this.f392735a + ", " + this.f392736b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeFloat(this.f392735a);
        parcel.writeFloat(this.f392736b);
    }

    public HorizontalOffset(Parcel parcel) {
        this.f392735a = parcel.readFloat();
        this.f392736b = parcel.readFloat();
    }
}
