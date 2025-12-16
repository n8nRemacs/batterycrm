package B21;

import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.C38040w;
import dagger.internal.l;

/* compiled from: DivJoinedStateSwitcher_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f833a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f834b;

    public b(dagger.internal.f fVar, l lVar) {
        this.f833a = lVar;
        this.f834b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((C38029k) this.f833a.f393949a, (C38040w) this.f834b.get());
    }
}
