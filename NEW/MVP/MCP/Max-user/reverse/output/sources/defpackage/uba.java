package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import one.me.android.di.ConcurrentComponent;

/* loaded from: classes.dex */
public final class uba implements ava {
    public static final uba a = new uba();
    public static final ContextScope b = d7j.a(((q2b) ConcurrentComponent.INSTANCE.getDispatchers()).a().limitedParallelism(1, "mytracker").plus(eoi.a()));
    public static final jve c;
    public static final gbd d;

    static {
        jve jveVarB = kve.b(1, 0, 2);
        c = jveVarB;
        d = new gbd(jveVarB);
    }
}
