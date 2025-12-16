package com.avito.android.async_phone.impl_module.phone_request_interactor;

import Cq0.C13343b;
import Gd.InterfaceC13866a;
import Id.InterfaceC14060a;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.H;
import com.avito.android.permissions.u;
import com.avito.android.remote.InterfaceC34241a;
import com.avito.android.remote.model.PhoneResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import h31.e;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.F;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import lD.C43617a;

/* compiled from: AsyncPhoneInteractorImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/async_phone/impl_module/phone_request_interactor/a;", "LGd/a;", "a", "_avito_async-phone_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes11.dex */
public final class a implements InterfaceC13866a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f92130h = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC34241a> f92131a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f92132b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C43617a f92133c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC14060a f92134d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final u f92135e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final H f92136f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final YL.a f92137g;

    /* compiled from: AsyncPhoneInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/async_phone/impl_module/phone_request_interactor/a$a;", "", "<init>", "()V", "", "LOADING_TIMEOUT_MS", "J", "_avito_async-phone_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.async_phone.impl_module.phone_request_interactor.a$a, reason: collision with other inner class name */
    public static final class C2721a {
        public /* synthetic */ C2721a(C42822w c42822w) {
            this();
        }

        public C2721a() {
        }
    }

    static {
        new C2721a(null);
    }

    @Inject
    public a(@k e<InterfaceC34241a> eVar, @k InterfaceC35745a5 interfaceC35745a5, @k C43617a c43617a, @k InterfaceC14060a interfaceC14060a, @k u uVar, @k H h12, @k YL.a aVar) {
        this.f92131a = eVar;
        this.f92132b = interfaceC35745a5;
        this.f92133c = c43617a;
        this.f92134d = interfaceC14060a;
        this.f92135e = uVar;
        this.f92136f = h12;
        this.f92137g = aVar;
    }

    @Override // Gd.InterfaceC13866a
    @k
    public final C41982q1 a(@k String str, @l String str2, @l Boolean bool, @l String str3, @l String str4) {
        z<TypedResult<PhoneResponse>> zVarA;
        boolean zA2 = this.f92134d.a();
        C43617a c43617a = this.f92133c;
        e<InterfaceC34241a> eVar = this.f92131a;
        str = null;
        String str5 = null;
        if (zA2) {
            InterfaceC34241a interfaceC34241a = eVar.get();
            c43617a.getClass();
            n<Object> nVar = C43617a.f413588V[10];
            Boolean bool2 = ((Boolean) c43617a.f413620l.a().invoke()).booleanValue() ? bool : null;
            if (str4 != null && !this.f92137g.a()) {
                str5 = str4;
            }
            zVarA = interfaceC34241a.b(str, str2, str3, str5, this.f92136f.a(), Boolean.valueOf(this.f92135e.b("android.permission.RECORD_AUDIO")), bool2, null);
        } else {
            InterfaceC34241a interfaceC34241a2 = eVar.get();
            c43617a.getClass();
            n<Object> nVar2 = C43617a.f413588V[10];
            zVarA = interfaceC34241a2.a(str, str2, str3, ((Boolean) c43617a.f413620l.a().invoke()).booleanValue() ? bool : null);
        }
        F f12 = new F(new C13343b(zVarA, 4));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f92132b;
        return f12.E0(2500L, timeUnit, null, interfaceC35745a5.c()).d0(new b(this, str, str2, bool)).x0(interfaceC35745a5.a());
    }
}
