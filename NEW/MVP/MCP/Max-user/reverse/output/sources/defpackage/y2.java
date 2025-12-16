package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public class y2 extends t2 implements SortedSet {
    public final /* synthetic */ y6a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(y6a y6aVar, SortedMap sortedMap) {
        super(y6aVar, sortedMap);
        this.d = y6aVar;
    }

    public SortedMap a() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new y2(this.d, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new y2(this.d, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new y2(this.d, a().tailMap(obj));
    }
}
