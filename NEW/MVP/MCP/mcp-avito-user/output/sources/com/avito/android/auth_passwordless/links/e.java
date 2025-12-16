package com.avito.android.auth_passwordless.links;

import Fc1.E0;
import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.auth_passwordless.AuthPasswordlessLink;
import com.avito.android.beduin.v2.page.m;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kv.C43501a;

/* compiled from: AuthPasswordlessDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auth_passwordless/links/e;", "Lev/a;", "Lcom/avito/android/auth_passwordless/AuthPasswordlessLink;", "a", "_avito_auth-passwordless_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends AbstractC40161a<AuthPasswordlessLink> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f92633j = 0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f92634f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.auth_passwordless.links.a f92635g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27663a f92636h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f92637i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: AuthPasswordlessDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/auth_passwordless/links/e$a;", "", "<init>", "()V", "", "KEY_ACCESS_TOKEN", "Ljava/lang/String;", "KEY_PHONE", "KEY_REFRESH_TOKEN", "KEY_USER_HASH_ID", "KEY_USER_ID", "KEY_USER_NAME", "_avito_auth-passwordless_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.auth_passwordless.links.a aVar2, @Y61.k InterfaceC27663a interfaceC27663a) {
        this.f92634f = aVar;
        this.f92635g = aVar2;
        this.f92636h = interfaceC27663a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        b.a.a(this.f92634f, this.f92635g.a((AuthPasswordlessLink) deepLink), null, null, 6);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f92637i.b(this.f92634f.V9().t0(new l41.g() { // from class: com.avito.android.auth_passwordless.links.e.b
            @Override // l41.g
            public final void accept(Object obj) {
                String string;
                int i12 = e.f92633j;
                e eVar = e.this;
                InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
                if (!(interfaceC14249c instanceof m.c)) {
                    eVar.j(AbstractC14250d.b.f9170c);
                    return;
                }
                Bundle bundle = ((m.c) interfaceC14249c).f105170b;
                if (bundle == null || (string = bundle.getString("accessToken")) == null || string.length() == 0) {
                    return;
                }
                eVar.f92637i.b(InterfaceC27663a.C2131a.b(eVar.f92636h, new Session(string, bundle.getString("refreshToken"), null), new Profile(bundle.getString(ChannelContext.Item.USER_ID), null, bundle.getString("userName"), null, null, null, bundle.getString("phone"), null, false, false, null, null, 0L, 0L, bundle.getString("userHashId"), null, 49082, null), null, null, null, null, 120).v(new E0(eVar, 10), new f(eVar)));
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f92637i.e();
    }
}
