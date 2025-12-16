package Il;

import Oi0.C14701e;
import com.avito.android.visual_rubricator.InterfaceC36118i;
import com.avito.android.visual_rubricator.Q;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualRubricatorWidgetModule_ProvideMultilineVisualRubricatorWidgetItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<InterfaceC36118i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AO0.i> f8506a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Q> f8507b;

    /* renamed from: c, reason: collision with root package name */
    public final i f8508c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C14701e> f8509d;

    public f(Provider provider, Provider provider2, i iVar, Provider provider3) {
        this.f8506a = provider;
        this.f8507b = provider2;
        this.f8508c = iVar;
        this.f8509d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AO0.i iVar = this.f8506a.get();
        Q q12 = this.f8507b.get();
        C14701e c14701e = this.f8509d.get();
        C14123a.f8498a.getClass();
        return iVar.e(q12, this.f8508c, c14701e);
    }
}
