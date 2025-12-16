package defpackage;

import android.os.Bundle;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;

/* loaded from: classes2.dex */
public final class c08 {
    public final /* synthetic */ KeyboardStickersWidget a;
    public final /* synthetic */ Bundle b;

    public c08(KeyboardStickersWidget keyboardStickersWidget, Bundle bundle) {
        this.a = keyboardStickersWidget;
        this.b = bundle;
    }

    public final void a(fff fffVar) {
        xfh.r(((t09) this.a.b.getValue()).o, p09.a);
        uz7 uz7Var = uz7.c;
        long j = fffVar.a;
        long j2 = this.b.getLong("arg_key_chat_id");
        ii4 ii4VarP0 = uz7Var.p0();
        StringBuilder sbL = az1.l(j, ":stickers/preview?sticker_id=", "&chat_id=");
        sbL.append(j2);
        ii4VarP0.b(sbL.toString(), null);
    }
}
