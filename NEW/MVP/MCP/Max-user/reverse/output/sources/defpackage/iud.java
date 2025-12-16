package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class iud implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jud b;
    public final /* synthetic */ long c;

    public /* synthetic */ iud(jud judVar, long j, int i) {
        this.a = i;
        this.b = judVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jud judVar = this.b;
                judVar.m.offer(Long.valueOf(this.c));
                judVar.b();
                break;
            default:
                jud judVar2 = this.b;
                judVar2.f.post(new iud(judVar2, this.c, 0));
                break;
        }
    }
}
