package com.avito.android.util.text;

import PK0.n;
import PK0.o;
import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.util.I5;
import com.avito.android.util.text.utils.b;
import j.InterfaceC42156l;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TextViews.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_text-formatters_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(@k TextView textView, @l AttributedText attributedText, @l a aVar) {
        List<Attribute> attributes;
        if (aVar == null) {
            aVar = b(textView);
        }
        o oVar = textView instanceof o ? (o) textView : null;
        I5.a(textView, aVar.a(textView.getContext(), oVar != null ? oVar.getTextStyleData() : null, attributedText), false);
        if (textView.getMovementMethod() != null || attributedText == null || (attributes = attributedText.getAttributes()) == null) {
            return;
        }
        List<Attribute> list = attributes;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        for (Attribute attribute : list) {
            if ((attribute instanceof DeepLinkAttribute) || (attribute instanceof LinkAttribute)) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
        }
    }

    public static final a b(TextView textView) {
        Object tag = textView.getTag(R.id.attributed_text_formatter_tag);
        a aVar = tag instanceof a ? (a) tag : null;
        if (aVar == null) {
            com.avito.android.util.text.utils.a aVar2 = new com.avito.android.util.text.utils.a();
            b.a aVarA = com.avito.android.util.text.utils.e.a();
            aVarA.a((com.avito.android.util.text.utils.c) C29972i.a(C29972i.b(textView), com.avito.android.util.text.utils.c.class));
            aVarA.build().a(aVar2);
            a aVar3 = aVar2.f319085a;
            aVar = aVar3 != null ? aVar3 : null;
        }
        textView.setTag(R.id.attributed_text_formatter_tag, aVar);
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(@k TextView textView, @k AttributedText attributedText, @l a aVar) {
        if (aVar == null) {
            aVar = b(textView);
        }
        o oVar = textView instanceof o ? (o) textView : null;
        CharSequence charSequenceA = aVar.a(textView.getContext(), oVar != null ? oVar.getTextStyleData() : null, attributedText);
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        textView.setText(charSequenceA);
        if (textView.getMovementMethod() == null) {
            List<Attribute> attributes = attributedText.getAttributes();
            if ((attributes instanceof Collection) && attributes.isEmpty()) {
                return;
            }
            for (Attribute attribute : attributes) {
                if ((attribute instanceof DeepLinkAttribute) || (attribute instanceof LinkAttribute)) {
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(@k TextView textView, @InterfaceC42156l int i12) {
        o oVar = textView instanceof o ? (o) textView : null;
        n textStyleData = oVar != null ? oVar.getTextStyleData() : null;
        if (textStyleData != null) {
            textStyleData.f12993g = Integer.valueOf(i12);
        }
        textView.setLinkTextColor(i12);
    }
}
