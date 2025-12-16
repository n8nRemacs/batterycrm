package com.yandex.metrica.impl.ob;

import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.am, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38687am extends HashMap<String, String> {

    /* renamed from: a, reason: collision with root package name */
    private int f380134a;

    public C38687am() {
        this.f380134a = 0;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @j.P
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String put(@j.N String str, @j.P String str2) {
        if (!containsKey(str)) {
            if (str2 == null) {
                return null;
            }
            this.f380134a = str2.length() + str.length() + this.f380134a;
            return (String) super.put(str, str2);
        }
        if (str2 == null) {
            return remove(str);
        }
        String str3 = get(str);
        this.f380134a = (str2.length() - (str3 == null ? 0 : str3.length())) + this.f380134a;
        return (String) super.put(str, str2);
    }

    public C38687am(@j.N String str) {
        super(Tl.e(str));
        this.f380134a = 0;
        for (String str2 : keySet()) {
            String str3 = (String) get(str2);
            this.f380134a = str2.length() + (str3 == null ? 0 : str3.length()) + this.f380134a;
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @j.P
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String remove(@j.N Object obj) {
        if (containsKey(obj)) {
            String str = get(obj);
            this.f380134a -= ((String) obj).length() + (str == null ? 0 : str.length());
        }
        return (String) super.remove(obj);
    }

    public int a() {
        return this.f380134a;
    }
}
