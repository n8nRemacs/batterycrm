package com.avito.android.payment.caching_interactor;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SealedResultCachingInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment/caching_interactor/d;", "", "T", "Lcom/avito/android/payment/caching_interactor/a;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d<T> implements a<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f213999a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final N f214000b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final N f214001c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public T f214002d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k InterfaceC35745a5 interfaceC35745a5, @l Kundle kundle, @k Y41.a<? extends z<TypedResult<T>>> aVar, @k p<? super T, ? super Kundle, G0> pVar, @k Y41.l<? super Kundle, ? extends T> lVar) {
        this.f213999a = interfaceC35745a5;
        this.f214000b = (N) aVar;
        this.f214001c = (N) pVar;
        this.f214002d = kundle != null ? lVar.invoke(kundle) : null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Y41.a, kotlin.jvm.internal.N] */
    @k
    public final z a(@k Set set) {
        T t12 = this.f214002d;
        return t12 != null ? z.c0(new P2.b(t12)) : ((z) this.f214000b.invoke()).x0(this.f213999a.a()).K(new b(this)).d0(c.f213998b).r0(P2.c.f318721a);
    }
}
