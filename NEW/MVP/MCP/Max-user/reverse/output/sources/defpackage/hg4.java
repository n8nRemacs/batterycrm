package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class hg4 extends hn6 implements sm6 {
    public static final hg4 a = new hg4(2, jg4.class, "merge", "merge(Lru/ok/tamtam/android/notifications/DebounceNotificationDispatcher$DispatchParams;)Lru/ok/tamtam/android/notifications/DebounceNotificationDispatcher$DispatchParams;", 0);

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jg4 jg4Var = (jg4) obj;
        jg4 jg4Var2 = (jg4) obj2;
        jg4 jg4Var3 = jg4.e;
        if (jg4Var2 == jg4Var3) {
            return jg4Var3;
        }
        if (jg4Var == jg4Var3) {
            return jg4Var2;
        }
        boolean z = true;
        boolean z2 = jg4Var.a || jg4Var2.a;
        n8a n8aVarC = dsi.c(jg4Var.b, jg4Var2.b);
        n8a n8aVarC2 = dsi.c(jg4Var.c, jg4Var2.c);
        if (!jg4Var.d && !jg4Var2.d) {
            z = false;
        }
        return new jg4(z2, n8aVarC, n8aVarC2, z);
    }
}
