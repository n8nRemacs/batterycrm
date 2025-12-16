package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.F;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.X;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.types.C0;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: ValueClassAwareCaller.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "Lkotlin/reflect/jvm/internal/impl/types/O;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class l {
    @Y61.l
    public static final Object a(@Y61.l Object obj, @Y61.k CallableMemberDescriptor callableMemberDescriptor) {
        O oC2;
        Class<?> clsH;
        return (((callableMemberDescriptor instanceof U) && kotlin.reflect.jvm.internal.impl.resolve.k.d((m0) callableMemberDescriptor)) || (oC2 = c(callableMemberDescriptor)) == null || (clsH = h(oC2)) == null) ? obj : d(clsH, callableMemberDescriptor).invoke(obj, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.calls.e b(@Y61.k kotlin.reflect.jvm.internal.calls.e r3, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x r4, boolean r5) {
        /*
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.k.a(r4)
            if (r0 != 0) goto Lae
            java.util.List r0 = r4.T()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L1b
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1b
            goto L43
        L1b:
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.X r1 = (kotlin.reflect.jvm.internal.impl.descriptors.X) r1
            kotlin.reflect.jvm.internal.impl.types.O r1 = r1.getType()
            kotlin.reflect.jvm.internal.impl.types.q0 r1 = r1.H0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.b()
            if (r1 == 0) goto L3e
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.k.e(r1)
            goto L3f
        L3e:
            r1 = r2
        L3f:
            if (r1 == 0) goto L1f
            goto Lae
        L43:
            java.util.List r0 = r4.g()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L57
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L57
            goto L7e
        L57:
            java.util.Iterator r0 = r0.iterator()
        L5b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.k0) r1
            kotlin.reflect.jvm.internal.impl.types.O r1 = r1.getType()
            kotlin.reflect.jvm.internal.impl.types.q0 r1 = r1.H0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = r1.b()
            if (r1 == 0) goto L7a
            boolean r1 = kotlin.reflect.jvm.internal.impl.resolve.k.e(r1)
            goto L7b
        L7a:
            r1 = r2
        L7b:
            if (r1 == 0) goto L5b
            goto Lae
        L7e:
            kotlin.reflect.jvm.internal.impl.types.O r0 = r4.getReturnType()
            r1 = 1
            if (r0 == 0) goto L98
            kotlin.reflect.jvm.internal.impl.types.q0 r0 = r0.H0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.b()
            if (r0 == 0) goto L94
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.k.b(r0)
            goto L95
        L94:
            r0 = r2
        L95:
            if (r0 != r1) goto L98
            goto Lae
        L98:
            kotlin.reflect.jvm.internal.impl.types.O r0 = c(r4)
            if (r0 == 0) goto Lb4
            kotlin.reflect.jvm.internal.impl.types.q0 r0 = r0.H0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.b()
            if (r0 == 0) goto Lac
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.k.e(r0)
        Lac:
            if (r2 != r1) goto Lb4
        Lae:
            kotlin.reflect.jvm.internal.calls.j r0 = new kotlin.reflect.jvm.internal.calls.j
            r0.<init>(r3, r4, r5)
            r3 = r0
        Lb4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.l.b(kotlin.reflect.jvm.internal.calls.e, kotlin.reflect.jvm.internal.impl.descriptors.x, boolean):kotlin.reflect.jvm.internal.calls.e");
    }

    public static final O c(CallableMemberDescriptor callableMemberDescriptor) {
        X xH2 = callableMemberDescriptor.H();
        X xF2 = callableMemberDescriptor.F();
        if (xH2 != null) {
            return xH2.getType();
        }
        if (xF2 != null) {
            if (callableMemberDescriptor instanceof InterfaceC42881j) {
                return xF2.getType();
            }
            InterfaceC42882k interfaceC42882kF = callableMemberDescriptor.f();
            InterfaceC42851d interfaceC42851d = interfaceC42882kF instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42882kF : null;
            if (interfaceC42851d != null) {
                return interfaceC42851d.q();
            }
        }
        return null;
    }

    @Y61.k
    public static final Method d(@Y61.k Class<?> cls, @Y61.k CallableMemberDescriptor callableMemberDescriptor) {
        try {
            return cls.getDeclaredMethod("unbox-impl", new Class[0]);
        } catch (NoSuchMethodException unused) {
            throw new kotlin.reflect.jvm.internal.X("No unbox method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    @Y61.l
    public static final ArrayList e(@Y61.k Y y12) {
        ArrayList arrayListF = f(C0.a(y12));
        if (arrayListF == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListF, 10));
        Iterator it = arrayListF.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        Class<?> clsI = i0.i((InterfaceC42851d) y12.H0().b());
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(clsI.getDeclaredMethod((String) it2.next(), new Class[0]));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static final ArrayList f(Y y12) {
        ?? SingletonList;
        ArrayList arrayList = null;
        if (kotlin.reflect.jvm.internal.impl.resolve.k.f(y12)) {
            InterfaceC42851d interfaceC42851d = (InterfaceC42851d) y12.H0().b();
            int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
            kotlin.reflect.jvm.internal.impl.descriptors.i0<Y> i0VarI = interfaceC42851d.I();
            ArrayList<Q> arrayList2 = (i0VarI instanceof F ? (F) i0VarI : null).f407422a;
            arrayList = new ArrayList();
            for (Q q12 : arrayList2) {
                kotlin.reflect.jvm.internal.impl.name.f fVar = (kotlin.reflect.jvm.internal.impl.name.f) q12.f406619b;
                ArrayList arrayListF = f((Y) q12.f406620c);
                if (arrayListF != null) {
                    SingletonList = new ArrayList(C42745f0.q(arrayListF, 10));
                    Iterator it = arrayListF.iterator();
                    while (it.hasNext()) {
                        SingletonList.add(fVar.c() + '-' + ((String) it.next()));
                    }
                } else {
                    SingletonList = Collections.singletonList(fVar.c());
                }
                C42745f0.h((Iterable) SingletonList, arrayList);
            }
        }
        return arrayList;
    }

    @Y61.l
    public static final Class<?> g(@Y61.l InterfaceC42882k interfaceC42882k) {
        if (!(interfaceC42882k instanceof InterfaceC42851d) || !kotlin.reflect.jvm.internal.impl.resolve.k.b(interfaceC42882k)) {
            return null;
        }
        InterfaceC42851d interfaceC42851d = (InterfaceC42851d) interfaceC42882k;
        Class<?> clsI = i0.i(interfaceC42851d);
        if (clsI != null) {
            return clsI;
        }
        throw new kotlin.reflect.jvm.internal.X("Class object for the class " + interfaceC42851d.getName() + " cannot be found (classId=" + kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f((InterfaceC42853f) interfaceC42882k) + ')');
    }

    public static final Class<?> h(O o12) {
        Class<?> clsG = g(o12.H0().b());
        if (clsG == null) {
            return null;
        }
        if (!G0.f(o12)) {
            return clsG;
        }
        Y yG2 = kotlin.reflect.jvm.internal.impl.resolve.k.g(o12);
        if (yG2 == null || G0.f(yG2) || kotlin.reflect.jvm.internal.impl.builtins.k.F(yG2)) {
            return null;
        }
        return clsG;
    }
}
