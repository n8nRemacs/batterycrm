package com.avito.android.util;

import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: AdvertLinkFormatter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/e;", "Lcom/avito/android/util/d;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35778e implements InterfaceC35770d {

    /* compiled from: AdvertLinkFormatter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/util/e$a", "Landroid/text/style/ClickableSpan;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.e$a */
    public static final class a extends ClickableSpan {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f318864b;

        public a(Y41.a<kotlin.G0> aVar) {
            this.f318864b = aVar;
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(@Y61.k View view) {
            Y41.a<kotlin.G0> aVar = this.f318864b;
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
    public C35778e() {
    }

    @Override // com.avito.android.util.InterfaceC35770d
    @Y61.l
    public final CharSequence a(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Y41.a<kotlin.G0> aVar) {
        int I12;
        if (str == null || C43066x.K(str)) {
            return null;
        }
        if (str2 == null || C43066x.K(str2) || str3 == null || C43066x.K(str3) || (I12 = C43066x.I(str, str3, 0, false, 6)) < 0) {
            return str;
        }
        String strA0 = C43066x.a0(str, str3, str2, false);
        int length = str2.length() + I12;
        SpannableString spannableString = new SpannableString(strA0);
        spannableString.setSpan(new a(aVar), I12, length, 33);
        return spannableString;
    }
}
