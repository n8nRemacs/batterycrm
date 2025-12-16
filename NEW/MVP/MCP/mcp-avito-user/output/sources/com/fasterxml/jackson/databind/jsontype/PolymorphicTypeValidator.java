package com.fasterxml.jackson.databind.jsontype;

import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class PolymorphicTypeValidator implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Validity {

        /* renamed from: b, reason: collision with root package name */
        public static final Validity f342135b;

        /* renamed from: c, reason: collision with root package name */
        public static final Validity f342136c;

        /* renamed from: d, reason: collision with root package name */
        public static final Validity f342137d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Validity[] f342138e;

        static {
            Validity validity = new Validity("ALLOWED", 0);
            f342135b = validity;
            Validity validity2 = new Validity("DENIED", 1);
            f342136c = validity2;
            Validity validity3 = new Validity("INDETERMINATE", 2);
            f342137d = validity3;
            f342138e = new Validity[]{validity, validity2, validity3};
        }

        public Validity() {
            throw null;
        }

        public static Validity valueOf(String str) {
            return (Validity) Enum.valueOf(Validity.class, str);
        }

        public static Validity[] values() {
            return (Validity[]) f342138e.clone();
        }
    }

    public static abstract class a extends PolymorphicTypeValidator implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
        public Validity a(com.fasterxml.jackson.databind.h hVar) {
            return Validity.f342137d;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
        public Validity b() {
            return Validity.f342137d;
        }

        @Override // com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator
        public Validity c() {
            return Validity.f342137d;
        }
    }

    public abstract Validity a(com.fasterxml.jackson.databind.h hVar);

    public abstract Validity b();

    public abstract Validity c();
}
