package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import Y61.k;
import k51.InterfaceC42521f;
import k51.j;
import k51.v;
import k51.x;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.l;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.m;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.u0;

/* compiled from: JavaTypeResolver.kt */
@s0
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.h f408282a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final m f408283b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f408284c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final u0 f408285d;

    public d(@k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, @k m mVar) {
        this.f408282a = hVar;
        this.f408283b = mVar;
        f fVar = new f();
        this.f408284c = fVar;
        this.f408285d = new u0(fVar, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0131 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132  */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v25, types: [kotlin.reflect.jvm.internal.impl.types.checker.i] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, kotlin.C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.types.Y a(k51.j r23, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r24, kotlin.reflect.jvm.internal.impl.types.Y r25) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.a(k51.j, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a, kotlin.reflect.jvm.internal.impl.types.Y):kotlin.reflect.jvm.internal.impl.types.Y");
    }

    public final q0 b(j jVar) {
        jVar.R();
        throw null;
    }

    @k
    public final J0 c(@k InterfaceC42521f interfaceC42521f, @k a aVar, boolean z12) {
        x xVarL = interfaceC42521f.l();
        v vVar = xVarL instanceof v ? (v) xVarL : null;
        PrimitiveType type = vVar != null ? vVar.getType() : null;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = this.f408282a;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.e eVar = new kotlin.reflect.jvm.internal.impl.load.java.lazy.e(hVar, interfaceC42521f, true);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
        boolean z13 = aVar.f408274g;
        if (type != null) {
            Y yP2 = cVar.f408090o.m().p(type);
            Y y12 = (Y) kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(yP2, new l(yP2.getAnnotations(), eVar));
            return z13 ? y12 : P.c(y12, y12.L0(true));
        }
        O oD2 = d(xVarL, b.a(TypeUsage.f410066c, z13, null, 6));
        if (z13) {
            return cVar.f408090o.m().h(z12 ? Variance.f410071f : Variance.f410069d, oD2, eVar);
        }
        return P.c(cVar.f408090o.m().h(Variance.f410069d, oD2, eVar), cVar.f408090o.m().h(Variance.f410071f, oD2, eVar).L0(true));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.types.O d(@Y61.l k51.x r5, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof k51.v
            kotlin.reflect.jvm.internal.impl.load.java.lazy.h r1 = r4.f408282a
            if (r0 == 0) goto L2a
            k51.v r5 = (k51.v) r5
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r5 = r5.getType()
            if (r5 == 0) goto L1c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c r6 = r1.f408253a
            kotlin.reflect.jvm.internal.impl.descriptors.E r6 = r6.f408090o
            kotlin.reflect.jvm.internal.impl.builtins.k r6 = r6.m()
            kotlin.reflect.jvm.internal.impl.types.Y r5 = r6.r(r5)
            goto Ld9
        L1c:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c r5 = r1.f408253a
            kotlin.reflect.jvm.internal.impl.descriptors.E r5 = r5.f408090o
            kotlin.reflect.jvm.internal.impl.builtins.k r5 = r5.m()
            kotlin.reflect.jvm.internal.impl.types.Y r5 = r5.v()
            goto Ld9
        L2a:
            boolean r0 = r5 instanceof k51.j
            r2 = 0
            if (r0 == 0) goto La2
            k51.j r5 = (k51.j) r5
            boolean r0 = r6.f408274g
            if (r0 != 0) goto L3d
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r0 = kotlin.reflect.jvm.internal.impl.types.TypeUsage.f410065b
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r1 = r6.f408271d
            if (r1 == r0) goto L3d
            r0 = 1
            goto L3e
        L3d:
            r0 = r2
        L3e:
            boolean r1 = r5.S()
            r3 = 0
            if (r1 != 0) goto L5f
            if (r0 != 0) goto L5f
            kotlin.reflect.jvm.internal.impl.types.Y r6 = r4.a(r5, r6, r3)
            if (r6 == 0) goto L4e
            goto L5c
        L4e:
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r6 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.f410152d
            java.lang.String r5 = r5.Q()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            kotlin.reflect.jvm.internal.impl.types.error.f r6 = kotlin.reflect.jvm.internal.impl.types.error.h.b(r6, r5)
        L5c:
            r5 = r6
            goto Ld9
        L5f:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.f408268d
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r0 = r6.f(r0)
            kotlin.reflect.jvm.internal.impl.types.Y r0 = r4.a(r5, r0, r3)
            if (r0 != 0) goto L7a
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r6 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.f410152d
            java.lang.String r5 = r5.Q()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            kotlin.reflect.jvm.internal.impl.types.error.f r5 = kotlin.reflect.jvm.internal.impl.types.error.h.b(r6, r5)
            goto Ld9
        L7a:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r3 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.f408267c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r6 = r6.f(r3)
            kotlin.reflect.jvm.internal.impl.types.Y r6 = r4.a(r5, r6, r0)
            if (r6 != 0) goto L95
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r6 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.f410152d
            java.lang.String r5 = r5.Q()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            kotlin.reflect.jvm.internal.impl.types.error.f r5 = kotlin.reflect.jvm.internal.impl.types.error.h.b(r6, r5)
            goto Ld9
        L95:
            if (r1 == 0) goto L9d
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.i r5 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.i
            r5.<init>(r0, r6, r2)
            goto Ld9
        L9d:
            kotlin.reflect.jvm.internal.impl.types.J0 r5 = kotlin.reflect.jvm.internal.impl.types.P.c(r0, r6)
            goto Ld9
        La2:
            boolean r0 = r5 instanceof k51.InterfaceC42521f
            if (r0 == 0) goto Lad
            k51.f r5 = (k51.InterfaceC42521f) r5
            kotlin.reflect.jvm.internal.impl.types.J0 r5 = r4.c(r5, r6, r2)
            goto Ld9
        Lad:
            boolean r0 = r5 instanceof k51.InterfaceC42514C
            if (r0 == 0) goto Lcb
            k51.C r5 = (k51.InterfaceC42514C) r5
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.H r5 = r5.h()
            if (r5 == 0) goto Lbe
            kotlin.reflect.jvm.internal.impl.types.O r5 = r4.d(r5, r6)
            goto Ld9
        Lbe:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c r5 = r1.f408253a
            kotlin.reflect.jvm.internal.impl.descriptors.E r5 = r5.f408090o
            kotlin.reflect.jvm.internal.impl.builtins.k r5 = r5.m()
            kotlin.reflect.jvm.internal.impl.types.Y r5 = r5.n()
            goto Ld9
        Lcb:
            if (r5 != 0) goto Lda
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c r5 = r1.f408253a
            kotlin.reflect.jvm.internal.impl.descriptors.E r5 = r5.f408090o
            kotlin.reflect.jvm.internal.impl.builtins.k r5 = r5.m()
            kotlin.reflect.jvm.internal.impl.types.Y r5 = r5.n()
        Ld9:
            return r5
        Lda:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported type: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d.d(k51.x, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a):kotlin.reflect.jvm.internal.impl.types.O");
    }
}
