package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import Y61.k;
import androidx.camera.camera2.internal.G;
import f51.InterfaceC40235a;
import i51.InterfaceC41229c;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.H;
import kotlin.reflect.jvm.internal.impl.descriptors.M;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42945d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42954k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42957n;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42953j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42955l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.s;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.t;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.x;
import kotlin.reflect.jvm.internal.impl.storage.f;
import q51.C47206b;

/* compiled from: BuiltInsLoaderImpl.kt */
@s0
/* loaded from: classes8.dex */
public final class c implements kotlin.reflect.jvm.internal.impl.builtins.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f409780b = new e();

    @Override // kotlin.reflect.jvm.internal.impl.builtins.a
    @k
    public final M a(@k f fVar, @k E e12, @k Iterable iterable, @k f51.c cVar, @k InterfaceC40235a interfaceC40235a, boolean z12) {
        Set<kotlin.reflect.jvm.internal.impl.name.c> set = n.f407344q;
        b bVar = new b(1, this.f409780b);
        Set<kotlin.reflect.jvm.internal.impl.name.c> set2 = set;
        ArrayList arrayList = new ArrayList(C42745f0.q(set2, 10));
        for (kotlin.reflect.jvm.internal.impl.name.c cVar2 : set2) {
            a.f409779m.getClass();
            String strA = a.a(cVar2);
            InputStream inputStream = (InputStream) bVar.invoke(strA);
            if (inputStream == null) {
                throw new IllegalStateException(G.f("Resource not found in classpath: ", strA));
            }
            d.f409781n.getClass();
            arrayList.add(d.a.a(cVar2, fVar, e12, inputStream, z12));
        }
        M m12 = new M(arrayList);
        H h12 = new H(fVar, e12);
        InterfaceC42955l.a aVar = InterfaceC42955l.a.f409935a;
        C42957n c42957n = new C42957n(m12);
        a aVar2 = a.f409779m;
        C42945d c42945d = new C42945d(e12, h12, aVar2);
        x.a aVar3 = x.a.f409964a;
        s sVar = s.f409955a;
        InterfaceC41229c.a aVar4 = InterfaceC41229c.a.f398361a;
        t.a aVar5 = t.a.f409956a;
        InterfaceC42953j.f409911a.getClass();
        C42954k c42954k = new C42954k(fVar, e12, aVar, c42957n, c42945d, m12, aVar3, sVar, aVar4, aVar5, iterable, h12, InterfaceC42953j.a.f409913b, interfaceC40235a, cVar, aVar2.f437473a, null, new C47206b(fVar, C42784z0.f406748b), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d) it.next()).F0(c42954k);
        }
        return m12;
    }
}
