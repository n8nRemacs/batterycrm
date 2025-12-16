package com.avito.android.ab_tests;

import android.content.SharedPreferences;
import com.avito.android.util.R1;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import j.l0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import u3.C48777a;
import u3.C48781e;

/* compiled from: AbTestPrefs.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_tests/g;", "Lcom/avito/android/ab_tests/f;", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.ab_tests.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27644g implements InterfaceC27643f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f67945a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f67946b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27638a f67947c;

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/N1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ab_tests.g$a */
    public static final class a extends com.google.gson.reflect.a<C48777a> {
    }

    public C27644g(@Y61.k AK0.l lVar, @Y61.k h31.e<Gson> eVar, @Y61.k InterfaceC27638a interfaceC27638a) {
        this.f67945a = lVar;
        this.f67946b = eVar;
        this.f67947c = interfaceC27638a;
    }

    public static String e(String str) {
        return androidx.appcompat.app.r.q(str, "_TEST_GROUP");
    }

    @Override // com.avito.android.ab_tests.InterfaceC27643f
    public final synchronized void a(@Y61.k Map<String, C48777a> map) {
        this.f67947c.d();
        d(map);
    }

    @Override // com.avito.android.ab_tests.InterfaceC27643f
    @Y61.k
    @l0
    public final Map<String, C48777a> b() {
        Set<String> setKeySet = this.f67945a.getAll().keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (C43066x.z((String) obj, "_TEST_GROUP", false)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(C43066x.q0((String) it.next(), "_TEST_GROUP"));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            C48777a c48777aC = c(str);
            kotlin.Q q12 = c48777aC != null ? new kotlin.Q(str, c48777aC) : null;
            if (q12 != null) {
                arrayList3.add(q12);
            }
        }
        return P0.p(arrayList3);
    }

    @Override // com.avito.android.ab_tests.InterfaceC27643f
    @Y61.l
    public final C48777a c(@Y61.k String str) {
        String strD;
        AK0.l lVar = this.f67945a;
        if (lVar.contains(str)) {
            String strD2 = lVar.d(str);
            if (strD2 != null) {
                try {
                    this.f67947c.b();
                    Gson gson = this.f67946b.get();
                    Type type = new a().getType();
                    return (C48777a) gson.e(strD2, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
                } catch (Exception unused) {
                    V2.f318762a.e("PrefsAbConfig: error to parse abTest ".concat(str), null);
                }
            }
        } else if (lVar.contains(e(str)) && (strD = lVar.d(e(str))) != null) {
            String strD3 = lVar.d(str.concat("_AB_TOKEN"));
            boolean z12 = lVar.getBoolean(str.concat("_CLIENT_EXPOSURE"), false);
            return new C48777a(strD, strD3 != null ? new C48781e(strD3, z12) : null, lVar.getString(str.concat("_CONFIG")));
        }
        return null;
    }

    public final void d(Map<String, C48777a> map) {
        C48781e c48781e;
        C48781e c48781e2;
        String abToken;
        String str;
        String str2;
        AK0.l lVar = this.f67945a;
        SharedPreferences.Editor editorEdit = lVar.getF316a().edit();
        editorEdit.clear();
        for (String str3 : map.keySet()) {
            C48777a c48777a = map.get(str3);
            V2 v22 = V2.f318762a;
            StringBuilder sbZ = androidx.appcompat.app.r.z(str3, ": ");
            sbZ.append(c48777a != null ? c48777a.f439736a : null);
            v22.c("AB_TEST", sbZ.toString(), null);
            if (c48777a != null && (str2 = c48777a.f439736a) != null) {
                editorEdit.putString(e(str3), str2);
            }
            if (c48777a != null && (str = c48777a.f439738c) != null) {
                editorEdit.putString(str3 + "_CONFIG", str);
            }
            if (c48777a != null && (c48781e2 = c48777a.f439737b) != null && (abToken = c48781e2.getAbToken()) != null) {
                editorEdit.putString(str3 + "_AB_TOKEN", abToken);
            }
            if (c48777a != null && (c48781e = c48777a.f439737b) != null) {
                editorEdit.putBoolean(str3 + "_CLIENT_EXPOSURE", c48781e.getClientExposure());
            }
        }
        boolean z12 = false;
        if (map.keySet().size() == lVar.getAll().size()) {
            Iterator<String> it = lVar.getAll().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z12 = true;
                    break;
                }
                String next = it.next();
                C48777a c48777aC = c(next);
                C48777a c48777a2 = map.get(next);
                if (c48777a2 == null || !kotlin.jvm.internal.L.f(c48777aC, c48777a2)) {
                    break;
                }
            }
        }
        if (z12) {
            editorEdit.putLong("LAST_CONFIG_UPDATE_TIMESTAMP", System.currentTimeMillis());
        }
        this.f67947c.a(z12);
        editorEdit.apply();
    }
}
