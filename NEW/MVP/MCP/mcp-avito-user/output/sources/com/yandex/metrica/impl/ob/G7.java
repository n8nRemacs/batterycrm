package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class G7 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final String f378176a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f378177b;

    public G7(@j.P String str, @j.P String str2) {
        this.f378176a = str;
        this.f378177b = str2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RuntimeConfig{errorEnvironment='");
        sb2.append(this.f378176a);
        sb2.append("', handlerVersion='");
        return AK.c.s(sb2, this.f378177b, "'}");
    }
}
