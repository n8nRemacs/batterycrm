package com.avito.android.photo_list_view_groups;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.remote.model.category_parameters.slot.images_groups.ImagesGroupsSlot;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhotoItemGroupsImagesGroupsCacheFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/i;", "Landroidx/lifecycle/P0$c;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ImagesGroupsSlot.ParameterProvider f218546a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f218547b;

    @Inject
    public i(@Y61.k ImagesGroupsSlot.ParameterProvider parameterProvider, @Y61.k R0 r02) {
        this.f218546a = parameterProvider;
        this.f218547b = r02;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (cls.isAssignableFrom(l.class)) {
            return new l(this.f218546a, this.f218547b);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
