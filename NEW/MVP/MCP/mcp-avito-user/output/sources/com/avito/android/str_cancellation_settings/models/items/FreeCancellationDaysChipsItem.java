package com.avito.android.str_cancellation_settings.models.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FreeCancellationDaysChipsItem.kt */
@d
@H0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/models/items/FreeCancellationDaysChipsItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FreeCancellationDaysChipsItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<FreeCancellationDaysChipsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f288411b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f288412c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<DaysOptionChipable> f288413d;

    /* compiled from: FreeCancellationDaysChipsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FreeCancellationDaysChipsItem> {
        @Override // android.os.Parcelable.Creator
        public final FreeCancellationDaysChipsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(DaysOptionChipable.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new FreeCancellationDaysChipsItem(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FreeCancellationDaysChipsItem[] newArray(int i12) {
            return new FreeCancellationDaysChipsItem[i12];
        }
    }

    public FreeCancellationDaysChipsItem(@k String str, @k String str2, @k List<DaysOptionChipable> list) {
        this.f288411b = str;
        this.f288412c = str2;
        this.f288413d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeCancellationDaysChipsItem)) {
            return false;
        }
        FreeCancellationDaysChipsItem freeCancellationDaysChipsItem = (FreeCancellationDaysChipsItem) obj;
        return L.f(this.f288411b, freeCancellationDaysChipsItem.f288411b) && L.f(this.f288412c, freeCancellationDaysChipsItem.f288412c) && L.f(this.f288413d, freeCancellationDaysChipsItem.f288413d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74860b() {
        return getF155493b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF155493b() {
        return this.f288411b;
    }

    public final int hashCode() {
        return this.f288413d.hashCode() + H.d(this.f288411b.hashCode() * 31, 31, this.f288412c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FreeCancellationDaysChipsItem(stringId=");
        sb2.append(this.f288411b);
        sb2.append(", title=");
        sb2.append(this.f288412c);
        sb2.append(", chips=");
        return H.p(sb2, this.f288413d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f288411b);
        parcel.writeString(this.f288412c);
        Iterator itJ = C0.j(this.f288413d, parcel);
        while (itJ.hasNext()) {
            ((DaysOptionChipable) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
