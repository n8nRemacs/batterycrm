package com.avito.android.authorization.login;

import Ju.InterfaceC14249c;
import android.content.Intent;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: LoginPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class y<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f94096b;

    public y(u uVar) {
        this.f94096b = uVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        CodeCheckLink.Flow flow;
        C43501a c43501a = (C43501a) obj;
        DeepLink deepLink = c43501a.f413260a.f134520a;
        CodeCheckLink codeCheckLink = deepLink instanceof CodeCheckLink ? (CodeCheckLink) deepLink : null;
        if (codeCheckLink == null || (flow = codeCheckLink.f119241b) == null) {
            return;
        }
        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
        boolean z12 = interfaceC14249c instanceof CodeCheckLink.b.C3493b;
        u uVar = this.f94096b;
        if (!z12 || !(flow instanceof CodeCheckLink.Flow.Registration)) {
            LoginActivity loginActivity = uVar.f94061A;
            if (loginActivity != null) {
                loginActivity.b2(false);
                return;
            }
            return;
        }
        ConfirmedCodeInfo confirmedCodeInfo = (ConfirmedCodeInfo) ((CodeCheckLink.b.C3493b) interfaceC14249c).f119267b;
        LoginActivity loginActivity2 = uVar.f94061A;
        if (loginActivity2 != null) {
            Zd.i iVar = loginActivity2.f93983r;
            if (iVar == null) {
                iVar = null;
            }
            Intent intent = loginActivity2.getIntent();
            InterfaceC28373a interfaceC28373a = loginActivity2.f93979n;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            Intent intentA = Zd.n.a(intent, interfaceC28373a);
            if (intentA == null) {
                l90.o oVar = loginActivity2.f93981p;
                intentA = (oVar != null ? oVar : null).b();
            }
            String str = confirmedCodeInfo.f119576c;
            boolean z13 = confirmedCodeInfo.f119577d;
            String str2 = confirmedCodeInfo.f119575b;
            loginActivity2.startActivity(z13 ? iVar.l(intentA, str2, str) : iVar.a(intentA, str2, str, false));
        }
    }
}
