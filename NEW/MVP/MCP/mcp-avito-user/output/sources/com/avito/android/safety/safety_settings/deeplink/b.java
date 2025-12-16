package com.avito.android.safety.safety_settings.deeplink;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.PasswordChangeLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import fo0.InterfaceC40455a;
import javax.inject.Inject;
import kotlin.Metadata;
import l90.l;
import nI0.InterfaceC44261b;
import po0.InterfaceC47119a;
import rv.C47918a;
import sv.C48421d;

/* compiled from: PasswordChangeAsyncLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/safety_settings/deeplink/b;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/PasswordChangeLink;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends AbstractC40161a<PasswordChangeLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40455a f257546f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44261b f257547g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47119a f257548h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f257549i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.b f257550j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C25719a f257551k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f257552l = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PasswordChangeAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    @Inject
    public b(@Y61.k InterfaceC40455a interfaceC40455a, @Y61.k InterfaceC44261b interfaceC44261b, @Y61.k InterfaceC47119a interfaceC47119a, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k C25719a c25719a) {
        this.f257546f = interfaceC40455a;
        this.f257547g = interfaceC44261b;
        this.f257548h = interfaceC47119a;
        this.f257549i = interfaceC4053a;
        this.f257550j = bVar;
        this.f257551k = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        PasswordChangeLink passwordChangeLink = (PasswordChangeLink) deepLink;
        this.f257551k.b(passwordChangeLink, this, null, new com.avito.android.safety.safety_settings.deeplink.a(bundle, this, passwordChangeLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f257552l.b(this.f257550j.Q().N(new a()).t0(new l41.g() { // from class: com.avito.android.safety.safety_settings.deeplink.b.b
            @Override // l41.g
            public final void accept(Object obj) {
                C47918a c47918a = (C47918a) obj;
                b bVar = b.this;
                if (c47918a.f437156b != -1) {
                    bVar.j(l.a.f413557b);
                } else {
                    Intent intent = c47918a.f437157c;
                    bVar.j(new l.b(intent != null ? intent.getStringExtra("password_change_result") : null, intent != null ? intent.getBooleanExtra("update_profile", false) : false));
                }
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f257552l.e();
    }
}
