package com.avito.android.tariff_cpt.levels.deeplink;

import Y41.l;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.tariff_cpt.levels.deeplink.TariffCptLevelSaveV3Link;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: TariffCptLevelSaveV3DeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class d extends H implements l<String, G0> {
    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        e eVar = (e) this.receiver;
        eVar.getClass();
        PrintableText printableTextF = com.avito.android.printable_text.b.f(str2);
        f.c.f125255c.getClass();
        a.i.C4057a.d(eVar.f298551j, printableTextF, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, null, 1966);
        eVar.j(new TariffCptLevelSaveV3Link.b.a(str2));
        return G0.f406611a;
    }
}
