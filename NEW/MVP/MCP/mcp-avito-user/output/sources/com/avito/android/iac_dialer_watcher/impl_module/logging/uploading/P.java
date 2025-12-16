package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Completables.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/rx3/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class P<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f167969b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w f167970c;

    public P(T t12, com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar) {
        this.f167969b = t12;
        this.f167970c = wVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f167969b.f167974b.a("UPLOADED", Collections.singleton(Long.valueOf(this.f167970c.f167936a)));
    }
}
