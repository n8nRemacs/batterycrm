package defpackage;

import android.os.Bundle;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;

/* loaded from: classes2.dex */
public final class rue extends l3f {
    public static final rue b = new rue();

    @Override // defpackage.l3f
    public final li4 c() {
        li4 li4Var = li4.c;
        return li4.c;
    }

    @Override // defpackage.l3f
    public final mi4 d(Bundle bundle) {
        final long jI = l8j.i("msg_id", bundle);
        final long jI2 = l8j.i("attach_id", bundle);
        final String strK = l8j.k("local_attach_id", bundle);
        final int iH = l8j.h("cause_ordinal", bundle);
        final Integer numC = l8j.c("snack_bot_margin", bundle);
        final Boolean boolB = l8j.b("force_dark", bundle);
        return new mi4() { // from class: que
            @Override // defpackage.mi4
            public final Object a() {
                return new ChatMediaDownloadBottomSheet(jI, jI2, strK, iH, numC, boolB);
            }
        };
    }

    @Override // defpackage.l3f
    public final void e(k3f k3fVar) {
        ki4.b(k3fVar, ":dialogs/share-media", new String[]{"msg_id", "attach_id", "local_attach_id", "cause_ordinal"}, null, 14);
    }
}
