package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a;

/* compiled from: AbstractSignatureParts.kt */
/* loaded from: classes8.dex */
final class c extends N implements Y41.l<Object, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a<Object> f408326l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a.C11662a f408327m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a<Object> aVar, a.C11662a c11662a) {
        super(1);
        this.f408326l = aVar;
        this.f408327m = c11662a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a r0 = r5.f408327m
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a<java.lang.Object> r1 = r5.f408326l
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.t r1 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.t) r1
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r6 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r6
            boolean r2 = r6 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.g
            if (r2 == 0) goto L15
            r2 = r6
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.g r2 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.g) r2
            boolean r2 = r2.a()
            if (r2 != 0) goto L79
        L15:
            boolean r2 = r6 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e
            kotlin.reflect.jvm.internal.impl.load.java.lazy.h r3 = r1.f408401c
            if (r2 == 0) goto L2f
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c r2 = r3.f408253a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r2 = r2.f408095t
            r2.getClass()
            r2 = r6
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e r2 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e) r2
            boolean r2 = r2.f408125h
            if (r2 != 0) goto L79
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r2 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.f407901g
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r4 = r1.f408402d
            if (r4 == r2) goto L79
        L2f:
            u51.h r0 = r0.f408321a
            if (r0 == 0) goto L7b
            kotlin.reflect.jvm.internal.impl.types.O r0 = (kotlin.reflect.jvm.internal.impl.types.O) r0
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.k.E(r0)
            if (r0 == 0) goto L7b
            kotlin.reflect.jvm.internal.impl.load.java.d r0 = r1.b()
            r0.getClass()
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.builtins.n.a.f407395u
            java.lang.Object r6 = r0.d(r6, r1)
            r1 = 0
            if (r6 != 0) goto L4c
            goto L70
        L4c:
            java.util.ArrayList r6 = r0.a(r6, r1)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L57
            goto L70
        L57:
            java.util.Iterator r6 = r6.iterator()
        L5b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "TYPE"
            boolean r0 = kotlin.jvm.internal.L.f(r0, r2)
            if (r0 == 0) goto L5b
            r1 = 1
        L70:
            if (r1 == 0) goto L7b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c r6 = r3.f408253a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r6 = r6.f408095t
            r6.getClass()
        L79:
            r6 = 1
            goto L7c
        L7b:
            r6 = 0
        L7c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c.invoke(java.lang.Object):java.lang.Object");
    }
}
