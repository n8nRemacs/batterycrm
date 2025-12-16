package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class nb {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, mb> f388197a = new a();

    public class a extends HashMap<String, mb> {
        public a() {
            put("image", new c30());
            put("number", new sp0());
            put("close_button", new mj());
            put("media", new wb0());
            put("string", new h71());
        }
    }

    @j.N
    public static mb a(@j.N String str) {
        String str2;
        str2 = "media";
        str.getClass();
        switch (str) {
            case "close_button":
                str2 = "close_button";
                break;
            case "favicon":
            case "icon":
                str2 = "image";
                break;
            case "rating":
            case "review_count":
                str2 = "number";
                break;
            case "media":
                break;
            default:
                str2 = "string";
                break;
        }
        return (mb) ((HashMap) f388197a).get(str2);
    }
}
