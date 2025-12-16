package com.avito.android.realty_agency.inline_filters.location_suggest;

import HV.a;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.util.C35835l0;
import com.avito.android.util.K2;
import com.avito.konveyor.adapter.j;
import javax.inject.Inject;
import ji0.InterfaceC42386a;
import ji0.InterfaceC42387b;
import ji0.d;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import oi0.C44783b;

/* compiled from: LocationSuggestDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f251629L = 0;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final N f251630E;

    /* renamed from: F, reason: collision with root package name */
    @Inject
    public i f251631F;

    /* renamed from: G, reason: collision with root package name */
    @k
    public final InterfaceC42726C f251632G;

    /* renamed from: H, reason: collision with root package name */
    @Inject
    public j f251633H;

    /* renamed from: I, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f251634I;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final View f251635J;

    /* renamed from: K, reason: collision with root package name */
    @k
    public final g f251636K;

    /* compiled from: LocationSuggestDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lji0/a;", "action", "Lkotlin/G0;", "invoke", "(Lji0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.realty_agency.inline_filters.location_suggest.a$a, reason: collision with other inner class name */
    public static final class C7548a extends N implements l<InterfaceC42386a, G0> {
        public C7548a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC42386a interfaceC42386a) {
            int i12 = a.f251629L;
            ((h) a.this.f251632G.getValue()).accept(interfaceC42386a);
            return G0.f406611a;
        }
    }

    /* compiled from: LocationSuggestDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<InterfaceC42387b, G0> {
        /* JADX WARN: Type inference failed for: r2v2, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(InterfaceC42387b interfaceC42387b) {
            InterfaceC42387b interfaceC42387b2 = interfaceC42387b;
            a aVar = (a) this.receiver;
            int i12 = a.f251629L;
            aVar.getClass();
            if (interfaceC42387b2 instanceof InterfaceC42387b.a) {
                K2.d(aVar.f251635J, true);
                aVar.dismiss();
                aVar.f251630E.invoke(((InterfaceC42387b.a) interfaceC42387b2).f405766a);
            } else if (interfaceC42387b2 instanceof InterfaceC42387b.C11576b) {
                ToastBarState toastBarState = new ToastBarState(((InterfaceC42387b.C11576b) interfaceC42387b2).f405767a, null, null, null, null, null, null, 0, false, false, null, null, 4094, null);
                a.C0407a c0407a = HV.a.f7100w;
                Context context = aVar.getContext();
                int iJ2 = C35835l0.j(R.attr.toastBarError, aVar.getContext());
                c0407a.getClass();
                IV.a.e(aVar, toastBarState, a.C0407a.b(iJ2, context));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LocationSuggestDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<ji0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(ji0.c cVar) {
            a aVar = (a) this.receiver;
            int i12 = a.f251629L;
            aVar.getClass();
            ji0.d dVar = cVar.f405773e;
            boolean z12 = dVar instanceof d.b;
            g gVar = aVar.f251636K;
            if (z12) {
                gVar.f251676d.k(null);
            } else if (dVar instanceof d.c) {
                gVar.f251676d.a("");
            } else if (dVar instanceof d.a) {
                gVar.f251676d.j();
                gVar.f251675c.c(new UV0.c(((d.a) dVar).f405774a));
                gVar.f251674b.notifyDataSetChanged();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LocationSuggestDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/realty_agency/inline_filters/location_suggest/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<h> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final h invoke() {
            i iVar = a.this.f251631F;
            if (iVar == null) {
                iVar = null;
            }
            return (h) iVar.get();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k Context context, @k String str, @Y61.l String str2, @k l<? super C44783b, G0> lVar) {
        super(context, 0, 2, null);
        this.f251630E = (N) lVar;
        InterfaceC42726C interfaceC42726CC = C42727D.c(new d());
        this.f251632G = interfaceC42726CC;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.dialog_location_suggest, (ViewGroup) null);
        this.f251635J = viewInflate;
        com.avito.android.realty_agency.inline_filters.location_suggest.di.a.a().a(str2, (com.avito.android.realty_agency.inline_filters.location_suggest.di.c) C29972i.a(C29972i.b(this), com.avito.android.realty_agency.inline_filters.location_suggest.di.c.class), new com.avito.android.realty_agency.inline_filters.location_suggest.b(this)).a(this);
        C7548a c7548a = new C7548a();
        j jVar = this.f251633H;
        j jVar2 = jVar != null ? jVar : null;
        com.avito.konveyor.adapter.a aVar = this.f251634I;
        this.f251636K = new g(viewInflate, c7548a, jVar2, aVar != null ? aVar : null, this);
        G(viewInflate, false);
        T();
        com.avito.android.lib.design.bottom_sheet.d.M(this, str, true, true, 2);
        K(true);
        J(true);
        com.avito.android.arch.mvi.android.f.a((h) interfaceC42726CC.getValue(), this, Lifecycle.State.f46682e, new b(1, this, a.class, "handleEvent", "handleEvent(Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestOneTimeEvent;)V", 0), new c(1, this, a.class, "render", "render(Lcom/avito/android/realty_agency/inline_filters/location_suggest/mvi/entity/LocationSuggestState;)V", 0));
    }
}
