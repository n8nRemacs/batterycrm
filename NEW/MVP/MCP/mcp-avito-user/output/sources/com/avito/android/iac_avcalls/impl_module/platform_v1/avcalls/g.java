package com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.avcalls.android.a;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvCallsExceptionHandler.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/g;", "Lcom/avito/avcalls/android/a$d;", "a", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements a.d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f164545a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f164546b;

    /* compiled from: AvCallsExceptionHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/g$a;", "", "<init>", "()V", "", "TAG_IAC_SDK", "Ljava/lang/String;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public g(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k F f12) {
        this.f164545a = interfaceC28373a;
        this.f164546b = f12;
    }

    @Override // com.avito.avcalls.android.a.d
    public final void a(@Y61.k Throwable th2) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("AvCalls: ExceptionHandler", "Unhandled exception in SDK", th2);
        NonFatalErrorEvent nonFatalErrorEvent = new NonFatalErrorEvent("Unhandled error in avcalls: " + th2.getLocalizedMessage(), new AvcallsExceptionHandlerError(th2), null, NonFatalErrorEvent.a.C4323a.f147930a, 4, null);
        InterfaceC28373a interfaceC28373a = this.f164545a;
        interfaceC28373a.c(nonFatalErrorEvent);
        interfaceC28373a.c(new y.a(this.f164546b.a("calls", "{{%app_ver%}}", "avcalls_exception_handler_error").f91030a, 1L));
    }
}
