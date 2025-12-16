package com.avito.android.serp.warning;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WarningStateProviderState.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/warning/WarningStateProviderState;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WarningStateProviderState implements Parcelable {

    @k
    public static final Parcelable.Creator<WarningStateProviderState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, WarningStateStorageState> f273971b;

    /* compiled from: WarningStateProviderState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WarningStateProviderState> {
        @Override // android.os.Parcelable.Creator
        public final WarningStateProviderState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.bxcontent.mvi.entity.f.c(WarningStateProviderState.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new WarningStateProviderState(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final WarningStateProviderState[] newArray(int i12) {
            return new WarningStateProviderState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WarningStateProviderState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f273971b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i12);
        }
    }

    public WarningStateProviderState(@k Map<String, WarningStateStorageState> map) {
        this.f273971b = map;
    }

    public /* synthetic */ WarningStateProviderState(Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new HashMap() : map);
    }
}
