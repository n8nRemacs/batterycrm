package com.avito.android.iac_dialer_models.abstract_module;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: IacSupportData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacSupportData;", "Landroid/os/Parcelable;", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacSupportData implements Parcelable {

    @k
    public static final Parcelable.Creator<IacSupportData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, String> f166873b;

    /* compiled from: IacSupportData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacSupportData> {
        @Override // android.os.Parcelable.Creator
        public final IacSupportData createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new IacSupportData(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final IacSupportData[] newArray(int i12) {
            return new IacSupportData[i12];
        }
    }

    public IacSupportData(@k Map<String, String> map) {
        this.f166873b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f166873b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
