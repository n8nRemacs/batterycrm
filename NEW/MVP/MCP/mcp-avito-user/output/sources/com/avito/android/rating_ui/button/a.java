package com.avito.android.rating_ui.button;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.DeeplinkAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingButtonClickedItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/button/a;", "", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DeeplinkAction f249986a;

    public a(@k DeeplinkAction deeplinkAction) {
        this.f249986a = deeplinkAction;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f249986a, ((a) obj).f249986a);
    }

    public final int hashCode() {
        return this.f249986a.hashCode();
    }

    @k
    public final String toString() {
        return "RatingButtonClickedItem(action=" + this.f249986a + ')';
    }
}
