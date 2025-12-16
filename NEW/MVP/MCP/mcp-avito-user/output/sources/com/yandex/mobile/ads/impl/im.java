package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class im implements oi1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ArrayList f386532a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ArrayList f386533b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ArrayList f386534c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final lm f386535d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ja1 f386536e = new ja1();

    /* renamed from: f, reason: collision with root package name */
    private final String f386537f;

    /* renamed from: g, reason: collision with root package name */
    private final String f386538g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private v41 f386539h;

    /* renamed from: i, reason: collision with root package name */
    private int f386540i;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final ArrayList f386541a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final ArrayList f386542b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final ArrayList f386543c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        @j.P
        private lm f386544d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        private String f386545e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        private v41 f386546f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        private String f386547g;

        /* renamed from: h, reason: collision with root package name */
        private int f386548h;

        @j.N
        public final a a(int i12) {
            this.f386548h = i12;
            return this;
        }

        @j.N
        public final void b(@j.P String str) {
            this.f386547g = str;
        }

        @j.N
        public final a a(@j.P List list) {
            ArrayList arrayList = this.f386542b;
            if (list == null) {
                list = Collections.emptyList();
            }
            arrayList.addAll(list);
            return this;
        }

        @j.N
        public final a b(@j.P List list) {
            ArrayList arrayList = this.f386541a;
            if (list == null) {
                list = Collections.emptyList();
            }
            arrayList.addAll(list);
            return this;
        }

        @j.N
        public final a a(@j.P ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f386543c.add((ia1) it.next());
            }
            return this;
        }

        @j.N
        public final void a(@j.N lm lmVar) {
            this.f386544d = lmVar;
        }

        @j.N
        public final void a(@j.N ia1 ia1Var) {
            this.f386543c.add(ia1Var);
        }

        @j.N
        public final a a(@j.P String str) {
            this.f386545e = str;
            return this;
        }

        @j.N
        public final a a(@j.P v41 v41Var) {
            this.f386546f = v41Var;
            return this;
        }

        @j.N
        public final im a() {
            return new im(this);
        }
    }

    public im(@j.N a aVar) {
        this.f386538g = aVar.f386547g;
        this.f386540i = aVar.f386548h;
        this.f386532a = aVar.f386541a;
        this.f386533b = aVar.f386542b;
        this.f386534c = aVar.f386543c;
        this.f386535d = aVar.f386544d;
        this.f386537f = aVar.f386545e;
        this.f386539h = aVar.f386546f;
    }

    @Override // com.yandex.mobile.ads.impl.oi1
    @j.N
    public final Map<String, List<String>> a() {
        List arrayList;
        ja1 ja1Var = this.f386536e;
        ArrayList arrayList2 = this.f386534c;
        ja1Var.getClass();
        HashMap map = new HashMap();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ia1 ia1Var = (ia1) it.next();
            String strA = ia1Var.a();
            if (map.containsKey(strA)) {
                arrayList = (List) map.get(strA);
            } else {
                arrayList = new ArrayList();
                map.put(strA, arrayList);
            }
            arrayList.add(ia1Var.c());
        }
        return Collections.unmodifiableMap(map);
    }

    public final String b() {
        return this.f386537f;
    }

    @j.P
    public final lm c() {
        return this.f386535d;
    }

    public final int d() {
        return this.f386540i;
    }

    @j.N
    public final List<y10> e() {
        return Collections.unmodifiableList(this.f386533b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || im.class != obj.getClass()) {
            return false;
        }
        im imVar = (im) obj;
        if (this.f386540i != imVar.f386540i || !this.f386532a.equals(imVar.f386532a) || !this.f386533b.equals(imVar.f386533b) || !this.f386534c.equals(imVar.f386534c)) {
            return false;
        }
        lm lmVar = this.f386535d;
        if (lmVar == null ? imVar.f386535d != null : !lmVar.equals(imVar.f386535d)) {
            return false;
        }
        String str = this.f386537f;
        if (str == null ? imVar.f386537f != null : !str.equals(imVar.f386537f)) {
            return false;
        }
        v41 v41Var = this.f386539h;
        if (v41Var == null ? imVar.f386539h != null : !v41Var.equals(imVar.f386539h)) {
            return false;
        }
        String str2 = this.f386538g;
        String str3 = imVar.f386538g;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    @j.N
    public final List<rc0> f() {
        return Collections.unmodifiableList(this.f386532a);
    }

    @j.P
    public final v41 g() {
        return this.f386539h;
    }

    @j.N
    public final ArrayList h() {
        return this.f386534c;
    }

    public final int hashCode() {
        int iHashCode = (this.f386534c.hashCode() + ((this.f386533b.hashCode() + (this.f386532a.hashCode() * 31)) * 31)) * 31;
        lm lmVar = this.f386535d;
        int iHashCode2 = (iHashCode + (lmVar != null ? lmVar.hashCode() : 0)) * 31;
        String str = this.f386537f;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        v41 v41Var = this.f386539h;
        int iHashCode4 = (iHashCode3 + (v41Var != null ? v41Var.hashCode() : 0)) * 31;
        String str2 = this.f386538g;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f386540i;
    }
}
