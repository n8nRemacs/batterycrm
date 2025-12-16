package com.avito.android.job.cv_packages;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cQ.b;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: JobCvPackagesRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_packages/j;", "Lru/avito/component/toolbar/a;", "_avito_job_cv-packages_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements ru.avito.component.toolbar.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<cQ.b, G0> f174413b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f174414c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f174415d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final CollapsingTitleAppBarLayout f174416e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f174417f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f174418g;

    /* compiled from: JobCvPackagesRenderer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            j.this.f174413b.invoke(b.c.f57858a);
            return G0.f406611a;
        }
    }

    public j(@Y61.k Y41.l lVar, @Y61.k View view, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.konveyor.adapter.j jVar) {
        this.f174413b = lVar;
        this.f174414c = jVar;
        this.f174415d = aVar;
        View viewFindViewById = view.findViewById(R.id.app_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.avito.component.toolbar.CollapsingTitleAppBarLayout");
        }
        CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = (CollapsingTitleAppBarLayout) viewFindViewById;
        collapsingTitleAppBarLayout.setClickListener(this);
        this.f174416e = collapsingTitleAppBarLayout;
        View viewFindViewById2 = view.findViewById(R.id.recycler_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        recyclerView.l(new com.avito.android.job.cv_packages.a(), -1);
        this.f174417f = recyclerView;
        com.avito.android.progress_overlay.l lVar2 = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.progress_root), R.id.recycler_view, null, 0, 0, 28, null);
        lVar2.f231600j = new a();
        this.f174418g = lVar2;
    }

    @Override // ru.avito.component.toolbar.a
    public final void R() {
        this.f174413b.invoke(b.a.f57856a);
    }

    @Override // ru.avito.component.toolbar.a
    public final void u() {
    }
}
