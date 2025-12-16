package com.yandex.metrica.impl.ob;

import android.os.Bundle;

/* loaded from: classes7.dex */
public class O4 extends M4 {
    public O4(F3 f32) {
        super(f32);
    }

    @Override // com.yandex.metrica.impl.ob.M4
    public boolean a(@j.N C38715c0 c38715c0, @j.N C38993n4 c38993n4) {
        Bundle bundleL = c38715c0.l();
        a().a(bundleL != null ? (V0) bundleL.getParcelable("com.yandex.metrica.impl.IdentifiersData") : null);
        return false;
    }
}
