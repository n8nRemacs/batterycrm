package com.google.android.exoplayer2.text.ssa;

import com.google.android.exoplayer2.text.g;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import com.google.common.base.C37262f;
import j.P;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: SsaDecoder.java */
/* loaded from: classes6.dex */
public final class a extends g {

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f346952t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: o, reason: collision with root package name */
    public final boolean f346953o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public final b f346954p;

    /* renamed from: q, reason: collision with root package name */
    public LinkedHashMap f346955q;

    /* renamed from: r, reason: collision with root package name */
    public float f346956r;

    /* renamed from: s, reason: collision with root package name */
    public float f346957s;

    public a() {
        this(null);
    }

    public static int j(long j12, ArrayList arrayList, ArrayList arrayList2) {
        int i12;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i12 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j12) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j12) {
                i12 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i12, Long.valueOf(j12));
        arrayList2.add(i12, i12 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i12 - 1)));
        return i12;
    }

    public static long l(String str) {
        Matcher matcher = f346952t.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i12 = U.f348106a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x00d2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    @Override // com.google.android.exoplayer2.text.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.text.h i(int r22, byte[] r23, boolean r24) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ssa.a.i(int, byte[], boolean):com.google.android.exoplayer2.text.h");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(com.google.android.exoplayer2.util.F r38) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ssa.a.k(com.google.android.exoplayer2.util.F):void");
    }

    public a(@P List<byte[]> list) throws NumberFormatException {
        super("SsaDecoder");
        this.f346956r = -3.4028235E38f;
        this.f346957s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f346953o = false;
            this.f346954p = null;
            return;
        }
        this.f346953o = true;
        byte[] bArr = list.get(0);
        int i12 = U.f348106a;
        String str = new String(bArr, C37262f.f359034c);
        C36585a.b(str.startsWith("Format:"));
        b bVarA = b.a(str);
        bVarA.getClass();
        this.f346954p = bVarA;
        k(new F(list.get(1)));
    }
}
