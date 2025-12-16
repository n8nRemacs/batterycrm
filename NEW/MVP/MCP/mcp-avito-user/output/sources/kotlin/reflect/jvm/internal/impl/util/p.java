package kotlin.reflect.jvm.internal.impl.util;

import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.util.k;
import kotlin.reflect.jvm.internal.impl.util.r;
import kotlin.reflect.jvm.internal.impl.util.u;

/* compiled from: modifierChecks.kt */
/* loaded from: classes8.dex */
public final class p extends kotlin.reflect.jvm.internal.impl.util.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final p f410302a = new p();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final List<h> f410303b;

    /* compiled from: modifierChecks.kt */
    @s0
    public static final class a extends N implements Y41.l<InterfaceC42905x, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f410304l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(InterfaceC42905x interfaceC42905x) {
            k0 k0Var = (k0) C42745f0.S(interfaceC42905x.g());
            boolean z12 = false;
            if (k0Var != null && !kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.a(k0Var) && k0Var.S() == null) {
                z12 = true;
            }
            p pVar = p.f410302a;
            if (z12) {
                return null;
            }
            return "last parameter should not have a default value or be a vararg";
        }
    }

    /* compiled from: modifierChecks.kt */
    @s0
    public static final class b extends N implements Y41.l<InterfaceC42905x, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f410305l = new b();

        public b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x r8) {
            /*
                Method dump skipped, instructions count: 287
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.p.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: modifierChecks.kt */
    @s0
    public static final class c extends N implements Y41.l<InterfaceC42905x, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f410306l = new c();

        public c() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x r8) {
            /*
                r7 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.x r8 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x) r8
                kotlin.reflect.jvm.internal.impl.descriptors.X r0 = r8.F()
                if (r0 != 0) goto Lc
                kotlin.reflect.jvm.internal.impl.descriptors.X r0 = r8.H()
            Lc:
                kotlin.reflect.jvm.internal.impl.util.p r1 = kotlin.reflect.jvm.internal.impl.util.p.f410302a
                r2 = 0
                r3 = 0
                if (r0 == 0) goto L6b
                kotlin.reflect.jvm.internal.impl.types.O r4 = r8.getReturnType()
                if (r4 == 0) goto L23
                kotlin.reflect.jvm.internal.impl.types.O r5 = r0.getType()
                kotlin.reflect.jvm.internal.impl.types.checker.q r6 = kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42970f.f410097a
                boolean r4 = r6.d(r4, r5)
                goto L24
            L23:
                r4 = r3
            L24:
                if (r4 != 0) goto L6a
                r1.getClass()
                r51.h r0 = r0.getValue()
                boolean r1 = r0 instanceof r51.e
                if (r1 != 0) goto L33
            L31:
                r8 = r3
                goto L68
            L33:
                r51.e r0 = (r51.e) r0
                kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r0.f429619a
                boolean r1 = r0.O()
                if (r1 != 0) goto L3e
                goto L31
            L3e:
                kotlin.reflect.jvm.internal.impl.name.b r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(r0)
                if (r1 != 0) goto L45
                goto L31
            L45:
                kotlin.reflect.jvm.internal.impl.descriptors.E r0 = kotlin.reflect.jvm.internal.impl.resolve.j.d(r0)
                kotlin.reflect.jvm.internal.impl.descriptors.f r0 = kotlin.reflect.jvm.internal.impl.descriptors.C42904w.b(r0, r1)
                boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f0
                if (r1 == 0) goto L54
                kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.f0) r0
                goto L55
            L54:
                r0 = r2
            L55:
                if (r0 != 0) goto L58
                goto L31
            L58:
                kotlin.reflect.jvm.internal.impl.types.O r8 = r8.getReturnType()
                if (r8 == 0) goto L31
                kotlin.reflect.jvm.internal.impl.types.Y r0 = r0.C()
                kotlin.reflect.jvm.internal.impl.types.checker.q r1 = kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42970f.f410097a
                boolean r8 = r1.d(r8, r0)
            L68:
                if (r8 == 0) goto L6b
            L6a:
                r3 = 1
            L6b:
                if (r3 != 0) goto L6f
                java.lang.String r2 = "receiver must be a supertype of the return type"
            L6f:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.p.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.jvm.internal.impl.name.f fVar = q.f410315i;
        k.b bVar = k.b.f410294b;
        h hVar = new h(fVar, new f[]{bVar, new u.a(1)}, (Y41.l) null, 4, (C42822w) null);
        h hVar2 = new h(q.f410316j, new f[]{bVar, new u.a(2)}, a.f410304l);
        kotlin.reflect.jvm.internal.impl.name.f fVar2 = q.f410307a;
        m mVar = m.f410296a;
        u.a aVar = new u.a(2);
        j jVar = j.f410290a;
        Y41.l lVar = null;
        int i12 = 4;
        h hVar3 = new h(fVar2, new f[]{bVar, mVar, aVar, jVar}, lVar, i12, (C42822w) null);
        C42822w c42822w = null;
        Y41.l lVar2 = null;
        int i13 = 4;
        h hVar4 = new h(q.f410308b, new f[]{bVar, mVar, new u.a(3), jVar}, lVar2, i13, c42822w);
        h hVar5 = new h(q.f410309c, new f[]{bVar, mVar, new u.b(), jVar}, lVar, i12, (C42822w) (0 == true ? 1 : 0));
        h hVar6 = new h(q.f410313g, new f[]{bVar}, lVar2, i13, c42822w);
        kotlin.reflect.jvm.internal.impl.name.f fVar3 = q.f410312f;
        u.d dVar = u.d.f410346b;
        r.a aVar2 = r.a.f410333c;
        h hVar7 = new h(fVar3, new f[]{bVar, dVar, mVar, aVar2}, lVar, i12, (C42822w) (0 == true ? 1 : 0));
        kotlin.reflect.jvm.internal.impl.name.f fVar4 = q.f410314h;
        u.c cVar = u.c.f410345b;
        C42822w c42822w2 = null;
        Y41.l lVar3 = null;
        int i14 = 4;
        f410303b = C42745f0.U(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, new h(fVar4, new f[]{bVar, cVar}, lVar2, i13, c42822w), new h(q.f410317k, new f[]{bVar, cVar}, lVar, i12, (C42822w) (0 == true ? 1 : 0)), new h(q.f410318l, new f[]{bVar, cVar, aVar2}, lVar3, i14, c42822w2), new h(q.f410322p, new f[]{bVar, dVar, mVar}, (Y41.l) (0 == true ? 1 : 0), 4, (C42822w) null), new h(q.f410323q, new f[]{bVar, dVar, mVar}, lVar3, i14, c42822w2), new h(q.f410310d, new f[]{k.a.f410293b}, b.f410305l), new h(q.f410311e, new f[]{bVar, r.b.f410335c, dVar, mVar}, lVar3, i14, c42822w2), new h(q.f410326t, new f[]{bVar, dVar, mVar}, (Y41.l) null, 4, (C42822w) null), new h(q.f410325s, new f[]{bVar, cVar}, lVar3, i14, c42822w2), new h(C42745f0.U(q.f410320n, q.f410321o), new f[]{bVar}, c.f410306l), new h(q.f410328v, new f[]{bVar, r.c.f410337c, dVar, mVar}, lVar3, i14, c42822w2), new h(q.f410319m, new f[]{bVar, cVar}, (Y41.l) null, 4, (C42822w) null));
    }
}
