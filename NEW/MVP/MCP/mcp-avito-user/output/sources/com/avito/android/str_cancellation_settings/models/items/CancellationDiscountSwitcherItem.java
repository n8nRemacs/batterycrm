package com.avito.android.str_cancellation_settings.models.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CancellationDiscountSwitcherItem.kt */
@d
@H0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/models/items/CancellationDiscountSwitcherItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CancellationDiscountSwitcherItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<CancellationDiscountSwitcherItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f288399b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f288400c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f288401d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f288402e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f288403f;

    /* compiled from: CancellationDiscountSwitcherItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CancellationDiscountSwitcherItem> {
        @Override // android.os.Parcelable.Creator
        public final CancellationDiscountSwitcherItem createFromParcel(Parcel parcel) {
            return new CancellationDiscountSwitcherItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CancellationDiscountSwitcherItem[] newArray(int i12) {
            return new CancellationDiscountSwitcherItem[i12];
        }
    }

    public CancellationDiscountSwitcherItem(@k String str, @k String str2, boolean z12, @k String str3, boolean z13) {
        this.f288399b = str;
        this.f288400c = str2;
        this.f288401d = str3;
        this.f288402e = z12;
        this.f288403f = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancellationDiscountSwitcherItem)) {
            return false;
        }
        CancellationDiscountSwitcherItem cancellationDiscountSwitcherItem = (CancellationDiscountSwitcherItem) obj;
        return L.f(this.f288399b, cancellationDiscountSwitcherItem.f288399b) && L.f(this.f288400c, cancellationDiscountSwitcherItem.f288400c) && L.f(this.f288401d, cancellationDiscountSwitcherItem.f288401d) && this.f288402e == cancellationDiscountSwitcherItem.f288402e && this.f288403f == cancellationDiscountSwitcherItem.f288403f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF288414b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288414b() {
        return this.f288399b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f288403f) + r.i(H.d(H.d(this.f288399b.hashCode() * 31, 31, this.f288400c), 31, this.f288401d), 31, this.f288402e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CancellationDiscountSwitcherItem(stringId=");
        sb2.append(this.f288399b);
        sb2.append(", title=");
        sb2.append(this.f288400c);
        sb2.append(", subtitle=");
        sb2.append(this.f288401d);
        sb2.append(", isChecked=");
        sb2.append(this.f288402e);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f288403f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f288399b);
        parcel.writeString(this.f288400c);
        parcel.writeString(this.f288401d);
        parcel.writeInt(this.f288402e ? 1 : 0);
        parcel.writeInt(this.f288403f ? 1 : 0);
    }
}
