package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import java.util.List;
import kotlin.C42829l0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: IacLogCleaner.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "allSessionIdsFromLines", "Lkotlin/l0;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "apply", "(Ljava/util/List;)Lkotlin/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30897d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w> f167995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<Long> f167996c;

    public C30897d(List<com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w> list, List<Long> list2) {
        this.f167995b = list;
        this.f167996c = list2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new C42829l0(C42745f0.P0(this.f167995b), C42745f0.P0(this.f167996c), C42745f0.P0((List) obj));
    }
}
