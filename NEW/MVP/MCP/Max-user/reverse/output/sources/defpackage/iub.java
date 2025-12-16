package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class iub extends dtf implements sm6 {
    public final /* synthetic */ ArrayList X;
    public final /* synthetic */ kub Y;
    public final /* synthetic */ ArrayList Z;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iub(ArrayList arrayList, kub kubVar, ArrayList arrayList2, Continuation continuation) {
        super(2, continuation);
        this.X = arrayList;
        this.Y = kubVar;
        this.Z = arrayList2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((iub) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        iub iubVar = new iub(this.X, this.Y, this.Z, continuation);
        iubVar.o = obj;
        return iubVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        iub iubVar = this;
        g8j.b(obj);
        f84 f84Var = (f84) iubVar.o;
        ArrayList arrayList = new ArrayList();
        Iterator it = iubVar.X.iterator();
        while (it.hasNext()) {
            ytb ytbVar = (ytb) it.next();
            if (!d7j.f(f84Var)) {
                return hd5.a;
            }
            ytb ytbVarA = kub.a(iubVar.Y, ytbVar, iubVar.Z);
            String str = ytbVar.d;
            if (ytbVarA != null) {
                String str2 = ytbVarA.d;
                if (!ytbVarA.equals(ytbVar)) {
                    Long lD = kub.d(str2);
                    Long lD2 = kub.d(str);
                    if (lD == null || !lD.equals(lD2)) {
                        arrayList.add(new ytb(ytbVarA.a, ytbVarA.b, ytbVar.c, ytbVar.d, ytbVarA.o, null, ytbVar.Y, ytbVar.Z, ytbVar.s0, az1.v(str.equals(str2) ? ytbVarA.t0 : ytbVar.t0)));
                    }
                }
            }
            iubVar = this;
        }
        return arrayList;
    }
}
