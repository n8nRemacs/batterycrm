package Il;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VisualRubricatorWidgetModule_ProvideDestroyableViewHolderBuilderFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Il.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14125c implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f8501a;

    public C14125c(u uVar) {
        this.f8501a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f8501a.get();
        C14123a.f8498a.getClass();
        return new C14699c(aVar);
    }
}
