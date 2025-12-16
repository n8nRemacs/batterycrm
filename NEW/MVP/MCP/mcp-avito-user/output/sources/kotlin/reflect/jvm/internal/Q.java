package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.types.G0;

/* compiled from: KPropertyImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Q {
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010e  */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.calls.e a(kotlin.reflect.jvm.internal.N.a r5, boolean r6) throws java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.Q.a(kotlin.reflect.jvm.internal.N$a, boolean):kotlin.reflect.jvm.internal.calls.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.calls.f<java.lang.reflect.Field> b(kotlin.reflect.jvm.internal.N.a<?, ?> r5, boolean r6, java.lang.reflect.Field r7) {
        /*
            kotlin.reflect.jvm.internal.N r0 = r5.s()
            kotlin.reflect.jvm.internal.impl.descriptors.U r0 = r0.n()
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r0.f()
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.j.l(r1)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L15
            goto L38
        L15:
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r1.f()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.f407414c
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.j.n(r1, r2)
            if (r2 != 0) goto L29
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.f407417f
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.j.n(r1, r2)
            if (r1 == 0) goto L42
        L29:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x
            if (r1 == 0) goto L38
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x) r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$h r0 = r0.f409878B
            boolean r0 = m51.i.d(r0)
            if (r0 == 0) goto L38
            goto L42
        L38:
            int r0 = r7.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L7a
        L42:
            if (r6 == 0) goto L5c
            boolean r6 = r5.q()
            if (r6 == 0) goto L55
            kotlin.reflect.jvm.internal.calls.f$f$a r6 = new kotlin.reflect.jvm.internal.calls.f$f$a
            java.lang.Object r5 = d(r5)
            r6.<init>(r7, r5)
            goto Lcf
        L55:
            kotlin.reflect.jvm.internal.calls.f$f$c r6 = new kotlin.reflect.jvm.internal.calls.f$f$c
            r6.<init>(r7, r3, r4)
            goto Lcf
        L5c:
            boolean r6 = r5.q()
            if (r6 == 0) goto L70
            kotlin.reflect.jvm.internal.calls.f$g$a r6 = new kotlin.reflect.jvm.internal.calls.f$g$a
            boolean r0 = c(r5)
            java.lang.Object r5 = d(r5)
            r6.<init>(r7, r0, r5)
            goto Lcf
        L70:
            kotlin.reflect.jvm.internal.calls.f$g$c r6 = new kotlin.reflect.jvm.internal.calls.f$g$c
            boolean r5 = c(r5)
            r6.<init>(r7, r5, r3, r4)
            goto Lcf
        L7a:
            kotlin.reflect.jvm.internal.N r0 = r5.s()
            kotlin.reflect.jvm.internal.impl.descriptors.U r0 = r0.n()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.i0.f407157a
            boolean r0 = r0.i3(r1)
            r1 = 0
            if (r0 == 0) goto Lbe
            if (r6 == 0) goto La4
            boolean r5 = r5.q()
            if (r5 == 0) goto L9e
            kotlin.reflect.jvm.internal.calls.f$f$b r5 = new kotlin.reflect.jvm.internal.calls.f$f$b
            r5.<init>(r7, r1, r4)
        L9c:
            r6 = r5
            goto Lcf
        L9e:
            kotlin.reflect.jvm.internal.calls.f$f$d r5 = new kotlin.reflect.jvm.internal.calls.f$f$d
            r5.<init>(r7, r3, r4)
            goto L9c
        La4:
            boolean r6 = r5.q()
            if (r6 == 0) goto Lb4
            kotlin.reflect.jvm.internal.calls.f$g$b r6 = new kotlin.reflect.jvm.internal.calls.f$g$b
            boolean r5 = c(r5)
            r6.<init>(r7, r5, r1, r4)
            goto Lcf
        Lb4:
            kotlin.reflect.jvm.internal.calls.f$g$d r6 = new kotlin.reflect.jvm.internal.calls.f$g$d
            boolean r5 = c(r5)
            r6.<init>(r7, r5, r3, r4)
            goto Lcf
        Lbe:
            if (r6 == 0) goto Lc6
            kotlin.reflect.jvm.internal.calls.f$f$e r6 = new kotlin.reflect.jvm.internal.calls.f$f$e
            r6.<init>(r7, r1, r4)
            goto Lcf
        Lc6:
            kotlin.reflect.jvm.internal.calls.f$g$e r6 = new kotlin.reflect.jvm.internal.calls.f$g$e
            boolean r5 = c(r5)
            r6.<init>(r7, r5, r1, r4)
        Lcf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.Q.b(kotlin.reflect.jvm.internal.N$a, boolean, java.lang.reflect.Field):kotlin.reflect.jvm.internal.calls.f");
    }

    public static final boolean c(N.a<?, ?> aVar) {
        return !G0.f(aVar.s().n().getType());
    }

    @Y61.l
    public static final Object d(@Y61.k N.a<?, ?> aVar) {
        N<?> nS2 = aVar.s();
        return kotlin.reflect.jvm.internal.calls.l.a(nS2.f407041k, nS2.n());
    }
}
