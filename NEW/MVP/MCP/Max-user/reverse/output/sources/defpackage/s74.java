package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class s74 implements ieg {
    public final Map a;
    public final int b;

    public s74(s7c s7cVar) {
        this.a = to8.s((LinkedHashMap) s7cVar.a);
        Integer num = (Integer) s7cVar.b;
        this.b = num != null ? num.intValue() : -1;
    }

    @Override // defpackage.ieg
    public final nme a() {
        return nca.b;
    }
}
