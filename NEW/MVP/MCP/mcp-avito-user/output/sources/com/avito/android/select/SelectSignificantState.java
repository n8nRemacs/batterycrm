package com.avito.android.select;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ParcelableEntity;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectSignificantState.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/SelectSignificantState;", "Landroid/os/Parcelable;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectSignificantState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SelectSignificantState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f264980b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Set<ParcelableEntity<String>> f264981c;

    /* compiled from: SelectSignificantState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectSignificantState> {
        @Override // android.os.Parcelable.Creator
        public final SelectSignificantState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashSet.add(parcel.readParcelable(SelectSignificantState.class.getClassLoader()));
            }
            return new SelectSignificantState(string, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectSignificantState[] newArray(int i12) {
            return new SelectSignificantState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectSignificantState(@Y61.k String str, @Y61.k Set<? extends ParcelableEntity<String>> set) {
        this.f264980b = str;
        this.f264981c = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectSignificantState)) {
            return false;
        }
        SelectSignificantState selectSignificantState = (SelectSignificantState) obj;
        return L.f(this.f264980b, selectSignificantState.f264980b) && L.f(this.f264981c, selectSignificantState.f264981c);
    }

    public final int hashCode() {
        return this.f264981c.hashCode() + (this.f264980b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectSignificantState(query=");
        sb2.append(this.f264980b);
        sb2.append(", selected=");
        return AK.c.u(sb2, this.f264981c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f264980b);
        Set<ParcelableEntity<String>> set = this.f264981c;
        parcel.writeInt(set.size());
        Iterator<ParcelableEntity<String>> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i12);
        }
    }
}
