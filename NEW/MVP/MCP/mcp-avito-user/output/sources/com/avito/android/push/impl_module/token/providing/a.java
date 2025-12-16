package com.avito.android.push.impl_module.token.providing;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.push.PushService;
import com.avito.android.push.impl_module.token.providing.CompositePushTokenProviderException;
import com.avito.android.push.impl_module.token.sending.analytics.j;
import com.avito.android.remote.model.ProfileTab;
import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import fg0.InterfaceC40417a;
import fg0.InterfaceC40420d;
import io.reactivex.rxjava3.internal.operators.single.G;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CompositePushTokenProviderImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/impl_module/token/providing/a;", "Lfg0/a;", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes16.dex */
public final class a implements InterfaceC40417a {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f245979e = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f245980a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f245981b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f245982c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h31.e<Set<InterfaceC40420d>> f245983d;

    /* compiled from: CompositePushTokenProviderImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/push/impl_module/token/providing/a$a;", "", "<init>", "()V", "", "DEVICE_TYPE_ANALYTIC_EVENT", "Ljava/lang/String;", "TAG", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.push.impl_module.token.providing.a$a, reason: collision with other inner class name */
    public static final class C7373a {
        public /* synthetic */ C7373a(C42822w c42822w) {
            this();
        }

        public C7373a() {
        }
    }

    static {
        new C7373a(null);
    }

    @Inject
    public a(@k InterfaceC28373a interfaceC28373a, @k j jVar, @k InterfaceC35745a5 interfaceC35745a5, @k h31.e eVar) {
        this.f245980a = interfaceC28373a;
        this.f245981b = jVar;
        this.f245982c = interfaceC35745a5;
        this.f245983d = eVar;
    }

    @Override // fg0.InterfaceC40417a
    @l
    public final PushService a() {
        InterfaceC40420d interfaceC40420dD = d();
        if (interfaceC40420dD != null) {
            return interfaceC40420dD.getType();
        }
        return null;
    }

    @Override // fg0.InterfaceC40417a
    @k
    public final String b(@k Throwable th2) {
        if (!(th2 instanceof CompositePushTokenProviderException)) {
            return "composite_undefined_error";
        }
        CompositePushTokenProviderException compositePushTokenProviderException = (CompositePushTokenProviderException) th2;
        if (compositePushTokenProviderException instanceof CompositePushTokenProviderException.NoPushServiceError) {
            return "composite_no_push_service";
        }
        if (compositePushTokenProviderException instanceof CompositePushTokenProviderException.PushProviderError) {
            return ((CompositePushTokenProviderException.PushProviderError) th2).f245978b;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // fg0.InterfaceC40417a
    @k
    public final W c(@k String str) {
        InterfaceC40420d interfaceC40420dD = d();
        return new G(new com.avito.android.publish.slots.vin_cropped_image.item.vin_cropped_image.h(str, 1)).n(new b(interfaceC40420dD != null ? interfaceC40420dD.a(str) : new G(new com.avito.android.iac_dialer_watcher.impl_module.logging.repository.c(3)))).r(c.f245985b).z(this.f245982c.a());
    }

    public final InterfaceC40420d d() {
        Object obj;
        Object next;
        h31.e<Set<InterfaceC40420d>> eVar = this.f245983d;
        Iterator<T> it = eVar.get().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC40420d) next).getType() == PushService.f245927b) {
                break;
            }
        }
        InterfaceC40420d interfaceC40420d = (InterfaceC40420d) next;
        Iterator<T> it2 = eVar.get().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((InterfaceC40420d) next2).getType() == PushService.f245928c) {
                obj = next2;
                break;
            }
        }
        InterfaceC40420d interfaceC40420d2 = (InterfaceC40420d) obj;
        boolean z12 = interfaceC40420d != null;
        boolean z13 = interfaceC40420d2 != null;
        j jVar = this.f245981b;
        if (!jVar.e()) {
            this.f245980a.c(new y.a("pushProvider.device_type_".concat((z12 && z13) ? ProfileTab.ALL : (z12 || z13) ? (!z12 || z13) ? (z12 || !z13) ? "" : "only_hms" : "only_fcm" : "nothing"), 0L, 2, null));
            jVar.g();
        }
        return interfaceC40420d == null ? interfaceC40420d2 : interfaceC40420d;
    }
}
