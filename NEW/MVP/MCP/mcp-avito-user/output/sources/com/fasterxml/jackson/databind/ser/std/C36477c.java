package com.fasterxml.jackson.databind.ser.std;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AtomicReferenceSerializer.java */
/* renamed from: com.fasterxml.jackson.databind.ser.std.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36477c extends B<AtomicReference<?>> {
    private static final long serialVersionUID = 1;

    public C36477c() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.B
    public final Object q(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.B
    public final Object r(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.B
    public final boolean s(AtomicReference<?> atomicReference) {
        return atomicReference.get() != null;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.B
    public final C36477c t(Object obj, boolean z12) {
        return new C36477c(this, this.f342334e, this.f342335f, this.f342336g, this.f342337h, obj, z12);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.B
    public final C36477c u(com.fasterxml.jackson.databind.c cVar, com.fasterxml.jackson.databind.jsontype.o oVar, com.fasterxml.jackson.databind.l lVar, com.fasterxml.jackson.databind.util.t tVar) {
        return new C36477c(this, cVar, oVar, lVar, tVar, this.f342339j, this.f342340k);
    }
}
