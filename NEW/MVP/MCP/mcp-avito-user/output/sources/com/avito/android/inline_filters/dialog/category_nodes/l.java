package com.avito.android.inline_filters.dialog.category_nodes;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.inline_filters.dialog.category_nodes.adapter.NodeItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CategoryNodesDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "query", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31009d f171487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f171488c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CategoryTree f171489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f171490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y41.p<DeepLink, Boolean, G0> f171491f;

    /* JADX WARN: Multi-variable type inference failed */
    public l(C31009d c31009d, w wVar, CategoryTree categoryTree, w wVar2, Y41.p<? super DeepLink, ? super Boolean, G0> pVar) {
        this.f171487b = c31009d;
        this.f171488c = wVar;
        this.f171489d = categoryTree;
        this.f171490e = wVar2;
        this.f171491f = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str = (String) obj;
        C31009d c31009d = this.f171487b;
        c31009d.f171464m = str;
        ArrayList arrayListA = this.f171488c.a(c31009d.f171465n, str);
        int length = str.length();
        Y41.p<DeepLink, Boolean, G0> pVar = this.f171491f;
        NodeItem nodeItem = null;
        if (length == 0 || C43066x.K(str)) {
            c31009d.f().s();
            Integer num = c31009d.f171465n;
            CategoryTree categoryTreeA = this.f171489d;
            if (num != null) {
                categoryTreeA = CategoryTree.a(categoryTreeA, num.intValue());
            } else {
                CategoryTree categoryTree = c31009d.f171462k;
                if (categoryTree != null) {
                    categoryTreeA = categoryTree;
                }
            }
            c31009d.f171465n = null;
            c31009d.f171462k = categoryTreeA;
            c31009d.k(categoryTreeA, this.f171490e, pVar);
            return;
        }
        c31009d.f().b(arrayListA);
        if (arrayListA.isEmpty()) {
            c31009d.f().u();
        } else {
            c31009d.f().s();
        }
        Iterator<T> it = arrayListA.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((NodeItem) next).f171413j) {
                nodeItem = next;
                break;
            }
        }
        NodeItem nodeItem2 = nodeItem;
        if (nodeItem2 != null) {
            this.f171487b.h(nodeItem2.f171407d, nodeItem2.f171406c, nodeItem2.f171409f, nodeItem2.f171410g, pVar);
        }
    }
}
