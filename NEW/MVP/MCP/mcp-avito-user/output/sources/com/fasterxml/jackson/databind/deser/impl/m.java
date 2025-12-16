package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.v;
import java.util.Collection;
import java.util.Map;

/* compiled from: ManagedReferenceProperty.java */
/* loaded from: classes4.dex */
public final class m extends v.a {
    private static final long serialVersionUID = 1;

    /* renamed from: p, reason: collision with root package name */
    public final String f341654p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f341655q;

    /* renamed from: r, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.deser.v f341656r;

    public m(com.fasterxml.jackson.databind.deser.v vVar, String str, com.fasterxml.jackson.databind.deser.v vVar2, boolean z12) {
        super(vVar);
        this.f341654p = str;
        this.f341656r = vVar2;
        this.f341655q = z12;
    }

    @Override // com.fasterxml.jackson.databind.deser.v.a, com.fasterxml.jackson.databind.deser.v
    public final Object A(Object obj, Object obj2) {
        if (obj2 != null) {
            boolean z12 = this.f341655q;
            com.fasterxml.jackson.databind.deser.v vVar = this.f341656r;
            if (!z12) {
                vVar.z(obj2, obj);
            } else if (obj2 instanceof Object[]) {
                for (Object obj3 : (Object[]) obj2) {
                    if (obj3 != null) {
                        vVar.z(obj3, obj);
                    }
                }
            } else if (obj2 instanceof Collection) {
                for (Object obj4 : (Collection) obj2) {
                    if (obj4 != null) {
                        vVar.z(obj4, obj);
                    }
                }
            } else {
                if (!(obj2 instanceof Map)) {
                    StringBuilder sb2 = new StringBuilder("Unsupported container type (");
                    sb2.append(obj2.getClass().getName());
                    sb2.append(") when resolving reference '");
                    throw new IllegalStateException(AK.c.s(sb2, this.f341654p, "'"));
                }
                for (Object obj5 : ((Map) obj2).values()) {
                    if (obj5 != null) {
                        vVar.z(obj5, obj);
                    }
                }
            }
        }
        return this.f341906o.A(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.v.a
    public final com.fasterxml.jackson.databind.deser.v F(com.fasterxml.jackson.databind.deser.v vVar) {
        throw new IllegalStateException("Should never try to reset delegate");
    }

    @Override // com.fasterxml.jackson.databind.deser.v.a, com.fasterxml.jackson.databind.deser.v
    public final void h(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
        A(obj, this.f341906o.g(jsonParser, fVar));
    }

    @Override // com.fasterxml.jackson.databind.deser.v.a, com.fasterxml.jackson.databind.deser.v
    public final Object i(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
        return A(obj, g(jsonParser, fVar));
    }

    @Override // com.fasterxml.jackson.databind.deser.v.a, com.fasterxml.jackson.databind.deser.v
    public final void l(com.fasterxml.jackson.databind.e eVar) {
        this.f341906o.l(eVar);
        this.f341656r.l(eVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.v.a, com.fasterxml.jackson.databind.deser.v
    public final void z(Object obj, Object obj2) {
        A(obj, obj2);
    }
}
