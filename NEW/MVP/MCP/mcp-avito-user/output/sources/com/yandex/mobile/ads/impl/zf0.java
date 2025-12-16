package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class zf0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f392238a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Map<String, String> f392239b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final List<String> f392240c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final List<String> f392241d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private final List<String> f392242e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private final AdImpressionData f392243f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private final Map<String, String> f392244g;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final String f392245a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final Map<String, String> f392246b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        private List<String> f392247c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        private List<String> f392248d;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        private List<String> f392249e;

        /* renamed from: f, reason: collision with root package name */
        @j.P
        private AdImpressionData f392250f;

        /* renamed from: g, reason: collision with root package name */
        @j.P
        private Map<String, String> f392251g;

        public a(@j.N String str, @j.N HashMap map) {
            this.f392245a = str;
            this.f392246b = map;
        }

        @j.N
        public final zf0 a() {
            return new zf0(this, 0);
        }

        @j.N
        public final a b(@j.P ArrayList arrayList) {
            this.f392248d = arrayList;
            return this;
        }

        @j.N
        public final a c(@j.P ArrayList arrayList) {
            this.f392247c = arrayList;
            return this;
        }

        @j.N
        public final a a(@j.P ArrayList arrayList) {
            this.f392249e = arrayList;
            return this;
        }

        @j.N
        public final void a(@j.P AdImpressionData adImpressionData) {
            this.f392250f = adImpressionData;
        }

        @j.N
        public final void a(@j.P HashMap map) {
            this.f392251g = map;
        }
    }

    public /* synthetic */ zf0(a aVar, int i12) {
        this(aVar);
    }

    @j.P
    public final AdImpressionData a() {
        return this.f392243f;
    }

    @j.P
    public final List<String> b() {
        return this.f392242e;
    }

    @j.N
    public final String c() {
        return this.f392238a;
    }

    @j.P
    public final Map<String, String> d() {
        return this.f392244g;
    }

    @j.P
    public final List<String> e() {
        return this.f392241d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zf0.class != obj.getClass()) {
            return false;
        }
        zf0 zf0Var = (zf0) obj;
        if (!this.f392238a.equals(zf0Var.f392238a) || !this.f392239b.equals(zf0Var.f392239b)) {
            return false;
        }
        List<String> list = this.f392240c;
        if (list == null ? zf0Var.f392240c != null : !list.equals(zf0Var.f392240c)) {
            return false;
        }
        List<String> list2 = this.f392241d;
        if (list2 == null ? zf0Var.f392241d != null : !list2.equals(zf0Var.f392241d)) {
            return false;
        }
        AdImpressionData adImpressionData = this.f392243f;
        if (adImpressionData == null ? zf0Var.f392243f != null : !adImpressionData.equals(zf0Var.f392243f)) {
            return false;
        }
        Map<String, String> map = this.f392244g;
        if (map == null ? zf0Var.f392244g != null : !map.equals(zf0Var.f392244g)) {
            return false;
        }
        List<String> list3 = this.f392242e;
        return list3 != null ? list3.equals(zf0Var.f392242e) : zf0Var.f392242e == null;
    }

    @j.P
    public final List<String> f() {
        return this.f392240c;
    }

    @j.N
    public final Map<String, String> g() {
        return this.f392239b;
    }

    public final int hashCode() {
        int iHashCode = (this.f392239b.hashCode() + (this.f392238a.hashCode() * 31)) * 31;
        List<String> list = this.f392240c;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f392241d;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.f392242e;
        int iHashCode4 = (iHashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31;
        AdImpressionData adImpressionData = this.f392243f;
        int iHashCode5 = (iHashCode4 + (adImpressionData != null ? adImpressionData.hashCode() : 0)) * 31;
        Map<String, String> map = this.f392244g;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }

    private zf0(@j.N a aVar) {
        this.f392238a = aVar.f392245a;
        this.f392239b = aVar.f392246b;
        this.f392240c = aVar.f392247c;
        this.f392241d = aVar.f392248d;
        this.f392242e = aVar.f392249e;
        this.f392243f = aVar.f392250f;
        this.f392244g = aVar.f392251g;
    }
}
