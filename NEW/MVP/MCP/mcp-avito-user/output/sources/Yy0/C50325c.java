package yy0;

import com.avito.android.remote.R0;
import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrCalendarApi_Module_ProvideStrCalendarApiFactory.java */
@e
@y
@x
/* renamed from: yy0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50325c implements h<InterfaceC50323a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f443623a;

    public C50325c(f fVar) {
        this.f443623a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f443623a.get();
        C50324b.f443622a.getClass();
        InterfaceC50323a interfaceC50323a = (InterfaceC50323a) r02.create(InterfaceC50323a.class);
        t.d(interfaceC50323a);
        return interfaceC50323a;
    }
}
