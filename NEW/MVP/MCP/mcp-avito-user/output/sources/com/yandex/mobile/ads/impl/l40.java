package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class l40 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final i40 f387375a;

    public interface a {
    }

    public static final class b implements yy0<p60> {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final AtomicInteger f387376a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final a f387377b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final ArrayList f387378c;

        public /* synthetic */ b(int i12, a aVar, int i13) {
            this(i12, aVar);
        }

        @Override // com.yandex.mobile.ads.impl.yy0
        public final void a(@j.N p60 p60Var) {
            this.f387378c.add(p60Var);
            if (this.f387376a.decrementAndGet() == 0) {
                ((c50) this.f387377b).a(this.f387378c);
            }
        }

        private b(int i12, @j.N a aVar) {
            this.f387376a = new AtomicInteger(i12);
            this.f387377b = aVar;
            this.f387378c = new ArrayList();
        }

        @Override // com.yandex.mobile.ads.impl.yy0
        public final void a(@j.N ye1 ye1Var) {
            if (this.f387376a.decrementAndGet() == 0) {
                ((c50) this.f387377b).a(this.f387378c);
            }
        }
    }

    public l40(@j.N kf1 kf1Var) {
        this.f387375a = new i40(kf1Var);
    }

    public final void a(@j.N Context context, @j.N ArrayList arrayList, @j.N a aVar) {
        b bVar = new b(arrayList.size(), aVar, 0);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f387375a.a(context, (C39366t1) it.next(), bVar);
        }
    }
}
