package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.bl3;
import defpackage.cl3;
import defpackage.dcf;
import defpackage.dwf;
import defpackage.ia3;
import defpackage.iwf;
import defpackage.jmf;
import defpackage.kc3;
import defpackage.lui;
import defpackage.mni;
import defpackage.nwf;
import defpackage.o1a;
import defpackage.osf;
import defpackage.p1a;
import defpackage.sci;
import defpackage.sdi;
import defpackage.sj5;
import defpackage.sve;
import defpackage.syf;
import defpackage.tkd;
import defpackage.tlf;
import defpackage.ukd;
import defpackage.v1a;
import defpackage.vt4;
import defpackage.zci;
import java.util.List;

/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        cl3 cl3Var = sve.b;
        bl3 bl3VarB = cl3.b(v1a.class);
        bl3VarB.a(vt4.a(o1a.class));
        bl3VarB.g = new tlf();
        cl3 cl3VarB = bl3VarB.b();
        bl3 bl3VarB2 = cl3.b(p1a.class);
        bl3VarB2.g = new jmf(3);
        cl3 cl3VarB2 = bl3VarB2.b();
        bl3 bl3VarB3 = cl3.b(ukd.class);
        bl3VarB3.a(new vt4(2, 0, tkd.class));
        bl3VarB3.g = new osf();
        cl3 cl3VarB3 = bl3VarB3.b();
        bl3 bl3VarB4 = cl3.b(sj5.class);
        bl3VarB4.a(new vt4(1, 1, p1a.class));
        bl3VarB4.g = new dwf();
        cl3 cl3VarB4 = bl3VarB4.b();
        bl3 bl3VarB5 = cl3.b(ia3.class);
        bl3VarB5.g = new iwf();
        cl3 cl3VarB5 = bl3VarB5.b();
        bl3 bl3VarB6 = cl3.b(kc3.class);
        bl3VarB6.a(vt4.a(ia3.class));
        bl3VarB6.g = new nwf();
        cl3 cl3VarB6 = bl3VarB6.b();
        bl3 bl3VarB7 = cl3.b(mni.class);
        bl3VarB7.a(vt4.a(o1a.class));
        bl3VarB7.g = new syf();
        cl3 cl3VarB7 = bl3VarB7.b();
        bl3 bl3VarB8 = cl3.b(tkd.class);
        bl3VarB8.c = 1;
        bl3VarB8.a(new vt4(1, 1, mni.class));
        bl3VarB8.g = new dcf(4);
        cl3 cl3VarB8 = bl3VarB8.b();
        sci sciVar = zci.b;
        Object[] objArr = {cl3Var, cl3VarB, cl3VarB2, cl3VarB3, cl3VarB4, cl3VarB5, cl3VarB6, cl3VarB7, cl3VarB8};
        lui.c(9, objArr);
        return new sdi(9, objArr);
    }
}
