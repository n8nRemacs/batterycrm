package com.avito.android.vas_planning.remove.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.vas_planning.deeplink.VasPlannerRemoveLink;
import com.avito.android.vas_planning.remove.h;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.o;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: VasPlannerRemoveDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning/remove/deeplink/a;", "Lev/a;", "Lcom/avito/android/vas_planning/deeplink/VasPlannerRemoveLink;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends AbstractC40161a<VasPlannerRemoveLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f322478f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final h f322479g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f322480h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f322481i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: VasPlannerRemoveDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.vas_planning.remove.deeplink.a$a, reason: collision with other inner class name */
    public static final class C9968a<T> implements r {
        public C9968a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: VasPlannerRemoveDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lcom/avito/android/vas_planning/deeplink/VasPlannerRemoveLink$b;", "apply", "(Lrv/a;)Lcom/avito/android/vas_planning/deeplink/VasPlannerRemoveLink$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            C47918a c47918a = (C47918a) obj;
            Intent intent = c47918a.f437157c;
            a aVar = a.this;
            int i12 = c47918a.f437156b;
            h hVar = aVar.f322479g;
            return i12 == -1 ? new VasPlannerRemoveLink.b.a(hVar.c(intent)) : new VasPlannerRemoveLink.b.C9962b(hVar.a(intent));
        }
    }

    @Inject
    public a(@k a.b bVar, @k h hVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f322478f = bVar;
        this.f322479g = hVar;
        this.f322480h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        VasPlannerRemoveLink vasPlannerRemoveLink = (VasPlannerRemoveLink) deepLink;
        this.f322480h.J(this.f322479g.b(vasPlannerRemoveLink.f322251b, vasPlannerRemoveLink.f322252c, vasPlannerRemoveLink.f322253d, vasPlannerRemoveLink.f322254e), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f322481i.b(this.f322478f.Q().N(new C9968a()).d0(new b()).t0(new g() { // from class: com.avito.android.vas_planning.remove.deeplink.a.c
            @Override // l41.g
            public final void accept(Object obj) {
                a.this.j((InterfaceC14249c.b) obj);
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f322481i.e();
    }
}
