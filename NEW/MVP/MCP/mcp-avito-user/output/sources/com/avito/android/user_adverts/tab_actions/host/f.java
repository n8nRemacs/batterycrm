package com.avito.android.user_adverts.tab_actions.host;

import a90.ViewOnLayoutChangeListenerC19701a;
import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.design.tab_bar.TabBarLayout;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.user_adverts.root_screen.adverts_host.C35566d;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i31.InterfaceC41220a;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsActionsView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/f;", "", "a", "b", "c", "d", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f314283a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.h f314284b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f314285c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f314286d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.C9699a f314287e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f314288f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f314289g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f314290h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Object f314291i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Object f314292j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f314293k;

    /* compiled from: UserAdvertsActionsView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/f$a;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: UserAdvertsActionsView.kt */
        @s0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/f$a$a;", "Lcom/avito/android/user_adverts/tab_actions/host/f$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.tab_actions.host.f$a$a, reason: collision with other inner class name */
        public static final class C9699a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final UserAdvertsActionsBottomSheetView f314294a;

            public C9699a(@Y61.k ViewGroup viewGroup) {
                UserAdvertsActionsBottomSheetView userAdvertsActionsBottomSheetView = (UserAdvertsActionsBottomSheetView) viewGroup.findViewById(R.id.user_adverts_actions_bottom_sheet_view_re23);
                TabBarLayout.a aVar = TabBarLayout.f180679h;
                aVar.getClass();
                if (TabBarLayout.a.c()) {
                    userAdvertsActionsBottomSheetView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(userAdvertsActionsBottomSheetView, 29));
                } else {
                    userAdvertsActionsBottomSheetView.setPeekHeight(y6.b(135));
                }
                LayoutInflater.from(userAdvertsActionsBottomSheetView.getContext()).inflate(R.layout.user_adverts_actions_bottom_sheet_content, userAdvertsActionsBottomSheetView.f314221e);
                TabBarLayout.a.e(aVar, userAdvertsActionsBottomSheetView.findViewById(R.id.user_advert_actions_info_container), 0, 3);
                this.f314294a = userAdvertsActionsBottomSheetView;
            }
        }
    }

    /* compiled from: UserAdvertsActionsView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/f$b;", "", "<init>", "()V", "", "HEIGHT_CHANGES_ANIM_DURATION_MILLIS", "J", "", "LOADING_VIEW_INVISIBLE_ALPHA", "F", "LOADING_VIEW_VISIBLE_ALPHA", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: UserAdvertsActionsView.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/f$c;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {
        @Y61.k
        f a(@Y61.k ViewGroup viewGroup, @Y61.k C35566d c35566d);
    }

    /* compiled from: UserAdvertsActionsView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/f$d;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends q {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f314295b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final UserAdvertsActionsState.c f314296c;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f314295b == dVar.f314295b && L.f(this.f314296c, dVar.f314296c);
        }

        public final int hashCode() {
            return this.f314296c.hashCode() + (Boolean.hashCode(this.f314295b) * 31);
        }

        @Y61.k
        public final String toString() {
            return "State(isVisible=" + this.f314295b + ", mainState=" + this.f314296c + ')';
        }

        public /* synthetic */ d(boolean z12, UserAdvertsActionsState.c cVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? UserAdvertsActionsState.c.a.f314475a : cVar);
        }

        public d(boolean z12, @Y61.k UserAdvertsActionsState.c cVar) {
            this.f314295b = z12;
            this.f314296c = cVar;
        }
    }

    static {
        new b(null);
    }

    @i31.c
    public f(@InterfaceC41220a @Y61.k ViewGroup viewGroup, @InterfaceC41220a @Y61.k C35566d c35566d, @WI0.a @Y61.k com.avito.konveyor.adapter.h hVar, @WI0.a @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f314283a = viewGroup;
        this.f314284b = hVar;
        this.f314285c = jVar;
        this.f314286d = viewGroup.getContext();
        a.C9699a c9699a = new a.C9699a(viewGroup);
        this.f314287e = c9699a;
        UserAdvertsActionsBottomSheetView userAdvertsActionsBottomSheetView = c9699a.f314294a;
        RecyclerView recyclerView = (RecyclerView) userAdvertsActionsBottomSheetView.findViewById(R.id.user_advert_actions_info_container);
        this.f314288f = recyclerView;
        this.f314289g = (TextView) userAdvertsActionsBottomSheetView.findViewById(R.id.user_advert_actions_info_text);
        View viewFindViewById = viewGroup.findViewById(R.id.user_adverts_actions_bottom_sheet_view_loading);
        this.f314290h = viewFindViewById;
        g gVar = new g(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f314291i = C42727D.b(lazyThreadSafetyMode, gVar);
        this.f314292j = C42727D.b(lazyThreadSafetyMode, new h(this));
        this.f314293k = new i(0, c35566d, com.avito.android.user_adverts.tab_actions.host.d.class, "actionsClosed", "actionsClosed()V", 0);
        recyclerView.setAdapter(jVar);
        recyclerView.setItemAnimator(null);
        screenPerformanceTracker.b(recyclerView);
        viewFindViewById.setAlpha(0.0f);
        viewFindViewById.setClickable(true);
        viewFindViewById.setFocusable(true);
    }

    public final boolean a() {
        int i12 = this.f314287e.f314294a.f314222f.f355975L;
        return i12 == 5 || i12 == 2;
    }

    public final void b(List<? extends com.avito.conveyor_item.a> list) {
        this.f314284b.f338510e = new UV0.c(list);
        this.f314285c.notifyDataSetChanged();
        D6.w(this.f314289g);
        D6.H(this.f314288f);
        if (a()) {
            BottomSheetBehavior<UserAdvertsActionsBottomSheetView> bottomSheetBehavior = this.f314287e.f314294a.f314222f;
            if (bottomSheetBehavior.f355975L == 5) {
                bottomSheetBehavior.b(bottomSheetBehavior.f355973J ? 3 : 4);
            }
        }
    }

    public final void c(PrintableText printableText) {
        String strK0 = printableText.k0(this.f314286d);
        D6.w(this.f314288f);
        I5.a(this.f314289g, strK0, false);
        if (a()) {
            BottomSheetBehavior<UserAdvertsActionsBottomSheetView> bottomSheetBehavior = this.f314287e.f314294a.f314222f;
            if (bottomSheetBehavior.f355975L == 5) {
                bottomSheetBehavior.b(bottomSheetBehavior.f355973J ? 3 : 4);
            }
        }
    }

    public final void d(boolean z12) {
        float f12 = z12 ? 0.7f : 0.0f;
        View view = this.f314290h;
        if (view.getAlpha() == f12) {
            return;
        }
        view.animate().alpha(f12).setListener(new e(f12, this)).start();
    }

    /* compiled from: UserAdvertsActionsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_adverts/tab_actions/host/f$e", "Landroid/animation/Animator$AnimatorListener;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f314297a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f314298b;

        public e(float f12, f fVar) {
            this.f314297a = f12;
            this.f314298b = fVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@Y61.k Animator animator) {
            if (this.f314297a == 0.0f) {
                D6.w(this.f314298b.f314290h);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@Y61.k Animator animator) {
            if (this.f314297a == 0.7f) {
                D6.H(this.f314298b.f314290h);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@Y61.k Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@Y61.k Animator animator) {
        }
    }
}
