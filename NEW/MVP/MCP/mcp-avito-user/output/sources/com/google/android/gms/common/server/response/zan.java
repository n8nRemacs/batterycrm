package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.InterfaceC36733z;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@SafeParcelable.a
@InterfaceC36733z
/* loaded from: classes6.dex */
public final class zan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zan> CREATOR = new l();

    /* renamed from: b, reason: collision with root package name */
    @SafeParcelable.h
    public final int f349580b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f349581c;

    /* renamed from: d, reason: collision with root package name */
    @SafeParcelable.c
    public final String f349582d;

    @SafeParcelable.b
    public zan(@SafeParcelable.e int i12, @SafeParcelable.e String str, @SafeParcelable.e ArrayList arrayList) {
        this.f349580b = i12;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            zal zalVar = (zal) arrayList.get(i13);
            String str2 = zalVar.f349575c;
            HashMap map2 = new HashMap();
            ArrayList arrayList2 = zalVar.f349576d;
            C36729v.j(arrayList2);
            int size2 = arrayList2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                zam zamVar = (zam) arrayList2.get(i14);
                map2.put(zamVar.f349578c, zamVar.f349579d);
            }
            map.put(str2, map2);
        }
        this.f349581c = map;
        C36729v.j(str);
        this.f349582d = str;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Map map3 = (Map) map.get((String) it.next());
            Iterator it2 = map3.keySet().iterator();
            while (it2.hasNext()) {
                ((FastJsonResponse.Field) map3.get((String) it2.next())).f349565k = this;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        HashMap map = this.f349581c;
        for (String str : map.keySet()) {
            sb2.append(str);
            sb2.append(":\n");
            Map map2 = (Map) map.get(str);
            for (String str2 : map2.keySet()) {
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(map2.get(str2));
            }
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        int iO2 = TX0.a.o(parcel, 20293);
        TX0.a.q(parcel, 1, 4);
        parcel.writeInt(this.f349580b);
        ArrayList arrayList = new ArrayList();
        HashMap map = this.f349581c;
        for (String str : map.keySet()) {
            arrayList.add(new zal(str, (Map) map.get(str)));
        }
        TX0.a.n(parcel, 2, arrayList, false);
        TX0.a.j(parcel, 3, this.f349582d, false);
        TX0.a.p(parcel, iO2);
    }
}
