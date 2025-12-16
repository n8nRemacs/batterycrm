package defpackage;

/* loaded from: classes.dex */
public final class enf extends u08 implements sm6 {
    public final /* synthetic */ char[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enf(char[] cArr) {
        super(2);
        this.a = cArr;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        int iE = vmf.E((CharSequence) obj, this.a, ((Number) obj2).intValue(), false);
        if (iE < 0) {
            return null;
        }
        return new imb(Integer.valueOf(iE), 1);
    }
}
