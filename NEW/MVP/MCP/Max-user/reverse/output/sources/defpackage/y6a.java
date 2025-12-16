package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class y6a extends k2 {
    public transient x6a X;

    @Override // defpackage.k2
    public final Map c() {
        Map map = this.d;
        return map instanceof NavigableMap ? new u2(this, (NavigableMap) map) : map instanceof SortedMap ? new x2(this, (SortedMap) map) : new s2(this, map, 0);
    }

    @Override // defpackage.k2
    public final Collection d() {
        return (List) this.X.get();
    }

    @Override // defpackage.k2
    public final Set e() {
        Map map = this.d;
        return map instanceof NavigableMap ? new v2(this, (NavigableMap) map) : map instanceof SortedMap ? new y2(this, (SortedMap) map) : new t2(this, map);
    }
}
