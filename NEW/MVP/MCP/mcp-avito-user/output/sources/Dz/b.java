package DZ;

import com.avito.android.model_card.screen.ui.ModelCardArguments;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ModelCardContentRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<GZ.a> f3239a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3240b;

    public b(l lVar, Provider provider) {
        this.f3239a = provider;
        this.f3240b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(g.b(this.f3239a), (ModelCardArguments) this.f3240b.f393949a);
    }
}
