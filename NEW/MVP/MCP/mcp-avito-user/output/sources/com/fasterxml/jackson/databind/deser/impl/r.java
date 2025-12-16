package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.exc.InvalidNullException;
import java.io.Serializable;
import java.lang.annotation.Annotation;

/* compiled from: NullsFailProvider.java */
/* loaded from: classes4.dex */
public class r implements com.fasterxml.jackson.databind.deser.s, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.v f341665b;

    public r(com.fasterxml.jackson.databind.v vVar, com.fasterxml.jackson.databind.h hVar) {
        this.f341665b = vVar;
    }

    @Override // com.fasterxml.jackson.databind.deser.s
    public final Object d(com.fasterxml.jackson.databind.f fVar) throws InvalidNullException {
        int i12 = InvalidNullException.f341915f;
        Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
        com.fasterxml.jackson.databind.v vVar = this.f341665b;
        throw new InvalidNullException(fVar.f341924g, "Invalid `null` value encountered for property ".concat(vVar == null ? "<UNKNOWN>" : String.format("\"%s\"", vVar)));
    }
}
