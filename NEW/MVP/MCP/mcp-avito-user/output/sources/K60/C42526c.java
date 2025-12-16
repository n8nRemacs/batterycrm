package k60;

import Y61.k;
import com.avito.android.C34161r;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PassportFeaturesModule_ProvidePassportFeaturesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lk60/c;", "Ldagger/internal/h;", "Lk60/a;", "a", "_avito_passport-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k60.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C42526c implements h<C42524a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f406103b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C34161r> f406104a;

    /* compiled from: PassportFeaturesModule_ProvidePassportFeaturesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk60/c$a;", "", "<init>", "()V", "_avito_passport-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: k60.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C42526c(@k Provider<C34161r> provider) {
        this.f406104a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f406104a.get();
        f406103b.getClass();
        C42525b.f406102a.getClass();
        return (C42524a) c34161r.f246393a.b(C42524a.class);
    }
}
