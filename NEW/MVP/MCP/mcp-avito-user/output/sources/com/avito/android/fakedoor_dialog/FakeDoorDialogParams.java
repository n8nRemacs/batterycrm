package com.avito.android.fakedoor_dialog;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.FakeDoorDialogLink;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FakeDoorDialogFragment.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/fakedoor_dialog/FakeDoorDialogParams;", "Lcom/avito/android/util/OpenParams;", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FakeDoorDialogParams implements OpenParams {

    @k
    public static final Parcelable.Creator<FakeDoorDialogParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f155100b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f155101c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<FakeDoorDialogLink.Stage> f155102d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Map<String, String> f155103e;

    /* compiled from: FakeDoorDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FakeDoorDialogParams> {
        @Override // android.os.Parcelable.Creator
        public final FakeDoorDialogParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iA2 = 0;
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(FakeDoorDialogParams.class, parcel, arrayList, iL2, 1);
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                while (iA2 != i13) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new FakeDoorDialogParams(string, string2, arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final FakeDoorDialogParams[] newArray(int i12) {
            return new FakeDoorDialogParams[i12];
        }
    }

    public FakeDoorDialogParams(@k String str, @k String str2, @k List<FakeDoorDialogLink.Stage> list, @l Map<String, String> map) {
        this.f155100b = str;
        this.f155101c = str2;
        this.f155102d = list;
        this.f155103e = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FakeDoorDialogParams)) {
            return false;
        }
        FakeDoorDialogParams fakeDoorDialogParams = (FakeDoorDialogParams) obj;
        return L.f(this.f155100b, fakeDoorDialogParams.f155100b) && L.f(this.f155101c, fakeDoorDialogParams.f155101c) && L.f(this.f155102d, fakeDoorDialogParams.f155102d) && L.f(this.f155103e, fakeDoorDialogParams.f155103e);
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(this.f155100b.hashCode() * 31, 31, this.f155101c), 31, this.f155102d);
        Map<String, String> map = this.f155103e;
        return iE2 + (map == null ? 0 : map.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FakeDoorDialogParams(type=");
        sb2.append(this.f155100b);
        sb2.append(", title=");
        sb2.append(this.f155101c);
        sb2.append(", stages=");
        sb2.append(this.f155102d);
        sb2.append(", analyticsParams=");
        return r.w(sb2, this.f155103e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f155100b);
        parcel.writeString(this.f155101c);
        Iterator itJ = C0.j(this.f155102d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        Map<String, String> map = this.f155103e;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
