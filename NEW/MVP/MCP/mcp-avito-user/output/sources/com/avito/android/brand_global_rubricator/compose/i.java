package com.avito.android.brand_global_rubricator.compose;

import Y41.q;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.remote.model.Size;
import com.avito.android.util.C35829k2;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: BrandGlobalRubricatorUi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class i extends H implements q<Size, Integer, Integer, Float> {

    /* renamed from: b, reason: collision with root package name */
    public static final i f107448b = new i();

    public i() {
        super(3, C35829k2.class, "widthEstimation", "widthEstimation(Lcom/avito/android/remote/model/Size;II)F", 1);
    }

    @Override // Y41.q
    public final Float invoke(Size size, Integer num, Integer num2) {
        return l.m(num2, size, num.intValue());
    }
}
