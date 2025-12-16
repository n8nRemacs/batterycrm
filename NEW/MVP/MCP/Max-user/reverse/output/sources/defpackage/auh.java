package defpackage;

import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class auh extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ WebAppRootScreen o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auh(WebAppRootScreen webAppRootScreen, String str, Continuation continuation) {
        super(2, continuation);
        this.o = webAppRootScreen;
        this.X = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        auh auhVar = (auh) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        auhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new auh(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        g8j.b(obj);
        WebAppRootScreen webAppRootScreen = this.o;
        gge ggeVar = new gge(webAppRootScreen.getContext());
        Intent intent = (Intent) ggeVar.d;
        intent.setType(HTTP.PLAIN_TEXT_TYPE);
        intent.putExtra("android.intent.extra.TEXT", (CharSequence) this.X);
        ggeVar.k();
        cxh cxhVar = webAppRootScreen.N0().g1;
        qqg qqgVar = qqg.a;
        if (cxhVar != null) {
            cxhVar.a(qqgVar);
        }
        return qqgVar;
    }
}
