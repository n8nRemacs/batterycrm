package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import java.util.Arrays;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final /* synthetic */ class n14 implements mi4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n14(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mi4
    public final Object a() {
        switch (this.a) {
            case 0:
                final q14 q14Var = (q14) this.b;
                return new a8() { // from class: o14
                    @Override // defpackage.a8
                    public final void a(ytd ytdVar) {
                        k18 k18Var = q14Var.b;
                        try {
                            Activity activityD = ytdVar.d();
                            if (activityD == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            gge ggeVar = new gge(activityD);
                            Intent intent = (Intent) ggeVar.d;
                            String string = ((l5c) ((age) k18Var.getValue())).g.getString("invite-header", null);
                            if (string == null) {
                                string = activityD.getString(fvd.D);
                            }
                            ggeVar.b = string;
                            intent.setType(HTTP.PLAIN_TEXT_TYPE);
                            l5c l5cVar = (l5c) ((age) k18Var.getValue());
                            String string2 = l5cVar.g.getString("invite-long", null);
                            if (string2 == null) {
                                string2 = String.format(activityD.getString(fvd.J), Arrays.copyOf(new Object[]{l5cVar.l()}, 1));
                            }
                            intent.putExtra("android.intent.extra.TEXT", (CharSequence) string2);
                            ggeVar.k();
                        } catch (ActivityNotFoundException unused) {
                            wqi.e("ContactsDeepLinkFactory", "shareInvite: failed, no activity found", null);
                        }
                    }
                };
            default:
                return new ChatTitleIconScreen((long[]) this.b, raf.b);
        }
    }
}
