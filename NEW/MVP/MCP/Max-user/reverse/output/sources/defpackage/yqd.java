package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final /* synthetic */ class yqd implements em6 {
    public final /* synthetic */ drd a;
    public final /* synthetic */ uqd b;
    public final /* synthetic */ n8a c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ yqd(drd drdVar, uqd uqdVar, n8a n8aVar, boolean z) {
        this.a = drdVar;
        this.b = uqdVar;
        this.c = n8aVar;
        this.d = z;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        return drd.d(this.a, this.b, this.c, this.d, (Continuation) obj);
    }
}
