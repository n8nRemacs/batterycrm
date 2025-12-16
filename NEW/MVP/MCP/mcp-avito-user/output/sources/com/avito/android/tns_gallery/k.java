package com.avito.android.tns_gallery;

import android.app.Activity;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.x6;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TnsGalleryItemSizeHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tns_gallery/k;", "Lcom/avito/android/tns_gallery/j;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Activity f301542a;

    /* renamed from: b, reason: collision with root package name */
    public final int f301543b;

    /* renamed from: c, reason: collision with root package name */
    public final float f301544c;

    /* renamed from: d, reason: collision with root package name */
    public final float f301545d;

    @Inject
    public k(@Y61.k Activity activity, @Y61.k r rVar) {
        this.f301542a = activity;
        Integer num = rVar.f301555a;
        int iIntValue = num != null ? num.intValue() : kotlin.math.b.b(activity.getResources().getDimension(R.dimen.gallery_base_height));
        this.f301543b = iIntValue;
        this.f301544c = iIntValue * 0.667f;
        this.f301545d = iIntValue * 1.6f;
    }

    @Override // com.avito.android.tns_gallery.j
    public final boolean a(float f12, @Y61.k x6 x6Var) {
        return ((double) Math.abs((((float) x6Var.f319128a) / ((float) x6Var.f319129b)) - f12)) < 0.0125d;
    }

    @Override // com.avito.android.tns_gallery.j
    @Y61.k
    public final x6 b(float f12) {
        float fC2 = kotlin.ranges.s.c(C35835l0.i(this.f301542a).widthPixels / y6.b(320), 1.5f);
        float f13 = this.f301543b;
        return new x6((int) (kotlin.ranges.s.f(f13 * f12, this.f301544c, this.f301545d) * fC2), (int) (fC2 * f13));
    }
}
