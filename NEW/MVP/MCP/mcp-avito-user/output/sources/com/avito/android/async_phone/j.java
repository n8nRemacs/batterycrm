package com.avito.android.async_phone;

import Id.InterfaceC14060a;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestLink;
import com.avito.android.authorization.AuthSource;
import com.avito.android.bxcontent.Y0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.InAppCallsAwareItem;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AsyncPhonePresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/j;", "Lcom/avito/android/async_phone/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements InterfaceC28616b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<u> f92207a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f92208b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f92209c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC28615a> f92210d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f92211e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f92212f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14060a f92213g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final R0 f92214h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ZL.a f92215i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y0 f92216j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f92217k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public z f92218l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.async_phone.public_module.loading_helper.a f92219m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public C43238h f92220n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public N0 f92221o;

    @Inject
    public j(@Y61.k h31.e<u> eVar, @Y61.k l lVar, @Y61.k E e12, @Y61.k h31.e<InterfaceC28615a> eVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC14060a interfaceC14060a, @Y61.k R0 r02, @Y61.k ZL.a aVar) {
        this.f92207a = eVar;
        this.f92208b = lVar;
        this.f92209c = e12;
        this.f92210d = eVar2;
        this.f92211e = interfaceC35745a5;
        this.f92212f = fVar;
        this.f92213g = interfaceC14060a;
        this.f92214h = r02;
        this.f92215i = aVar;
        this.f92219m = new com.avito.android.async_phone.public_module.loading_helper.a(interfaceC35745a5, fVar);
    }

    @Override // com.avito.android.async_phone.InterfaceC28616b
    public final void K6(@Y61.k Y0 y02) {
        this.f92216j = y02;
        C43238h c43238hA = U.a(this.f92214h.b());
        this.f92221o = C43175k.K(new C43197r1(new i(this, null), this.f92215i.a()), c43238hA);
        this.f92220n = c43238hA;
    }

    @Override // com.avito.android.async_phone.InterfaceC28616b
    public final void L6(@Y61.k AsyncPhoneItem asyncPhoneItem, @Y61.k Q81.a aVar) {
        aVar.setPhoneLoadingState(asyncPhoneItem.getF255559h());
        z zVar = this.f92218l;
        if (zVar == null) {
            return;
        }
        AsyncPhoneItem asyncPhoneItem2 = zVar.f92299a;
        if (L.f(asyncPhoneItem2, asyncPhoneItem)) {
            this.f92218l = new z(asyncPhoneItem2, aVar);
        }
    }

    @Override // com.avito.android.async_phone.InterfaceC28616b
    public final void M6(@Y61.k AsyncPhoneItem asyncPhoneItem) {
        z zVar = this.f92218l;
        if (zVar != null && L.f(zVar.f92299a, asyncPhoneItem)) {
            a();
        }
    }

    @Override // com.avito.android.async_phone.InterfaceC28616b
    public final boolean N6() {
        return this.f92213g.a();
    }

    @Override // com.avito.android.async_phone.InterfaceC28616b
    @InterfaceC42830m
    public final void O6(@Y61.k AsyncPhoneItem asyncPhoneItem, @Y61.l Q81.a aVar, @Y61.k DeepLink deepLink, @Y61.k ContactSource contactSource, @Y61.l String str, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        B0 b0B;
        a();
        if (!(deepLink instanceof PhoneRequestLink)) {
            lVar.invoke(deepLink);
            return;
        }
        PhoneRequestLink phoneRequestLink = (PhoneRequestLink) deepLink;
        if (phoneRequestLink.f92283d && !this.f92209c.b()) {
            InterfaceC28615a interfaceC28615a = this.f92210d.get();
            AuthSource authSource = AuthSource.f92694c;
            interfaceC28615a.G(asyncPhoneItem, contactSource);
            return;
        }
        this.f92218l = new z(asyncPhoneItem, aVar);
        InAppCallsAwareItem inAppCallsAwareItem = asyncPhoneItem instanceof InAppCallsAwareItem ? (InAppCallsAwareItem) asyncPhoneItem : null;
        h31.e<u> eVar = this.f92207a;
        if (inAppCallsAwareItem != null) {
            b0B = eVar.get().a(phoneRequestLink.f92281b, phoneRequestLink.f92282c, inAppCallsAwareItem, contactSource, str, phoneRequestLink.f92284e);
        } else {
            b0B = eVar.get().b(phoneRequestLink.f92284e, phoneRequestLink.f92281b, phoneRequestLink.f92282c, str);
        }
        this.f92217k = this.f92219m.a(b0B.J(io.reactivex.rxjava3.internal.functions.a.f401993c, new C28617c(this)).p0(), new C28618d(1, this, j.class, "updateState", "updateState(Lru/avito/component/serp/PhoneLoadingState;)V", 0), new e(lVar, this), new f(this), new g(this), new h(this));
    }

    public final void a() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f92217k;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f92217k = null;
        Y0 y02 = this.f92216j;
        if (y02 != null) {
            y02.c();
        }
        PhoneLoadingState phoneLoadingState = PhoneLoadingState.f430441b;
        z zVar = this.f92218l;
        if (zVar != null) {
            AsyncPhoneItem asyncPhoneItem = zVar.f92299a;
            if (asyncPhoneItem != null) {
                asyncPhoneItem.setPhoneLoadingState(phoneLoadingState);
            }
            Q81.a aVar = zVar.f92300b;
            if (aVar != null) {
                aVar.setPhoneLoadingState(phoneLoadingState);
            }
        }
        this.f92218l = null;
    }

    @Override // com.avito.android.async_phone.InterfaceC28616b
    public final void e0() {
        a();
        N0 n02 = this.f92221o;
        if (n02 != null) {
            n02.c(null);
        }
        this.f92221o = null;
        C43238h c43238h = this.f92220n;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f92216j = null;
    }
}
