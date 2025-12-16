package com.avito.android.section.title.with_action.redesign;

import Y61.k;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ScaleXSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.saved_searches.presentation.items.switcher.l;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SectionTitleWithActionRedesignItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/title/with_action/redesign/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/section/title/with_action/redesign/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f264896d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f264897b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f264898c;

    public e(@k View view) {
        super(view);
        this.f264897b = view;
        View viewFindViewById = view.findViewById(R.id.section_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f264898c = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.section.title.with_action.redesign.c
    public final void mX(@k PrintableText printableText, boolean z12, @k Y41.a<G0> aVar) {
        TextView textView = this.f264898c;
        String strK0 = printableText.k0(textView.getContext());
        textView.setText(strK0);
        View view = this.f264897b;
        if (!z12) {
            view.setOnClickListener(null);
            return;
        }
        FV.a aVar2 = FV.a.f4720a;
        Context context = view.getContext();
        aVar2.getClass();
        CharSequence charSequenceB = FV.a.b(R.attr.textIconHeaderArrow, context);
        int length = strK0.length();
        int iB2 = y6.b(2);
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(textView.getText()).append((char) 160);
        spannableStringBuilderAppend.setSpan(new ScaleXSpan(1.5f), length, spannableStringBuilderAppend.length(), 33);
        SpannableStringBuilder spannableStringBuilderAppend2 = spannableStringBuilderAppend.append(charSequenceB);
        spannableStringBuilderAppend2.setSpan(new d(iB2), length, spannableStringBuilderAppend2.length(), 33);
        spannableStringBuilderAppend2.setSpan(new TextAppearanceSpan(textView.getContext(), C35835l0.j(R.attr.textH4, textView.getContext())), length, spannableStringBuilderAppend2.length(), 33);
        textView.setText(spannableStringBuilderAppend2);
        view.setOnClickListener(new l(24, aVar));
    }
}
