package com.yandex.metrica.impl.ob;

import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.gi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC38833gi {
    UNKNOWN(0),
    NETWORK(1),
    PARSE(2);


    /* renamed from: a, reason: collision with root package name */
    private int f380659a;

    EnumC38833gi(int i12) {
        this.f380659a = i12;
    }

    public Bundle a(Bundle bundle) {
        bundle.putInt("startup_error_key_code", this.f380659a);
        return bundle;
    }
}
