package com.google.mlkit.vision.barcode.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.bl3;
import defpackage.cji;
import defpackage.cl3;
import defpackage.cwf;
import defpackage.ewf;
import defpackage.ho7;
import defpackage.nni;
import defpackage.o1a;
import defpackage.sj5;
import defpackage.tri;
import defpackage.vhi;
import defpackage.vt4;
import defpackage.zhi;
import java.util.List;

/* loaded from: classes.dex */
public class BarcodeRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        bl3 bl3VarB = cl3.b(tri.class);
        bl3VarB.a(vt4.a(o1a.class));
        bl3VarB.g = new cwf();
        cl3 cl3VarB = bl3VarB.b();
        bl3 bl3VarB2 = cl3.b(nni.class);
        bl3VarB2.a(vt4.a(tri.class));
        bl3VarB2.a(vt4.a(sj5.class));
        bl3VarB2.a(vt4.a(o1a.class));
        bl3VarB2.g = new ewf();
        cl3 cl3VarB2 = bl3VarB2.b();
        vhi vhiVar = zhi.b;
        Object[] objArr = {cl3VarB, cl3VarB2};
        for (int i = 0; i < 2; i++) {
            if (objArr[i] == null) {
                throw new NullPointerException(ho7.f(i, "at index "));
            }
        }
        return new cji(2, objArr);
    }
}
