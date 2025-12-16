package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.ser.std.AbstractC36476b;
import java.util.Iterator;
import rX0.InterfaceC47610a;

/* compiled from: IteratorSerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class g extends AbstractC36476b<Iterator<?>> {
    public g() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(A a12, Object obj) {
        return !((Iterator) obj).hasNext();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36476b, com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, A a12) {
        Iterator<?> it = (Iterator) obj;
        jsonGenerator.c0(it);
        s(it, jsonGenerator, a12);
        jsonGenerator.A();
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final com.fasterxml.jackson.databind.ser.i<?> p(com.fasterxml.jackson.databind.jsontype.o oVar) {
        return new g(this, this.f342360e, oVar, this.f342364i, this.f342362g);
    }

    @Override // com.fasterxml.jackson.databind.ser.i
    public final /* bridge */ /* synthetic */ boolean q(Object obj) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36476b
    public final AbstractC36476b<Iterator<?>> t(com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l lVar, Boolean bool) {
        return new g(this, cVar, oVar, lVar, bool);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36476b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void s(Iterator<?> it, JsonGenerator jsonGenerator, A a12) {
        if (it.hasNext()) {
            com.fasterxml.jackson.databind.jsontype.o oVar = this.f342363h;
            com.fasterxml.jackson.databind.l<Object> lVar = this.f342364i;
            if (lVar != null) {
                do {
                    Object next = it.next();
                    if (next == null) {
                        a12.o(jsonGenerator);
                    } else if (oVar == null) {
                        lVar.f(next, jsonGenerator, a12);
                    } else {
                        lVar.g(next, jsonGenerator, a12, oVar);
                    }
                } while (it.hasNext());
                return;
            }
            k kVar = this.f342365j;
            do {
                Object next2 = it.next();
                if (next2 == null) {
                    a12.o(jsonGenerator);
                } else {
                    Class<?> cls = next2.getClass();
                    com.fasterxml.jackson.databind.l<Object> lVarD = kVar.d(cls);
                    if (lVarD == null) {
                        com.fasterxml.jackson.databind.h hVar = this.f342359d;
                        if (hVar.v()) {
                            lVarD = r(kVar, a12.n(hVar, cls), a12);
                        } else {
                            lVarD = a12.q(cls, this.f342360e);
                            k kVarC = kVar.c(cls, lVarD);
                            if (kVar != kVarC) {
                                this.f342365j = kVarC;
                            }
                        }
                        kVar = this.f342365j;
                    }
                    if (oVar == null) {
                        lVarD.f(next2, jsonGenerator, a12);
                    } else {
                        lVarD.g(next2, jsonGenerator, a12, oVar);
                    }
                }
            } while (it.hasNext());
        }
    }
}
