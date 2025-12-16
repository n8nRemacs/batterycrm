package com.yandex.mobile.ads.nativeads;

import android.annotation.SuppressLint;
import com.yandex.mobile.ads.impl.eb;
import com.yandex.mobile.ads.impl.fb;
import com.yandex.mobile.ads.impl.rl0;
import com.yandex.mobile.ads.impl.xc1;
import com.yandex.mobile.ads.nativeads.f0;
import j.N;
import j.P;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
class g implements f0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<eb<?>> f392628a;

    /* renamed from: b, reason: collision with root package name */
    final rl0 f392629b;

    /* renamed from: c, reason: collision with root package name */
    private String f392630c;

    /* renamed from: d, reason: collision with root package name */
    private w f392631d;

    public class a implements f0.b {
        public a() {
        }

        @Override // com.yandex.mobile.ads.nativeads.f0.b
        public final boolean isValid(@N List<eb<?>> list) {
            fb fbVarA;
            for (eb<?> ebVar : list) {
                if (ebVar.f() && (fbVarA = g.this.f392631d.a(ebVar)) != null && fbVarA.d()) {
                    return true;
                }
            }
            return false;
        }
    }

    public class b implements f0.b {
        public b() {
        }

        @Override // com.yandex.mobile.ads.nativeads.f0.b
        public final boolean isValid(@N List<eb<?>> list) {
            fb fbVarA;
            for (eb<?> ebVar : list) {
                if (ebVar.f() && ((fbVarA = g.this.f392631d.a(ebVar)) == null || !fbVarA.e())) {
                    g.this.f392630c = ebVar.b();
                    return false;
                }
            }
            return true;
        }
    }

    public class c implements f0.b {
        public c() {
        }

        @Override // com.yandex.mobile.ads.nativeads.f0.b
        public final boolean isValid(@N List<eb<?>> list) {
            for (eb<?> ebVar : list) {
                if (ebVar.f()) {
                    fb fbVarA = g.this.f392631d.a(ebVar);
                    Object objD = ebVar.d();
                    if (fbVarA == null || !fbVarA.a(objD)) {
                        g.this.f392630c = ebVar.b();
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public class d implements f0.b {
        public d() {
        }

        @Override // com.yandex.mobile.ads.nativeads.f0.b
        public final boolean isValid(@N List<eb<?>> list) {
            fb fbVarA;
            for (eb<?> ebVar : list) {
                if (ebVar.f() && ((fbVarA = g.this.f392631d.a(ebVar)) == null || !fbVarA.b())) {
                    g.this.f392630c = ebVar.b();
                    return false;
                }
            }
            return true;
        }
    }

    public g(@P List<eb<?>> list, @N rl0 rl0Var) {
        this.f392628a = list;
        this.f392629b = rl0Var;
    }

    @j.k0
    public boolean b() {
        return !(this.f392631d != null && a(new a(), this.f392628a));
    }

    public boolean c() {
        return !(this.f392631d != null && a(new c(), this.f392628a));
    }

    @j.k0
    public boolean d() {
        return !(this.f392631d != null && a(new b(), this.f392628a));
    }

    @Override // com.yandex.mobile.ads.nativeads.f0
    public void a(w wVar) {
        this.f392631d = wVar;
    }

    @SuppressLint({"VisibleForTests"})
    public boolean a(@N f0.b bVar, @P List<eb<?>> list) {
        this.f392629b.getClass();
        return list != null && bVar.isValid(list);
    }

    @Override // com.yandex.mobile.ads.nativeads.f0
    @N
    public k0 a() {
        return new k0(this.f392630c, this.f392631d != null && a(new d(), this.f392628a));
    }

    @Override // com.yandex.mobile.ads.nativeads.f0
    public f0.a a(boolean z12) {
        int i12;
        xc1.a aVar;
        List<eb<?>> list = this.f392628a;
        boolean z13 = false;
        if (list != null) {
            Iterator<eb<?>> it = list.iterator();
            i12 = 0;
            while (it.hasNext()) {
                if (it.next().f()) {
                    i12++;
                }
            }
        } else {
            i12 = 0;
        }
        if ((i12 >= 2) && b()) {
            z13 = true;
        }
        if (z13 && !z12) {
            aVar = xc1.a.f391690g;
        } else if (d()) {
            aVar = xc1.a.f391693j;
        } else if (c()) {
            aVar = xc1.a.f391687d;
        } else {
            aVar = xc1.a.f391685b;
        }
        return new e0(aVar, this.f392630c);
    }
}
