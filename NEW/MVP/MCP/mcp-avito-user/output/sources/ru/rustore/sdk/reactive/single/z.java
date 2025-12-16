package ru.rustore.sdk.reactive.single;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SingleObserveOn.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/single/z;", "T", "Lru/rustore/sdk/reactive/single/a;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class z<T> extends AbstractC47905a<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f436991b = 0;

    /* compiled from: SingleObserveOn.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"ru/rustore/sdk/reactive/single/z$a", "Lru/rustore/sdk/reactive/single/B;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a implements B<T>, ru.rustore.sdk.reactive.core.g {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f436992a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436993b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z<T> f436994c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ B<T> f436995d;

        /* compiled from: SingleObserveOn.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
        /* renamed from: ru.rustore.sdk.reactive.single.z$a$a, reason: collision with other inner class name */
        public static final class C12589a extends N implements Y41.a<G0> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ B<T> f436997m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Throwable f436998n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12589a(B<T> b12, Throwable th2) {
                super(0);
                this.f436997m = b12;
                this.f436998n = th2;
            }

            @Override // Y41.a
            public final G0 invoke() {
                if (a.this.f436992a.compareAndSet(false, true)) {
                    this.f436997m.onError(this.f436998n);
                }
                return G0.f406611a;
            }
        }

        /* compiled from: SingleObserveOn.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
        public static final class b extends N implements Y41.a<G0> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ B<T> f437000m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(B<T> b12) {
                super(0);
                this.f437000m = b12;
            }

            @Override // Y41.a
            public final G0 invoke() {
                a aVar = a.this;
                if (!aVar.f436992a.get()) {
                    this.f437000m.a(aVar);
                }
                return G0.f406611a;
            }
        }

        /* compiled from: SingleObserveOn.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
        public static final class c extends N implements Y41.a<G0> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ B<T> f437002m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ T f437003n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(B<T> b12, T t12) {
                super(0);
                this.f437002m = b12;
                this.f437003n = t12;
            }

            @Override // Y41.a
            public final G0 invoke() {
                if (a.this.f436992a.compareAndSet(false, true)) {
                    this.f437002m.onSuccess(this.f437003n);
                }
                return G0.f406611a;
            }
        }

        public a(z<T> zVar, B<T> b12) {
            this.f436994c = zVar;
            this.f436995d = b12;
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void a(ru.rustore.sdk.reactive.core.g gVar) {
            ru.rustore.sdk.reactive.core.g andSet;
            AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = this.f436993b;
            while (!atomicReference.compareAndSet(null, gVar) && atomicReference.get() == null) {
            }
            if (this.f436992a.get() && (andSet = atomicReference.getAndSet(null)) != null) {
                andSet.dispose();
            }
            int i12 = z.f436991b;
            this.f436994c.getClass();
            new b(this.f436995d);
            throw null;
        }

        @Override // ru.rustore.sdk.reactive.core.g
        public final void dispose() {
            ru.rustore.sdk.reactive.core.g andSet;
            if (!this.f436992a.compareAndSet(false, true) || (andSet = this.f436993b.getAndSet(null)) == null) {
                return;
            }
            andSet.dispose();
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void onError(Throwable th2) {
            int i12 = z.f436991b;
            this.f436994c.getClass();
            new C12589a(this.f436995d, th2);
            throw null;
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void onSuccess(T t12) {
            int i12 = z.f436991b;
            this.f436994c.getClass();
            new c(this.f436995d, t12);
            throw null;
        }
    }

    @Override // ru.rustore.sdk.reactive.single.AbstractC47905a
    public final void a(@Y61.k B<T> b12) {
        new a(this, b12);
        throw null;
    }
}
