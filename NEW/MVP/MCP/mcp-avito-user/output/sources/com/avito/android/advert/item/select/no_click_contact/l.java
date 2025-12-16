package com.avito.android.advert.item.select.no_click_contact;

import com.avito.android.remote.model.Size;
import com.avito.android.util.C35829k2;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: AutoSelectNoClickContactScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class l extends H implements Y41.q<Size, Integer, Integer, Float> {

    /* renamed from: b, reason: collision with root package name */
    public static final l f79472b = new l();

    public l() {
        super(3, C35829k2.class, "widthEstimation", "widthEstimation(Lcom/avito/android/remote/model/Size;II)F", 1);
    }

    @Override // Y41.q
    public final Float invoke(Size size, Integer num, Integer num2) {
        return com.avito.android.advert.item.delivery_suggests.l.m(num2, size, num.intValue());
    }
}
