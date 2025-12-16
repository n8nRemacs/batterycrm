package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.dn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38763dn extends Sm<String> {
    public C38763dn(int i12, @j.N String str) {
        this(i12, str, C38737cm.a());
    }

    public C38763dn(int i12, @j.N String str, @j.N C38737cm c38737cm) {
        super(i12, str, c38737cm);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38813fn
    @j.P
    public String a(@j.P String str) {
        if (str == null || str.length() <= super.b()) {
            return str;
        }
        String strSubstring = str.substring(0, super.b());
        if (this.f379473c.isEnabled()) {
            this.f379473c.fw("\"%s\" %s size exceeded limit of %d characters", super.a(), str, Integer.valueOf(super.b()));
        }
        return strSubstring;
    }
}
