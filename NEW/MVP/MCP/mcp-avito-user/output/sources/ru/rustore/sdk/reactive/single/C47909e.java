package ru.rustore.sdk.reactive.single;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SingleCreate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/single/e;", "T", "Lru/rustore/sdk/reactive/single/a;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* renamed from: ru.rustore.sdk.reactive.single.e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47909e<T> extends AbstractC47905a<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f436969b;

    /* JADX WARN: Multi-variable type inference failed */
    public C47909e(@Y61.k Y41.l<? super p<T>, G0> lVar) {
        this.f436969b = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // ru.rustore.sdk.reactive.single.AbstractC47905a
    public final void a(@Y61.k B<T> b12) {
        q qVar = new q(b12);
        b12.a(qVar);
        try {
            this.f436969b.invoke(qVar);
        } catch (Throwable th2) {
            qVar.a(th2);
        }
    }
}
