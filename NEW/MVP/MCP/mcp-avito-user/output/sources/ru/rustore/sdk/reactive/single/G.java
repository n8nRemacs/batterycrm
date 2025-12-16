package ru.rustore.sdk.reactive.single;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SingleSubscribeOn.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lru/rustore/sdk/reactive/single/G;", "T", "Lru/rustore/sdk/reactive/single/a;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
final class G<T> extends AbstractC47905a<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC47905a<T> f436953b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ru.rustore.sdk.reactive.core.a f436954c;

    /* compiled from: SingleSubscribeOn.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ G<T> f436955l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ B<T> f436956m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(G<T> g12, B<T> b12) {
            super(0);
            this.f436955l = g12;
            this.f436956m = b12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f436955l.f436953b.a(this.f436956m);
            return G0.f406611a;
        }
    }

    public G(@Y61.k AbstractC47905a<T> abstractC47905a, @Y61.k ru.rustore.sdk.reactive.core.a aVar) {
        this.f436953b = abstractC47905a;
        this.f436954c = aVar;
    }

    @Override // ru.rustore.sdk.reactive.single.AbstractC47905a
    public final void a(@Y61.k B<T> b12) {
        this.f436954c.a(new a(this, b12));
    }
}
