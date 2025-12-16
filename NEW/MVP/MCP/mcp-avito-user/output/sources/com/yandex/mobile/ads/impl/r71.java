package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class r71 extends d41 {

    /* renamed from: o, reason: collision with root package name */
    private static final Pattern f389435o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: p, reason: collision with root package name */
    private static final Pattern f389436p = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: m, reason: collision with root package name */
    private final StringBuilder f389437m = new StringBuilder();

    /* renamed from: n, reason: collision with root package name */
    private final ArrayList<String> f389438n = new ArrayList<>();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x026e, code lost:
    
        return new com.yandex.mobile.ads.impl.s71((com.yandex.mobile.ads.impl.vm[]) r2.toArray(new com.yandex.mobile.ads.impl.vm[r4]), r3.b());
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015f  */
    @Override // com.yandex.mobile.ads.impl.d41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.yandex.mobile.ads.impl.t71 a(byte[] r21, int r22, boolean r23) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.r71.a(byte[], int, boolean):com.yandex.mobile.ads.impl.t71");
    }

    private static long a(Matcher matcher, int i12) {
        String strGroup = matcher.group(i12 + 1);
        long j12 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i12 + 2);
        strGroup2.getClass();
        long j13 = (Long.parseLong(strGroup2) * 60000) + j12;
        String strGroup3 = matcher.group(i12 + 3);
        strGroup3.getClass();
        long j14 = (Long.parseLong(strGroup3) * 1000) + j13;
        String strGroup4 = matcher.group(i12 + 4);
        if (strGroup4 != null) {
            j14 += Long.parseLong(strGroup4);
        }
        return j14 * 1000;
    }
}
