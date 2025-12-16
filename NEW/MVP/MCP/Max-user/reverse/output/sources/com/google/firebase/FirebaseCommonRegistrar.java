package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bl3;
import defpackage.cl3;
import defpackage.cr4;
import defpackage.dm4;
import defpackage.fsc;
import defpackage.h06;
import defpackage.na0;
import defpackage.o08;
import defpackage.os5;
import defpackage.ppi;
import defpackage.tm4;
import defpackage.v17;
import defpackage.vm4;
import defpackage.vt4;
import defpackage.w17;
import defpackage.x17;
import defpackage.ze0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        bl3 bl3VarB = cl3.b(cr4.class);
        bl3VarB.a(new vt4(2, 0, na0.class));
        bl3VarB.g = new dm4(9);
        arrayList.add(bl3VarB.b());
        fsc fscVar = new fsc(ze0.class, Executor.class);
        bl3 bl3Var = new bl3(vm4.class, new Class[]{w17.class, x17.class});
        bl3Var.a(vt4.a(Context.class));
        bl3Var.a(vt4.a(h06.class));
        bl3Var.a(new vt4(2, 0, v17.class));
        bl3Var.a(new vt4(1, 1, cr4.class));
        bl3Var.a(new vt4(fscVar, 1, 0));
        bl3Var.g = new tm4(fscVar, 0);
        arrayList.add(bl3Var.b());
        arrayList.add(ppi.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(ppi.a("fire-core", "21.0.0"));
        arrayList.add(ppi.a("device-name", a(Build.PRODUCT)));
        arrayList.add(ppi.a("device-model", a(Build.DEVICE)));
        arrayList.add(ppi.a("device-brand", a(Build.BRAND)));
        arrayList.add(ppi.c("android-target-sdk", new os5(4)));
        arrayList.add(ppi.c("android-min-sdk", new os5(5)));
        arrayList.add(ppi.c("android-platform", new os5(6)));
        arrayList.add(ppi.c("android-installer", new os5(7)));
        try {
            o08.b.getClass();
            str = "2.0.0";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(ppi.a("kotlin", str));
        }
        return arrayList;
    }
}
