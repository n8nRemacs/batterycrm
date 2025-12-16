package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class mog implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pog b;

    public /* synthetic */ mog(pog pogVar, int i) {
        this.a = i;
        this.b = pogVar;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        switch (this.a) {
            case 0:
                oog oogVar = this.b.w0;
                if (oogVar != null) {
                    oogVar.T(charSequence);
                }
                break;
            default:
                oog oogVar2 = this.b.w0;
                if (oogVar2 != null) {
                    oogVar2.t(charSequence);
                }
                break;
        }
        return qqg.a;
    }
}
