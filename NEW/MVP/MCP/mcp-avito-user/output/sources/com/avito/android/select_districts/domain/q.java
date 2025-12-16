package com.avito.android.select_districts.domain;

import com.avito.android.util.R0;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.T;

/* compiled from: SelectDistrictsSearchInteractorImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/domain/q;", "Ldagger/internal/h;", "Lcom/avito/android/select_districts/domain/p;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f266951e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f266952a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f266953b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<d> f266954c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final c f266955d;

    /* compiled from: SelectDistrictsSearchInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/domain/q$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public q(@Y61.k Provider provider, @Y61.k u uVar, @Y61.k Provider provider2, @Y61.k c cVar) {
        this.f266952a = provider;
        this.f266953b = uVar;
        this.f266954c = provider2;
        this.f266955d = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = this.f266952a.get();
        T t12 = (T) this.f266953b.get();
        d dVar = this.f266954c.get();
        b bVar = (b) this.f266955d.get();
        f266951e.getClass();
        return new p(r02, t12, dVar, bVar);
    }
}
