package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;

/* compiled from: AccessorNamingStrategy.java */
/* renamed from: com.fasterxml.jackson.databind.introspect.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC36462a {

    /* compiled from: AccessorNamingStrategy.java */
    /* renamed from: com.fasterxml.jackson.databind.introspect.a$b */
    public static abstract class b implements Serializable {
        private static final long serialVersionUID = 1;
    }

    public abstract String a(C36472k c36472k, String str);

    public abstract String b(String str);

    public abstract String c(C36472k c36472k, String str);

    public abstract String d(String str);

    /* compiled from: AccessorNamingStrategy.java */
    /* renamed from: com.fasterxml.jackson.databind.introspect.a$a, reason: collision with other inner class name */
    public static class C10546a extends AbstractC36462a implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.introspect.AbstractC36462a
        public final String a(C36472k c36472k, String str) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AbstractC36462a
        public final String b(String str) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AbstractC36462a
        public final String c(C36472k c36472k, String str) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AbstractC36462a
        public final String d(String str) {
            return str;
        }
    }
}
