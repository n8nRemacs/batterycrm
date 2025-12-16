package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.gn;
import com.yandex.mobile.ads.impl.wo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class po implements gn {

    /* renamed from: a, reason: collision with root package name */
    private final Context f388902a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f388903b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final gn f388904c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private wv f388905d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private ob f388906e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private sl f388907f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private gn f388908g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private pb1 f388909h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private en f388910i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private tw0 f388911j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    private gn f388912k;

    public static final class a implements gn.a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f388913a;

        /* renamed from: b, reason: collision with root package name */
        private final gn.a f388914b;

        public a(Context context) {
            this(context, new wo.a());
        }

        @Override // com.yandex.mobile.ads.impl.gn.a
        public final gn a() {
            return new po(this.f388913a, this.f388914b.a());
        }

        public a(Context context, gn.a aVar) {
            this.f388913a = context.getApplicationContext();
            this.f388914b = aVar;
        }
    }

    public po(Context context, gn gnVar) {
        this.f388902a = context.getApplicationContext();
        this.f388904c = (gn) db.a(gnVar);
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void a(ua1 ua1Var) {
        ua1Var.getClass();
        this.f388904c.a(ua1Var);
        this.f388903b.add(ua1Var);
        wv wvVar = this.f388905d;
        if (wvVar != null) {
            wvVar.a(ua1Var);
        }
        ob obVar = this.f388906e;
        if (obVar != null) {
            obVar.a(ua1Var);
        }
        sl slVar = this.f388907f;
        if (slVar != null) {
            slVar.a(ua1Var);
        }
        gn gnVar = this.f388908g;
        if (gnVar != null) {
            gnVar.a(ua1Var);
        }
        pb1 pb1Var = this.f388909h;
        if (pb1Var != null) {
            pb1Var.a(ua1Var);
        }
        en enVar = this.f388910i;
        if (enVar != null) {
            enVar.a(ua1Var);
        }
        tw0 tw0Var = this.f388911j;
        if (tw0Var != null) {
            tw0Var.a(ua1Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final Map<String, List<String>> b() {
        gn gnVar = this.f388912k;
        return gnVar == null ? Collections.emptyMap() : gnVar.b();
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void close() {
        gn gnVar = this.f388912k;
        if (gnVar != null) {
            try {
                gnVar.close();
            } finally {
                this.f388912k = null;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    @j.P
    public final Uri d() {
        gn gnVar = this.f388912k;
        if (gnVar == null) {
            return null;
        }
        return gnVar.d();
    }

    @Override // com.yandex.mobile.ads.impl.dn
    public final int read(byte[] bArr, int i12, int i13) {
        gn gnVar = this.f388912k;
        gnVar.getClass();
        return gnVar.read(bArr, i12, i13);
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final long a(kn knVar) {
        db.b(this.f388912k == null);
        String scheme = knVar.f387192a.getScheme();
        Uri uri = knVar.f387192a;
        int i12 = pc1.f388768a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            if ("asset".equals(scheme)) {
                if (this.f388906e == null) {
                    ob obVar = new ob(this.f388902a);
                    this.f388906e = obVar;
                    a(obVar);
                }
                this.f388912k = this.f388906e;
            } else if ("content".equals(scheme)) {
                if (this.f388907f == null) {
                    sl slVar = new sl(this.f388902a);
                    this.f388907f = slVar;
                    a(slVar);
                }
                this.f388912k = this.f388907f;
            } else if ("rtmp".equals(scheme)) {
                if (this.f388908g == null) {
                    try {
                        gn gnVar = (gn) Class.forName("com.yandex.mobile.ads.exo.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.f388908g = gnVar;
                        a(gnVar);
                    } catch (ClassNotFoundException unused) {
                        ka0.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e12) {
                        throw new RuntimeException("Error instantiating RTMP extension", e12);
                    }
                    if (this.f388908g == null) {
                        this.f388908g = this.f388904c;
                    }
                }
                this.f388912k = this.f388908g;
            } else if ("udp".equals(scheme)) {
                if (this.f388909h == null) {
                    pb1 pb1Var = new pb1(0);
                    this.f388909h = pb1Var;
                    a(pb1Var);
                }
                this.f388912k = this.f388909h;
            } else if ("data".equals(scheme)) {
                if (this.f388910i == null) {
                    en enVar = new en();
                    this.f388910i = enVar;
                    a(enVar);
                }
                this.f388912k = this.f388910i;
            } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                this.f388912k = this.f388904c;
            } else {
                if (this.f388911j == null) {
                    tw0 tw0Var = new tw0(this.f388902a);
                    this.f388911j = tw0Var;
                    a(tw0Var);
                }
                this.f388912k = this.f388911j;
            }
        } else {
            String path = knVar.f387192a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f388906e == null) {
                    ob obVar2 = new ob(this.f388902a);
                    this.f388906e = obVar2;
                    a(obVar2);
                }
                this.f388912k = this.f388906e;
            } else {
                if (this.f388905d == null) {
                    wv wvVar = new wv();
                    this.f388905d = wvVar;
                    a(wvVar);
                }
                this.f388912k = this.f388905d;
            }
        }
        return this.f388912k.a(knVar);
    }

    private void a(gn gnVar) {
        for (int i12 = 0; i12 < this.f388903b.size(); i12++) {
            gnVar.a((ua1) this.f388903b.get(i12));
        }
    }
}
