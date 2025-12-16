package androidx.media3.datasource;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.datasource.j;
import androidx.media3.datasource.r;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultDataSource.java */
/* loaded from: classes.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f48279a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f48280b;

    /* renamed from: c, reason: collision with root package name */
    public final j f48281c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public FileDataSource f48282d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public AssetDataSource f48283e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public ContentDataSource f48284f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public j f48285g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public UdpDataSource f48286h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public h f48287i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public RawResourceDataSource f48288j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public j f48289k;

    /* compiled from: DefaultDataSource.java */
    public static final class a implements j.a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f48290a;

        /* renamed from: b, reason: collision with root package name */
        public final r.b f48291b;

        public a(Context context) {
            r.b bVar = new r.b();
            this.f48290a = context.getApplicationContext();
            this.f48291b = bVar;
        }

        @Override // androidx.media3.datasource.j.a
        @J
        public final j a() {
            return new p(this.f48290a, this.f48291b.a());
        }
    }

    @J
    public p(Context context, j jVar) {
        this.f48279a = context.getApplicationContext();
        jVar.getClass();
        this.f48281c = jVar;
        this.f48280b = new ArrayList();
    }

    public static void l(@P j jVar, B b12) {
        if (jVar != null) {
            jVar.j(b12);
        }
    }

    @Override // androidx.media3.datasource.j
    @J
    public final Map<String, List<String>> c() {
        j jVar = this.f48289k;
        return jVar == null ? Collections.emptyMap() : jVar.c();
    }

    @Override // androidx.media3.datasource.j
    @J
    public final void close() {
        j jVar = this.f48289k;
        if (jVar != null) {
            try {
                jVar.close();
            } finally {
                this.f48289k = null;
            }
        }
    }

    @Override // androidx.media3.datasource.j
    @J
    public final long e(o oVar) {
        C23110a.g(this.f48289k == null);
        String scheme = oVar.f48245a.getScheme();
        int i12 = M.f47887a;
        Uri uri = oVar.f48245a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f48279a;
        if (zIsEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f48282d == null) {
                    FileDataSource fileDataSource = new FileDataSource();
                    this.f48282d = fileDataSource;
                    k(fileDataSource);
                }
                this.f48289k = this.f48282d;
            } else {
                if (this.f48283e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(context);
                    this.f48283e = assetDataSource;
                    k(assetDataSource);
                }
                this.f48289k = this.f48283e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f48283e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(context);
                this.f48283e = assetDataSource2;
                k(assetDataSource2);
            }
            this.f48289k = this.f48283e;
        } else if ("content".equals(scheme)) {
            if (this.f48284f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(context);
                this.f48284f = contentDataSource;
                k(contentDataSource);
            }
            this.f48289k = this.f48284f;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            j jVar = this.f48281c;
            if (zEquals) {
                if (this.f48285g == null) {
                    try {
                        j jVar2 = (j) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f48285g = jVar2;
                        k(jVar2);
                    } catch (ClassNotFoundException unused) {
                        androidx.media3.common.util.s.g();
                    } catch (Exception e12) {
                        throw new RuntimeException("Error instantiating RTMP extension", e12);
                    }
                    if (this.f48285g == null) {
                        this.f48285g = jVar;
                    }
                }
                this.f48289k = this.f48285g;
            } else if ("udp".equals(scheme)) {
                if (this.f48286h == null) {
                    UdpDataSource udpDataSource = new UdpDataSource();
                    this.f48286h = udpDataSource;
                    k(udpDataSource);
                }
                this.f48289k = this.f48286h;
            } else if ("data".equals(scheme)) {
                if (this.f48287i == null) {
                    h hVar = new h();
                    this.f48287i = hVar;
                    k(hVar);
                }
                this.f48289k = this.f48287i;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f48288j == null) {
                    RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                    this.f48288j = rawResourceDataSource;
                    k(rawResourceDataSource);
                }
                this.f48289k = this.f48288j;
            } else {
                this.f48289k = jVar;
            }
        }
        return this.f48289k.e(oVar);
    }

    @Override // androidx.media3.datasource.j
    @J
    @P
    public final Uri getUri() {
        j jVar = this.f48289k;
        if (jVar == null) {
            return null;
        }
        return jVar.getUri();
    }

    @Override // androidx.media3.datasource.j
    @J
    public final void j(B b12) {
        b12.getClass();
        this.f48281c.j(b12);
        this.f48280b.add(b12);
        l(this.f48282d, b12);
        l(this.f48283e, b12);
        l(this.f48284f, b12);
        l(this.f48285g, b12);
        l(this.f48286h, b12);
        l(this.f48287i, b12);
        l(this.f48288j, b12);
    }

    public final void k(j jVar) {
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f48280b;
            if (i12 >= arrayList.size()) {
                return;
            }
            jVar.j((B) arrayList.get(i12));
            i12++;
        }
    }

    @Override // androidx.media3.common.InterfaceC23102m
    @J
    public final int read(byte[] bArr, int i12, int i13) {
        j jVar = this.f48289k;
        jVar.getClass();
        return jVar.read(bArr, i12, i13);
    }
}
