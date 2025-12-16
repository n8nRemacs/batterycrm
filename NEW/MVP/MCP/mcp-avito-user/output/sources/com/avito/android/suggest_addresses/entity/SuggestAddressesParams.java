package com.avito.android.suggest_addresses.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.SuggestAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuggestAddressesParams.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_addresses/entity/SuggestAddressesParams;", "Landroid/os/Parcelable;", "_avito_suggest-addresses_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SuggestAddressesParams implements Parcelable {

    @k
    public static final Parcelable.Creator<SuggestAddressesParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f291889b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<SuggestAddress> f291890c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f291891d;

    /* compiled from: SuggestAddressesParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuggestAddressesParams> {
        @Override // android.os.Parcelable.Creator
        public final SuggestAddressesParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SuggestAddressesParams.class, parcel, arrayList, iL2, 1);
            }
            return new SuggestAddressesParams(string, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestAddressesParams[] newArray(int i12) {
            return new SuggestAddressesParams[i12];
        }
    }

    public SuggestAddressesParams(@l String str, @k List<SuggestAddress> list, boolean z12) {
        this.f291889b = str;
        this.f291890c = list;
        this.f291891d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestAddressesParams)) {
            return false;
        }
        SuggestAddressesParams suggestAddressesParams = (SuggestAddressesParams) obj;
        return L.f(this.f291889b, suggestAddressesParams.f291889b) && L.f(this.f291890c, suggestAddressesParams.f291890c) && this.f291891d == suggestAddressesParams.f291891d;
    }

    public final int hashCode() {
        String str = this.f291889b;
        return Boolean.hashCode(this.f291891d) + H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f291890c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestAddressesParams(locationId=");
        sb2.append(this.f291889b);
        sb2.append(", selectedValues=");
        sb2.append(this.f291890c);
        sb2.append(", hideInnerCloseButton=");
        return r.x(sb2, this.f291891d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f291889b);
        Iterator itJ = C0.j(this.f291890c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f291891d ? 1 : 0);
    }

    public /* synthetic */ SuggestAddressesParams(String str, List list, boolean z12, int i12, C42822w c42822w) {
        this(str, list, (i12 & 4) != 0 ? false : z12);
    }
}
