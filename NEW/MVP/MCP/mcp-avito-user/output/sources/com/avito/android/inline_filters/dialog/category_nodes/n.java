package com.avito.android.inline_filters.dialog.category_nodes;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.inline_filters.dialog.category_nodes.adapter.NodeItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryNodesDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/NodeItem;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/inline_filters/dialog/category_nodes/adapter/NodeItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f171493b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C31009d f171494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CategoryTree f171495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y41.p<DeepLink, Boolean, G0> f171496e;

    public n(Y41.p pVar, C31009d c31009d, CategoryTree categoryTree, w wVar) {
        this.f171493b = wVar;
        this.f171494c = c31009d;
        this.f171495d = categoryTree;
        this.f171496e = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        T next;
        DeepLink deepLink;
        Integer num;
        Integer num2;
        String str;
        NodeItem nodeItem = (NodeItem) obj;
        int i12 = nodeItem.f171408e;
        w wVar = this.f171493b;
        Integer numE = wVar.e(i12);
        Integer numValueOf = numE == null ? Integer.valueOf(i12) : numE;
        C31009d c31009d = this.f171494c;
        c31009d.f171465n = numValueOf;
        Iterator<T> it = this.f171495d.f171393d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
            int i13 = ((TreeNode) next).f171397e;
            if (numE != null && i13 == numE.intValue()) {
                break;
            }
        }
        TreeNode treeNode = next;
        String str2 = c31009d.f171464m;
        if (str2 != null) {
            ArrayList arrayListA = wVar.a(c31009d.f171465n, str2);
            c31009d.f().b(arrayListA);
            if (arrayListA.isEmpty()) {
                c31009d.f().u();
            } else {
                c31009d.f().s();
            }
        }
        c31009d.f().W();
        if (treeNode == null || (deepLink = treeNode.f171395c) == null) {
            deepLink = nodeItem.f171407d;
        }
        DeepLink deepLink2 = deepLink;
        if (treeNode == null || (num = treeNode.f171394b) == null) {
            num = nodeItem.f171406c;
        }
        Integer num3 = num;
        if (treeNode == null || (num2 = treeNode.f171398f) == null) {
            num2 = nodeItem.f171409f;
        }
        this.f171494c.h(deepLink2, num3, num2, (treeNode == null || (str = treeNode.f171399g) == null) ? nodeItem.f171410g : str, this.f171496e);
    }
}
