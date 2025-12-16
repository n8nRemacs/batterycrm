package com.avito.android.iac_dialer_watcher.impl_module.logging.uploading;

import kotlin.Metadata;

/* compiled from: IacLogCleaner.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "sessionIdToDelete", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(J)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.iac_dialer_watcher.impl_module.logging.uploading.n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C30907n<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30908o f168017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f168018c;

    public C30907n(C30908o c30908o, String str) {
        this.f168017b = c30908o;
        this.f168018c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        return this.f168017b.f168019a.a(jLongValue).r(new C30906m(jLongValue, this.f168018c));
    }
}
