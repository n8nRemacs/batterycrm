package ru.rustore.sdk.reactive.observable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.C42822w;

/* compiled from: ObservableDistinctUntilChangeBy.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lru/rustore/sdk/reactive/observable/b;", "T", "Lru/rustore/sdk/reactive/observable/K;", "Lru/rustore/sdk/reactive/core/g;", "a", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* renamed from: ru.rustore.sdk.reactive.observable.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47882b<T> implements K<T>, ru.rustore.sdk.reactive.core.g {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final Object f436918e;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f436919a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f436920b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AtomicReference<ru.rustore.sdk.reactive.core.g> f436921c = new AtomicReference<>(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public volatile Object f436922d = f436918e;

    /* compiled from: ObservableDistinctUntilChangeBy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/reactive/observable/b$a;", "", "<init>", "()V", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: ru.rustore.sdk.reactive.observable.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f436918e = new Object();
    }

    public C47882b(@Y61.k K k12) {
        this.f436919a = k12;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
    @Override // ru.rustore.sdk.reactive.observable.K
    public final void a(@Y61.k ru.rustore.sdk.reactive.core.g gVar) {
        ru.rustore.sdk.reactive.core.g andSet;
        AtomicReference<ru.rustore.sdk.reactive.core.g> atomicReference = this.f436921c;
        while (!atomicReference.compareAndSet(null, gVar) && atomicReference.get() == null) {
        }
        if (this.f436920b.get() && (andSet = atomicReference.getAndSet(null)) != null) {
            andSet.dispose();
        }
        this.f436919a.a(this);
    }

    @Override // ru.rustore.sdk.reactive.core.g
    public final void dispose() {
        ru.rustore.sdk.reactive.core.g andSet;
        if (!this.f436920b.compareAndSet(false, true) || (andSet = this.f436921c.getAndSet(null)) == null) {
            return;
        }
        andSet.dispose();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
    @Override // ru.rustore.sdk.reactive.observable.K
    public final void onComplete() {
        if (this.f436920b.compareAndSet(false, true)) {
            this.f436919a.onComplete();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
    @Override // ru.rustore.sdk.reactive.observable.K
    public final void onError(@Y61.k Throwable th2) {
        if (this.f436920b.compareAndSet(false, true)) {
            this.f436919a.onError(th2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, ru.rustore.sdk.reactive.observable.K] */
    @Override // ru.rustore.sdk.reactive.observable.K
    public final void onNext(T t12) {
        Object bVar;
        try {
            int i12 = Z.f406624c;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        if (!kotlin.jvm.internal.L.f(this.f436922d, f436918e)) {
            throw null;
        }
        this.f436922d = t12;
        bVar = true;
        if (!(bVar instanceof Z.b) && ((Boolean) bVar).booleanValue() && !this.f436920b.get()) {
            this.f436919a.onNext(t12);
        }
        Throwable thB = Z.b(bVar);
        if (thB == null || !this.f436920b.compareAndSet(false, true)) {
            return;
        }
        ru.rustore.sdk.reactive.core.g andSet = this.f436921c.getAndSet(null);
        if (andSet != null) {
            andSet.dispose();
        }
        this.f436919a.onError(thB);
    }
}
