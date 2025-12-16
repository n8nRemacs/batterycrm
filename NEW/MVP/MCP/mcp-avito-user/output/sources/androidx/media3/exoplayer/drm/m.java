package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.J;
import java.util.UUID;

/* compiled from: FrameworkCryptoConfig.java */
@J
/* loaded from: classes.dex */
public final class m implements androidx.media3.decoder.c {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f49124d;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f49125a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f49126b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f49127c;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        /*
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = androidx.media3.common.util.M.f47889c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = androidx.media3.common.util.M.f47890d
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            androidx.media3.exoplayer.drm.m.f49124d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.m.<clinit>():void");
    }

    public m(UUID uuid, byte[] bArr, boolean z12) {
        this.f49125a = uuid;
        this.f49126b = bArr;
        this.f49127c = z12;
    }
}
