package com.avito.android.photo_list_view_groups.blueprint;

import Y61.l;
import com.avito.android.remote.model.category_parameters.ImageAction;
import com.avito.android.remote.model.category_parameters.ImageBadgeGroup;
import com.avito.android.remote.model.category_parameters.ImageGroup;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PhotoItemGroupsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/blueprint/i;", "LTV0/e;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface i extends TV0.e {

    /* compiled from: PhotoItemGroupsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void H(@l CharSequence charSequence);

    void La(@Y61.k List<ImageGroup> list);

    void Ua(@Y61.k com.avito.android.photo_list_view_groups.g gVar);

    void d(@l Y41.a<G0> aVar);

    void kd(@Y61.k List<ImageBadgeGroup> list);

    void m5(@Y61.k List<ImageAction> list);

    void setTitle(@l String str);

    void u(@l CharSequence charSequence);
}
