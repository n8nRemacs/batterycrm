package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedTextView;

/* loaded from: classes8.dex */
public final class dl1 implements n50 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final eb<?> f384633a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ib f384634b;

    public dl1(@Y61.l eb<?> ebVar, @Y61.k ib ibVar) {
        this.f384633a = ebVar;
        this.f384634b = ibVar;
    }

    @Override // com.yandex.mobile.ads.impl.n50
    public final void a(@Y61.k se1 se1Var) {
        TextView textViewQ = se1Var.q();
        eb<?> ebVar = this.f384633a;
        Object objD = ebVar != null ? ebVar.d() : null;
        if (!(textViewQ instanceof ExtendedTextView) || !(objD instanceof String)) {
            if (textViewQ == null) {
                return;
            }
            textViewQ.setVisibility(8);
            return;
        }
        aw awVar = new aw(se1Var.a());
        ExtendedTextView extendedTextView = (ExtendedTextView) textViewQ;
        extendedTextView.setText((CharSequence) objD);
        extendedTextView.setVisibility(0);
        extendedTextView.setAutoSizeTextType(1);
        extendedTextView.setMeasureSpecProvider(awVar);
        this.f384634b.a(textViewQ, this.f384633a);
    }
}
