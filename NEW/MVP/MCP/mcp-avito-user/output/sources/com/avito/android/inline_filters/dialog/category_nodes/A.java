package com.avito.android.inline_filters.dialog.category_nodes;

import com.avito.android.inline_filters.dialog.category_nodes.adapter.NodeItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ProfileCategoryTreeResolver.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/A;", "Lcom/avito/android/inline_filters/dialog/category_nodes/w;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CategoryTree f171379a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f171380b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f171381c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TreeNode f171382d;

    public A(@Y61.k CategoryTree categoryTree) {
        this.f171379a = categoryTree;
        this.f171382d = categoryTree.f171392c;
        for (TreeNode treeNode : categoryTree.f171393d) {
            this.f171380b.put(Integer.valueOf(treeNode.f171397e), treeNode.f171400h);
        }
        ArrayList arrayList = this.f171379a.f171393d;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((TreeNode) it.next()).f171397e));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            LinkedHashMap linkedHashMap = this.f171381c;
            Integer numValueOf = Integer.valueOf(iIntValue);
            ArrayList arrayList3 = this.f171379a.f171393d;
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

    public static NodeItem f(TreeNode treeNode, Integer num, int i12, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(treeNode.f171397e);
        sb2.append('_');
        sb2.append(treeNode.f171400h);
        String string = sb2.toString();
        int i13 = treeNode.f171397e;
        return new NodeItem(string, treeNode.f171394b, treeNode.f171395c, i13, treeNode.f171398f, treeNode.f171399g, str, treeNode.f171400h, num != null && i13 == num.intValue(), i12, treeNode.f171401i, false, false, null, null, 30720, null);
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.w
    @Y61.k
    public final ArrayList a(@Y61.l Integer num, @Y61.k String str) {
        String str2;
        Object next;
        ArrayList arrayList = new ArrayList();
        CategoryTree categoryTree = this.f171379a;
        ArrayList arrayList2 = categoryTree.f171393d;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (C43066x.q(((TreeNode) obj).f171399g, str, true)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((TreeNode) it.next()).f171400h);
        }
        ArrayList arrayList5 = categoryTree.f171393d;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : arrayList5) {
            if (arrayList4.contains(Integer.valueOf(((TreeNode) obj2).f171397e))) {
                arrayList6.add(obj2);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            TreeNode treeNode = (TreeNode) it2.next();
            Iterator it3 = arrayList6.iterator();
            while (true) {
                str2 = null;
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                int i12 = ((TreeNode) next).f171397e;
                Integer num2 = treeNode.f171400h;
                if (num2 != null && i12 == num2.intValue()) {
                    break;
                }
            }
            TreeNode treeNode2 = (TreeNode) next;
            if (treeNode2 != null) {
                str2 = treeNode2.f171399g;
            }
            arrayList.add(f(treeNode, num, 0, str2));
        }
        return arrayList;
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.w
    @Y61.k
    public final String b() {
        return this.f171382d.f171399g;
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.w
    @Y61.l
    public final Integer c(int i12, @Y61.l Integer num, @Y61.l Integer num2) {
        return null;
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.w
    @Y61.k
    public final ArrayList d(int i12) {
        Object next;
        int i13;
        ArrayList arrayList = new ArrayList();
        Integer numValueOf = Integer.valueOf(i12);
        while (numValueOf != null) {
            arrayList.add(numValueOf);
            numValueOf = (Integer) this.f171380b.get(numValueOf);
        }
        List listQ0 = C42745f0.q0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f171379a.f171393d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i14 = ((TreeNode) next).f171397e;
            Integer num = (Integer) C42745f0.G(listQ0);
            if (num != null && i14 == num.intValue()) {
                break;
            }
        }
        TreeNode treeNode = (TreeNode) next;
        if (treeNode != null) {
            arrayList2.add(f(treeNode, Integer.valueOf(i12), 0, null));
            i13 = 1;
        } else {
            i13 = 0;
        }
        Iterator it2 = listQ0.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            List list = (List) this.f171381c.get(Integer.valueOf(iIntValue));
            ArrayList arrayList3 = new ArrayList();
            if (list != null) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(f((TreeNode) it3.next(), Integer.valueOf(i12), i13, null));
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2.addAll(arrayList3);
            } else {
                Iterator it4 = arrayList2.iterator();
                int i15 = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i15 = -1;
                        break;
                    }
                    if (((NodeItem) it4.next()).f171408e == iIntValue) {
                        break;
                    }
                    i15++;
                }
                if (i15 < 0) {
                    i15 = 0;
                }
                arrayList2.addAll(i15 + 1, arrayList3);
            }
            i13++;
        }
        return arrayList2;
    }

    @Override // com.avito.android.inline_filters.dialog.category_nodes.w
    @Y61.l
    public final Integer e(int i12) {
        Object next;
        List list = (List) this.f171381c.get(Integer.valueOf(i12));
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
