package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.a6a;
import defpackage.aaj;
import defpackage.b6a;
import defpackage.bl3;
import defpackage.cl3;
import defpackage.f2j;
import defpackage.ho7;
import defpackage.n4j;
import defpackage.qha;
import defpackage.vt4;
import java.util.List;

/* loaded from: classes.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        bl3 bl3VarB = cl3.b(b6a.class);
        bl3VarB.a(new vt4(2, 0, a6a.class));
        bl3VarB.g = qha.H0;
        Object[] objArr = {bl3VarB.b()};
        for (int i = 0; i < 1; i++) {
            f2j f2jVar = n4j.b;
            if (objArr[i] == null) {
                throw new NullPointerException(ho7.f(i, "at index "));
            }
        }
        f2j f2jVar2 = n4j.b;
        return new aaj(1, objArr);
    }
}
