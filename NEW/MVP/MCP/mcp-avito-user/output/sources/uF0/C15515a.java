package Uf0;

import Y61.k;
import com.avito.android.push.PushService;
import com.squareup.anvil.annotations.ContributesBinding;
import eg0.InterfaceC40103a;
import gg0.InterfaceC40678b;
import ig0.AbstractC41398a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: OnNewTokenPushServiceDelegateImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUf0/a;", "Leg0/a;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Uf0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C15515a implements InterfaceC40103a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.push.impl_module.token.sending.short_task.c f16541a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40678b f16542b;

    @Inject
    public C15515a(@k com.avito.android.push.impl_module.token.sending.short_task.c cVar, @k InterfaceC40678b interfaceC40678b) {
        this.f16541a = cVar;
        this.f16542b = interfaceC40678b;
    }

    @Override // eg0.InterfaceC40103a
    public final void a(@k PushService pushService) {
        this.f16541a.a(AbstractC41398a.d.f398617c);
        this.f16542b.a(pushService);
    }
}
