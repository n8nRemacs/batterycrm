package Jt;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CvUploadApi_Module_ProvideCvUploadApiFactory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<InterfaceC14244a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f9165a;

    public c(f fVar) {
        this.f9165a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f9165a.get();
        b.f9164a.getClass();
        InterfaceC14244a interfaceC14244a = (InterfaceC14244a) r02.create(InterfaceC14244a.class);
        t.d(interfaceC14244a);
        return interfaceC14244a;
    }
}
