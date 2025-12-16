package com.avito.android.iac_outgoing_call_ability.impl_module.call_methods;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.analytics.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.iac_dialer_models.abstract_module.IacCallContext;
import com.avito.android.iac_outgoing_call_ability.impl_module.can_call.g;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacLaunchCallAfterCanCallLink;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeCallLink;
import com.avito.android.permissions.u;
import com.avito.android.remote.InterfaceC34241a;
import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.F;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlin.text.C43066x;
import lD.C43617a;
import vN.C49237a;

/* compiled from: CallMethodsInteractorImpl.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/call_methods/b;", "LWL/a;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements WL.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC34241a> f168439a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final XL.a f168440b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f168441c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C49237a f168442d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final E f168443e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final u f168444f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final H f168445g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43617a f168446h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final g f168447i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.iac_outgoing_call_ability.impl_module.can_call.k f168448j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.iac_outgoing_call_ability.impl_module.utils.a f168449k;

    @Inject
    public b(@k h31.e<InterfaceC34241a> eVar, @k XL.a aVar, @k InterfaceC35745a5 interfaceC35745a5, @k C49237a c49237a, @k E e12, @k u uVar, @k H h12, @k C43617a c43617a, @k g gVar, @k com.avito.android.iac_outgoing_call_ability.impl_module.can_call.k kVar, @k com.avito.android.iac_outgoing_call_ability.impl_module.utils.a aVar2) {
        this.f168439a = eVar;
        this.f168440b = aVar;
        this.f168441c = interfaceC35745a5;
        this.f168442d = c49237a;
        this.f168443e = e12;
        this.f168444f = uVar;
        this.f168445g = h12;
        this.f168446h = c43617a;
        this.f168447i = gVar;
        this.f168448j = kVar;
        this.f168449k = aVar2;
    }

    @Override // WL.a
    @k
    public final z<DeepLink> a(@l String str, @k IacCallContext iacCallContext, @l String str2, @l Boolean bool, @l String str3) {
        String str4 = iacCallContext.f166826d.f166858b;
        C43617a c43617a = this.f168446h;
        c43617a.getClass();
        n<Object> nVar = C43617a.f413588V[10];
        Boolean bool2 = ((Boolean) c43617a.f413620l.a().invoke()).booleanValue() ? bool : null;
        C49237a c49237a = this.f168442d;
        if (!L.f(c49237a.w().invoke().f318873b, "do_not_mock")) {
            if (!C43066x.q(c49237a.w().invoke().f318873b, "iac_true", false)) {
                if (C43066x.q(c49237a.w().invoke().f318873b, "gsm", false)) {
                    return z.c0(c.f168450a);
                }
                return z.M(new CallMethodsItemPhoneException("Mocked itemPhoneRequest " + c49237a.w().invoke().f318873b));
            }
            PhoneLink.Call call = C43066x.q(c49237a.w().invoke().f318873b, "gsm", false) ? c.f168450a : null;
            String strA = this.f168443e.a();
            if (strA != null) {
                String strA2 = str3 == null ? this.f168440b.a() : str3;
                C43066x.q(c49237a.w().invoke().f318873b, "iac_true_force", false);
                return z.c0(new IacLaunchCallAfterCanCallLink(new IacMakeCallLink(this.f168448j.a(strA2, iacCallContext, call, strA).getCallInfo())));
            }
        }
        F f12 = new F(new com.avito.android.carousel_items.domain.b(this, iacCallContext, str4, str, str2, bool2));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f168441c;
        return f12.E0(2500L, timeUnit, null, interfaceC35745a5.c()).d0(new a(this, iacCallContext, str, str2, bool2, str3, str4)).x0(interfaceC35745a5.a());
    }
}
