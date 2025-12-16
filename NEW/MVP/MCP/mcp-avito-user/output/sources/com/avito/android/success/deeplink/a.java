package com.avito.android.success.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: SuccessDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/success/deeplink/a;", "Lev/a;", "Lcom/avito/android/success/deeplink/SuccessLink;", "a", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends AbstractC40161a<SuccessLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.success.c f291570f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f291571g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f291572h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final a.b f291573i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f291574j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f291575k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: SuccessDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/success/deeplink/a$a;", "", "<init>", "()V", "a", "b", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.success.deeplink.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC8820a {

        /* compiled from: SuccessDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/success/deeplink/a$a$a;", "LJu/c$a;", "<init>", "()V", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.success.deeplink.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C8821a implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C8821a f291576b = new C8821a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C8821a);
            }

            public final int hashCode() {
                return 1805869275;
            }

            @k
            public final String toString() {
                return "Cancelled";
            }
        }

        /* compiled from: SuccessDeeplinkHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/success/deeplink/a$a$b;", "LJu/c$b;", "<init>", "()V", "_avito_success_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.success.deeplink.a$a$b */
        public static final /* data */ class b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final b f291577b = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 931975693;
            }

            @k
            public final String toString() {
                return "Success";
            }
        }

        public /* synthetic */ AbstractC8820a(C42822w c42822w) {
            this();
        }

        public AbstractC8820a() {
        }
    }

    /* compiled from: SuccessDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: SuccessDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C47918a c47918a = (C47918a) obj;
            a aVar = a.this;
            SuccessLink successLinkC = aVar.c();
            DeepLink deepLink = successLinkC != null ? successLinkC.f291569c : null;
            if (c47918a.f437156b != 0 || deepLink == null) {
                aVar.j(AbstractC8820a.b.f291577b);
            } else {
                aVar.i(AbstractC8820a.C8821a.f291576b, aVar.f291574j, deepLink);
            }
        }
    }

    @Inject
    public a(@k com.avito.android.success.c cVar, @k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a, @k a.b bVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f291570f = cVar;
        this.f291571g = interfaceC4053a;
        this.f291572h = c25719a;
        this.f291573i = bVar;
        this.f291574j = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        SuccessLink successLink = (SuccessLink) deepLink;
        this.f291572h.a(successLink, this, AuthSource.f92701f0, new com.avito.android.success.deeplink.b(this, successLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f291575k.b(this.f291573i.Q().N(new b()).t0(new c()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f291575k.e();
    }
}
