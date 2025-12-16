package com.avito.android.async_phone.public_module.loading_helper;

import Y41.l;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.O;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import l41.o;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AsyncPhoneRequestLoadingHelper.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/E;", "", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f92243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f92244c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(l<? super Throwable, ? extends z<?>> lVar, l<? super PhoneLoadingState, G0> lVar2) {
        this.f92243b = (N) lVar;
        this.f92244c = (H) lVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, kotlin.jvm.internal.H] */
    @Override // l41.o
    public final Object apply(Object obj) {
        z zVar = (z) this.f92243b.invoke((Throwable) obj);
        O oK2 = zVar != null ? zVar.K(new d(this.f92244c)) : null;
        return oK2 == null ? U.f403867b : oK2;
    }
}
