package defpackage;

import one.me.android.OneMeApplication;

/* loaded from: classes.dex */
public final /* synthetic */ class qwa {
    public static void a(Throwable th) {
        rwa rwaVar = OneMeApplication.s0;
        try {
            wqi.e("Payload", "error while parse payload", th);
            ((vxf) t1b.a.getAccessor().c(74)).d().a(null, th);
        } catch (Throwable th2) {
            wqi.e("Payload", "failed to collect exception", th2);
        }
    }
}
