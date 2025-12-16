package com.avito.android.async_phone.public_module.loading_helper;

import Y41.l;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import l41.o;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AsyncPhoneRequestLoadingHelper.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/reactivex/rxjava3/core/z;", "", "handler", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lio/reactivex/rxjava3/core/z;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f92245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f92246c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H f92247d;

    /* JADX WARN: Multi-variable type inference failed */
    public f(a aVar, l<? super Throwable, ? extends z<?>> lVar, l<? super PhoneLoadingState, G0> lVar2) {
        this.f92245b = aVar;
        this.f92246c = (N) lVar;
        this.f92247d = (H) lVar2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.H] */
    @Override // l41.o
    public final Object apply(Object obj) {
        return ((z) obj).j0(this.f92245b.f92238a.e()).T(new e(this.f92246c, this.f92247d), Integer.MAX_VALUE);
    }
}
