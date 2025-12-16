package com.avito.android.configuration;

import Y61.k;
import android.content.Context;
import android.os.Build;
import com.avito.android.util.AppStore;
import com.avito.android.util.C;
import com.avito.android.util.D;
import com.avito.android.util.InterfaceC35950u;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: AvitoBuildInfoImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/configuration/d;", "Lcom/avito/android/util/u;", "_avito-apps_shared_di"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class d implements InterfaceC35950u {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f125481a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f125482b = Build.MODEL;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f125483c = Build.MANUFACTURER;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f125484d = Build.VERSION.RELEASE;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f125485e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f125486f;

    /* renamed from: g, reason: collision with root package name */
    public final int f125487g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final AppStore f125488h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f125489i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f125490j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final D f125491k;

    /* renamed from: l, reason: collision with root package name */
    public final int f125492l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f125493m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final String f125494n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final String f125495o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final String f125496p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final String f125497q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final String f125498r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final InterfaceC42726C f125499s;

    /* compiled from: AvitoBuildInfoImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/util/C$b;", "invoke", "()Lcom/avito/android/util/C$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<C.b> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final C.b invoke() throws IOException {
            C.b.a aVar = C.b.f318562b;
            Context context = d.this.f125481a;
            aVar.getClass();
            Properties properties = new Properties();
            InputStream inputStreamOpen = context.getAssets().open("app-build-info.properties");
            try {
                properties.load(inputStreamOpen);
                G0 g02 = G0.f406611a;
                kotlin.io.c.a(inputStreamOpen, null);
                properties.getProperty("GIT_COMMIT");
                properties.getProperty("GIT_BRANCH");
                return new C.b(properties.getProperty("BUILD_NUMBER"));
            } finally {
            }
        }
    }

    public d(@k Context context, @k e eVar) {
        this.f125481a = context;
        this.f125485e = context.getPackageName();
        eVar.getClass();
        this.f125486f = "com.avito.android";
        this.f125487g = Build.VERSION.SDK_INT;
        this.f125488h = eVar.f125501a;
        this.f125489i = "673ea7523e1e54c9f4e00743e941916affd0d90f";
        this.f125490j = "ru";
        this.f125491k = new D(C43066x.q("releaseSelfUpdate", "release", false) ? "release" : "releaseSelfUpdate");
        this.f125492l = 3203;
        this.f125493m = "214.7";
        this.f125494n = "https://app.avito.ru/api";
        this.f125495o = "https://socket.avito.ru/socket";
        this.f125496p = "sessid";
        this.f125497q = "https://socket.avito.ru/images";
        this.f125498r = "local";
        this.f125499s = C42727D.c(new a());
    }

    @Override // com.avito.android.util.C
    @k
    /* renamed from: S, reason: from getter */
    public final String getF125482b() {
        return this.f125482b;
    }

    @Override // com.avito.android.util.C
    /* renamed from: a, reason: from getter */
    public final int getF125492l() {
        return this.f125492l;
    }

    @Override // com.avito.android.util.C
    @k
    /* renamed from: b, reason: from getter */
    public final String getF125493m() {
        return this.f125493m;
    }

    @Override // com.avito.android.util.InterfaceC35950u
    @k
    /* renamed from: c, reason: from getter */
    public final String getF125490j() {
        return this.f125490j;
    }

    @Override // com.avito.android.util.C
    @k
    public final C.b d() {
        return (C.b) this.f125499s.getValue();
    }

    @Override // com.avito.android.util.C
    @k
    /* renamed from: e, reason: from getter */
    public final String getF125483c() {
        return this.f125483c;
    }

    @Override // com.avito.android.util.InterfaceC35950u
    @k
    /* renamed from: f, reason: from getter */
    public final String getF125489i() {
        return this.f125489i;
    }

    @Override // com.avito.android.util.C
    public final boolean g() {
        if (!C43066x.h0(Build.FINGERPRINT, "generic", false)) {
            String str = Build.PRODUCT;
            if (!C43066x.q(str, "vbox", false) && !C43066x.q(str, "sdk_phone", false)) {
                String str2 = Build.HARDWARE;
                if (!C43066x.q(str2, "vbox", false) && !C43066x.q(str2, "goldfish", false) && !C43066x.q(str2, "ranchu", false)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.avito.android.util.C
    @k
    /* renamed from: getVersion, reason: from getter */
    public final String getF125484d() {
        return this.f125484d;
    }

    @Override // com.avito.android.util.InterfaceC35950u
    @k
    /* renamed from: h, reason: from getter */
    public final String getF125495o() {
        return this.f125495o;
    }

    @Override // com.avito.android.util.C
    @k
    /* renamed from: i, reason: from getter */
    public final String getF125498r() {
        return this.f125498r;
    }

    @Override // com.avito.android.util.C
    /* renamed from: j, reason: from getter */
    public final int getF125487g() {
        return this.f125487g;
    }

    @Override // com.avito.android.util.C
    @k
    /* renamed from: k, reason: from getter */
    public final String getF125494n() {
        return this.f125494n;
    }

    @Override // com.avito.android.util.C
    public final boolean l() {
        this.f125491k.getClass();
        return true;
    }

    @Override // com.avito.android.util.InterfaceC35950u
    @k
    /* renamed from: m, reason: from getter */
    public final String getF125496p() {
        return this.f125496p;
    }

    @Override // com.avito.android.util.C
    @k
    /* renamed from: n, reason: from getter */
    public final String getF125485e() {
        return this.f125485e;
    }

    @Override // com.avito.android.util.C
    @k
    /* renamed from: o, reason: from getter */
    public final D getF125491k() {
        return this.f125491k;
    }

    @Override // com.avito.android.util.InterfaceC35950u
    @k
    /* renamed from: p, reason: from getter */
    public final AppStore getF125488h() {
        return this.f125488h;
    }

    @Override // com.avito.android.util.InterfaceC35950u
    @k
    /* renamed from: q, reason: from getter */
    public final String getF125497q() {
        return this.f125497q;
    }

    @Override // com.avito.android.util.C
    @k
    /* renamed from: r, reason: from getter */
    public final String getF125486f() {
        return this.f125486f;
    }

    @Override // com.avito.android.util.C
    public final boolean s() {
        this.f125491k.getClass();
        return false;
    }
}
