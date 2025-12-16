package com.avito.android.iac_calls_history.impl_module.deeplink;

import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CallsHistoryLinkHandler_Factory.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/deeplink/e;", "Ldagger/internal/h;", "Lcom/avito/android/iac_calls_history/impl_module/deeplink/b;", "a", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements h<b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f164706d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30102l3 f164707a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final dv.b f164708b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C25721c f164709c;

    /* compiled from: CallsHistoryLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/deeplink/e$a;", "", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@k C25721c c25721c, @k C30102l3 c30102l3, @k dv.b bVar) {
        this.f164707a = c30102l3;
        this.f164708b = bVar;
        this.f164709c = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f164707a.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f164708b.get();
        C25719a c25719a = (C25719a) this.f164709c.get();
        f164706d.getClass();
        return new b(context, c25719a, interfaceC4053a);
    }
}
