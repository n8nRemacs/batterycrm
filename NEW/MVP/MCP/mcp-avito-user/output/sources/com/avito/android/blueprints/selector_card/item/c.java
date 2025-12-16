package com.avito.android.blueprints.selector_card.item;

import Ca1.ViewOnClickListenerC13236c;
import JO.m;
import TV0.e;
import Y41.p;
import Y61.k;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectorCardPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/selector_card/item/c;", "LTV0/d;", "Lcom/avito/android/blueprints/selector_card/item/d;", "LJO/m;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements TV0.d<d, m> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<m, Boolean, G0> f106622b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k p<? super m, ? super Boolean, G0> pVar) {
        this.f106622b = pVar;
    }

    @Override // TV0.d
    public final void O5(e eVar, TV0.a aVar, int i12) {
        d dVar = (d) eVar;
        m mVar = (m) aVar;
        b bVar = new b(this);
        LinearLayout linearLayout = dVar.f106624b;
        Context context = linearLayout.getContext();
        UniversalImage universalImage = mVar.f8969j;
        C35949t5.c(dVar.f106626d, com.avito.android.image_loader.b.b(universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(context)) : null), null, null, null, 14);
        linearLayout.setSelected(mVar.f8964e);
        linearLayout.setBackground(androidx.core.content.d.getDrawable(context, mVar.f8971l ? R.drawable.border_selector_card_group_error : R.drawable.border_selector_card_group));
        dVar.f106625c.setText(mVar.f8962c);
        linearLayout.setOnClickListener(new ViewOnClickListenerC13236c(dVar, mVar, bVar, 21));
    }
}
