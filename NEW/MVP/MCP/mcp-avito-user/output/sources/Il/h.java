package Il;

import Oi0.C14701e;
import com.avito.android.visual_rubricator.Q;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualRubricatorWidgetModule_ProvideRedesignVisualRubricatorBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AO0.i> f8514a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Q> f8515b;

    /* renamed from: c, reason: collision with root package name */
    public final i f8516c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C14701e> f8517d;

    public h(Provider provider, Provider provider2, i iVar, Provider provider3) {
        this.f8514a = provider;
        this.f8515b = provider2;
        this.f8516c = iVar;
        this.f8517d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AO0.i iVar = this.f8514a.get();
        Q q12 = this.f8515b.get();
        C14701e c14701e = this.f8517d.get();
        C14123a.f8498a.getClass();
        return iVar.b(q12, this.f8516c, c14701e);
    }
}
