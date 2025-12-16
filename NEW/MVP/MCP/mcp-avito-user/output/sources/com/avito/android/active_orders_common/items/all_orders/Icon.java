package com.avito.android.active_orders_common.items.all_orders;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AllOrdersItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/active_orders_common/items/all_orders/Icon;", "Landroid/os/Parcelable;", "_avito_active-orders-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Icon implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<Icon> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f68299b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f68300c;

    /* compiled from: AllOrdersItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Icon> {
        @Override // android.os.Parcelable.Creator
        public final Icon createFromParcel(Parcel parcel) {
            return new Icon(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Icon[] newArray(int i12) {
            return new Icon[i12];
        }
    }

    public Icon(@InterfaceC42150f @l Integer num, @InterfaceC42150f @l Integer num2) {
        this.f68299b = num;
        this.f68300c = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Icon)) {
            return false;
        }
        Icon icon = (Icon) obj;
        return L.f(this.f68299b, icon.f68299b) && L.f(this.f68300c, icon.f68300c);
    }

    public final int hashCode() {
        Integer num = this.f68299b;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f68300c;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Icon(iconRes=");
        sb2.append(this.f68299b);
        sb2.append(", iconTint=");
        return s.j(sb2, this.f68300c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Integer num = this.f68299b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f68300c;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
    }
}
