package com.avito.security;

import shark.AndroidResourceIdNames;

/* loaded from: classes5.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final n1 f338615a;

    static {
        n1 n1Var;
        int iA2 = a();
        if (iA2 >= 65544) {
            try {
                try {
                    Object objNewInstance = a1.class.newInstance();
                    y0.a(objNewInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    try {
                        if (objNewInstance == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        n1Var = (n1) objNewInstance;
                    } catch (ClassCastException e12) {
                        Throwable thInitCause = new ClassCastException("Instance classloader: " + objNewInstance.getClass().getClassLoader() + ", base type classloader: " + n1.class.getClassLoader()).initCause(e12);
                        y0.a((Object) thInitCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw thInitCause;
                    }
                } catch (ClassNotFoundException unused) {
                    Object objNewInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    y0.a(objNewInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    try {
                        if (objNewInstance2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        n1Var = (n1) objNewInstance2;
                    } catch (ClassCastException e13) {
                        Throwable thInitCause2 = new ClassCastException("Instance classloader: " + objNewInstance2.getClass().getClassLoader() + ", base type classloader: " + n1.class.getClassLoader()).initCause(e13);
                        y0.a((Object) thInitCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw thInitCause2;
                    }
                }
            } catch (ClassNotFoundException unused2) {
            }
        } else if (iA2 >= 65543) {
            try {
                Object objNewInstance3 = z0.class.newInstance();
                y0.a(objNewInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    try {
                        if (objNewInstance3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        n1Var = (n1) objNewInstance3;
                    } catch (ClassCastException e14) {
                        Throwable thInitCause3 = new ClassCastException("Instance classloader: " + objNewInstance3.getClass().getClassLoader() + ", base type classloader: " + n1.class.getClassLoader()).initCause(e14);
                        y0.a((Object) thInitCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw thInitCause3;
                    }
                } catch (ClassNotFoundException unused3) {
                }
            } catch (ClassNotFoundException unused4) {
                Object objNewInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                y0.a(objNewInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                try {
                    if (objNewInstance4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    n1Var = (n1) objNewInstance4;
                } catch (ClassCastException e15) {
                    Throwable thInitCause4 = new ClassCastException("Instance classloader: " + objNewInstance4.getClass().getClassLoader() + ", base type classloader: " + n1.class.getClassLoader()).initCause(e15);
                    y0.a((Object) thInitCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw thInitCause4;
                }
            }
        } else {
            n1Var = new n1();
        }
        f338615a = n1Var;
    }

    private static final int a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int iA2 = o2.a((CharSequence) property, '.', 0, false, 6, (Object) null);
        if (iA2 < 0) {
            try {
                return Integer.parseInt(property) * AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i12 = iA2 + 1;
        int iA3 = o2.a((CharSequence) property, '.', i12, false, 4, (Object) null);
        if (iA3 < 0) {
            iA3 = property.length();
        }
        String strSubstring = property.substring(0, iA2);
        y0.a((Object) strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String strSubstring2 = property.substring(i12, iA3);
        y0.a((Object) strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(strSubstring) * AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) + Integer.parseInt(strSubstring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}
