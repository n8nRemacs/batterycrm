package com.yandex.metrica.impl.ob;

import android.content.Context;

/* loaded from: classes7.dex */
public class F extends V1<Boolean> {
    public F(@j.N Context context, @j.N String str) {
        super(context, str, "bool");
    }

    @Override // com.yandex.metrica.impl.ob.V1
    @j.P
    public Boolean a(int i12) {
        return Boolean.valueOf(this.f379753a.getResources().getBoolean(i12));
    }
}
