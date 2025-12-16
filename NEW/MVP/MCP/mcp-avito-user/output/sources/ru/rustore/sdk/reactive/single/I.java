package ru.rustore.sdk.reactive.single;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SingleTimeout.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/single/I;", "T", "Lru/rustore/sdk/reactive/single/a;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class I<T> extends AbstractC47905a<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f436957b = 0;

    /* compiled from: SingleTimeout.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"ru/rustore/sdk/reactive/single/I$a", "Lru/rustore/sdk/reactive/single/B;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a implements B<T>, ru.rustore.sdk.reactive.core.g {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f436958a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436959b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436960c = new AtomicReference<>(null);

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ I<T> f436961d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ B<T> f436962e;

        /* compiled from: SingleTimeout.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
        /* renamed from: ru.rustore.sdk.reactive.single.I$a$a, reason: collision with other inner class name */
        public static final class C12587a extends N implements Y41.a<G0> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ I<T> f436964m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12587a(I<T> i12) {
                super(0);
                this.f436964m = i12;
            }

            @Override // Y41.a
            public final G0 invoke() {
                a aVar = a.this;
                ru.rustore.sdk.reactive.core.g andSet = aVar.f436959b.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                int i12 = I.f436957b;
                this.f436964m.getClass();
                aVar.onError(new TimeoutException("No value after timeout 0 null"));
                return G0.f406611a;
            }
        }

        public a(I<T> i12, B<T> b12) {
            this.f436961d = i12;
            this.f436962e = b12;
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void a(ru.rustore.sdk.reactive.core.g gVar) {
            AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = this.f436959b;
            while (!atomicReference.compareAndSet(null, gVar) && atomicReference.get() == null) {
            }
            if (!this.f436958a.get()) {
                int i12 = I.f436957b;
                I<T> i13 = this.f436961d;
                i13.getClass();
                new C12587a(i13);
                throw null;
            }
            ru.rustore.sdk.reactive.core.g andSet = atomicReference.getAndSet(null);
            if (andSet != null) {
                andSet.dispose();
            }
            ru.rustore.sdk.reactive.core.g andSet2 = this.f436960c.getAndSet(null);
            if (andSet2 != null) {
                andSet2.dispose();
            }
            this.f436962e.a(this);
        }

        @Override // ru.rustore.sdk.reactive.core.g
        public final void dispose() {
            if (this.f436958a.compareAndSet(false, true)) {
                ru.rustore.sdk.reactive.core.g andSet = this.f436959b.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                ru.rustore.sdk.reactive.core.g andSet2 = this.f436960c.getAndSet(null);
                if (andSet2 != null) {
                    andSet2.dispose();
                }
            }
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void onError(Throwable th2) {
            if (this.f436958a.compareAndSet(false, true)) {
                ru.rustore.sdk.reactive.core.g andSet = this.f436960c.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                this.f436962e.onError(th2);
            }
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void onSuccess(T t12) {
            if (this.f436958a.compareAndSet(false, true)) {
                ru.rustore.sdk.reactive.core.g andSet = this.f436960c.getAndSet(null);
                if (andSet != null) {
                    andSet.dispose();
                }
                this.f436962e.onSuccess(t12);
            }
        }
    }

    @Override // ru.rustore.sdk.reactive.single.AbstractC47905a
    public final void a(@Y61.k B<T> b12) {
        new a(this, b12);
        throw null;
    }
}
