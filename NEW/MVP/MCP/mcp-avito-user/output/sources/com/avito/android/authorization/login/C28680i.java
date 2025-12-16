package com.avito.android.authorization.login;

import Zd.InterfaceC19542a;
import com.avito.android.deep_linking.links.auth.PerformResetPasswordLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.Metadata;

/* compiled from: LoginPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.authorization.login.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28680i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f94049b;

    public C28680i(u uVar) {
        this.f94049b = uVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        u uVar = this.f94049b;
        if (uVar.f94083t) {
            b.a.a(uVar.f94070g, new PerformResetPasswordLink(uVar.f94081r), "login.reset_password.perform", null, 4);
            return;
        }
        uVar.g();
        LoginActivity loginActivity = uVar.f94061A;
        if (loginActivity != null) {
            String str = uVar.f94081r;
            InterfaceC19542a interfaceC19542a = loginActivity.f93980o;
            loginActivity.startActivityForResult(InterfaceC19542a.C1444a.a(interfaceC19542a != null ? interfaceC19542a : null, str, 6), 52);
        }
    }
}
