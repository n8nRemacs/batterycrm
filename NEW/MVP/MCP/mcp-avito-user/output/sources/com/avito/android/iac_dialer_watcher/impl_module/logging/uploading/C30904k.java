package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C42829l0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.s0;

/* compiled from: IacLogCleaner.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a.\u0012*\b\u0001\u0012&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u00000\u00052*\u0010\u0004\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/l0;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lkotlin/l0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30904k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30908o f168013b;

    public C30904k(C30908o c30908o) {
        this.f168013b = c30908o;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C42829l0 c42829l0 = (C42829l0) obj;
        Set set = (Set) c42829l0.f406871b;
        Set set2 = (Set) c42829l0.f406872c;
        Set set3 = (Set) c42829l0.f406873d;
        LinkedHashSet linkedHashSetH = b1.h(set2, set3);
        Set set4 = set;
        ArrayList arrayList = new ArrayList(C42745f0.q(set4, 10));
        Iterator<T> it = set4.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w) it.next()).f167936a));
        }
        Set setF = b1.f(linkedHashSetH, C42745f0.P0(arrayList));
        return this.f168013b.a("NO_SESSION", setF).r(new C30903j(set, set2, setF, set3));
    }
}
