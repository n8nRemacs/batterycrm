package D00;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PersonFormViewStateBuilderImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f2842a;

    public c(u uVar) {
        this.f2842a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.mortgage.person_form.mvi.mapper.a) this.f2842a.get());
    }
}
