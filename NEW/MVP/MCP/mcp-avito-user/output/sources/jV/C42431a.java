package jv;

import Y61.k;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RegistryUtil.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_deeplink-handler"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: jv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C42431a {
    @k
    public static final Bundle a(@k Bundle... bundleArr) {
        ArrayList arrayList = new ArrayList();
        int length = bundleArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            Bundle bundle = bundleArr[i12];
            Set<String> setKeySet = bundle != null ? bundle.keySet() : null;
            if (setKeySet == null) {
                setKeySet = B0.f406639b;
            }
            C42745f0.h(setKeySet, arrayList);
        }
        Bundle bundle2 = new Bundle(C42745f0.v(arrayList).size());
        for (Bundle bundle3 : bundleArr) {
            if (bundle3 == null) {
                bundle3 = new Bundle(0);
            }
            bundle2.putAll(bundle3);
        }
        return bundle2;
    }
}
