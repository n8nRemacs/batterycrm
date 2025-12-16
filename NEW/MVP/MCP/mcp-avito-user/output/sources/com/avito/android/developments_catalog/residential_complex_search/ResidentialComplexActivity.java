package com.avito.android.developments_catalog.residential_complex_search;

import Cd.C13243a;
import Y41.l;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.developments_catalog.residential_complex_search.mvi.n;
import com.avito.android.developments_catalog.residential_complex_search.mvi.o;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.util.C35739a;
import com.avito.android.util.D6;
import com.avito.android.util.X0;
import javax.inject.Inject;
import jx.C42440b;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import sx.InterfaceC48426a;
import sx.InterfaceC48427b;
import tx.C48734a;
import z1.AbstractC50339a;

/* compiled from: ResidentialComplexActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/ResidentialComplexActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ResidentialComplexActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f139122v = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_catalog.residential_complex_search.mvi.i f139123m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f139124n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f139125o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_catalog.residential_complex_search.adapter.title.d f139126p;

    /* renamed from: r, reason: collision with root package name */
    public EditText f139128r;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f139129s;

    /* renamed from: t, reason: collision with root package name */
    public ImageButton f139130t;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final O0 f139127q = new O0(m0.f406844a.b(com.avito.android.developments_catalog.residential_complex_search.mvi.h.class), new h(), new g(new j()), new i());

    /* renamed from: u, reason: collision with root package name */
    @k
    public final InterfaceC42726C f139131u = C42727D.c(new b());

    /* compiled from: ResidentialComplexActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/ResidentialComplexActivity$a;", "", "<init>", "()V", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: ResidentialComplexActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltx/a;", "invoke", "()Ltx/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<C48734a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final C48734a invoke() {
            Intent intent = ResidentialComplexActivity.this.getIntent();
            return new C48734a(intent.getDoubleExtra("lat", 0.0d), intent.getDoubleExtra(AddressParameter.Value.LNG, 0.0d), intent.getParcelableArrayListExtra("values"), intent.getBooleanExtra("button_item", true));
        }
    }

    /* compiled from: ResidentialComplexActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<InterfaceC48427b, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.ImageButton] */
        @Override // Y41.l
        public final G0 invoke(InterfaceC48427b interfaceC48427b) {
            InterfaceC48427b interfaceC48427b2 = interfaceC48427b;
            ResidentialComplexActivity residentialComplexActivity = (ResidentialComplexActivity) this.receiver;
            int i12 = ResidentialComplexActivity.f139122v;
            residentialComplexActivity.getClass();
            if (interfaceC48427b2 instanceof InterfaceC48427b.d) {
                ?? r02 = residentialComplexActivity.f139130t;
                D6.G(r02 != 0 ? r02 : null, ((InterfaceC48427b.d) interfaceC48427b2).f438928a);
            } else if (interfaceC48427b2 instanceof InterfaceC48427b.C12652b) {
                residentialComplexActivity.setResult(0);
                residentialComplexActivity.finish();
            } else if (interfaceC48427b2 instanceof InterfaceC48427b.a) {
                EditText editText = residentialComplexActivity.f139128r;
                (editText != null ? editText : null).getText().clear();
            } else if (interfaceC48427b2 instanceof InterfaceC48427b.c) {
                residentialComplexActivity.setResult(-1, new Intent().putExtra("extra_value", ((InterfaceC48427b.c) interfaceC48427b2).f438927a));
                residentialComplexActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ResidentialComplexActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements l<n, G0> {
        @Override // Y41.l
        public final G0 invoke(n nVar) {
            ResidentialComplexActivity residentialComplexActivity = (ResidentialComplexActivity) this.receiver;
            int i12 = ResidentialComplexActivity.f139122v;
            residentialComplexActivity.getClass();
            o oVar = nVar.f139231f;
            if (!oVar.f139234a.f16399b.isEmpty()) {
                com.avito.konveyor.adapter.a aVar = residentialComplexActivity.f139124n;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.c(oVar.f139234a);
                RecyclerView recyclerView = residentialComplexActivity.f139129s;
                RecyclerView.Adapter adapter = (recyclerView != null ? recyclerView : null).getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ResidentialComplexActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/adapter/button/c;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/developments_catalog/residential_complex_search/adapter/button/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<com.avito.android.developments_catalog.residential_complex_search.adapter.button.c, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.developments_catalog.residential_complex_search.adapter.button.c cVar) {
            int i12 = ResidentialComplexActivity.f139122v;
            ResidentialComplexActivity residentialComplexActivity = ResidentialComplexActivity.this;
            residentialComplexActivity.a2().accept(new InterfaceC48426a.c(0, residentialComplexActivity.getResources().getString(R.string.not_in_list)));
            return G0.f406611a;
        }
    }

    /* compiled from: ResidentialComplexActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/adapter/title/c;", "suggestItem", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/developments_catalog/residential_complex_search/adapter/title/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements l<com.avito.android.developments_catalog.residential_complex_search.adapter.title.c, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.developments_catalog.residential_complex_search.adapter.title.c cVar) {
            int i12 = ResidentialComplexActivity.f139122v;
            com.avito.android.developments_catalog.residential_complex_search.mvi.h hVarA2 = ResidentialComplexActivity.this.a2();
            C42440b c42440b = cVar.f139157c;
            hVarA2.accept(new InterfaceC48426a.c(c42440b.getId(), c42440b.getName()));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f139135l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f139135l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f139135l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return ResidentialComplexActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return ResidentialComplexActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ResidentialComplexActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/developments_catalog/residential_complex_search/mvi/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.developments_catalog.residential_complex_search.mvi.h> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.developments_catalog.residential_complex_search.mvi.h invoke() {
            com.avito.android.developments_catalog.residential_complex_search.mvi.i iVar = ResidentialComplexActivity.this.f139123m;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.developments_catalog.residential_complex_search.mvi.h) iVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.residential_complex_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.developments_catalog.residential_complex_search.di.a.a().a((com.avito.android.developments_catalog.residential_complex_search.di.c) C29972i.a(C29972i.b(this), com.avito.android.developments_catalog.residential_complex_search.di.c.class), (C48734a) this.f139131u.getValue(), new e(), new f()).a(this);
    }

    @Override // com.avito.android.ui.activity.a
    public final void Z1() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        C35739a.f318787a.getClass();
        C35739a.a(this, toolbar);
        final int i12 = 0;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.developments_catalog.residential_complex_search.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ResidentialComplexActivity f139140c;

            {
                this.f139140c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResidentialComplexActivity residentialComplexActivity = this.f139140c;
                switch (i12) {
                    case 0:
                        int i13 = ResidentialComplexActivity.f139122v;
                        residentialComplexActivity.a2().accept(InterfaceC48426a.C12651a.f438920a);
                        break;
                    default:
                        int i14 = ResidentialComplexActivity.f139122v;
                        residentialComplexActivity.a2().accept(InterfaceC48426a.b.f438921a);
                        break;
                }
            }
        });
        ImageButton imageButton = (ImageButton) findViewById(R.id.clear);
        this.f139130t = imageButton;
        D6.w(imageButton);
        ImageButton imageButton2 = this.f139130t;
        if (imageButton2 == null) {
            imageButton2 = null;
        }
        final int i13 = 1;
        imageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.developments_catalog.residential_complex_search.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ResidentialComplexActivity f139140c;

            {
                this.f139140c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResidentialComplexActivity residentialComplexActivity = this.f139140c;
                switch (i13) {
                    case 0:
                        int i132 = ResidentialComplexActivity.f139122v;
                        residentialComplexActivity.a2().accept(InterfaceC48426a.C12651a.f438920a);
                        break;
                    default:
                        int i14 = ResidentialComplexActivity.f139122v;
                        residentialComplexActivity.a2().accept(InterfaceC48426a.b.f438921a);
                        break;
                }
            }
        });
    }

    public final com.avito.android.developments_catalog.residential_complex_search.mvi.h a2() {
        return (com.avito.android.developments_catalog.residential_complex_search.mvi.h) this.f139127q.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.residential_complex_activity);
        Z1();
        EditText editText = (EditText) findViewById(R.id.searchEditText);
        this.f139128r = editText;
        editText.setHint(getString(R.string.residential_complex_choose_placeholder));
        EditText editText2 = this.f139128r;
        if (editText2 == null) {
            editText2 = null;
        }
        editText2.addTextChangedListener(new X0(new com.avito.android.developments_catalog.residential_complex_search.b(this)));
        EditText editText3 = this.f139128r;
        if (editText3 == null) {
            editText3 = null;
        }
        editText3.requestFocus();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        this.f139129s = recyclerView;
        com.avito.konveyor.adapter.a aVar = this.f139124n;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.a aVar2 = this.f139125o;
        if (aVar2 == null) {
            aVar2 = null;
        }
        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(aVar, aVar2));
        RecyclerView recyclerView2 = this.f139129s;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setItemAnimator(null);
        RecyclerView recyclerView3 = this.f139129s;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setNestedScrollingEnabled(false);
        RecyclerView recyclerView4 = this.f139129s;
        (recyclerView4 != null ? recyclerView4 : null).setLayoutManager(new LinearLayoutManager(1, false));
        com.avito.android.arch.mvi.android.f.a(a2(), this, Lifecycle.State.f46682e, new c(1, this, ResidentialComplexActivity.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexOneTimeEvent;)V", 0), new d(1, this, ResidentialComplexActivity.class, "render", "render(Lcom/avito/android/developments_catalog/residential_complex_search/mvi/ResidentialComplexState;)V", 0));
    }
}
