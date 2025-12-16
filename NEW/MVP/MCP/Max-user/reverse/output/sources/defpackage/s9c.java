package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class s9c extends rj0 {
    public static final pzf X = new pzf("privacy.restricted", null, null);
    public final /* synthetic */ int c = 0;
    public final long d;
    public final List o;

    public s9c(pzf pzfVar, long j, List list) {
        super(pzfVar);
        this.d = j;
        this.o = list;
    }

    @Override // defpackage.rj0, defpackage.sj0
    public final String toString() {
        switch (this.c) {
            case 0:
                return "PrivacyRestrictedError{chatId=" + this.d + ", contactIds=" + this.o + '}';
            default:
                return "ControlMessageAddError{chatId=" + this.d + ", contactIds=" + this.o + '}';
        }
    }

    public s9c(long j, List list) {
        super(X);
        this.d = j;
        this.o = list;
    }
}
