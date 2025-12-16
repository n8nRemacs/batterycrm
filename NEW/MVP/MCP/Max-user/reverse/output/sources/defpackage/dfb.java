package defpackage;

import java.lang.Thread;

/* loaded from: classes2.dex */
public final /* synthetic */ class dfb implements em6 {
    public final /* synthetic */ String a;
    public final /* synthetic */ gge b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean o;

    public /* synthetic */ dfb(String str, gge ggeVar, Integer num, boolean z, boolean z2) {
        this.a = str;
        this.b = ggeVar;
        this.c = num;
        this.d = z;
        this.o = z2;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        String str = this.a;
        gge ggeVar = this.b;
        return new cfb(str, (Thread.UncaughtExceptionHandler) ggeVar.b, this.c.intValue(), ((d4b) ggeVar.d).b.b, new fmf((hmf) ggeVar.c, this.d, this.o));
    }
}
