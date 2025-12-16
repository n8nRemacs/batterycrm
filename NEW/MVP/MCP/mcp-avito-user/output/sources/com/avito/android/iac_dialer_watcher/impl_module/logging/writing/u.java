package com.avito.android.iac_dialer_watcher.impl_module.logging.writing;

import com.avito.android.analytics.statsd.y;
import java.util.List;
import kotlin.Metadata;

/* compiled from: IacLogSaver.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/a;", "calls", "Lio/reactivex/rxjava3/core/O;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class u<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w f168127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f168128c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f168129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f168130e;

    public u(com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar, String str, String str2, q qVar) {
        this.f168127b = wVar;
        this.f168128c = str;
        this.f168129d = str2;
        this.f168130e = qVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        long j12 = this.f168127b.f167936a;
        long size = ((List) obj).size();
        q qVar = this.f168130e;
        long jNow = qVar.f168110g.now();
        com.avito.android.iac_dialer_watcher.impl_module.logging.repository.e eVar = qVar.f168107d;
        boolean zI2 = eVar.i();
        String strA = qVar.f168108e.a(this.f168128c);
        String str = this.f168128c;
        String str2 = this.f168129d;
        com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a aVar = new com.avito.android.iac_dialer_watcher.impl_module.logging.repository.a(j12, size, str, str2, jNow, 0L, zI2, strA);
        com.avito.android.iac_dialer_watcher.impl_module.logging.q qVar2 = qVar.f168111h;
        qVar2.f167891a.c(new y.a(qVar2.f167892b.a("calls", "logs", "{{%app_ver%}}", "writingStart").f91030a, 1L));
        return eVar.j(eVar.f167909a.o(new com.avito.android.iac_dialer_watcher.impl_module.db.A(j12, size, str, str2, jNow, 0L, zI2, strA))).r(new t(aVar));
    }
}
