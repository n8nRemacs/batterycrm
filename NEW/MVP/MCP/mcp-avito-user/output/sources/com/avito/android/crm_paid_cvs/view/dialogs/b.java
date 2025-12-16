package com.avito.android.crm_paid_cvs.view.dialogs;

import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.C35835l0;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ListFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/dialogs/b;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UdfComponentUsage"})
/* loaded from: classes12.dex */
public final class b extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: R, reason: collision with root package name */
    public static final /* synthetic */ int f130783R = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final N f130784E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f130785F;

    /* renamed from: G, reason: collision with root package name */
    @l
    public y f130786G;

    /* renamed from: H, reason: collision with root package name */
    @k
    public final NavBar f130787H;

    /* renamed from: I, reason: collision with root package name */
    @l
    public SearchView f130788I;

    /* renamed from: J, reason: collision with root package name */
    @l
    public RecyclerView f130789J;

    /* renamed from: K, reason: collision with root package name */
    @l
    public Button f130790K;

    /* renamed from: L, reason: collision with root package name */
    @l
    public View f130791L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public final List<OptionItem> f130792M;

    /* renamed from: N, reason: collision with root package name */
    @k
    public final HashSet f130793N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f130794O;

    /* renamed from: P, reason: collision with root package name */
    @l
    public Integer f130795P;

    /* renamed from: Q, reason: collision with root package name */
    @l
    public Integer f130796Q;

    /* compiled from: ListFilterDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.this.dismiss();
            return G0.f406611a;
        }
    }

    /* compiled from: ListFilterDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.crm_paid_cvs.view.dialogs.b$b, reason: collision with other inner class name */
    public static final class C3884b extends N implements Y41.l<View, G0> {
        public C3884b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            View viewFindViewById = view2.findViewById(R.id.search);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.crm_paid_cvs.view.dialogs.SearchView");
            }
            b bVar = b.this;
            bVar.f130788I = (SearchView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.empty_list_view);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            bVar.f130791L = viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.list);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            }
            RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
            recyclerView.setItemAnimator(null);
            view2.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            recyclerView.setAdapter(bVar.f130794O);
            recyclerView.A0(0);
            recyclerView.o(new com.avito.android.crm_paid_cvs.view.dialogs.c(recyclerView));
            bVar.f130789J = recyclerView;
            View viewFindViewById4 = view2.findViewById(R.id.apply_button);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            bVar.f130790K = (Button) viewFindViewById4;
            return G0.f406611a;
        }
    }

    /* compiled from: ListFilterDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "query", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            b bVar = b.this;
            List<OptionItem> list = bVar.f130792M;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (OptionItem optionItem : list) {
                arrayList.add(OptionItem.a(optionItem, bVar.f130793N.contains(optionItem.f130375g), null, 61));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (C43066x.q(((OptionItem) next).f130370b, str, true)) {
                    arrayList2.add(next);
                }
            }
            bVar.Y(arrayList2);
            RecyclerView recyclerView = bVar.f130789J;
            if (recyclerView != null) {
                recyclerView.A0(0);
            }
        }
    }

    /* compiled from: ListFilterDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "opened", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.crm_paid_cvs.view.dialogs.ListFilterDialog$9", f = "ListFilterDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<Boolean, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f130800q;

        /* compiled from: Views.kt */
        @s0
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/E6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f130802b;

            public a(b bVar) {
                this.f130802b = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = this.f130802b;
                RecyclerView recyclerView = bVar.f130789J;
                bVar.f130795P = recyclerView != null ? Integer.valueOf(recyclerView.getMeasuredHeight()) : null;
                b.V(bVar, true);
                RecyclerView recyclerView2 = bVar.f130789J;
                if (recyclerView2 != null) {
                    recyclerView2.requestLayout();
                }
            }
        }

        /* compiled from: Views.kt */
        @s0
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/G0;", "run", "()V", "com/avito/android/util/E6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.crm_paid_cvs.view.dialogs.b$d$b, reason: collision with other inner class name */
        public static final class RunnableC3885b implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f130803b;

            public RunnableC3885b(b bVar) {
                this.f130803b = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = this.f130803b;
                RecyclerView recyclerView = bVar.f130789J;
                bVar.f130796Q = recyclerView != null ? Integer.valueOf(recyclerView.getMeasuredHeight()) : null;
                b.V(bVar, false);
                RecyclerView recyclerView2 = bVar.f130789J;
                if (recyclerView2 != null) {
                    recyclerView2.requestLayout();
                }
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            d dVar = b.this.new d(continuation);
            dVar.f130800q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
            return ((d) create(bool, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Boolean bool = (Boolean) this.f130800q;
            boolean zBooleanValue = bool.booleanValue();
            b bVar = b.this;
            if (zBooleanValue && bVar.f130795P == null) {
                RecyclerView recyclerView = bVar.f130789J;
                if (recyclerView != null) {
                    ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                    layoutParams.height = -2;
                    recyclerView.setLayoutParams(layoutParams);
                }
                RecyclerView recyclerView2 = bVar.f130789J;
                if (recyclerView2 != null) {
                    recyclerView2.postDelayed(new a(bVar), 300L);
                }
            } else if (bool.booleanValue() || bVar.f130796Q != null) {
                b.V(bVar, bool.booleanValue());
                RecyclerView recyclerView3 = bVar.f130789J;
                if (recyclerView3 != null) {
                    recyclerView3.requestLayout();
                }
            } else {
                RecyclerView recyclerView4 = bVar.f130789J;
                if (recyclerView4 != null) {
                    ViewGroup.LayoutParams layoutParams2 = recyclerView4.getLayoutParams();
                    layoutParams2.height = -2;
                    recyclerView4.setLayoutParams(layoutParams2);
                }
                RecyclerView recyclerView5 = bVar.f130789J;
                if (recyclerView5 != null) {
                    recyclerView5.postDelayed(new RunnableC3885b(bVar), 300L);
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(@Y61.k java.lang.String r10, @Y61.k android.content.Context r11, @Y61.k com.avito.konveyor.a r12, @Y61.k Y41.l<? super java.util.List<com.avito.android.crm_paid_cvs.dto.OptionItem>, kotlin.G0> r13, @Y61.k java.util.List<com.avito.android.crm_paid_cvs.dto.OptionItem> r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_paid_cvs.view.dialogs.b.<init>(java.lang.String, android.content.Context, com.avito.konveyor.a, Y41.l, java.util.List, boolean):void");
    }

    public static final void V(b bVar, boolean z12) {
        int iIntValue;
        RecyclerView recyclerView = bVar.f130789J;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (z12) {
                Integer num = bVar.f130795P;
                iIntValue = num != null ? num.intValue() : recyclerView.getMeasuredHeight();
            } else {
                Integer num2 = bVar.f130796Q;
                iIntValue = num2 != null ? num2.intValue() : recyclerView.getMeasuredHeight();
            }
            layoutParams.height = iIntValue;
            recyclerView.setLayoutParams(layoutParams);
        }
    }

    public final void W(@k OptionItem optionItem) {
        String query$_avito_job_crm_paid_cvs_impl;
        HashSet hashSet = this.f130793N;
        String str = optionItem.f130375g;
        if (!this.f130785F) {
            hashSet.clear();
            hashSet.add(str);
        } else if (!hashSet.remove(str)) {
            hashSet.add(str);
        }
        List<OptionItem> list = this.f130792M;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (OptionItem optionItem2 : list) {
            arrayList.add(OptionItem.a(optionItem2, hashSet.contains(optionItem2.f130375g), null, 61));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str2 = ((OptionItem) next).f130370b;
            SearchView searchView = this.f130788I;
            if (searchView == null || (query$_avito_job_crm_paid_cvs_impl = searchView.getQuery$_avito_job_crm_paid_cvs_impl()) == null) {
                query$_avito_job_crm_paid_cvs_impl = "";
            }
            if (C43066x.q(str2, query$_avito_job_crm_paid_cvs_impl, true)) {
                arrayList2.add(next);
            }
        }
        Y(arrayList2);
    }

    public final List<OptionItem> X(List<OptionItem> list) {
        if (!this.f130785F) {
            return list;
        }
        List<OptionItem> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((OptionItem) obj).f130371c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (!((OptionItem) obj2).f130371c) {
                arrayList2.add(obj2);
            }
        }
        return C42745f0.h0(arrayList2, arrayList);
    }

    public final void Y(List<OptionItem> list) {
        int i12 = 0;
        this.f130794O.l(list, null);
        boolean zIsEmpty = this.f130793N.isEmpty();
        NavBar navBar = this.f130787H;
        if (!zIsEmpty) {
            com.avito.android.lib.design.text_view.a aVarB = navBar.b(com.avito.android.printable_text.b.f(getContext().getString(R.string.paid_cvs_reset)));
            aVarB.setBackground(C35835l0.h(android.R.attr.selectableItemBackground, getContext()));
            aVarB.setOnClickListener(new com.avito.android.crm_paid_cvs.view.dialogs.a(this, i12));
            navBar.setActions(aVarB);
            return;
        }
        com.avito.android.lib.design.text_view.a aVarB2 = navBar.b(com.avito.android.printable_text.b.f(getContext().getString(R.string.paid_cvs_reset)));
        aVarB2.setTextColor(C35835l0.d(R.attr.gray54, getContext()));
        aVarB2.setEnabled(false);
        aVarB2.setClickable(false);
        navBar.setActions(aVarB2);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.d, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y yVar = this.f130786G;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f130786G = null;
    }
}
