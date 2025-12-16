package com.avito.android.iac_dialer_watcher.impl_module.socket_connection_state;

import Y61.k;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.observable.L;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacSocketConnectionStateControllerImpl.kt */
@Singleton
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/socket_connection_state/a;", "LAL/a;", "LAL/b;", "<init>", "()V", "a", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ContributesBinding.b
/* loaded from: classes14.dex */
public final class a implements AL.a, AL.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.b<Boolean> f168139a = com.jakewharton.rxrelay3.b.N0(Boolean.FALSE);

    /* compiled from: IacSocketConnectionStateControllerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/socket_connection_state/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer_watcher.impl_module.socket_connection_state.a$a, reason: collision with other inner class name */
    public static final class C4972a {
        public /* synthetic */ C4972a(C42822w c42822w) {
            this();
        }

        public C4972a() {
        }
    }

    static {
        new C4972a(null);
    }

    @Inject
    public a() {
    }

    @Override // AL.a
    public final void a() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacSocketConnectionStateController", "Requested connection for IAC", null);
        this.f168139a.accept(Boolean.TRUE);
    }

    @Override // AL.b
    @k
    public final L b() {
        com.jakewharton.rxrelay3.b<Boolean> bVar = this.f168139a;
        bVar.getClass();
        return bVar.D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }

    @Override // AL.a
    public final void c() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacSocketConnectionStateController", "Released connection for IAC", null);
        this.f168139a.accept(Boolean.FALSE);
    }
}
