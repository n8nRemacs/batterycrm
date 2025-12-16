package Sj;

import Rj.C15047a;
import Y61.k;
import com.avito.android.C34161r;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BottomNavigationFeaturesModule_ProvideBottomNavigationFeaturesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LSj/b;", "Ldagger/internal/h;", "LRj/a;", "a", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sj.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15192b implements h<C15047a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f15132b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C34161r> f15133a;

    /* compiled from: BottomNavigationFeaturesModule_ProvideBottomNavigationFeaturesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSj/b$a;", "", "<init>", "()V", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sj.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C15192b(@k Provider<C34161r> provider) {
        this.f15133a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f15133a.get();
        f15132b.getClass();
        C15191a.f15131a.getClass();
        return (C15047a) c34161r.f246393a.b(C15047a.class);
    }
}
