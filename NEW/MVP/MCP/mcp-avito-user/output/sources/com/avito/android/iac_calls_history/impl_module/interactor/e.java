package com.avito.android.iac_calls_history.impl_module.interactor;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.x;
import com.avito.android.util.R0;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallsHistoryListInteractorImpl_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/interactor/e;", "Ldagger/internal/h;", "Lcom/avito/android/iac_calls_history/impl_module/interactor/b;", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<b> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f164728f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.iac_calls_history.impl_module.api.a> f164729a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.server_time.f> f164730b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f164731c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f164732d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final u f164733e;

    /* compiled from: CallsHistoryListInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/interactor/e$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k dagger.internal.f fVar, @Y61.k u uVar, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3) {
        this.f164729a = provider;
        this.f164730b = provider2;
        this.f164731c = provider3;
        this.f164732d = fVar;
        this.f164733e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_calls_history.impl_module.api.a aVar = this.f164729a.get();
        com.avito.android.server_time.f fVar = this.f164730b.get();
        R0 r02 = this.f164731c.get();
        x xVar = (x) this.f164732d.get();
        com.avito.android.iac_calls_history.impl_module.screen.h hVar = (com.avito.android.iac_calls_history.impl_module.screen.h) this.f164733e.get();
        f164728f.getClass();
        return new b(aVar, fVar, r02, xVar, hVar);
    }
}
