package qL;

import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.flow.n2;
import zL.InterfaceC50481a;

/* compiled from: IacDialerNewGsmCallBlockerImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqL/a;", "LzL/a;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qL.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47314a implements InterfaceC50481a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RK.a f429191a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final n2<Boolean> f429192b;

    @Inject
    public C47314a(@k RK.a aVar) {
        this.f429191a = aVar;
        this.f429192b = aVar.c();
    }

    @Override // zL.InterfaceC50481a
    @k
    public final n2<Boolean> a() {
        return this.f429192b;
    }
}
