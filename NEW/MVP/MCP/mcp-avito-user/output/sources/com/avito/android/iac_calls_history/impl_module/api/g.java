package com.avito.android.iac_calls_history.impl_module.api;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.R0;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallsHistoryRetrofitApi_Module_ProvideCallsHistoryRetrofitApiFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/api/g;", "Ldagger/internal/h;", "Lcom/avito/android/iac_calls_history/impl_module/api/e;", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements h<e> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f164696b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dagger.internal.f f164697a;

    /* compiled from: CallsHistoryRetrofitApi_Module_ProvideCallsHistoryRetrofitApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/api/g$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g(@k dagger.internal.f fVar) {
        this.f164697a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f164697a.get();
        f164696b.getClass();
        f.f164695a.getClass();
        e eVar = (e) r02.create(e.class);
        t.b(eVar, "Cannot return null from a non-@Nullable @Provides method");
        return eVar;
    }
}
