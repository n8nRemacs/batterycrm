package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class ul1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f390584a = 0;

    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static void a(pr0 pr0Var) throws tr0 {
        int iD2 = pr0Var.d();
        String strJ = pr0Var.j();
        if (strJ == null || !strJ.startsWith("WEBVTT")) {
            pr0Var.e(iD2);
            throw tr0.a("Expected WEBVTT. Got " + pr0Var.j(), (Exception) null);
        }
    }

    public static long a(String str) {
        int i12 = pc1.f388768a;
        String[] strArrSplit = str.split("\\.", 2);
        long j12 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j12 = (j12 * 60) + Long.parseLong(str2);
        }
        long j13 = j12 * 1000;
        if (strArrSplit.length == 2) {
            j13 += Long.parseLong(strArrSplit[1]);
        }
        return j13 * 1000;
    }
}
