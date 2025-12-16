package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class tb {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, sb> f390147a = new a();

    public class a extends HashMap<String, sb> {
        public a() {
            put("image", new o20());
            put("string", new i71());
            put("media", new xb0());
        }
    }

    @j.N
    public static sb a(@j.N String str) {
        String str2;
        str2 = "media";
        str.getClass();
        switch (str) {
            case "favicon":
            case "icon":
                str2 = "image";
                break;
            case "media":
                break;
            default:
                str2 = "string";
                break;
        }
        return (sb) ((HashMap) f390147a).get(str2);
    }
}
