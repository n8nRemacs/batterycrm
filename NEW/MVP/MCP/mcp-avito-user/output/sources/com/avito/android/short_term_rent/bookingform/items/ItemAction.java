package com.avito.android.short_term_rent.bookingform.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemAction.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/ItemAction;", "Landroid/os/Parcelable;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ItemAction implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemAction> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f281446b;

    /* compiled from: ItemAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemAction> {
        @Override // android.os.Parcelable.Creator
        public final ItemAction createFromParcel(Parcel parcel) {
            return new ItemAction((DeepLink) parcel.readParcelable(ItemAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ItemAction[] newArray(int i12) {
            return new ItemAction[i12];
        }
    }

    public ItemAction(@k DeepLink deepLink) {
        this.f281446b = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (ItemAction.class.equals(obj != null ? obj.getClass() : null)) {
            return L.f(this.f281446b.getUri(), ((ItemAction) obj).f281446b.getUri());
        }
        return false;
    }

    public final int hashCode() {
        return this.f281446b.getUri().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f281446b, i12);
    }
}
