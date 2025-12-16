package com.avito.android.constructor_advert.ui.serp.constructor;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConstructorAdvertState.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertState;", "Landroid/os/Parcelable;", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConstructorAdvertState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ConstructorAdvertState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, Integer> f125779b;

    /* compiled from: ConstructorAdvertState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConstructorAdvertState> {
        @Override // android.os.Parcelable.Creator
        public final ConstructorAdvertState createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
            }
            return new ConstructorAdvertState(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ConstructorAdvertState[] newArray(int i12) {
            return new ConstructorAdvertState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConstructorAdvertState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itI = C0.i(parcel, this.f125779b);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeInt(((Number) entry.getValue()).intValue());
        }
    }

    public ConstructorAdvertState(@Y61.k Map<String, Integer> map) {
        this.f125779b = map;
    }

    public /* synthetic */ ConstructorAdvertState(Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
