package com.avito.android.authorization.login;

import kotlin.Metadata;

/* compiled from: LoginPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.authorization.login.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28678g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f94047b;

    public C28678g(u uVar) {
        this.f94047b = uVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        u uVar = this.f94047b;
        uVar.g();
        LoginActivity loginActivity = uVar.f94061A;
        if (loginActivity != null) {
            loginActivity.b2(false);
        }
    }
}
