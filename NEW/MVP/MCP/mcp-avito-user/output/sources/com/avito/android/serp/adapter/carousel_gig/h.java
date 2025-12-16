package com.avito.android.serp.adapter.carousel_gig;

import Y61.l;
import com.avito.android.remote.model.GigShiftInfo;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CarouselGigShiftView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_gig/h;", "LTV0/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface h extends TV0.e {

    /* compiled from: CarouselGigShiftView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Cy(@l GigShiftInfo.GigShift gigShift);

    void Fm(@l String str);

    void NN(@l Image image);

    void Pf(@l Y41.a<G0> aVar);

    void Sk();

    void jv(@l String str);

    void m1(@l String str);

    void pj();

    void r1(@l String str, @l Y41.a<G0> aVar);

    void setTitle(@l String str);

    void vx(@l GigShiftInfo.GigShift gigShift);
}
