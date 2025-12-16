package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s7a implements z26 {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ b8a d;
    public final /* synthetic */ long o;

    public s7a(long j, String str, String str2, b8a b8aVar, long j2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = b8aVar;
        this.o = j2;
    }

    @Override // defpackage.z26
    public final Object a(Object obj, Continuation continuation) {
        if (((xz4) obj).b == 3) {
            int i = b8a.U0;
            StringBuilder sb = new StringBuilder();
            long j = this.a;
            sb.append(j);
            sb.append(" | ");
            String str = this.b;
            sb.append(str);
            sb.append(" is loaded, ");
            sb.append(this.c);
            wqi.c("b8a", sb.toString(), new Object[0]);
            b8a b8aVar = this.d;
            b8aVar.d.r(j, str, new p89(21));
            b8aVar.X.c(new itg(this.o, this.a, false));
        }
        return qqg.a;
    }
}
