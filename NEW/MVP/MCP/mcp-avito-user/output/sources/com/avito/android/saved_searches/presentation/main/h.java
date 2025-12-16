package com.avito.android.saved_searches.presentation.main;

import Eo0.InterfaceC13515a;
import Y41.l;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22823h0;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22977J;
import androidx.view.C22981N;
import androidx.view.InterfaceC22983P;
import androidx.view.V0;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.saved_searches.presentation.main.mvi.entity.SavedSearchMainViewState;
import com.avito.android.util.y6;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;

/* compiled from: SavedSearchMainView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/h;", "", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ActivityC22955m f258605a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f258606b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l<InterfaceC13515a, G0> f258607c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.saved_searches.presentation.core.f f258608d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f258609e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f258610f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Button f258611g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C42670a f258612h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f258613i;

    /* renamed from: j, reason: collision with root package name */
    public final int f258614j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final C22977J f258615k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public N0 f258616l;

    public h(@Y61.k ActivityC22955m activityC22955m, @Y61.k Dialog dialog, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k l lVar, @Y61.k com.avito.android.saved_searches.presentation.core.f fVar) {
        this.f258605a = activityC22955m;
        this.f258606b = aVar;
        this.f258607c = lVar;
        this.f258608d = fVar;
        View viewFindViewById = view.findViewById(R.id.saved_search_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f258609e = recyclerView;
        Button button = (Button) dialog.findViewById(R.id.main_button);
        button.setOnClickListener(new c(this, 0));
        this.f258610f = button;
        Button button2 = (Button) dialog.findViewById(R.id.secondary_button);
        button2.setOnClickListener(new c(this, 1));
        this.f258611g = button2;
        View viewFindViewById2 = view.findViewById(R.id.progress_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f258612h = new C42670a((ViewGroup) viewFindViewById2, new f(view), 0, 4, null);
        this.f258613i = dialog.findViewById(R.id.fadable);
        this.f258614j = y6.b(68);
        InterfaceC22983P interfaceC22983PA = V0.a(recyclerView);
        this.f258615k = interfaceC22983PA != null ? C22981N.a(interfaceC22983PA.getLifecycle()) : null;
        jVar.setHasStableIds(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(jVar);
        recyclerView.l(com.avito.android.saved_searches.presentation.core.e.f258402b, -1);
        recyclerView.o(new e(this));
        C22823h0.K(activityC22955m.getWindow().getDecorView(), new com.avito.android.offlinization.ui.a(this, 16));
    }

    public final void a(SavedSearchMainViewState.Content.Button button, SavedSearchMainViewState.Content.Button button2) {
        boolean z12 = button != null && button.f258674c;
        boolean z13 = !z12;
        Button button3 = this.f258610f;
        button3.setClickable(z13);
        button3.setEnabled(z13);
        button3.setLoading(z12);
        com.avito.android.lib.design.button.b.a(button3, button != null ? button.f258673b : null, false);
        boolean z14 = button2 != null && button2.f258674c;
        boolean z15 = !z14;
        Button button4 = this.f258611g;
        button4.setClickable(z15);
        button4.setEnabled(z15);
        button4.setLoading(z14);
        com.avito.android.lib.design.button.b.a(button4, button2 != null ? button2.f258673b : null, false);
    }
}
