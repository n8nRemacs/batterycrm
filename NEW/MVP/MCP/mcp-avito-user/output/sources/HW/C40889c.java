package hW;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LlmApi_Module_ProvideLlmApiFactory.java */
@e
@y
@x
/* renamed from: hW.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40889c implements h<InterfaceC40887a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f397216a;

    public C40889c(f fVar) {
        this.f397216a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f397216a.get();
        C40888b.f397215a.getClass();
        InterfaceC40887a interfaceC40887a = (InterfaceC40887a) r02.create(InterfaceC40887a.class);
        t.d(interfaceC40887a);
        return interfaceC40887a;
    }
}
