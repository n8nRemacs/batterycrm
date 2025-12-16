package com.avito.android.safety.safety_settings.ui;

import android.text.method.LinkMovementMethod;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SafetySettingsTfa.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/text_view/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/text_view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class N extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.lib.design.text_view.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final N f257837l = new N();

    public N() {
        super(1);
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.text_view.a aVar) {
        com.avito.android.lib.design.text_view.a aVar2 = aVar;
        aVar2.setTextAppearance(C35835l0.j(R.attr.textM20, aVar2.getContext()));
        aVar2.setMovementMethod(LinkMovementMethod.getInstance());
        return G0.f406611a;
    }
}
