package com.avito.android.developments_agency_search.adapter.gallery;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.cyclic_gallery_widget.image_carousel.p;
import com.avito.android.cyclic_gallery_widget.image_carousel.r;
import com.avito.android.cyclic_gallery_widget.image_carousel.u;
import com.avito.android.remote.model.Image;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/gallery/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/adapter/gallery/f;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final RecyclerView f136287b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p f136288c;

    public g(@k View view) throws BlueprintCollisionException {
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.gallery);
        this.f136287b = recyclerView;
        r rVar = new r(new u(1.3333334f, new com.jakewharton.rxrelay3.c()), null, null, null, null, null, 62, null);
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(rVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        this.f136288c = new p(recyclerView, new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, null, false, Integer.valueOf(y6.b(4)), null, false, 192, null);
    }

    @Override // com.avito.android.developments_agency_search.adapter.gallery.f
    public final void lz(@k a aVar) {
        p pVar = this.f136288c;
        List<Image> list = aVar.f136279c;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.avito.android.image_loader.b.b((Image) it.next()));
        }
        int i12 = p.f132065v;
        pVar.g(arrayList, false);
        int iB2 = y6.b(aVar.f136280d);
        D6.f(pVar.f132066a, iB2, 0, iB2, 0, 10);
    }

    @Override // com.avito.android.developments_agency_search.adapter.gallery.f
    public final void setOpacity(float f12) {
        this.f136287b.setAlpha(f12);
    }
}
