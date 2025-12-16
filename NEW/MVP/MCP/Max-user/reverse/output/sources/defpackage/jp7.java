package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes2.dex */
public final class jp7 {
    public final ytd a;

    public jp7(ytd ytdVar) {
        this.a = ytdVar;
    }

    public final void a(boolean z) {
        Bundle bundle;
        Object objPrevious;
        c54 c54Var;
        if (z) {
            bundle = new Bundle();
            bundle.putString("screen:input_phone:phone", "");
        } else {
            bundle = null;
        }
        ytd ytdVar = this.a;
        ArrayList arrayListE = ytdVar.e();
        HashSet hashSet = new HashSet();
        Iterator it = new fqd(ytdVar.e()).iterator();
        while (true) {
            ListIterator listIterator = ((eqd) it).b;
            if (!listIterator.hasPrevious()) {
                break;
            }
            bud budVar = (bud) listIterator.previous();
            if (fni.a(budVar.b, "InputPhoneScreen")) {
                break;
            } else {
                hashSet.add(budVar);
            }
        }
        ListIterator listIterator2 = arrayListE.listIterator(arrayListE.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator2.previous();
                if (fni.a(((bud) objPrevious).b, "InputPhoneScreen")) {
                    break;
                }
            }
        }
        bud budVar2 = (bud) objPrevious;
        if (budVar2 == null || (c54Var = budVar2.a) == null) {
            return;
        }
        if (bundle != null) {
            c54Var.getArgs().clear();
            c54Var.getArgs().putAll(bundle);
        }
        arrayListE.removeAll(hashSet);
        ytdVar.Q(arrayListE, null);
    }

    public final void b(bud budVar, String str) {
        budVar.d(str);
        budVar.c(new p67(0));
        budVar.a(new p67(0));
        this.a.H(budVar);
    }
}
