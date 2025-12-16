package ru.rustore.sdk.reactive.backpressure.processor;

import Y61.k;
import Y61.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.rustore.sdk.reactive.core.g;
import ru.rustore.sdk.reactive.observable.K;
import tb1.C48644a;
import tb1.b;

/* compiled from: BufferEmitProcessor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/backpressure/processor/c;", "T", "Lru/rustore/sdk/reactive/core/g;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class c<T> implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final K<T> f436856a;

    /* renamed from: b, reason: collision with root package name */
    public final int f436857b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ru.rustore.sdk.reactive.core.a f436858c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f436859d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C48644a<T> f436860e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f436861f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f436862g;

    /* compiled from: BufferEmitProcessor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c<T> f436863l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c<T> cVar) {
            super(0);
            this.f436863l = cVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f436863l.d();
            return G0.f406611a;
        }
    }

    public c(@k K<T> k12, int i12, @l ru.rustore.sdk.reactive.core.a aVar) {
        this.f436856a = k12;
        this.f436857b = i12;
        this.f436858c = aVar;
        Object obj = new Object();
        this.f436859d = obj;
        this.f436860e = new C48644a<>(obj);
    }

    public final void a() {
        synchronized (this.f436859d) {
            if (this.f436861f) {
                return;
            }
            this.f436861f = true;
            this.f436860e.a(b.a.f439330a);
            G0 g02 = G0.f406611a;
        }
    }

    public final void b() {
        synchronized (this.f436859d) {
            if (this.f436862g) {
                return;
            }
            this.f436862g = true;
            G0 g02 = G0.f406611a;
            ru.rustore.sdk.reactive.core.a aVar = this.f436858c;
            if (aVar != null) {
                aVar.a(new a(this));
            } else {
                d();
            }
        }
    }

    public final void c(@k Throwable th2) {
        synchronized (this.f436859d) {
            if (this.f436861f) {
                return;
            }
            this.f436861f = true;
            C48644a<T> c48644a = this.f436860e;
            synchronized (c48644a.f439328a) {
                c48644a.f439329b.clear();
                G0 g02 = G0.f406611a;
            }
            this.f436860e.a(new b.C12675b(th2));
        }
    }

    public final void d() {
        tb1.b bVarB;
        while (true) {
            synchronized (this.f436859d) {
                bVarB = this.f436860e.b();
                if (bVarB == null) {
                    this.f436862g = false;
                    return;
                }
            }
            if (bVarB instanceof b.c) {
                this.f436856a.onNext(((b.c) bVarB).f439332a);
            } else if (bVarB instanceof b.C12675b) {
                this.f436856a.onError(((b.C12675b) bVarB).f439331a);
            } else if (bVarB.equals(b.a.f439330a)) {
                this.f436856a.onComplete();
            }
        }
    }

    @Override // ru.rustore.sdk.reactive.core.g
    public final void dispose() {
        synchronized (this.f436859d) {
            this.f436861f = true;
            C48644a<T> c48644a = this.f436860e;
            synchronized (c48644a.f439328a) {
                c48644a.f439329b.clear();
                G0 g02 = G0.f406611a;
            }
        }
    }

    public abstract void e(@k C48644a<T> c48644a, @k b.c<T> cVar);
}
