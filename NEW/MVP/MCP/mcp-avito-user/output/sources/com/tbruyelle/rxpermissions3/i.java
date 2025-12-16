package com.tbruyelle.rxpermissions3;

import io.reactivex.rxjava3.core.E;
import io.reactivex.rxjava3.core.F;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.U;
import java.util.Iterator;
import java.util.List;
import l41.o;

/* compiled from: RxPermissions.java */
/* loaded from: classes7.dex */
class i implements F<Object, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f366514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f366515c;

    /* compiled from: RxPermissions.java */
    public class a implements o<List<f>, E<Boolean>> {
        @Override // l41.o
        public final E<Boolean> apply(List<f> list) {
            List<f> list2 = list;
            if (list2.isEmpty()) {
                return U.f403867b;
            }
            Iterator<f> it = list2.iterator();
            while (it.hasNext()) {
                if (!it.next().f366509b) {
                    return z.c0(Boolean.FALSE);
                }
            }
            return z.c0(Boolean.TRUE);
        }
    }

    public i(m mVar, String[] strArr) {
        this.f366515c = mVar;
        this.f366514b = strArr;
    }

    @Override // io.reactivex.rxjava3.core.F
    public final E<Boolean> a(z<Object> zVar) {
        String[] strArr = this.f366514b;
        z zVarA = m.a(this.f366515c, zVar, strArr);
        int length = strArr.length;
        return zVarA.f(length, length).T(new a(), Integer.MAX_VALUE);
    }
}
