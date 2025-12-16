package B21;

import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.C38040w;
import dagger.internal.l;

/* compiled from: DivMultipleStateSwitcher_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f837a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f838b;

    public d(dagger.internal.f fVar, l lVar) {
        this.f837a = lVar;
        this.f838b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((C38029k) this.f837a.f393949a, (C38040w) this.f838b.get());
    }
}
