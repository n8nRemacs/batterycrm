package com.avito.android.authorization.login;

import com.avito.android.profile.deep_linking.l;
import kotlin.Metadata;
import kv.C43501a;
import xn0.C49971a;

/* compiled from: LoginPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class A<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f93955b;

    public A(u uVar) {
        this.f93955b = uVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zF2 = kotlin.jvm.internal.L.f(((C43501a) obj).f413261b, l.a.b.f221915b);
        u uVar = this.f93955b;
        if (!zF2) {
            uVar.f(uVar.f94085v, null, !uVar.f94084u);
            return;
        }
        LoginActivity loginActivity = uVar.f94061A;
        if (loginActivity != null) {
            C49971a.a(loginActivity);
        }
        LoginActivity loginActivity2 = uVar.f94061A;
        if (loginActivity2 != null) {
            loginActivity2.a2(-1);
        }
    }
}
