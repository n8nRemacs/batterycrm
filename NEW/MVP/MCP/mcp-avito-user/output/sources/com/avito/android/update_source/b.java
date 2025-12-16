package com.avito.android.update_source;

import Y61.k;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UpdateSourceAnalyticsStartupTask_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/update_source/b;", "Ldagger/internal/h;", "Lcom/avito/android/update_source/UpdateSourceAnalyticsStartupTask;", "a", "_avito_update-source_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements h<UpdateSourceAnalyticsStartupTask> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f306700c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final KG0.b f306701a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final IG0.c f306702b;

    /* compiled from: UpdateSourceAnalyticsStartupTask_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/update_source/b$a;", "", "<init>", "()V", "_avito_update-source_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k KG0.b bVar, @k IG0.c cVar) {
        this.f306701a = bVar;
        this.f306702b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        KG0.a aVar = (KG0.a) this.f306701a.get();
        IG0.a aVar2 = (IG0.a) this.f306702b.get();
        f306700c.getClass();
        return new UpdateSourceAnalyticsStartupTask(aVar, aVar2);
    }
}
