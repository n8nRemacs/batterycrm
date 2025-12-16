package com.avito.android.tariff_cpt.configure.creation.deeplink;

import Y41.l;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.tariff_cpt.configure.creation.deeplink.TariffCptCreationLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CptCreationDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "message", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f297570l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(1);
        this.f297570l = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        e eVar = this.f297570l;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(str2);
        f.c.f125255c.getClass();
        a.i.C4057a.d(eVar.f297575j, printableTextF, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, null, 1966);
        eVar.j(new TariffCptCreationLink.c.a(str2));
        return G0.f406611a;
    }
}
