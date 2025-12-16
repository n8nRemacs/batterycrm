package com.avito.android.favorite_apprater;

import com.avito.android.favorite.AbstractC30569c;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import l41.r;

/* compiled from: FavoriteAppRaterPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_apprater/h;", "Lcom/avito/android/favorite_apprater/g;", "_avito_favorite-apprater_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f155267a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite_apprater.b f155268b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f155269c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f155270d = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Object f155271e;

    /* compiled from: FavoriteAppRaterPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/favorite/c$a;", "it", "", "test", "(Lcom/avito/android/favorite/c$a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f155272b;

        public a(String str) {
            this.f155272b = str;
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return L.f(((AbstractC30569c.a) obj).f155167a, this.f155272b);
        }
    }

    /* compiled from: FavoriteAppRaterPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/favorite/c$a;", "it", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Lcom/avito/android/favorite/c$a;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return h.this.f155268b.a();
        }
    }

    /* compiled from: FavoriteAppRaterPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f155274b = new c<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((Boolean) obj).booleanValue();
        }
    }

    /* compiled from: FavoriteAppRaterPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f155275l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            V2.f318762a.a("DEFAULT_TAG", "Error on show dialog after add favorite", th2);
            return G0.f406611a;
        }
    }

    /* compiled from: FavoriteAppRaterPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<Boolean, G0> {
        public e() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [com.avito.android.favorite_apprater.k, java.lang.Object] */
        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            ?? r12 = h.this.f155271e;
            if (r12 != 0) {
                r12.n();
            }
            return G0.f406611a;
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.favorite.h hVar, @Y61.k com.avito.android.favorite_apprater.b bVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f155267a = hVar;
        this.f155268b = bVar;
        this.f155269c = interfaceC35745a5;
    }

    @Override // com.avito.android.favorite_apprater.g
    public final void a(@Y61.k k kVar) {
        this.f155271e = kVar;
    }

    @Override // com.avito.android.favorite_apprater.g
    public final void b(@Y61.k String str, boolean z12) {
        if (z12) {
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.f155270d;
        cVar.e();
        AbstractC41777j<AbstractC30569c> abstractC41777jC = this.f155267a.c();
        abstractC41777jC.getClass();
        cVar.b(A1.j(abstractC41777jC.b(io.reactivex.rxjava3.internal.functions.a.f(AbstractC30569c.a.class)).k(io.reactivex.rxjava3.internal.functions.a.b(AbstractC30569c.a.class)).b(new a(str)).x(1L).f(new b()).b(c.f155274b).m(this.f155269c.e()), d.f155275l, new e(), 2));
    }

    @Override // com.avito.android.favorite_apprater.g
    public final void e0() {
        this.f155270d.e();
        this.f155271e = null;
    }
}
