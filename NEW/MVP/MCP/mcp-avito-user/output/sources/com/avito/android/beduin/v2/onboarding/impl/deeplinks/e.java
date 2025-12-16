package com.avito.android.beduin.v2.onboarding.impl.deeplinks;

import Ei.InterfaceC13489b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2OnboardingBaseDeepLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/deeplinks/e;", "Ldagger/internal/h;", "Lcom/avito/android/beduin/v2/onboarding/impl/deeplinks/d;", "a", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f104703e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dv.b f104704a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.v2.onboarding.impl.e f104705b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dv.b f104706c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f104707d;

    /* compiled from: BeduinV2OnboardingBaseDeepLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/deeplinks/e$a;", "", "<init>", "()V", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k dv.b bVar, @Y61.k com.avito.android.beduin.v2.onboarding.impl.e eVar, @Y61.k dv.b bVar2, @Y61.k Provider provider) {
        this.f104704a = bVar;
        this.f104705b = eVar;
        this.f104706c = bVar2;
        this.f104707d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f104704a.get();
        InterfaceC13489b interfaceC13489b = (InterfaceC13489b) this.f104705b.get();
        a.b bVar = (a.b) this.f104706c.get();
        R0 r02 = this.f104707d.get();
        f104703e.getClass();
        return new d(interfaceC4053a, interfaceC13489b, bVar, r02);
    }
}
