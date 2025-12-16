package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.yandex.mobile.ads.impl.lv0;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
final class a20 implements gn {

    /* renamed from: a, reason: collision with root package name */
    private final gn f383384a;

    /* renamed from: b, reason: collision with root package name */
    private final int f383385b;

    /* renamed from: c, reason: collision with root package name */
    private final a f383386c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f383387d;

    /* renamed from: e, reason: collision with root package name */
    private int f383388e;

    public interface a {
    }

    public a20(a71 a71Var, int i12, a aVar) {
        db.a(i12 > 0);
        this.f383384a = a71Var;
        this.f383385b = i12;
        this.f383386c = aVar;
        this.f383387d = new byte[1];
        this.f383388e = i12;
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final long a(kn knVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final Map<String, List<String>> b() {
        return this.f383384a.b();
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.gn
    @j.P
    public final Uri d() {
        return this.f383384a.d();
    }

    @Override // com.yandex.mobile.ads.impl.dn
    public final int read(byte[] bArr, int i12, int i13) {
        if (this.f383388e == 0) {
            int i14 = 0;
            if (this.f383384a.read(this.f383387d, 0, 1) != -1) {
                int i15 = (this.f383387d[0] & 255) << 4;
                if (i15 != 0) {
                    byte[] bArr2 = new byte[i15];
                    int i16 = i15;
                    while (i16 > 0) {
                        int i17 = this.f383384a.read(bArr2, i14, i16);
                        if (i17 != -1) {
                            i14 += i17;
                            i16 -= i17;
                        }
                    }
                    while (i15 > 0 && bArr2[i15 - 1] == 0) {
                        i15--;
                    }
                    if (i15 > 0) {
                        ((lv0.a) this.f383386c).a(new pr0(i15, bArr2));
                    }
                }
                this.f383388e = this.f383385b;
            }
            return -1;
        }
        int i18 = this.f383384a.read(bArr, i12, Math.min(this.f383388e, i13));
        if (i18 != -1) {
            this.f383388e -= i18;
        }
        return i18;
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void a(ua1 ua1Var) {
        ua1Var.getClass();
        this.f383384a.a(ua1Var);
    }
}
