package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.util.regex.Pattern;

/* compiled from: SimpleCacheSpan.java */
/* loaded from: classes6.dex */
final class r extends f {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f347904h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f347905i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f347906j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[PHI: r2
  0x0096: PHI (r2v16 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:26:0x008c, B:22:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.upstream.cache.r b(java.io.File r16, long r17, long r19, com.google.android.exoplayer2.upstream.cache.i r21) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.r.b(java.io.File, long, long, com.google.android.exoplayer2.upstream.cache.i):com.google.android.exoplayer2.upstream.cache.r");
    }

    public static File c(File file, int i12, long j12, long j13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12);
        sb2.append(".");
        sb2.append(j12);
        sb2.append(".");
        return new File(file, AK.c.j(j13, ".v3.exo", sb2));
    }
}
