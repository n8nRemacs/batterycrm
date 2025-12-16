package com.avito.android.push.rustore;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: RustorePushTokenProvider.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/rustore/g;", "Lcom/avito/android/push/rustore/f;", "a", "_avito_push-rustore_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes16.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f246092a;

    /* compiled from: RustorePushTokenProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/push/rustore/g$a;", "", "<init>", "()V", "", "DEFAULT_ERROR_MESSAGE", "Ljava/lang/String;", "GRAFANA_GET_PUSH_ERROR_EVENT", "GRAFANA_GET_PUSH_EVENT", "GRAFANA_GET_PUSH_SUCCESS_EVENT", "_avito_push-rustore_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public g(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f246092a = interfaceC28373a;
    }

    public static final void b(g gVar, Throwable th2) {
        gVar.getClass();
        V2 v22 = V2.f318762a;
        String message = th2.getMessage();
        if (message == null) {
            message = "Can't receive push token from rustore";
        }
        v22.a("RustorePushTokenProvider", "Error appears when try to received rustore push token: ".concat(message), th2);
        gVar.f246092a.c(new y.a("rustore.get_token.error", 0L, 2, null));
    }

    @Override // com.avito.android.push.rustore.f
    @Y61.k
    public final C43152f0 a() {
        return new C43152f0(new h(C43175k.d(new j(this, null))), new k(this, null));
    }
}
