package com.avito.android.user_address.deeplink;

import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rv.C47918a;
import sv.C48421d;

/* compiled from: UserAddressAddNewRealtyAddressDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/deeplink/b;", "Lev/a;", "Lcom/avito/android/user_address/deeplink/UserAddressAddNewRealtyAddressLink;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_address.deeplink.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35341b extends AbstractC40161a<UserAddressAddNewRealtyAddressLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final k f307217f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f307218g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f307219h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C25719a f307220i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f307221j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: UserAddressAddNewRealtyAddressDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_address.deeplink.b$a */
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(C35341b.this);
        }
    }

    /* compiled from: UserAddressAddNewRealtyAddressDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_address.deeplink.b$b, reason: collision with other inner class name */
    public static final class C9439b<T> implements l41.g {
        public C9439b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
        @Override // l41.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void accept(java.lang.Object r3) {
            /*
                r2 = this;
                rv.a r3 = (rv.C47918a) r3
                com.avito.android.user_address.deeplink.b r0 = com.avito.android.user_address.deeplink.C35341b.this
                android.content.Intent r3 = r3.f437157c
                if (r3 == 0) goto L17
                com.avito.android.user_address.deeplink.k$a r1 = com.avito.android.user_address.deeplink.k.f307239a
                r1.getClass()
                java.lang.String r1 = "result.user_address"
                android.os.Parcelable r3 = r3.getParcelableExtra(r1)
                com.avito.android.deep_linking.links.UserAddressLink$Result r3 = (com.avito.android.deep_linking.links.UserAddressLink.Result) r3
                if (r3 != 0) goto L19
            L17:
                com.avito.android.deep_linking.links.UserAddressLink$Result$Canceled r3 = com.avito.android.deep_linking.links.UserAddressLink.Result.Canceled.f133803b
            L19:
                r0.j(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_address.deeplink.C35341b.C9439b.accept(java.lang.Object):void");
        }
    }

    @Inject
    public C35341b(@Y61.k k kVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k C25719a c25719a) {
        this.f307217f = kVar;
        this.f307218g = interfaceC4053a;
        this.f307219h = bVar;
        this.f307220i = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        UserAddressAddNewRealtyAddressLink userAddressAddNewRealtyAddressLink = (UserAddressAddNewRealtyAddressLink) deepLink;
        this.f307220i.b(userAddressAddNewRealtyAddressLink, this, null, new C35340a(this, userAddressAddNewRealtyAddressLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f307221j.b(this.f307219h.Q().N(new a()).t0(new C9439b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f307221j.e();
    }
}
