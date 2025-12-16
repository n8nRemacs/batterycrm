package sQ;

import com.avito.android.remote.R0;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InterviewInvitationApi_Module_ProvideInterviewInvitationApiFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: sQ.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48093c implements h<InterfaceC48091a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f437645a;

    public C48093c(dagger.internal.f fVar) {
        this.f437645a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f437645a.get();
        C48092b.f437644a.getClass();
        InterfaceC48091a interfaceC48091a = (InterfaceC48091a) r02.create(InterfaceC48091a.class);
        t.d(interfaceC48091a);
        return interfaceC48091a;
    }
}
