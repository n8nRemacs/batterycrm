package com.avito.android.profile_vk_linking.common.deep_linking;

import Kc0.C14297a;
import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ProfileVkLinkingGroupManagementLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/deep_linking/c;", "Lev/a;", "Lcom/avito/android/profile_vk_linking/common/deep_linking/ProfileVkLinkingGroupManagementLink;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c extends AbstractC40161a<ProfileVkLinkingGroupManagementLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.profile_vk_linking.common.c f230966f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f230967g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f230968h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public y f230969i;

    /* compiled from: ProfileVkLinkingGroupManagementLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(c.this);
        }
    }

    /* compiled from: ProfileVkLinkingGroupManagementLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            if (((C47918a) obj).f437156b == -1) {
                c.this.j(C14297a.f9538b);
            }
        }
    }

    @Inject
    public c(@k com.avito.android.profile_vk_linking.common.c cVar, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar) {
        this.f230966f = cVar;
        this.f230967g = interfaceC4053a;
        this.f230968h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        Intent intentC = this.f230966f.c();
        intentC.setFlags(603979776);
        this.f230967g.J(intentC, C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f230969i = (y) this.f230968h.Q().N(new a()).t0(new b());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        y yVar = this.f230969i;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }
}
