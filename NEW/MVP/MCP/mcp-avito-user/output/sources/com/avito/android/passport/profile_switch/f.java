package com.avito.android.passport.profile_switch;

import android.content.res.Resources;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PassportSwitchProfileAsyncLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "message", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f213678l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar) {
        super(1);
        this.f213678l = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) throws Resources.NotFoundException {
        String string = str;
        j jVar = this.f213678l;
        if (string.length() == 0) {
            string = jVar.f213691l.getString(R.string.passport_common_error);
        }
        PrintableText printableTextF = com.avito.android.printable_text.b.f(string);
        f.c.f125255c.getClass();
        f.c cVarB = f.c.a.b();
        ToastMessageLink.ToastTheme toastTheme = ToastMessageLink.ToastTheme.f133730c;
        a.i.C4057a.d(jVar.f213687h, printableTextF, null, null, cVarB, 0, null, null, "avitoRe23", ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
        return G0.f406611a;
    }
}
