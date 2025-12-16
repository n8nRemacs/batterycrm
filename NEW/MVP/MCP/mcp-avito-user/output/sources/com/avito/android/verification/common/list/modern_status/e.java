package com.avito.android.verification.common.list.modern_status;

import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import com.avito.android.R;
import com.avito.android.deep_linking.links.w;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ModernStatusItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/common/list/modern_status/e;", "LTV0/d;", "Lcom/avito/android/verification/common/list/modern_status/g;", "Lcom/avito/android/verification/common/list/modern_status/ModernStatusItem;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements TV0.d<g, ModernStatusItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f323434b;

    @Inject
    public e(@k w wVar) {
        this.f323434b = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ColorStateList colorStateListE;
        g gVar = (g) eVar;
        ModernStatusItem modernStatusItem = (ModernStatusItem) aVar;
        I5.a(gVar.f323437c, modernStatusItem.f323416c, false);
        AttributedText attributedText = modernStatusItem.f323417d;
        G0 g02 = null;
        j.a(gVar.f323438d, attributedText, null);
        View view = gVar.itemView;
        int iOrdinal = modernStatusItem.f323418e.ordinal();
        Context context = gVar.f323440f;
        if (iOrdinal == 0) {
            colorStateListE = C35835l0.e(R.attr.gray4, context);
        } else if (iOrdinal == 1) {
            colorStateListE = C35835l0.e(R.attr.blue50, context);
        } else if (iOrdinal == 2) {
            colorStateListE = C35835l0.e(R.attr.green50, context);
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            colorStateListE = C35835l0.e(R.attr.red50, context);
        }
        view.setBackgroundTintList(colorStateListE);
        UniversalImage universalImage = modernStatusItem.f323420g;
        SimpleDraweeView simpleDraweeView = gVar.f323439e;
        if (universalImage != null) {
            C35949t5.c(gVar.f323439e, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(context))), null, null, null, 14);
            D6.H(simpleDraweeView);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(simpleDraweeView);
        }
        gVar.itemView.setOnClickListener(new i(4, new c(modernStatusItem, this)));
        attributedText.setOnDeepLinkClickListener(this.f323434b);
        gVar.f8928b = new d(modernStatusItem);
    }
}
