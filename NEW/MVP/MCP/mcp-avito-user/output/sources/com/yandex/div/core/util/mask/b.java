package com.yandex.div.core.util.mask;

import Y41.l;
import Y61.k;
import com.yandex.div.core.util.mask.a;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.text.C43066x;

/* compiled from: CurrencyInputMask.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/util/mask/b;", "Lcom/yandex/div/core/util/mask/a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l<Exception, G0> f367816e;

    /* renamed from: f, reason: collision with root package name */
    public final char f367817f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<Character> f367818g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public NumberFormat f367819h;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k Locale locale, @k l<? super Exception, G0> lVar) {
        super(new a.b("", C42784z0.f406748b, false));
        this.f367816e = lVar;
        this.f367817f = (char) 164;
        this.f367818g = C42745f0.U('.', ',');
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        m(currencyInstance);
        this.f367819h = currencyInstance;
    }

    public static boolean o(d dVar, int i12) {
        int i13 = dVar.f367822a;
        return i13 <= i12 && i12 < i13 + dVar.f367823b;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    @Override // com.yandex.div.core.util.mask.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.l java.lang.Integer r20, @Y61.k java.lang.String r21) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.util.mask.b.a(java.lang.Integer, java.lang.String):void");
    }

    @Override // com.yandex.div.core.util.mask.a
    public final void i(@k PatternSyntaxException patternSyntaxException) {
        this.f367816e.invoke(patternSyntaxException);
    }

    @Override // com.yandex.div.core.util.mask.a
    public final void j(@k String str) throws ParseException {
        Number number = this.f367819h.parse(str);
        if (number == null) {
            number = 0;
        }
        p(number);
        super.j(str);
    }

    public final void m(NumberFormat numberFormat) {
        DecimalFormat decimalFormat = numberFormat instanceof DecimalFormat ? (DecimalFormat) numberFormat : null;
        if (decimalFormat == null) {
            return;
        }
        String pattern = decimalFormat.toPattern();
        StringBuilder sb2 = new StringBuilder();
        int length = pattern.length();
        int i12 = 0;
        while (i12 < length) {
            int i13 = i12 + 1;
            char cCharAt = pattern.charAt(i12);
            if (cCharAt != this.f367817f) {
                sb2.append(cCharAt);
            }
            i12 = i13;
        }
        decimalFormat.applyPattern(C43066x.A0(sb2.toString()).toString());
    }

    public final DecimalFormatSymbols n() {
        return ((DecimalFormat) this.f367819h).getDecimalFormatSymbols();
    }

    public final void p(Number number) {
        String str = this.f367819h.format(number);
        StringBuilder sb2 = new StringBuilder();
        int i12 = 0;
        while (i12 < str.length()) {
            char cCharAt = str.charAt(i12);
            i12++;
            if (Character.isDigit(cCharAt)) {
                sb2.append('#');
            } else {
                sb2.append(cCharAt);
            }
        }
        l(new a.b(sb2.toString(), C42745f0.U(new a.c('#', "\\d", '0'), new a.c(n().getDecimalSeparator(), "[" + n().getDecimalSeparator() + ']', n().getDecimalSeparator())), this.f367800a.f367810c), false);
    }
}
