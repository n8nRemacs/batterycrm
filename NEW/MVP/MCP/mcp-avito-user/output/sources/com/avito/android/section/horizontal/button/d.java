package com.avito.android.section.horizontal.button;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.search.filter.adapter.select.m;
import kotlin.Metadata;

/* compiled from: HorizontalSectionButtonItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/horizontal/button/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/section/horizontal/button/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f264698b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f264699c;

    public d(@k View view) {
        super(view);
        this.f264698b = view;
        this.f264699c = (TextView) view.findViewById(R.id.header_button);
    }

    @Override // com.avito.android.section.horizontal.button.c
    public final void q60(@k PrintableText printableText, @k m mVar) {
        this.f264698b.setOnClickListener(mVar);
        TextView textView = this.f264699c;
        textView.setText(printableText.k0(textView.getContext()));
        FV.a.f4720a.getClass();
        FV.a.c(textView, R.attr.textIconHeaderArrow);
    }
}
