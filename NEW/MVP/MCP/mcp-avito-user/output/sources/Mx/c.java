package MX;

import android.app.Activity;
import com.avito.android.bxcontent.BxContentIntentFactory;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MallRouterImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f10715a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<BxContentIntentFactory> f10716b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f10717c;

    public c(l lVar, Provider provider, Provider provider2) {
        this.f10715a = lVar;
        this.f10716b = provider;
        this.f10717c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Activity) this.f10715a.f393949a, this.f10716b.get(), this.f10717c.get());
    }
}
