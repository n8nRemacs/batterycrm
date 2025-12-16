package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public class Fn implements Kn<String> {

    /* renamed from: a, reason: collision with root package name */
    private final String f378153a;

    public Fn(@j.N String str) {
        this.f378153a = str;
    }

    @Override // com.yandex.metrica.impl.ob.Kn
    public In a(@j.P String str) {
        if (!TextUtils.isEmpty(str)) {
            return In.a(this);
        }
        return In.a(this, this.f378153a + " is empty.");
    }
}
