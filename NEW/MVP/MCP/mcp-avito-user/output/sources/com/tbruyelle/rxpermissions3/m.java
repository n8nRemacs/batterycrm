package com.tbruyelle.rxpermissions3;

import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import io.reactivex.rxjava3.core.E;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import io.reactivex.rxjava3.internal.operators.observable.U;
import j.N;
import j.k0;

/* compiled from: RxPermissions.java */
/* loaded from: classes7.dex */
public class m {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f366518b = new Object();

    /* renamed from: a, reason: collision with root package name */
    @k0
    public final a<RxPermissionsFragment> f366519a;

    /* compiled from: RxPermissions.java */
    @FunctionalInterface
    public interface a<V> {
    }

    public m(@N Fragment fragment) {
        this.f366519a = new h(this, fragment.getChildFragmentManager());
    }

    public static z a(m mVar, z zVar, String[] strArr) {
        Object obj;
        E eC02;
        mVar.getClass();
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
        }
        int length = strArr.length;
        int i12 = 0;
        while (true) {
            obj = f366518b;
            if (i12 >= length) {
                eC02 = z.c0(obj);
                break;
            }
            if (!((h) mVar.f366519a).a().f366507f0.containsKey(strArr[i12])) {
                eC02 = U.f403867b;
                break;
            }
            i12++;
        }
        return (zVar == null ? z.c0(obj) : z.g0(zVar, eC02)).T(new l(mVar, strArr), Integer.MAX_VALUE);
    }

    public final boolean b(String str) {
        ActivityC22955m activityC22955mL1 = ((h) this.f366519a).a().l1();
        if (activityC22955mL1 != null) {
            return activityC22955mL1.checkSelfPermission(str) == 0;
        }
        throw new IllegalStateException("This fragment must be attached to an activity.");
    }

    public final z<Boolean> c(String... strArr) {
        return z.c0(f366518b).o(new i(this, strArr));
    }

    public final C41998x0 d(ActivityC22955m activityC22955m, String... strArr) {
        int length = strArr.length;
        boolean z12 = false;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                z12 = true;
                break;
            }
            String str = strArr[i12];
            if (!b(str) && !activityC22955m.shouldShowRequestPermissionRationale(str)) {
                break;
            }
            i12++;
        }
        return z.c0(Boolean.valueOf(z12));
    }
}
