package com.avito.android.tariff_lf_constructor.configure.creating.standard;

import Y41.p;
import Y61.k;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.H;
import com.adjust.sdk.Constants;
import com.avito.android.CalledFrom;
import com.avito.android.L;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.util.g;
import com.avito.android.tariff_lf_constructor.configure.MnzTariffConstructorScreen;
import com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l;
import com.avito.android.tariff_lf_constructor.configure.creating.standard.di.a;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35967w2;
import gD0.InterfaceC40574b;
import hD0.AbstractC40809a;
import hD0.InterfaceC40810b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import qD0.C47283a;

/* compiled from: ConstructorTariffActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/creating/standard/ConstructorTariffActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/tariff_lf_constructor/configure/creating/bottom_sheet/l;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConstructorTariffActivity extends com.avito.android.ui.activity.a implements l, InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC40810b f299595m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f299596n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public L f299597o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public C47283a f299598p;

    /* compiled from: ConstructorTariffActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/creating/standard/ConstructorTariffActivity$a;", "", "<init>", "()V", "", "KEY_DEEPLINK", "Ljava/lang/String;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ConstructorTariffActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "dialog", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<a.b, DialogInterface, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C47283a f299599l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ConstructorTariffActivity f299600m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C47283a c47283a, ConstructorTariffActivity constructorTariffActivity) {
            super(2);
            this.f299599l = c47283a;
            this.f299600m = constructorTariffActivity;
        }

        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            C47283a c47283a = this.f299599l;
            bVar2.setTitle(c47283a.getTitle());
            bVar2.setSubtitle(c47283a.getSubtitle());
            bVar2.setButtonsOrientation(1);
            bVar2.setCloseButtonVisible(true);
            bVar2.L3(c47283a.getPrimaryButtonText(), new com.avito.android.tariff_lf_constructor.configure.creating.standard.a(dialogInterface));
            bVar2.M3(c47283a.getSecondaryButtonText(), new com.avito.android.tariff_lf_constructor.configure.creating.standard.b(this.f299600m));
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l
    public final void O0(@Y61.l Intent intent) {
        setResult(-1, intent);
        finish();
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l
    public final void P0(@k C47283a c47283a) {
        this.f299598p = c47283a;
    }

    public final void a2(Intent intent, boolean z12) {
        DeepLink deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra(Constants.DEEPLINK, DeepLink.class) : intent.getParcelableExtra(Constants.DEEPLINK));
        if (deepLink != null) {
            InterfaceC40810b interfaceC40810b = this.f299595m;
            if (interfaceC40810b == null) {
                interfaceC40810b = null;
            }
            AbstractC40809a abstractC40809aA = interfaceC40810b.a(deepLink);
            if (abstractC40809aA instanceof AbstractC40809a.b) {
                BaseFragment baseFragment = ((AbstractC40809a.b) abstractC40809aA).f397120a;
                H hE2 = getSupportFragmentManager().e();
                hE2.n(R.id.container, baseFragment, null);
                if (z12) {
                    hE2.c(baseFragment.getClass().getCanonicalName());
                }
                hE2.f();
            }
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().L() == 0) {
            Intent intent = this.f304538c;
            if (intent != null) {
                startActivity(intent);
            }
            if (C35967w2.a(getIntent()) instanceof CalledFrom.Push) {
                L l12 = this.f299597o;
                if (l12 == null) {
                    l12 = null;
                }
                startActivity(L.a.a(l12, null, 3));
            }
        }
        super.onBackPressed();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        a.InterfaceC9161a interfaceC9161aA = com.avito.android.tariff_lf_constructor.configure.creating.standard.di.b.a();
        interfaceC9161aA.c((InterfaceC40574b) C29972i.a(C29972i.b(this), Object.class));
        interfaceC9161aA.a(cv.c.a(this));
        interfaceC9161aA.d(MnzTariffConstructorScreen.f299321d);
        interfaceC9161aA.b(getResources());
        interfaceC9161aA.build().a(this);
        super.onCreate(bundle);
        setContentView(R.layout.constructor_tariff_activity);
        if (bundle == null) {
            a2(getIntent(), false);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        a2(intent, true);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l
    public final void x0(boolean z12) {
        G0 g02;
        if (!z12) {
            finish();
            return;
        }
        C47283a c47283a = this.f299598p;
        if (c47283a != null) {
            g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, this, new b(c47283a, this)));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            finish();
        }
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.creating.bottom_sheet.l
    public final void y(@k DeepLink deepLink) {
        InterfaceC40810b interfaceC40810b = this.f299595m;
        if (interfaceC40810b == null) {
            interfaceC40810b = null;
        }
        AbstractC40809a abstractC40809aA = interfaceC40810b.a(deepLink);
        if (abstractC40809aA instanceof AbstractC40809a.b) {
            BaseFragment baseFragment = ((AbstractC40809a.b) abstractC40809aA).f397120a;
            H hE2 = getSupportFragmentManager().e();
            hE2.n(R.id.container, baseFragment, null);
            hE2.c(baseFragment.getClass().getCanonicalName());
            hE2.f();
            return;
        }
        if (abstractC40809aA instanceof AbstractC40809a.C11249a) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f299596n;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLink, null, null, 6);
        }
    }
}
