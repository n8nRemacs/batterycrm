package Yv;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.w;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.printable_text.b;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import com.google.android.material.shape.q;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import wK0.AbstractC49528c;

/* compiled from: Extensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_delivery-tarifikator_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18330a {
    @l
    public static final PrintableText a(@k Throwable th2) {
        String message = th2.getMessage();
        if (message == null) {
            return null;
        }
        PrintableText printableTextF = b.f(message);
        if ((th2 instanceof ApiException) && (((ApiException) th2).f318522b instanceof ApiError.BadRequest)) {
            return printableTextF;
        }
        return null;
    }

    public static void b(TextView textView, AttributedText attributedText, w wVar) {
        AttributedText attributedTextCopy$default = attributedText != null ? AttributedText.copy$default(attributedText, null, null, 0, 7, null) : null;
        if (attributedTextCopy$default != null) {
            attributedTextCopy$default.setOnDeepLinkClickListener(wVar);
        }
        if (attributedTextCopy$default != null) {
            attributedTextCopy$default.setOnUrlClickListener(null);
        }
        j.a(textView, attributedTextCopy$default, null);
    }

    public static final void c(@k View view) {
        float fB2 = com.avito.android.authorization.auto_recovery.phone_confirm.b.b(view, R.dimen.tariff_card_corner_radius);
        AbstractC49528c.a aVar = AbstractC49528c.f441377b;
        aVar.getClass();
        q.b bVarF = AbstractC49528c.a.a().f();
        bVarF.c(fB2);
        view.setBackground(AbstractC49528c.a.b(aVar, bVarF.a(), 0, 0, 0, 0, C35835l0.e(R.attr.warmGray4, view.getContext()), null, null, null, 478));
    }
}
