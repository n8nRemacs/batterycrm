package com.avito.android.beduin.common.utils;

import Rh.C15041a;
import Ui.InterfaceC15523b;
import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.model.icon.IconPosition;
import com.avito.android.beduin.common.component.text.Alignment;
import com.avito.android.beduin.common.component.text.BeduinAbstractTextModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import sK0.C48063a;
import sK0.C48065c;

/* compiled from: TextViews.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class E {

    /* compiled from: TextViews.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f103511a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f103512b;

        static {
            int[] iArr = new int[IconPosition.values().length];
            try {
                iArr[IconPosition.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f103511a = iArr;
            int[] iArr2 = new int[Alignment.values().length];
            try {
                iArr2[Alignment.RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Alignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f103512b = iArr2;
        }
    }

    public static final void a(@Y61.k TextView textView, @Y61.k InterfaceC15523b<BeduinAction> interfaceC15523b, @Y61.k BeduinAbstractTextModel beduinAbstractTextModel) {
        textView.setTag(beduinAbstractTextModel.getF100853b());
        PK0.m mVar = PK0.m.f12986a;
        Context context = textView.getContext();
        String style = beduinAbstractTextModel.getStyle();
        mVar.getClass();
        Integer numA = PK0.m.a(context, style);
        textView.setTextAppearance(numA != null ? numA.intValue() : com.avito.android.lib.util.f.r(textView.getContext(), beduinAbstractTextModel.getStyle()));
        Alignment alignment = beduinAbstractTextModel.getAlignment();
        int i12 = alignment == null ? -1 : a.f103512b[alignment.ordinal()];
        textView.setGravity(i12 != 1 ? i12 != 2 ? 8388611 : 17 : 8388613);
        String text = beduinAbstractTextModel.getText();
        if (text == null) {
            AttributedText attributedText = beduinAbstractTextModel.getAttributedText();
            text = attributedText != null ? attributedText.getText() : null;
        }
        int i13 = (text == null || !C43066x.r(text, (char) 173)) ? 0 : 1;
        if (i13 != textView.getHyphenationFrequency()) {
            textView.setHyphenationFrequency(i13);
        }
        Integer numberOfLines = beduinAbstractTextModel.getNumberOfLines();
        if (numberOfLines != null) {
            textView.setMaxLines(numberOfLines.intValue());
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setEllipsize(null);
        }
        if (beduinAbstractTextModel.getText() != null) {
            UniversalColor textColor = beduinAbstractTextModel.getTextColor();
            if (textColor != null) {
                textView.setTextColor(C48063a.f437606a.a(textView.getContext(), textColor));
            }
            I5.a(textView, beduinAbstractTextModel.getText(), false);
            String text2 = beduinAbstractTextModel.getText();
            if (text2 == null || text2.length() == 0) {
                textView.setText(beduinAbstractTextModel.getText());
            }
            textView.setMovementMethod(null);
            return;
        }
        com.avito.android.util.text.j.d(textView, C48065c.b(textView.getContext(), beduinAbstractTextModel.getLinkColor(), C35835l0.d(R.attr.blue, textView.getContext())));
        AttributedText attributedText2 = beduinAbstractTextModel.getAttributedText();
        if (attributedText2 != null) {
            attributedText2.setOnDeepLinkClickListener(new C15041a(interfaceC15523b, 18));
            attributedText2.setOnUrlClickListener(new com.avito.android.auction.details.i(interfaceC15523b, 3));
            com.avito.android.util.text.j.a(textView, attributedText2, null);
            List<Attribute> attributes = attributedText2.getAttributes();
            if (!(attributes instanceof Collection) || !attributes.isEmpty()) {
                for (Attribute attribute : attributes) {
                    if ((attribute instanceof DeepLinkAttribute) || (attribute instanceof LinkAttribute)) {
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        return;
                    }
                }
            }
            textView.setMovementMethod(null);
        }
    }
}
