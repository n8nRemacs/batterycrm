package Il;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import zO0.InterfaceC50492a;

/* compiled from: VisualRubricatorWidgetModule_ProvideAlLCategoriesItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Il.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14124b implements dagger.internal.h<com.avito.android.visual_rubricator.element.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50492a> f8499a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.visual_rubricator.element.i> f8500b;

    public C14124b(Provider<InterfaceC50492a> provider, Provider<com.avito.android.visual_rubricator.element.i> provider2) {
        this.f8499a = provider;
        this.f8500b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC50492a interfaceC50492a = this.f8499a.get();
        com.avito.android.visual_rubricator.element.i iVar = this.f8500b.get();
        C14123a.f8498a.getClass();
        return interfaceC50492a.b(iVar);
    }
}
