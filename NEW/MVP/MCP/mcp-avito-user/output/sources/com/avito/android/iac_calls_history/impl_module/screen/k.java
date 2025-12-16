package com.avito.android.iac_calls_history.impl_module.screen;

import androidx.compose.runtime.internal.P;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallsHistoryScreenViewModel_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/k;", "Ldagger/internal/h;", "Lcom/avito/android/iac_calls_history/impl_module/screen/j;", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f164785b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m f164786a;

    /* compiled from: CallsHistoryScreenViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/k$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k m mVar) {
        this.f164786a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.iac_calls_history.impl_module.screen.mvi.l lVar = (com.avito.android.iac_calls_history.impl_module.screen.mvi.l) this.f164786a.get();
        f164785b.getClass();
        return new j(lVar, null, 2, null);
    }
}
