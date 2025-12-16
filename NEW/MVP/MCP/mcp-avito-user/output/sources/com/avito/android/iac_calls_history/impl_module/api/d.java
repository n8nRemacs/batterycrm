package com.avito.android.iac_calls_history.impl_module.api;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_api_utils.util_module.i;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallsHistoryApiImpl_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/api/d;", "Ldagger/internal/h;", "Lcom/avito/android/iac_calls_history/impl_module/api/b;", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements h<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f164692c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final u f164693a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f164694b;

    /* compiled from: CallsHistoryApiImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/api/d$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k u uVar, @k i iVar) {
        this.f164693a = uVar;
        this.f164694b = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(w.a(this.f164693a));
        com.avito.android.iac_api_utils.util_module.a aVar = (com.avito.android.iac_api_utils.util_module.a) this.f164694b.get();
        f164692c.getClass();
        return new b(eVarA, aVar);
    }
}
