package defpackage;

import com.my.tracker.core.EngineCore;
import com.my.tracker.userlifecycle.o.a;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class c8i implements EngineCore.EventPacker {
    public final /* synthetic */ String X;
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String o;

    public /* synthetic */ c8i(a aVar, Map map, boolean z, String str, String str2, int i) {
        this.a = i;
        this.b = aVar;
        this.c = map;
        this.d = z;
        this.o = str;
        this.X = str2;
    }

    @Override // com.my.tracker.core.EngineCore.EventPacker
    public final byte[] invoke(EngineCore.InsertEventTools insertEventTools) {
        switch (this.a) {
            case 0:
                return this.b.b(this.c, this.d, this.o, this.X, insertEventTools);
            default:
                return this.b.a(this.c, this.d, this.o, this.X, insertEventTools);
        }
    }
}
