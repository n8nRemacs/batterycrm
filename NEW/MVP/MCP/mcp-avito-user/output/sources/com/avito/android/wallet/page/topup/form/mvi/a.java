package com.avito.android.wallet.page.topup.form.mvi;

import PV.b;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bP0.AbstractC25542c;
import com.avito.android.R;
import com.avito.android.util.K2;
import com.avito.android.util.RunnableC35941s4;
import com.avito.android.wallet.page.utils.f;
import com.avito.konveyor.adapter.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: TopUpFormView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/a;", "", "a", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f328348a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.recycler.data_aware.c f328349b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Toolbar f328350c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f328351d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f328352e;

    /* compiled from: TopUpFormView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/mvi/a$a;", "", "<init>", "()V", "", "SNACKBAR_MAX_LINES", "I", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet.page.topup.form.mvi.a$a, reason: collision with other inner class name */
    public static final class C10184a {
        public /* synthetic */ C10184a(C42822w c42822w) {
            this();
        }

        public C10184a() {
        }
    }

    /* compiled from: TopUpFormView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "focused", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f328353l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            if (view2 != null) {
                K2.j(view2, 0);
            }
            return G0.f406611a;
        }
    }

    static {
        new C10184a(null);
    }

    public a(@k View view, @k j jVar, @k com.avito.android.recycler.data_aware.c cVar) {
        this.f328348a = view;
        this.f328349b = cVar;
        Context context = view.getContext();
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        this.f328350c = (Toolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.recycler_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f328351d = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        jVar.setHasStableIds(true);
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new ru.avito.component.animator.k(false, 1, null));
        b.a aVar = new b.a(null, 1, null);
        aVar.b(C43852a.a(context, R.drawable.top_up_form_input_item_divider), 0);
        recyclerView.l(aVar.a(), -1);
        this.f328352e = f.a(view, recyclerView);
    }

    public final void a(@k AbstractC25542c abstractC25542c) {
        if (!(abstractC25542c instanceof AbstractC25542c.a)) {
            boolean z12 = abstractC25542c instanceof AbstractC25542c.b;
            return;
        }
        AbstractC25542c.a aVar = (AbstractC25542c.a) abstractC25542c;
        this.f328349b.c(new UV0.c(aVar.f57058b));
        this.f328350c.setTitle(aVar.f57057a);
        if (aVar.f57059c) {
            b bVar = b.f328353l;
            RecyclerView recyclerView = this.f328351d;
            recyclerView.postDelayed(new RunnableC35941s4(recyclerView, bVar), 100L);
        }
    }
}
