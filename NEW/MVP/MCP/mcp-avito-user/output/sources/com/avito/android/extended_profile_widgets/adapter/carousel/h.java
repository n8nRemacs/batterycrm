package com.avito.android.extended_profile_widgets.adapter.carousel;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CarouselItemView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/carousel/h;", "LTV0/e;", "a", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface h extends TV0.e {

    /* compiled from: CarouselItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/carousel/h$a;", "", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f154301a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final LinearLayoutManager.SavedState f154302b;

        public a(int i12, @l LinearLayoutManager.SavedState savedState) {
            this.f154301a = i12;
            this.f154302b = savedState;
        }
    }

    /* compiled from: CarouselItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    void XJ(@k CarouselItem carouselItem, @k Y41.l<? super a, G0> lVar);
}
