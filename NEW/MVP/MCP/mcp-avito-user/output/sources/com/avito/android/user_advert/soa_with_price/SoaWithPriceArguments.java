package com.avito.android.user_advert.soa_with_price;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.my_advert.CloseReason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SoaWithPriceSheetDialogFragment.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/soa_with_price/SoaWithPriceArguments;", "Landroid/os/Parcelable;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SoaWithPriceArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SoaWithPriceArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<CloseReason> f311843b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f311844c;

    /* compiled from: SoaWithPriceSheetDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SoaWithPriceArguments> {
        @Override // android.os.Parcelable.Creator
        public final SoaWithPriceArguments createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SoaWithPriceArguments.class, parcel, arrayList, iL2, 1);
            }
            return new SoaWithPriceArguments(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SoaWithPriceArguments[] newArray(int i12) {
            return new SoaWithPriceArguments[i12];
        }
    }

    public SoaWithPriceArguments(@Y61.k List<CloseReason> list, @Y61.k String str) {
        this.f311843b = list;
        this.f311844c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f311843b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f311844c);
    }
}
