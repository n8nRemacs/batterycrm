package com.avito.android.iac_calls_history.impl_module.deeplink;

import Y61.k;
import androidx.compose.runtime.internal.P;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: CallsHistoryLinkHandlerModule_IacMakeCallLinkMappingFactory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/deeplink/d;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f164704b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f164705a;

    /* compiled from: CallsHistoryLinkHandlerModule_IacMakeCallLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/deeplink/d$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k c cVar, @k e eVar) {
        this.f164705a = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        e eVar = this.f164705a;
        f164704b.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CallsHistoryLink.class, new f(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(CallsHistoryLink.class), eVar));
    }
}
