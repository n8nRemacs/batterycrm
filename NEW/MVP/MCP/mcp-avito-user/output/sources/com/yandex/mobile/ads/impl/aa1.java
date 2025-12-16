package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.rg;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class aa1 implements rg {

    /* renamed from: c, reason: collision with root package name */
    public static final rg.a<aa1> f383450c = new L0(5);

    /* renamed from: a, reason: collision with root package name */
    public final v91 f383451a;

    /* renamed from: b, reason: collision with root package name */
    public final com.yandex.mobile.ads.embedded.guava.collect.p<Integer> f383452b;

    public aa1(v91 v91Var, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= v91Var.f390831a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f383451a = v91Var;
        this.f383452b = com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static aa1 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        v91 v91Var = (v91) v91.f390830f.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        intArray.getClass();
        return new aa1(v91Var, c80.a(intArray));
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aa1.class != obj.getClass()) {
            return false;
        }
        aa1 aa1Var = (aa1) obj;
        return this.f383451a.equals(aa1Var.f383451a) && this.f383452b.equals(aa1Var.f383452b);
    }

    public final int hashCode() {
        return (this.f383452b.hashCode() * 31) + this.f383451a.hashCode();
    }
}
