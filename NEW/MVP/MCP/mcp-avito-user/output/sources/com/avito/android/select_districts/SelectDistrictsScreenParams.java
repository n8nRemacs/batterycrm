package com.avito.android.select_districts;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectDistrictsScreenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/SelectDistrictsScreenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectDistrictsScreenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<SelectDistrictsScreenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f266910b;

    /* renamed from: c, reason: collision with root package name */
    public final int f266911c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<ParcelableEntity<String>> f266912d;

    /* compiled from: SelectDistrictsScreenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectDistrictsScreenParams> {
        @Override // android.os.Parcelable.Creator
        public final SelectDistrictsScreenParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(SelectDistrictsScreenParams.class, parcel, arrayList, iL2, 1);
            }
            return new SelectDistrictsScreenParams(string, i12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectDistrictsScreenParams[] newArray(int i12) {
            return new SelectDistrictsScreenParams[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectDistrictsScreenParams(@Y61.k String str, int i12, @Y61.k List<? extends ParcelableEntity<String>> list) {
        this.f266910b = str;
        this.f266911c = i12;
        this.f266912d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectDistrictsScreenParams)) {
            return false;
        }
        SelectDistrictsScreenParams selectDistrictsScreenParams = (SelectDistrictsScreenParams) obj;
        return L.f(this.f266910b, selectDistrictsScreenParams.f266910b) && this.f266911c == selectDistrictsScreenParams.f266911c && L.f(this.f266912d, selectDistrictsScreenParams.f266912d);
    }

    public final int hashCode() {
        return this.f266912d.hashCode() + androidx.appcompat.app.r.e(this.f266911c, this.f266910b.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectDistrictsScreenParams(paramId=");
        sb2.append(this.f266910b);
        sb2.append(", locationId=");
        sb2.append(this.f266911c);
        sb2.append(", selectedValues=");
        return H.p(sb2, this.f266912d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f266910b);
        parcel.writeInt(this.f266911c);
        Iterator itJ = C0.j(this.f266912d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }
}
