package com.avito.android.similar_adverts;

import Cd.C13243a;
import Lw0.C14444a;
import Lw0.InterfaceC14445b;
import Ow0.InterfaceC14743a;
import Ow0.c;
import Pw0.C14846a;
import Pw0.InterfaceC14847b;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.V0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.section.SectionItemConverter;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.i1;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: SimilarAdvertsDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/similar_adverts/SimilarAdvertsDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SimilarAdvertsDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f283776w0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public q f283777h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f283778i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f283779j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public GridLayoutManager.c f283780k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.favorite.n f283781l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.android.similar_adverts.i f283782m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f283783n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public Y0 f283784o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_collection_toast.a f283785p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC14445b f283786q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public SectionItemConverter f283787r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.section.action.b f283788s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC14847b f283789t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.l
    public n f283790u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public String f283791v0;

    /* compiled from: SimilarAdvertsDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/similar_adverts/SimilarAdvertsDialog$a;", "", "<init>", "()V", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static SimilarAdvertsDialog a(a aVar, String str) {
            aVar.getClass();
            SimilarAdvertsDialog similarAdvertsDialog = new SimilarAdvertsDialog();
            Bundle bundle = new Bundle(2);
            bundle.putString("ARG_ADVERT_ID", str);
            bundle.putBoolean("ARG_SHOP", false);
            bundle.putString("from_page", null);
            similarAdvertsDialog.setArguments(bundle);
            return similarAdvertsDialog;
        }

        public a() {
        }
    }

    /* compiled from: SimilarAdvertsDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            SimilarAdvertsDialog similarAdvertsDialog = (SimilarAdvertsDialog) this.receiver;
            GridLayoutManager.c cVar = similarAdvertsDialog.f283780k0;
            GridLayoutManager.c cVar2 = cVar != null ? cVar : null;
            com.avito.konveyor.adapter.j jVar = similarAdvertsDialog.f283779j0;
            com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
            com.avito.android.similar_adverts.i iVar = similarAdvertsDialog.f283782m0;
            com.avito.android.similar_adverts.i iVar2 = iVar != null ? iVar : null;
            com.avito.android.favorite.n nVar = similarAdvertsDialog.f283781l0;
            com.avito.android.favorite.n nVar2 = nVar != null ? nVar : null;
            Y0 y02 = similarAdvertsDialog.f283784o0;
            Y0 y03 = y02 != null ? y02 : null;
            com.avito.android.recycler.data_aware.c cVar3 = similarAdvertsDialog.f283783n0;
            com.avito.android.recycler.data_aware.c cVar4 = cVar3 != null ? cVar3 : null;
            InterfaceC14445b interfaceC14445b = similarAdvertsDialog.f283786q0;
            n nVar3 = new n(view2, cVar4, nVar2, y03, cVar2, iVar2, jVar2, interfaceC14445b != null ? interfaceC14445b : null);
            similarAdvertsDialog.f283790u0 = nVar3;
            com.avito.android.favorite.n nVar4 = similarAdvertsDialog.f283781l0;
            if (nVar4 == null) {
                nVar4 = null;
            }
            nVar4.s4(nVar3);
            com.avito.android.advert_collection_toast.a aVar = similarAdvertsDialog.f283785p0;
            if (aVar == null) {
                aVar = null;
            }
            aVar.d(view2, similarAdvertsDialog);
            com.avito.android.section.action.b bVar = similarAdvertsDialog.f283788s0;
            (bVar != null ? bVar : null).K2((p) similarAdvertsDialog.f283778i0.getValue());
            return G0.f406611a;
        }
    }

    /* compiled from: SimilarAdvertsDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Object, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f283792l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Object obj) {
            return G0.f406611a;
        }
    }

    /* compiled from: SimilarAdvertsDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOw0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LOw0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Ow0.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Ow0.c cVar) {
            Ow0.c cVar2 = cVar;
            a aVar = SimilarAdvertsDialog.f283776w0;
            SimilarAdvertsDialog similarAdvertsDialog = SimilarAdvertsDialog.this;
            if (cVar2 instanceof c.d) {
                ArrayList arrayList = new ArrayList();
                com.avito.android.similar_adverts.i iVar = similarAdvertsDialog.f283782m0;
                arrayList.add(new com.avito.android.similar_adverts.adapter.skeleton_title.c((iVar != null ? iVar : null).a()));
                for (int i12 = 1; i12 < 7; i12++) {
                    arrayList.add(new com.avito.android.serp.adapter.skeleton.f(String.valueOf(i12)));
                }
                n nVar = similarAdvertsDialog.f283790u0;
                if (nVar != null) {
                    UV0.c cVar3 = new UV0.c(arrayList);
                    nVar.f283983f.j();
                    nVar.f283982e.c(cVar3);
                    nVar.f283981d.c(cVar3);
                    nVar.f283980c.c(cVar3);
                }
            } else if (cVar2 instanceof c.a) {
                InterfaceC14445b interfaceC14445b = similarAdvertsDialog.f283786q0;
                if (interfaceC14445b == null) {
                    interfaceC14445b = null;
                }
                interfaceC14445b.m(interfaceC14445b.getF90716d());
                n nVar2 = similarAdvertsDialog.f283790u0;
                if (nVar2 != null) {
                    UV0.c<i1> cVar4 = ((c.a) cVar2).f12729a;
                    nVar2.f283983f.j();
                    nVar2.f283982e.c(cVar4);
                    nVar2.f283981d.c(cVar4);
                    nVar2.f283980c.c(cVar4);
                }
                InterfaceC14445b interfaceC14445b2 = similarAdvertsDialog.f283786q0;
                if (interfaceC14445b2 == null) {
                    interfaceC14445b2 = null;
                }
                ScreenPerformanceTracker.a.c(interfaceC14445b2, null, null, null, 7);
            } else if (cVar2 instanceof c.b) {
                p pVar = (p) similarAdvertsDialog.f283778i0.getValue();
                c.b bVar = (c.b) cVar2;
                com.avito.android.similar_adverts.i iVar2 = similarAdvertsDialog.f283782m0;
                pVar.accept(new InterfaceC14743a.C0819a(bVar.f12730a, (iVar2 != null ? iVar2 : null).a()));
            } else if (cVar2 instanceof c.C0821c) {
                InterfaceC14445b interfaceC14445b3 = similarAdvertsDialog.f283786q0;
                if (interfaceC14445b3 == null) {
                    interfaceC14445b3 = null;
                }
                interfaceC14445b3.m(interfaceC14445b3.getF90716d());
                n nVar3 = similarAdvertsDialog.f283790u0;
                if (nVar3 != null) {
                    com.avito.android.publish.screen.objects.view.actions.h hVar = new com.avito.android.publish.screen.objects.view.actions.h(similarAdvertsDialog, 17);
                    com.avito.android.progress_overlay.l lVar = nVar3.f283983f;
                    lVar.a("");
                    lVar.f231600j = new m(hVar);
                }
                InterfaceC14445b interfaceC14445b4 = similarAdvertsDialog.f283786q0;
                if (interfaceC14445b4 == null) {
                    interfaceC14445b4 = null;
                }
                ScreenPerformanceTracker.a.c(interfaceC14445b4, null, new J.a(((c.C0821c) cVar2).f12731a), null, 5);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f283794l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f283794l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f283794l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SimilarAdvertsDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f283796l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f283796l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f283796l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f283797l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f283797l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f283797l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f283798l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f283798l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f283798l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SimilarAdvertsDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/similar_adverts/p;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/similar_adverts/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<p> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final p invoke() {
            q qVar = SimilarAdvertsDialog.this.f283777h0;
            if (qVar == null) {
                qVar = null;
            }
            return (p) qVar.get();
        }
    }

    public SimilarAdvertsDialog() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f283778i0 = new O0(m0.f406844a.b(p.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("ARG_ADVERT_ID")) == null) {
            throw new IllegalStateException("Argument ARG_ADVERT_ID must be set");
        }
        Bundle arguments2 = getArguments();
        boolean z12 = arguments2 != null ? arguments2.getBoolean("ARG_SHOP") : false;
        Bundle arguments3 = getArguments();
        this.f283791v0 = arguments3 != null ? arguments3.getString("from_page") : null;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.similar_adverts.di.a.a().a(getResources(), this, string, ScreenSource.FAVORITES.f251781d, z12, s.b(this), getF42820b(), (com.avito.android.similar_adverts.di.i) C29972i.a(C29972i.b(this), com.avito.android.similar_adverts.di.i.class), cv.c.b(this)).a(this);
        InterfaceC14445b interfaceC14445b = this.f283786q0;
        if (interfaceC14445b == null) {
            interfaceC14445b = null;
        }
        interfaceC14445b.a(fA2.b());
        InterfaceC14445b interfaceC14445b2 = this.f283786q0;
        if (interfaceC14445b2 == null) {
            interfaceC14445b2 = null;
        }
        interfaceC14445b2.c(this, d5());
        InterfaceC14445b interfaceC14445b3 = this.f283786q0;
        (interfaceC14445b3 != null ? interfaceC14445b3 : null).B(new C14444a(), this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        InterfaceC14445b interfaceC14445b = this.f283786q0;
        if (interfaceC14445b == null) {
            interfaceC14445b = null;
        }
        interfaceC14445b.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar.E(R.layout.similar_adverts, true, new b(1, this, SimilarAdvertsDialog.class, "onViewInflate", "onViewInflate(Landroid/view/View;)V", 0));
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, null, false, 0, 0, 0, 121);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        dVar.K(true);
        dVar.T();
        dVar.setCanceledOnTouchOutside(true);
        InterfaceC14445b interfaceC14445b2 = this.f283786q0;
        (interfaceC14445b2 != null ? interfaceC14445b2 : null).d();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.favorite.n nVar = this.f283781l0;
        if (nVar == null) {
            nVar = null;
        }
        nVar.I();
        this.f283790u0 = null;
        com.avito.android.advert_collection_toast.a aVar = this.f283785p0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a();
        com.avito.android.section.action.b bVar = this.f283788s0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.c0();
        if (isRemoving() && L.f(this.f283791v0, "main_page")) {
            InterfaceC14847b interfaceC14847b = this.f283789t0;
            (interfaceC14847b != null ? interfaceC14847b : null).a(new C14846a());
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        InterfaceC22983P interfaceC22983PA;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null || (interfaceC22983PA = V0.a(decorView)) == null) {
            return;
        }
        com.avito.android.arch.mvi.android.f.a((p) this.f283778i0.getValue(), interfaceC22983PA, Lifecycle.State.f46682e, c.f283792l, new d());
    }
}
