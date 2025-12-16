package defpackage;

import android.app.Activity;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.handlers.MyTrackerActivityHandler;
import com.my.tracker.core.utils.BiConsumer;
import com.my.tracker.core.utils.TimePoint;

/* loaded from: classes.dex */
public final /* synthetic */ class d8i implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ TimePoint c;

    public /* synthetic */ d8i(Activity activity, TimePoint timePoint, int i) {
        this.a = i;
        this.b = activity;
        this.c = timePoint;
    }

    @Override // com.my.tracker.core.utils.BiConsumer
    public final void accept(Object obj, Object obj2) {
        EngineCore engineCore = (EngineCore) obj;
        MyTrackerActivityHandler myTrackerActivityHandler = (MyTrackerActivityHandler) obj2;
        switch (this.a) {
            case 0:
                myTrackerActivityHandler.handleOnActivityStopped(engineCore, this.b, this.c);
                break;
            default:
                myTrackerActivityHandler.handleOnActivityStarted(engineCore, this.b, this.c);
                break;
        }
    }
}
