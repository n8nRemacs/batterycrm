package defpackage;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class x4h {
    public final ReentrantLock a = new ReentrantLock();
    public final LinkedHashMap b = new LinkedHashMap();
    public final jve c;
    public final k18 d;
    public final g56 e;

    public x4h(k18 k18Var) {
        jve jveVarA = kve.a(1, 1, 2);
        this.c = jveVarA;
        this.d = k18Var;
        this.e = new g56(new m11(22, new z41(jveVarA, new xnb(((hw1) ((tv1) k18Var.getValue())).b1, 13), new em1(3, null, 5), 3)), new u4h(2, null), 1);
    }

    public final void a(View view, vch vchVar) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            ly4 ly4Var = null;
            if (view.isAttachedToWindow() && vchVar != null && vchVar.a && view.getMeasuredWidth() != 0 && view.getMeasuredHeight() != 0) {
                ly4Var = new ly4(vchVar.b, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
            LinkedHashMap linkedHashMap = this.b;
            if (ly4Var == null) {
                boolean zC = c(view);
                wqi.c("CallVideoDisplayLayoutUpdater", hashCode() + " display layout " + view.hashCode() + " is empty, skip. old value from cache was removed = " + zC + ". total = " + linkedHashMap.size(), new Object[0]);
                return;
            }
            boolean zA = fni.a(linkedHashMap.get(view), ly4Var);
            jve jveVar = this.c;
            if (zA) {
                wqi.c("CallVideoDisplayLayoutUpdater", hashCode() + " display layout " + view.hashCode() + ", already added with params = " + ly4Var + ", simple update. total = " + linkedHashMap.size(), new Object[0]);
                jveVar.h(linkedHashMap);
                return;
            }
            nn8 nn8Var = new nn8();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!fni.a(entry.getKey(), view)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            nn8Var.putAll(linkedHashMap2);
            nn8Var.put(view, ly4Var);
            nn8 nn8VarB = nn8Var.b();
            linkedHashMap.clear();
            linkedHashMap.putAll(nn8VarB);
            wqi.c("CallVideoDisplayLayoutUpdater", hashCode() + " add display layout " + view.hashCode() + ", params = " + ly4Var + ", total = " + linkedHashMap.size(), new Object[0]);
            jveVar.h(nn8VarB);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b() {
        wqi.c("CallVideoDisplayLayoutUpdater", hashCode() + " clear cached states", new Object[0]);
        this.b.clear();
        this.c.h(id5.a);
    }

    public final boolean c(View view) {
        LinkedHashMap linkedHashMap = this.b;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            if (!linkedHashMap.containsKey(view)) {
                reentrantLock.unlock();
                return false;
            }
            nn8 nn8Var = new nn8();
            nn8Var.clear();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Object value = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (fni.a(entry.getKey(), view)) {
                    value = entry.getValue();
                }
                if (!fni.a(entry.getKey(), view)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            nn8Var.putAll(linkedHashMap2);
            nn8 nn8VarB = nn8Var.b();
            linkedHashMap.clear();
            linkedHashMap.putAll(nn8VarB);
            this.c.h(nn8VarB);
            wqi.c("CallVideoDisplayLayoutUpdater", hashCode() + " remove display layout participantId=" + value + " for " + view.hashCode() + ", total = " + linkedHashMap.size(), new Object[0]);
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
