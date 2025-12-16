package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.introspect.AbstractC36471j;

/* compiled from: MergingSettableBeanProperty.java */
/* loaded from: classes4.dex */
public class n extends v.a {
    private static final long serialVersionUID = 1;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC36471j f341657p;

    public n(com.fasterxml.jackson.databind.deser.v vVar, AbstractC36471j abstractC36471j) {
        super(vVar);
        this.f341657p = abstractC36471j;
    }

    @Override // com.fasterxml.jackson.databind.deser.v.a, com.fasterxml.jackson.databind.deser.v
    public final Object A(Object obj, Object obj2) {
        return obj2 != null ? this.f341906o.A(obj, obj2) : obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.v.a
    public final com.fasterxml.jackson.databind.deser.v F(com.fasterxml.jackson.databind.deser.v vVar) {
        return new n(vVar, this.f341657p);
    }

    @Override // com.fasterxml.jackson.databind.deser.v.a, com.fasterxml.jackson.databind.deser.v
    public final void h(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
        Object objL = this.f341657p.l(obj);
        com.fasterxml.jackson.databind.deser.v vVar = this.f341906o;
        Object objG = objL == null ? vVar.g(jsonParser, fVar) : vVar.k(jsonParser, fVar, objL);
        if (objG != objL) {
            vVar.z(obj, objG);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.v.a, com.fasterxml.jackson.databind.deser.v
    public final Object i(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Object obj) {
        Object objL = this.f341657p.l(obj);
        com.fasterxml.jackson.databind.deser.v vVar = this.f341906o;
        Object objG = objL == null ? vVar.g(jsonParser, fVar) : vVar.k(jsonParser, fVar, objL);
        return (objG == objL || objG == null) ? obj : vVar.A(obj, objG);
    }

    @Override // com.fasterxml.jackson.databind.deser.v.a, com.fasterxml.jackson.databind.deser.v
    public final void z(Object obj, Object obj2) {
        if (obj2 != null) {
            this.f341906o.z(obj, obj2);
        }
    }
}
