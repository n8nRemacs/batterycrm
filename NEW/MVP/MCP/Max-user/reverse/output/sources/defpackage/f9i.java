package defpackage;

import com.my.tracker.applifecycle.o.d;
import com.my.tracker.core.EngineCore;

/* loaded from: classes.dex */
public final /* synthetic */ class f9i implements EngineCore.EventPacker {
    public final /* synthetic */ long X;
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ long o;

    public /* synthetic */ f9i(d dVar, String str, String str2, long j, long j2, int i) {
        this.a = i;
        this.b = dVar;
        this.c = str;
        this.d = str2;
        this.o = j;
        this.X = j2;
    }

    @Override // com.my.tracker.core.EngineCore.EventPacker
    public final byte[] invoke(EngineCore.InsertEventTools insertEventTools) {
        switch (this.a) {
            case 0:
                return this.b.a(this.c, this.d, this.o, this.X, insertEventTools);
            default:
                return this.b.b(this.c, this.d, this.o, this.X, insertEventTools);
        }
    }
}
