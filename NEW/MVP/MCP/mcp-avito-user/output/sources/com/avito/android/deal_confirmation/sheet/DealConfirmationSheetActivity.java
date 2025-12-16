package com.avito.android.deal_confirmation.sheet;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deal_confirmation.sheet.c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.DealConfirmationSheet;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DealConfirmationSheetActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deal_confirmation/sheet/DealConfirmationSheetActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/deal_confirmation/sheet/c$b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_deal-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DealConfirmationSheetActivity extends com.avito.android.ui.activity.a implements c.b, InterfaceC28477j.b {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final a f132774r = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f132775m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f132776n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public c f132777o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f132778p = true;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f132779q = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DealConfirmationSheetActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/deal_confirmation/sheet/DealConfirmationSheetActivity$a;", "", "<init>", "()V", "", "KEY_SHEET_DATA", "Ljava/lang/String;", "RESULT_KEY_MESSAGE", "STATE_KEY_BUTTONS_ENABLED", "_avito_deal-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DealConfirmationSheetActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "forceClose", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Boolean, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DealConfirmationSheet f132781m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DealConfirmationSheet dealConfirmationSheet) {
            super(1);
            this.f132781m = dealConfirmationSheet;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            DealConfirmationSheetActivity dealConfirmationSheetActivity = DealConfirmationSheetActivity.this;
            if (!zBooleanValue) {
                dealConfirmationSheetActivity.a(this.f132781m.getCloseButton().getDeepLink());
            }
            dealConfirmationSheetActivity.f132777o = null;
            dealConfirmationSheetActivity.finish();
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.deal_confirmation_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.deal_confirmation.di.a.a().a((com.avito.android.deal_confirmation.di.c) C29972i.a(C29972i.b(this), com.avito.android.deal_confirmation.di.c.class), s.a(this), cv.c.a(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f132776n;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final void a(@Y61.k DeepLink deepLink) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f132775m;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, null, 6);
        this.f132778p = false;
        c cVar = this.f132777o;
        if (cVar != null) {
            cVar.V(false);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f132776n;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f132775m;
        if (aVar == null) {
            aVar = null;
        }
        this.f132779q.b(aVar.d9().j0(io.reactivex.rxjava3.android.schedulers.b.b()).t0(new h(this)));
        Intent intent = getIntent();
        DealConfirmationSheet dealConfirmationSheet = (DealConfirmationSheet) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key.deal_confirmation_sheet", DealConfirmationSheet.class) : intent.getParcelableExtra("key.deal_confirmation_sheet"));
        this.f132778p = bundle != null ? bundle.getBoolean("state_key.buttons_enabled", true) : true;
        if (dealConfirmationSheet == null) {
            ScreenPerformanceTracker screenPerformanceTracker2 = this.f132776n;
            (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
            finish();
            return;
        }
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f132776n;
        if (screenPerformanceTracker3 == null) {
            screenPerformanceTracker3 = null;
        }
        c cVar = new c(this, dealConfirmationSheet, new b(dealConfirmationSheet), screenPerformanceTracker3);
        cVar.V(this.f132778p);
        com.avito.android.lib.util.g.a(cVar);
        this.f132777o = cVar;
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f132776n;
        (screenPerformanceTracker4 != null ? screenPerformanceTracker4 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        this.f132779q.e();
        super.onDestroy();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("state_key.buttons_enabled", this.f132778p);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        c cVar = this.f132777o;
        if (cVar != null) {
            cVar.f132787H = this;
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        super.onStop();
        c cVar = this.f132777o;
        if (cVar != null) {
            cVar.f132787H = null;
        }
    }
}
