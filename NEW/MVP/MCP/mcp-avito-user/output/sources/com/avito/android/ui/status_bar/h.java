package com.avito.android.ui.status_bar;

import Y61.l;
import android.R;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.core.view.L0;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.lib.util.darkTheme.ThemeAppearance;
import com.avito.android.lib.util.z;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.ui.status_bar.a;
import com.avito.android.ui.status_bar.d;
import com.avito.android.util.C35835l0;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;
import sK0.C48063a;

/* compiled from: StatusBarUpdatesHandlerImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ui/status_bar/h;", "Lcom/avito/android/ui/status_bar/e;", "<init>", "()V", "_avito_status-bar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes4.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f304672a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43238h f304673b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Integer f304674c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public d f304675d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f304676e;

    @Inject
    public h() {
        d dVar = new d(ThemeAppearance.f181334b, new d.a.C9356a(R.attr.statusBarColor));
        this.f304672a = dVar;
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        this.f304673b = U.a(K.f411877a.y());
        this.f304675d = dVar;
        com.avito.android.lib.design.bottom_sheet.d.f178509B.getClass();
        com.avito.android.lib.design.bottom_sheet.d.f178511D.t0(new g(this));
    }

    @Override // com.avito.android.ui.status_bar.e
    public final void a(@Y61.k BaseFragment baseFragment) {
        if (c.a(baseFragment)) {
            return;
        }
        a.C9355a c9355a = a.f304645Z1;
        View viewRequireView = baseFragment.requireView();
        c9355a.getClass();
        d(viewRequireView.findViewById(com.avito.android.R.id.edge_to_edge_fake_status_bar), baseFragment.requireContext(), baseFragment.requireActivity().getWindow(), this.f304675d, true);
    }

    @Override // com.avito.android.ui.status_bar.e
    public final void b(@Y61.k com.avito.android.ui.activity.a aVar) {
        a.f304645Z1.getClass();
        d(aVar.findViewById(com.avito.android.R.id.edge_to_edge_fake_status_bar), aVar, aVar.getWindow(), this.f304675d, true);
    }

    @Override // com.avito.android.ui.status_bar.e
    public final void c(@Y61.k BaseFragment baseFragment, @Y61.k List list) {
        if (c.a(baseFragment)) {
            return;
        }
        ActivityC22955m activityC22955mRequireActivity = baseFragment.requireActivity();
        baseFragment.getLifecycle().a(new f(this, baseFragment, new l0.h(), list, activityC22955mRequireActivity));
    }

    public final void d(View view, Context context, Window window, d dVar, boolean z12) {
        int iIntValue;
        new L0(window, window.getDecorView()).e(com.avito.android.lib.util.darkTheme.d.a(dVar.f304649a, com.avito.android.lib.util.darkTheme.c.a(context)));
        if (z12) {
            d.a aVar = dVar.f304650b;
            if (aVar instanceof d.a.C9356a) {
                iIntValue = C35835l0.d(((d.a.C9356a) aVar).f304651a, context);
                f(context, window);
            } else if (aVar instanceof d.a.C9357d) {
                iIntValue = androidx.core.content.d.getColor(context, ((d.a.C9357d) aVar).f304655a);
                f(context, window);
            } else if (aVar instanceof d.a.e) {
                iIntValue = C48063a.f437606a.a(context, ((d.a.e) aVar).f304656a);
                f(context, window);
            } else if (aVar instanceof d.a.b) {
                d.a.b bVar = (d.a.b) aVar;
                Integer num = (Integer) new ArgbEvaluator().evaluate(bVar.f304653b, Integer.valueOf(androidx.core.content.d.getColor(context, com.avito.android.R.color.white)), Integer.valueOf(C48063a.f437606a.a(window.getContext(), bVar.f304652a)));
                f(context, window);
                iIntValue = num.intValue();
            } else {
                if (!(aVar instanceof d.a.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                int iD2 = C35835l0.d(com.avito.android.R.attr.transparentWhite, context);
                this.f304676e = true;
                window.setBackgroundDrawable(((d.a.c) aVar).f304654a);
                iIntValue = iD2;
            }
            com.avito.android.lib.util.i.f181373a.getClass();
            if (com.avito.android.lib.util.i.f181377e) {
                view.setBackgroundColor(iIntValue);
            } else {
                window.setStatusBarColor(iIntValue);
            }
        }
        this.f304675d = dVar;
    }

    public final void e(@Y61.k BaseFragment baseFragment) {
        ActivityC22955m activityC22955mRequireActivity = baseFragment.requireActivity();
        a.C9355a c9355a = a.f304645Z1;
        View viewRequireView = baseFragment.requireView();
        c9355a.getClass();
        View viewFindViewById = viewRequireView.findViewById(com.avito.android.R.id.edge_to_edge_fake_status_bar);
        Window window = activityC22955mRequireActivity.getWindow();
        com.avito.android.lib.util.i.f181373a.getClass();
        d(viewFindViewById, activityC22955mRequireActivity, window, this.f304672a, !com.avito.android.lib.util.i.f181377e);
    }

    public final void f(Context context, Window window) {
        if (this.f304676e) {
            z.f181429a.getClass();
            z.a(window, context, null);
            this.f304676e = false;
        }
    }
}
