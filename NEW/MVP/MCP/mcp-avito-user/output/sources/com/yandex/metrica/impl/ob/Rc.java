package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C39026oc;

/* loaded from: classes7.dex */
class Rc extends V {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private U7 f379295b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private Vb f379296c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private com.yandex.metrica.coreutils.services.e f379297d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final E f379298e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final C39205w f379299f;

    public Rc(@j.P V v12, @j.N U7 u72, @j.N Vb vb2, @j.N com.yandex.metrica.coreutils.services.e eVar, @j.N E e12, @j.N C39205w c39205w) {
        super(v12);
        this.f379295b = u72;
        this.f379296c = vb2;
        this.f379297d = eVar;
        this.f379298e = e12;
        this.f379299f = c39205w;
    }

    @Override // com.yandex.metrica.impl.ob.V
    public void b(@j.P Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            C39026oc.a aVarA = C39026oc.a.a(this.f379299f.c());
            this.f379297d.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f379297d.getClass();
            Hc hc2 = new Hc(aVarA, jCurrentTimeMillis, SystemClock.elapsedRealtime(), location, this.f379298e.b(), null);
            String strA = this.f379296c.a(hc2);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            this.f379295b.a(hc2.e(), strA);
        }
    }
}
