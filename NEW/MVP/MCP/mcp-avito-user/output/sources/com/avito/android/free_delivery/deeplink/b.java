package com.avito.android.free_delivery.deeplink;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.free_delivery.FreeDeliveryActivity;
import com.avito.android.free_delivery.FreeDeliveryLink;
import com.avito.android.free_delivery.x;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: FreeDeliveryLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/free_delivery/deeplink/b;", "Lev/a;", "Lcom/avito/android/free_delivery/FreeDeliveryLink;", "_avito_free-delivery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends AbstractC40161a<FreeDeliveryLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final x f158655f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f158656g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f158657h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public y f158658i;

    /* compiled from: FreeDeliveryLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    /* compiled from: FreeDeliveryLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.free_delivery.deeplink.b$b, reason: collision with other inner class name */
    public static final class C4634b<T> implements l41.g {
        public C4634b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.this.j(FreeDeliveryLink.b.a.f158651b);
        }
    }

    @Inject
    public b(@k x xVar, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar) {
        this.f158655f = xVar;
        this.f158656g = interfaceC4053a;
        this.f158657h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        x xVar = this.f158655f;
        xVar.getClass();
        Intent intent = new Intent(xVar.f158931a, (Class<?>) FreeDeliveryActivity.class);
        intent.putExtra("FreeDeliveryLink", (FreeDeliveryLink) deepLink);
        this.f158656g.J(intent, C48421d.a(this), new com.avito.android.free_delivery.deeplink.a(1));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f158658i = (y) this.f158657h.Q().N(new a()).t0(new C4634b());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f158658i;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
