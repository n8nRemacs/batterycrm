package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import java.util.Set;
import kotlin.C42829l0;
import kotlin.Metadata;
import kotlin.collections.b1;

/* compiled from: IacLogCleaner.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0010\b\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/G0;", "it", "Lkotlin/l0;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "", "apply", "(Lkotlin/G0;)Lkotlin/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30903j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set<com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w> f168009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set<Long> f168010c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Set<Long> f168011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Set<Long> f168012e;

    public C30903j(Set<com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w> set, Set<Long> set2, Set<Long> set3, Set<Long> set4) {
        this.f168009b = set;
        this.f168010c = set2;
        this.f168011d = set3;
        this.f168012e = set4;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Set<Long> set = this.f168011d;
        return new C42829l0(this.f168009b, b1.f(this.f168010c, set), b1.f(this.f168012e, set));
    }
}
