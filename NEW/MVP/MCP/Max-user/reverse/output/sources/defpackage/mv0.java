package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public final /* synthetic */ class mv0 extends hn6 implements um6 {
    public static final mv0 a = new mv0(3, pv0.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        pv0 pv0Var = (pv0) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = pv0.b;
        pv0Var.getClass();
        if (obj3 == rv0.l) {
            obj3 = new la2(pv0Var.p());
        }
        return new na2(obj3);
    }
}
