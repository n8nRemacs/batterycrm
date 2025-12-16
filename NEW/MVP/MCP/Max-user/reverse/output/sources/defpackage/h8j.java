package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class h8j {
    public static final void a(Continuation continuation) {
        boolean z = ug4.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = tg4.a;
        tg4 tg4Var = ug4.c;
        if (atomicIntegerFieldUpdater.get(tg4Var) > 0) {
            if (ug4.a && continuation.getContext() == bd5.a) {
                return;
            }
            h84 callerFrame = continuation instanceof h84 ? (h84) continuation : null;
            if (callerFrame != null && atomicIntegerFieldUpdater.get(tg4Var) > 0) {
                if (ug4.b.remove(callerFrame) != null) {
                    throw new ClassCastException();
                }
                do {
                    callerFrame = callerFrame.getCallerFrame();
                } while (callerFrame != null);
            }
        }
    }

    public static uqd b(dh2 dh2Var, int i) {
        String str = dh2Var.a;
        String str2 = dh2Var.b;
        Set set = dh2Var.g;
        String str3 = dh2Var.d;
        w8a w8aVar = dh2Var.i;
        u8a u8aVar = w8aVar.c;
        if (u8aVar == null) {
            u8aVar = new u8a(w8aVar);
            w8aVar.c = u8aVar;
        }
        ArrayList arrayListS = po8.s(u8aVar);
        ezd ezdVar = new ezd(dh2Var.k);
        w8a w8aVar2 = dh2Var.l;
        u8a u8aVar2 = w8aVar2.c;
        if (u8aVar2 == null) {
            u8aVar2 = new u8a(w8aVar2);
            w8aVar2.c = u8aVar2;
        }
        return new uqd(str, str2, i, str3, set, false, arrayListS, ezdVar, u8aVar2, dh2Var.h, dh2Var.c, dh2Var.f, dh2Var.j, dh2Var.m);
    }

    public static f86 c(uqd uqdVar, e7b e7bVar, Set set) {
        String str = uqdVar.a;
        String str2 = uqdVar.b;
        List list = uqdVar.g;
        CharSequence charSequenceA = e7bVar.a(str2, list, 2, false, 0, true, false);
        int i = uqdVar.c;
        List list2 = list;
        Set set2 = uqdVar.e;
        List list3 = hd5.a;
        if (list2 == null) {
            list2 = list3;
        }
        Map map = uqdVar.h;
        if (map == null) {
            map = id5.a;
        }
        List list4 = uqdVar.i;
        if (list4 != null) {
            list3 = list4;
        }
        Set set3 = uqdVar.j;
        rd5 rd5Var = rd5.a;
        if (set3 == null) {
            set3 = rd5Var;
        }
        n8a n8aVar = uqdVar.l;
        if (n8aVar == null) {
            n8aVar = dk8.a;
        }
        return new f86(str, charSequenceA, i, set2, set, list2, map, list3, set3, n8aVar, uqdVar.k, uqdVar.m, uqdVar.n, uqdVar.f, uqdVar.d, rd5Var, rd5Var);
    }
}
