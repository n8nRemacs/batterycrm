package com.avito.android.authorization.deep_linking;

import com.avito.android.authorization.auto_recovery.g;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import sv.C48421d;

/* compiled from: AutoRecoveryAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/g;", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/authorization/auto_recovery/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.authorization.deep_linking.y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28670y extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.authorization.auto_recovery.g, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f93807l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28670y(A a12) {
        super(1);
        this.f93807l = a12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.authorization.auto_recovery.g gVar) {
        AutoRecoveryLink.Result.Success.ResultAction resultAction;
        com.avito.android.authorization.auto_recovery.g gVar2 = gVar;
        A a12 = this.f93807l;
        boolean zF2 = kotlin.jvm.internal.L.f(gVar2, g.a.f93192a);
        com.avito.android.deeplink_handler.handler.composite.a aVar = a12.f93657k;
        if (zF2) {
            b.a.a(aVar, new CodeCheckLink(CodeCheckLink.Flow.AutoRecovery.f119253b, null, 2, null), null, null, 6);
            resultAction = AutoRecoveryLink.Result.Success.ResultAction.f133893b;
        } else if (gVar2 instanceof g.c) {
            b.a.a(aVar, ((g.c) gVar2).f93194a, null, null, 6);
            resultAction = AutoRecoveryLink.Result.Success.ResultAction.f133894c;
        } else {
            boolean zF3 = kotlin.jvm.internal.L.f(gVar2, g.b.f93193a);
            a.InterfaceC4053a interfaceC4053a = a12.f93653g;
            Zd.i iVar = a12.f93652f;
            if (zF3) {
                interfaceC4053a.J(iVar.e(false), C48421d.a(a12), com.avito.android.deeplink_handler.view.c.f134589l);
                resultAction = AutoRecoveryLink.Result.Success.ResultAction.f133895d;
            } else {
                if (!kotlin.jvm.internal.L.f(gVar2, g.d.f93195a)) {
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC4053a.J(iVar.e(true), C48421d.a(a12), com.avito.android.deeplink_handler.view.c.f134589l);
                resultAction = AutoRecoveryLink.Result.Success.ResultAction.f133895d;
            }
        }
        a12.j(new AutoRecoveryLink.Result.Success(resultAction));
        return G0.f406611a;
    }
}
