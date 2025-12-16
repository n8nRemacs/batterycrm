package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e24 extends dtf implements sm6 {
    public final /* synthetic */ f24 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e24(f24 f24Var, Continuation continuation) {
        super(2, continuation);
        this.X = f24Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((e24) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new e24(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        xx3 xx3Var;
        Object next;
        xx3 xx3Var2;
        Object obj2;
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        f24 f24Var = this.X;
        List listD0 = ue3.d0(f24Var.a.r());
        nx3 nx3Var = (nx3) ((ay3) f24Var.b.getValue()).b().getValue();
        if (!nx3Var.b()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = listD0.size();
            for (int i2 = 0; i2 < size; i2++) {
                yyb yybVar = (yyb) listD0.get(i2);
                int i3 = yybVar.c;
                long j = yybVar.a;
                int i4 = d24.$EnumSwitchMapping$0[az1.v(i3)];
                if (i4 == 1) {
                    List list = nx3Var.c;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((xx3) next).a == j) {
                                break;
                            }
                        }
                        xx3Var = (xx3) next;
                    } else {
                        xx3Var = null;
                    }
                    if (xx3Var != null) {
                        long j2 = xx3Var.a;
                        String string = xx3Var.b.toString();
                        Uri uri = xx3Var.Y;
                        arrayList2.add(new wtb(j2, string, uri != null ? uri.toString() : null));
                    }
                } else if (i4 == 2 || i4 == 3 || i4 == 4) {
                    List list2 = nx3Var.a;
                    if (list2 != null) {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            Object next2 = it2.next();
                            long j3 = j;
                            if (((xx3) next2).a == j3) {
                                obj2 = next2;
                                break;
                            }
                            j = j3;
                        }
                        xx3Var2 = (xx3) obj2;
                    } else {
                        xx3Var2 = null;
                    }
                    if (xx3Var2 != null) {
                        arrayList.add(Long.valueOf(xx3Var2.a));
                    }
                }
            }
            b04 b04Var = new b04(arrayList, arrayList2);
            jve jveVar = f24Var.f;
            z14 z14Var = new z14(b04Var);
            this.o = 1;
            Object objA = jveVar.a(z14Var, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
