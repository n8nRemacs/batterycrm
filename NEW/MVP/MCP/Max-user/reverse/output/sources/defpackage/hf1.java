package defpackage;

import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class hf1 extends dtf implements sm6 {
    public final /* synthetic */ CallLinkInfoScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf1(Continuation continuation, CallLinkInfoScreen callLinkInfoScreen) {
        super(2, continuation);
        this.X = callLinkInfoScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        hf1 hf1Var = (hf1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hf1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hf1 hf1Var = new hf1(continuation, this.X);
        hf1Var.o = obj;
        return hf1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof ei4) {
            ca1.c.s0((ei4) cdaVar);
        } else {
            boolean z = cdaVar instanceof rc1;
            CallLinkInfoScreen callLinkInfoScreen = this.X;
            if (z) {
                b6a b6aVar = CallLinkInfoScreen.A0;
                callLinkInfoScreen.z0().h(2, 1, null);
                ca1 ca1Var = ca1.c;
                String string = callLinkInfoScreen.getContext().getString(b0b.r);
                String string2 = ((rc1) cdaVar).b.toString();
                String name = CallLinkInfoScreen.class.getName();
                ca1Var.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", string2);
                intent.setType(HTTP.PLAIN_TEXT_TYPE);
                ca1Var.p0().b(":chats/share", gwi.b(new imb("oneme:share:data", intent), new imb("oneme:share:title", string), new imb("tag", name)));
            } else if (cdaVar instanceof sc1) {
                b6a b6aVar2 = CallLinkInfoScreen.A0;
                callLinkInfoScreen.z0().h(3, 1, null);
                String str = ap7.a;
                ap7.i(callLinkInfoScreen.getContext(), ((sc1) cdaVar).b, null);
            } else if (cdaVar instanceof qc1) {
                b6a b6aVar3 = CallLinkInfoScreen.A0;
                callLinkInfoScreen.z0().h(1, 1, null);
                xb3.a(callLinkInfoScreen.getContext(), ((qc1) cdaVar).b.toString());
                if (xb3.b()) {
                    n5g n5gVar = new n5g(b0b.q);
                    int i = xza.e;
                    ccb ccbVar = new ccb(callLinkInfoScreen);
                    ccbVar.g(n5gVar);
                    ccbVar.e(new qcb(i));
                    ccbVar.i();
                }
            } else if (cdaVar instanceof tc1) {
                n5g n5gVar2 = ((tc1) cdaVar).b;
                b6a b6aVar4 = CallLinkInfoScreen.A0;
                ccb ccbVar2 = new ccb(callLinkInfoScreen);
                ccbVar2.g(n5gVar2);
                ccbVar2.e(rcb.a);
                ccbVar2.i();
            } else if (cdaVar instanceof uc1) {
                callLinkInfoScreen.getRouter().B(callLinkInfoScreen);
                ca1.c.p0().b(":call-join-link?link=".concat(((uc1) cdaVar).b), null);
            }
        }
        return qqg.a;
    }
}
