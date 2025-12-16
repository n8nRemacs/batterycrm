package com.avito.android.iac_avcalls.impl_module.platform_v1;

import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import l41.o;

/* compiled from: AvCallsPlatformImplV1.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lkotlin/G0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lkotlin/G0;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GJ.a f164600b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I<T> f164601c;

    public e(GJ.a aVar, I<T> i12) {
        this.f164600b = aVar;
        this.f164601c = i12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        GJ.a aVar = this.f164600b;
        aVar.getClass();
        aVar.f6440a = System.currentTimeMillis();
        return this.f164601c;
    }
}
