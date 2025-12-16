package defpackage;

import android.net.Uri;
import android.util.Base64;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n8h extends dtf implements sm6 {
    public final /* synthetic */ q8h X;
    public final /* synthetic */ byte[] o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8h(byte[] bArr, q8h q8hVar, Continuation continuation) {
        super(2, continuation);
        this.o = bArr;
        this.X = q8hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        n8h n8hVar = (n8h) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        n8hVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new n8h(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        g8j.b(obj);
        Uri uri = Uri.parse("data:" + uz9.d + ";base64," + Base64.encodeToString(this.o, 2));
        tcf tcfVar = this.X.q;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, f8h.a((f8h) value, null, uri.toString(), null, 5)));
        return qqg.a;
    }
}
