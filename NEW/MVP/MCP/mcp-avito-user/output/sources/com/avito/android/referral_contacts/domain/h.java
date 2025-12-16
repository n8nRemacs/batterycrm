package com.avito.android.referral_contacts.domain;

import Si0.InterfaceC15188a;
import Y61.k;
import com.avito.android.deep_linking.x;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ReferralContactsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/referral_contacts/domain/h;", "", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC15188a f252478a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.referral_contacts.h f252479b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f252480c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final x f252481d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.referral_contacts.storage.a f252482e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Y41.a<Boolean> f252483f = new a();

    /* compiled from: ReferralContactsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(LocalDateTime.now(ZoneOffset.UTC).isAfter(h.this.f252482e.a()));
        }
    }

    @Inject
    public h(@k InterfaceC15188a interfaceC15188a, @k com.avito.android.referral_contacts.h hVar, @k c cVar, @k x xVar, @k com.avito.android.referral_contacts.storage.a aVar) {
        this.f252478a = interfaceC15188a;
        this.f252479b = hVar;
        this.f252480c = cVar;
        this.f252481d = xVar;
        this.f252482e = aVar;
    }

    @k
    public final C43152f0 a() {
        InterfaceC43160i fVar;
        if (((Boolean) ((a) this.f252483f).invoke()).booleanValue()) {
            c cVar = this.f252480c;
            cVar.getClass();
            fVar = new e(C43175k.h(new b(cVar, null)), this);
        } else {
            fVar = new f(this.f252482e.d(), this);
        }
        return new C43152f0(fVar, new g(3, null));
    }
}
