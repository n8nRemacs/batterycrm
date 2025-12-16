package com.avito.android.advert.item.verification;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.verification.c;
import com.avito.android.component.advert_badge_bar.badge.BadgeItem;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertVerificationPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/verification/f;", "Lcom/avito/android/advert/item/verification/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c.a f80669b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f80670c;

    @Inject
    public f(@k c.a aVar) {
        this.f80669b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        com.avito.android.component.advert_badge_bar.badge.a aVar2 = (com.avito.android.component.advert_badge_bar.badge.a) eVar;
        final AdvertVerificationItem advertVerificationItem = (AdvertVerificationItem) aVar;
        BadgeItem badgeItem = advertVerificationItem.f80658f;
        aVar2.setTitle(badgeItem.f124945d);
        aVar2.h(badgeItem.f124946e);
        aVar2.dx(badgeItem.f124947f, badgeItem.f124948g);
        aVar2.da(badgeItem.f124949h);
        aVar2.g7(badgeItem.f124950i);
        aVar2.k50(badgeItem.f124951j);
        aVar2.vN();
        aVar2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert.item.verification.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Context context = view.getContext();
                f fVar = this.f80666b;
                e eVar2 = new e(fVar);
                com.avito.android.lib.design.bottom_sheet.d dVar = fVar.f80670c;
                if (dVar != null) {
                    dVar.dismiss();
                }
                fVar.f80670c = null;
                View viewInflate = View.inflate(context, R.layout.advert_details_verification_bottomsheet_layout, null);
                int i13 = 0;
                com.avito.android.lib.design.bottom_sheet.d dVar2 = new com.avito.android.lib.design.bottom_sheet.d(context, i13, 2, null);
                com.avito.android.lib.design.bottom_sheet.d.M(dVar2, null, false, true, 7);
                dVar2.G(viewInflate, true);
                j jVar = new j(viewInflate);
                ImageView imageView = jVar.f80672a;
                imageView.setImageResource(R.drawable.verification_170);
                D6.G(imageView, true);
                AdvertVerificationItem advertVerificationItem2 = advertVerificationItem;
                jVar.f80673b.setText(advertVerificationItem2.f80656d);
                jVar.f80674c.setText(advertVerificationItem2.f80657e);
                Button button = jVar.f80675d;
                button.setText(R.string.advert_details_verification_bottomsheet_help_center_title);
                button.setAppearanceFromAttr(R.attr.buttonSecondaryLarge);
                button.setOnClickListener(new com.avito.android.advert.item.parking.h(25, eVar2));
                com.avito.android.lib.util.g.a(dVar2);
                fVar.f80670c = dVar2;
            }
        });
    }
}
