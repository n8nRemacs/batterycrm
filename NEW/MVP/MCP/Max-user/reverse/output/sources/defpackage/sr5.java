package defpackage;

import ru.ok.tamtam.rx.TamTamObservables$TamObservableException;

/* loaded from: classes2.dex */
public final /* synthetic */ class sr5 implements tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ sr5(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.tm6
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new ik3(((zr5) obj).a(), 2, new sr5(1, this.b, this.c));
            case 1:
                int i = 1;
                return new kk3(i, new nv3(i, this.b, this.c, (hs5) obj));
            default:
                Throwable th = (Throwable) obj;
                long j = this.b;
                return (j <= 0 || System.currentTimeMillis() - this.c <= j) ? vqa.e(th) : vqa.e(new TamTamObservables$TamObservableException("timeout reached", th));
        }
    }
}
