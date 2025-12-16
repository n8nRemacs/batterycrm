package com.avito.android.advert.item.safedeal.components.creators;

import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_core.safedeal.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.q;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.util.C35835l0;
import com.avito.android.util.Y4;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ButtonSafeDealViewCreator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/safedeal/components/creators/b;", "Lcom/avito/android/advert_core/safedeal/u;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$Button;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements u<SafeDeal.Component.Button> {
    @Override // com.avito.android.advert_core.safedeal.u
    public final boolean a(@k SafeDeal.Component component) {
        return component instanceof SafeDeal.Component.Button;
    }

    @Override // com.avito.android.advert_core.safedeal.u
    public final View b(ViewGroup viewGroup, SafeDeal.Component component, com.avito.android.advert_core.safedeal.a aVar) {
        Integer numA;
        SafeDeal.Component.Button button = (SafeDeal.Component.Button) component;
        Button button2 = (Button) LayoutInflater.from(new androidx.appcompat.view.d(viewGroup.getContext(), com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, button.getTheme()))).inflate(R.layout.advert_details_safedeal_button_item, viewGroup, false);
        Y4 y42 = Y4.f318784a;
        String style = button.getStyle();
        y42.getClass();
        button2.setAppearanceFromAttr(Y4.a(style));
        com.avito.android.lib.design.button.b.a(button2, button.getTitle(), false);
        button2.setEnabled(button.getDeepLink() != null);
        DeepLink deepLink = button.getDeepLink();
        if (deepLink != null) {
            button2.setOnClickListener(new a(aVar, deepLink, 0));
        }
        String iconName = button.getIconName();
        Context context = viewGroup.getContext();
        Drawable drawableH = null;
        if (iconName != null && (numA = q.a(iconName)) != null) {
            drawableH = C35835l0.h(numA.intValue(), context);
        }
        Button.g(button2, drawableH, null, false, null, 14);
        String id2 = button.getId();
        if (id2 != null) {
            button2.setTag(id2);
        }
        return button2;
    }
}
