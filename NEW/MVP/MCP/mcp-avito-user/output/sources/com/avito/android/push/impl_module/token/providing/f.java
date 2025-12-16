package com.avito.android.push.impl_module.token.providing;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.squareup.anvil.annotations.ContributesBinding;
import fg0.InterfaceC40417a;
import fg0.InterfaceC40419c;
import io.reactivex.rxjava3.internal.operators.single.U;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PushTokenDataProviderImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/impl_module/token/providing/f;", "Lfg0/c;", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements InterfaceC40419c {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f245991c = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC40417a f245992a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f245993b;

    /* compiled from: PushTokenDataProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/push/impl_module/token/providing/f$a;", "", "<init>", "()V", "", "GRAFANA_EMPTY_TOKEN_EVENT", "Ljava/lang/String;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f(@k InterfaceC40417a interfaceC40417a, @k InterfaceC28373a interfaceC28373a) {
        this.f245992a = interfaceC40417a;
        this.f245993b = interfaceC28373a;
    }

    @Override // fg0.InterfaceC40419c
    @k
    public final U a() {
        return this.f245992a.c("PushTokenDataProvider").r(g.f245994b).u(new androidx.room.rxjava3.b(this, 19));
    }
}
