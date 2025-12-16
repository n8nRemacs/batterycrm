package com.avito.android.map_core.view;

import Y41.l;
import Y61.k;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MapAsyncProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map_core/view/c;", "Lcom/avito/android/map_core/view/a;", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AvitoMapAttachHelper f185697a;

    @Inject
    public c(@k AvitoMapAttachHelper avitoMapAttachHelper) {
        this.f185697a = avitoMapAttachHelper;
    }

    @Override // com.avito.android.map_core.view.a
    public final void a(@k l lVar, @k View view, @k FragmentManager fragmentManager) {
        b bVar = new b(lVar);
        AvitoMapAttachHelper avitoMapAttachHelper = this.f185697a;
        avitoMapAttachHelper.setMapAttachedListener(bVar);
        avitoMapAttachHelper.attachView(R.id.map_view, view, fragmentManager);
    }
}
