package com.avito.android.str_calendar.seller;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.view.x;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.util.g;
import com.avito.android.str_calendar.seller.core.StrSellerCalendarCoreDialogFragment;
import com.avito.android.str_calendar.seller.di.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SellerCalendarActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/str_calendar/seller/SellerCalendarActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/K;", "Lcom/avito/android/str_calendar/seller/di/b;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SellerCalendarActivity extends com.avito.android.ui.activity.a implements K<com.avito.android.str_calendar.seller.di.b>, InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    public com.avito.android.str_calendar.seller.di.b f286660m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f286661n;

    /* compiled from: SellerCalendarActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_calendar/seller/SellerCalendarActivity$a;", "", "<init>", "()V", "", "SHOULD_UPDATE_ADVERT_KEY", "Ljava/lang/String;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SellerCalendarActivity.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/str_calendar/seller/SellerCalendarActivity$b", "Landroidx/activity/x;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            SellerCalendarActivity sellerCalendarActivity = SellerCalendarActivity.this;
            if (sellerCalendarActivity.getSupportFragmentManager().L() > 1) {
                sellerCalendarActivity.getSupportFragmentManager().Y();
            } else {
                sellerCalendarActivity.finish();
            }
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        this.f286660m = com.avito.android.str_calendar.seller.di.a.a().a((c) C29972i.a(C29972i.b(this), c.class), cv.c.a(this));
    }

    @Override // android.app.Activity
    public final void finish() {
        setResult(this.f286661n ? -1 : 0);
        super.finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_container);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("advert_id");
            String stringExtra2 = getIntent().getStringExtra("first_selected_date");
            String stringExtra3 = getIntent().getStringExtra("last_selected_date");
            StrSellerCalendarCoreDialogFragment.f287776l0.getClass();
            g.b(StrSellerCalendarCoreDialogFragment.a.a(stringExtra, stringExtra2, stringExtra3, null, false), this, getSupportFragmentManager(), "StrSellerCalendarCoreDialogFragment");
        }
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(@k Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f286661n = bundle.getBoolean("shouldUpdateAdvertKey");
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldUpdateAdvertKey", this.f286661n);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        getF21241d().a(this, new b());
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.str_calendar.seller.di.b bVar = this.f286660m;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }
}
