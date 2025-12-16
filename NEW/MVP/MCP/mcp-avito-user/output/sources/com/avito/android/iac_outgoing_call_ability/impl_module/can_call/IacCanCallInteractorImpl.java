package com.avito.android.iac_outgoing_call_ability.impl_module.can_call;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.analytics.H;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.iac_dialer_models.abstract_module.IacCallContext;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallResult;
import com.avito.android.permissions.u;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import com.google.gson.Gson;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import io.reactivex.rxjava3.internal.operators.single.O;
import io.reactivex.rxjava3.internal.operators.single.U;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: IacCanCallInteractorImpl.kt */
@P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/can_call/IacCanCallInteractorImpl;", "LXL/a;", "a", "IacEmptyUserIdException", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class IacCanCallInteractorImpl implements XL.a {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f168511m = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_outgoing_call_ability.impl_module.api.a f168512a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final H f168513b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f168514c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f168515d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final u f168516e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final MK.a f168517f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final F f168518g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f168519h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final E f168520i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final g f168521j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final k f168522k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Gson f168523l;

    /* compiled from: IacCanCallInteractorImpl.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/can_call/IacCanCallInteractorImpl$IacEmptyUserIdException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IacEmptyUserIdException extends Exception {
        public static final int $stable = 0;
    }

    /* compiled from: IacCanCallInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/can_call/IacCanCallInteractorImpl$a;", "", "<init>", "()V", "", "IN_APP_CALL_REQUEST_TIMEOUT_MS", "J", "", "TAG", "Ljava/lang/String;", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacCanCallInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRL/b;", "canRecallResult", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult;", "apply", "(LRL/b;)Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f168525c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f168526d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ DeepLink f168527e;

        public b(String str, String str2, DeepLink deepLink) {
            this.f168525c = str;
            this.f168526d = str2;
            this.f168527e = deepLink;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return IacCanCallInteractorImpl.this.f168521j.b((RL.b) obj, this.f168525c, this.f168526d, this.f168527e);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public IacCanCallInteractorImpl(@Y61.k com.avito.android.iac_outgoing_call_ability.impl_module.api.a aVar, @Y61.k H h12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC35745a5 interfaceC35745a52, @Y61.k u uVar, @Y61.k MK.a aVar2, @Y61.k F f12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12, @Y61.k g gVar, @Y61.k k kVar, @Y61.k Gson gson) {
        this.f168512a = aVar;
        this.f168513b = h12;
        this.f168514c = interfaceC35745a5;
        this.f168515d = interfaceC35745a52;
        this.f168516e = uVar;
        this.f168517f = aVar2;
        this.f168518g = f12;
        this.f168519h = interfaceC28373a;
        this.f168520i = e12;
        this.f168521j = gVar;
        this.f168522k = kVar;
        this.f168523l = gson;
    }

    @Override // XL.a
    @Y61.k
    public final String a() {
        return this.f168517f.a();
    }

    @Override // XL.a
    @Y61.k
    public final I b(@Y61.l DeepLink deepLink, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12) {
        O oR2 = g1.a(this.f168512a.b(str, this.f168513b.a(), str3)).r(new b(str3, str2, deepLink));
        return z12 ? oR2.u(new com.avito.android.analytics.clickstream.I(17)) : oR2;
    }

    @Override // XL.a
    @Y61.k
    public final U c(@Y61.k IacCallContext iacCallContext, @Y61.l DeepLink deepLink) {
        return e(iacCallContext, deepLink, this.f168517f.a()).u(new com.avito.android.analytics.clickstream.I(18));
    }

    @Override // XL.a
    @Y61.k
    public final U d(@Y61.k IacCallContext iacCallContext, @Y61.l PhoneLink.Call call) {
        return e(iacCallContext, call, this.f168517f.a()).r(d.f168537b).u(new com.avito.android.analytics.clickstream.I(16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [kotlin.Z$b] */
    public final I e(IacCallContext iacCallContext, DeepLink deepLink, String str) {
        String bVar;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar2 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        bVar2.a("IacCanCallInteractor", "canCall: callId=" + str + ", " + iacCallContext + '=' + iacCallContext, null);
        String strA = this.f168520i.a();
        InterfaceC28373a interfaceC28373a = this.f168519h;
        if (strA == null) {
            interfaceC28373a.c(new NonFatalErrorEvent("Can't create outgoing call cause caller user id is null", new IacEmptyUserIdException(), null, NonFatalErrorEvent.a.c.f147934a, 4, null));
            return I.q(new IacCanCallResult.CanNot("caller user id is null", null, 2, null));
        }
        interfaceC28373a.c(new y.a(this.f168518g.a("calls", "outgoing_call_funnel", "{{%app_ver%}}", iacCallContext.f166824b, "entry_point").f91030a, 1L));
        IacCanCallResult iacCanCallResultB = this.f168522k.b(str, iacCallContext, deepLink, strA);
        if (iacCanCallResultB != null) {
            return I.q(iacCanCallResultB);
        }
        String str2 = iacCallContext.f166826d.f166858b;
        String str3 = iacCallContext.f166825c.f166868b;
        if (L.f(str3, "")) {
            bVar2.b("IacCanCallInteractor", "peerUserId is empty -> CanNot result will be returned", null);
            return I.q(new IacCanCallResult.CanNot(null, null, 3, null));
        }
        if (L.f(str2, "")) {
            bVar2.b("IacCanCallInteractor", "itemId is empty -> CanNot result will be returned", null);
            return I.q(new IacCanCallResult.CanNot(null, null, 3, null));
        }
        String strA2 = this.f168513b.a();
        boolean zB2 = this.f168516e.b("android.permission.RECORD_AUDIO");
        String str4 = iacCallContext.f166828f;
        if (str4 != null) {
            RL.a aVar = new RL.a(str4);
            try {
                int i12 = Z.f406624c;
                bVar = this.f168523l.l(aVar);
            } catch (Throwable th2) {
                int i13 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            str = bVar instanceof Z.b ? null : bVar;
        }
        C42022u c42022uK = g1.a(this.f168512a.a(str2, str3, null, strA2, iacCallContext.f166824b, zB2, true, str).k(new com.avito.android.iac_outgoing_call_ability.impl_module.can_call.a(this, str, iacCallContext))).r(new com.avito.android.iac_outgoing_call_ability.impl_module.can_call.b(this, str, iacCallContext, deepLink, strA)).k(c.f168536b);
        InterfaceC35745a5 interfaceC35745a5 = this.f168514c;
        return c42022uK.z(interfaceC35745a5.a()).s(interfaceC35745a5.c()).B(2500L, TimeUnit.MILLISECONDS, this.f168515d.c(), null);
    }
}
