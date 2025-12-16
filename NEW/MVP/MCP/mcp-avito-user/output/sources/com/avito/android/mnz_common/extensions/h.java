package com.avito.android.mnz_common.extensions;

import com.avito.android.deep_linking.K;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.A1;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RxExtensions.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mnz-common_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h {
    public static A1 a(Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof K) {
                arrayList.add(obj);
            }
        }
        return z.X(arrayList).T(g.f197971b, Integer.MAX_VALUE).C0(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b);
    }

    public static A1 b(z zVar) {
        return zVar.C0(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b);
    }
}
