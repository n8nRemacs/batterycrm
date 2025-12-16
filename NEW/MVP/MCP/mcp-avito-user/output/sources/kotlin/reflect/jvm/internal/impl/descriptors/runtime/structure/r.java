package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.internal.N;

/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes8.dex */
final class r extends N implements Y41.l<Method, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f407869l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar) {
        super(1);
        this.f407869l = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(java.lang.reflect.Method r5) {
        /*
            r4 = this;
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r0 = r5.isSynthetic()
            r1 = 0
            if (r0 == 0) goto La
            goto L45
        La:
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t r0 = r4.f407869l
            java.lang.Class<?> r0 = r0.f407871a
            boolean r0 = r0.isEnum()
            r2 = 1
            if (r0 == 0) goto L44
            java.lang.String r0 = r5.getName()
            java.lang.String r3 = "values"
            boolean r3 = kotlin.jvm.internal.L.f(r0, r3)
            if (r3 == 0) goto L2c
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r5 = r5.length
            if (r5 != 0) goto L2a
            r5 = r2
            goto L42
        L2a:
            r5 = r1
            goto L42
        L2c:
            java.lang.String r3 = "valueOf"
            boolean r0 = kotlin.jvm.internal.L.f(r0, r3)
            if (r0 == 0) goto L2a
            java.lang.Class[] r5 = r5.getParameterTypes()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            boolean r5 = java.util.Arrays.equals(r5, r0)
        L42:
            if (r5 != 0) goto L45
        L44:
            r1 = r2
        L45:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.r.invoke(java.lang.Object):java.lang.Object");
    }
}
