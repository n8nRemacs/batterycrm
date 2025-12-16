package com.tbruyelle.rxpermissions3;

import io.reactivex.rxjava3.core.E;
import io.reactivex.rxjava3.core.F;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.U;
import java.util.List;
import l41.o;

/* compiled from: RxPermissions.java */
/* loaded from: classes7.dex */
class k implements F<Object, f> {

    /* compiled from: RxPermissions.java */
    public class a implements o<List<f>, E<f>> {
        @Override // l41.o
        public final E<f> apply(List<f> list) {
            List<f> list2 = list;
            return list2.isEmpty() ? U.f403867b : z.c0(new f(list2));
        }
    }

    @Override // io.reactivex.rxjava3.core.F
    public final E<f> a(z<Object> zVar) {
        m.a(null, zVar, null);
        throw null;
    }
}
