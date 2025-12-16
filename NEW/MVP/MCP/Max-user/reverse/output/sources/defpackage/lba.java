package defpackage;

import com.my.tracker.applifecycle.MyTrackerAppLifecycle;
import com.my.tracker.core.EngineCore;
import com.my.tracker.core.EngineMiniCore;
import com.my.tracker.core.utils.Consumer;
import com.my.tracker.userlifecycle.MyTrackerUserLifecycle;

/* loaded from: classes.dex */
public final /* synthetic */ class lba implements Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ lba(int i) {
        this.a = i;
    }

    @Override // com.my.tracker.core.utils.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((EngineCore) obj).flush();
                break;
            case 1:
                MyTrackerAppLifecycle.a((EngineMiniCore) obj);
                break;
            default:
                MyTrackerUserLifecycle.a((EngineMiniCore) obj);
                break;
        }
    }
}
