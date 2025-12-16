package com.avito.android.mortgage.person_form;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import com.avito.android.util.K2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MortgagePersonFormView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/c;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f200484a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage.util.f f200485b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.item_visibility_tracker.b f200486c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ViewGroup f200487d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageButton f200488e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f200489f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f200490g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ImageButton f200491h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final RecyclerView f200492i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public d f200493j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.progress_overlay.l f200494k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final ViewGroup f200495l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final TextView f200496m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Button f200497n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public Y41.l<? super Boolean, G0> f200498o;

    /* compiled from: MortgagePersonFormView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isKeyboardVisible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Boolean, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            boolean zBooleanValue = bool2.booleanValue();
            c cVar = c.this;
            if (!zBooleanValue) {
                cVar.f200487d.clearFocus();
            }
            Y41.l<? super Boolean, G0> lVar = cVar.f200498o;
            if (lVar != null) {
                lVar.invoke(bool2);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public c(@k com.avito.konveyor.adapter.d dVar, @k com.avito.konveyor.a aVar, @k com.avito.android.mortgage.util.f fVar, @k GridLayoutManager.c cVar, @k com.avito.konveyor.item_visibility_tracker.b bVar, @k ViewGroup viewGroup) {
        this.f200484a = dVar;
        this.f200485b = fVar;
        this.f200486c = bVar;
        this.f200487d = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.back_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f200488e = (ImageButton) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200489f = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200490g = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.close_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f200491h = (ImageButton) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.recycler);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById5;
        this.f200492i = recyclerView;
        this.f200494k = new com.avito.android.progress_overlay.l(viewGroup, R.id.recycler, null, 0, 0, 28, null);
        View viewFindViewById6 = viewGroup.findViewById(R.id.errors_counter);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f200495l = (ViewGroup) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.counter_text);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f200496m = (TextView) viewFindViewById7;
        View viewFindViewById8 = viewGroup.findViewById(R.id.error_navigation_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f200497n = (Button) viewFindViewById8;
        Activity activityA = C35835l0.a(viewGroup.getContext());
        if (activityA != null) {
            K2.a(activityA, new a());
        }
        final Context context = viewGroup.getContext();
        final int f35c = fVar.getF35c();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(f35c) { // from class: com.avito.android.mortgage.person_form.MortgagePersonFormView$setupRecyclerView$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
            public final void w1(int i12, @l RecyclerView recyclerView2) {
                e eVar = new e(context);
                eVar.f53878a = i12;
                x1(eVar);
            }
        };
        gridLayoutManager.f53667M = cVar;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(dVar);
        recyclerView.l(new B00.c(context.getResources(), aVar), -1);
        recyclerView.l(new B00.a(fVar.getF35c(), context.getResources(), aVar), -1);
        recyclerView.l(new B00.b(context.getResources(), aVar), -1);
        bVar.a(recyclerView, null);
    }

    public final void a(int i12, int i13) {
        this.f200490g.setText(this.f200487d.getContext().getString(R.string.form_steps_subtitle, Integer.valueOf(i12), Integer.valueOf(i13)));
    }
}
