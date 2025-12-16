package defpackage;

import java.util.LinkedHashSet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class p4a extends l0g {
    public final long c;
    public final LinkedHashSet d;

    public p4a(long j, LinkedHashSet linkedHashSet) {
        this.c = j;
        this.d = linkedHashSet;
    }

    public static final p4a e(tm9 tm9Var) {
        int iM;
        if (!tm9Var.l() || (iM = efi.m(tm9Var)) == 0) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        long jL = 0;
        for (int i = 0; i < iM; i++) {
            String strO = efi.o(tm9Var);
            if (strO != null) {
                if (strO.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    jL = efi.l(tm9Var, 0L);
                } else if (strO.equals("messageIds")) {
                    int iF = efi.f(tm9Var);
                    for (int i2 = 0; i2 < iF; i2++) {
                        linkedHashSet.add(Long.valueOf(tm9Var.t0()));
                    }
                } else {
                    tm9Var.v();
                }
            }
        }
        return new p4a(jL, linkedHashSet);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4a)) {
            return false;
        }
        p4a p4aVar = (p4a) obj;
        return this.c == p4aVar.c && this.d.equals(p4aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Long.hashCode(this.c) * 31);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(chatId=" + this.c + ", messageIds=" + this.d + ")";
    }
}
