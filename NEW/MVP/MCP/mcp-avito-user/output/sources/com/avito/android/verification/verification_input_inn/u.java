package com.avito.android.verification.verification_input_inn;

import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42801a;

/* compiled from: VerificationInputInnView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class u extends C42801a implements Y41.l<String, G0> {
    @Override // Y41.l
    public final G0 invoke(String str) {
        p pVar = (p) this.receiver;
        pVar.getClass();
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.b(cVar, pVar.f325638d, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181045c, null, false, false, null, null, 4014);
        return G0.f406611a;
    }
}
