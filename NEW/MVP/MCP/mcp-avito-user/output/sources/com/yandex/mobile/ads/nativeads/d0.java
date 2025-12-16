package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.impl.ik0;
import com.yandex.mobile.ads.impl.im0;
import com.yandex.mobile.ads.impl.ky0;
import com.yandex.mobile.ads.impl.ly0;
import com.yandex.mobile.ads.impl.m41;
import com.yandex.mobile.ads.impl.n2;
import com.yandex.mobile.ads.impl.nj0;
import com.yandex.mobile.ads.impl.o5;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
final class d0 implements ky0.a {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final n2 f392618a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final List<nj0> f392619b;

    /* renamed from: c, reason: collision with root package name */
    @N
    private final ik0 f392620c = new ik0();

    /* renamed from: d, reason: collision with root package name */
    @N
    private final o5 f392621d = new o5();

    /* renamed from: e, reason: collision with root package name */
    @P
    private String f392622e;

    /* renamed from: f, reason: collision with root package name */
    @P
    private int f392623f;

    /* renamed from: g, reason: collision with root package name */
    @P
    private AdResponse f392624g;

    public d0(@N List<nj0> list, @N n2 n2Var) {
        this.f392619b = list;
        this.f392618a = n2Var;
    }

    public final void a(@N int i12) {
        this.f392623f = i12;
    }

    public final void a(@N String str) {
        this.f392622e = str;
    }

    public final void a(@N AdResponse adResponse) {
        this.f392624g = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.ky0.a
    @N
    public final Map<String, Object> a() {
        ly0 ly0Var = new ly0(new HashMap());
        int i12 = this.f392623f;
        if (i12 != 0) {
            ly0Var.b(im0.a(i12), "bind_type");
        }
        ly0Var.a(this.f392622e, "native_ad_type");
        AdResponse adResponse = this.f392624g;
        if (adResponse != null) {
            ly0Var.a(adResponse.c());
            Map<String, Object> mapR = this.f392624g.r();
            if (mapR != null) {
                ly0Var.a(mapR);
            }
            ly0Var.a(this.f392624g.v(), "design");
            ly0Var.b(this.f392624g.l(), "ad_source");
        }
        SizeInfo sizeInfoN = this.f392618a.n();
        if (sizeInfoN != null) {
            ly0Var.b(m41.b(sizeInfoN.d()), "size_type");
            ly0Var.b(Integer.valueOf(sizeInfoN.e()), "width");
            ly0Var.b(Integer.valueOf(sizeInfoN.c()), "height");
        }
        ly0Var.a(this.f392621d.a(this.f392618a.a()));
        ik0 ik0Var = this.f392620c;
        List<nj0> list = this.f392619b;
        ik0Var.getClass();
        HashSet hashSet = new HashSet();
        Iterator<nj0> it = list.iterator();
        while (it.hasNext()) {
            hashSet.addAll(ik0Var.a(it.next()));
        }
        ArrayList arrayList = new ArrayList(hashSet);
        if (arrayList.size() > 0) {
            ly0Var.b(arrayList.toArray(new String[arrayList.size()]), "image_sizes");
        }
        return ly0Var.a();
    }
}
