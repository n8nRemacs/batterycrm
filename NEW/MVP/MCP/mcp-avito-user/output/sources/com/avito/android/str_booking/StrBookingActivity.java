package com.avito.android.str_booking;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.remote.model.AnimationOverlayUrl;
import com.avito.android.str_booking.ui.ScreenType;
import com.avito.android.str_booking.ui.StrBookingFragment;
import com.avito.android.ui.fragments.e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_booking/StrBookingActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrBookingActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final a f285378m = new a(null);

    /* compiled from: StrBookingActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/str_booking/StrBookingActivity$a;", "", "<init>", "()V", "", "ORDER_ID", "Ljava/lang/String;", "SCREEN_TYPE", "START_ANIMATION", "UX_FEEDBACK_EVENT_NAME", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrBookingActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            StrBookingActivity strBookingActivity = StrBookingActivity.this;
            strBookingActivity.setResult(-1);
            strBookingActivity.finish();
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("order_id");
            ScreenType.a aVar = ScreenType.f285864b;
            String stringExtra2 = intent.getStringExtra("screen_type");
            aVar.getClass();
            ScreenType screenTypeA = ScreenType.a.a(stringExtra2);
            String stringExtra3 = intent.getStringExtra("ux_feedback_event_name");
            AnimationOverlayUrl animationOverlayUrl = (AnimationOverlayUrl) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("start_animation", AnimationOverlayUrl.class) : intent.getParcelableExtra("start_animation"));
            if (stringExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            H hE2 = getSupportFragmentManager().e();
            StrBookingFragment.f285867G0.getClass();
            StrBookingFragment strBookingFragment = new StrBookingFragment();
            Bundle bundleM = com.avito.android.actions_sheet.a.m("order_id", stringExtra);
            bundleM.putString("screen_type", screenTypeA.name());
            bundleM.putString("ux_feedback_event_name", stringExtra3);
            bundleM.putParcelable("start_animation", animationOverlayUrl);
            strBookingFragment.setArguments(bundleM);
            hE2.n(android.R.id.content, strBookingFragment, null);
            hE2.e();
        }
        e.b(this, getSupportFragmentManager(), new b());
    }
}
