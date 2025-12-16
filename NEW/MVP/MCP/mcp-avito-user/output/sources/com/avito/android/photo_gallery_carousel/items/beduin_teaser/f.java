package com.avito.android.photo_gallery_carousel.items.beduin_teaser;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_shared.model.utils.j;
import com.avito.android.beduin_shared.model.utils.l;
import com.avito.android.remote.model.beduin_teaser.BeduinItemTeaser;
import dj.InterfaceC39736a;
import gj.InterfaceC40691b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import lj.InterfaceC43779a;

/* compiled from: GalleryBeduinItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/beduin_teaser/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/photo_gallery_carousel/items/beduin_teaser/e;", "Lcom/avito/android/photo_gallery_carousel/items/common/c;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements e, com.avito.android.photo_gallery_carousel.items.common.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f217897b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC39736a f217898c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC43779a f217899d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f217900e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC43779a f217901f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC43779a f217902g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC43779a f217903h;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k View view, @k InterfaceC25659b interfaceC25659b, @k InterfaceC39736a interfaceC39736a, @k InterfaceC40691b interfaceC40691b) {
        super(view);
        this.f217897b = view;
        this.f217898c = interfaceC39736a;
        new com.avito.android.photo_gallery_carousel.items.common.e(view);
        this.f217899d = interfaceC40691b.j();
        this.f217900e = new io.reactivex.rxjava3.disposables.c();
        this.f217901f = interfaceC40691b.j();
        this.f217902g = interfaceC40691b.j();
        this.f217903h = interfaceC40691b.j();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.beduin_top_components);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.beduin_main_components);
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.beduin_bottom_components);
        com.avito.android.beduin.common.component.adapter.a aVarI = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        com.avito.android.beduin.common.component.adapter.a aVarI2 = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        com.avito.android.beduin.common.component.adapter.a aVarI3 = com.avito.android.bxcontent.mvi.entity.f.i(24, interfaceC25659b);
        for (Q q12 : C42745f0.U(new Q(recyclerView, aVarI), new Q(recyclerView2, aVarI2), new Q(recyclerView3, aVarI3))) {
            RecyclerView recyclerView4 = (RecyclerView) q12.f406619b;
            AbstractC25658a abstractC25658a = (AbstractC25658a) q12.f406620c;
            abstractC25658a.o(this.f217898c);
            this.f217897b.getContext();
            recyclerView4.setLayoutManager(new LinearLayoutManager());
            recyclerView4.setAdapter(abstractC25658a);
        }
        l.b(C42745f0.U(new Q(this.f217901f.getF103348p(), aVarI), new Q(this.f217902g.getF103348p(), aVarI2), new Q(this.f217903h.getF103348p(), aVarI3)), this.f217900e);
    }

    @Override // com.avito.android.photo_gallery_carousel.items.beduin_teaser.e
    public final void J00(@k BeduinItemTeaser beduinItemTeaser) {
        List<BeduinModel> topComponents = beduinItemTeaser.getTopComponents();
        if (topComponents == null) {
            topComponents = C42784z0.f406748b;
        }
        String topFormId = beduinItemTeaser.getTopFormId();
        if (topFormId == null) {
            topFormId = "top";
        }
        InterfaceC43779a interfaceC43779a = this.f217902g;
        j.b(interfaceC43779a, topFormId, topComponents);
        List<BeduinModel> mainComponents = beduinItemTeaser.getMainComponents();
        if (mainComponents == null) {
            mainComponents = C42784z0.f406748b;
        }
        String mainFormId = beduinItemTeaser.getMainFormId();
        if (mainFormId == null) {
            mainFormId = "main";
        }
        j.b(interfaceC43779a, mainFormId, mainComponents);
        List<BeduinModel> bottomComponents = beduinItemTeaser.getBottomComponents();
        if (bottomComponents == null) {
            bottomComponents = C42784z0.f406748b;
        }
        String bottomFormId = beduinItemTeaser.getBottomFormId();
        if (bottomFormId == null) {
            bottomFormId = "bottom";
        }
        j.b(this.f217903h, bottomFormId, bottomComponents);
    }
}
