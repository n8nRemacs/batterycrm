package com.avito.android.serp.adapter.vertical_main;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import j.InterfaceC42150f;
import kotlin.Metadata;

/* compiled from: VerticalFormStyle.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/VerticalFormStyle;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VerticalFormStyle implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<VerticalFormStyle> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f272518b;

    /* compiled from: VerticalFormStyle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerticalFormStyle> {
        @Override // android.os.Parcelable.Creator
        public final VerticalFormStyle createFromParcel(Parcel parcel) {
            return new VerticalFormStyle(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VerticalFormStyle[] newArray(int i12) {
            return new VerticalFormStyle[i12];
        }
    }

    public VerticalFormStyle(@InterfaceC42150f int i12) {
        this.f272518b = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f272518b);
    }
}
