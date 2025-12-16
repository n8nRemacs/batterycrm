package com.avito.android.messenger.conversation.mvi.messages.utils;

import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.X;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.Z;
import com.avito.android.messenger.conversation.adapter.text.SafeUrlSpan;
import com.avito.android.util.C35809h6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AnnotatedTextUtils.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/utils/a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f193555a = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final e0 f193556b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final e0 f193557c;

    static {
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65240k;
        e0 e0Var = new e0(0L, rVar.f63646c, rVar.f63648e, (Z) null, (C22605a0) null, rVar.f63645b, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (f1) null, (X) null, (androidx.compose.ui.graphics.drawscope.j) null, 65497, (C42822w) null);
        f193556b = e0Var;
        androidx.compose.ui.text.style.j.f42684b.getClass();
        f193557c = e0.a(e0Var, androidx.compose.ui.text.style.j.f42686d, 61439);
    }

    @Y61.k
    public static C22602e a(@Y61.k String str) {
        String strS;
        C22602e.b bVar = new C22602e.b(0, 1, null);
        String[] strArr = C35809h6.f318898a;
        int i12 = 0;
        while (true) {
            if (i12 >= 3) {
                strS = AK.c.s(new StringBuilder(), strArr[0], str);
                break;
            }
            String str2 = strArr[i12];
            if (!C43066x.h0(str, str2, true)) {
                i12++;
            } else if (str.startsWith(str2)) {
                strS = str;
            } else {
                StringBuilder sbR = H.r(str2);
                sbR.append(str.substring(str2.length()));
                strS = sbR.toString();
            }
        }
        int iL2 = bVar.l(f193557c);
        try {
            bVar.f(strS);
            G0 g02 = G0.f406611a;
            bVar.h(iL2);
            bVar.a(0, str.length(), "URL", strS);
            return bVar.m();
        } catch (Throwable th2) {
            bVar.h(iL2);
            throw th2;
        }
    }

    @Y61.k
    public static C22602e b(@Y61.k String str) {
        C22602e.b bVar = new C22602e.b(0, 1, null);
        int iL2 = bVar.l(f193556b);
        try {
            bVar.f(str);
            G0 g02 = G0.f406611a;
            bVar.h(iL2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            if (Linkify.addLinks(spannableStringBuilder, 6)) {
                f193555a.getClass();
                for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    SafeUrlSpan safeUrlSpan = new SafeUrlSpan(uRLSpan.getURL());
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(safeUrlSpan, spanStart, spanEnd, 33);
                }
            }
            for (URLSpan uRLSpan2 : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart2 = spannableStringBuilder.getSpanStart(uRLSpan2);
                int spanEnd2 = spannableStringBuilder.getSpanEnd(uRLSpan2);
                bVar.b(f193557c, spanStart2, spanEnd2);
                bVar.a(spanStart2, spanEnd2, "URL", uRLSpan2.getURL());
            }
            return bVar.m();
        } catch (Throwable th2) {
            bVar.h(iL2);
            throw th2;
        }
    }
}
