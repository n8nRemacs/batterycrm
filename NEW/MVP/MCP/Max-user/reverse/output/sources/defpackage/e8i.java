package defpackage;

import com.my.tracker.core.EngineCore;
import com.my.tracker.core.utils.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class e8i implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ EngineCore.EventPacker g;

    public /* synthetic */ e8i(long j, int i, boolean z, boolean z2, long j2, EngineCore.EventPacker eventPacker, int i2) {
        this.a = i2;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = j2;
        this.g = eventPacker;
    }

    @Override // com.my.tracker.core.utils.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((EngineCore) obj).insertEventSync(this.b, this.c, this.d, this.e, this.f, this.g);
                break;
            default:
                ((EngineCore) obj).insertEventSync(this.b, this.c, this.d, this.e, this.f, this.g);
                break;
        }
    }
}
