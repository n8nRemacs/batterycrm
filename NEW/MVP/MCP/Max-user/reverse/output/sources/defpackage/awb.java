package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class awb extends dtf implements sm6 {
    public final /* synthetic */ gwb X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awb(gwb gwbVar, Continuation continuation) {
        super(2, continuation);
        this.X = gwbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        awb awbVar = (awb) l((cjg) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        awbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        awb awbVar = new awb(this.X, continuation);
        awbVar.o = obj;
        return awbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cjg cjgVar = (cjg) this.o;
        double dDoubleValue = ((Number) cjgVar.a).doubleValue();
        double dDoubleValue2 = ((Number) cjgVar.b).doubleValue();
        String str = (String) cjgVar.c;
        gwb gwbVar = this.X;
        tcf tcfVar = gwbVar.Y;
        Double d = ((yvb) tcfVar.getValue()).a;
        Double d2 = ((yvb) tcfVar.getValue()).b;
        n5g n5gVar = (d == null || d2 == null || !((xzf) gwbVar.c.getValue()).c(dDoubleValue, dDoubleValue2, d.doubleValue(), d2.doubleValue())) ? new n5g(s3d.oneme_location_map_send_place) : new n5g(s3d.oneme_location_map_send_geolocation);
        tcfVar.m(null, yvb.a((yvb) tcfVar.getValue(), null, null, new Double(dDoubleValue), new Double(dDoubleValue2), n5gVar, str, false, 3));
        return qqg.a;
    }
}
