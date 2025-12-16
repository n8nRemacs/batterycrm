package com.avito.android.beduin.ui.universal.view;

import Y61.k;
import Y61.l;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import bj.AbstractC25658a;
import com.avito.android.R;
import com.avito.android.beduin.common.action.BeduinNavigationBar;
import com.avito.android.beduin.common.action.ScreenTitle;
import com.avito.android.beduin.common.component.model.BeduinContentIndent;
import com.avito.android.beduin.common.component.model.BeduinScreenSettings;
import com.avito.android.beduin.ui.universal.m;
import com.avito.android.beduin_shared.model.progress_overlay.b;
import com.avito.android.beduin_shared.model.utils.h;
import com.avito.android.error.z;
import com.avito.android.lib.util.f;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import com.avito.android.util.P2;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.Iterator;
import java.util.List;
import kd0.C42670a;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import pi.C47092c;
import sK0.C48063a;

/* compiled from: UniversalBeduinViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/universal/view/d;", "Lcom/avito/android/beduin/ui/universal/view/c;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements com.avito.android.beduin.ui.universal.view.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f104557a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC22983P f104558b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f104559c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.navigation_bar.b f104560d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f104561e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f104562f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f104563g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final MaterialToolbar f104564h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Y41.l<Boolean, G0> f104565i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final ViewGroup f104566j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.beduin_shared.model.progress_overlay.a f104567k;

    /* renamed from: l, reason: collision with root package name */
    public final View f104568l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final RecyclerView f104569m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final RecyclerView f104570n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final RecyclerView f104571o;

    /* compiled from: UniversalBeduinViewImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/beduin/ui/universal/l;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<P2<? super com.avito.android.beduin.ui.universal.l>, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f104573m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ m f104574n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, m mVar) {
            super(1);
            this.f104573m = z12;
            this.f104574n = mVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(P2<? super com.avito.android.beduin.ui.universal.l> p22) {
            BeduinNavigationBar beduinNavigationBar;
            ScreenTitle screenTitle;
            P2<? super com.avito.android.beduin.ui.universal.l> p23 = p22;
            boolean z12 = p23 instanceof P2.b;
            d dVar = d.this;
            if (z12) {
                dVar.f104567k.b();
                com.avito.android.beduin.ui.universal.l lVar = (com.avito.android.beduin.ui.universal.l) ((P2.b) p23).f318720a;
                D6.w(dVar.f104566j);
                MaterialToolbar materialToolbar = dVar.f104564h;
                if (materialToolbar != null && (beduinNavigationBar = lVar.f104489a) != null && (screenTitle = beduinNavigationBar.getScreenTitle()) != null) {
                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(materialToolbar.getContext(), com.avito.android.beduin.common.component.a.a(screenTitle.getTheme()));
                    PK0.m mVar = PK0.m.f12986a;
                    String style = screenTitle.getStyle();
                    mVar.getClass();
                    Integer numA = PK0.m.a(contextThemeWrapper, style);
                    int iIntValue = numA != null ? numA.intValue() : f.r(contextThemeWrapper, screenTitle.getStyle());
                    materialToolbar.f22400m = iIntValue;
                    AppCompatTextView appCompatTextView = materialToolbar.f22390c;
                    if (appCompatTextView != null) {
                        appCompatTextView.setTextAppearance(contextThemeWrapper, iIntValue);
                    }
                    materialToolbar.setTitle(screenTitle.getText());
                    int i12 = C47092c.a.f428741a[screenTitle.getAlignment().ordinal()];
                    boolean z13 = false;
                    if (i12 != 1) {
                        if (i12 == 2) {
                            z13 = true;
                        } else if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    materialToolbar.setTitleCentered(z13);
                    UniversalColor backgroundColor = lVar.f104489a.getBackgroundColor();
                    if (backgroundColor != null) {
                        materialToolbar.setBackgroundColor(C48063a.f437606a.a(contextThemeWrapper, backgroundColor));
                    }
                }
                BeduinScreenSettings beduinScreenSettings = lVar.f104491c;
                BeduinContentIndent contentPadding = beduinScreenSettings != null ? beduinScreenSettings.getContentPadding() : null;
                AbstractC25658a<? extends RecyclerView.C> abstractC25658a = dVar.f104561e;
                com.avito.android.beduin.common.component.adapter.a aVar = abstractC25658a instanceof com.avito.android.beduin.common.component.adapter.a ? (com.avito.android.beduin.common.component.adapter.a) abstractC25658a : null;
                if (aVar != null) {
                    aVar.f100614j = contentPadding != null ? contentPadding.getTopComponents() : null;
                }
                AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = dVar.f104562f;
                com.avito.android.beduin.common.component.adapter.a aVar2 = abstractC25658a2 instanceof com.avito.android.beduin.common.component.adapter.a ? (com.avito.android.beduin.common.component.adapter.a) abstractC25658a2 : null;
                if (aVar2 != null) {
                    aVar2.f100614j = contentPadding != null ? contentPadding.getMainComponents() : null;
                }
                AbstractC25658a<? extends RecyclerView.C> abstractC25658a3 = dVar.f104563g;
                com.avito.android.beduin.common.component.adapter.a aVar3 = abstractC25658a3 instanceof com.avito.android.beduin.common.component.adapter.a ? (com.avito.android.beduin.common.component.adapter.a) abstractC25658a3 : null;
                if (aVar3 != null) {
                    aVar3.f100614j = contentPadding != null ? contentPadding.getBottomComponents() : null;
                }
                BeduinScreenSettings beduinScreenSettings2 = lVar.f104491c;
                Boolean shouldBottomFormAvoidKeyboard = beduinScreenSettings2 != null ? beduinScreenSettings2.getShouldBottomFormAvoidKeyboard() : null;
                dVar.f104565i.invoke(Boolean.valueOf(shouldBottomFormAvoidKeyboard != null ? shouldBottomFormAvoidKeyboard.booleanValue() : true));
                D6.G(dVar.f104568l, lVar.f104490b);
            } else if (L.f(p23, P2.c.f318721a)) {
                D6.w(dVar.f104568l);
                D6.H(dVar.f104566j);
                if (this.f104573m) {
                    C42670a.d(dVar.f104567k);
                }
            } else {
                if (!(p23 instanceof P2.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                D6.w(dVar.f104568l);
                D6.H(dVar.f104566j);
                dVar.f104567k.e(new b.a(dVar.f104557a.getContext(), z.k(((P2.a) p23).f318719a), null, null, null, new com.avito.android.autoteka.presentation.reportGeneration.a(this.f104574n, 16), 28, null));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalBeduinViewImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<View> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            return d.this.f104557a.findViewById(R.id.beduin_content);
        }
    }

    /* compiled from: UniversalBeduinViewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f104576b;

        public c(Y41.l lVar) {
            this.f104576b = lVar;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f104576b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f104576b;
        }

        public final int hashCode() {
            return this.f104576b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f104576b.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k View view, @k InterfaceC22983P interfaceC22983P, @k io.reactivex.rxjava3.disposables.c cVar, @k com.avito.android.beduin.common.navigation_bar.b bVar, @k AbstractC25658a<? extends RecyclerView.C> abstractC25658a, @k AbstractC25658a<? extends RecyclerView.C> abstractC25658a2, @k AbstractC25658a<? extends RecyclerView.C> abstractC25658a3, @l MaterialToolbar materialToolbar, @k Y41.l<? super Boolean, G0> lVar) {
        this.f104557a = view;
        this.f104558b = interfaceC22983P;
        this.f104559c = cVar;
        this.f104560d = bVar;
        this.f104561e = abstractC25658a;
        this.f104562f = abstractC25658a2;
        this.f104563g = abstractC25658a3;
        this.f104564h = materialToolbar;
        this.f104565i = lVar;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.beduin_overlay_container);
        this.f104566j = viewGroup;
        this.f104567k = new com.avito.android.beduin_shared.model.progress_overlay.a(viewGroup, new b());
        this.f104568l = view.findViewById(R.id.progress_layout);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.beduin_navigation_bar_right_list);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.beduin_top_list);
        this.f104569m = recyclerView2;
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.beduin_main_list);
        this.f104570n = recyclerView3;
        RecyclerView recyclerView4 = (RecyclerView) view.findViewById(R.id.beduin_bottom_list);
        this.f104571o = recyclerView4;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            recyclerView.getContext();
            h.a(recyclerView, bVar, new LinearLayoutManager(0, false));
        }
        for (Q q12 : C42745f0.U(new Q(recyclerView2, abstractC25658a), new Q(recyclerView3, abstractC25658a2), new Q(recyclerView4, abstractC25658a3))) {
            h.b((RecyclerView) q12.f406619b, (AbstractC25658a) q12.f406620c);
        }
        recyclerView4.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 3));
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    @k
    public final View a() {
        return this.f104557a.findViewById(R.id.beduin_toolbar);
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    @k
    /* renamed from: b, reason: from getter */
    public final RecyclerView getF104570n() {
        return this.f104570n;
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    @k
    /* renamed from: c, reason: from getter */
    public final RecyclerView getF104571o() {
        return this.f104571o;
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    public final void d(@k m mVar) {
        mVar.f104510a0.removeObservers(this.f104558b);
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    @k
    /* renamed from: e, reason: from getter */
    public final RecyclerView getF104569m() {
        return this.f104569m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.beduin.ui.universal.view.c
    public final void f(@k m mVar) {
        mVar.f104510a0.observe(this.f104558b, new c(new a(mVar.f104498O == null, mVar)));
        List listU = C42745f0.U(new Q(mVar.f104516g0, this.f104560d), new Q(mVar.f104518i0, this.f104561e), new Q(mVar.f104520k0, this.f104562f), new Q(mVar.f104522m0, this.f104563g));
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            ((AbstractC25658a) ((Q) it.next()).f406620c).o(mVar.f104497N.B0());
        }
        com.avito.android.beduin_shared.model.utils.l.b(listU, this.f104559c);
    }

    @Override // com.avito.android.beduin.ui.universal.view.c
    @k
    /* renamed from: getView, reason: from getter */
    public final View getF104557a() {
        return this.f104557a;
    }
}
