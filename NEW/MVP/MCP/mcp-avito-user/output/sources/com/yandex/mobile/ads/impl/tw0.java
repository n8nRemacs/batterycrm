package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class tw0 extends we {

    /* renamed from: e, reason: collision with root package name */
    private final Resources f390322e;

    /* renamed from: f, reason: collision with root package name */
    private final String f390323f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private Uri f390324g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private AssetFileDescriptor f390325h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private FileInputStream f390326i;

    /* renamed from: j, reason: collision with root package name */
    private long f390327j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f390328k;

    public static class a extends hn {
        public a(int i12, @j.P String str, @j.P Exception exc) {
            super(i12, str, exc);
        }
    }

    public tw0(Context context) {
        super(false);
        this.f390322e = context.getResources();
        this.f390323f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i12) {
        return Uri.parse("rawresource:///" + i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0095 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.gn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.yandex.mobile.ads.impl.kn r16) throws android.content.res.Resources.NotFoundException, com.yandex.mobile.ads.impl.hn, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.tw0.a(com.yandex.mobile.ads.impl.kn):long");
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void close() {
        this.f390324g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f390326i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f390326i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f390325h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e12) {
                        throw new a(2000, null, e12);
                    }
                } finally {
                    this.f390325h = null;
                    if (this.f390328k) {
                        this.f390328k = false;
                        f();
                    }
                }
            } catch (IOException e13) {
                throw new a(2000, null, e13);
            }
        } catch (Throwable th2) {
            this.f390326i = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f390325h;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f390325h = null;
                    if (this.f390328k) {
                        this.f390328k = false;
                        f();
                    }
                    throw th2;
                } catch (IOException e14) {
                    throw new a(2000, null, e14);
                }
            } finally {
                this.f390325h = null;
                if (this.f390328k) {
                    this.f390328k = false;
                    f();
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    @j.P
    public final Uri d() {
        return this.f390324g;
    }

    @Override // com.yandex.mobile.ads.impl.dn
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        if (i13 == 0) {
            return 0;
        }
        long j12 = this.f390327j;
        if (j12 == 0) {
            return -1;
        }
        if (j12 != -1) {
            try {
                i13 = (int) Math.min(j12, i13);
            } catch (IOException e12) {
                throw new a(2000, null, e12);
            }
        }
        FileInputStream fileInputStream = this.f390326i;
        int i14 = pc1.f388768a;
        int i15 = fileInputStream.read(bArr, i12, i13);
        if (i15 == -1) {
            if (this.f390327j == -1) {
                return -1;
            }
            throw new a(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j13 = this.f390327j;
        if (j13 != -1) {
            this.f390327j = j13 - i15;
        }
        c(i15);
        return i15;
    }
}
