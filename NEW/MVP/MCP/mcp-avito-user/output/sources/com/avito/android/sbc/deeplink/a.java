package com.avito.android.sbc.deeplink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DiscountDispatchDeeplink;
import com.avito.android.deep_linking.links.InterfaceC29688n;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.sbc.create.CreateDiscountDispatchActivity;
import com.avito.android.sbc.create.mvi.CreateDiscountDispatchActivityArgs;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: DiscountDispatchDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sbc/deeplink/a;", "Lcom/avito/android/deep_linking/links/DiscountDispatchDeeplink;", "DeeplinkT", "Lev/a;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a<DeeplinkT extends DiscountDispatchDeeplink> extends AbstractC40161a<DeeplinkT> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f259950f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.b f259951g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Context f259952h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f259953i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DiscountDispatchDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DiscountDispatchDeeplink;", "DeeplinkT", "Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.sbc.deeplink.a$a, reason: collision with other inner class name */
    public static final class C7792a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a<DeeplinkT> f259954b;

        public C7792a(a<DeeplinkT> aVar) {
            this.f259954b = aVar;
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(this.f259954b);
        }
    }

    /* compiled from: DiscountDispatchDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DiscountDispatchDeeplink;", "DeeplinkT", "Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a<DeeplinkT> f259955b;

        public b(a<DeeplinkT> aVar) {
            this.f259955b = aVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f259955b.j(((C47918a) obj).f437156b == -1 ? InterfaceC29688n.b.f134016b : InterfaceC29688n.a.f134015b);
        }
    }

    @Inject
    public a(@Y61.k Context context, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar) {
        this.f259950f = interfaceC4053a;
        this.f259951g = bVar;
        this.f259952h = context;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DiscountDispatchDeeplink discountDispatchDeeplink = (DiscountDispatchDeeplink) deepLink;
        String f133273b = discountDispatchDeeplink.getF133273b();
        String f133274c = discountDispatchDeeplink.getF133274c();
        String f133275d = discountDispatchDeeplink.getF133275d();
        Intent intent = new Intent(this.f259952h, (Class<?>) CreateDiscountDispatchActivity.class);
        intent.putExtra("activity_create_discount_dispatch_args", new CreateDiscountDispatchActivityArgs(f133273b, f133274c, f133275d));
        this.f259950f.J(intent, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f259953i.b(this.f259951g.Q().N(new C7792a(this)).t0(new b(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f259953i.e();
    }
}
