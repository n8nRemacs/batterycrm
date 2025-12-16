package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
/* loaded from: classes7.dex */
class Dd implements Ad {

    /* renamed from: a, reason: collision with root package name */
    private final Context f377967a;

    /* renamed from: b, reason: collision with root package name */
    private final C38987mn f377968b;

    @j.k0
    public Dd(Context context, @j.N C38987mn c38987mn) {
        this.f377967a = context;
        this.f377968b = c38987mn;
    }

    @Override // com.yandex.metrica.impl.ob.Ad
    @j.N
    public List<Bd> a() {
        ArrayList arrayList = new ArrayList();
        C38987mn c38987mn = this.f377968b;
        Context context = this.f377967a;
        PackageInfo packageInfoB = c38987mn.b(context, context.getPackageName(), 4096);
        if (packageInfoB == null) {
            return arrayList;
        }
        String[] strArr = packageInfoB.requestedPermissions;
        int[] iArr = packageInfoB.requestedPermissionsFlags;
        if (strArr == null) {
            return arrayList;
        }
        for (int i12 = 0; i12 < strArr.length; i12++) {
            String str = strArr[i12];
            if (iArr == null || iArr.length <= i12 || (iArr[i12] & 2) == 0) {
                arrayList.add(new Bd(str, false));
            } else {
                arrayList.add(new Bd(str, true));
            }
        }
        return arrayList;
    }
}
