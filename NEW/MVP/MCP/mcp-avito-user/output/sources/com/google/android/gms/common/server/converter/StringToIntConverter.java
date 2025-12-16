package com.google.android.gms.common.server.converter;

import RX0.a;
import XX0.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
@a
/* loaded from: classes6.dex */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.a<String, Integer> {

    @N
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349548b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f349549c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f349550d;

    @a
    public StringToIntConverter() {
        this.f349548b = 1;
        this.f349549c = new HashMap();
        this.f349550d = new SparseArray();
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.a
    @N
    public final /* bridge */ /* synthetic */ String a(@N Object obj) {
        String str = (String) this.f349550d.get(((Integer) obj).intValue());
        return (str == null && this.f349549c.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.a
    @P
    public final /* bridge */ /* synthetic */ Integer b(@N Object obj) {
        HashMap map = this.f349549c;
        Integer num = (Integer) map.get((String) obj);
        return num == null ? (Integer) map.get("gms_unknown") : num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@N Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349548b);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f349549c;
        for (String str : map.keySet()) {
            arrayList.add(new zac(str, ((Integer) map.get(str)).intValue()));
        }
        TX0.a.n(parcel, 2, arrayList, false);
        TX0.a.p(parcel, iO2);
    }

    @SafeParcelable.b
    public StringToIntConverter(@SafeParcelable.e int i12, @SafeParcelable.e ArrayList arrayList) {
        this.f349548b = i12;
        this.f349549c = new HashMap();
        this.f349550d = new SparseArray();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            zac zacVar = (zac) arrayList.get(i13);
            String str = zacVar.f349554c;
            int i14 = zacVar.f349555d;
            this.f349549c.put(str, Integer.valueOf(i14));
            this.f349550d.put(i14, str);
        }
    }
}
