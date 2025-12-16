package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zd9 extends dtf implements sm6 {
    public final /* synthetic */ List X;
    public final /* synthetic */ ce9 Y;
    public final /* synthetic */ zc9 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd9(List list, ce9 ce9Var, zc9 zc9Var, Continuation continuation) {
        super(2, continuation);
        this.X = list;
        this.Y = ce9Var;
        this.Z = zc9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zd9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zd9(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        List<lc9> list = this.X;
        if (i == 0) {
            g8j.b(obj);
            int i2 = 14;
            List listO = lee.o(new nhg(lee.g(new at(2, list), new wu7(i2, this.Z)), new wm7(i2)));
            if (listO.isEmpty()) {
                return list;
            }
            this.o = 1;
            obj = this.Y.u(listO, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        Iterable iterable = (Iterable) obj;
        int i3 = to8.i(we3.q(iterable, 10));
        if (i3 < 16) {
            i3 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
        for (Object obj2 : iterable) {
            linkedHashMap.put(new Long(((lc9) obj2).a), obj2);
        }
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        for (lc9 lc9Var : list) {
            lc9 lc9Var2 = (lc9) linkedHashMap.get(new Long(lc9Var.a));
            if (lc9Var2 != null) {
                lc9Var = lc9Var2;
            }
            arrayList.add(lc9Var);
        }
        return arrayList;
    }
}
