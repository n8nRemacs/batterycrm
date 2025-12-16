package com.avito.android.iac_calls_history.impl_module.screen.mvi;

import androidx.compose.runtime.internal.P;
import cK.InterfaceC27058a;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallsHistoryScreenActor_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/f;", "Ldagger/internal/h;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/a;", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<com.avito.android.iac_calls_history.impl_module.screen.mvi.a> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f164849d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.iac_calls_history.impl_module.interactor.a> f164850a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC27058a> f164851b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f164852c;

    /* compiled from: CallsHistoryScreenActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/f$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(@Y61.k dagger.internal.l lVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f164850a = provider;
        this.f164851b = provider2;
        this.f164852c = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_calls_history.impl_module.interactor.a aVar = this.f164850a.get();
        InterfaceC27058a interfaceC27058a = this.f164851b.get();
        com.avito.android.iac_calls_history.impl_module.screen.l lVar = (com.avito.android.iac_calls_history.impl_module.screen.l) this.f164852c.f393949a;
        f164849d.getClass();
        return new com.avito.android.iac_calls_history.impl_module.screen.mvi.a(aVar, interfaceC27058a, lVar);
    }
}
