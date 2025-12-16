package ru.rustore.sdk.reactive.single;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.N;

/* compiled from: SingleOnErrorReturn.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/single/C;", "T", "Lru/rustore/sdk/reactive/single/a;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class C<T> extends AbstractC47905a<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC47905a<T> f436943b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final N f436944c;

    /* compiled from: SingleOnErrorReturn.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"ru/rustore/sdk/reactive/single/C$a", "Lru/rustore/sdk/reactive/single/B;", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a implements B<T>, ru.rustore.sdk.reactive.core.g {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f436945a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436946b = new AtomicReference<>(null);

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B<T> f436947c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C<T> f436948d;

        public a(B<T> b12, C<T> c12) {
            this.f436947c = b12;
            this.f436948d = c12;
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void a(ru.rustore.sdk.reactive.core.g gVar) {
            this.f436947c.a(gVar);
        }

        @Override // ru.rustore.sdk.reactive.core.g
        public final void dispose() {
            ru.rustore.sdk.reactive.core.g andSet;
            if (!this.f436945a.compareAndSet(false, true) || (andSet = this.f436946b.getAndSet(null)) == null) {
                return;
            }
            andSet.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // ru.rustore.sdk.reactive.single.B
        public final void onError(Throwable th2) {
            Object bVar;
            if (this.f436945a.compareAndSet(false, true)) {
                try {
                    int i12 = Z.f406624c;
                    bVar = this.f436948d.f436944c.invoke(th2);
                } catch (Throwable th3) {
                    int i13 = Z.f406624c;
                    bVar = new Z.b(th3);
                }
                boolean z12 = bVar instanceof Z.b;
                B<T> b12 = this.f436947c;
                if (!z12) {
                    b12.onSuccess(bVar);
                }
                Throwable thB = Z.b(bVar);
                if (thB != null) {
                    b12.onError(thB);
                }
            }
        }

        @Override // ru.rustore.sdk.reactive.single.B
        public final void onSuccess(T t12) {
            if (this.f436945a.compareAndSet(false, true)) {
                this.f436947c.onSuccess(t12);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C(@Y61.k AbstractC47905a<T> abstractC47905a, @Y61.k Y41.l<? super Throwable, ? extends T> lVar) {
        this.f436943b = abstractC47905a;
        this.f436944c = (N) lVar;
    }

    @Override // ru.rustore.sdk.reactive.single.AbstractC47905a
    public final void a(@Y61.k B<T> b12) {
        this.f436943b.a(new a(b12, this));
    }
}
