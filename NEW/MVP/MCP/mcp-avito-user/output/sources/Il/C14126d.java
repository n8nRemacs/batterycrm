package Il;

import com.avito.android.visual_rubricator.InterfaceC36110a;
import com.avito.android.visual_rubricator.Q;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualRubricatorWidgetModule_ProvideDoubleRowsVisualRubricatorBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: Il.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14126d implements dagger.internal.h<InterfaceC36110a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<AO0.i> f8502a;

    /* renamed from: b, reason: collision with root package name */
    public final u f8503b;

    public C14126d(u uVar, Provider provider) {
        this.f8502a = provider;
        this.f8503b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AO0.i iVar = this.f8502a.get();
        Q q12 = (Q) this.f8503b.get();
        C14123a.f8498a.getClass();
        return iVar.d(q12);
    }
}
