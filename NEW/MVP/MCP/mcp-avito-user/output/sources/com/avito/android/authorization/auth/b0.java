package com.avito.android.authorization.auth;

import Ju.InterfaceC14249c;
import android.content.Intent;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: AuthPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f92927b;

    public b0(A a12) {
        this.f92927b = a12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        boolean z12 = interfaceC14249c instanceof CodeCheckLink.b.C3493b;
        A a12 = this.f92927b;
        if (!z12) {
            AuthFragment authFragment = a12.f92788q;
            if (authFragment != null) {
                authFragment.D5();
                return;
            }
            h0 h0Var = a12.f92787p;
            if (h0Var != null) {
                h0Var.h();
                return;
            }
            return;
        }
        ConfirmedCodeInfo confirmedCodeInfo = (ConfirmedCodeInfo) ((CodeCheckLink.b.C3493b) interfaceC14249c).f119267b;
        AuthFragment authFragment2 = a12.f92788q;
        if (authFragment2 != null) {
            Zd.i iVar = authFragment2.f92831t0;
            if (iVar == null) {
                iVar = null;
            }
            Intent intent = authFragment2.requireActivity().getIntent();
            String str = confirmedCodeInfo.f119576c;
            boolean z13 = confirmedCodeInfo.f119577d;
            String str2 = confirmedCodeInfo.f119575b;
            authFragment2.startActivity(z13 ? iVar.l(intent, str2, str) : iVar.a(intent, str2, str, false));
        }
    }
}
