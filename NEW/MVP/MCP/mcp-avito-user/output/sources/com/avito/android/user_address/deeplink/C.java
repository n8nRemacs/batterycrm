package com.avito.android.user_address.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.deeplink_handler.view.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import rv.C47918a;
import sv.C48421d;

/* compiled from: UserAddressMapDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/deeplink/C;", "Lcom/avito/android/user_address/deeplink/o;", "Lcom/avito/android/deep_linking/links/UserAddressLink$Map;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class C extends o<UserAddressLink.Map> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.b f307194f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final k f307195g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f307196h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f307197i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: UserAddressMapDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f307198a;

        static {
            int[] iArr = new int[UserAddressLink.BottomSheetState.values().length];
            try {
                iArr[UserAddressLink.BottomSheetState.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserAddressLink.BottomSheetState.COLLAPSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f307198a = iArr;
        }
    }

    /* compiled from: UserAddressMapDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(C.this);
        }
    }

    /* compiled from: UserAddressMapDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C.this.j(o.k((C47918a) obj));
        }
    }

    @Inject
    public C(@Y61.k a.b bVar, @Y61.k k kVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f307194f = bVar;
        this.f307195g = kVar;
        this.f307196h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        Intent intentJ;
        UserAddressLink.Map map = (UserAddressLink.Map) deepLink;
        int i12 = a.f307198a[map.f133787c.ordinal()];
        if (i12 == 1) {
            intentJ = this.f307195g.j(map.f133786b, map.f133788d, map.f133789e, map.f133790f, map.f133791g, map.f133792h);
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            intentJ = this.f307195g.b(map.f133786b, map.f133788d, map.f133789e, map.f133790f, map.f133791g);
        }
        this.f307196h.J(intentJ, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f307197i.b(this.f307194f.Q().N(new b()).t0(new c()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f307197i.e();
    }
}
