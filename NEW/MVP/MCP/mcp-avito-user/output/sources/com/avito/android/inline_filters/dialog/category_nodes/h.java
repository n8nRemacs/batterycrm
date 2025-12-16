package com.avito.android.inline_filters.dialog.category_nodes;

import Ju.InterfaceC14249c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.inline_filters.category_nodes.i;
import com.avito.android.remote.model.category_tree.CategoryTreeNode;
import com.avito.android.remote.model.category_tree.CategoryTreeResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: CategoryNodesDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31009d f171479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.p<DeepLink, Boolean, G0> f171480c;

    /* JADX WARN: Multi-variable type inference failed */
    public h(C31009d c31009d, Y41.p<? super DeepLink, ? super Boolean, G0> pVar) {
        this.f171479b = c31009d;
        this.f171480c = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        T next;
        TreeNode treeNodeA;
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        boolean z12 = interfaceC14249c instanceof i.b;
        C31009d c31009d = this.f171479b;
        if (!z12) {
            c31009d.f().g();
            return;
        }
        v vVar = c31009d.f171460i;
        CategoryTreeResponse categoryTreeResponse = ((i.b) interfaceC14249c).f171079b;
        vVar.getClass();
        List<CategoryTreeNode> tree = categoryTreeResponse.getTree();
        CategoryTree categoryTree = null;
        if (tree != null) {
            List<CategoryTreeNode> list = tree;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                } else {
                    next = it.next();
                    if (((CategoryTreeNode) next).getParentId() == null) {
                        break;
                    }
                }
            }
            CategoryTreeNode categoryTreeNode = next;
            if (categoryTreeNode != null && (treeNodeA = v.a(categoryTreeNode)) != null) {
                int currentNodeId = categoryTreeResponse.getCurrentNodeId();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    TreeNode treeNodeA2 = v.a((CategoryTreeNode) it2.next());
                    if (treeNodeA2 != null) {
                        arrayList.add(treeNodeA2);
                    }
                }
                categoryTree = new CategoryTree(currentNodeId, treeNodeA, arrayList);
            }
        }
        c31009d.f171462k = categoryTree;
        if (categoryTree == null) {
            G0 g02 = G0.f406611a;
            c31009d.f().g();
        } else {
            c31009d.f171463l = Integer.valueOf(categoryTree.f171391b);
            c31009d.f171461j = c31009d.e(categoryTree);
            c31009d.i(this.f171480c);
        }
    }
}
