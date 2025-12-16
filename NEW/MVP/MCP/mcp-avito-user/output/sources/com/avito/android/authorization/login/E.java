package com.avito.android.authorization.login;

import Ju.InterfaceC14249c;
import com.avito.android.deep_linking.links.auth.PerformResetPasswordLink;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kv.C43501a;

/* compiled from: LoginPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class E<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f93959b;

    public E(u uVar) {
        this.f93959b = uVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        LoginActivity loginActivity;
        Q q12;
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        PerformResetPasswordLink.b bVar = interfaceC14249c instanceof PerformResetPasswordLink.b ? (PerformResetPasswordLink.b) interfaceC14249c : null;
        if (bVar == null) {
            return;
        }
        if (bVar.equals(PerformResetPasswordLink.b.C4026b.f133935b) ? true : bVar.equals(PerformResetPasswordLink.b.a.f133934b) ? true : bVar.equals(PerformResetPasswordLink.b.d.f133937b)) {
            return;
        }
        boolean z12 = bVar instanceof PerformResetPasswordLink.b.c;
        u uVar = this.f93959b;
        if (!z12) {
            if (!(bVar instanceof PerformResetPasswordLink.b.e) || (loginActivity = uVar.f94061A) == null) {
                return;
            }
            loginActivity.b2(false);
            return;
        }
        String str = (String) C42745f0.F(((PerformResetPasswordLink.b.c) bVar).f133936b.values());
        if (str == null || (q12 = uVar.f94089z) == null) {
            return;
        }
        q12.g(str);
    }
}
