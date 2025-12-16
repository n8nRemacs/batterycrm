package com.fasterxml.jackson.databind.deser.std;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AtomicReferenceDeserializer.java */
/* renamed from: com.fasterxml.jackson.databind.deser.std.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36451e extends z<AtomicReference<Object>> {
    private static final long serialVersionUID = 1;

    public C36451e() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.i, com.fasterxml.jackson.databind.deser.s
    public final Object b(com.fasterxml.jackson.databind.f fVar) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.z, com.fasterxml.jackson.databind.i, com.fasterxml.jackson.databind.deser.s
    public final Object d(com.fasterxml.jackson.databind.f fVar) {
        return new AtomicReference(this.f341884h.d(fVar));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.z, com.fasterxml.jackson.databind.i
    public final Object l(com.fasterxml.jackson.databind.f fVar) {
        return new AtomicReference(this.f341884h.d(fVar));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.z
    public final Object q0(AtomicReference<Object> atomicReference) {
        return atomicReference.get();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.z, com.fasterxml.jackson.databind.i
    public final Boolean r(com.fasterxml.jackson.databind.e eVar) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.z
    public final AtomicReference r0(Object obj) {
        return new AtomicReference(obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.z
    public final AtomicReference s0(Object obj, Object obj2) {
        AtomicReference atomicReference = (AtomicReference) obj;
        atomicReference.set(obj2);
        return atomicReference;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.z
    public final C36451e t0(com.fasterxml.jackson.databind.jsontype.l lVar, com.fasterxml.jackson.databind.i iVar) {
        return new C36451e(this.f341881e, this.f341882f, lVar, iVar);
    }
}
