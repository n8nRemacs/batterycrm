package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.yandex.mobile.ads.impl.o9;
import com.yandex.mobile.ads.impl.p9;
import com.yandex.mobile.ads.impl.ts0;
import com.yandex.mobile.ads.impl.v9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C42756l;

/* loaded from: classes8.dex */
public final class n9 extends ts0 {

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f388191e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f388192f = 0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final ArrayList f388193d;

    public static final class a {
        @Y61.l
        public static n9 a() {
            if (n9.f388191e) {
                return new n9();
            }
            return null;
        }
    }

    static {
        f388191e = ts0.a.c() && Build.VERSION.SDK_INT >= 29;
    }

    public n9() {
        o9 o9VarA = o9.a.a();
        int i12 = v9.f390819g;
        ArrayList arrayListB = C42756l.B(new d61[]{o9VarA, new qp(v9.a.b())});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((d61) next).a()) {
                arrayList.add(next);
            }
        }
        this.f388193d = arrayList;
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    public final void a(@Y61.k SSLSocket sSLSocket, @Y61.l String str, @Y61.k List<? extends sv0> list) {
        Object next;
        Iterator it = this.f388193d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((d61) next).a(sSLSocket)) {
                    break;
                }
            }
        }
        d61 d61Var = (d61) next;
        if (d61Var != null) {
            d61Var.a(sSLSocket, str, list);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    @Y61.l
    public final String b(@Y61.k SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.f388193d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((d61) next).a(sSLSocket)) {
                break;
            }
        }
        d61 d61Var = (d61) next;
        if (d61Var != null) {
            return d61Var.b(sSLSocket);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    @SuppressLint({"NewApi"})
    public final boolean a(@Y61.k String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // com.yandex.mobile.ads.impl.ts0
    @Y61.k
    public final ji a(@Y61.k X509TrustManager x509TrustManager) {
        p9 p9VarA = p9.a.a(x509TrustManager);
        return p9VarA != null ? p9VarA : super.a(x509TrustManager);
    }
}
