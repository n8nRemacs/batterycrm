package com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder;

import Lw.InterfaceC14443a;
import Y41.l;
import Y41.p;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.developments_agency_search.screen.realty_agency_search.view.AgencySearchResultBottomSheetBehavior;
import com.avito.android.util.D6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import wY0.C49576a;

/* compiled from: NavigationMenuButtonViewHolder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/view_holder/b;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/view_holder/a;", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l<InterfaceC14443a, G0> f139004a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ComposeView f139005b;

    /* renamed from: c, reason: collision with root package name */
    public int f139006c;

    /* renamed from: d, reason: collision with root package name */
    public int f139007d;

    /* renamed from: e, reason: collision with root package name */
    public float f139008e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public a f139009f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TimeInterpolator f139010g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TimeInterpolator f139011h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NavigationMenuButtonViewHolder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/view_holder/b$a;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f139012b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f139013c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f139014d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f139015e;

        static {
            a aVar = new a("DOWN", 0);
            f139012b = aVar;
            a aVar2 = new a("UP", 1);
            f139013c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f139014d = aVarArr;
            f139015e = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f139014d.clone();
        }
    }

    /* compiled from: NavigationMenuButtonViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.b$b, reason: collision with other inner class name */
    public static final class C4188b extends N implements p<A, Integer, G0> {
        public C4188b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, r.c(-1196339237, new com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.d(b.this), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: NavigationMenuButtonViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/developments_agency_search/screen/realty_agency_search/view_holder/b$c", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends BottomSheetBehavior.c {
        public c() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onSlide(@Y61.k View view, float f12) {
            b.a(b.this, f12, 0);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onStateChanged(@Y61.k View view, int i12) {
            b bVar = b.this;
            bVar.f139007d = i12;
            b.a(bVar, bVar.f139008e, 0);
        }
    }

    /* compiled from: NavigationMenuButtonViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/developments_agency_search/screen/realty_agency_search/view_holder/b$d", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends RecyclerView.r {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
            b bVar = b.this;
            b.a(bVar, bVar.f139008e, i13);
        }
    }

    public b(@Y61.k l lVar, @Y61.k View view, boolean z12) {
        this.f139004a = lVar;
        View viewFindViewById = view.findViewById(R.id.navigation_menu_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        }
        ComposeView composeView = (ComposeView) viewFindViewById;
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        composeView.setContent(new C22096n(1228976470, new C4188b(), true));
        D6.G(composeView, z12);
        this.f139005b = composeView;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.searchResultsRecyclerView);
        recyclerView.o(new d());
        ((AgencySearchResultBottomSheetBehavior) ((CoordinatorLayout.g) recyclerView.getLayoutParams()).f44447a).v(new c());
        this.f139009f = a.f139013c;
        this.f139010g = C49576a.d(view.getContext(), com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, new androidx.interpolator.view.animation.c());
        this.f139011h = C49576a.d(view.getContext(), com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, new androidx.interpolator.view.animation.a());
    }

    public static final void a(b bVar, float f12, int i12) {
        int i13 = bVar.f139007d;
        if (i13 == 3) {
            int i14 = bVar.f139006c;
            if (i14 > 0) {
                bVar.b();
            } else if (i14 < 0) {
                bVar.c();
            }
        } else if (i13 == 6) {
            bVar.c();
        } else if (i13 == 4 || i13 == 5) {
            bVar.b();
        } else if (i13 == 2 || i13 == 1) {
            if (f12 < 0.5f) {
                bVar.b();
            } else {
                float f13 = bVar.f139008e;
                if (f13 < f12) {
                    bVar.b();
                } else if (f13 > f12) {
                    bVar.c();
                }
            }
        }
        bVar.f139008e = f12;
        bVar.f139006c = i12;
    }

    public final void b() {
        a aVar = this.f139009f;
        a aVar2 = a.f139012b;
        if (aVar == aVar2) {
            return;
        }
        this.f139009f = aVar2;
        this.f139005b.animate().translationY(r0.getHeight()).setInterpolator(this.f139011h).setDuration(175L).start();
    }

    public final void c() {
        a aVar = this.f139009f;
        a aVar2 = a.f139013c;
        if (aVar == aVar2) {
            return;
        }
        this.f139009f = aVar2;
        this.f139005b.animate().translationY(0.0f).setInterpolator(this.f139010g).setDuration(225L).start();
    }
}
