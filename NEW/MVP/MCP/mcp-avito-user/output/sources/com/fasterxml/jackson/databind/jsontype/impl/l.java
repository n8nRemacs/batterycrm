package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;

/* compiled from: LaissezFaireSubTypeValidator.java */
/* loaded from: classes4.dex */
public final class l extends PolymorphicTypeValidator.a {

    /* renamed from: b, reason: collision with root package name */
    public static final l f342149b = new l();
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.a, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity a(com.fasterxml.jackson.databind.h hVar) {
        return PolymorphicTypeValidator.Validity.f342137d;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.a, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity b() {
        return PolymorphicTypeValidator.Validity.f342135b;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.a, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity c() {
        return PolymorphicTypeValidator.Validity.f342135b;
    }
}
