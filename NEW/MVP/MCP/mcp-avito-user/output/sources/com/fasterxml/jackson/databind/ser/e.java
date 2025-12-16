package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.ser.impl.w;
import com.fasterxml.jackson.databind.ser.std.AbstractC36478d;
import java.util.Set;

/* compiled from: BeanSerializer.java */
/* loaded from: classes4.dex */
public class e extends AbstractC36478d {
    private static final long serialVersionUID = 29;

    public e() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, A a12) {
        if (this.f342373j != null) {
            jsonGenerator.j(obj);
            q(obj, jsonGenerator, a12, true);
            return;
        }
        jsonGenerator.f0(obj);
        if (this.f342371h != null) {
            v(obj, jsonGenerator, a12);
            throw null;
        }
        u(obj, jsonGenerator, a12);
        jsonGenerator.B();
    }

    @Override // com.fasterxml.jackson.databind.l
    public final com.fasterxml.jackson.databind.l<Object> h(com.fasterxml.jackson.databind.util.t tVar) {
        return new w(this, tVar);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d
    public final AbstractC36478d s() {
        return (this.f342373j == null && this.f342370g == null && this.f342371h == null) ? new com.fasterxml.jackson.databind.ser.impl.b(this) : this;
    }

    public final String toString() {
        return "BeanSerializer for ".concat(this.f342353b.getName());
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d
    public final AbstractC36478d w(Set<String> set, Set<String> set2) {
        return new e(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d
    public final AbstractC36478d x(Object obj) {
        return new e(this, this.f342373j, obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d
    public final AbstractC36478d y(com.fasterxml.jackson.databind.ser.impl.i iVar) {
        return new e(this, iVar, this.f342371h);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.AbstractC36478d
    public final AbstractC36478d z(d[] dVarArr, d[] dVarArr2) {
        return new e(this, dVarArr, dVarArr2);
    }
}
