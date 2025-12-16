package com.avito.android.loyalty.ui.criteria_gray;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CriteriaGrayArgs.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/CriteriaGrayArgs;", "Landroid/os/Parcelable;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CriteriaGrayArgs implements Parcelable {

    @k
    public static final Parcelable.Creator<CriteriaGrayArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f183580b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f183581c;

    /* compiled from: CriteriaGrayArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CriteriaGrayArgs> {
        @Override // android.os.Parcelable.Creator
        public final CriteriaGrayArgs createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new CriteriaGrayArgs(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final CriteriaGrayArgs[] newArray(int i12) {
            return new CriteriaGrayArgs[i12];
        }
    }

    public CriteriaGrayArgs(@k Map<String, String> map) {
        this.f183580b = map;
        String str = map.get(SearchParamsConverterKt.SOURCE);
        this.f183581c = str == null ? "" : str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CriteriaGrayArgs) && L.f(this.f183580b, ((CriteriaGrayArgs) obj).f183580b);
    }

    public final int hashCode() {
        return this.f183580b.hashCode();
    }

    @k
    public final String toString() {
        return H.n(new StringBuilder("CriteriaGrayArgs(queryMap="), this.f183580b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itO = com.avito.android.bxcontent.mvi.entity.f.o(this.f183580b, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
