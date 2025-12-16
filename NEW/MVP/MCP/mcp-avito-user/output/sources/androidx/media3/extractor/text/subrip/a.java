package androidx.media3.extractor.text.subrip;

import androidx.media3.common.util.J;
import androidx.media3.extractor.text.d;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: SubripDecoder.java */
@J
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f51355q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f51356r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o, reason: collision with root package name */
    public final StringBuilder f51357o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList<String> f51358p;

    public a() {
        super("SubripDecoder");
        this.f51357o = new StringBuilder();
        this.f51358p = new ArrayList<>();
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
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0254, code lost:
    
        return new androidx.media3.extractor.text.subrip.b((androidx.media3.common.text.a[]) r1.toArray(new androidx.media3.common.text.a[0]), java.util.Arrays.copyOf(r2.f47947b, r2.f47946a));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014f  */
    @Override // androidx.media3.extractor.text.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.media3.extractor.text.e i(int r20, byte[] r21, boolean r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.subrip.a.i(int, byte[], boolean):androidx.media3.extractor.text.e");
    }
}
