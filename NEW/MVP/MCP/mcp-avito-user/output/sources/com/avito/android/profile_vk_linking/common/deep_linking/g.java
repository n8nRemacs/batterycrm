package com.avito.android.profile_vk_linking.common.deep_linking;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.profile_vk_linking.common.deep_linking.ProfileVkRequestTokenLink;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ProfileVkRequestTokenLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/deep_linking/g;", "Lev/a;", "Lcom/avito/android/profile_vk_linking/common/deep_linking/ProfileVkRequestTokenLink;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends AbstractC40161a<ProfileVkRequestTokenLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.profile_vk_linking.common.c f230990f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f230991g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f230992h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public y f230993i;

    /* compiled from: ProfileVkRequestTokenLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(g.this);
        }
    }

    /* compiled from: ProfileVkRequestTokenLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C47918a c47918a = (C47918a) obj;
            int i12 = c47918a.f437156b;
            g gVar = g.this;
            if (i12 != -1) {
                gVar.j(ProfileVkRequestTokenLink.c.a.f230954b);
                return;
            }
            Intent intent = c47918a.f437157c;
            String stringExtra = intent != null ? intent.getStringExtra("key_result_code") : null;
            String stringExtra2 = intent != null ? intent.getStringExtra("key_result_state") : null;
            if (stringExtra == null || stringExtra2 == null) {
                gVar.j(ProfileVkRequestTokenLink.c.a.f230954b);
            } else {
                gVar.j(new ProfileVkRequestTokenLink.c.b(stringExtra, stringExtra2));
            }
        }
    }

    @Inject
    public g(@k com.avito.android.profile_vk_linking.common.c cVar, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar) {
        this.f230990f = cVar;
        this.f230991g = interfaceC4053a;
        this.f230992h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f230991g.J(this.f230990f.d(((ProfileVkRequestTokenLink) deepLink).f230953b), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f230993i = (y) this.f230992h.Q().N(new a()).t0(new b());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f230993i;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
