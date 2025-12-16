package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fy3 extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy3(Object obj, Continuation continuation, String str) {
        super(2, continuation);
        this.o = obj;
        this.X = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fy3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fy3(this.o, continuation, this.X);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        g8j.b(obj);
        qtb qtbVar = (qtb) this.o;
        long j = qtbVar.a;
        String str = qtbVar.b;
        List listB = v5j.b(qtbVar);
        String str2 = qtbVar.g;
        Uri uri = str2 != null ? Uri.parse(str2) : null;
        if (qtbVar.i == null) {
            String str3 = qtbVar.c;
            String str4 = qtbVar.d;
            List list = qtbVar.e;
            if (!l8g.c(str3)) {
                qtbVar.i = r5b.b(str3, str4);
            } else if (list == null || list.isEmpty()) {
                qtbVar.i = "";
            } else {
                Pattern pattern = r5b.a;
                qtbVar.i = r5b.b((CharSequence) list.get(0), null);
            }
        }
        return new xx3(j, str, null, listB, null, this.X, uri, false, false, qtbVar.i, false, qtbVar, 0, false, false, false, false, 29696);
    }
}
