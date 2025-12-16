package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class kub implements ui8 {
    public final k18 X;
    public final CopyOnWriteArraySet Y = new CopyOnWriteArraySet();
    public final AtomicInteger Z;
    public final Context a;
    public final tw0 b;
    public final yi5 c;
    public final k18 d;
    public final k18 o;
    public final tcf s0;
    public final ContextScope t0;
    public boolean u0;

    public kub(Context context, k18 k18Var, k18 k18Var2, k18 k18Var3, tw0 tw0Var, lzf lzfVar, a84 a84Var, yi5 yi5Var) {
        this.a = context;
        this.b = tw0Var;
        this.c = yi5Var;
        this.d = k18Var;
        this.o = k18Var2;
        this.X = k18Var3;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.Z = atomicInteger;
        tcf tcfVarA = ucf.a(Integer.valueOf(atomicInteger.get()));
        this.s0 = tcfVarA;
        ContextScope contextScopeA = d7j.a(new lj5(((q2b) lzfVar).e().f(1, "phonebook", 1, 1, false)).plus(a84Var));
        this.t0 = contextScopeA;
        e();
        yh0 yh0Var = new yh0(tcfVarA, 12);
        int i = s65.d;
        gw0.w(new g56(zs0.g(yh0Var, v9j.h(5, y65.SECONDS)), new eub(this, null), 1), contextScopeA);
    }

    public static final ytb a(kub kubVar, ytb ytbVar, List list) {
        Long lD = d(ytbVar.d);
        Object obj = null;
        if (lD != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (lD.equals(d(((ytb) next).d))) {
                    obj = next;
                    break;
                }
            }
            return (ytb) obj;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (fni.a(ytbVar.d, ((ytb) next2).d)) {
                obj = next2;
                break;
            }
        }
        return (ytb) obj;
    }

    public static Long d(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        if (string.length() == 0) {
            return null;
        }
        char cCharAt2 = string.charAt(0);
        if (cCharAt2 != '7') {
            if (cCharAt2 != '8') {
                return null;
            }
            string = "7".concat(vmf.u(1, string));
        }
        return cnf.i(string);
    }

    public final void b() {
        Object value;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "Phonebook", "call checkUpdates from: ".concat(saj.d(new RuntimeException())), null);
            }
        }
        tcf tcfVar = this.s0;
        do {
            value = tcfVar.getValue();
            ((Number) value).intValue();
        } while (!tcfVar.c(value, Integer.valueOf(this.Z.incrementAndGet())));
    }

    @Override // defpackage.ui8
    public final void c() {
        d7j.c(this.t0, null);
    }

    public final void e() {
        if (!((qsb) ((iya) this.o.getValue()).a.getValue()).c(qsb.f)) {
            wqi.c("Phonebook", "subscribeOnSystemChanges: no permissions, return", new Object[0]);
        } else {
            if (this.u0) {
                return;
            }
            this.u0 = true;
            this.a.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, new ob4(this, new Handler(Looper.getMainLooper())));
        }
    }
}
