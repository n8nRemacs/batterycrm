package com.avito.android.avito_map.clustering.extra;

import IZ0.a;
import IZ0.b;
import com.avito.android.avito_map.clustering.extra.PointQuadTree.Item;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
public class PointQuadTree<T extends Item> {
    private static final int MAX_DEPTH = 40;
    private static final int MAX_ELEMENTS = 50;
    private final a mBounds;
    private List<PointQuadTree<T>> mChildren;
    private final int mDepth;
    private Set<T> mItems;

    public interface Item {
        b getPoint();
    }

    public PointQuadTree(double d12, double d13, double d14, double d15) {
        this(new a(d12, d13, d14, d15));
    }

    private void insert(double d12, double d13, T t12) {
        List<PointQuadTree<T>> list = this.mChildren;
        if (list == null) {
            if (this.mItems == null) {
                this.mItems = new HashSet();
            }
            this.mItems.add(t12);
            if (this.mItems.size() <= MAX_ELEMENTS || this.mDepth >= MAX_DEPTH) {
                return;
            }
            split();
            return;
        }
        a aVar = this.mBounds;
        if (d13 < aVar.f8203f) {
            if (d12 < aVar.f8202e) {
                list.get(0).insert(d12, d13, t12);
                return;
            } else {
                list.get(1).insert(d12, d13, t12);
                return;
            }
        }
        if (d12 < aVar.f8202e) {
            list.get(2).insert(d12, d13, t12);
        } else {
            list.get(3).insert(d12, d13, t12);
        }
    }

    private void split() {
        ArrayList arrayList = new ArrayList(4);
        this.mChildren = arrayList;
        a aVar = this.mBounds;
        arrayList.add(new PointQuadTree(aVar.f8198a, aVar.f8202e, aVar.f8199b, aVar.f8203f, this.mDepth + 1));
        List<PointQuadTree<T>> list = this.mChildren;
        a aVar2 = this.mBounds;
        list.add(new PointQuadTree<>(aVar2.f8202e, aVar2.f8200c, aVar2.f8199b, aVar2.f8203f, this.mDepth + 1));
        List<PointQuadTree<T>> list2 = this.mChildren;
        a aVar3 = this.mBounds;
        list2.add(new PointQuadTree<>(aVar3.f8198a, aVar3.f8202e, aVar3.f8203f, aVar3.f8201d, this.mDepth + 1));
        List<PointQuadTree<T>> list3 = this.mChildren;
        a aVar4 = this.mBounds;
        list3.add(new PointQuadTree<>(aVar4.f8202e, aVar4.f8200c, aVar4.f8203f, aVar4.f8201d, this.mDepth + 1));
        Set<T> set = this.mItems;
        this.mItems = null;
        for (T t12 : set) {
            insert(t12.getPoint().f8204a, t12.getPoint().f8205b, t12);
        }
    }

    public void add(T t12) {
        b point = t12.getPoint();
        if (this.mBounds.a(point.f8204a, point.f8205b)) {
            insert(point.f8204a, point.f8205b, t12);
        }
    }

    public void clear() {
        this.mChildren = null;
        Set<T> set = this.mItems;
        if (set != null) {
            set.clear();
        }
    }

    public boolean remove(T t12) {
        b point = t12.getPoint();
        if (this.mBounds.a(point.f8204a, point.f8205b)) {
            return remove(point.f8204a, point.f8205b, t12);
        }
        return false;
    }

    public Collection<T> search(a aVar) {
        ArrayList arrayList = new ArrayList();
        search(aVar, arrayList);
        return arrayList;
    }

    public PointQuadTree(a aVar) {
        this(aVar, 0);
    }

    private PointQuadTree(double d12, double d13, double d14, double d15, int i12) {
        this(new a(d12, d13, d14, d15), i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void search(IZ0.a r8, java.util.Collection<T> r9) {
        /*
            r7 = this;
            IZ0.a r0 = r7.mBounds
            r0.getClass()
            double r1 = r8.f8198a
            double r3 = r0.f8200c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L27
            double r1 = r0.f8198a
            double r3 = r8.f8200c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L27
            double r1 = r0.f8201d
            double r3 = r8.f8199b
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L27
            double r0 = r0.f8199b
            double r2 = r8.f8201d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            if (r0 != 0) goto L2b
            return
        L2b:
            java.util.List<com.avito.android.avito_map.clustering.extra.PointQuadTree<T extends com.avito.android.avito_map.clustering.extra.PointQuadTree$Item>> r0 = r7.mChildren
            if (r0 == 0) goto L43
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L98
            java.lang.Object r1 = r0.next()
            com.avito.android.avito_map.clustering.extra.PointQuadTree r1 = (com.avito.android.avito_map.clustering.extra.PointQuadTree) r1
            r1.search(r8, r9)
            goto L33
        L43:
            java.util.Set<T extends com.avito.android.avito_map.clustering.extra.PointQuadTree$Item> r0 = r7.mItems
            if (r0 == 0) goto L98
            IZ0.a r0 = r7.mBounds
            double r1 = r0.f8198a
            double r3 = r8.f8198a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L6b
            double r1 = r0.f8200c
            double r3 = r8.f8200c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L6b
            double r1 = r0.f8199b
            double r3 = r8.f8199b
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L6b
            double r0 = r0.f8201d
            double r2 = r8.f8201d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L6b
            r0 = 1
            goto L6c
        L6b:
            r0 = 0
        L6c:
            if (r0 == 0) goto L74
            java.util.Set<T extends com.avito.android.avito_map.clustering.extra.PointQuadTree$Item> r8 = r7.mItems
            r9.addAll(r8)
            goto L98
        L74:
            java.util.Set<T extends com.avito.android.avito_map.clustering.extra.PointQuadTree$Item> r0 = r7.mItems
            java.util.Iterator r0 = r0.iterator()
        L7a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L98
            java.lang.Object r1 = r0.next()
            com.avito.android.avito_map.clustering.extra.PointQuadTree$Item r1 = (com.avito.android.avito_map.clustering.extra.PointQuadTree.Item) r1
            IZ0.b r2 = r1.getPoint()
            double r3 = r2.f8204a
            double r5 = r2.f8205b
            boolean r2 = r8.a(r3, r5)
            if (r2 == 0) goto L7a
            r9.add(r1)
            goto L7a
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.avito_map.clustering.extra.PointQuadTree.search(IZ0.a, java.util.Collection):void");
    }

    private PointQuadTree(a aVar, int i12) {
        this.mChildren = null;
        this.mBounds = aVar;
        this.mDepth = i12;
    }

    private boolean remove(double d12, double d13, T t12) {
        List<PointQuadTree<T>> list = this.mChildren;
        if (list != null) {
            a aVar = this.mBounds;
            if (d13 < aVar.f8203f) {
                if (d12 < aVar.f8202e) {
                    return list.get(0).remove(d12, d13, t12);
                }
                return list.get(1).remove(d12, d13, t12);
            }
            if (d12 < aVar.f8202e) {
                return list.get(2).remove(d12, d13, t12);
            }
            return list.get(3).remove(d12, d13, t12);
        }
        Set<T> set = this.mItems;
        if (set == null) {
            return false;
        }
        return set.remove(t12);
    }
}
