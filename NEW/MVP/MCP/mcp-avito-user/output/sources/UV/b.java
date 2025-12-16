package Uv;

import Ov.C14739b;
import Ov.f;
import Ov.g;
import Ov.m;
import Ov.n;
import Ov.q;
import Sv.h;
import Y61.k;
import Y61.l;
import android.content.Context;
import com.avito.android.delivery_tarifikator.domain.D;
import com.avito.android.delivery_tarifikator.domain.U;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SettingItemMapper.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LUv/b;", "LUv/a;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h
/* loaded from: classes12.dex */
public final class b implements InterfaceC15572a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f16769a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final D f16770b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final U f16771c;

    /* compiled from: SettingItemMapper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LUv/b$a;", "", "<init>", "()V", "", "MASTER_SETTING_ID", "Ljava/lang/String;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k Context context, @k D d12, @k U u12) {
        this.f16769a = context;
        this.f16770b = d12;
        this.f16771c = u12;
    }

    public static com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c e(Long l12, boolean z12, String str) {
        if (l12 == null && z12) {
            return new com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c("", str, true);
        }
        if (l12 != null) {
            return new com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c(String.valueOf(l12.longValue()), str, z12);
        }
        return null;
    }

    public static String f(HashSet hashSet) {
        if (hashSet.size() == 1) {
            return (String) C42745f0.D(hashSet);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d] */
    @Override // Uv.InterfaceC15572a
    @k
    public final ArrayList a(@k List list, @k n nVar) {
        Ov.k kVarA;
        com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c cVarE;
        com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c cVarE2;
        ArrayList arrayList;
        b bVar = this;
        ArrayList arrayListA = bVar.f16770b.a();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Ov.d dVar = (Ov.d) it.next();
            g gVar = nVar.f12701c.get(Long.valueOf(dVar.f12680a));
            if (gVar == null || (kVarA = bVar.f16771c.a(gVar.f12685b)) == null) {
                arrayList = arrayList2;
            } else {
                C14739b c14739b = kVarA instanceof C14739b ? (C14739b) kVarA : null;
                Long lValueOf = c14739b != null ? Long.valueOf(c14739b.f12671d) : gVar.f12686c;
                Ov.h hVar = nVar.f12702d.get(Long.valueOf(dVar.f12680a));
                com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c cVarE3 = e(lValueOf, kVarA.getF12663d(), hVar != null ? hVar.f12689a : null);
                if (nVar.f12699a.f12696c) {
                    cVarE2 = e(gVar.f12687d, kVarA.getF12664e(), hVar != null ? hVar.f12690b : null);
                    cVarE = e(gVar.f12688e, kVarA.getF12664e(), hVar != null ? hVar.f12691c : null);
                } else {
                    cVarE = null;
                    cVarE2 = null;
                }
                String strK0 = kVarA.getF12660a().k0(bVar.f16769a);
                List listSingletonList = Collections.singletonList(dVar);
                String str = dVar.f12681b;
                arrayList = arrayList2;
                dVar = new com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d(str, str, cVarE3, cVarE2, cVarE, strK0, arrayListA, false, listSingletonList, false, 512, null);
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
            arrayList2 = arrayList;
            bVar = this;
        }
        return arrayList2;
    }

    @Override // Uv.InterfaceC15572a
    @l
    public final com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d b(@k String str, @k n nVar) {
        Object next;
        Iterator<T> it = nVar.f12700b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((f) next).f12682a, str)) {
                break;
            }
        }
        f fVar = (f) next;
        if (fVar == null) {
            return null;
        }
        return d(str, fVar.f12683b, nVar.f12701c, nVar.f12702d, nVar.f12699a.f12696c, false, this.f16770b.a());
    }

    @Override // Uv.InterfaceC15572a
    @l
    public final com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d c(@k n nVar) {
        List<f> list = nVar.f12700b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C42745f0.h(((f) it.next()).f12683b, arrayList);
        }
        List<com.avito.android.lib.design.bottom_sheet.k> listB = this.f16770b.b();
        boolean z12 = nVar.f12699a.f12696c;
        return d("master-setting", arrayList, nVar.f12701c, nVar.f12702d, z12, nVar.f12703e, listB);
    }

    public final com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d d(String str, ArrayList arrayList, Map map, Map map2, boolean z12, boolean z13, List list) {
        String str2;
        String str3;
        String str4;
        com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c cVarE = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        HashSet hashSet7 = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Ov.d dVar = (Ov.d) it.next();
            g gVar = (g) map.get(Long.valueOf(dVar.f12680a));
            if (gVar == null) {
                return null;
            }
            U u12 = this.f16771c;
            Ov.l lVar = gVar.f12685b;
            Ov.k kVarA = u12.a(lVar);
            if (kVarA == null) {
                return null;
            }
            hashSet.add(kVarA);
            if (m.a(lVar)) {
                C14739b c14739b = kVarA instanceof C14739b ? (C14739b) kVarA : null;
                hashSet2.add(c14739b != null ? Long.valueOf(c14739b.f12671d) : gVar.f12686c);
                hashSet3.add(gVar.f12687d);
                hashSet4.add(gVar.f12688e);
                Ov.h hVar = (Ov.h) map2.get(Long.valueOf(dVar.f12680a));
                if (hVar != null && (str4 = hVar.f12689a) != null) {
                    hashSet5.add(str4);
                }
                if (hVar != null && (str3 = hVar.f12690b) != null) {
                    hashSet6.add(str3);
                }
                if (hVar != null && (str2 = hVar.f12691c) != null) {
                    hashSet7.add(str2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (m.a(((Ov.k) next).c())) {
                arrayList2.add(next);
            }
        }
        Ov.k kVar = arrayList2.size() > 1 ? q.f12709a : arrayList2.size() == 1 ? (Ov.k) C42745f0.E(arrayList2) : (Ov.k) C42745f0.D(hashSet);
        boolean z14 = hashSet2.contains(null) && hashSet2.size() == 1;
        boolean z15 = !hashSet2.contains(null) && hashSet2.size() == 1;
        Long l12 = z15 ? (Long) C42745f0.D(hashSet2) : null;
        Long l13 = (hashSet3.isEmpty() || hashSet3.contains(null)) ? null : (Long) C42745f0.a0(C42745f0.C(hashSet3));
        Long l14 = (hashSet4.isEmpty() || hashSet4.contains(null)) ? null : (Long) C42745f0.W(C42745f0.C(hashSet4));
        String strF = f(hashSet5);
        String strF2 = f(hashSet6);
        String strF3 = f(hashSet7);
        com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c cVarE2 = (z14 || z15) ? e(l12, kVar.getF12663d(), strF) : null;
        com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c cVarE3 = (!z12 || L.f(kVar, q.f12709a)) ? null : e(l13, kVar.getF12664e(), strF2);
        if (z12 && !L.f(kVar, q.f12709a)) {
            cVarE = e(l14, kVar.getF12664e(), strF3);
        }
        return new com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.d(str, null, cVarE2, cVarE3, cVarE, kVar.getF12660a().k0(this.f16769a), list, z13, arrayList, false, 512, null);
    }
}
