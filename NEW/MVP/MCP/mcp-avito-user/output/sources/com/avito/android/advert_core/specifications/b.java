package com.avito.android.advert_core.specifications;

import Y61.k;
import com.avito.android.advert_core.specifications.a;
import com.avito.android.remote.model.ModelSpecifications;
import com.avito.android.serp.adapter.InterfaceC34736h0;
import com.avito.android.serp.adapter.LayoutType;
import com.avito.android.serp.adapter.SerpViewType;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: SpecificationsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/specifications/b;", "LU9/b;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements U9.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC34736h0 f84393a;

    @Inject
    public b(@k InterfaceC34736h0 interfaceC34736h0) {
        this.f84393a = interfaceC34736h0;
    }

    @Override // U9.b
    @k
    public final Q a(@k ModelSpecifications modelSpecifications) {
        LayoutType layoutType = this.f84393a.getLayoutType();
        int i12 = layoutType.f268518d;
        SerpViewType serpViewType = SerpViewType.f268582b;
        int i13 = i12 / (i12 / layoutType.f268517c);
        String modelTitle = modelSpecifications.getModelTitle();
        a.c cVar = (modelTitle == null || modelTitle.length() == 0) ? null : new a.c(modelSpecifications.getModelTitle(), i13);
        a.b bVar = modelSpecifications.getScheme() != null ? new a.b(modelSpecifications.getScheme(), Math.max(1, i13 - 1)) : null;
        a.C2501a c2501a = modelSpecifications.getBlocks().isEmpty() ? null : new a.C2501a(modelSpecifications.getBlocks().get(0));
        ArrayList arrayList = new ArrayList();
        if (cVar != null) {
            arrayList.add(cVar);
        }
        if (i13 <= 1) {
            if (bVar != null) {
                arrayList.add(bVar);
            }
            if (c2501a != null) {
                arrayList.add(c2501a);
            }
        } else {
            if (c2501a != null) {
                arrayList.add(c2501a);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        int size = modelSpecifications.getBlocks().size();
        int i14 = 2;
        for (int i15 = 1; i15 < size; i15++) {
            if (i14 == -2 && bVar != null) {
                arrayList.add(bVar);
            }
            arrayList.add(new a.C2501a(modelSpecifications.getBlocks().get(i15)));
            i14++;
        }
        return new Q(Integer.valueOf(i13), arrayList);
    }
}
