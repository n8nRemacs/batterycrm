package defpackage;

/* loaded from: classes2.dex */
public final class lq3 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq3 b;
    public final /* synthetic */ jq3 c;

    public /* synthetic */ lq3(mq3 mq3Var, jq3 jq3Var, int i) {
        this.a = i;
        this.b = mq3Var;
        this.c = jq3Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                em6 onAnimationEnded = this.b.getOnAnimationEnded();
                if (onAnimationEnded != null) {
                    onAnimationEnded.invoke(this.c);
                }
                break;
            case 1:
                em6 onAnimationEnded2 = this.b.getOnAnimationEnded();
                if (onAnimationEnded2 != null) {
                    onAnimationEnded2.invoke(this.c);
                }
                break;
            default:
                mq3 mq3Var = this.b;
                mq3Var.K0();
                em6 onAnimationEnded3 = mq3Var.getOnAnimationEnded();
                if (onAnimationEnded3 != null) {
                    onAnimationEnded3.invoke(this.c);
                }
                break;
        }
        return qqg.a;
    }
}
