package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.core.net.ParseException;
import java.util.HashMap;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import one.me.webview.FaqWebViewWidget;

/* loaded from: classes2.dex */
public final class uq5 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ FaqWebViewWidget Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq5(FaqWebViewWidget faqWebViewWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = faqWebViewWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uq5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uq5 uq5Var = new uq5(this.Y, continuation);
        uq5Var.X = obj;
        return uq5Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        String strDecode;
        String strSubstring;
        int i = this.o;
        FaqWebViewWidget faqWebViewWidget = this.Y;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.X;
            cb6 cb6Var = faqWebViewWidget.o;
            this.X = f84Var;
            this.o = 1;
            obj = cb6Var.c(this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f84Var = (f84) this.X;
            g8j.b(obj);
        }
        String str = (String) obj;
        str.getClass();
        if (!str.startsWith("mailto:")) {
            throw new ParseException("Not a mailto scheme");
        }
        int iIndexOf = str.indexOf(35);
        String strSubstring2 = iIndexOf != -1 ? str.substring(0, iIndexOf) : str;
        int iIndexOf2 = strSubstring2.indexOf(63);
        if (iIndexOf2 == -1) {
            strDecode = Uri.decode(strSubstring2.substring(7));
            strSubstring = null;
        } else {
            strDecode = Uri.decode(strSubstring2.substring(7, iIndexOf2));
            strSubstring = strSubstring2.substring(iIndexOf2 + 1);
        }
        HashMap map = new HashMap();
        if (strSubstring != null) {
            for (String str2 : strSubstring.split("&")) {
                String[] strArrSplit = str2.split("=", 2);
                if (strArrSplit.length != 0) {
                    map.put(Uri.decode(strArrSplit[0]).toLowerCase(Locale.ROOT), strArrSplit.length > 1 ? Uri.decode(strArrSplit[1]) : null);
                }
            }
        }
        String str3 = (String) map.get("to");
        if (str3 != null) {
            strDecode = u45.k(strDecode, ", ", str3);
        }
        map.put("to", strDecode);
        String strE = z7.e(faqWebViewWidget.getContext(), lgb.a);
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(str));
        intent.putExtra("android.intent.extra.SUBJECT", (String) map.get("subject"));
        intent.putExtra("android.intent.extra.CC", (String) map.get("cc"));
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("body"));
        try {
            faqWebViewWidget.startActivity(Intent.createChooser(intent, strE));
        } catch (ActivityNotFoundException e) {
            wqi.e(f84Var.getClass().getName(), "error no email app found", e);
        }
        return qqg.a;
    }
}
