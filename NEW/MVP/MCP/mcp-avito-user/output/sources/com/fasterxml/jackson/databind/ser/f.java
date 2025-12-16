package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;
import com.fasterxml.jackson.databind.z;
import java.util.Collections;
import java.util.List;

/* compiled from: BeanSerializerBuilder.java */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: i, reason: collision with root package name */
    public static final d[] f342254i = new d[0];

    /* renamed from: a, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.b f342255a;

    /* renamed from: b, reason: collision with root package name */
    public z f342256b;

    /* renamed from: c, reason: collision with root package name */
    public List<d> f342257c = Collections.emptyList();

    /* renamed from: d, reason: collision with root package name */
    public d[] f342258d;

    /* renamed from: e, reason: collision with root package name */
    public a f342259e;

    /* renamed from: f, reason: collision with root package name */
    public Object f342260f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC36471j f342261g;

    /* renamed from: h, reason: collision with root package name */
    public com.fasterxml.jackson.databind.ser.impl.i f342262h;

    public f(com.fasterxml.jackson.databind.b bVar) {
        this.f342255a = bVar;
    }

    public final e a() {
        d[] dVarArr;
        if (this.f342261g != null && this.f342256b.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            this.f342261g.g(this.f342256b.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        a aVar = this.f342259e;
        if (aVar != null) {
            aVar.f342229b.g(this.f342256b.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        List<d> list = this.f342257c;
        if (list == null || list.isEmpty()) {
            if (this.f342259e == null && this.f342262h == null) {
                return null;
            }
            dVarArr = f342254i;
        } else {
            List<d> list2 = this.f342257c;
            dVarArr = (d[]) list2.toArray(new d[list2.size()]);
            if (this.f342256b.k(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (d dVar : dVarArr) {
                    z zVar = this.f342256b;
                    dVar.getClass();
                    dVar.f342243j.g(zVar.k(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                }
            }
        }
        d[] dVarArr2 = this.f342258d;
        if (dVarArr2 == null || dVarArr2.length == this.f342257c.size()) {
            return new e(this.f342255a.f341454a, this, dVarArr, this.f342258d);
        }
        throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", Integer.valueOf(this.f342257c.size()), Integer.valueOf(this.f342258d.length)));
    }
}
