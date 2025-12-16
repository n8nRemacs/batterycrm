package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class uh0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f390562a = Pattern.compile("(<script)(.*)(src=\"mraid\\.js\")(.*)(<\\/script>)");

    public static boolean a(@j.N String str) {
        return f390562a.matcher(str).find();
    }
}
