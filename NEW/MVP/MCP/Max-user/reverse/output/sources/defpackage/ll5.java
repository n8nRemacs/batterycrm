package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ll5 implements oa8, pa8, fu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ ll5(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.fu3
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((a5c) obj).i0(this.b);
                break;
            default:
                a5c a5cVar = (a5c) obj;
                a5cVar.m0();
                a5cVar.a.t1(this.b);
                break;
        }
    }

    @Override // defpackage.oa8
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((q3c) obj).j(this.b);
                break;
            case 1:
                ((r3c) obj).j(this.b);
                break;
            default:
                ((r3c) obj).j(this.b);
                break;
        }
    }
}
