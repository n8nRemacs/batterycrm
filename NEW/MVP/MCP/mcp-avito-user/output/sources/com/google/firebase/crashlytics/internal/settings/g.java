package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import androidx.appcompat.app.r;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.C37030m;
import com.google.android.gms.tasks.P;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.C37586h;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.L;
import com.google.firebase.crashlytics.internal.common.Q;
import com.google.firebase.crashlytics.internal.common.a0;
import com.google.firebase.crashlytics.internal.common.d0;
import com.google.firebase.crashlytics.internal.common.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import lZ0.C43712b;
import mZ0.C44035b;
import org.json.JSONObject;

/* compiled from: SettingsController.java */
/* loaded from: classes4.dex */
public class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f361470a;

    /* renamed from: b, reason: collision with root package name */
    public final l f361471b;

    /* renamed from: c, reason: collision with root package name */
    public final i f361472c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f361473d;

    /* renamed from: e, reason: collision with root package name */
    public final a f361474e;

    /* renamed from: f, reason: collision with root package name */
    public final c f361475f;

    /* renamed from: g, reason: collision with root package name */
    public final L f361476g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference<d> f361477h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference<C37028k<d>> f361478i;

    public g(Context context, l lVar, a0 a0Var, i iVar, a aVar, c cVar, L l12) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f361477h = atomicReference;
        this.f361478i = new AtomicReference<>(new C37028k());
        this.f361470a = context;
        this.f361471b = lVar;
        this.f361473d = a0Var;
        this.f361472c = iVar;
        this.f361474e = aVar;
        this.f361475f = cVar;
        this.f361476g = l12;
        atomicReference.set(b.b(a0Var));
    }

    public static g c(Context context, String str, Q q12, C43712b c43712b, String str2, String str3, C44035b c44035b, L l12) throws Resources.NotFoundException {
        String str4;
        String str5;
        String string;
        String strD = q12.d();
        a0 a0Var = new a0();
        i iVar = new i(a0Var);
        a aVar = new a(c44035b);
        Locale locale = Locale.US;
        c cVar = new c(AK.c.k("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str, "/settings"), c43712b);
        String str6 = Build.MANUFACTURER;
        String str7 = Q.f360933h;
        String strR = r.r(str6.replaceAll(str7, ""), "/", Build.MODEL.replaceAll(str7, ""));
        String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str7, "");
        String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str7, "");
        int iE2 = C37586h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iE2 == 0) {
            iE2 = C37586h.e(context, "com.crashlytics.android.build_id", "string");
        }
        if (iE2 != 0) {
            string = context.getResources().getString(iE2);
            str4 = str2;
            str5 = str3;
        } else {
            str4 = str2;
            str5 = str3;
            string = null;
        }
        String[] strArr = {string, str, str5, str4};
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < 4; i12++) {
            String str8 = strArr[i12];
            if (str8 != null) {
                arrayList.add(str8.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
        }
        String string2 = sb2.toString();
        return new g(context, new l(str, strR, strReplaceAll, strReplaceAll2, q12, string2.length() > 0 ? C37586h.j(string2) : null, str3, str2, (strD != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).f360887b), a0Var, iVar, aVar, cVar, l12);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.k
    public final d a() {
        return this.f361477h.get();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.k
    public final Task<d> b() {
        return this.f361478i.get().f355672a;
    }

    public final d d(e eVar) throws Throwable {
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        d dVar2 = null;
        try {
            if (!e.f361466c.equals(eVar)) {
                JSONObject jSONObjectA = this.f361474e.a();
                if (jSONObjectA != null) {
                    d dVarA = this.f361472c.a(jSONObjectA);
                    jSONObjectA.toString();
                    dVar.a(3);
                    this.f361473d.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (e.f361467d.equals(eVar) || dVarA.f361457c >= jCurrentTimeMillis) {
                        try {
                            dVar.a(2);
                            dVar2 = dVarA;
                        } catch (Exception unused) {
                            dVar2 = dVarA;
                            dVar.b();
                            return dVar2;
                        }
                    } else {
                        dVar.a(2);
                    }
                } else {
                    dVar.a(3);
                }
            }
        } catch (Exception unused2) {
        }
        return dVar2;
    }

    public final Task e(ExecutorService executorService) throws Throwable {
        P p12;
        d dVarD;
        e eVar = e.f361465b;
        boolean zEquals = this.f361470a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(this.f361471b.f361485f);
        AtomicReference<C37028k<d>> atomicReference = this.f361478i;
        AtomicReference<d> atomicReference2 = this.f361477h;
        if (zEquals && (dVarD = d(eVar)) != null) {
            atomicReference2.set(dVarD);
            atomicReference.get().d(dVarD);
            return C37030m.f(null);
        }
        d dVarD2 = d(e.f361467d);
        if (dVarD2 != null) {
            atomicReference2.set(dVarD2);
            atomicReference.get().d(dVarD2);
        }
        L l12 = this.f361476g;
        P p13 = l12.f360923g.f355672a;
        synchronized (l12.f360919c) {
            p12 = l12.f360920d.f355672a;
        }
        ExecutorService executorService2 = e0.f360968a;
        C37028k c37028k = new C37028k();
        d0 d0Var = new d0(2, c37028k);
        p13.i(executorService, d0Var);
        p12.i(executorService, d0Var);
        return c37028k.f355672a.t(executorService, new f(this));
    }
}
