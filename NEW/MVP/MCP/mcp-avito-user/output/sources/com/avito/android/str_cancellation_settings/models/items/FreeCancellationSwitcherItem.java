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

/* compiled from: FreeCancellationSwitcherItem.kt */
@d
@H0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/models/items/FreeCancellationSwitcherItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FreeCancellationSwitcherItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<FreeCancellationSwitcherItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f288414b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f288415c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f288416d;

    /* compiled from: FreeCancellationSwitcherItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FreeCancellationSwitcherItem> {
        @Override // android.os.Parcelable.Creator
        public final FreeCancellationSwitcherItem createFromParcel(Parcel parcel) {
            return new FreeCancellationSwitcherItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FreeCancellationSwitcherItem[] newArray(int i12) {
            return new FreeCancellationSwitcherItem[i12];
        }
    }

    public FreeCancellationSwitcherItem(@k String str, @k String str2, boolean z12) {
        this.f288414b = str;
        this.f288415c = str2;
        this.f288416d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeCancellationSwitcherItem)) {
            return false;
        }
        FreeCancellationSwitcherItem freeCancellationSwitcherItem = (FreeCancellationSwitcherItem) obj;
        return L.f(this.f288414b, freeCancellationSwitcherItem.f288414b) && L.f(this.f288415c, freeCancellationSwitcherItem.f288415c) && this.f288416d == freeCancellationSwitcherItem.f288416d;
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
        return this.f288414b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f288416d) + H.d(this.f288414b.hashCode() * 31, 31, this.f288415c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FreeCancellationSwitcherItem(stringId=");
        sb2.append(this.f288414b);
        sb2.append(", title=");
        sb2.append(this.f288415c);
        sb2.append(", isFreeCancellationEnabled=");
        return r.x(sb2, this.f288416d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f288414b);
        parcel.writeString(this.f288415c);
        parcel.writeInt(this.f288416d ? 1 : 0);
    }
}
