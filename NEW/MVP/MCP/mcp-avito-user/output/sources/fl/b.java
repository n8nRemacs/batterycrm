package FL;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacChatButtonsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f4685a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f4686b;

    public b(u uVar, Provider provider) {
        this.f4685a = uVar;
        this.f4686b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.iac_incoming_call_ability.impl_module.chat_button.api.a) this.f4685a.get(), this.f4686b.get());
    }
}
