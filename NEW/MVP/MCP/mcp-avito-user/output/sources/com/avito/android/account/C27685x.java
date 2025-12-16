package com.avito.android.account;

import io.reactivex.rxjava3.internal.util.NotificationLite;
import kotlin.Metadata;

/* compiled from: AccountInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lio/reactivex/rxjava3/core/y;", "it", "", "test", "(Lio/reactivex/rxjava3/core/y;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.account.x, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27685x<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Throwable, Boolean> f68183b;

    /* JADX WARN: Multi-variable type inference failed */
    public C27685x(Y41.l<? super Throwable, Boolean> lVar) {
        this.f68183b = lVar;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        io.reactivex.rxjava3.core.y yVar = (io.reactivex.rxjava3.core.y) obj;
        if (NotificationLite.i(yVar.f401975a)) {
            if (this.f68183b.invoke(yVar.b()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
