package Nb;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AiAssistantApi_Module_ProvideAiAssistantApiFactory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<InterfaceC14555a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f11611a;

    public c(f fVar) {
        this.f11611a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f11611a.get();
        C14556b.f11610a.getClass();
        InterfaceC14555a interfaceC14555a = (InterfaceC14555a) r02.create(InterfaceC14555a.class);
        t.d(interfaceC14555a);
        return interfaceC14555a;
    }
}
