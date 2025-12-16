package qN;

import com.avito.android.serp.adapter.C34820s;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import rN.C47569a;
import rN.C47573e;
import rN.C47574f;

/* compiled from: ImvSimilarAdvertsModule_ProvideImvSimilarAdvertItemListBlueprintFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LqN/k;", "Ldagger/internal/h;", "LrN/a;", "a", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<C47569a> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f429254c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<C34820s> f429255a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C47574f f429256b;

    /* compiled from: ImvSimilarAdvertsModule_ProvideImvSimilarAdvertItemListBlueprintFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqN/k$a;", "", "<init>", "()V", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k(@Y61.k Provider provider, @Y61.k C47574f c47574f) {
        this.f429255a = provider;
        this.f429256b = c47574f;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34820s c34820s = this.f429255a.get();
        C47573e c47573e = (C47573e) this.f429256b.get();
        f429254c.getClass();
        e.f429244a.getClass();
        return new C47569a(c34820s, c47573e);
    }
}
