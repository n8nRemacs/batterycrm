package com.avito.android.select.new_metro.item;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert.item.delivery_suggests.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SelectedStationInfo.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/item/SelectedStationInfo;", "Landroid/os/Parcelable;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes3.dex */
public final /* data */ class SelectedStationInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectedStationInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266208b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CharSequence f266209c;

    /* renamed from: d, reason: collision with root package name */
    public final int f266210d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f266211e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<Integer> f266212f;

    /* compiled from: SelectedStationInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectedStationInfo> {
        @Override // android.os.Parcelable.Creator
        public final SelectedStationInfo createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iD2 = 0;
            while (iD2 != i13) {
                iD2 = l.d(parcel, arrayList, iD2, 1);
            }
            return new SelectedStationInfo(string, charSequence, i12, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectedStationInfo[] newArray(int i12) {
            return new SelectedStationInfo[i12];
        }
    }

    public SelectedStationInfo(@k String str, @k CharSequence charSequence, int i12, @k String str2, @k List<Integer> list) {
        this.f266208b = str;
        this.f266209c = charSequence;
        this.f266210d = i12;
        this.f266211e = str2;
        this.f266212f = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedStationInfo)) {
            return false;
        }
        SelectedStationInfo selectedStationInfo = (SelectedStationInfo) obj;
        return L.f(this.f266208b, selectedStationInfo.f266208b) && L.f(this.f266209c, selectedStationInfo.f266209c) && this.f266210d == selectedStationInfo.f266210d && L.f(this.f266211e, selectedStationInfo.f266211e) && L.f(this.f266212f, selectedStationInfo.f266212f);
    }

    public final int hashCode() {
        return this.f266212f.hashCode() + H.d(r.e(this.f266210d, l.c(this.f266208b.hashCode() * 31, 31, this.f266209c), 31), 31, this.f266211e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedStationInfo(id=");
        sb2.append(this.f266208b);
        sb2.append(", name=");
        sb2.append((Object) this.f266209c);
        sb2.append(", stationId=");
        sb2.append(this.f266210d);
        sb2.append(", stationName=");
        sb2.append(this.f266211e);
        sb2.append(", linesColors=");
        return H.p(sb2, this.f266212f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f266208b);
        TextUtils.writeToParcel(this.f266209c, parcel, i12);
        parcel.writeInt(this.f266210d);
        parcel.writeString(this.f266211e);
        Iterator itJ = C0.j(this.f266212f, parcel);
        while (itJ.hasNext()) {
            parcel.writeInt(((Number) itJ.next()).intValue());
        }
    }

    public SelectedStationInfo(String str, CharSequence charSequence, int i12, String str2, List list, int i13, C42822w c42822w) {
        this(str, charSequence, i12, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? C42784z0.f406748b : list);
    }
}
