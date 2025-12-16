package com.avito.android.photo_list_view_group_selection.items.imageGroup;

import Y61.k;
import Y61.l;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoItemGroupSelectionImageGroupPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_group_selection/items/imageGroup/c;", "", "_avito_photo-list-view-group-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Boolean f218433a;

    public c(@l Boolean bool) {
        this.f218433a = bool;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f218433a, ((c) obj).f218433a);
    }

    public final int hashCode() {
        Boolean bool = this.f218433a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @k
    public final String toString() {
        return C0.g(new StringBuilder("PhotoItemGroupSelectionImageGroupPayload(checked="), this.f218433a, ')');
    }
}
