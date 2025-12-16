package com.avito.android.authorization.auth;

import Ju.InterfaceC14249c;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: AuthPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class T<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f92875b;

    public T(A a12) {
        this.f92875b = a12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C43501a c43501a = (C43501a) obj;
        A a12 = this.f92875b;
        h0 h0Var = a12.f92787p;
        if (h0Var != null) {
            h0Var.h();
        }
        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
        CodeCheckLink.b.C3493b c3493b = interfaceC14249c instanceof CodeCheckLink.b.C3493b ? (CodeCheckLink.b.C3493b) interfaceC14249c : null;
        Object obj2 = c3493b != null ? c3493b.f119267b : null;
        ConfirmedCodeInfo confirmedCodeInfo = obj2 instanceof ConfirmedCodeInfo ? (ConfirmedCodeInfo) obj2 : null;
        if (confirmedCodeInfo != null) {
            DeepLink deepLink = confirmedCodeInfo.f119578e;
            if (deepLink != null) {
                a12.f92795x = deepLink;
            }
            a12.j();
            return;
        }
        AuthFragment authFragment = a12.f92788q;
        if (authFragment != null) {
            authFragment.D5();
        }
    }
}
