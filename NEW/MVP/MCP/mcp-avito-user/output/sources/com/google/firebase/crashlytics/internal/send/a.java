package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.google.android.datatransport.h;
import com.google.android.datatransport.runtime.v;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.g;
import com.google.firebase.crashlytics.internal.common.I;
import com.google.firebase.crashlytics.internal.common.W;
import com.google.firebase.crashlytics.internal.send.d.b;
import j.N;

/* compiled from: DataTransportCrashlyticsReportSender.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.firebase.crashlytics.internal.model.serialization.b f361428b = new com.google.firebase.crashlytics.internal.model.serialization.b();

    /* renamed from: c, reason: collision with root package name */
    public static final String f361429c = c("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* renamed from: d, reason: collision with root package name */
    public static final String f361430d = c("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* renamed from: e, reason: collision with root package name */
    public static final g f361431e = new g(2);

    /* renamed from: a, reason: collision with root package name */
    public final d f361432a;

    public a(d dVar, g gVar) {
        this.f361432a = dVar;
    }

    public static a a(Context context, com.google.firebase.crashlytics.internal.settings.g gVar, W w12) {
        v.b(context);
        h hVarC = v.a().c(new com.google.android.datatransport.cct.a(f361429c, f361430d));
        com.google.android.datatransport.c cVar = new com.google.android.datatransport.c("json");
        g gVar2 = f361431e;
        return new a(new d(hVarC.a("FIREBASE_CRASHLYTICS_REPORT", cVar, gVar2), gVar.a(), w12), gVar2);
    }

    public static String c(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i12 = 0; i12 < str.length(); i12++) {
            sb2.append(str.charAt(i12));
            if (str2.length() > i12) {
                sb2.append(str2.charAt(i12));
            }
        }
        return sb2.toString();
    }

    @N
    public final Task<I> b(@N I i12, boolean z12) {
        C37028k<I> c37028k;
        d dVar = this.f361432a;
        synchronized (dVar.f361444f) {
            try {
                c37028k = new C37028k<>();
                if (z12) {
                    dVar.f361447i.f360941a.getAndIncrement();
                    if (dVar.f361444f.size() < dVar.f361443e) {
                        com.google.firebase.crashlytics.internal.d dVar2 = com.google.firebase.crashlytics.internal.d.f361031a;
                        i12.getClass();
                        dVar2.a(3);
                        dVar.f361444f.size();
                        dVar2.a(3);
                        dVar.f361445g.execute(dVar.new b(i12, c37028k, null));
                        dVar2.a(3);
                        c37028k.d(i12);
                    } else {
                        dVar.a();
                        com.google.firebase.crashlytics.internal.d dVar3 = com.google.firebase.crashlytics.internal.d.f361031a;
                        i12.getClass();
                        dVar3.a(3);
                        dVar.f361447i.f360942b.getAndIncrement();
                        c37028k.d(i12);
                    }
                } else {
                    dVar.b(i12, c37028k);
                }
            } finally {
            }
        }
        return c37028k.f355672a;
    }
}
