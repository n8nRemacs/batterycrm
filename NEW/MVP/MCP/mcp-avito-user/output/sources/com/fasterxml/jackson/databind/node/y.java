package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.A;

/* compiled from: ValueNode.java */
/* loaded from: classes4.dex */
public abstract class y extends b {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.k
    public void a(JsonGenerator jsonGenerator, A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        WritableTypeId writableTypeIdE = oVar.e(jsonGenerator, oVar.d(b(), this));
        d(jsonGenerator, a12);
        oVar.f(jsonGenerator, writableTypeIdE);
    }
}
