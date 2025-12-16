package com.avito.android.inline_filters.dialog.category_nodes;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22777e;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.inline_filters.category_nodes.CategoryTreeLink;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.category_nodes.adapter.NodeItem;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;

/* compiled from: CategoryNodesDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/category_nodes/d;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/category_nodes/q;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.dialog.category_nodes.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31009d extends AbstractC30998a<q> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Filter f171455d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final CN.f f171456e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.deeplink_handler.handler.composite.a f171457f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    @SuppressLint({"InflateParams"})
    public final View f171458g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f171459h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final v f171460i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public w f171461j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public CategoryTree f171462k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Integer f171463l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public String f171464m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public Integer f171465n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f171466o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f171467p;

    /* compiled from: CategoryNodesDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.inline_filters.dialog.category_nodes.d$a */
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Integer f171469m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Integer f171470n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f171471o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ DeepLink f171472p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.p<DeepLink, Boolean, G0> f171473q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Integer num, Integer num2, String str, DeepLink deepLink, Y41.p<? super DeepLink, ? super Boolean, G0> pVar) {
            super(0);
            this.f171469m = num;
            this.f171470n = num2;
            this.f171471o = str;
            this.f171472p = deepLink;
            this.f171473q = pVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            C31009d c31009d = C31009d.this;
            CN.f fVar = c31009d.f171456e;
            if (fVar != null) {
                fVar.c(String.valueOf(this.f171469m), String.valueOf(this.f171470n), this.f171471o);
            }
            DeepLink deepLink = this.f171472p;
            if (!(deepLink instanceof NoMatchLink)) {
                this.f171473q.invoke(deepLink, Boolean.FALSE);
            }
            ((C31008c) c31009d.f171467p).invoke();
            return G0.f406611a;
        }
    }

    public C31009d(@Y61.k Context context, @Y61.k Filter filter, @Y61.l CN.f fVar, @Y61.l com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l Parcelable parcelable, @Y61.k Y41.p pVar, @Y61.l Y41.p pVar2, @Y61.k Y41.a aVar2) {
        io.reactivex.rxjava3.disposables.d dVarV0;
        super(context, R.style.Re23_BottomSheet_Default);
        this.f171455d = filter;
        this.f171456e = fVar;
        this.f171457f = aVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.inline_filters_dialog_category_nodes, (ViewGroup) null);
        this.f171458g = viewInflate;
        this.f171459h = C42727D.c(new C31007b(this));
        this.f171460i = new v();
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f171466o = cVar;
        C31008c c31008c = new C31008c(this, aVar2);
        this.f171467p = c31008c;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f171462k = (CategoryTree) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("TREE_KEY", CategoryTree.class) : bundle.getParcelable("TREE_KEY"));
            this.f171463l = Integer.valueOf(bundle.getInt("START_SELECTED_ID_KEY"));
            this.f171464m = bundle.getString("QUERY_KEY");
            int i12 = bundle.getInt("SEARCH_SELECTED_KEY", -1);
            this.f171465n = i12 < 0 ? null : Integer.valueOf(i12);
            CategoryTree categoryTree = this.f171462k;
            if (categoryTree != null) {
                this.f171461j = e(categoryTree);
            }
        }
        this.f171147c = new t(viewInflate);
        q qVarF = f();
        qVarF.Rd(false);
        qVarF.Qd(c31008c);
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f171146b;
        dVar.G(viewInflate, false);
        dVar.setCanceledOnTouchOutside(true);
        dVar.T();
        dVar.J(true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        int iB2 = y6.b(32);
        com.avito.android.lib.design.bottom_sheet.q qVar = dVar.f178530x;
        if (qVar != null) {
            qVar.c(iB2);
        }
        dVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.avito.android.inline_filters.dialog.category_nodes.a
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ((C31008c) this.f171404b.f171467p).invoke();
            }
        });
        dVar.R(new e(this));
        dVar.K(true);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        InlineFilterValue value = filter.getValue();
        InlineFilterValue.InlineCategoryNodesValue inlineCategoryNodesValue = value instanceof InlineFilterValue.InlineCategoryNodesValue ? (InlineFilterValue.InlineCategoryNodesValue) value : null;
        Filter.Widget widget = filter.getWidget();
        WidgetType type = widget != null ? widget.getType() : null;
        Parcelable link = inlineCategoryNodesValue != null ? inlineCategoryNodesValue.getLink() : null;
        CategoryTreeLink categoryTreeLink = link instanceof CategoryTreeLink ? (CategoryTreeLink) link : null;
        if (categoryTreeLink == null || this.f171461j != null) {
            i(pVar2 == null ? pVar : pVar2);
        } else {
            g(categoryTreeLink, type);
        }
        f().qd(new f(categoryTreeLink, this, type));
        pVar = pVar2 != null ? pVar2 : pVar;
        if (aVar == null) {
            dVarV0 = io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
            f().g();
        } else {
            dVarV0 = aVar.d9().N(g.f171478b).v0(new h(this, pVar), i.f171481b, io.reactivex.rxjava3.internal.functions.a.f401993c);
        }
        cVar.b(dVarV0);
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    @Y61.k
    public final Parcelable b() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("TREE_KEY", this.f171462k);
        Integer num = this.f171465n;
        if (num != null) {
            bundle.putInt("SEARCH_SELECTED_KEY", num.intValue());
        }
        String str = this.f171464m;
        if (str != null) {
            bundle.putString("QUERY_KEY", str);
        }
        Integer num2 = this.f171463l;
        if (num2 != null) {
            bundle.putInt("START_SELECTED_ID_KEY", num2.intValue());
        }
        return bundle;
    }

    public final w e(CategoryTree categoryTree) {
        Filter.Widget widget = this.f171455d.getWidget();
        return (widget != null ? widget.getType() : null) == WidgetType.ProfileCategoryNodes ? new A(categoryTree) : new x(categoryTree);
    }

    public final q f() {
        return (q) this.f171459h.getValue();
    }

    public final void g(CategoryTreeLink categoryTreeLink, WidgetType widgetType) {
        f().a();
        f().t();
        Bundle bundleB = C22777e.b(new Q("category_nodes_widget_type", widgetType));
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f171457f;
        if (aVar != null) {
            b.a.a(aVar, categoryTreeLink, null, bundleB, 2);
        }
    }

    public final void h(DeepLink deepLink, Integer num, Integer num2, String str, Y41.p<? super DeepLink, ? super Boolean, G0> pVar) {
        f().e();
        f().p(new a(num, num2, str, deepLink, pVar));
    }

    public final void i(Y41.p<? super DeepLink, ? super Boolean, G0> pVar) {
        f().C0();
        f().c();
        CategoryTree categoryTree = this.f171462k;
        if (categoryTree == null) {
            G0 g02 = G0.f406611a;
            f().g();
            return;
        }
        w wVar = this.f171461j;
        if (wVar == null) {
            G0 g03 = G0.f406611a;
            f().g();
            return;
        }
        CN.f fVar = this.f171456e;
        if (fVar != null) {
            TreeNode treeNode = categoryTree.f171392c;
            fVar.e(String.valueOf(treeNode.f171394b), String.valueOf(treeNode.f171398f));
        }
        f().setTitle(wVar.b());
        k(categoryTree, wVar, pVar);
        com.jakewharton.rxrelay3.c f171509i = f().getF171509i();
        j jVar = new j(pVar, this, categoryTree, wVar);
        l41.g<? super Throwable> gVar = k.f171486b;
        f171509i.getClass();
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = f171509i.v0(jVar, gVar, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar = this.f171466o;
        cVar.b(dVarV0);
        com.jakewharton.rxrelay3.c f171511k = f().getF171511k();
        l lVar = new l(this, wVar, categoryTree, wVar, pVar);
        l41.g<? super Throwable> gVar2 = m.f171492b;
        f171511k.getClass();
        cVar.b(f171511k.v0(lVar, gVar2, interfaceC43543a));
        com.jakewharton.rxrelay3.c f171510j = f().getF171510j();
        n nVar = new n(pVar, this, categoryTree, wVar);
        l41.g<? super Throwable> gVar3 = o.f171497b;
        f171510j.getClass();
        cVar.b(f171510j.v0(nVar, gVar3, interfaceC43543a));
        String str = this.f171464m;
        if (str != null) {
            f().setQuery(str);
        }
    }

    public final void k(CategoryTree categoryTree, w wVar, Y41.p<? super DeepLink, ? super Boolean, G0> pVar) {
        int i12;
        Object next;
        ArrayList arrayListD = wVar.d(categoryTree.f171391b);
        Iterator it = arrayListD.iterator();
        int i13 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            i12 = categoryTree.f171391b;
            if (!zHasNext) {
                i13 = -1;
                break;
            } else if (((NodeItem) it.next()).f171408e == i12) {
                break;
            } else {
                i13++;
            }
        }
        f().b(arrayListD);
        if (i13 > 0) {
            f().s4(i13);
        }
        if (i12 != categoryTree.f171392c.f171397e) {
            Iterator it2 = categoryTree.f171393d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (((TreeNode) next).f171397e == i12) {
                        break;
                    }
                }
            }
            TreeNode treeNode = (TreeNode) next;
            if (treeNode != null) {
                h(treeNode.f171395c, treeNode.f171394b, treeNode.f171398f, treeNode.f171399g, pVar);
            }
        }
    }
}
