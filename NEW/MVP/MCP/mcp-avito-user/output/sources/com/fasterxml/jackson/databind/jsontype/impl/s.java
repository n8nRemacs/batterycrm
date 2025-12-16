package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.MapperFeature;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TypeNameIdResolver.java */
/* loaded from: classes4.dex */
public class s extends r {

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.cfg.m f342173c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f342174d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f342175e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f342176f;

    public s(com.fasterxml.jackson.databind.cfg.m mVar, com.fasterxml.jackson.databind.h hVar, ConcurrentHashMap concurrentHashMap, HashMap map) {
        super(hVar, mVar.f341506c.f341474b);
        this.f342173c = mVar;
        this.f342174d = concurrentHashMap;
        this.f342175e = map;
        this.f342176f = mVar.k(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.m
    public final String a(Object obj) {
        return f(obj.getClass());
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.r, com.fasterxml.jackson.databind.jsontype.m
    public final String c() {
        TreeSet treeSet = new TreeSet();
        for (Map.Entry entry : this.f342175e.entrySet()) {
            if (((com.fasterxml.jackson.databind.h) entry.getValue()).A()) {
                treeSet.add(entry.getKey());
            }
        }
        return treeSet.toString();
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.r, com.fasterxml.jackson.databind.jsontype.m
    public final com.fasterxml.jackson.databind.h d(com.fasterxml.jackson.databind.f fVar, String str) {
        if (this.f342176f) {
            str = str.toLowerCase();
        }
        return (com.fasterxml.jackson.databind.h) this.f342175e.get(str);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.m
    public final String e(Class cls, Object obj) {
        return obj == null ? f(cls) : f(obj.getClass());
    }

    public final String f(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        ConcurrentHashMap<String, String> concurrentHashMap = this.f342174d;
        String strB0 = concurrentHashMap.get(name);
        if (strB0 == null) {
            Class<?> cls2 = this.f342171a.l(cls).f341930b;
            com.fasterxml.jackson.databind.cfg.m mVar = this.f342173c;
            mVar.getClass();
            if (mVar.k(MapperFeature.USE_ANNOTATIONS)) {
                strB0 = mVar.d().b0(((com.fasterxml.jackson.databind.introspect.s) mVar.i(cls2)).f342086e);
            }
            if (strB0 == null) {
                String name2 = cls2.getName();
                int iLastIndexOf = name2.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    name2 = name2.substring(iLastIndexOf + 1);
                }
                strB0 = name2;
            }
            concurrentHashMap.put(name, strB0);
        }
        return strB0;
    }

    public final String toString() {
        return String.format("[%s; id-to-type=%s]", getClass().getName(), this.f342175e);
    }
}
