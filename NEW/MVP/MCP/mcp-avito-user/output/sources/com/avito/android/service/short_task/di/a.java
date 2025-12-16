package com.avito.android.service.short_task.di;

import com.avito.android.service.short_task.ShortTaskWorker;
import com.avito.android.service.short_task.di.b;
import com.avito.android.service.short_task.g;
import com.avito.android.util.C;
import com.google.common.collect.AbstractC37412t1;
import dagger.internal.e;
import dagger.internal.t;
import java.util.Optional;

/* compiled from: DaggerJobSchedulerComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerJobSchedulerComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.service.short_task.di.b.a
        public final com.avito.android.service.short_task.di.b a(com.avito.android.service.short_task.di.c cVar) {
            return new c(cVar, null);
        }
    }

    /* compiled from: DaggerJobSchedulerComponent.java */
    public static final class c implements com.avito.android.service.short_task.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.service.short_task.di.c f274052a;

        public c(com.avito.android.service.short_task.di.c cVar, C8134a c8134a) {
            this.f274052a = cVar;
        }

        @Override // com.avito.android.service.short_task.di.b
        public final void Mj(ShortTaskWorker shortTaskWorker) {
            com.avito.android.service.short_task.di.c cVar = this.f274052a;
            AbstractC37412t1 abstractC37412t1Wj = cVar.wj();
            t.c(abstractC37412t1Wj);
            shortTaskWorker.f274035a = abstractC37412t1Wj;
            Optional<g> optionalHm = cVar.hm();
            t.c(optionalHm);
            shortTaskWorker.f274036b = optionalHm;
            C cJ2 = cVar.j();
            t.c(cJ2);
            shortTaskWorker.f274037c = cJ2;
        }
    }

    public static b.a a() {
        return new b();
    }
}
