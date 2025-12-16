package org.mockito.internal.stubbing.defaultanswers;

/* compiled from: RetrieveGenericsForDefaultAnswers.java */
/* loaded from: classes7.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final K71.d f421710a = new K71.d();

    /* compiled from: RetrieveGenericsForDefaultAnswers.java */
    public interface a {
        Object a(Class<?> cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[PHI: r0
  0x00c3: PHI (r0v2 java.lang.Class<?>) = (r0v1 java.lang.Class<?>), (r0v11 java.lang.Class<?>), (r0v11 java.lang.Class<?>) binds: [B:3:0x0013, B:22:0x007a, B:41:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(e81.InterfaceC39968b r8, org.mockito.internal.stubbing.defaultanswers.c.a r9) {
        /*
            java.lang.reflect.Method r0 = r8.getMethod()
            java.lang.Class r0 = r0.getReturnType()
            java.lang.reflect.Method r1 = r8.getMethod()
            java.lang.reflect.Type r1 = r1.getGenericReturnType()
            boolean r2 = r1 instanceof java.lang.reflect.TypeVariable
            r3 = 0
            if (r2 == 0) goto Lc3
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.Object r0 = r8.v3()
            e81.h r0 = Y71.h.a(r0)
            h81.a r0 = r0.j0()
            java.lang.Class r0 = r0.d()
            org.mockito.internal.util.reflection.f r0 = org.mockito.internal.util.reflection.f.d(r0)
            java.lang.reflect.Method r2 = r8.getMethod()
            org.mockito.internal.util.reflection.f r0 = r0.j(r2)
            java.lang.Class r0 = r0.f()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r4 = 0
            if (r0 != r2) goto L7a
            java.lang.reflect.Method r0 = r8.getMethod()
            java.lang.reflect.Type[] r0 = r0.getGenericParameterTypes()
            r2 = r4
        L45:
            int r5 = r0.length
            if (r2 >= r5) goto L56
            r5 = r0[r2]
            boolean r6 = r1.equals(r5)
            if (r6 == 0) goto L5d
            java.lang.Object r8 = r8.a1(r2)
            if (r8 != 0) goto L58
        L56:
            r8 = r3
            goto L79
        L58:
            java.lang.Class r8 = r8.getClass()
            goto L79
        L5d:
            boolean r6 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r6 == 0) goto L76
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L76
            java.lang.Object r8 = r8.a1(r2)
            java.lang.Class r8 = r8.getClass()
            goto L79
        L76:
            int r2 = r2 + 1
            goto L45
        L79:
            r0 = r8
        L7a:
            if (r0 == 0) goto Lc3
            org.mockito.internal.stubbing.defaultanswers.e r8 = new org.mockito.internal.stubbing.defaultanswers.e
            r8.<init>()
            java.lang.Object r1 = r8.c(r0)
            if (r1 != 0) goto La5
            r2 = r0
        L88:
            if (r2 == 0) goto La5
            if (r1 != 0) goto La5
            java.lang.Class[] r5 = r2.getInterfaces()
            int r6 = r5.length
            r7 = r4
        L92:
            if (r7 >= r6) goto La0
            r1 = r5[r7]
            java.lang.Object r1 = r8.c(r1)
            if (r1 == 0) goto L9d
            goto La0
        L9d:
            int r7 = r7 + 1
            goto L92
        La0:
            java.lang.Class r2 = r2.getSuperclass()
            goto L88
        La5:
            if (r1 != 0) goto Lc4
            org.mockito.internal.stubbing.defaultanswers.h r8 = new org.mockito.internal.stubbing.defaultanswers.h
            r8.<init>()
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            if (r0 != r8) goto Lb4
            java.lang.String r8 = ""
        Lb2:
            r1 = r8
            goto Lc4
        Lb4:
            boolean r8 = r0.isArray()
            if (r8 == 0) goto Lc3
            java.lang.Class r8 = r0.getComponentType()
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r8, r4)
            goto Lb2
        Lc3:
            r1 = r3
        Lc4:
            if (r1 == 0) goto Lc7
            return r1
        Lc7:
            if (r0 == 0) goto Le0
            K71.d r8 = org.mockito.internal.stubbing.defaultanswers.c.f421710a
            r8.getClass()
            i81.f r8 = Y71.h.f19325a
            i81.f$c r8 = r8.a(r0)
            boolean r8 = r8.a()
            if (r8 != 0) goto Ldb
            return r3
        Ldb:
            java.lang.Object r8 = r9.a(r0)
            return r8
        Le0:
            java.lang.Object r8 = r9.a(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mockito.internal.stubbing.defaultanswers.c.a(e81.b, org.mockito.internal.stubbing.defaultanswers.c$a):java.lang.Object");
    }
}
