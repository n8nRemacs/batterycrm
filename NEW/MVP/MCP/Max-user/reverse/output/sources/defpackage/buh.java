package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final class buh extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ WebAppRootScreen Y;
    public final /* synthetic */ hxh Z;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public buh(String str, WebAppRootScreen webAppRootScreen, hxh hxhVar, Continuation continuation) {
        super(2, continuation);
        this.X = str;
        this.Y = webAppRootScreen;
        this.Z = hxhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        buh buhVar = (buh) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        buhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        buh buhVar = new buh(this.X, this.Y, this.Z, continuation);
        buhVar.o = obj;
        return buhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        g8j.b(obj);
        WebAppRootScreen webAppRootScreen = this.Y;
        String str = this.X;
        if (str == null) {
            Context context = webAppRootScreen.getContext();
            l5c l5cVar = (l5c) ((age) kph.a.getAccessor().c(47));
            String string = l5cVar.g.getString("invite-long", null);
            str = string != null ? string : String.format(context.getString(fvd.J), Arrays.copyOf(new Object[]{l5cVar.l()}, 1));
        }
        qqg qqgVar = qqg.a;
        hxh hxhVar = this.Z;
        try {
            if (hxhVar == null) {
                String str2 = ap7.a;
                ap7.i(webAppRootScreen.getContext(), str, null);
            } else {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", (CharSequence) str);
                WebAppRootScreen.L0(webAppRootScreen, intent, hxhVar);
                String str3 = ap7.a;
                Intent intentA = ap7.a(webAppRootScreen.getContext(), intent);
                if (intentA != null) {
                    intent = intentA;
                }
                webAppRootScreen.getContext().startActivity(intent);
            }
            ipdVar = qqgVar;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (!(ipdVar instanceof ipd)) {
            yy7[] yy7VarArr = WebAppRootScreen.R0;
            webAppRootScreen.O0().evaluateJavascript("window.navigator.__share__receive()", new ggb(1));
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.b(webAppRootScreen.C0, "showShareDialog: shareFile error", thA);
            webAppRootScreen.O0().evaluateJavascript("window.navigator.__share__receive(abort)", new ggb(1));
        }
        return qqgVar;
    }
}
