package Il;

import Oi0.C14701e;
import com.avito.android.visual_rubricator.Q;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualRubricatorWidgetModule_ProvideSmallAllCatVisualRubricatorBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AO0.i> f8521a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Q> f8522b;

    /* renamed from: c, reason: collision with root package name */
    public final i f8523c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C14701e> f8524d;

    public k(Provider provider, Provider provider2, i iVar, Provider provider3) {
        this.f8521a = provider;
        this.f8522b = provider2;
        this.f8523c = iVar;
        this.f8524d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AO0.i iVar = this.f8521a.get();
        Q q12 = this.f8522b.get();
        C14701e c14701e = this.f8524d.get();
        C14123a.f8498a.getClass();
        return iVar.f(q12, this.f8523c, c14701e);
    }
}
