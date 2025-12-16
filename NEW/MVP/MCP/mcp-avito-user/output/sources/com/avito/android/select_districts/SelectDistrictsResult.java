package com.avito.android.select_districts;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ParcelableEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectDistrictsResult.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/SelectDistrictsResult;", "Landroid/os/Parcelable;", "_avito_select-districts_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectDistrictsResult implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SelectDistrictsResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f266908b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<ParcelableEntity<String>> f266909c;

    /* compiled from: SelectDistrictsResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectDistrictsResult> {
        @Override // android.os.Parcelable.Creator
        public final SelectDistrictsResult createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SelectDistrictsResult.class, parcel, arrayList, iL2, 1);
            }
            return new SelectDistrictsResult(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectDistrictsResult[] newArray(int i12) {
            return new SelectDistrictsResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectDistrictsResult(@Y61.k String str, @Y61.k List<? extends ParcelableEntity<String>> list) {
        this.f266908b = str;
        this.f266909c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectDistrictsResult)) {
            return false;
        }
        SelectDistrictsResult selectDistrictsResult = (SelectDistrictsResult) obj;
        return L.f(this.f266908b, selectDistrictsResult.f266908b) && L.f(this.f266909c, selectDistrictsResult.f266909c);
    }

    public final int hashCode() {
        return this.f266909c.hashCode() + (this.f266908b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectDistrictsResult(requestId=");
        sb2.append(this.f266908b);
        sb2.append(", selectedItems=");
        return H.p(sb2, this.f266909c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f266908b);
        Iterator itJ = C0.j(this.f266909c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
