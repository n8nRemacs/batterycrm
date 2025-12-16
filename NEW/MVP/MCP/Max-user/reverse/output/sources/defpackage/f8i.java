package defpackage;

import com.my.tracker.core.EngineCore;
import com.my.tracker.core.UserInfoState;
import com.my.tracker.core.a;
import com.my.tracker.core.utils.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class f8i implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f8i(a aVar, Object obj, long j, long j2, int i) {
        this.a = i;
        this.b = aVar;
        this.e = obj;
        this.c = j;
        this.d = j2;
    }

    @Override // com.my.tracker.core.utils.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.a((Boolean) this.e, this.c, this.d, (EngineCore) obj);
                break;
            case 1:
                this.b.a((UserInfoState) this.e, this.c, this.d, (EngineCore) obj);
                break;
            default:
                this.b.a((String) this.e, this.c, this.d, (EngineCore) obj);
                break;
        }
    }
}
