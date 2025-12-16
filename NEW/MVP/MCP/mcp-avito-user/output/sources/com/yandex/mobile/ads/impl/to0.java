package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ni0;
import com.yandex.mobile.ads.impl.qm0;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class to0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final id0 f390259a = new id0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ni0 f390260b = new ni0();

    public interface a {
    }

    public static final class b implements ni0.a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final a f390261a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final AtomicInteger f390262b;

        public b(@Y61.k a aVar, int i12) {
            this.f390261a = aVar;
            this.f390262b = new AtomicInteger(i12);
        }

        @Override // com.yandex.mobile.ads.impl.ni0.a
        public final void a() {
            if (this.f390262b.decrementAndGet() == 0) {
                ((qm0.b) this.f390261a).d();
            }
        }
    }

    public final void a(@Y61.k Context context, @Y61.k uj0 uj0Var, @Y61.k a aVar) {
        Set<rb0> setA = this.f390259a.a(uj0Var);
        v11 v11VarA = q21.b().a(context);
        int iQ2 = v11VarA != null ? v11VarA.q() : 0;
        if (!g7.a(context) || iQ2 == 0 || setA.isEmpty()) {
            ((qm0.b) aVar).d();
            return;
        }
        b bVar = new b(aVar, setA.size());
        Iterator<rb0> it = setA.iterator();
        while (it.hasNext()) {
            this.f390260b.a(context, it.next(), bVar);
        }
    }
}
