package defpackage;

import android.content.pm.ApplicationInfo;
import kotlin.coroutines.Continuation;
import one.me.sdk.vendor.CheckCompileSdkVersionException;

/* loaded from: classes2.dex */
public final class rxf extends dtf implements sm6 {
    public final /* synthetic */ vxf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxf(vxf vxfVar, Continuation continuation) {
        super(2, continuation);
        this.o = vxfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        rxf rxfVar = (rxf) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rxfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rxf(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        vxf vxfVar = this.o;
        ApplicationInfo applicationInfo = vxfVar.a.getApplicationInfo();
        if (applicationInfo.compileSdkVersion != 35 || !fni.a(applicationInfo.compileSdkVersionCodename, "15")) {
            vxfVar.d().a("20416", new CheckCompileSdkVersionException("invalid compile sdk versions: " + applicationInfo.compileSdkVersion + ", " + applicationInfo.compileSdkVersionCodename));
        }
        return qqg.a;
    }
}
