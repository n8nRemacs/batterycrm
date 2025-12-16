package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Zm {

    /* renamed from: a, reason: collision with root package name */
    private final String f380020a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38737cm f380021b;

    public Zm(int i12, @j.N String str, @j.N C38737cm c38737cm) {
        this.f380020a = str;
        this.f380021b = c38737cm;
    }

    public boolean a(@j.N C38687am c38687am, @j.N String str, @j.P String str2) {
        int iA2 = c38687am.a();
        if (str2 != null) {
            iA2 += str2.length();
        }
        if (c38687am.containsKey(str)) {
            String str3 = c38687am.get(str);
            if (str3 != null) {
                iA2 -= str3.length();
            }
        } else {
            iA2 += str.length();
        }
        return iA2 > 4500;
    }

    public void a(@j.N String str) {
        if (this.f380021b.isEnabled()) {
            this.f380021b.fw("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", this.f380020a, 4500, str);
        }
    }
}
