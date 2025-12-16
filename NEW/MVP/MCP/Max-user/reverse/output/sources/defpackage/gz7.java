package defpackage;

import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes.dex */
public final class gz7 extends hz7 {
    public final ECPublicKey c;

    public gz7(mbg mbgVar, ECPublicKey eCPublicKey) {
        super(mbgVar, eCPublicKey);
        this.a = mbgVar;
        this.c = eCPublicKey;
    }

    @Override // defpackage.hz7
    public final PublicKey a() {
        return this.c;
    }
}
