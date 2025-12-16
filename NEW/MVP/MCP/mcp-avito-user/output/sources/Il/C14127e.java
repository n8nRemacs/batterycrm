package Il;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualRubricatorWidgetModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Il.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14127e implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.visual_rubricator.element.e> f8504a;

    /* renamed from: b, reason: collision with root package name */
    public final u f8505b;

    public C14127e(u uVar, Provider provider) {
        this.f8504a = provider;
        this.f8505b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.visual_rubricator.element.e eVar = this.f8504a.get();
        com.avito.android.visual_rubricator.element.c cVar = (com.avito.android.visual_rubricator.element.c) this.f8505b.get();
        C14123a.f8498a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(eVar);
        c10493a.b(cVar);
        return c10493a.a();
    }
}
