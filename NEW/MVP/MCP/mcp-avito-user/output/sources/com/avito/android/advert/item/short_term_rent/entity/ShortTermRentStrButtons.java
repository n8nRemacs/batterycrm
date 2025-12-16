package com.avito.android.advert.item.short_term_rent.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AdvertShortTermRent;
import com.avito.android.remote.model.insights.Insight;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ShortTermRentStrButtons.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/entity/ShortTermRentStrButtons;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ShortTermRentStrButtons implements Parcelable {

    @k
    public static final Parcelable.Creator<ShortTermRentStrButtons> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AdvertShortTermRent.Actions f80031b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<Insight> f80032c;

    /* compiled from: ShortTermRentStrButtons.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ShortTermRentStrButtons> {
        @Override // android.os.Parcelable.Creator
        public final ShortTermRentStrButtons createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AdvertShortTermRent.Actions actions = (AdvertShortTermRent.Actions) parcel.readParcelable(ShortTermRentStrButtons.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(ShortTermRentStrButtons.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new ShortTermRentStrButtons(actions, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortTermRentStrButtons[] newArray(int i12) {
            return new ShortTermRentStrButtons[i12];
        }
    }

    public ShortTermRentStrButtons(@l AdvertShortTermRent.Actions actions, @l List<Insight> list) {
        this.f80031b = actions;
        this.f80032c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f80031b, i12);
        List<Insight> list = this.f80032c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }
}
