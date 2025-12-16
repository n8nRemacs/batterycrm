package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import java.io.Serializable;

/* compiled from: BasicPolymorphicTypeValidator.java */
/* loaded from: classes4.dex */
public class h extends PolymorphicTypeValidator.a implements Serializable {
    private static final long serialVersionUID = 1;

    /* compiled from: BasicPolymorphicTypeValidator.java */
    public static class a {
    }

    /* compiled from: BasicPolymorphicTypeValidator.java */
    public static abstract class b {
    }

    /* compiled from: BasicPolymorphicTypeValidator.java */
    public static abstract class c {
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.a, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity a(com.fasterxml.jackson.databind.h hVar) {
        Class<?> cls = hVar.f341930b;
        return PolymorphicTypeValidator.Validity.f342137d;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.a, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity b() {
        return PolymorphicTypeValidator.Validity.f342137d;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator.a, com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity c() {
        return PolymorphicTypeValidator.Validity.f342137d;
    }
}
