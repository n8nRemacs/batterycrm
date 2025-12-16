package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* loaded from: classes8.dex */
public final class H<T> implements G<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f407951b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.name.c, T> f407952c = new kotlin.reflect.jvm.internal.impl.storage.f("Java nullability annotation states").b(new a(this));

    /* compiled from: JavaNullabilityAnnotationSettings.kt */
    public static final class a extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.c, T> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ H<T> f407953l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(H<T> h12) {
            super(1);
            this.f407953l = h12;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
        @Override // Y41.l
        public final Object invoke(kotlin.reflect.jvm.internal.impl.name.c cVar) {
            T next;
            kotlin.reflect.jvm.internal.impl.name.c cVar2 = cVar;
            ?? r02 = this.f407953l.f407951b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = r02.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                kotlin.reflect.jvm.internal.impl.name.c cVar3 = (kotlin.reflect.jvm.internal.impl.name.c) entry.getKey();
                if (!cVar2.equals(cVar3)) {
                    if (L.f(cVar2.d() ? null : cVar2.e(), cVar3)) {
                    }
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            if (linkedHashMap.isEmpty()) {
                linkedHashMap = null;
            }
            if (linkedHashMap == null) {
                return null;
            }
            Iterator<T> it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int length = kotlin.reflect.jvm.internal.impl.name.e.b((kotlin.reflect.jvm.internal.impl.name.c) ((Map.Entry) next).getKey(), cVar2).b().length();
                    do {
                        T next2 = it2.next();
                        int length2 = kotlin.reflect.jvm.internal.impl.name.e.b((kotlin.reflect.jvm.internal.impl.name.c) ((Map.Entry) next2).getKey(), cVar2).b().length();
                        if (length > length2) {
                            next = next2;
                            length = length2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            Map.Entry entry2 = (Map.Entry) next;
            if (entry2 != null) {
                return entry2.getValue();
            }
            return null;
        }
    }

    public H(@Y61.k Map<kotlin.reflect.jvm.internal.impl.name.c, ? extends T> map) {
        this.f407951b = map;
    }
}
