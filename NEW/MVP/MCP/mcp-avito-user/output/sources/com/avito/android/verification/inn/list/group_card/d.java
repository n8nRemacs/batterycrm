package com.avito.android.verification.inn.list.group_card;

import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.w;
import com.avito.android.di.B;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import com.avito.android.vas_planning_checkout.item.checkout.i;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GroupCardItemPresenter.kt */
@B
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/group_card/d;", "LTV0/d;", "Lcom/avito/android/verification/inn/list/group_card/f;", "Lcom/avito/android/verification/inn/list/group_card/GroupCardItem;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements TV0.d<f, GroupCardItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f324005b;

    @Inject
    public d(@k w wVar) {
        this.f324005b = wVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ColorStateList colorStateListE;
        f fVar = (f) eVar;
        GroupCardItem groupCardItem = (GroupCardItem) aVar;
        I5.a(fVar.f324008b, groupCardItem.f323986c, false);
        G0 g02 = null;
        j.a(fVar.f324009c, groupCardItem.f323987d, null);
        Context context = fVar.f324011e;
        UniversalImage universalImage = groupCardItem.f323989f;
        SimpleDraweeView simpleDraweeView = fVar.f324010d;
        if (universalImage != null) {
            C35949t5.c(fVar.f324010d, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(context))), null, null, null, 14);
            D6.H(simpleDraweeView);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(simpleDraweeView);
        }
        View view = fVar.itemView;
        int iOrdinal = groupCardItem.f323990g.ordinal();
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
        ((RecyclerView.n) fVar.itemView.getLayoutParams()).setMargins(0, y6.b(groupCardItem.f323991h), 0, y6.b(groupCardItem.f323992i));
        fVar.itemView.setOnClickListener(new i(8, new c(groupCardItem, this)));
    }
}
