package com.avito.android.bundles.vas_union;

import Y41.l;
import com.avito.android.bundles.vas_union.VasUnionFragment;
import com.avito.android.bundles.vas_union.viewmodel.w;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VasUnionFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/bundles/vas_union/viewmodel/w;", "kotlin.jvm.PlatformType", "viewState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/bundles/vas_union/viewmodel/w;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements l<w, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VasUnionFragment f108557l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(VasUnionFragment vasUnionFragment) {
        super(1);
        this.f108557l = vasUnionFragment;
    }

    @Override // Y41.l
    public final G0 invoke(w wVar) {
        w wVar2 = wVar;
        P2<Dk.j> p22 = wVar2.f108742a;
        VasUnionFragment.a aVar = VasUnionFragment.f108455B0;
        VasUnionFragment vasUnionFragment = this.f108557l;
        if (p22 instanceof P2.c) {
            com.avito.android.progress_overlay.l lVar = vasUnionFragment.f108469y0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.k(null);
        } else if (p22 instanceof P2.b) {
            com.avito.android.progress_overlay.l lVar2 = vasUnionFragment.f108469y0;
            if (lVar2 == null) {
                lVar2 = null;
            }
            lVar2.j();
        } else if (p22 instanceof P2.a) {
            com.avito.android.progress_overlay.l lVar3 = vasUnionFragment.f108469y0;
            if (lVar3 == null) {
                lVar3 = null;
            }
            lVar3.a("");
        }
        List<com.avito.conveyor_item.a> list = wVar2.f108743b;
        if (list != null) {
            com.avito.konveyor.adapter.a aVar2 = vasUnionFragment.f108461q0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar2, list);
            com.avito.konveyor.adapter.j jVar = vasUnionFragment.f108462r0;
            (jVar != null ? jVar : null).notifyDataSetChanged();
        }
        return G0.f406611a;
    }
}
