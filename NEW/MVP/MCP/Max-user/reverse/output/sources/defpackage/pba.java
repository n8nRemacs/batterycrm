package defpackage;

import com.my.tracker.applifecycle.MyTrackerAppLifecycle;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.handlers.MyTrackerActivityHandler;
import com.my.tracker.core.utils.BiConsumer;

/* loaded from: classes.dex */
public final /* synthetic */ class pba implements BiConsumer {
    @Override // com.my.tracker.core.utils.BiConsumer
    public final void accept(Object obj, Object obj2) {
        MyTrackerAppLifecycle.a((EngineCore) obj, (MyTrackerActivityHandler) obj2);
    }
}
