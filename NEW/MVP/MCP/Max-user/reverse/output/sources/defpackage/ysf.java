package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.messages.MessageUploadException;

/* loaded from: classes2.dex */
public final class ysf extends dtf implements sm6 {
    public final /* synthetic */ zsf X;
    public final /* synthetic */ um9 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysf(zsf zsfVar, um9 um9Var, Continuation continuation) {
        super(2, continuation);
        this.X = zsfVar;
        this.Y = um9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ysf ysfVar = (ysf) l((k2h) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ysfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ysf ysfVar = new ysf(this.X, this.Y, continuation);
        ysfVar.o = obj;
        return ysfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        cl9 cl9Var = this.Y.a;
        k18 k18Var = this.X.b;
        g8j.b(obj);
        k2h k2hVar = (k2h) this.o;
        boolean z = k2hVar.b;
        String str = k2hVar.d;
        if (!z || !b6a.Q(str)) {
            String str2 = zsf.e;
            tgg tggVar = (tgg) k18Var.getValue();
            String str3 = cl9Var.c;
            tggVar.getClass();
            tgg.d(jvg.ERROR_DURING_CONVERT, str3);
            throw new MessageUploadException("conversion failed");
        }
        if (k2hVar.b) {
            String str4 = zsf.e;
            tgg tggVar2 = (tgg) k18Var.getValue();
            String str5 = cl9Var.c;
            long jU = b6a.U(str);
            tggVar2.getClass();
            kvg kvgVar = kvg.g;
            kvgVar.getClass();
            kvgVar.a(str5, new imb("size_converted", Long.valueOf(jU)));
        }
        return qqg.a;
    }
}
