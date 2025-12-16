package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.AbstractC36462a;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashSet;

/* compiled from: DefaultAccessorNamingStrategy.java */
/* loaded from: classes4.dex */
public class y extends AbstractC36462a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f342102b;

    /* renamed from: c, reason: collision with root package name */
    public final String f342103c;

    /* renamed from: d, reason: collision with root package name */
    public final String f342104d;

    /* renamed from: e, reason: collision with root package name */
    public final String f342105e;

    /* compiled from: DefaultAccessorNamingStrategy.java */
    public interface a {
    }

    /* compiled from: DefaultAccessorNamingStrategy.java */
    public static class b implements a {
    }

    /* compiled from: DefaultAccessorNamingStrategy.java */
    public static class c extends AbstractC36462a.b implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final String f342106b = "set";

        /* renamed from: c, reason: collision with root package name */
        public final String f342107c = "with";

        /* renamed from: d, reason: collision with root package name */
        public final String f342108d = "get";

        /* renamed from: e, reason: collision with root package name */
        public final String f342109e = "is";
    }

    /* compiled from: DefaultAccessorNamingStrategy.java */
    public static class d extends y {

        /* renamed from: f, reason: collision with root package name */
        public final HashSet f342110f;

        public d(com.fasterxml.jackson.databind.cfg.m mVar, C36465d c36465d) {
            super(mVar, null, "get", "is");
            this.f342110f = new HashSet();
            for (String str : com.fasterxml.jackson.databind.jdk14.a.b(c36465d.f342008c)) {
                this.f342110f.add(str);
            }
        }

        @Override // com.fasterxml.jackson.databind.introspect.y, com.fasterxml.jackson.databind.introspect.AbstractC36462a
        public final String c(C36472k c36472k, String str) {
            return this.f342110f.contains(str) ? str : super.c(c36472k, str);
        }
    }

    public y(com.fasterxml.jackson.databind.cfg.m mVar, String str, String str2, String str3) {
        this.f342102b = mVar.k(MapperFeature.USE_STD_BEAN_NAMING);
        this.f342105e = str;
        this.f342103c = str2;
        this.f342104d = str3;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36462a
    public final String a(C36472k c36472k, String str) {
        String str2 = this.f342104d;
        if (str2 == null) {
            return null;
        }
        Class<?> returnType = c36472k.f342054e.getReturnType();
        if ((returnType == Boolean.class || returnType == Boolean.TYPE) && str.startsWith(str2)) {
            return this.f342102b ? f(2, str) : e(2, str);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36462a
    public final String b(String str) {
        String str2 = this.f342105e;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        return this.f342102b ? f(str2.length(), str) : e(str2.length(), str);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36462a
    public String c(C36472k c36472k, String str) {
        String str2 = this.f342103c;
        if (str2 == null || !str.startsWith(str2)) {
            return null;
        }
        boolean zEquals = "getCallbacks".equals(str);
        Method method = c36472k.f342054e;
        if (zEquals) {
            Class<?> returnType = method.getReturnType();
            if (returnType.isArray()) {
                String name = returnType.getComponentType().getName();
                if (name.contains(".cglib") && (name.startsWith("net.sf.cglib") || name.startsWith("org.hibernate.repackage.cglib") || name.startsWith("org.springframework.cglib"))) {
                    return null;
                }
            }
        } else if ("getMetaClass".equals(str) && method.getReturnType().getName().startsWith("groovy.lang")) {
            return null;
        }
        return this.f342102b ? f(str2.length(), str) : e(str2.length(), str);
    }

    public final String e(int i12, String str) {
        int length = str.length();
        if (length == i12) {
            return null;
        }
        char cCharAt = str.charAt(i12);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i12);
        }
        StringBuilder sb2 = new StringBuilder(length - i12);
        sb2.append(lowerCase);
        while (true) {
            i12++;
            if (i12 >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i12);
            char lowerCase2 = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase2) {
                sb2.append((CharSequence) str, i12, length);
                break;
            }
            sb2.append(lowerCase2);
        }
        return sb2.toString();
    }

    public final String f(int i12, String str) {
        int length = str.length();
        if (length == i12) {
            return null;
        }
        char cCharAt = str.charAt(i12);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i12);
        }
        int i13 = i12 + 1;
        if (i13 < length && Character.isUpperCase(str.charAt(i13))) {
            return str.substring(i12);
        }
        StringBuilder sb2 = new StringBuilder(length - i12);
        sb2.append(lowerCase);
        sb2.append((CharSequence) str, i13, length);
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36462a
    public final String d(String str) {
        return str;
    }
}
