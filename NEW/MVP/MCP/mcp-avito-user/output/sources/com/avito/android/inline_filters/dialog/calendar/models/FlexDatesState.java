package com.avito.android.inline_filters.dialog.calendar.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.lib.design.chips.state.ItemChipable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FlexDatesState.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/models/FlexDatesState;", "Landroid/os/Parcelable;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FlexDatesState implements Parcelable {

    @k
    public static final Parcelable.Creator<FlexDatesState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<ItemChipable> f171271b;

    /* renamed from: c, reason: collision with root package name */
    public final int f171272c;

    /* renamed from: d, reason: collision with root package name */
    public final int f171273d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f171274e;

    /* compiled from: FlexDatesState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FlexDatesState> {
        @Override // android.os.Parcelable.Creator
        public final FlexDatesState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(FlexDatesState.class, parcel, arrayList, iL2, 1);
            }
            return new FlexDatesState(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FlexDatesState[] newArray(int i12) {
            return new FlexDatesState[i12];
        }
    }

    public FlexDatesState(int i12, int i13, @l Integer num, @k List list) {
        this.f171271b = list;
        this.f171272c = i12;
        this.f171273d = i13;
        this.f171274e = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlexDatesState)) {
            return false;
        }
        FlexDatesState flexDatesState = (FlexDatesState) obj;
        return L.f(this.f171271b, flexDatesState.f171271b) && this.f171272c == flexDatesState.f171272c && this.f171273d == flexDatesState.f171273d && L.f(this.f171274e, flexDatesState.f171274e);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f171273d, r.e(this.f171272c, this.f171271b.hashCode() * 31, 31), 31);
        Integer num = this.f171274e;
        return iE2 + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlexDatesState(items=");
        sb2.append(this.f171271b);
        sb2.append(", defaultId=");
        sb2.append(this.f171272c);
        sb2.append(", selectedId=");
        sb2.append(this.f171273d);
        sb2.append(", scrollToItemIdx=");
        return s.j(sb2, this.f171274e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f171271b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f171272c);
        parcel.writeInt(this.f171273d);
        Integer num = this.f171274e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
