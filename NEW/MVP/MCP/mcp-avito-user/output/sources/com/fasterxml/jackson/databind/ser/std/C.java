package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.k;
import rX0.InterfaceC47610a;

/* compiled from: SerializableSerializer.java */
@InterfaceC47610a
/* loaded from: classes4.dex */
public class C extends M<com.fasterxml.jackson.databind.k> {

    /* renamed from: d, reason: collision with root package name */
    public static final C f342342d = new C();

    public C() {
        super(com.fasterxml.jackson.databind.k.class);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final boolean d(com.fasterxml.jackson.databind.A a12, Object obj) {
        com.fasterxml.jackson.databind.k kVar = (com.fasterxml.jackson.databind.k) obj;
        if (kVar instanceof k.a) {
            return ((k.a) kVar).isEmpty();
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void f(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        ((com.fasterxml.jackson.databind.k) obj).d(jsonGenerator, a12);
    }

    @Override // com.fasterxml.jackson.databind.l
    public final void g(Object obj, JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        ((com.fasterxml.jackson.databind.k) obj).a(jsonGenerator, a12, oVar);
    }
}
