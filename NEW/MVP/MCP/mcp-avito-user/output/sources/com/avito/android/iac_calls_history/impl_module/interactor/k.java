package com.avito.android.iac_calls_history.impl_module.interactor;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallsHistoryUnreadCounterInteractorImpl_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/interactor/k;", "Ldagger/internal/h;", "Lcom/avito/android/iac_calls_history/impl_module/interactor/i;", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<i> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f164748c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f164749a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f164750b;

    /* compiled from: CallsHistoryUnreadCounterInteractorImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/interactor/k$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k u uVar, @Y61.k Provider provider) {
        this.f164749a = uVar;
        this.f164750b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_calls_history.impl_module.api.a aVar = (com.avito.android.iac_calls_history.impl_module.api.a) this.f164749a.get();
        R0 r02 = this.f164750b.get();
        f164748c.getClass();
        return new i(aVar, r02);
    }
}
