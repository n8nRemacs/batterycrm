package com.avito.android.account;

import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import kotlin.Metadata;

/* compiled from: AccountInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isAuthorized", "Lio/reactivex/rxjava3/core/g;", "apply", "(Z)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.account.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C27676n<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C27672j f68164b;

    public C27676n(C27672j c27672j) {
        this.f68164b = c27672j;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return ((Boolean) obj).booleanValue() ? this.f68164b.a("pre_login", false) : C41823n.f402260b;
    }
}
