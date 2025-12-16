package ru.rustore.sdk.reactive.subject;

import Y61.k;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.C42754k;
import kotlin.jvm.internal.C42822w;
import ru.rustore.sdk.reactive.observable.AbstractC47883c;
import ru.rustore.sdk.reactive.observable.K;

/* compiled from: MutableSubject.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/rustore/sdk/reactive/subject/b;", "T", "Lru/rustore/sdk/reactive/subject/g;", "a", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b<T> implements g<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f437004a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CopyOnWriteArraySet<ru.rustore.sdk.reactive.backpressure.processor.c<T>> f437005b;

    /* compiled from: MutableSubject.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/reactive/subject/b$a;", "Lru/rustore/sdk/reactive/observable/c;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public final class a extends AbstractC47883c<T> {

        /* compiled from: MutableSubject.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ru/rustore/sdk/reactive/subject/b$a$a", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        /* renamed from: ru.rustore.sdk.reactive.subject.b$a$a, reason: collision with other inner class name */
        public static final class C12590a implements ru.rustore.sdk.reactive.core.g {

            /* renamed from: a, reason: collision with root package name */
            public final AtomicBoolean f437006a = new AtomicBoolean();

            /* renamed from: b, reason: collision with root package name */
            public final AtomicReference<ru.rustore.sdk.reactive.backpressure.processor.c<T>> f437007b = new AtomicReference<>(null);

            @Override // ru.rustore.sdk.reactive.core.g
            public final void dispose() {
                ru.rustore.sdk.reactive.backpressure.processor.c<T> andSet;
                if (!this.f437006a.compareAndSet(false, true) || (andSet = this.f437007b.getAndSet(null)) == null) {
                    return;
                }
                andSet.dispose();
                throw null;
            }
        }

        @Override // ru.rustore.sdk.reactive.observable.AbstractC47883c
        public final void a(@k K<T> k12) {
            k12.a(new C12590a());
            throw null;
        }
    }

    public b() {
        this(0, 0, 3, null);
    }

    public b(int i12, int i13, int i14, C42822w c42822w) {
        i13 = (i14 & 2) != 0 ? 128 : i13;
        new C42754k();
        this.f437005b = new CopyOnWriteArraySet<>();
        new ru.rustore.sdk.reactive.backpressure.processor.b(new c(this), i13, null, 4, null);
    }
}
