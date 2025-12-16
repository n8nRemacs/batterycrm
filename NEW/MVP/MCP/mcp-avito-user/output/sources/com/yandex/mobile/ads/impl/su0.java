package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdRequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class su0<T, V> {

    /* renamed from: a, reason: collision with root package name */
    private final int f390028a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ArrayList f390029b;

    public static final class a<T, V> {

        /* renamed from: a, reason: collision with root package name */
        private final T f390030a;

        /* renamed from: b, reason: collision with root package name */
        private final V f390031b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(AdRequestConfiguration adRequestConfiguration, Object obj) {
            this.f390030a = adRequestConfiguration;
            this.f390031b = obj;
        }

        public final V a() {
            return this.f390031b;
        }

        public final T b() {
            return this.f390030a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f390030a, aVar.f390030a) && kotlin.jvm.internal.L.f(this.f390031b, aVar.f390031b);
        }

        public final int hashCode() {
            T t12 = this.f390030a;
            int iHashCode = (t12 == null ? 0 : t12.hashCode()) * 31;
            V v12 = this.f390031b;
            return iHashCode + (v12 != null ? v12.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sbA = Cif.a("CachedItem(params=");
            sbA.append(this.f390030a);
            sbA.append(", item=");
            return androidx.compose.foundation.H.n(sbA, this.f390031b, ')');
        }
    }

    public /* synthetic */ su0() {
        this(5);
    }

    public final synchronized void a(AdRequestConfiguration adRequestConfiguration, Object obj) {
        if (this.f390029b.size() <= this.f390028a) {
            this.f390029b.add(new a(adRequestConfiguration, obj));
        }
    }

    public su0(int i12) {
        this.f390028a = i12;
        this.f390029b = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.l
    public final synchronized V a(T t12) {
        V v12;
        Object next;
        Object objA;
        try {
            Iterator it = this.f390029b.iterator();
            while (true) {
                v12 = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.L.f(((a) next).b(), t12)) {
                    break;
                }
            }
            a aVar = (a) next;
            if (aVar != null && (objA = aVar.a()) != 0) {
                this.f390029b.remove(aVar);
                v12 = objA;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return v12;
    }
}
