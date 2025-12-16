package Il;

import Oi0.C14701e;
import com.avito.android.visual_rubricator.Q;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualRubricatorWidgetModule_ProvideNoRecsVisualRubricatorBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AO0.i> f8510a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Q> f8511b;

    /* renamed from: c, reason: collision with root package name */
    public final i f8512c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C14701e> f8513d;

    public g(Provider provider, Provider provider2, i iVar, Provider provider3) {
        this.f8510a = provider;
        this.f8511b = provider2;
        this.f8512c = iVar;
        this.f8513d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AO0.i iVar = this.f8510a.get();
        Q q12 = this.f8511b.get();
        C14701e c14701e = this.f8513d.get();
        C14123a.f8498a.getClass();
        return iVar.c(q12, this.f8512c, c14701e);
    }
}
