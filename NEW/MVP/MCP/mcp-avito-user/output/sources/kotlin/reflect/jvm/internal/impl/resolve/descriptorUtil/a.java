package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.utils.b;

/* loaded from: classes8.dex */
class a implements b.d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f409614a = new a();

    @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
    public final Iterable a(Object obj) {
        int i12 = c.f409615a;
        Collection<? extends InterfaceC42848a> collectionP = ((k0) obj).p();
        ArrayList arrayList = new ArrayList(C42745f0.q(collectionP, 10));
        Iterator<T> it = collectionP.iterator();
        while (it.hasNext()) {
            arrayList.add(((k0) it.next()).n0());
        }
        return arrayList;
    }
}
