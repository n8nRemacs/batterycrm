package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.impl.C36444c;
import com.fasterxml.jackson.databind.introspect.C36472k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: BeanDeserializerBuilder.java */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.e f341571a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.f f341572b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.b f341573c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f341574d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f341575e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap<String, v> f341576f;

    /* renamed from: g, reason: collision with root package name */
    public HashSet<String> f341577g;

    /* renamed from: h, reason: collision with root package name */
    public HashSet<String> f341578h;

    /* renamed from: i, reason: collision with root package name */
    public x f341579i;

    /* renamed from: j, reason: collision with root package name */
    public com.fasterxml.jackson.databind.deser.impl.s f341580j;

    /* renamed from: k, reason: collision with root package name */
    public u f341581k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f341582l;

    /* renamed from: m, reason: collision with root package name */
    public C36472k f341583m;

    public e(com.fasterxml.jackson.databind.b bVar, com.fasterxml.jackson.databind.f fVar) {
        this.f341573c = bVar;
        this.f341572b = fVar;
        this.f341571a = fVar.f341921d;
    }

    public final Map<String, List<com.fasterxml.jackson.databind.v>> a(Collection<v> collection) {
        AnnotationIntrospector annotationIntrospectorD = this.f341571a.d();
        HashMap map = null;
        if (annotationIntrospectorD != null) {
            for (v vVar : collection) {
                List<com.fasterxml.jackson.databind.v> listF = annotationIntrospectorD.F(vVar.b());
                if (listF != null && !listF.isEmpty()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(vVar.f341896d.f342656b, listF);
                }
            }
        }
        return map == null ? Collections.emptyMap() : map;
    }

    public final void b(Collection<v> collection) {
        com.fasterxml.jackson.databind.e eVar = this.f341571a;
        eVar.getClass();
        if (eVar.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            Iterator<v> it = collection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().l(eVar);
                } catch (IllegalArgumentException e12) {
                    c(e12);
                    throw null;
                }
            }
        }
        u uVar = this.f341581k;
        if (uVar != null) {
            try {
                uVar.getClass();
                uVar.f341886c.g(eVar.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e13) {
                c(e13);
                throw null;
            }
        }
        C36472k c36472k = this.f341583m;
        if (c36472k != null) {
            try {
                c36472k.g(eVar.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e14) {
                c(e14);
                throw null;
            }
        }
    }

    public final void c(IllegalArgumentException illegalArgumentException) {
        try {
            this.f341572b.T(this.f341573c, illegalArgumentException.getMessage(), new Object[0]);
            throw null;
        } catch (DatabindException e12) {
            if (e12.getCause() == null) {
                e12.initCause(illegalArgumentException);
            }
            throw e12;
        }
    }

    public final void d(String str) {
        if (this.f341577g == null) {
            this.f341577g = new HashSet<>();
        }
        this.f341577g.add(str);
    }

    public final void e(v vVar) {
        LinkedHashMap linkedHashMap = this.f341574d;
        com.fasterxml.jackson.databind.v vVar2 = vVar.f341896d;
        v vVar3 = (v) linkedHashMap.put(vVar2.f342656b, vVar);
        if (vVar3 == null || vVar3 == vVar) {
            return;
        }
        throw new IllegalArgumentException("Duplicate property '" + vVar2.f342656b + "' for " + this.f341573c.f341454a);
    }

    public final c f() {
        Collection<v> collectionValues = this.f341574d.values();
        b(collectionValues);
        Map<String, List<com.fasterxml.jackson.databind.v>> mapA = a(collectionValues);
        Boolean boolB = this.f341573c.f().b(JsonFormat.Feature.f340928c);
        com.fasterxml.jackson.databind.e eVar = this.f341571a;
        C36444c c36444c = new C36444c(boolB == null ? eVar.k(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES) : boolB.booleanValue(), collectionValues, mapA, eVar.f341506c.f341480h);
        c36444c.d();
        boolean zK2 = eVar.k(MapperFeature.DEFAULT_VIEW_INCLUSION);
        boolean z12 = !zK2;
        if (zK2) {
            Iterator<v> it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().v()) {
                    z12 = true;
                    break;
                }
            }
        }
        boolean z13 = z12;
        if (this.f341580j != null) {
            c36444c = c36444c.l(new com.fasterxml.jackson.databind.deser.impl.u(this.f341580j, com.fasterxml.jackson.databind.u.f342512i));
        }
        return new c(this, this.f341573c, c36444c, this.f341576f, this.f341577g, this.f341582l, this.f341578h, z13);
    }
}
