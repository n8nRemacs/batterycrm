package com.avito.android.subscriptions_settings;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.subscriptions_settings.SubscriptionSettingsState;
import com.avito.android.util.D6;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: SubscriptionSettingsViewRedesignImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/subscriptions_settings/j;", "Lcom/avito/android/subscriptions_settings/a;", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f291527b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f291528c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public View f291529d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public ImageView f291530e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public TextView f291531f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public ProgressBar f291532g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public View f291533h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public ImageView f291534i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public TextView f291535j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public ProgressBar f291536k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public View f291537l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f291538m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public SubscriptionSettingsState f291539n = new SubscriptionSettingsState(SubscriptionSettingsState.NotificationState.f291488b, SubscriptionSettingsState.SubscriptionState.f291492b, SubscriptionSettingsState.EnabledState.f291484b);

    /* renamed from: o, reason: collision with root package name */
    public boolean f291540o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f291541p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final e2 f291542q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final e2 f291543r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final e2 f291544s;

    public j(@k Context context, @k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f291527b = context;
        this.f291528c = screenPerformanceTracker;
        BufferOverflow bufferOverflow = BufferOverflow.f410778c;
        this.f291542q = f2.b(0, 1, bufferOverflow, 1);
        this.f291543r = f2.b(0, 1, bufferOverflow, 1);
        this.f291544s = f2.b(0, 1, bufferOverflow, 1);
    }

    @Override // com.avito.android.component.toast.util.g
    public final void a(@k PrintableText printableText, int i12, @l String str, @l Y41.a aVar, @k ToastBarPosition toastBarPosition, @k com.avito.android.component.toast.f fVar) {
        PrintableText printableTextC = i12 != 0 ? com.avito.android.printable_text.b.c(i12, new Serializable[0]) : printableText;
        List listSingletonList = (str == null || aVar == null) ? C42784z0.f406748b : Collections.singletonList(new c.a.C3719a(str, true, null, new i(aVar), 4, null));
        View view = this.f291529d;
        if (view != null) {
            com.avito.android.component.toast.c.e(com.avito.android.component.toast.c.f125244a, view, printableTextC, null, listSingletonList, null, fVar, 2750, toastBarPosition, false, false, null, null, this.f291528c, 3978);
        }
    }

    public final void b() {
        if (this.f291538m == null) {
            return;
        }
        ImageView imageView = this.f291530e;
        if (imageView != null) {
            D6.G(imageView, !this.f291540o);
        }
        ProgressBar progressBar = this.f291532g;
        if (progressBar != null) {
            D6.G(progressBar, this.f291540o);
        }
        View view = this.f291533h;
        if (view != null) {
            view.setEnabled((this.f291540o || this.f291541p) ? false : true);
        }
        View view2 = this.f291537l;
        if (view2 != null) {
            view2.setEnabled((this.f291540o || this.f291541p) ? false : true);
        }
        if (this.f291539n.f291481a == SubscriptionSettingsState.NotificationState.f291488b) {
            ImageView imageView2 = this.f291530e;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.ic_text_notification_off);
            }
            TextView textView = this.f291531f;
            if (textView != null) {
                textView.setText(R.string.subscription_settings_disable_notification);
            }
        }
        if (this.f291539n.f291481a == SubscriptionSettingsState.NotificationState.f291489c) {
            ImageView imageView3 = this.f291530e;
            if (imageView3 != null) {
                imageView3.setImageResource(R.drawable.ic_text_notification);
            }
            TextView textView2 = this.f291531f;
            if (textView2 != null) {
                textView2.setText(R.string.subscription_settings_enable_notification);
            }
        }
    }

    public final void c() {
        if (this.f291538m == null) {
            return;
        }
        D6.G(this.f291534i, !this.f291541p);
        D6.G(this.f291536k, this.f291541p);
        View view = this.f291533h;
        if (view != null) {
            view.setEnabled((this.f291540o || this.f291541p) ? false : true);
        }
        View view2 = this.f291537l;
        if (view2 != null) {
            view2.setEnabled((this.f291540o || this.f291541p) ? false : true);
        }
        SubscriptionSettingsState subscriptionSettingsState = this.f291539n;
        if (subscriptionSettingsState.f291483c == SubscriptionSettingsState.EnabledState.f291485c || subscriptionSettingsState.f291482b == SubscriptionSettingsState.SubscriptionState.f291493c) {
            View view3 = this.f291533h;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        } else {
            View view4 = this.f291533h;
            if (view4 != null) {
                view4.setVisibility(0);
            }
        }
        if (this.f291539n.f291482b == SubscriptionSettingsState.SubscriptionState.f291492b) {
            ImageView imageView = this.f291534i;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_text_unsubscribe);
            }
            TextView textView = this.f291535j;
            if (textView != null) {
                textView.setText(R.string.subscription_settings_unsubscribe);
            }
        }
        if (this.f291539n.f291482b == SubscriptionSettingsState.SubscriptionState.f291493c) {
            ImageView imageView2 = this.f291534i;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.ic_text_subscribe);
            }
            TextView textView2 = this.f291535j;
            if (textView2 != null) {
                textView2.setText(R.string.subscription_settings_subscribe);
            }
        }
    }

    @Override // com.avito.android.component.toast.util.f
    public final boolean h() {
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f291538m;
        if (dVar != null) {
            return dVar.isShowing();
        }
        return false;
    }
}
