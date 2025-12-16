package com.avito.android.authorization.auth;

import Ju.InterfaceC14249c;
import com.avito.android.authorization.SocialRegistrationSuggestsParams;
import com.avito.android.authorization.social_registration.code_check.SocialRegCcResult;
import com.avito.android.code_check_public.CodeCheckLink;
import io.reactivex.rxjava3.internal.operators.single.C42016n;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: AuthPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class Z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f92881b;

    public Z(A a12) {
        this.f92881b = a12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        boolean z12 = interfaceC14249c instanceof CodeCheckLink.b.C3493b;
        A a12 = this.f92881b;
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
        SocialRegCcResult socialRegCcResult = (SocialRegCcResult) ((CodeCheckLink.b.C3493b) interfaceC14249c).f119267b;
        String str = a12.f92791t;
        if (str != null) {
            if (socialRegCcResult.f94584d.isEmpty()) {
                a12.f92785n.b(new C42016n(a12.f92773b.f(socialRegCcResult.f94583c, str, true).s(a12.f92774c.e()).j(new N(a12)), new C28645y(a12, 3)).x(new O(a12), new P(a12)));
            } else {
                h0 h0Var2 = a12.f92787p;
                if (h0Var2 != null) {
                    h0Var2.h();
                }
                AuthFragment authFragment2 = a12.f92788q;
                if (authFragment2 != null) {
                    SocialRegistrationSuggestsParams socialRegistrationSuggestsParams = new SocialRegistrationSuggestsParams(socialRegCcResult.f94583c, socialRegCcResult.f94584d, str, socialRegCcResult.f94582b, true);
                    Zd.i iVar = authFragment2.f92831t0;
                    if (iVar == null) {
                        iVar = null;
                    }
                    authFragment2.startActivity(iVar.m(authFragment2.requireActivity().getIntent(), socialRegistrationSuggestsParams));
                }
            }
        }
        a12.f92791t = null;
    }
}
