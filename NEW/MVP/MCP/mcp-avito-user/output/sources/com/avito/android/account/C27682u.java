package com.avito.android.account;

import kotlin.Metadata;

/* compiled from: AccountInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "error", "Lio/reactivex/rxjava3/core/O;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.account.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27682u<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C27672j f68178b;

    public C27682u(C27672j c27672j) {
        this.f68178b = c27672j;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        C27672j c27672j = this.f68178b;
        return c27672j.f68150f.o().n(new C27680s(th2, c27672j)).n(new C27681t(th2));
    }
}
