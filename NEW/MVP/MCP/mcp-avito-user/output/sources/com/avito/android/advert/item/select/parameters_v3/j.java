package com.avito.android.advert.item.select.parameters_v3;

import android.content.res.ColorStateList;
import android.text.method.LinkMovementMethod;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectParametersV3Screen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class j extends N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final j f79587l = new j();

    public j() {
        super(1);
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        com.avito.android.lib.design.text_view.a aVar2 = aVar;
        aVar2.setMovementMethod(LinkMovementMethod.getInstance());
        ColorStateList colorStateListE = C35835l0.e(R.attr.gray54, aVar2.getContext());
        aVar2.setTextColor(colorStateListE);
        aVar2.setLinkTextColor(colorStateListE);
        return G0.f406611a;
    }
}
