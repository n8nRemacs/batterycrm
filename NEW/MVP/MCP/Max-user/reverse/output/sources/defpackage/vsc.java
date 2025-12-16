package defpackage;

import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class vsc implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ ysc b;

    public /* synthetic */ vsc(ysc yscVar, int i) {
        this.a = i;
        this.b = yscVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((lhd) obj).d(this.b.X);
                break;
            case 1:
                ((lhd) obj).d(this.b.X);
                break;
            case 2:
                ((lhd) obj).d(this.b.X);
                break;
            default:
                this.b.a((Throwable) obj);
                break;
        }
    }
}
