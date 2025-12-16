package defpackage;

/* loaded from: classes2.dex */
public final class hah implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5h b;

    public /* synthetic */ hah(l5h l5hVar, int i) {
        this.a = i;
        this.b = l5hVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.setVisibility(8);
                break;
            default:
                this.b.setVisibility(0);
                break;
        }
        return qqg.a;
    }
}
