package com.avito.android.verification.common.list.verification_group;

import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
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
import com.avito.android.verification.common.list.verification_group.VerificationGroupItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VerificationGroupItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/common/list/verification_group/e;", "LTV0/d;", "Lcom/avito/android/verification/common/list/verification_group/g;", "Lcom/avito/android/verification/common/list/verification_group/VerificationGroupItem;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements TV0.d<g, VerificationGroupItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f323467b;

    @Inject
    public e(@k w wVar) {
        this.f323467b = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ColorStateList colorStateListE;
        g gVar = (g) eVar;
        VerificationGroupItem verificationGroupItem = (VerificationGroupItem) aVar;
        I5.a(gVar.f323470b, verificationGroupItem.f323449c, false);
        AttributedText attributedText = verificationGroupItem.f323450d;
        G0 g02 = null;
        j.a(gVar.f323471c, attributedText, null);
        boolean z12 = verificationGroupItem.f323452f != null;
        VerificationGroupItem.Status status = verificationGroupItem.f323451e;
        Context context = gVar.f323474f;
        ImageView imageView = gVar.f323473e;
        if (!z12 && status == VerificationGroupItem.Status.f323455c) {
            imageView.setImageResource(C35835l0.j(R.attr.ic_time16, context));
            imageView.setImageTintList(C35835l0.e(R.attr.blue700, context));
        } else if (z12 || status != VerificationGroupItem.Status.f323457e) {
            imageView.setImageResource(C35835l0.j(R.attr.ic_arrowRight16, context));
            imageView.setImageTintList(C35835l0.e(R.attr.black, context));
        } else {
            imageView.setImageResource(C35835l0.j(R.attr.ic_attentionRound16, context));
            imageView.setImageTintList(C35835l0.e(R.attr.red600, context));
        }
        G0 g03 = G0.f406611a;
        View view = gVar.itemView;
        int iOrdinal = status.ordinal();
        if (iOrdinal == 0) {
            colorStateListE = C35835l0.e(R.attr.warmGray2, context);
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
        UniversalImage universalImage = verificationGroupItem.f323453g;
        SimpleDraweeView simpleDraweeView = gVar.f323472d;
        if (universalImage != null) {
            C35949t5.c(gVar.f323472d, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(context))), null, null, null, 14);
            D6.H(simpleDraweeView);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(simpleDraweeView);
        }
        gVar.itemView.setOnClickListener(new i(5, new c(verificationGroupItem, this)));
        attributedText.setOnDeepLinkClickListener(this.f323467b);
        new d(verificationGroupItem);
    }
}
