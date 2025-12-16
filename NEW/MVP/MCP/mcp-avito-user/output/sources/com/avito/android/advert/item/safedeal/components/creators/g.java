package com.avito.android.advert.item.safedeal.components.creators;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.advert_core.safedeal.u;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SpacingSafeDealViewCreator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/safedeal/components/creators/g;", "Lcom/avito/android/advert_core/safedeal/u;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$Spacing;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements u<SafeDeal.Component.Spacing> {
    @Override // com.avito.android.advert_core.safedeal.u
    public final boolean a(@k SafeDeal.Component component) {
        return component instanceof SafeDeal.Component.Spacing;
    }

    @Override // com.avito.android.advert_core.safedeal.u
    public final View b(ViewGroup viewGroup, SafeDeal.Component component, com.avito.android.advert_core.safedeal.a aVar) {
        SafeDeal.Component.Spacing spacing = (SafeDeal.Component.Spacing) component;
        View viewB = C0.b(viewGroup, R.layout.advert_details_safedeal_space, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewB.getLayoutParams();
        layoutParams.height = y6.b(kotlin.math.b.b(spacing.getHeight().floatValue()));
        viewB.setLayoutParams(layoutParams);
        String id2 = spacing.getId();
        if (id2 != null) {
            viewB.setTag(id2);
        }
        return viewB;
    }
}
