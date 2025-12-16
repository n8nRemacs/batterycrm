package com.avito.android.serp.adapter.vertical_main.interactive_title_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: InteractiveTitleWidgetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/interactive_title_widget/VerticalInsets;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VerticalInsets implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<VerticalInsets> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f272950b;

    /* renamed from: c, reason: collision with root package name */
    public final int f272951c;

    /* compiled from: InteractiveTitleWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerticalInsets> {
        @Override // android.os.Parcelable.Creator
        public final VerticalInsets createFromParcel(Parcel parcel) {
            return new VerticalInsets(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final VerticalInsets[] newArray(int i12) {
            return new VerticalInsets[i12];
        }
    }

    public VerticalInsets(int i12, int i13) {
        this.f272950b = i12;
        this.f272951c = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f272950b);
        parcel.writeInt(this.f272951c);
    }
}
