package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import kotlin.Metadata;

/* compiled from: IacLogCleaner.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "obsolescenceTime", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(J)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30895b<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30908o f167989b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w f167990c;

    public C30895b(C30908o c30908o, com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar) {
        this.f167989b = c30908o;
        this.f167990c = wVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        C30908o c30908o = this.f167989b;
        return c30908o.f168019a.c().n(new C30899f(c30908o)).r(new C30900g(this.f167990c)).n(new C30902i(c30908o, jLongValue)).n(new C30904k(c30908o)).n(new C30905l(c30908o));
    }
}
