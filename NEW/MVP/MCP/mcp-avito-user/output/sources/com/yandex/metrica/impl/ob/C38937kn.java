package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.kn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38937kn extends AbstractC38863hn {
    public C38937kn(int i12) {
        super(i12);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC38863hn
    @j.N
    public C38838gn<String, Vm> a(@j.P String str) {
        int length = 0;
        if (str != null && str.length() > a()) {
            String strSubstring = str.substring(0, a());
            int length2 = C38689b.b(str).length;
            int length3 = C38689b.b(strSubstring).length;
            length = str.getBytes().length - strSubstring.getBytes().length;
            str = strSubstring;
        }
        return new C38838gn<>(str, new Um(length));
    }
}
