package com.avito.android.photo_gallery.grid_gallery.items.beduin_teaser;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.AbstractC25658a;
import com.avito.android.R;
import com.avito.android.beduin_models.BeduinModel;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import gj.InterfaceC40691b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GridGalleryBeduinTeaserView.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/beduin_teaser/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/photo_gallery/grid_gallery/items/beduin_teaser/f;", "a", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40691b f217241b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f217242c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f217243d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AbstractC25658a<? extends RecyclerView.C> f217244e;

    /* compiled from: GridGalleryBeduinTeaserView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/items/beduin_teaser/g$a;", "", "<init>", "()V", "", "BOTTOM_COMPONENTS_FORM_ID", "Ljava/lang/String;", "MAIN_COMPONENTS_FORM_ID", "TOP_COMPONENTS_FORM_ID", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public g(@k View view, @k InterfaceC40691b interfaceC40691b, @k AbstractC25658a<? extends RecyclerView.C> abstractC25658a, @k AbstractC25658a<? extends RecyclerView.C> abstractC25658a2, @k AbstractC25658a<? extends RecyclerView.C> abstractC25658a3) {
        super(view);
        this.f217241b = interfaceC40691b;
        this.f217242c = abstractC25658a;
        this.f217243d = abstractC25658a2;
        this.f217244e = abstractC25658a3;
        view.getContext();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.topComponents);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.mainComponents);
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.bottomComponents);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        recyclerView3.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(abstractC25658a);
        recyclerView2.setAdapter(abstractC25658a2);
        recyclerView3.setAdapter(abstractC25658a3);
    }

    @Override // com.avito.android.photo_gallery.grid_gallery.items.beduin_teaser.f
    public final void Fn(@k c cVar) {
        List<BeduinModel> list = cVar.f217237b;
        InterfaceC40691b interfaceC40691b = this.f217241b;
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> listA = com.avito.android.beduin_shared.model.utils.b.a(interfaceC40691b, "GridGalleryBeduinTeaserTopComponents", list);
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> listA2 = com.avito.android.beduin_shared.model.utils.b.a(interfaceC40691b, "GridGalleryBeduinTeaserMainComponents", cVar.f217238c);
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> listA3 = com.avito.android.beduin_shared.model.utils.b.a(interfaceC40691b, "GridGalleryBeduinTeaserBottomComponents", cVar.f217239d);
        this.f217242c.m(listA);
        this.f217243d.m(listA2);
        this.f217244e.m(listA3);
    }
}
