package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public final class ob extends we {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f388475e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private Uri f388476f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private InputStream f388477g;

    /* renamed from: h, reason: collision with root package name */
    private long f388478h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f388479i;

    public static final class a extends hn {
        public a(@j.P IOException iOException, int i12) {
            super(iOException, i12);
        }
    }

    public ob(Context context) {
        super(false);
        this.f388475e = context.getAssets();
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final long a(kn knVar) throws IOException {
        try {
            Uri uri = knVar.f387192a;
            this.f388476f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            b(knVar);
            InputStream inputStreamOpen = this.f388475e.open(path, 1);
            this.f388477g = inputStreamOpen;
            if (inputStreamOpen.skip(knVar.f387197f) < knVar.f387197f) {
                throw new a(null, 2008);
            }
            long j12 = knVar.f387198g;
            if (j12 != -1) {
                this.f388478h = j12;
            } else {
                long jAvailable = this.f388477g.available();
                this.f388478h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f388478h = -1L;
                }
            }
            this.f388479i = true;
            c(knVar);
            return this.f388478h;
        } catch (a e12) {
            throw e12;
        } catch (IOException e13) {
            throw new a(e13, e13 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void close() {
        this.f388476f = null;
        try {
            try {
                InputStream inputStream = this.f388477g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e12) {
                throw new a(e12, 2000);
            }
        } finally {
            this.f388477g = null;
            if (this.f388479i) {
                this.f388479i = false;
                f();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    @j.P
    public final Uri d() {
        return this.f388476f;
    }

    @Override // com.yandex.mobile.ads.impl.dn
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (i13 == 0) {
            return 0;
        }
        long j12 = this.f388478h;
        if (j12 == 0) {
            return -1;
        }
        if (j12 != -1) {
            try {
                i13 = (int) Math.min(j12, i13);
            } catch (IOException e12) {
                throw new a(e12, 2000);
            }
        }
        InputStream inputStream = this.f388477g;
        int i14 = pc1.f388768a;
        int i15 = inputStream.read(bArr, i12, i13);
        if (i15 == -1) {
            return -1;
        }
        long j13 = this.f388478h;
        if (j13 != -1) {
            this.f388478h = j13 - i15;
        }
        c(i15);
        return i15;
    }
}
