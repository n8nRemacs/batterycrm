package com.avito.android.gig_motivations_list.ui.compose;

import com.avito.android.remote.model.Size;
import com.avito.android.util.C35829k2;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: MotivationsListEmptyContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class p extends H implements Y41.q<Size, Integer, Integer, Float> {

    /* renamed from: b, reason: collision with root package name */
    public static final p f160328b = new p();

    public p() {
        super(3, C35829k2.class, "widthEstimation", "widthEstimation(Lcom/avito/android/remote/model/Size;II)F", 1);
    }

    @Override // Y41.q
    public final Float invoke(Size size, Integer num, Integer num2) {
        return com.avito.android.advert.item.delivery_suggests.l.m(num2, size, num.intValue());
    }
}
