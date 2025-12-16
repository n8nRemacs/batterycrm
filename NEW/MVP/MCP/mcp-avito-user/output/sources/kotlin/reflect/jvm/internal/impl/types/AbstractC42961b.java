package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;

/* compiled from: AbstractClassTypeConstructor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42961b extends AbstractC42983j implements q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC42961b(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar) {
        super(pVar);
        if (pVar != null) {
        } else {
            n(0);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void n(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractC42961b.n(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        r6 = true;
     */
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42994t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
            r1 = 0
            if (r0 == 0) goto L6e
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r5.b()
            kotlin.reflect.jvm.internal.impl.name.f r2 = r0.getName()
            kotlin.reflect.jvm.internal.impl.name.f r3 = r6.getName()
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
            r3 = 1
            if (r2 != 0) goto L1a
        L18:
            r6 = r1
            goto L6b
        L1a:
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.f()
            kotlin.reflect.jvm.internal.impl.descriptors.k r6 = r6.f()
        L22:
            if (r0 == 0) goto L6a
            if (r6 == 0) goto L6a
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.E
            if (r2 == 0) goto L2d
            boolean r6 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.E
            goto L6b
        L2d:
            boolean r2 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.E
            if (r2 == 0) goto L32
            goto L18
        L32:
            boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.K
            if (r2 == 0) goto L4d
            boolean r2 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.K
            if (r2 == 0) goto L18
            kotlin.reflect.jvm.internal.impl.descriptors.K r0 = (kotlin.reflect.jvm.internal.impl.descriptors.K) r0
            kotlin.reflect.jvm.internal.impl.name.c r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.descriptors.K r6 = (kotlin.reflect.jvm.internal.impl.descriptors.K) r6
            kotlin.reflect.jvm.internal.impl.name.c r6 = r6.d()
            boolean r6 = kotlin.jvm.internal.L.f(r0, r6)
            if (r6 == 0) goto L18
            goto L6a
        L4d:
            boolean r2 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.K
            if (r2 == 0) goto L52
            goto L18
        L52:
            kotlin.reflect.jvm.internal.impl.name.f r2 = r0.getName()
            kotlin.reflect.jvm.internal.impl.name.f r4 = r6.getName()
            boolean r2 = kotlin.jvm.internal.L.f(r2, r4)
            if (r2 != 0) goto L61
            goto L18
        L61:
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.f()
            kotlin.reflect.jvm.internal.impl.descriptors.k r6 = r6.f()
            goto L22
        L6a:
            r6 = r3
        L6b:
            if (r6 == 0) goto L6e
            r1 = r3
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractC42961b.d(kotlin.reflect.jvm.internal.impl.descriptors.f):boolean");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42983j
    @Y61.l
    public final O f() {
        InterfaceC42851d interfaceC42851dB = b();
        if (interfaceC42851dB == null) {
            kotlin.reflect.jvm.internal.impl.builtins.k.a(108);
            throw null;
        }
        kotlin.reflect.jvm.internal.impl.name.f fVar = kotlin.reflect.jvm.internal.impl.builtins.k.f407311f;
        if (kotlin.reflect.jvm.internal.impl.builtins.k.b(interfaceC42851dB, n.a.f407373b) || kotlin.reflect.jvm.internal.impl.builtins.k.b(interfaceC42851dB, n.a.f407375c)) {
            return null;
        }
        return m().e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42983j
    @Y61.k
    public final Collection<O> g(boolean z12) {
        InterfaceC42882k interfaceC42882kF = b().f();
        if (!(interfaceC42882kF instanceof InterfaceC42851d)) {
            List listEmptyList = Collections.emptyList();
            if (listEmptyList != null) {
                return listEmptyList;
            }
            n(3);
            throw null;
        }
        kotlin.reflect.jvm.internal.impl.utils.f fVar = new kotlin.reflect.jvm.internal.impl.utils.f();
        InterfaceC42851d interfaceC42851d = (InterfaceC42851d) interfaceC42882kF;
        fVar.add(interfaceC42851d.q());
        InterfaceC42851d interfaceC42851dX0 = interfaceC42851d.x0();
        if (z12 && interfaceC42851dX0 != null) {
            fVar.add(interfaceC42851dX0.q());
        }
        return fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.builtins.k m() {
        kotlin.reflect.jvm.internal.impl.builtins.k kVarE = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(b());
        if (kVarE != null) {
            return kVarE;
        }
        n(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    /* renamed from: o */
    public abstract InterfaceC42851d b();
}
