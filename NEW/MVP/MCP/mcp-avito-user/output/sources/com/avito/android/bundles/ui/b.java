package com.avito.android.bundles.ui;

import Dk.h;
import Y41.l;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.bundles.ui.VasBundlesFragment;
import com.avito.android.bundles.viewmodel.k;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VasBundlesFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/bundles/viewmodel/k;", "kotlin.jvm.PlatformType", "viewState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/bundles/viewmodel/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements l<k, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VasBundlesFragment f108353l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(VasBundlesFragment vasBundlesFragment) {
        super(1);
        this.f108353l = vasBundlesFragment;
    }

    @Override // Y41.l
    public final G0 invoke(k kVar) {
        k kVar2 = kVar;
        P2<h> p22 = kVar2.f108763a;
        VasBundlesFragment.a aVar = VasBundlesFragment.f108335A0;
        VasBundlesFragment vasBundlesFragment = this.f108353l;
        if (p22 instanceof P2.c) {
            com.avito.android.progress_overlay.l lVar = vasBundlesFragment.f108345w0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.k(null);
        } else if (p22 instanceof P2.b) {
            com.avito.android.progress_overlay.l lVar2 = vasBundlesFragment.f108345w0;
            if (lVar2 == null) {
                lVar2 = null;
            }
            lVar2.j();
        } else if (p22 instanceof P2.a) {
            com.avito.android.progress_overlay.l lVar3 = vasBundlesFragment.f108345w0;
            if (lVar3 == null) {
                lVar3 = null;
            }
            lVar3.a("");
        }
        List<TV0.a> list = kVar2.f108764b;
        if (list != null) {
            com.avito.android.recycler.data_aware.c cVar = vasBundlesFragment.f108337o0;
            if (cVar == null) {
                cVar = null;
            }
            cVar.c(new UV0.c(list));
        }
        com.avito.android.bundles.ui.view.b bVar = vasBundlesFragment.f108341s0;
        if (bVar == null) {
            bVar = null;
        }
        com.avito.android.bundles.ui.view.a aVar2 = vasBundlesFragment.f108347y0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        ButtonAction buttonAction = kVar2.f108765c;
        bVar.a(aVar2, buttonAction);
        int dimensionPixelOffset = buttonAction != null ? vasBundlesFragment.requireContext().getResources().getDimensionPixelOffset(R.dimen.vas_bundle_floating_empty_button_top_padding) : 0;
        RecyclerView recyclerView = vasBundlesFragment.f108344v0;
        RecyclerView recyclerView2 = recyclerView != null ? recyclerView : null;
        recyclerView2.setPadding(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getPaddingRight(), dimensionPixelOffset);
        return G0.f406611a;
    }
}
