package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import com.avito.android.analytics.statsd.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.C42829l0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: IacLogCleaner.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a.\u0012*\b\u0001\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u00000\u00052*\u0010\u0004\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/l0;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lkotlin/l0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30902i<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30908o f168007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f168008c;

    public C30902i(C30908o c30908o, long j12) {
        this.f168007b = c30908o;
        this.f168008c = j12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C42829l0 c42829l0 = (C42829l0) obj;
        Set set = (Set) c42829l0.f406871b;
        Set set2 = (Set) c42829l0.f406872c;
        Set set3 = (Set) c42829l0.f406873d;
        ArrayList arrayList = new ArrayList();
        for (T t12 : set) {
            if (((com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w) t12).f167937b <= this.f168008c) {
                arrayList.add(t12);
            }
        }
        Set setP0 = C42745f0.P0(arrayList);
        Set set4 = setP0;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(set4, 10));
        Iterator<T> it = set4.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w) it.next()).f167936a));
        }
        Set setP02 = C42745f0.P0(arrayList2);
        C30908o c30908o = this.f168007b;
        com.avito.android.iac_dialer_watcher.impl_module.logging.q qVar = c30908o.f168021c;
        qVar.f167891a.c(new y.a(qVar.f167892b.a("calls", "logs", "{{%app_ver%}}", "obsolescence").f91030a, setP02.size()));
        return c30908o.a("OBSOLESCENCE", setP02).r(new C30901h(set, setP0, set2, setP02, set3));
    }
}
