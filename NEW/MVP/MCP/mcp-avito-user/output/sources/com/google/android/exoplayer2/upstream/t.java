package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.upstream.v;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultDataSource.java */
/* loaded from: classes6.dex */
public final class t implements InterfaceC36583m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f347982a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f347983b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC36583m f347984c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public FileDataSource f347985d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public AssetDataSource f347986e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public ContentDataSource f347987f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public InterfaceC36583m f347988g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public UdpDataSource f347989h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public C36581k f347990i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public RawResourceDataSource f347991j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public InterfaceC36583m f347992k;

    /* compiled from: DefaultDataSource.java */
    public static final class a implements InterfaceC36583m.a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f347993a;

        /* renamed from: b, reason: collision with root package name */
        public final v.b f347994b;

        public a(Context context, v.b bVar) {
            this.f347993a = context.getApplicationContext();
            this.f347994b = bVar;
        }

        @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m.a
        public final InterfaceC36583m a() {
            return new t(this.f347993a, this.f347994b.a());
        }
    }

    public t(Context context, InterfaceC36583m interfaceC36583m) {
        this.f347982a = context.getApplicationContext();
        interfaceC36583m.getClass();
        this.f347984c = interfaceC36583m;
        this.f347983b = new ArrayList();
    }

    public static void m(@P InterfaceC36583m interfaceC36583m, M m12) {
        if (interfaceC36583m != null) {
            interfaceC36583m.k(m12);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final Map<String, List<String>> c() {
        InterfaceC36583m interfaceC36583m = this.f347992k;
        return interfaceC36583m == null ? Collections.emptyMap() : interfaceC36583m.c();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
        InterfaceC36583m interfaceC36583m = this.f347992k;
        if (interfaceC36583m != null) {
            try {
                interfaceC36583m.close();
            } finally {
                this.f347992k = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final long e(p pVar) {
        C36585a.d(this.f347992k == null);
        String scheme = pVar.f347929a.getScheme();
        int i12 = U.f348106a;
        Uri uri = pVar.f347929a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f347982a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f347985d == null) {
                    FileDataSource fileDataSource = new FileDataSource();
                    this.f347985d = fileDataSource;
                    l(fileDataSource);
                }
                this.f347992k = this.f347985d;
            } else {
                if (this.f347986e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(context);
                    this.f347986e = assetDataSource;
                    l(assetDataSource);
                }
                this.f347992k = this.f347986e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f347986e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(context);
                this.f347986e = assetDataSource2;
                l(assetDataSource2);
            }
            this.f347992k = this.f347986e;
        } else if ("content".equals(scheme)) {
            if (this.f347987f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(context);
                this.f347987f = contentDataSource;
                l(contentDataSource);
            }
            this.f347992k = this.f347987f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            InterfaceC36583m interfaceC36583m = this.f347984c;
            if (zEquals) {
                if (this.f347988g == null) {
                    try {
                        InterfaceC36583m interfaceC36583m2 = (InterfaceC36583m) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f347988g = interfaceC36583m2;
                        l(interfaceC36583m2);
                    } catch (ClassNotFoundException unused) {
                    } catch (Exception e12) {
                        throw new RuntimeException("Error instantiating RTMP extension", e12);
                    }
                    if (this.f347988g == null) {
                        this.f347988g = interfaceC36583m;
                    }
                }
                this.f347992k = this.f347988g;
            } else if ("udp".equals(scheme)) {
                if (this.f347989h == null) {
                    UdpDataSource udpDataSource = new UdpDataSource();
                    this.f347989h = udpDataSource;
                    l(udpDataSource);
                }
                this.f347992k = this.f347989h;
            } else if ("data".equals(scheme)) {
                if (this.f347990i == null) {
                    C36581k c36581k = new C36581k();
                    this.f347990i = c36581k;
                    l(c36581k);
                }
                this.f347992k = this.f347990i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f347991j == null) {
                    RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                    this.f347991j = rawResourceDataSource;
                    l(rawResourceDataSource);
                }
                this.f347992k = this.f347991j;
            } else {
                this.f347992k = interfaceC36583m;
            }
        }
        return this.f347992k.e(pVar);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        InterfaceC36583m interfaceC36583m = this.f347992k;
        if (interfaceC36583m == null) {
            return null;
        }
        return interfaceC36583m.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void k(M m12) {
        m12.getClass();
        this.f347984c.k(m12);
        this.f347983b.add(m12);
        m(this.f347985d, m12);
        m(this.f347986e, m12);
        m(this.f347987f, m12);
        m(this.f347988g, m12);
        m(this.f347989h, m12);
        m(this.f347990i, m12);
        m(this.f347991j, m12);
    }

    public final void l(InterfaceC36583m interfaceC36583m) {
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f347983b;
            if (i12 >= arrayList.size()) {
                return;
            }
            interfaceC36583m.k((M) arrayList.get(i12));
            i12++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) {
        InterfaceC36583m interfaceC36583m = this.f347992k;
        interfaceC36583m.getClass();
        return interfaceC36583m.read(bArr, i12, i13);
    }
}
