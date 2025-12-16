package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.sequences.C43033p;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class xq {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private static final List<String> f391792a = C42745f0.U("native_ad_view", "timer_container", "timer_value");

    public static final class a extends kotlin.jvm.internal.N implements Y41.l<vq, JSONObject> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f391793a = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final JSONObject invoke(vq vqVar) {
            return vqVar.a();
        }
    }

    public static final class b extends kotlin.jvm.internal.N implements Y41.l<JSONObject, List<? extends JSONObject>> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final List<? extends JSONObject> invoke(JSONObject jSONObject) {
            return xq.a(xq.this, jSONObject);
        }
    }

    public static final class c extends kotlin.jvm.internal.N implements Y41.l<JSONObject, String> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(JSONObject jSONObject) {
            return xq.b(xq.this, jSONObject);
        }
    }

    public static final class d extends kotlin.jvm.internal.N implements Y41.l<String, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f391796a = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(String str) {
            return Boolean.valueOf(!xq.f391792a.contains(str));
        }
    }

    public static final ArrayList a(xq xqVar, JSONObject jSONObject) {
        xqVar.getClass();
        ArrayList arrayList = new ArrayList();
        a(jSONObject, new wq(arrayList));
        return arrayList;
    }

    public static final String b(xq xqVar, JSONObject jSONObject) {
        xqVar.getClass();
        if (jSONObject.has("view_name")) {
            Object objA = i11.a("view_name", jSONObject);
            if (objA instanceof String) {
                return (String) objA;
            }
        }
        return null;
    }

    @Y61.k
    public final List<String> a(@Y61.k com.yandex.mobile.ads.nativeads.u uVar) {
        List<vq> listC = uVar.c();
        if (listC == null) {
            listC = C42784z0.f406748b;
        }
        return C42745f0.M0(C43033p.F(C43033p.i(C43033p.y(C43033p.p(new kotlin.sequences.o0(new C42770s0(listC), a.f391793a), new b()), new c()), d.f391796a)));
    }

    private static void a(JSONObject jSONObject, Y41.l lVar) {
        ((wq) lVar).invoke(jSONObject);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            Object objA = i11.a(itKeys.next(), jSONObject);
            if (objA instanceof JSONObject) {
                a((JSONObject) objA, lVar);
            } else if (objA instanceof JSONArray) {
                a((JSONArray) objA, lVar);
            }
        }
    }

    private static void a(JSONArray jSONArray, Y41.l lVar) {
        int length = jSONArray.length();
        for (int i12 = 0; i12 < length; i12++) {
            Object objA = i11.a(jSONArray, i12);
            if (objA instanceof JSONObject) {
                a((JSONObject) objA, lVar);
            } else if (objA instanceof JSONArray) {
                a((JSONArray) objA, lVar);
            }
        }
    }
}
