package iQ;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvValidationBottomSheetApi_Module_ProvideCvValidationBottomSheetApiFactory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<InterfaceC41332a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f398520a;

    public c(f fVar) {
        this.f398520a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f398520a.get();
        b.f398519a.getClass();
        InterfaceC41332a interfaceC41332a = (InterfaceC41332a) r02.create(InterfaceC41332a.class);
        t.d(interfaceC41332a);
        return interfaceC41332a;
    }
}
