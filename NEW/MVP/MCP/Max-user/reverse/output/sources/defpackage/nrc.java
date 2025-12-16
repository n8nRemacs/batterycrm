package defpackage;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class nrc extends l3f {
    public static final nrc b = new nrc();

    @Override // defpackage.l3f
    public final mi4 d(Bundle bundle) {
        Boolean boolB = l8j.b("can_select_file", bundle);
        return new y29(boolB != null ? boolB.booleanValue() : true, l8j.d("source_id", bundle), 1);
    }

    @Override // defpackage.l3f
    public final void e(k3f k3fVar) {
        ki4.b(k3fVar, ":qr-scanner", new String[0], null, 14);
    }
}
