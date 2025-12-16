package defpackage;

import android.app.Activity;
import com.my.tracker.applifecycle.MyTrackerAppLifecycle;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.o.a;
import com.my.tracker.core.utils.BiConsumer;
import com.my.tracker.core.utils.Consumer;
import com.my.tracker.core.utils.TimePoint;

/* loaded from: classes.dex */
public final /* synthetic */ class oba implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oba(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.my.tracker.core.utils.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                MyTrackerAppLifecycle.a((Activity) this.b, (TimePoint) this.c, (EngineCore) obj);
                break;
            default:
                ((a) this.b).a((BiConsumer) this.c, (EngineCore) obj);
                break;
        }
    }
}
