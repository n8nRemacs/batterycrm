package com.avito.android.leasing_calculator;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: LeasingApplicationLinkFormatter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/leasing_calculator/b;", "Lcom/avito/android/leasing_calculator/a;", "<init>", "()V", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.leasing_calculator.a {

    /* compiled from: LeasingApplicationLinkFormatter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/leasing_calculator/b$a", "Landroid/text/style/ClickableSpan;", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ClickableSpan {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f175095b;

        public a(Y41.a<G0> aVar) {
            this.f175095b = aVar;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(@Y61.k View view) {
            Y41.a<G0> aVar = this.f175095b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(@Y61.k TextPaint textPaint) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(false);
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.leasing_calculator.a
    @Y61.l
    public final CharSequence a(@Y61.l Y41.a aVar, @Y61.l String str, @Y61.l String str2) {
        int I12;
        if (str == null || C43066x.K(str)) {
            return null;
        }
        if (str2 == null || C43066x.K(str2) || (I12 = C43066x.I(str, "{link}", 0, false, 6)) < 0) {
            return str;
        }
        String strA0 = C43066x.a0(str, "{link}", str2, false);
        int length = str2.length() + I12;
        SpannableString spannableString = new SpannableString(strA0);
        spannableString.setSpan(new a(aVar), I12, length, 33);
        return spannableString;
    }
}
