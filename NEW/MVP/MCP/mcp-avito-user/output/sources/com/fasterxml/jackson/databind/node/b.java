package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import java.io.Serializable;

/* compiled from: BaseJsonNode.java */
/* loaded from: classes4.dex */
public abstract class b extends com.fasterxml.jackson.databind.j implements Serializable {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.k
    public abstract void d(JsonGenerator jsonGenerator, A a12);

    public String toString() throws JsonProcessingException {
        try {
            com.fasterxml.jackson.databind.t tVar = k.f342201b;
            tVar.getClass();
            com.fasterxml.jackson.core.io.m mVar = new com.fasterxml.jackson.core.io.m(tVar.f342428e.b());
            try {
                tVar.a(tVar.b(mVar), this);
                com.fasterxml.jackson.core.util.p pVar = mVar.f341184b;
                String strG = pVar.g();
                pVar.o();
                return strG;
            } catch (JsonProcessingException e12) {
                throw e12;
            } catch (IOException e13) {
                throw JsonMappingException.g(e13);
            }
        } catch (IOException e14) {
            throw new RuntimeException(e14);
        }
    }

    public Object writeReplace() {
        try {
            byte[] bArrB = k.b(this);
            q qVar = new q();
            qVar.f342214b = bArrB;
            return qVar;
        } catch (IOException e12) {
            throw new IllegalArgumentException("Failed to JDK serialize `" + getClass().getSimpleName() + "` value: " + e12.getMessage(), e12);
        }
    }
}
