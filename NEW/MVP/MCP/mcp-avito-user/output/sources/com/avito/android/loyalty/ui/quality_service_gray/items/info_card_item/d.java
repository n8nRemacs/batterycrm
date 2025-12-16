package com.avito.android.loyalty.ui.quality_service_gray.items.info_card_item;

import androidx.compose.runtime.internal.P;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InfoCardItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/items/info_card_item/d;", "LTV0/d;", "Lcom/avito/android/loyalty/ui/quality_service_gray/items/info_card_item/f;", "Lcom/avito/android/loyalty/ui/quality_service_gray/items/info_card_item/a;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements TV0.d<f, a> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        a aVar2 = (a) aVar;
        I5.a(fVar.f184090c, aVar2.f184081c, false);
        G0 g02 = null;
        j.a(fVar.f184091d, aVar2.f184082d, null);
        SimpleDraweeView simpleDraweeView = fVar.f184092e;
        UniversalImage universalImage = aVar2.f184083e;
        if (universalImage != null) {
            C35949t5.c(fVar.f184092e, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(fVar.f184089b))), null, null, null, 14);
            D6.H(simpleDraweeView);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(simpleDraweeView);
        }
    }
}
