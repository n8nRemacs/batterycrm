package JK0;

import JK0.e;
import dagger.internal.p;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: FormatterRuleFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final p f8880a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<e.a> f8881b;

    public g(p pVar, Provider provider) {
        this.f8880a = pVar;
        this.f8881b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Map) this.f8880a.get(), this.f8881b.get());
    }
}
