package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import kotlin.G0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.b;

/* compiled from: MemberComparator.java */
/* loaded from: classes8.dex */
public class l implements Comparator<InterfaceC42882k> {

    /* renamed from: b, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.renderer.c f409644b;

    /* compiled from: MemberComparator.java */
    public static class a implements Y41.l<kotlin.reflect.jvm.internal.impl.renderer.h, G0> {
        @Override // Y41.l
        public final G0 invoke(kotlin.reflect.jvm.internal.impl.renderer.h hVar) {
            kotlin.reflect.jvm.internal.impl.renderer.h hVar2 = hVar;
            hVar2.b();
            hVar2.j();
            hVar2.m(AnnotationArgumentsRenderingPolicy.f409424e);
            hVar2.i(DescriptorRendererModifier.f409430d);
            return G0.f406611a;
        }
    }

    /* compiled from: MemberComparator.java */
    public static class b implements Comparator<InterfaceC42882k> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f409645b = new b();

        @Y61.l
        public static Integer a(InterfaceC42882k interfaceC42882k, InterfaceC42882k interfaceC42882k2) {
            int iB2 = b(interfaceC42882k2) - b(interfaceC42882k);
            if (iB2 != 0) {
                return Integer.valueOf(iB2);
            }
            if (j.m(interfaceC42882k) && j.m(interfaceC42882k2)) {
                return 0;
            }
            int iCompareTo = interfaceC42882k.getName().f409252b.compareTo(interfaceC42882k2.getName().f409252b);
            if (iCompareTo != 0) {
                return Integer.valueOf(iCompareTo);
            }
            return null;
        }

        public static int b(InterfaceC42882k interfaceC42882k) {
            if (j.m(interfaceC42882k)) {
                return 8;
            }
            if (interfaceC42882k instanceof InterfaceC42881j) {
                return 7;
            }
            if (interfaceC42882k instanceof U) {
                return ((U) interfaceC42882k).H() == null ? 6 : 5;
            }
            if (interfaceC42882k instanceof InterfaceC42905x) {
                return ((InterfaceC42905x) interfaceC42882k).H() == null ? 4 : 3;
            }
            if (interfaceC42882k instanceof InterfaceC42851d) {
                return 2;
            }
            return interfaceC42882k instanceof f0 ? 1 : 0;
        }

        @Override // java.util.Comparator
        public final int compare(InterfaceC42882k interfaceC42882k, InterfaceC42882k interfaceC42882k2) {
            Integer numA = a(interfaceC42882k, interfaceC42882k2);
            if (numA != null) {
                return numA.intValue();
            }
            return 0;
        }
    }

    static {
        new l();
        b.k kVar = kotlin.reflect.jvm.internal.impl.renderer.b.f409468a;
        a aVar = new a();
        kVar.getClass();
        f409644b = b.k.a(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x019d  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k r13, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k r14) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.l.compare(java.lang.Object, java.lang.Object):int");
    }
}
