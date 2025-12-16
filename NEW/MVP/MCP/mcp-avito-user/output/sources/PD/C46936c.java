package pD;

import Y61.k;
import com.avito.android.C34161r;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutotekaFeaturesModule_ProvideAutotekaFeaturesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LpD/c;", "Ldagger/internal/h;", "LpD/a;", "a", "_avito-discouraged_avito-feature_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pD.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C46936c implements h<C46934a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f428274b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<C34161r> f428275a;

    /* compiled from: AutotekaFeaturesModule_ProvideAutotekaFeaturesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpD/c$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pD.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C46936c(@k Provider<C34161r> provider) {
        this.f428275a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f428275a.get();
        f428274b.getClass();
        C46935b.f428273a.getClass();
        return (C46934a) c34161r.f246393a.b(C46934a.class);
    }
}
