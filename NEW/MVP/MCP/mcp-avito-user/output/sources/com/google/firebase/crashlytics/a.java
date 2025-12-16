package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.tasks.C37030m;
import com.google.firebase.analytics.connector.a;
import com.google.firebase.crashlytics.internal.common.C37579a;
import com.google.firebase.crashlytics.internal.common.C37583e;
import com.google.firebase.crashlytics.internal.common.C37586h;
import com.google.firebase.crashlytics.internal.common.E;
import com.google.firebase.crashlytics.internal.common.L;
import com.google.firebase.crashlytics.internal.common.O;
import com.google.firebase.crashlytics.internal.common.Q;
import com.google.firebase.installations.i;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import jZ0.C42336c;
import jZ0.C42337d;
import jZ0.C42338e;
import jZ0.InterfaceC42334a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kZ0.C42653c;
import kZ0.InterfaceC42651a;
import kZ0.InterfaceC42652b;
import lZ0.C43712b;
import mZ0.C44035b;
import wZ0.InterfaceC49583a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements InterfaceC49583a.InterfaceC12820a, InterfaceC42652b, InterfaceC42334a, com.google.firebase.components.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f360861b;

    public /* synthetic */ a(Object obj) {
        this.f360861b = obj;
    }

    @Override // com.google.firebase.components.f
    public Object a(com.google.firebase.components.c cVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        int i12;
        ((CrashlyticsRegistrar) this.f360861b).getClass();
        com.google.firebase.g gVar = (com.google.firebase.g) cVar.a(com.google.firebase.g.class);
        InterfaceC49583a interfaceC49583aG = cVar.g(com.google.firebase.crashlytics.internal.a.class);
        InterfaceC49583a interfaceC49583aG2 = cVar.g(com.google.firebase.analytics.connector.a.class);
        i iVar = (i) cVar.a(i.class);
        gVar.a();
        Context context = gVar.f361595a;
        String packageName = context.getPackageName();
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        dVar.a(4);
        C44035b c44035b = new C44035b(context);
        L l12 = new L(gVar);
        Q q12 = new Q(context, packageName, iVar, l12);
        com.google.firebase.crashlytics.internal.b bVar = new com.google.firebase.crashlytics.internal.b(interfaceC49583aG);
        b bVar2 = new b(interfaceC49583aG2);
        E e12 = new E(gVar, q12, bVar, l12, new a(bVar2), new a(bVar2), c44035b, O.a("Crashlytics Exception Handler"));
        gVar.a();
        String str = gVar.f361597c.f361725b;
        int iE2 = C37586h.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iE2 == 0) {
            iE2 = C37586h.e(context, "com.crashlytics.android.build_id", "string");
        }
        String string = iE2 != 0 ? context.getResources().getString(iE2) : null;
        ArrayList arrayList = new ArrayList();
        int iE3 = C37586h.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int iE4 = C37586h.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int iE5 = C37586h.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (iE3 == 0 || iE4 == 0 || iE5 == 0) {
            String.format("Could not find resources: %d %d %d", Integer.valueOf(iE3), Integer.valueOf(iE4), Integer.valueOf(iE5));
            i12 = 3;
            dVar.a(3);
        } else {
            String[] stringArray = context.getResources().getStringArray(iE3);
            String[] stringArray2 = context.getResources().getStringArray(iE4);
            String[] stringArray3 = context.getResources().getStringArray(iE5);
            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                for (int i13 = 0; i13 < stringArray3.length; i13++) {
                    arrayList.add(new C37583e(stringArray[i13], stringArray2[i13], stringArray3[i13]));
                }
            } else {
                String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                dVar.a(3);
            }
            i12 = 3;
        }
        dVar.a(i12);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((C37583e) it.next()).f360965a;
            dVar.a(i12);
        }
        com.google.firebase.crashlytics.internal.c cVar2 = new com.google.firebase.crashlytics.internal.c(context);
        try {
            String packageName2 = context.getPackageName();
            String strD = q12.d();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
            String string2 = Integer.toString(packageInfo.versionCode);
            String str3 = packageInfo.versionName;
            if (str3 == null) {
                str3 = "0.0";
            }
            C37579a c37579a = new C37579a(str, string, arrayList, strD, packageName2, string2, str3, cVar2);
            dVar.a(2);
            ExecutorService executorServiceA = O.a("com.google.firebase.crashlytics.startup");
            com.google.firebase.crashlytics.internal.settings.g gVarC = com.google.firebase.crashlytics.internal.settings.g.c(context, str, q12, new C43712b(), string2, str3, c44035b, l12);
            gVarC.e(executorServiceA).i(executorServiceA, new f());
            C37030m.c(new g(e12.g(c37579a, gVarC), e12, gVarC), executorServiceA);
            return new FirebaseCrashlytics(e12);
        } catch (PackageManager.NameNotFoundException unused) {
            dVar.b();
            return null;
        }
    }

    @Override // kZ0.InterfaceC42652b
    public void b(InterfaceC42651a interfaceC42651a) {
        b bVar = (b) this.f360861b;
        synchronized (bVar) {
            try {
                if (bVar.f360864c instanceof C42653c) {
                    bVar.f360865d.add(interfaceC42651a);
                }
                bVar.f360864c.b(interfaceC42651a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // jZ0.InterfaceC42334a
    public void c(Bundle bundle) {
        ((b) this.f360861b).f360863b.c(bundle);
    }

    @Override // wZ0.InterfaceC49583a.InterfaceC12820a
    public void d(wZ0.b bVar) {
        b bVar2 = (b) this.f360861b;
        bVar2.getClass();
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        dVar.a(3);
        com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) bVar.get();
        C42338e c42338e = new C42338e(aVar);
        d dVar2 = new d();
        a.InterfaceC10696a interfaceC10696aC = aVar.c("clx", dVar2);
        if (interfaceC10696aC == null) {
            dVar.a(3);
            interfaceC10696aC = aVar.c(CrashHianalyticsData.EVENT_ID_CRASH, dVar2);
            if (interfaceC10696aC != null) {
                dVar.a(5);
            }
        }
        if (interfaceC10696aC == null) {
            dVar.a(5);
            return;
        }
        dVar.a(3);
        C42337d c42337d = new C42337d();
        C42336c c42336c = new C42336c(c42338e, TimeUnit.MILLISECONDS);
        synchronized (bVar2) {
            try {
                Iterator it = bVar2.f360865d.iterator();
                while (it.hasNext()) {
                    c42337d.b((InterfaceC42651a) it.next());
                }
                dVar2.f360867b = c42337d;
                dVar2.f360866a = c42336c;
                bVar2.f360864c = c42337d;
                bVar2.f360863b = c42336c;
            } finally {
            }
        }
    }
}
