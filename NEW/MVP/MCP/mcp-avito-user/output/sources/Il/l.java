package Il;

import Oi0.C14701e;
import com.avito.android.visual_rubricator.Q;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualRubricatorWidgetModule_ProvideTinyVisualRubricatorBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AO0.i> f8525a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Q> f8526b;

    /* renamed from: c, reason: collision with root package name */
    public final i f8527c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C14701e> f8528d;

    public l(Provider provider, Provider provider2, i iVar, Provider provider3) {
        this.f8525a = provider;
        this.f8526b = provider2;
        this.f8527c = iVar;
        this.f8528d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AO0.i iVar = this.f8525a.get();
        Q q12 = this.f8526b.get();
        C14701e c14701e = this.f8528d.get();
        C14123a.f8498a.getClass();
        return iVar.a(q12, this.f8527c, c14701e);
    }
}
