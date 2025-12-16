package com.avito.android.user_adverts_filters.main.view;

import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinNavBar;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinScreen;
import com.avito.android.user_adverts_filters.main.tracker.UserAdvertsFiltersScreen;
import com.avito.android.user_adverts_filters.main.view.g;
import com.avito.android.util.y6;
import dj.InterfaceC39737b;
import i31.InterfaceC41220a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MainFiltersView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/view/d;", "Landroid/view/View$OnAttachStateChangeListener;", "b", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final com.avito.android.user_adverts_filters.host.c f316338b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UserAdvertsFiltersBeduinScreen f316339c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.l<g, G0> f316340d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f316341e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f316342f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f316343g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f316344h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final RecyclerView f316345i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final RecyclerView f316346j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final RecyclerView f316347k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Object f316348l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final Object f316349m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public h f316350n;

    /* compiled from: MainFiltersView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            d dVar = d.this;
            dVar.f316340d.invoke(new g.c(dVar.f316339c));
            return G0.f406611a;
        }
    }

    /* compiled from: MainFiltersView.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/view/d$b;", "", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @k
        d a(@k ViewGroup viewGroup, @l com.avito.android.user_adverts_filters.host.c cVar, @k UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen, @k Y41.l<? super g, G0> lVar);
    }

    /* compiled from: MainFiltersView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[UserAdvertsFiltersBeduinNavBar.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UserAdvertsFiltersBeduinNavBar.Type type = UserAdvertsFiltersBeduinNavBar.Type.f316072b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: MainFiltersView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "invoke", "()LY41/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts_filters.main.view.d$d, reason: collision with other inner class name */
    public static final class C9824d extends N implements Y41.a<Y41.a<? extends G0>> {
        public C9824d() {
            super(0);
        }

        @Override // Y41.a
        public final Y41.a<? extends G0> invoke() {
            return new com.avito.android.user_adverts_filters.main.view.e(d.this);
        }
    }

    /* compiled from: MainFiltersView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "invoke", "()LY41/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Y41.a<? extends G0>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Y41.a<? extends G0> invoke() {
            return new f(d.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i31.c
    public d(@InterfaceC41220a @k ViewGroup viewGroup, @l @InterfaceC41220a com.avito.android.user_adverts_filters.host.c cVar, @InterfaceC41220a @k UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen, @InterfaceC41220a @k Y41.l<? super g, G0> lVar, @k InterfaceC25659b interfaceC25659b, @k InterfaceC39737b interfaceC39737b) {
        this.f316338b = cVar;
        this.f316339c = userAdvertsFiltersBeduinScreen;
        this.f316340d = lVar;
        View viewFindViewById = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_adverts_filters_main_fragment_form_layout_re23, viewGroup, true).findViewById(R.id.user_adverts_filters_main_list_container);
        this.f316341e = viewFindViewById;
        int iB2 = y6.b(16);
        com.avito.android.beduin.common.component.adapter.a aVarB = interfaceC25659b.b(Integer.valueOf(iB2));
        this.f316342f = aVarB;
        com.avito.android.beduin.common.component.adapter.a aVarB2 = interfaceC25659b.b(Integer.valueOf(iB2));
        this.f316343g = aVarB2;
        com.avito.android.beduin.common.component.adapter.a aVarB3 = interfaceC25659b.b(Integer.valueOf(iB2));
        this.f316344h = aVarB3;
        RecyclerView recyclerView = (RecyclerView) viewFindViewById.findViewById(R.id.user_adverts_filters_top_list);
        this.f316345i = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById.findViewById(R.id.user_adverts_filters_main_list);
        this.f316346j = recyclerView2;
        RecyclerView recyclerView3 = (RecyclerView) viewFindViewById.findViewById(R.id.user_adverts_filters_bottom_list);
        this.f316347k = recyclerView3;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f316348l = C42727D.b(lazyThreadSafetyMode, new e());
        this.f316349m = C42727D.b(lazyThreadSafetyMode, new C9824d());
        viewFindViewById.setTag(userAdvertsFiltersBeduinScreen.f316078b);
        interfaceC39737b.g(UserAdvertsFiltersScreen.f316328d);
        for (Q q12 : C42745f0.U(new Q(recyclerView, aVarB), new Q(recyclerView2, aVarB2), new Q(recyclerView3, aVarB3))) {
            RecyclerView recyclerView4 = (RecyclerView) q12.f406619b;
            AbstractC25658a abstractC25658a = (AbstractC25658a) q12.f406620c;
            com.avito.android.beduin_shared.model.utils.h.b(recyclerView4, abstractC25658a);
            abstractC25658a.o(interfaceC39737b.F());
        }
        this.f316341e.addOnAttachStateChangeListener(this);
        com.avito.android.user_adverts_filters.host.c cVar2 = this.f316338b;
        if (cVar2 != null) {
            cVar2.kc(new a());
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@k View view) {
        com.avito.android.user_adverts_filters.host.c cVar = this.f316338b;
        if (cVar != null) {
            cVar.ha(null);
        }
        if (cVar != null) {
            cVar.d2(null);
        }
        this.f316341e.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@k View view) {
    }
}
