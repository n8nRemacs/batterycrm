package com.avito.android.account;

import com.avito.android.util.K5;
import kotlin.Metadata;

/* compiled from: AccountInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "isAuthorized", "Lio/reactivex/rxjava3/core/O;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.account.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27680s<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f68175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C27672j f68176c;

    public C27680s(Throwable th2, C27672j c27672j) {
        this.f68175b = th2;
        this.f68176c = c27672j;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Boolean bool = (Boolean) obj;
        return (K5.d(this.f68175b) && bool.booleanValue()) ? this.f68176c.f68149e.a("login_error", true).B(bool) : io.reactivex.rxjava3.core.I.q(bool);
    }
}
