package Il;

import com.avito.android.visual_rubricator.Q;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualRubricatorWidgetModule_ProvideVisualRubricatorPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class o implements dagger.internal.h<Q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AO0.m> f8532a;

    /* renamed from: b, reason: collision with root package name */
    public final u f8533b;

    public o(u uVar, Provider provider) {
        this.f8532a = provider;
        this.f8533b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AO0.m mVar = this.f8532a.get();
        com.avito.android.visual_rubricator.element.i iVar = (com.avito.android.visual_rubricator.element.i) this.f8533b.get();
        C14123a.f8498a.getClass();
        return mVar.a(iVar);
    }
}
