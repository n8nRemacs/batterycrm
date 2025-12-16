package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fwb extends dtf implements sm6 {
    public final /* synthetic */ gwb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwb(gwb gwbVar, Continuation continuation) {
        super(2, continuation);
        this.o = gwbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fwb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fwb(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ccb ccbVar = (ccb) this.o.X.getValue();
        ccbVar.g(new n5g(s3d.oneme_location_map_location_error));
        return ccbVar.i();
    }
}
