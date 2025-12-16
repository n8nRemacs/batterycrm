package com.google.android.gms.measurement.internal;

import androidx.collection.C20199a;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzod;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
final class V5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f354952a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f354953b;

    /* renamed from: c, reason: collision with root package name */
    public final zzfi.zzl f354954c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f354955d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f354956e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<Integer, Long> f354957f;

    /* renamed from: g, reason: collision with root package name */
    public final C20199a f354958g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ T5 f354959h;

    public V5() {
        throw null;
    }

    public V5(T5 t52, String str, U5 u52) {
        this.f354959h = t52;
        this.f354952a = str;
        this.f354953b = true;
        this.f354955d = new BitSet();
        this.f354956e = new BitSet();
        this.f354957f = new C20199a();
        this.f354958g = new C20199a();
    }

    @j.N
    public final zzfi.zzc a(int i12) {
        ArrayList arrayList;
        List listEmptyList;
        zzfi.zzc.zza zzaVarZzb = zzfi.zzc.zzb();
        zzaVarZzb.zza(i12);
        zzaVarZzb.zza(this.f354953b);
        zzfi.zzl zzlVar = this.f354954c;
        if (zzlVar != null) {
            zzaVarZzb.zza(zzlVar);
        }
        zzfi.zzl.zza zzaVarZzd = zzfi.zzl.zze().zzb(G5.y(this.f354955d)).zzd(G5.y(this.f354956e));
        Map<Integer, Long> map = this.f354957f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : map.keySet()) {
                int iIntValue = num.intValue();
                Long l12 = map.get(num);
                if (l12 != null) {
                    arrayList2.add((zzfi.zzd) ((zzjf) zzfi.zzd.zzc().zza(iIntValue).zza(l12.longValue()).zzah()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzaVarZzd.zza(arrayList);
        }
        C20199a c20199a = this.f354958g;
        if (c20199a == null) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(c20199a.f25790d);
            for (Integer num2 : c20199a.keySet()) {
                zzfi.zzm.zza zzaVarZza = zzfi.zzm.zzc().zza(num2.intValue());
                List list = (List) c20199a.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    zzaVarZza.zza(list);
                }
                arrayList3.add((zzfi.zzm) ((zzjf) zzaVarZza.zzah()));
            }
            listEmptyList = arrayList3;
        }
        zzaVarZzd.zzc(listEmptyList);
        zzaVarZzb.zza(zzaVarZzd);
        return (zzfi.zzc) ((zzjf) zzaVarZzb.zzah());
    }

    public final void b(@j.N Y5 y52) {
        int iA2 = y52.a();
        Boolean bool = y52.f354999c;
        if (bool != null) {
            this.f354956e.set(iA2, bool.booleanValue());
        }
        Boolean bool2 = y52.f355000d;
        if (bool2 != null) {
            this.f354955d.set(iA2, bool2.booleanValue());
        }
        if (y52.f355001e != null) {
            Integer numValueOf = Integer.valueOf(iA2);
            Map<Integer, Long> map = this.f354957f;
            Long l12 = map.get(numValueOf);
            long jLongValue = y52.f355001e.longValue() / 1000;
            if (l12 == null || jLongValue > l12.longValue()) {
                map.put(Integer.valueOf(iA2), Long.valueOf(jLongValue));
            }
        }
        if (y52.f355002f != null) {
            C20199a c20199a = this.f354958g;
            List arrayList = (List) c20199a.get(Integer.valueOf(iA2));
            if (arrayList == null) {
                arrayList = new ArrayList();
                c20199a.put(Integer.valueOf(iA2), arrayList);
            }
            if (y52.g()) {
                arrayList.clear();
            }
            boolean zZza = zzod.zza();
            String str = this.f354952a;
            T5 t52 = this.f354959h;
            if (zZza && t52.f355183a.f354715g.o(str, E.f354622h0) && y52.f()) {
                arrayList.clear();
            }
            if (!zzod.zza() || !t52.f355183a.f354715g.o(str, E.f354622h0)) {
                arrayList.add(Long.valueOf(y52.f355002f.longValue() / 1000));
                return;
            }
            long jLongValue2 = y52.f355002f.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    public V5(T5 t52, String str, zzfi.zzl zzlVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, U5 u52) {
        this.f354959h = t52;
        this.f354952a = str;
        this.f354955d = bitSet;
        this.f354956e = bitSet2;
        this.f354957f = map;
        this.f354958g = new C20199a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Long) map2.get(num));
                this.f354958g.put(num, arrayList);
            }
        }
        this.f354953b = false;
        this.f354954c = zzlVar;
    }
}
