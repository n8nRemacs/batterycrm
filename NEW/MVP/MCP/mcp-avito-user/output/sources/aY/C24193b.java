package ay;

import Y61.k;
import Zx.C19616a;
import com.avito.android.C34161r;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EasyMoneyFeaturesModule_ProvideEasyMoneyFeaturesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lay/b;", "Ldagger/internal/h;", "LZx/a;", "a", "_avito_easy-money-features_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ay.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C24193b implements h<C19616a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f56803b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C34161r> f56804a;

    /* compiled from: EasyMoneyFeaturesModule_ProvideEasyMoneyFeaturesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lay/b$a;", "", "<init>", "()V", "_avito_easy-money-features_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ay.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C24193b(@k Provider<C34161r> provider) {
        this.f56804a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f56804a.get();
        f56803b.getClass();
        C24192a.f56802a.getClass();
        return (C19616a) c34161r.f246393a.b(C19616a.class);
    }
}
