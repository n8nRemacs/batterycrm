package defpackage;

import android.app.Application;
import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class nt9 extends dtf implements sm6 {
    public final /* synthetic */ vu9 X;
    public final /* synthetic */ List o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt9(vu9 vu9Var, List list, Continuation continuation) {
        super(2, continuation);
        this.o = list;
        this.X = vu9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nt9 nt9Var = (nt9) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nt9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nt9(this.X, this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        pb2 pb2Var;
        g8j.b(obj);
        Long l = (Long) ue3.I(this.o);
        qqg qqgVar = qqg.a;
        if (l != null) {
            long jLongValue = l.longValue();
            vu9 vu9Var = this.X;
            MessageModel messageModelE = ((hr9) vu9Var.D1.a.getValue()).e(jLongValue);
            if (messageModelE != null && (pb2Var = (pb2) vu9Var.B1.a.getValue()) != null) {
                rf2 rf2Var = pb2Var.b;
                if (pb2Var.M()) {
                    j98 j98Var = (j98) vu9Var.W0.getValue();
                    String str = rf2Var.I;
                    boolean zE0 = pb2Var.e0();
                    long j = rf2Var.a;
                    long j2 = messageModelE.b;
                    j98Var.getClass();
                    String string = "";
                    if (!TextUtils.isEmpty(str)) {
                        String lastPathSegment = zE0 ? String.format(Locale.getDefault(), "c/%d", Long.valueOf(j)) : Uri.parse(str).getLastPathSegment();
                        if (!TextUtils.isEmpty(lastPathSegment)) {
                            Locale.getDefault();
                            try {
                                string = Uri.parse("https://max.ru/" + lastPathSegment + "/").buildUpon().appendPath(new String(tui.b(11, ByteBuffer.allocate(8).putLong(j2).array()), "US-ASCII")).build().toString();
                            } catch (UnsupportedEncodingException e) {
                                throw new AssertionError(e);
                            }
                        }
                    }
                    xb3.a((Application) vu9Var.G0.getValue(), string);
                    if (xb3.b()) {
                        xfh.r(vu9Var.I1, new rye(new n5g(w3d.chat_screen_action_share_post_success_copied), new Integer(yud.A), 4));
                        return qqgVar;
                    }
                }
            }
        }
        return qqgVar;
    }
}
