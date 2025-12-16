package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import java.util.Set;
import kotlin.C42829l0;
import kotlin.Metadata;
import kotlin.collections.b1;

/* compiled from: IacLogCleaner.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0007\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u00002*\u0010\u0004\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/l0;", "", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/repository/w;", "", "<name for destructuring parameter 0>", "apply", "(Lkotlin/l0;)Lkotlin/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30900g<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w f168001b;

    public C30900g(com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar) {
        this.f168001b = wVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C42829l0 c42829l0 = (C42829l0) obj;
        Set set = (Set) c42829l0.f406871b;
        Set set2 = (Set) c42829l0.f406872c;
        Set set3 = (Set) c42829l0.f406873d;
        com.avito.android.iac_dialer_watcher.impl_module.logging.repository.w wVar = this.f168001b;
        return new C42829l0(b1.e(set, wVar), b1.e(set2, Long.valueOf(wVar.f167936a)), b1.e(set3, Long.valueOf(wVar.f167936a)));
    }
}
