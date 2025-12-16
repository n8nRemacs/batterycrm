package com.avito.android.beduin.ui.screen.deeplink;

import Ju.AbstractC14250d;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.beduin.ui.screen.BeduinScreenActivity;
import com.avito.android.beduin.ui.screen.BeduinScreenRootOpenParams;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: BeduinScreenLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/ui/screen/deeplink/a;", "Lev/a;", "Lcom/avito/android/beduin/ui/screen/deeplink/BeduinScreenLink;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC40161a<BeduinScreenLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f104099f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f104100g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f104101h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f104102i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: BeduinScreenLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.beduin.ui.screen.deeplink.a$a, reason: collision with other inner class name */
    public static final class C3118a<T> implements r {
        public C3118a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: BeduinScreenLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a.this.j(AbstractC14250d.b.f9170c);
        }
    }

    @Inject
    public a(@k Context context, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar) {
        this.f104099f = context;
        this.f104100g = interfaceC4053a;
        this.f104101h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        BeduinScreenLink beduinScreenLink = (BeduinScreenLink) deepLink;
        BeduinScreenRootOpenParams beduinScreenRootOpenParams = new BeduinScreenRootOpenParams(beduinScreenLink.f104097b, beduinScreenLink.f104098c);
        BeduinScreenActivity.f104068c.getClass();
        this.f104100g.J(new Intent(this.f104099f, (Class<?>) BeduinScreenActivity.class).putExtra("open_params", beduinScreenRootOpenParams), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f104102i.b(this.f104101h.Q().N(new C3118a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f104102i.e();
    }
}
