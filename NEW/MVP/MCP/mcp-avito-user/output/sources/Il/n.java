package Il;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zO0.InterfaceC50496e;

/* compiled from: VisualRubricatorWidgetModule_ProvideVisualRubricatorItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<com.avito.android.visual_rubricator.element.i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50496e> f8531a;

    public n(Provider<InterfaceC50496e> provider) {
        this.f8531a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC50496e interfaceC50496e = this.f8531a.get();
        C14123a.f8498a.getClass();
        return interfaceC50496e.create();
    }
}
