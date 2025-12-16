package ru.rustore.sdk.reactive.observable;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ObservableCombineLatest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u00012\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lru/rustore/sdk/reactive/observable/a;", "Lru/rustore/sdk/reactive/observable/K;", "Lkotlin/Q;", "", "", "Lru/rustore/sdk/reactive/core/g;", "a", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* renamed from: ru.rustore.sdk.reactive.observable.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47881a implements K<kotlin.Q<? extends Integer, ? extends Object>>, ru.rustore.sdk.reactive.core.g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Object f436917a = null;

    /* compiled from: ObservableCombineLatest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/reactive/observable/a$a;", "", "<init>", "()V", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: ru.rustore.sdk.reactive.observable.a$a, reason: collision with other inner class name */
    public static final class C12586a {
        public /* synthetic */ C12586a(C42822w c42822w) {
            this();
        }

        public C12586a() {
        }
    }

    static {
        new C12586a(null);
    }

    public C47881a() {
        throw null;
    }

    @Override // ru.rustore.sdk.reactive.observable.K
    public final void a(@Y61.k ru.rustore.sdk.reactive.core.g gVar) {
        new AtomicReference(gVar);
        throw null;
    }

    @Override // ru.rustore.sdk.reactive.core.g
    public final void dispose() {
        throw null;
    }

    @Override // ru.rustore.sdk.reactive.observable.K
    public final void onComplete() {
        throw null;
    }

    @Override // ru.rustore.sdk.reactive.observable.K
    public final void onError(@Y61.k Throwable th2) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.rustore.sdk.reactive.observable.K
    public final void onNext(kotlin.Q<? extends Integer, ? extends Object> q12) {
        kotlin.Q<? extends Integer, ? extends Object> q13 = q12;
        synchronized (this) {
            ((Number) q13.f406619b).intValue();
            throw null;
        }
    }
}
