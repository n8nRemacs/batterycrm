package com.avito.android.user_address.deeplink.sx_new_address;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.m;
import androidx.view.result.h;
import androidx.view.result.j;
import com.avito.android.SxAddAddressSource;
import com.avito.android.SxAddressAddLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.e;
import com.avito.android.util.C35835l0;
import ev.AbstractC40161a;
import i.b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import yA0.InterfaceC50095c;

/* compiled from: SxAddressAddLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/deeplink/sx_new_address/a;", "Lev/a;", "Lcom/avito/android/SxAddressAddLink;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC40161a<SxAddressAddLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f307276f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.user_address.deeplink.k f307277g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC50095c f307278h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public h<Intent> f307279i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public h<Intent> f307280j;

    /* compiled from: SxAddressAddLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lkotlin/G0;", "invoke", "(Landroid/content/Context;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_address.deeplink.sx_new_address.a$a, reason: collision with other inner class name */
    public static final class C9441a extends N implements Y41.l<Context, G0> {
        public C9441a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Context context) {
            j activityResultRegistry;
            j activityResultRegistry2;
            Context context2 = context;
            m mVarC = C35835l0.c(context2);
            a aVar = a.this;
            h<Intent> hVarE = null;
            aVar.f307279i = (mVarC == null || (activityResultRegistry2 = mVarC.getActivityResultRegistry()) == null) ? null : activityResultRegistry2.e("deeplink.sx_new_address.user_result_callback", new b.m(), new e(context2, aVar));
            m mVarC2 = C35835l0.c(context2);
            if (mVarC2 != null && (activityResultRegistry = mVarC2.getActivityResultRegistry()) != null) {
                hVarE = activityResultRegistry.e("deeplink.sx_new_address.sx_result_callback", new b.m(), new com.avito.android.str_seller_orders.orders_seller.a(aVar, 3));
            }
            aVar.f307280j = hVarE;
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.user_address.deeplink.k kVar, @k InterfaceC50095c interfaceC50095c) {
        this.f307276f = interfaceC4053a;
        this.f307277g = kVar;
        this.f307278h = interfaceC50095c;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        SxAddressAddLink sxAddressAddLink = (SxAddressAddLink) deepLink;
        SxAddAddressSource sxAddAddressSource = sxAddressAddLink.f67549d;
        if (sxAddAddressSource == null) {
            sxAddAddressSource = SxAddAddressSource.f67543b;
        }
        Intent intentH = this.f307277g.h(sxAddressAddLink.f67548c, sxAddressAddLink.f67547b, sxAddressAddLink.f67550e, sxAddAddressSource);
        h<Intent> hVar = this.f307279i;
        if (hVar != null) {
            hVar.b(intentH);
        }
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f307276f.g1(new C9441a());
    }
}
