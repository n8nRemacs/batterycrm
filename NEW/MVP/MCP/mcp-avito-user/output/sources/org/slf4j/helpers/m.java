package org.slf4j.helpers;

import java.io.PrintStream;

/* compiled from: Util.java */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static b f421834a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f421835b = false;

    /* compiled from: Util.java */
    public static final class b extends SecurityManager {
        public b() {
        }

        @Override // java.lang.SecurityManager
        public final Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    public static Class<?> a() {
        int i12;
        b bVar = f421834a;
        if (bVar == null) {
            if (f421835b) {
                bVar = null;
            } else {
                try {
                    bVar = new b();
                } catch (SecurityException unused) {
                    bVar = null;
                }
                f421834a = bVar;
                f421835b = true;
            }
        }
        if (bVar == null) {
            return null;
        }
        Class<?>[] classContext = bVar.getClassContext();
        String name = m.class.getName();
        int i13 = 0;
        while (i13 < classContext.length && !name.equals(classContext[i13].getName())) {
            i13++;
        }
        if (i13 >= classContext.length || (i12 = i13 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i12];
    }

    public static final void b(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void c(String str, Throwable th2) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Reported exception:");
        th2.printStackTrace();
    }
}
