package com.avito.android.section.placeholder;

import VU.b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SectionPlaceholderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/placeholder/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/section/placeholder/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f264860b;

    /* renamed from: c, reason: collision with root package name */
    public final Button f264861c;

    public d(@k View view) {
        super(view);
        this.f264860b = (TextView) view.findViewById(R.id.placeholder_text);
        Button button = (Button) view.findViewById(R.id.placeholder_button);
        this.f264861c = button;
        b.a aVar = VU.b.f17147t;
        Context context = view.getContext();
        int iJ2 = C35835l0.j(R.attr.buttonSecondaryMedium, view.getContext());
        aVar.getClass();
        button.setStyle(b.a.c(iJ2, context));
    }

    @Override // com.avito.android.section.placeholder.c
    public final void Ho(@k PrintableText printableText, @l Y41.a<G0> aVar) {
        com.avito.android.printable_text.a.c(this.f264860b, printableText);
        Button button = this.f264861c;
        if (aVar == null) {
            D6.w(button);
        } else {
            button.setState(new UU.a(button.getContext().getText(R.string.reload), null, false, false, false, aVar, null, null, null, false, 990, null));
            D6.G(button, true);
        }
    }
}
