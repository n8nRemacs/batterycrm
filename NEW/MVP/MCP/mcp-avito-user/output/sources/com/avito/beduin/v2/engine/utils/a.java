package com.avito.beduin.v2.engine.utils;

import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.core.M;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: WeakReferences.jvm.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/engine/utils/a;", "", "T", "Lcom/avito/beduin/v2/engine/utils/h;", "<init>", "()V", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashSet f336909a = new LinkedHashSet();

    /* compiled from: WeakReferences.jvm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/utils/a$a;", "", "K", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.engine.utils.a$a, reason: collision with other inner class name */
    public static final class C10442a<K> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final WeakReference<K> f336910a;

        /* renamed from: b, reason: collision with root package name */
        public final int f336911b;

        public C10442a(@k M m12) {
            this.f336910a = new WeakReference<>(m12);
            this.f336911b = m12.hashCode();
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return L.f(this.f336910a.get(), ((C10442a) obj).f336910a.get());
        }

        /* renamed from: hashCode, reason: from getter */
        public final int getF336911b() {
            return this.f336911b;
        }
    }

    public final boolean a(@k T t12) {
        return this.f336909a.add(new C10442a((M) t12));
    }

    public final boolean b(@k T t12) {
        return this.f336909a.remove(new C10442a((M) t12));
    }

    @k
    public final Set<T> c() {
        LinkedHashSet linkedHashSet = this.f336909a;
        ArrayList arrayList = new ArrayList();
        for (T t12 : linkedHashSet) {
            if (((C10442a) t12).f336910a.get() == null) {
                arrayList.add(t12);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.remove((C10442a) it.next());
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(linkedHashSet, 10));
        Iterator<T> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C10442a) it2.next()).f336910a.get());
        }
        return C42745f0.P0(arrayList2);
    }
}
