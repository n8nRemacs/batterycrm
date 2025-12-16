package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.C23110a;
import androidx.media3.exoplayer.source.J;
import java.util.List;
import java.util.Map;

/* compiled from: IcyDataSource.java */
/* loaded from: classes.dex */
final class r implements androidx.media3.datasource.j {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.datasource.j f49821a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49822b;

    /* renamed from: c, reason: collision with root package name */
    public final a f49823c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f49824d;

    /* renamed from: e, reason: collision with root package name */
    public int f49825e;

    /* compiled from: IcyDataSource.java */
    public interface a {
    }

    public r(androidx.media3.datasource.j jVar, int i12, a aVar) {
        C23110a.b(i12 > 0);
        this.f49821a = jVar;
        this.f49822b = i12;
        this.f49823c = aVar;
        this.f49824d = new byte[1];
        this.f49825e = i12;
    }

    @Override // androidx.media3.datasource.j
    public final Map<String, List<String>> c() {
        return this.f49821a.c();
    }

    @Override // androidx.media3.datasource.j
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.j
    public final long e(androidx.media3.datasource.o oVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.j
    @j.P
    public final Uri getUri() {
        return this.f49821a.getUri();
    }

    @Override // androidx.media3.datasource.j
    public final void j(androidx.media3.datasource.B b12) {
        b12.getClass();
        this.f49821a.j(b12);
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) {
        long jMax;
        int i14 = this.f49825e;
        androidx.media3.datasource.j jVar = this.f49821a;
        if (i14 == 0) {
            byte[] bArr2 = this.f49824d;
            int i15 = 0;
            if (jVar.read(bArr2, 0, 1) != -1) {
                int i16 = (bArr2[0] & 255) << 4;
                if (i16 != 0) {
                    byte[] bArr3 = new byte[i16];
                    int i17 = i16;
                    while (i17 > 0) {
                        int i18 = jVar.read(bArr3, i15, i17);
                        if (i18 != -1) {
                            i15 += i18;
                            i17 -= i18;
                        }
                    }
                    while (i16 > 0 && bArr3[i16 - 1] == 0) {
                        i16--;
                    }
                    if (i16 > 0) {
                        androidx.media3.common.util.z zVar = new androidx.media3.common.util.z(bArr3, i16);
                        J.a aVar = (J.a) this.f49823c;
                        if (aVar.f49561m) {
                            Map<String, String> map = J.f49509N;
                            jMax = Math.max(J.this.m(true), aVar.f49558j);
                        } else {
                            jMax = aVar.f49558j;
                        }
                        long j12 = jMax;
                        int iA2 = zVar.a();
                        O o12 = aVar.f49560l;
                        o12.getClass();
                        o12.d(iA2, zVar);
                        o12.f(j12, 1, iA2, 0, null);
                        aVar.f49561m = true;
                    }
                }
                this.f49825e = this.f49822b;
            }
            return -1;
        }
        int i19 = jVar.read(bArr, i12, Math.min(this.f49825e, i13));
        if (i19 != -1) {
            this.f49825e -= i19;
        }
        return i19;
    }
}
