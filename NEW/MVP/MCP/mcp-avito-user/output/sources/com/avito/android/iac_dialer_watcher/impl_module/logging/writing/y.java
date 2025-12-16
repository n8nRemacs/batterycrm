package com.avito.android.iac_dialer_watcher.impl_module.logging.writing;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacLogSaver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class y extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f168136l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(q qVar) {
        super(1);
        this.f168136l = qVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        Throwable th3 = th2;
        com.avito.android.iac_dialer_watcher.impl_module.logging.q qVar = this.f168136l.f168111h;
        qVar.getClass();
        NonFatalErrorEvent nonFatalErrorEvent = new NonFatalErrorEvent("writingError", th3, null, NonFatalErrorEvent.a.c.f147934a, 4, null);
        InterfaceC28373a interfaceC28373a = qVar.f167891a;
        interfaceC28373a.c(nonFatalErrorEvent);
        interfaceC28373a.c(new y.a(qVar.f167892b.a("calls", "logs", "{{%app_ver%}}", "writingError").f91030a, 1L));
        return G0.f406611a;
    }
}
