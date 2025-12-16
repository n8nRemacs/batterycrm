package xo0;

import To.InterfaceC15383a;
import com.avito.android.safety.tfa_enable_confirm.code_check.interactor.j;
import com.avito.android.safety.tfa_enable_confirm.code_check.interactor.l;
import com.avito.android.safety.tfa_enable_confirm.code_check.interactor.p;
import com.avito.android.safety.tfa_enable_confirm.code_check.interactor.r;
import com.avito.android.safety.tfa_enable_confirm.code_check.interactor.t;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Y1;

/* compiled from: TfaEnableCodeCheckScreenBuilderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final j f442660a;

    /* renamed from: b, reason: collision with root package name */
    public final p f442661b;

    /* renamed from: c, reason: collision with root package name */
    public final t f442662c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Y1<InterfaceC15383a>> f442663d;

    public h(j jVar, p pVar, t tVar, Provider provider) {
        this.f442660a = jVar;
        this.f442661b = pVar;
        this.f442662c = tVar;
        this.f442663d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.safety.tfa_enable_confirm.code_check.interactor.f) this.f442660a.get(), (l) this.f442661b.get(), (r) this.f442662c.get(), this.f442663d.get());
    }
}
