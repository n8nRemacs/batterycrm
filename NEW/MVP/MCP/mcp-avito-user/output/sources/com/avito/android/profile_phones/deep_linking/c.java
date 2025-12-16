package com.avito.android.profile_phones.deep_linking;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import ae.C19873a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.N1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.code_confirmation.code_confirmation.RequestCodeV2Source;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.MobilePhoneVerificationLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: MobilePhoneVerificationAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/deep_linking/c;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/MobilePhoneVerificationLink;", "a", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends AbstractC40161a<MobilePhoneVerificationLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.b f227114f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f227115g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final N1 f227116h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f227117i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f227118j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f227119k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: MobilePhoneVerificationAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/deep_linking/c$a;", "", "a", "b", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: MobilePhoneVerificationAsyncLinkHandler.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_phones/deep_linking/c$a$a;", "LJu/c$b;", "LJu/a$a;", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile_phones.deep_linking.c$a$a, reason: collision with other inner class name */
        public static final class C6899a implements InterfaceC14249c.b, InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C6899a f227120b = new C6899a();
        }

        /* compiled from: MobilePhoneVerificationAsyncLinkHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/deep_linking/c$a$b;", "LJu/c$b;", "LJu/a$b;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements InterfaceC14249c.b, InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f227121b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final DeepLink f227122c;

            public b(@Y61.l String str, @Y61.l DeepLink deepLink) {
                this.f227121b = str;
                this.f227122c = deepLink;
            }
        }
    }

    /* compiled from: MobilePhoneVerificationAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(c.this);
        }
    }

    /* compiled from: MobilePhoneVerificationAsyncLinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.profile_phones.deep_linking.c$c, reason: collision with other inner class name */
    public static final class C6900c<T> implements l41.g {
        public C6900c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C47918a c47918a = (C47918a) obj;
            int i12 = c47918a.f437156b;
            c cVar = c.this;
            if (i12 != -1) {
                cVar.j(a.C6899a.f227120b);
                return;
            }
            DeepLink deepLink = null;
            Intent intent = c47918a.f437157c;
            String stringExtra = intent != null ? intent.getStringExtra("result_message") : null;
            if (intent != null) {
                deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("result_link", DeepLink.class) : intent.getParcelableExtra("result_link"));
            }
            cVar.j(new a.b(stringExtra, deepLink));
        }
    }

    @Inject
    public c(@Y61.k a.b bVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k N1 n12, @Y61.k InterfaceC28373a interfaceC28373a, @N3.c @Y61.k InterfaceC35945t1<String> interfaceC35945t1) {
        this.f227114f = bVar;
        this.f227115g = interfaceC4053a;
        this.f227116h = n12;
        this.f227117i = interfaceC28373a;
        this.f227118j = interfaceC35945t1;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        MobilePhoneVerificationLink mobilePhoneVerificationLink = (MobilePhoneVerificationLink) deepLink;
        this.f227117i.c(new C19873a(mobilePhoneVerificationLink.f133919b, CodeConfirmationSource.f92763k));
        String strA = this.f227118j.a(mobilePhoneVerificationLink.f133919b);
        RequestCodeV2Source requestCodeV2Source = RequestCodeV2Source.f119426c;
        this.f227115g.J(this.f227116h.b(strA, "profile:verification", true), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f227119k.b(this.f227114f.Q().N(new b()).t0(new C6900c()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f227119k.e();
    }
}
