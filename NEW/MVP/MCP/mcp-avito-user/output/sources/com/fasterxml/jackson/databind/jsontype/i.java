package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import java.io.Closeable;
import java.io.Serializable;
import java.util.HashSet;

/* compiled from: DefaultBaseTypeLimitingValidator.java */
/* loaded from: classes4.dex */
public class i extends PolymorphicTypeValidator implements Serializable {
    private static final long serialVersionUID = 1;

    /* compiled from: DefaultBaseTypeLimitingValidator.java */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f342139b = new a();

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f342140a;

        public a() {
            HashSet hashSet = new HashSet();
            this.f342140a = hashSet;
            hashSet.add(Object.class.getName());
            hashSet.add(Closeable.class.getName());
            hashSet.add(Serializable.class.getName());
            hashSet.add(AutoCloseable.class.getName());
            hashSet.add(Cloneable.class.getName());
            hashSet.add("java.util.logging.Handler");
            hashSet.add("javax.naming.Referenceable");
            hashSet.add("javax.sql.DataSource");
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity a(com.fasterxml.jackson.databind.h hVar) {
        return a.f342139b.f342140a.contains(hVar.f341930b.getName()) ? PolymorphicTypeValidator.Validity.f342136c : PolymorphicTypeValidator.Validity.f342137d;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity b() {
        return PolymorphicTypeValidator.Validity.f342137d;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
    public final PolymorphicTypeValidator.Validity c() {
        return PolymorphicTypeValidator.Validity.f342135b;
    }
}
