package defpackage;

import java.lang.ref.SoftReference;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class nqa extends fu0 {
    public LinkedList e;

    @Override // defpackage.fu0
    public final void a(Object obj) {
        mqa mqaVar = (mqa) this.e.poll();
        if (mqaVar == null) {
            mqaVar = new mqa();
            mqaVar.a = null;
            mqaVar.b = null;
            mqaVar.c = null;
        }
        mqaVar.a = new SoftReference(obj);
        mqaVar.b = new SoftReference(obj);
        mqaVar.c = new SoftReference(obj);
        this.c.add(mqaVar);
    }

    @Override // defpackage.fu0
    public final Object b() {
        mqa mqaVar = (mqa) this.c.poll();
        mqaVar.getClass();
        SoftReference softReference = mqaVar.a;
        Object obj = softReference == null ? null : softReference.get();
        SoftReference softReference2 = mqaVar.a;
        if (softReference2 != null) {
            softReference2.clear();
            mqaVar.a = null;
        }
        SoftReference softReference3 = mqaVar.b;
        if (softReference3 != null) {
            softReference3.clear();
            mqaVar.b = null;
        }
        SoftReference softReference4 = mqaVar.c;
        if (softReference4 != null) {
            softReference4.clear();
            mqaVar.c = null;
        }
        this.e.add(mqaVar);
        return obj;
    }
}
