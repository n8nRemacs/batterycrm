package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class g88 implements en6 {
    public final /* synthetic */ h88 a;

    public g88(h88 h88Var) {
        this.a = h88Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g88) || obj == null) {
            return false;
        }
        return getFunctionDelegate().equals(((en6) obj).getFunctionDelegate());
    }

    @Override // defpackage.en6
    public final xm6 getFunctionDelegate() {
        return new hn6(2, 0, h88.class, this.a, "onMessageElementClick", "onMessageElementClick(Landroid/view/View;Lru/ok/tamtam/models/MessageElementData;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
