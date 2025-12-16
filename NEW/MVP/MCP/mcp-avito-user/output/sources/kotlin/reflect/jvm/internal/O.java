package kotlin.reflect.jvm.internal;

import androidx.media3.common.C23088b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.text.C43059p;
import kotlin.text.InterfaceC43057n;

/* compiled from: KPropertyImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Lkotlin/reflect/jvm/internal/impl/descriptors/U;", "kotlin.jvm.PlatformType", "invoke", "()Lkotlin/reflect/jvm/internal/impl/descriptors/U;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class O extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.jvm.internal.impl.descriptors.U> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N<Object> f407054l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(N<Object> n12) {
        super(0);
        this.f407054l = n12;
    }

    @Override // Y41.a
    public final kotlin.reflect.jvm.internal.impl.descriptors.U invoke() {
        N<Object> n12 = this.f407054l;
        KDeclarationContainerImpl kDeclarationContainerImpl = n12.f407038h;
        kDeclarationContainerImpl.getClass();
        C43059p c43059p = KDeclarationContainerImpl.f407019d;
        String str = n12.f407040j;
        InterfaceC43057n interfaceC43057nD = c43059p.d(str);
        if (interfaceC43057nD != null) {
            String str2 = interfaceC43057nD.c().f410614a.d().get(1);
            kotlin.reflect.jvm.internal.impl.descriptors.U uL2 = kDeclarationContainerImpl.l(Integer.parseInt(str2));
            if (uL2 != null) {
                return uL2;
            }
            StringBuilder sbA = androidx.appcompat.app.r.A("Local property #", str2, " not found in ");
            sbA.append(kDeclarationContainerImpl.f());
            throw new X(sbA.toString());
        }
        String str3 = n12.f407039i;
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.U> collectionP = kDeclarationContainerImpl.p(kotlin.reflect.jvm.internal.impl.name.f.e(str3));
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionP) {
            d0.f407150a.getClass();
            if (kotlin.jvm.internal.L.f(d0.b((kotlin.reflect.jvm.internal.impl.descriptors.U) obj).getF410392f(), str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            StringBuilder sbB = C23088b.b("Property '", str3, "' (JVM signature: ", str, ") not resolved in ");
            sbB.append(kDeclarationContainerImpl);
            throw new X(sbB.toString());
        }
        if (arrayList.size() == 1) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.U) C42745f0.u0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC42900s visibility = ((kotlin.reflect.jvm.internal.impl.descriptors.U) next).getVisibility();
            Object arrayList2 = linkedHashMap.get(visibility);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(visibility, arrayList2);
            }
            ((List) arrayList2).add(next);
        }
        TreeMap treeMap = new TreeMap(new C43013w(C43016z.f410462l));
        treeMap.putAll(linkedHashMap);
        List list = (List) C42745f0.P(treeMap.values());
        if (list.size() == 1) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.U) C42745f0.E(list);
        }
        String strO = C42745f0.O(kDeclarationContainerImpl.p(kotlin.reflect.jvm.internal.impl.name.f.e(str3)), "\n", null, null, C43015y.f410461l, 30);
        StringBuilder sbB2 = C23088b.b("Property '", str3, "' (JVM signature: ", str, ") not resolved in ");
        sbB2.append(kDeclarationContainerImpl);
        sbB2.append(':');
        sbB2.append(strO.length() == 0 ? " no members found" : "\n".concat(strO));
        throw new X(sbB2.toString());
    }
}
