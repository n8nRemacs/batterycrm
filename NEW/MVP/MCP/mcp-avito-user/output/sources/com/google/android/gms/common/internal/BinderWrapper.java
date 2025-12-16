package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
@KeepName
/* loaded from: classes6.dex */
public final class BinderWrapper implements Parcelable {

    @j.N
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new z0();

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f349303b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@j.N Parcel parcel, int i12) {
        parcel.writeStrongBinder(this.f349303b);
    }
}
