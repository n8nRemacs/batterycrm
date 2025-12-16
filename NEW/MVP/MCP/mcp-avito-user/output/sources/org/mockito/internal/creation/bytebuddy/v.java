package org.mockito.internal.creation.bytebuddy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: StackWalkerChecker.java */
/* loaded from: classes7.dex */
class v implements Predicate<Class<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Method f421594a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f421595b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f421596c;

    /* renamed from: d, reason: collision with root package name */
    public final Enum<?> f421597d;

    public v() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.StackWalker");
        Class<?> cls2 = Class.forName("java.lang.StackWalker$Option");
        this.f421594a = cls.getMethod("getInstance", cls2);
        this.f421595b = cls.getMethod("walk", Function.class);
        this.f421596c = Class.forName("java.lang.StackWalker$StackFrame").getMethod("getDeclaringClass", new Class[0]);
        this.f421597d = Enum.valueOf(cls2, "RETAIN_CLASS_REFERENCE");
    }

    @Override // java.util.function.Predicate
    public final boolean test(Class<?> cls) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        final Class<?> cls2 = cls;
        try {
            return ((Boolean) this.f421595b.invoke(this.f421594a.invoke(null, this.f421597d), new Function() { // from class: org.mockito.internal.creation.bytebuddy.u
                /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
                
                    r5 = (java.lang.Class) r0.invoke(r5.next(), new java.lang.Object[0]);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
                
                    r0 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
                
                    if (r0 == r5) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
                
                    if (r0.isAssignableFrom(r5) == false) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
                
                    return java.lang.Boolean.TRUE;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
                
                    if (r5.hasNext() == false) goto L18;
                 */
                @Override // java.util.function.Function
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r5) {
                    /*
                        r4 = this;
                        org.mockito.internal.creation.bytebuddy.v r0 = r4.f421592a
                        java.lang.reflect.Method r0 = r0.f421596c
                        java.util.stream.Stream r5 = (java.util.stream.Stream) r5
                        java.util.Iterator r5 = r5.iterator()
                    La:
                        boolean r1 = r5.hasNext()
                        if (r1 == 0) goto L4c
                        java.lang.Object r1 = r5.next()     // Catch: java.lang.Exception -> L49
                        r2 = 0
                        java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L49
                        java.lang.Object r1 = r0.invoke(r1, r3)     // Catch: java.lang.Exception -> L49
                        java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Exception -> L49
                        java.lang.String r1 = r1.getName()     // Catch: java.lang.Exception -> L49
                        java.lang.String r3 = "org.mockito.internal."
                        boolean r1 = r1.startsWith(r3)     // Catch: java.lang.Exception -> L49
                        if (r1 == 0) goto L2a
                        goto La
                    L2a:
                        boolean r1 = r5.hasNext()     // Catch: java.lang.Exception -> L49
                        if (r1 == 0) goto L4c
                        java.lang.Object r5 = r5.next()     // Catch: java.lang.Exception -> L49
                        java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L49
                        java.lang.Object r5 = r0.invoke(r5, r1)     // Catch: java.lang.Exception -> L49
                        java.lang.Class r5 = (java.lang.Class) r5     // Catch: java.lang.Exception -> L49
                        java.lang.Class r0 = r2
                        if (r0 == r5) goto L4c
                        boolean r5 = r0.isAssignableFrom(r5)     // Catch: java.lang.Exception -> L49
                        if (r5 == 0) goto L4c
                        java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L49
                        goto L4e
                    L49:
                        java.lang.Boolean r5 = java.lang.Boolean.FALSE
                        goto L4e
                    L4c:
                        java.lang.Boolean r5 = java.lang.Boolean.FALSE
                    L4e:
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: org.mockito.internal.creation.bytebuddy.u.apply(java.lang.Object):java.lang.Object");
                }
            })).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
