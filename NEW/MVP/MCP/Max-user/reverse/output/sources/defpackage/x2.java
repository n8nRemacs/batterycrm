package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public class x2 extends s2 implements SortedMap {
    public SortedSet X;
    public final /* synthetic */ y6a Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(y6a y6aVar, SortedMap sortedMap) {
        super(y6aVar, sortedMap, 0);
        this.Y = y6aVar;
    }

    public SortedSet b() {
        return new y2(this.Y, d());
    }

    @Override // defpackage.s2, java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.X;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.X = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new x2(this.Y, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new x2(this.Y, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new x2(this.Y, d().tailMap(obj));
    }
}
