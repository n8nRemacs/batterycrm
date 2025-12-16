package wI0;

import Y61.k;
import androidx.view.C23069w;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: Binder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"LwI0/c;", "T", "LwI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wI0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49518c<T> implements InterfaceC49516a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C49517b<T> f441371a;

    public C49518c() {
        throw null;
    }

    public C49518c(@k InterfaceC43160i interfaceC43160i, @k InterfaceC22983P interfaceC22983P) {
        Lifecycle.State state = Lifecycle.State.f46682e;
        Lifecycle lifecycle = interfaceC22983P.getLifecycle();
        this.f441371a = new C49517b<>(C23069w.a(interfaceC43160i, lifecycle, state), lifecycle);
    }
}
