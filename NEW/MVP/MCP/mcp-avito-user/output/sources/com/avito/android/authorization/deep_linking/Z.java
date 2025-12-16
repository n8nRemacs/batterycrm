package com.avito.android.authorization.deep_linking;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.code_confirmation.code_confirmation.model.ConfirmedCodeInfo;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.RegisterLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: RegisterAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/deep_linking/Z;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/RegisterLink;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Z extends AbstractC40161a<RegisterLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f93740f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Zd.i f93741g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final l90.o f93742h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f93743i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f93744j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: RegisterAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "", "test", "(Lkv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T> f93745b = new a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            C43501a c43501a = (C43501a) obj;
            return (c43501a.f413261b instanceof CodeCheckLink.b) && kotlin.jvm.internal.L.f(c43501a.f413260a.f134521b, "register_link.code_check");
        }
    }

    /* compiled from: RegisterAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
            boolean z12 = interfaceC14249c instanceof CodeCheckLink.b.C3493b;
            Z z13 = Z.this;
            if (!z12) {
                z13.j(AbstractC14250d.b.f9170c);
                return;
            }
            ConfirmedCodeInfo confirmedCodeInfo = (ConfirmedCodeInfo) ((CodeCheckLink.b.C3493b) interfaceC14249c).f119267b;
            Intent intentB = z13.f93742h.b();
            String str = confirmedCodeInfo.f119576c;
            Zd.i iVar = z13.f93741g;
            boolean z14 = confirmedCodeInfo.f119577d;
            String str2 = confirmedCodeInfo.f119575b;
            z13.f93740f.R(z14 ? iVar.l(intentB, str2, str) : iVar.a(intentB, str2, str, true), com.avito.android.deeplink_handler.view.b.f134588l);
            z13.j(AbstractC14250d.c.f9171c);
        }
    }

    @Inject
    public Z(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k Zd.i iVar, @Y61.k l90.o oVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f93740f = interfaceC4053a;
        this.f93741g = iVar;
        this.f93742h = oVar;
        this.f93743i = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        b.a.a(this.f93743i, new CodeCheckLink(CodeCheckLink.Flow.Registration.f119255b, null, 2, null), "register_link.code_check", null, 4);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f93744j.b(this.f93743i.d9().N(a.f93745b).t0(new b()));
    }
}
