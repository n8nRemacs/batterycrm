package com.avito.android.krop.util;

import Y61.k;
import Y61.l;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.G;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Transformation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/krop/util/Transformation;", "Landroid/os/Parcelable;", "CREATOR", "a", "krop_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes14.dex */
public final /* data */ class Transformation implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    public final float f174845b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PointF f174846c;

    /* renamed from: d, reason: collision with root package name */
    public final float f174847d;

    /* compiled from: Transformation.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/krop/util/Transformation$a;", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/krop/util/Transformation;", "<init>", "()V", "krop_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.avito.android.krop.util.Transformation$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<Transformation> {
        public Companion() {
        }

        @Override // android.os.Parcelable.Creator
        public final Transformation createFromParcel(Parcel parcel) {
            return new Transformation(parcel.readFloat(), (PointF) parcel.readParcelable(PointF.class.getClassLoader()), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Transformation[] newArray(int i12) {
            return new Transformation[i12];
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public Transformation(float f12, @k PointF pointF, float f13) {
        this.f174845b = f12;
        this.f174846c = pointF;
        this.f174847d = f13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transformation)) {
            return false;
        }
        Transformation transformation = (Transformation) obj;
        return Float.compare(this.f174845b, transformation.f174845b) == 0 && L.f(this.f174846c, transformation.f174846c) && Float.compare(this.f174847d, transformation.f174847d) == 0;
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.f174845b) * 31;
        PointF pointF = this.f174846c;
        return Float.floatToIntBits(this.f174847d) + ((iFloatToIntBits + (pointF != null ? pointF.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transformation(scale=");
        sb2.append(this.f174845b);
        sb2.append(", focusOffset=");
        sb2.append(this.f174846c);
        sb2.append(", rotationAngle=");
        return G.d(this.f174847d, ")", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeFloat(this.f174845b);
        parcel.writeParcelable(this.f174846c, i12);
        parcel.writeFloat(this.f174847d);
    }

    public /* synthetic */ Transformation(float f12, PointF pointF, float f13, int i12, C42822w c42822w) {
        this(f12, pointF, (i12 & 4) != 0 ? 0.0f : f13);
    }
}
