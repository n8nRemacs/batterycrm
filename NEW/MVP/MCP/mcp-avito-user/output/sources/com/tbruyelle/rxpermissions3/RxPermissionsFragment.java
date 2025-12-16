package com.tbruyelle.rxpermissions3;

import android.annotation.TargetApi;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import j.N;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class RxPermissionsFragment extends Fragment {

    /* renamed from: f0, reason: collision with root package name */
    public final HashMap f366507f0 = new HashMap();

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    @TargetApi(23)
    public final void onRequestPermissionsResult(int i12, @N String[] strArr, @N int[] iArr) {
        super.onRequestPermissionsResult(i12, strArr, iArr);
        if (i12 != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i13 = 0; i13 < strArr.length; i13++) {
            zArr[i13] = shouldShowRequestPermissionRationale(strArr[i13]);
        }
        int length = strArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            String str = strArr[i14];
            HashMap map = this.f366507f0;
            io.reactivex.rxjava3.subjects.e eVar = (io.reactivex.rxjava3.subjects.e) map.get(str);
            if (eVar == null) {
                return;
            }
            map.remove(strArr[i14]);
            eVar.onNext(new f(strArr[i14], iArr[i14] == 0, zArr[i14]));
            eVar.e();
        }
    }
}
