package fI0;

import com.avito.android.C30566f2;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SbcConfiguratorClosedUxFeedbackHelper_Factory.java */
@e
@y
@x
/* renamed from: fI0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40298c implements h<C40297b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f395808a;

    /* renamed from: b, reason: collision with root package name */
    public final u f395809b;

    public C40298c(u uVar, u uVar2) {
        this.f395808a = uVar;
        this.f395809b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C40297b((SK0.b) this.f395808a.get(), (C30566f2) this.f395809b.get());
    }
}
