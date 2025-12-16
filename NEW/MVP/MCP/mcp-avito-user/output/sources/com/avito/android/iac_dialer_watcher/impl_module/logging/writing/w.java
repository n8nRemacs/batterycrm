package com.avito.android.iac_dialer_watcher.impl_module.logging.writing;

import com.avito.android.analytics.statsd.y;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.I;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: IacLogSaver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class w<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f168132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f168133c;

    public w(q qVar, long j12) {
        this.f168132b = qVar;
        this.f168133c = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        q qVar = this.f168132b;
        if (!qVar.f168107d.i()) {
            return I.q(G0.f406611a);
        }
        com.avito.android.iac_dialer_watcher.impl_module.logging.q qVar2 = qVar.f168111h;
        qVar2.f167891a.c(new y.a(qVar2.f167892b.a("calls", "logs", "{{%app_ver%}}", "totalLinesThreshold").f91030a, 1L));
        V2 v22 = V2.f318762a;
        String str = q.f168103l;
        v22.c("In_app_calls_logging:", str, null);
        return qVar.f168107d.g(this.f168133c, qVar.f168110g.now(), str).r(new z(qVar, str)).i(A.f168066b).v(G0.f406611a);
    }
}
