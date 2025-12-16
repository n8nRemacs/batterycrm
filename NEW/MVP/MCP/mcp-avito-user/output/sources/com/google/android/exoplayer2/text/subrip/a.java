package com.google.android.exoplayer2.text.subrip;

import com.google.android.exoplayer2.text.g;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: SubripDecoder.java */
/* loaded from: classes6.dex */
public final class a extends g {

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f346990q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f346991r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o, reason: collision with root package name */
    public final StringBuilder f346992o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList<String> f346993p;

    public a() {
        super("SubripDecoder");
        this.f346992o = new StringBuilder();
        this.f346993p = new ArrayList<>();
    }

    public static long j(Matcher matcher, int i12) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0227, code lost:
    
        return new com.google.android.exoplayer2.text.subrip.b((com.google.android.exoplayer2.text.a[]) r1.toArray(new com.google.android.exoplayer2.text.a[0]), java.util.Arrays.copyOf(r2.f348165b, r2.f348164a));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d  */
    @Override // com.google.android.exoplayer2.text.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.text.h i(int r19, byte[] r20, boolean r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.subrip.a.i(int, byte[], boolean):com.google.android.exoplayer2.text.h");
    }
}
