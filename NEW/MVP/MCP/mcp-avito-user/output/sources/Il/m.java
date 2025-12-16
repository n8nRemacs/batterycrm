package Il;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zO0.InterfaceC50492a;

/* compiled from: VisualRubricatorWidgetModule_ProvideVisualRubricatorItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class m implements dagger.internal.h<com.avito.android.visual_rubricator.element.e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50492a> f8529a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.visual_rubricator.element.i> f8530b;

    public m(Provider<InterfaceC50492a> provider, Provider<com.avito.android.visual_rubricator.element.i> provider2) {
        this.f8529a = provider;
        this.f8530b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC50492a interfaceC50492a = this.f8529a.get();
        com.avito.android.visual_rubricator.element.i iVar = this.f8530b.get();
        C14123a.f8498a.getClass();
        return interfaceC50492a.a(iVar);
    }
}
