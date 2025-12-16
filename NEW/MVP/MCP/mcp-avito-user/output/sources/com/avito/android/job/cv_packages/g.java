package com.avito.android.job.cv_packages;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.job.cv_packages.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: JobCvPackagesActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/job/cv_packages/mvi/entity/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/job/cv_packages/mvi/entity/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements Y41.l<com.avito.android.job.cv_packages.mvi.entity.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f174390l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar) {
        super(1);
        this.f174390l = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.job.cv_packages.mvi.entity.a aVar) {
        com.avito.android.job.cv_packages.mvi.entity.a aVar2 = aVar;
        j jVar = this.f174390l;
        boolean zEquals = aVar2.equals(a.c.f174463b);
        com.avito.android.progress_overlay.l lVar = jVar.f174418g;
        if (zEquals) {
            lVar.k(null);
        } else if (aVar2 instanceof a.C5146a) {
            a.C5146a c5146a = (a.C5146a) aVar2;
            lVar.j();
            CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = jVar.f174416e;
            collapsingTitleAppBarLayout.setExpanded(true);
            collapsingTitleAppBarLayout.setTitle(c5146a.f174459b);
            collapsingTitleAppBarLayout.setSubTitle(c5146a.f174460c);
            RecyclerView recyclerView = jVar.f174417f;
            com.avito.konveyor.adapter.j jVar2 = jVar.f174414c;
            recyclerView.setAdapter(jVar2);
            com.avito.konveyor.util.a.a(jVar.f174415d, c5146a.f174461d);
            jVar2.notifyDataSetChanged();
        } else {
            if (!(aVar2 instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            lVar.a("");
        }
        return G0.f406611a;
    }
}
