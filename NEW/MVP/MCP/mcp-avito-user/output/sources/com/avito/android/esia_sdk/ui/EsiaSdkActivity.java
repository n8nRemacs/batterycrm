package com.avito.android.esia_sdk.ui;

import Cd.C13243a;
import Kz.C14363a;
import Lz.AbstractC14457a;
import Lz.AbstractC14459c;
import Lz.C14460d;
import Y61.k;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.esia_sdk.mvi.l;
import com.avito.android.util.C35809h6;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: EsiaSdkActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/esia_sdk/ui/EsiaSdkActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EsiaSdkActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f148156q = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public l f148157m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public C14363a f148159o;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f148158n = new O0(m0.f406844a.b(com.avito.android.esia_sdk.mvi.k.class), new e(), new d(new g()), new f());

    /* renamed from: p, reason: collision with root package name */
    @k
    public final com.esiasdk.android.esiaLoginClient.a f148160p = new com.esiasdk.android.esiaLoginClient.a();

    /* compiled from: EsiaSdkActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/esia_sdk/ui/EsiaSdkActivity$a;", "", "<init>", "()V", "", "CODE_DEEPLINK_PARAM_NAME", "Ljava/lang/String;", "EXTRA_AUTH_URL", "EXTRA_RESULT_DEEPLINK", "EXTRA_RETRY_DEEPLINK", "RETRY_DEEPLINK_PARAM_NAME", "STATE_DEEPLINK_PARAM_NAME", "_avito_gig_esia-sdk_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EsiaSdkActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<AbstractC14459c, G0> {
        @Override // Y41.l
        public final G0 invoke(AbstractC14459c abstractC14459c) {
            AbstractC14459c abstractC14459c2 = abstractC14459c;
            EsiaSdkActivity esiaSdkActivity = (EsiaSdkActivity) this.receiver;
            int i12 = EsiaSdkActivity.f148156q;
            esiaSdkActivity.getClass();
            if (L.f(abstractC14459c2, AbstractC14459c.a.f10324a)) {
                esiaSdkActivity.finish();
            } else if (abstractC14459c2 instanceof AbstractC14459c.b) {
                com.esiasdk.android.esiaLoginClient.f fVar = com.esiasdk.android.esiaLoginClient.f.f339706a;
                AbstractC14459c.b bVar = (AbstractC14459c.b) abstractC14459c2;
                String str = bVar.f10326b;
                fVar.getClass();
                com.esiasdk.android.esiaLoginClient.f.a(esiaSdkActivity, bVar.f10325a, str, bVar.f10327c);
            } else if (abstractC14459c2 instanceof AbstractC14459c.C0654c) {
                C14363a c14363a = esiaSdkActivity.f148159o;
                if (c14363a == null) {
                    c14363a = null;
                }
                c14363a.getClass();
                c14363a.f9744a.c(new com.avito.android.social.esia.a("gig", ((AbstractC14459c.C0654c) abstractC14459c2).f10328a));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EsiaSdkActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLz/d;", "it", "Lkotlin/G0;", "invoke", "(LLz/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C14460d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f148161l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C14460d c14460d) {
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f148162l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f148162l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f148162l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return EsiaSdkActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return EsiaSdkActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: EsiaSdkActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/esia_sdk/mvi/k;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/esia_sdk/mvi/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<com.avito.android.esia_sdk.mvi.k> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.esia_sdk.mvi.k invoke() {
            l lVar = EsiaSdkActivity.this.f148157m;
            if (lVar == null) {
                lVar = null;
            }
            return (com.avito.android.esia_sdk.mvi.k) lVar.get();
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.esia_sdk.di.a.a().a((com.avito.android.esia_sdk.di.c) C29972i.a(C29972i.b(this), Object.class), cv.c.a(this)).a(this);
    }

    public final void a2(String str, String str2, String str3) {
        b2().accept(new AbstractC14457a.C0652a(C35809h6.c(C35809h6.c(C35809h6.c(Uri.parse(str), "authCode", str2), "authState", str3), "retryEsiaLink", String.valueOf(getIntent().getStringExtra("RETRY_DEEPLINK_PARAM_NAME")))));
    }

    public final com.avito.android.esia_sdk.mvi.k b2() {
        return (com.avito.android.esia_sdk.mvi.k) this.f148158n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    @InterfaceC42830m
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        if (this.f148160p.a(i12, i13, intent)) {
            return;
        }
        super.onActivityResult(i12, i13, intent);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        String stringExtra2 = getIntent().getStringExtra("EXTRA_RESULT_DEEPLINK");
        if (stringExtra2 != null) {
            com.esiasdk.android.esiaLoginClient.f fVar = com.esiasdk.android.esiaLoginClient.f.f339706a;
            com.avito.android.esia_sdk.ui.a aVar = new com.avito.android.esia_sdk.ui.a(this, stringExtra2);
            fVar.getClass();
            this.f148160p.f339702a = new com.esiasdk.android.esiaLoginClient.e(aVar);
        }
        if (bundle == null && (stringExtra = getIntent().getStringExtra("EXTRA_AUTH_URL")) != null) {
            b2().accept(new AbstractC14457a.b(stringExtra));
        }
        com.avito.android.arch.mvi.android.f.a(b2(), this, Lifecycle.State.f46681d, new b(1, this, EsiaSdkActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/esia_sdk/models/EsiaSdkOneTimeEvent;)V", 0), c.f148161l);
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        com.esiasdk.android.esiaLoginClient.f.f339706a.getClass();
        this.f148160p.f339702a = null;
        super.onDestroy();
    }
}
