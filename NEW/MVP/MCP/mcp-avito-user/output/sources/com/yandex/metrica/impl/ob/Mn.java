package com.yandex.metrica.impl.ob;

import java.util.Map;

/* loaded from: classes7.dex */
public class Mn implements Kn<String> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, ?> f378965a;

    public Mn(@j.N Map<String, ?> map) {
        this.f378965a = map;
    }

    @Override // com.yandex.metrica.impl.ob.Kn
    public In a(@j.P String str) {
        String str2 = str;
        if (!this.f378965a.containsKey(str2)) {
            return In.a(this);
        }
        return In.a(this, "Failed to activate AppMetrica with provided apiKey ApiKey " + str2 + " has already been used by another reporter.");
    }
}
