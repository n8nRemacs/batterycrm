package com.avito.android.serp.warning;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: TemporalWarningStateStorageState.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/warning/TemporalWarningStateStorageState;", "Lcom/avito/android/serp/warning/WarningStateStorageState;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TemporalWarningStateStorageState extends WarningStateStorageState {

    @k
    public static final Parcelable.Creator<TemporalWarningStateStorageState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final HashMap f273964b;

    /* compiled from: TemporalWarningStateStorageState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TemporalWarningStateStorageState> {
        @Override // android.os.Parcelable.Creator
        public final TemporalWarningStateStorageState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(parcel.readString(), WarningState.valueOf(parcel.readString()));
            }
            return new TemporalWarningStateStorageState(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final TemporalWarningStateStorageState[] newArray(int i12) {
            return new TemporalWarningStateStorageState[i12];
        }
    }

    public TemporalWarningStateStorageState(@k HashMap map) {
        this.f273964b = map;
    }

    @Override // com.avito.android.serp.warning.WarningStateStorageState, android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        HashMap map = this.f273964b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString(((WarningState) entry.getValue()).name());
        }
    }
}
