package com.avito.android.krop.util;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SizeF.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/krop/util/SizeF;", "Landroid/os/Parcelable;", "CREATOR", "a", "krop_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes14.dex */
public final class SizeF implements Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    public float f174843b;

    /* renamed from: c, reason: collision with root package name */
    public float f174844c;

    /* compiled from: SizeF.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/krop/util/SizeF$a;", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/krop/util/SizeF;", "<init>", "()V", "krop_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.avito.android.krop.util.SizeF$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<SizeF> {
        public Companion() {
        }

        @Override // android.os.Parcelable.Creator
        public final SizeF createFromParcel(Parcel parcel) {
            return new SizeF(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final SizeF[] newArray(int i12) {
            return new SizeF[i12];
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SizeF() {
        float f12 = 0.0f;
        this(f12, f12, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SizeF(width=");
        sb2.append((int) this.f174843b);
        sb2.append(", height=");
        return r.t(sb2, (int) this.f174844c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeFloat(this.f174843b);
        parcel.writeFloat(this.f174844c);
    }

    public SizeF(float f12, float f13) {
        this.f174843b = f12;
        this.f174844c = f13;
    }

    public /* synthetic */ SizeF(float f12, float f13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0.0f : f12, (i12 & 2) != 0 ? 0.0f : f13);
    }
}
