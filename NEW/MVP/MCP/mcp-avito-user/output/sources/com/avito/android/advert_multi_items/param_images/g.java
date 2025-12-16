package com.avito.android.advert_multi_items.param_images;

import Fc1.G3;
import Qa.C14874b;
import Qa.InterfaceC14873a;
import Qa.InterfaceC14875c;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert_multi_items.AdvertDetailsMultiItemState;
import com.avito.android.advert_multi_items.param_images.modification_image.ModificationImageItem;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.adapter.h;
import com.avito.konveyor.adapter.j;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MultiItemParamImagesView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_multi_items/param_images/g;", "Lcom/avito/android/advert_multi_items/param_images/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-multi-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC14873a f85943b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final InterfaceC14875c f85944c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C14874b f85945d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RecyclerView f85946e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final h f85947f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final j f85948g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.advert_multi_items.a f85949h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public List<ModificationImageItem> f85950i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final G3 f85951j;

    public g(@k InterfaceC14873a interfaceC14873a, @l InterfaceC14875c interfaceC14875c, @k View view) throws BlueprintCollisionException {
        super(view);
        this.f85943b = interfaceC14873a;
        this.f85944c = interfaceC14875c;
        int iB2 = y6.b(6);
        this.f85945d = new C14874b(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.images_list);
        this.f85946e = recyclerView;
        this.f85949h = new com.avito.android.advert_multi_items.a(recyclerView, recyclerView.getPaddingStart(), iB2);
        this.f85951j = new G3(this, 24);
        com.avito.android.advert_multi_items.param_images.modification_image.a aVar = new com.avito.android.advert_multi_items.param_images.modification_image.a(interfaceC14873a);
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        h hVar = new h(aVarA, aVarA, null, 4, null);
        this.f85947f = hVar;
        j jVar = new j(hVar, aVarA);
        this.f85948g = jVar;
        recyclerView.setAdapter(jVar);
        recyclerView.l(new com.avito.android.ui.h(0, 0, 0, iB2, 6, null), -1);
    }

    @Override // Sa.InterfaceC15166a
    public final void Zp(@k AdvertDetailsMultiItemState.ParamState paramState) {
        this.f85946e.removeCallbacks(this.f85951j);
        List<ModificationImageItem> list = this.f85950i;
        if (list == null) {
            return;
        }
        com.avito.android.advert_multi_items.a aVar = this.f85949h;
        aVar.getClass();
        aVar.f85879d.b2(paramState.f85871b, paramState.f85872c);
        aVar.f85876a.post(new J11.c(4, aVar, list));
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        MultiItemParamImagesItem multiItemParamImagesItem = (MultiItemParamImagesItem) aVar;
        List<ModificationImageItem> list = multiItemParamImagesItem.f85935c;
        this.f85950i = list;
        this.f85945d.a(multiItemParamImagesItem.f85934b, this.f85943b);
        this.f85947f.f338510e = new UV0.c(list);
        this.f85948g.notifyDataSetChanged();
        this.f85946e.post(this.f85951j);
        InterfaceC14875c interfaceC14875c = this.f85944c;
        if (interfaceC14875c != null) {
            interfaceC14875c.p();
        }
    }

    @Override // Sa.InterfaceC15166a
    @k
    public final AdvertDetailsMultiItemState.ParamState qU() {
        return this.f85949h.a();
    }
}
