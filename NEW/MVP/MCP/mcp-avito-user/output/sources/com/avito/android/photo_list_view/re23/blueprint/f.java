package com.avito.android.photo_list_view.re23.blueprint;

import Hj.C13996a;
import Y61.k;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.ImageAction;
import com.avito.android.remote.model.category_parameters.Purpose;
import com.avito.android.util.T3;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PublishPhotoItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/blueprint/f;", "Lcom/avito/android/photo_list_view/re23/blueprint/d;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.photo_list_view.re23.a f218191b;

    @Inject
    public f(@k com.avito.android.photo_list_view.re23.a aVar) {
        this.f218191b = aVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (ParameterElement.y) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        ParameterElement.y yVar = (ParameterElement.y) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof T3) {
                obj = obj2;
            }
        }
        T3 t32 = (T3) (obj instanceof T3 ? obj : null);
        if (t32 == null) {
            k(hVar, yVar);
            return;
        }
        boolean z12 = t32.f318741a;
        com.avito.android.photo_list_view.re23.a aVar2 = this.f218191b;
        if (z12) {
            C13996a c13996a = new C13996a(yVar.f117599d, yVar.f117605j, yVar.f117607l, yVar.f117609n, yVar.f117600e, null, null, yVar.f117606k, null, 352, null);
            hVar.a60(c13996a);
            aVar2.p(c13996a.f7644b instanceof ItemWithState.State.Error);
        }
        if (t32.f318742b) {
            aVar2.c(yVar.f117602g);
        }
    }

    public final void k(@k h hVar, @k ParameterElement.y yVar) {
        hVar.m5(C42745f0.U(new ImageAction("arrowUp", hVar.getContext().getString(R.string.publish_photo_item_default_action_make_first), Purpose.MAKE_FIRST), new ImageAction("edit", hVar.getContext().getString(R.string.publish_photo_item_default_action_edit), Purpose.EDIT), new ImageAction("delete", hVar.getContext().getString(R.string.publish_photo_item_default_action_delete), Purpose.DELETE)));
        C13996a c13996a = new C13996a(yVar.f117599d, yVar.f117605j, yVar.f117607l, yVar.f117609n, yVar.f117600e, null, null, yVar.f117606k, null, 352, null);
        hVar.a60(c13996a);
        boolean z12 = c13996a.f7644b instanceof ItemWithState.State.Error;
        com.avito.android.photo_list_view.re23.a aVar = this.f218191b;
        aVar.p(z12);
        aVar.c(yVar.f117602g);
        hVar.Q30(aVar);
        hVar.d(new e(this));
    }
}
