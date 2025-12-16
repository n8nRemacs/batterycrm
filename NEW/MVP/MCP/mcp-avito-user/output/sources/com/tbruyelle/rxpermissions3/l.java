package com.tbruyelle.rxpermissions3;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC22955m;
import com.tbruyelle.rxpermissions3.m;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41957i0;
import io.reactivex.rxjava3.internal.operators.observable.C41991u;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.ArrayList;
import l41.o;

/* compiled from: RxPermissions.java */
/* loaded from: classes7.dex */
class l implements o<Object, z<f>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String[] f366516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f366517c;

    public l(m mVar, String[] strArr) {
        this.f366517c = mVar;
        this.f366516b = strArr;
    }

    @Override // l41.o
    public final z<f> apply(Object obj) {
        m mVar = this.f366517c;
        mVar.getClass();
        String[] strArr = this.f366516b;
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        int i12 = 0;
        while (true) {
            m.a<RxPermissionsFragment> aVar = mVar.f366519a;
            if (i12 >= length) {
                if (!arrayList2.isEmpty()) {
                    String[] strArr2 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    h hVar = (h) aVar;
                    RxPermissionsFragment rxPermissionsFragmentA = hVar.a();
                    TextUtils.join(", ", strArr2);
                    rxPermissionsFragmentA.getClass();
                    hVar.a().requestPermissions(strArr2, 42);
                }
                C41957i0 c41957i0X = z.X(arrayList);
                int i13 = AbstractC41777j.f401972b;
                io.reactivex.rxjava3.internal.functions.b.a(i13, "bufferSize");
                return new C41991u(c41957i0X, io.reactivex.rxjava3.internal.functions.a.f401991a, i13, ErrorMode.f404819b);
            }
            String str = strArr[i12];
            h hVar2 = (h) aVar;
            hVar2.a().getClass();
            if (mVar.b(str)) {
                arrayList.add(z.c0(new f(str, true, false)));
            } else {
                RxPermissionsFragment rxPermissionsFragmentA2 = hVar2.a();
                ActivityC22955m activityC22955mL1 = rxPermissionsFragmentA2.l1();
                if (activityC22955mL1 == null) {
                    throw new IllegalStateException("This fragment must be attached to an activity.");
                }
                if (activityC22955mL1.getPackageManager().isPermissionRevokedByPolicy(str, rxPermissionsFragmentA2.l1().getPackageName())) {
                    arrayList.add(z.c0(new f(str, false, false)));
                } else {
                    io.reactivex.rxjava3.subjects.e eVar = (io.reactivex.rxjava3.subjects.e) hVar2.a().f366507f0.get(str);
                    if (eVar == null) {
                        arrayList2.add(str);
                        eVar = new io.reactivex.rxjava3.subjects.e();
                        hVar2.a().f366507f0.put(str, eVar);
                    }
                    arrayList.add(eVar);
                }
            }
            i12++;
        }
    }
}
