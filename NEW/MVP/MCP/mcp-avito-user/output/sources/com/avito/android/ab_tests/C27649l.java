package com.avito.android.ab_tests;

import com.avito.android.error_reporting.app_state.C30374m;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import u3.AbstractC48780d;
import u3.C48777a;

/* compiled from: AbTestsConfigProvider.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/ab_tests/l;", "Lcom/avito/android/ab_tests/k;", "Lcom/avito/android/ab_tests/j;", "Lcom/avito/android/ab_tests/i;", "Lcom/avito/android/ab_tests/e;", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.ab_tests.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C27649l implements InterfaceC27648k, InterfaceC27647j, InterfaceC27646i, InterfaceC27642e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27643f f67991a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30374m f67992b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.P f67993c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f67994d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f67995e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f67996f = C42727D.c(a.f67997l);

    /* compiled from: AbTestsConfigProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ab_tests.l$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Gson> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f67997l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Gson invoke() {
            return new com.google.gson.d().a();
        }
    }

    public C27649l(@Y61.k InterfaceC27643f interfaceC27643f, @Y61.k C30374m c30374m, @Y61.k com.avito.android.P p12, @Y61.k com.avito.android.util.C c12) {
        this.f67991a = interfaceC27643f;
        this.f67992b = c30374m;
        this.f67993c = p12;
        this.f67994d = c12;
    }

    @Override // com.avito.android.ab_tests.InterfaceC27648k
    public final void a(@Y61.k Map<String, C48777a> map) {
        this.f67991a.a(map);
    }

    @Override // com.avito.android.ab_tests.InterfaceC27647j
    @Y61.k
    public final HashMap b() {
        Set<Map.Entry<String, C48777a>> setEntrySet = this.f67991a.b().entrySet();
        HashMap map = new HashMap();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            map.put(entry.getKey(), ((C48777a) entry.getValue()).f439736a);
        }
        Set<Map.Entry> setEntrySet2 = this.f67995e.entrySet();
        int iF2 = P0.f(C42745f0.q(setEntrySet2, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Map.Entry entry2 : setEntrySet2) {
            linkedHashMap.put(entry2.getKey(), ((u3.j) ((u3.m) entry2.getValue()).f439749b).getF67875b());
        }
        map.putAll(linkedHashMap);
        return map;
    }

    @Override // com.avito.android.ab_tests.InterfaceC27642e
    @Y61.k
    public final <GROUP extends u3.j> u3.m<GROUP> c(@Y61.k AbstractC48780d<GROUP> abstractC48780d) {
        u3.j jVarF;
        u3.m<GROUP> mVar;
        u3.j jVarD;
        boolean f437349b = abstractC48780d.getF437349b();
        LinkedHashMap linkedHashMap = this.f67995e;
        if (f437349b) {
            Object obj = linkedHashMap.get(abstractC48780d.getF437348a());
            u3.m<GROUP> mVar2 = obj instanceof u3.m ? (u3.m) obj : null;
            if (mVar2 != null) {
                return mVar2;
            }
        }
        C48777a c48777aC = this.f67991a.c(abstractC48780d.getF437348a());
        com.avito.android.P p12 = this.f67993c;
        p12.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.P.f67370w0[31];
        boolean zBooleanValue = ((Boolean) p12.f67436u.a().invoke()).booleanValue();
        String f437348a = abstractC48780d.getF437348a();
        if (c48777aC == null || !zBooleanValue || !abstractC48780d.g() || (jVarD = abstractC48780d.d(c48777aC.f439736a)) == null) {
            if (this.f67994d.l() || !abstractC48780d.g() || (jVarF = abstractC48780d.c()) == null) {
                jVarF = abstractC48780d.f();
            }
            mVar = new u3.m<>(null, jVarF, null, f437348a);
        } else {
            mVar = new u3.m<>(c48777aC.f439737b, jVarD, null, f437348a);
        }
        if (abstractC48780d.getF437349b()) {
            linkedHashMap.put(abstractC48780d.getF437348a(), mVar);
        }
        this.f67992b.a(abstractC48780d.getF437348a(), mVar.f439749b.getF67875b());
        return mVar;
    }
}
