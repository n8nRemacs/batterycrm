package ru.rustore.sdk.reactive.single;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import ru.rustore.sdk.metrics.internal.presentation.SendMetricsEventJobService;

/* compiled from: SingleDoOnDispose.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/single/h;", "T", "Lru/rustore/sdk/reactive/single/a;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* renamed from: ru.rustore.sdk.reactive.single.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47912h<T> extends AbstractC47905a<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC47905a<T> f436970b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SendMetricsEventJobService.c f436971c;

    /* compiled from: SingleDoOnDispose.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"ru/rustore/sdk/reactive/single/h$a", "Lru/rustore/sdk/reactive/single/B;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: ru.rustore.sdk.reactive.single.h$a */
    public static final class a implements B<T>, ru.rustore.sdk.reactive.core.g {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f436972a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436973b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B<T> f436974c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C47912h<T> f436975d;

        public a(B<T> b12, C47912h<T> c47912h) {
            this.f436974c = b12;
            this.f436975d = c47912h;
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void a(ru.rustore.sdk.reactive.core.g gVar) {
            ru.rustore.sdk.reactive.core.g andSet;
            AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = this.f436973b;
            while (!atomicReference.compareAndSet(null, gVar) && atomicReference.get() == null) {
            }
            if (this.f436972a.get() && (andSet = atomicReference.getAndSet(null)) != null) {
                andSet.dispose();
            }
            this.f436974c.a(this);
        }

        @Override // ru.rustore.sdk.reactive.core.g
        public final void dispose() {
            Object bVar;
            if (this.f436972a.compareAndSet(false, true)) {
                C47912h<T> c47912h = this.f436975d;
                try {
                    int i12 = Z.f406624c;
                    c47912h.f436971c.invoke();
                    bVar = G0.f406611a;
                } catch (Throwable th2) {
                    int i13 = Z.f406624c;
                    bVar = new Z.b(th2);
                }
                Throwable thB = Z.b(bVar);
                AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = this.f436973b;
                if (thB != null) {
                    ru.rustore.sdk.reactive.core.g andSet = atomicReference.getAndSet(null);
                    if (andSet != null) {
                        andSet.dispose();
                    }
                    this.f436974c.onError(thB);
                }
                if (bVar instanceof Z.b) {
                    return;
                }
                ru.rustore.sdk.reactive.core.g andSet2 = atomicReference.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            }
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void onError(Throwable th2) {
            if (this.f436972a.compareAndSet(false, true)) {
                this.f436974c.onError(th2);
            }
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void onSuccess(T t12) {
            if (this.f436972a.compareAndSet(false, true)) {
                this.f436974c.onSuccess(t12);
            }
        }
    }

    public C47912h(@Y61.k AbstractC47905a abstractC47905a, @Y61.k SendMetricsEventJobService.c cVar) {
        this.f436970b = abstractC47905a;
        this.f436971c = cVar;
    }

    @Override // ru.rustore.sdk.reactive.single.AbstractC47905a
    public final void a(@Y61.k B<T> b12) {
        this.f436970b.a(new a(b12, this));
    }
}
