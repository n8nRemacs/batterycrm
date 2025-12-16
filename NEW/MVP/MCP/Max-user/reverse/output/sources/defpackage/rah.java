package defpackage;

/* loaded from: classes2.dex */
public final class rah implements sy4 {
    public final /* synthetic */ l5h a;
    public final /* synthetic */ pt1 b;

    public rah(l5h l5hVar, pt1 pt1Var) {
        this.a = l5hVar;
        this.b = pt1Var;
    }

    @Override // defpackage.sy4
    public final void dispose() {
        this.a.removeOnLayoutChangeListener(this.b);
    }
}
