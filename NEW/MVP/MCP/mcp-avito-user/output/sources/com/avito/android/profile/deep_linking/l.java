package com.avito.android.profile.deep_linking;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.PasswordUpgradeLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import rv.C47918a;
import sv.C48421d;

/* compiled from: PasswordUpgradeAsyncLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/deep_linking/l;", "Lev/a;", "Lcom/avito/android/deep_linking/links/auth/PasswordUpgradeLink;", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends AbstractC40161a<PasswordUpgradeLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Zd.i f221910f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f221911g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f221912h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f221913i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PasswordUpgradeAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/deep_linking/l$a;", "LJu/c$b;", "a", "b", "Lcom/avito/android/profile/deep_linking/l$a$a;", "Lcom/avito/android/profile/deep_linking/l$a$b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a extends InterfaceC14249c.b {

        /* compiled from: PasswordUpgradeAsyncLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/deep_linking/l$a$a;", "Lcom/avito/android/profile/deep_linking/l$a;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile.deep_linking.l$a$a, reason: collision with other inner class name */
        public static final class C6715a implements a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C6715a f221914b = new C6715a();
        }

        /* compiled from: PasswordUpgradeAsyncLinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/deep_linking/l$a$b;", "Lcom/avito/android/profile/deep_linking/l$a;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f221915b = new b();
        }
    }

    /* compiled from: PasswordUpgradeAsyncLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(l.this);
        }
    }

    @Inject
    public l(@Y61.k Zd.i iVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar) {
        this.f221910f = iVar;
        this.f221911g = interfaceC4053a;
        this.f221912h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        PasswordUpgradeLink passwordUpgradeLink = (PasswordUpgradeLink) deepLink;
        this.f221911g.J(this.f221910f.k(passwordUpgradeLink.f133930b, passwordUpgradeLink.f133931c, passwordUpgradeLink.f133932d), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f221913i.b(this.f221912h.Q().N(new b()).t0(new l41.g() { // from class: com.avito.android.profile.deep_linking.l.c
            @Override // l41.g
            public final void accept(Object obj) {
                l lVar = l.this;
                if (((C47918a) obj).f437156b == -1) {
                    lVar.j(a.b.f221915b);
                } else {
                    lVar.j(a.C6715a.f221914b);
                }
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f221913i.e();
    }
}
