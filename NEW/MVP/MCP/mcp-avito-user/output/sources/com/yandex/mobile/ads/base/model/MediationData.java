package com.yandex.mobile.ads.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.zf0;
import j.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class MediationData implements Parcelable {
    public static final Parcelable.Creator<MediationData> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    @N
    private final List<zf0> f382628a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final Map<String, String> f382629b;

    public class a implements Parcelable.Creator<MediationData> {
        @Override // android.os.Parcelable.Creator
        public final MediationData createFromParcel(Parcel parcel) {
            return new MediationData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediationData[] newArray(int i12) {
            return new MediationData[i12];
        }
    }

    public MediationData(@N ArrayList arrayList, @N HashMap map) {
        this.f382628a = arrayList;
        this.f382629b = map;
    }

    @N
    public final List<zf0> c() {
        return this.f382628a;
    }

    @N
    public final Map<String, String> d() {
        return this.f382629b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeList(this.f382628a);
        parcel.writeInt(this.f382629b.size());
        for (Map.Entry<String, String> entry : this.f382629b.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public MediationData(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f382628a = arrayList;
        parcel.readList(arrayList, zf0.class.getClassLoader());
        int i12 = parcel.readInt();
        this.f382629b = new HashMap(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            this.f382629b.put(parcel.readString(), parcel.readString());
        }
    }
}
