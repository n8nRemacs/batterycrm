package com.avito.android.inline_filters.dialog.category_nodes;

import com.avito.android.inline_filters.dialog.category_nodes.adapter.NodeItem;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryTreeResolver.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/x;", "Lcom/avito/android/inline_filters/dialog/category_nodes/w;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CategoryTree f171513a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f171514b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f171515c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TreeNode f171516d;

    public x(@Y61.k CategoryTree categoryTree) {
        this.f171513a = categoryTree;
        this.f171516d = categoryTree.f171392c;
        for (TreeNode treeNode : categoryTree.f171393d) {
            this.f171514b.put(Integer.valueOf(treeNode.f171397e), treeNode.f171400h);
        }
        ArrayList arrayList = this.f171513a.f171393d;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((TreeNode) it.next()).f171397e));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            LinkedHashMap linkedHashMap = this.f171515c;
            Integer numValueOf = Integer.valueOf(iIntValue);
            ArrayList arrayList3 = this.f171513a.f171393d;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : arrayList3) {
                Integer num = ((TreeNode) obj).f171400h;
                if (num != null && num.intValue() == iIntValue) {
                    arrayList4.add(obj);
                }
            }
            linkedHashMap.put(numValueOf, arrayList4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
    @Override // com.avito.android.inline_filters.dialog.category_nodes.w
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(@Y61.l java.lang.Integer r27, @Y61.k java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.inline_filters.dialog.category_nodes.x.a(java.lang.Integer, java.lang.String):java.util.ArrayList");
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.w
    @Y61.k
    public final String b() {
        return this.f171516d.f171399g;
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.w
    @Y61.l
    public final Integer c(int i12, @Y61.l Integer num, @Y61.l Integer num2) {
        boolean z12;
        LinkedHashMap linkedHashMap = this.f171514b;
        boolean zContains = false;
        if (num != null) {
            Integer num3 = num;
            z12 = false;
            while (num3 != null) {
                num3 = (Integer) linkedHashMap.get(num3);
                if (num3 != null && num3.intValue() == i12) {
                    z12 = true;
                }
            }
        } else {
            z12 = false;
        }
        if (z12) {
            if (num2 != null) {
                ArrayList arrayList = new ArrayList();
                while (num2 != null) {
                    arrayList.add(num2);
                    num2 = (Integer) linkedHashMap.get(num2);
                }
                zContains = arrayList.contains(Integer.valueOf(i12));
            }
            if (!zContains) {
                return num;
            }
        }
        return e(i12);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.w
    @Y61.k
    public final ArrayList d(int i12) {
        ArrayList arrayList = new ArrayList();
        Integer numValueOf = Integer.valueOf(i12);
        while (numValueOf != null) {
            arrayList.add(numValueOf);
            numValueOf = (Integer) this.f171514b.get(numValueOf);
        }
        List listQ0 = C42745f0.q0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listQ0.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            LinkedHashMap linkedHashMap = this.f171515c;
            List<TreeNode> list = (List) linkedHashMap.get(Integer.valueOf(iIntValue));
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            int i14 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i14 = -1;
                    break;
                }
                if (((NodeItem) it2.next()).f171408e == iIntValue) {
                    break;
                }
                i14++;
            }
            int i15 = i14 < 0 ? 0 : i14;
            if (list != null) {
                for (TreeNode treeNode : list) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(treeNode.f171397e);
                    sb2.append('_');
                    sb2.append(treeNode.f171400h);
                    String string = sb2.toString();
                    int i16 = treeNode.f171397e;
                    ArrayList arrayList4 = arrayList3;
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    arrayList4.add(new NodeItem(string, treeNode.f171394b, treeNode.f171395c, i16, treeNode.f171398f, treeNode.f171399g, null, treeNode.f171400h, i16 == i12, i13, treeNode.f171401i, O2.a((List) linkedHashMap.get(Integer.valueOf(i16))), listQ0.contains(Integer.valueOf(treeNode.f171397e)), treeNode.f171402j, treeNode.f171403k, 64, null));
                    arrayList3 = arrayList4;
                    linkedHashMap = linkedHashMap2;
                }
            }
            ArrayList arrayList5 = arrayList3;
            if (arrayList2.isEmpty()) {
                arrayList2.addAll(arrayList5);
            } else {
                arrayList2.addAll(i15 + 1, arrayList5);
            }
            i13++;
        }
        return arrayList2;
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.w
    @Y61.l
    public final Integer e(int i12) {
        Object next;
        List list = (List) this.f171515c.get(Integer.valueOf(i12));
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((TreeNode) next).f171396d) {
                break;
            }
        }
        TreeNode treeNode = (TreeNode) next;
        if (treeNode != null) {
            return Integer.valueOf(treeNode.f171397e);
        }
        return null;
    }
}
