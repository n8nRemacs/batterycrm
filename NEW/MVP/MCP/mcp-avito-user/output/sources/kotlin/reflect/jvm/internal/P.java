package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.Metadata;

/* compiled from: KPropertyImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Field;", "V", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class P extends kotlin.jvm.internal.N implements Y41.a<Field> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N<Object> f407055l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(N<Object> n12) {
        super(0);
        this.f407055l = n12;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    @Override // Y41.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.reflect.Field invoke() {
        /*
            r10 = this;
            kotlin.reflect.jvm.internal.d0 r0 = kotlin.reflect.jvm.internal.d0.f407150a
            kotlin.reflect.jvm.internal.N<java.lang.Object> r1 = r10.f407055l
            kotlin.reflect.jvm.internal.impl.descriptors.U r2 = r1.n()
            r0.getClass()
            kotlin.reflect.jvm.internal.k r0 = kotlin.reflect.jvm.internal.d0.b(r2)
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.AbstractC43002k.c
            r3 = 0
            if (r2 == 0) goto Ld7
            kotlin.reflect.jvm.internal.k$c r0 = (kotlin.reflect.jvm.internal.AbstractC43002k.c) r0
            m51.i r2 = m51.i.f414326a
            r2.getClass()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$h r2 = r0.f410388b
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r4 = r0.f410390d
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.g r5 = r0.f410391e
            r6 = 1
            m51.d$a r4 = m51.i.b(r2, r4, r5, r6)
            if (r4 == 0) goto Le9
            kotlin.reflect.jvm.internal.impl.descriptors.U r0 = r0.f410387a
            r5 = 0
            if (r0 == 0) goto Ld3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r7 = r0.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r8 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.f407409c
            if (r7 != r8) goto L37
        L35:
            r6 = r5
            goto L9f
        L37:
            kotlin.reflect.jvm.internal.impl.descriptors.k r7 = r0.f()
            if (r7 == 0) goto Lcf
            boolean r8 = kotlin.reflect.jvm.internal.impl.resolve.j.l(r7)
            if (r8 == 0) goto L75
            kotlin.reflect.jvm.internal.impl.descriptors.k r8 = r7.f()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r9 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.f407413b
            boolean r9 = kotlin.reflect.jvm.internal.impl.resolve.j.n(r8, r9)
            if (r9 != 0) goto L57
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r9 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.f407415d
            boolean r8 = kotlin.reflect.jvm.internal.impl.resolve.j.n(r8, r9)
            if (r8 == 0) goto L75
        L57:
            kotlin.reflect.jvm.internal.impl.descriptors.d r7 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d) r7
            kotlin.reflect.jvm.internal.impl.builtins.c r8 = kotlin.reflect.jvm.internal.impl.builtins.c.f407192a
            boolean r8 = kotlin.reflect.jvm.internal.impl.resolve.j.l(r7)
            if (r8 == 0) goto L9f
            java.util.LinkedHashSet r8 = kotlin.reflect.jvm.internal.impl.builtins.c.f407193b
            kotlin.reflect.jvm.internal.impl.name.b r7 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(r7)
            if (r7 == 0) goto L6e
            kotlin.reflect.jvm.internal.impl.name.b r7 = r7.f()
            goto L6f
        L6e:
            r7 = r3
        L6f:
            boolean r7 = kotlin.collections.C42745f0.r(r8, r7)
            if (r7 == 0) goto L9f
        L75:
            kotlin.reflect.jvm.internal.impl.descriptors.k r7 = r0.f()
            boolean r7 = kotlin.reflect.jvm.internal.impl.resolve.j.l(r7)
            if (r7 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.descriptors.v r7 = r0.j0()
            if (r7 == 0) goto L93
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r7 = r7.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.c r8 = kotlin.reflect.jvm.internal.impl.load.java.D.f407912b
            boolean r7 = r7.i3(r8)
            if (r7 == 0) goto L93
            r7 = r6
            goto L9d
        L93:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r7 = r0.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.c r8 = kotlin.reflect.jvm.internal.impl.load.java.D.f407912b
            boolean r7 = r7.i3(r8)
        L9d:
            if (r7 == 0) goto L35
        L9f:
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1 = r1.f407038h
            if (r6 != 0) goto Lbe
            boolean r2 = m51.i.d(r2)
            if (r2 == 0) goto Laa
            goto Lbe
        Laa:
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.f()
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
            if (r2 == 0) goto Lb9
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d) r0
            java.lang.Class r0 = kotlin.reflect.jvm.internal.i0.i(r0)
            goto Lc6
        Lb9:
            java.lang.Class r0 = r1.f()
            goto Lc6
        Lbe:
            java.lang.Class r0 = r1.f()
            java.lang.Class r0 = r0.getEnclosingClass()
        Lc6:
            if (r0 == 0) goto Le9
            java.lang.String r1 = r4.f414315a     // Catch: java.lang.NoSuchFieldException -> Le9
            java.lang.reflect.Field r3 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> Le9
            goto Le9
        Lcf:
            kotlin.reflect.jvm.internal.impl.load.java.m.a(r6)
            throw r3
        Ld3:
            kotlin.reflect.jvm.internal.impl.load.java.m.a(r5)
            throw r3
        Ld7:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.AbstractC43002k.a
            if (r1 == 0) goto Le0
            kotlin.reflect.jvm.internal.k$a r0 = (kotlin.reflect.jvm.internal.AbstractC43002k.a) r0
            java.lang.reflect.Field r3 = r0.f410384a
            goto Le9
        Le0:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.AbstractC43002k.b
            if (r1 == 0) goto Le5
            goto Le9
        Le5:
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.AbstractC43002k.d
            if (r0 == 0) goto Lea
        Le9:
            return r3
        Lea:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.P.invoke():java.lang.Object");
    }
}
