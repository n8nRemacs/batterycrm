package defpackage;

/* loaded from: classes.dex */
public final class vai implements ff0 {
    public final /* synthetic */ xv6 a;

    public vai(xv6 xv6Var) {
        this.a = xv6Var;
    }

    @Override // defpackage.ff0
    public final void a(boolean z) {
        y1a y1aVar = this.a.w0;
        y1aVar.sendMessage(y1aVar.obtainMessage(1, Boolean.valueOf(z)));
    }
}
