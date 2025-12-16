package kotlinx.coroutines.internal;

import defpackage.ho7;
import defpackage.z74;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "Lqqg;", "checkParallelism", "(I)V", "Lz74;", "", SdkMetricStatEvent.NAME_KEY, "namedOrThis", "(Lz74;Ljava/lang/String;)Lz74;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LimitedDispatcherKt {
    public static final void checkParallelism(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(ho7.f(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final z74 namedOrThis(z74 z74Var, String str) {
        return str != null ? new NamedDispatcher(z74Var, str) : z74Var;
    }
}
