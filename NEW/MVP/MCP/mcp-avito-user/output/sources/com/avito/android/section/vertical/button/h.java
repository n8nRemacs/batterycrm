package com.avito.android.section.vertical.button;

import VU.b;
import Y61.k;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SectionVerticalButtonView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/vertical/button/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/section/vertical/button/g;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f264959b;

    public h(@k View view) {
        super(view);
        Button button = (Button) view;
        this.f264959b = button;
        b.a aVar = VU.b.f17147t;
        Context context = view.getContext();
        int iJ2 = C35835l0.j(R.attr.buttonSecondaryMedium, view.getContext());
        aVar.getClass();
        button.setStyle(b.a.c(iJ2, context));
    }

    @Override // com.avito.android.section.vertical.button.g
    public final void l4(@k PrintableText printableText, @k Y41.a<G0> aVar) {
        Button button = this.f264959b;
        button.setState(new UU.a(printableText.k0(button.getContext()), null, false, false, false, aVar, null, null, null, false, 990, null));
    }
}
