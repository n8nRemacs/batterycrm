package com.avito.android.safety.safety_settings.deeplink;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.PasswordSettingLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import fo0.InterfaceC40455a;
import javax.inject.Inject;
import kotlin.Metadata;
import l90.l;
import rv.C47918a;
import sv.C48421d;

/* compiled from: PasswordSettingAsyncLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/safety_settings/deeplink/d;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/PasswordSettingLink;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends AbstractC40161a<PasswordSettingLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40455a f257561f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f257562g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f257563h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f257564i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PasswordSettingAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(d.this);
        }
    }

    /* compiled from: PasswordSettingAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C47918a c47918a = (C47918a) obj;
            d dVar = d.this;
            if (c47918a.f437156b != -1) {
                dVar.j(l.a.f413557b);
            } else {
                Intent intent = c47918a.f437157c;
                dVar.j(new l.b(intent != null ? intent.getStringExtra("password_change_result") : null, intent != null ? intent.getBooleanExtra("update_profile", false) : false));
            }
        }
    }

    @Inject
    public d(@Y61.k InterfaceC40455a interfaceC40455a, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar) {
        this.f257561f = interfaceC40455a;
        this.f257562g = interfaceC4053a;
        this.f257563h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f257562g.J(this.f257561f.b(), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f257564i.b(this.f257563h.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f257564i.e();
    }
}
