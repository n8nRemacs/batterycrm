package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.auth_plugin;

import A3.a;
import NL.d;
import Y61.k;
import Y61.l;
import com.avito.android.util.V2;
import ig0.AbstractC41398a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l41.g;
import l41.o;

/* compiled from: IacAuthorizationPlugin.kt */
@C11.a
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/update/auth_plugin/a;", "LA3/b;", "a", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements A3.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final OL.a f168337a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a f168338b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f168339c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.a f168340d;

    /* compiled from: IacAuthorizationPlugin.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/update/auth_plugin/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.auth_plugin.a$a, reason: collision with other inner class name */
    public static final class C4977a {
        public /* synthetic */ C4977a(C42822w c42822w) {
            this();
        }

        public C4977a() {
        }
    }

    /* compiled from: IacAuthorizationPlugin.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNL/c;", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(LNL/c;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return a.this.f168340d.a(AbstractC41398a.e.f398618c);
        }
    }

    /* compiled from: IacAuthorizationPlugin.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f168342b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("IacAuthorizationPlugin", "Can't update options and iac", (Throwable) obj);
        }
    }

    static {
        new C4977a(null);
    }

    @Inject
    public a(@k OL.a aVar, @k com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.a aVar2, @k d dVar, @k com.avito.android.iac_incoming_call_ability.impl_module.iac_enable.update.a aVar3) {
        this.f168337a = aVar;
        this.f168338b = aVar2;
        this.f168339c = dVar;
        this.f168340d = aVar3;
    }

    @Override // A3.b
    public final void i(@k a.b bVar) {
        V2.f318762a.c("IacAuthorizationPlugin", "onLogout", null);
        this.f168337a.a();
        this.f168338b.a();
    }

    @Override // A3.b
    public final void l(@k a.InterfaceC0003a.b bVar) {
        this.f168339c.a().o(new b()).l(c.f168342b).r().u();
    }

    @Override // A3.b
    public final void d(@k a.InterfaceC0003a.C0004a c0004a) {
    }

    @Override // A3.b
    public final void e(@k a.InterfaceC0003a.c cVar) {
    }

    @Override // A3.b
    public final void p(@k a.InterfaceC0003a.d dVar) {
    }

    @Override // A3.b
    public final void m(@l Boolean bool, @k String str) {
    }
}
