package com.avito.android.advert.item.branding_advantages.block_element;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import javax.inject.Inject;
import kotlin.Metadata;
import sK0.C48063a;

/* compiled from: BrandingAdvantagesBlockElementItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/branding_advantages/block_element/c;", "LTV0/d;", "Lcom/avito/android/advert/item/branding_advantages/block_element/e;", "Lcom/avito/android/advert/item/branding_advantages/block_element/BrandingAdvantagesBlockElementItem;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements TV0.d<e, BrandingAdvantagesBlockElementItem> {
    @Inject
    public c() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        BrandingAdvantagesBlockElementItem brandingAdvantagesBlockElementItem = (BrandingAdvantagesBlockElementItem) aVar;
        SimpleDraweeView simpleDraweeView = eVar2.f74210d;
        C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(brandingAdvantagesBlockElementItem.f74199c, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))), null, null, null, 14);
        eVar2.f74209c.setText(brandingAdvantagesBlockElementItem.f74198b);
        View view = eVar2.f74208b;
        Context context = view.getContext();
        C48063a.f437606a.getClass();
        view.setBackgroundTintList(C48063a.e(context, brandingAdvantagesBlockElementItem.f74200d));
    }
}
