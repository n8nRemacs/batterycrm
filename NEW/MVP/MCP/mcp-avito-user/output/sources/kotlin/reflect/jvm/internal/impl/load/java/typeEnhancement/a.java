package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.load.java.A;
import kotlin.reflect.jvm.internal.impl.load.java.C42911d;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42966b;
import u51.InterfaceC48806h;

/* compiled from: AbstractSignatureParts.kt */
@s0
/* loaded from: classes8.dex */
public abstract class a<TAnnotation> {

    /* compiled from: AbstractSignatureParts.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a, reason: collision with other inner class name */
    public static final class C11662a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final InterfaceC48806h f408321a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final A f408322b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final u51.n f408323c;

        public C11662a(@Y61.l InterfaceC48806h interfaceC48806h, @Y61.l A a12, @Y61.l u51.n nVar) {
            this.f408321a = interfaceC48806h;
            this.f408322b = a12;
            this.f408323c = nVar;
        }
    }

    public static void a(Object obj, ArrayList arrayList, Y41.l lVar) {
        arrayList.add(obj);
        Iterable<? extends C11662a> iterableInvoke = ((d) lVar).invoke(obj);
        if (iterableInvoke != null) {
            Iterator<? extends C11662a> it = iterableInvoke.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, lVar);
            }
        }
    }

    @Y61.k
    public abstract C42911d b();

    @Y61.k
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.annotations.g c(@Y61.k InterfaceC48806h interfaceC48806h);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8  */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j d(u51.n r6) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a.d(u51.n):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j");
    }

    @Y61.l
    public abstract A e();

    @Y61.l
    public abstract O f(@Y61.k InterfaceC48806h interfaceC48806h);

    public final NullabilityQualifier g(InterfaceC48806h interfaceC48806h) {
        kotlin.reflect.jvm.internal.impl.types.checker.u uVarI = i();
        if (InterfaceC42966b.a.F(uVarI.i(interfaceC48806h))) {
            return NullabilityQualifier.f408312c;
        }
        if (InterfaceC42966b.a.F(uVarI.i0(interfaceC48806h))) {
            return null;
        }
        return NullabilityQualifier.f408313d;
    }

    public abstract boolean h();

    @Y61.k
    public abstract kotlin.reflect.jvm.internal.impl.types.checker.u i();

    public abstract boolean j(@Y61.k u51.n nVar);

    public final ArrayList k(InterfaceC48806h interfaceC48806h) {
        kotlin.reflect.jvm.internal.impl.types.checker.u uVarI = i();
        C11662a c11662a = new C11662a(interfaceC48806h, b().b(e(), c(interfaceC48806h)), null);
        d dVar = new d(this, uVarI);
        ArrayList arrayList = new ArrayList(1);
        a(c11662a, arrayList, dVar);
        return arrayList;
    }
}
