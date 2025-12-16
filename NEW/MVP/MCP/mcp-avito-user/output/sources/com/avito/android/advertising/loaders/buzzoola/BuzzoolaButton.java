package com.avito.android.advertising.loaders.buzzoola;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BuzzoolaBanner.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaButton;", "Landroid/os/Parcelable;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BuzzoolaButton implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BuzzoolaButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f88279b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f88280c;

    /* compiled from: BuzzoolaBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BuzzoolaButton> {
        @Override // android.os.Parcelable.Creator
        public final BuzzoolaButton createFromParcel(Parcel parcel) {
            return new BuzzoolaButton(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BuzzoolaButton[] newArray(int i12) {
            return new BuzzoolaButton[i12];
        }
    }

    public BuzzoolaButton(@Y61.k String str, boolean z12) {
        this.f88279b = str;
        this.f88280c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuzzoolaButton)) {
            return false;
        }
        BuzzoolaButton buzzoolaButton = (BuzzoolaButton) obj;
        return L.f(this.f88279b, buzzoolaButton.f88279b) && this.f88280c == buzzoolaButton.f88280c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88280c) + (this.f88279b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuzzoolaButton(buttonText=");
        sb2.append(this.f88279b);
        sb2.append(", isAppInstall=");
        return r.x(sb2, this.f88280c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f88279b);
        parcel.writeInt(this.f88280c ? 1 : 0);
    }
}
