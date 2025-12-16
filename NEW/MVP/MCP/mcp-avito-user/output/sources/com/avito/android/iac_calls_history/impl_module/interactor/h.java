package com.avito.android.iac_calls_history.impl_module.interactor;

import androidx.compose.runtime.internal.P;
import cK.InterfaceC27058a;
import com.avito.android.account.E;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallsHistoryStartupTask_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/interactor/h;", "Ldagger/internal/h;", "Lcom/avito/android/iac_calls_history/impl_module/interactor/CallsHistoryStartupTask;", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<CallsHistoryStartupTask> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f164735d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<E> f164736a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC27058a> f164737b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.missed_calls.a> f164738c;

    /* compiled from: CallsHistoryStartupTask_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/interactor/h$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@Y61.k Provider<E> provider, @Y61.k Provider<InterfaceC27058a> provider2, @Y61.k Provider<com.avito.android.missed_calls.a> provider3) {
        this.f164736a = provider;
        this.f164737b = provider2;
        this.f164738c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        E e12 = this.f164736a.get();
        InterfaceC27058a interfaceC27058a = this.f164737b.get();
        com.avito.android.missed_calls.a aVar = this.f164738c.get();
        f164735d.getClass();
        return new CallsHistoryStartupTask(e12, interfaceC27058a, aVar);
    }
}
